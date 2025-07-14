import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestPrimeDivisorTest {

  private String runLargestPrimeDivisor(String input) {
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    System.setIn(in);
    System.setOut(new PrintStream(out));

    // Gọi hàm main
    LargestPrimeDivisor.main(new String[]{});

    return out.toString().trim();
  }

  @Test
  public void testSmallNumbers() {
    String input = "2\n6\n100\n0\n";
    String expectedOutput = "-1\n3\n5";
    assertEquals(expectedOutput, runLargestPrimeDivisor(input));
  }

  @Test
  public void testPrimeNumber() {
    String input = "17\n0\n";
    String expectedOutput = "-1";
    assertEquals(expectedOutput, runLargestPrimeDivisor(input));
  }

  @Test
  public void testLargeNumber() {
    String input = "13195\n0\n";
    String expectedOutput = "29"; // Ước số nguyên tố lớn nhất của 13195 là 29
    assertEquals(expectedOutput, runLargestPrimeDivisor(input));
  }

  @Test
  public void testNegativeNumbers() {
    String input = "-100\n0\n";
    String expectedOutput = "5";
    assertEquals(expectedOutput, runLargestPrimeDivisor(input));
  }
}

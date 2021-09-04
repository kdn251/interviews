import org.junit.Assert;
import org.junit.Test;

public class ReverseVowelsOfAStringTest {
    @Test
    public void test1(){
        ReverseVowelsOfAString string = new ReverseVowelsOfAString();
        Assert.assertEquals("",string.reverseVowels(""));
        Assert.assertEquals("finux",string.reverseVowels("funix"));
        Assert.assertEquals("finUx",string.reverseVowels("fUnix"));
        Assert.assertEquals("fenox welcimu",string.reverseVowels("funix welcome"));
    }
}

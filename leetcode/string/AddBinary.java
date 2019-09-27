/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author HuyDuc
 */
public class lab_5Test {
 
  @Test
  public void test1(){
      AddBinary ad = new AddBinary();
      String input1= "0001";
      String input2="0001";
      String expected = "0010";
      assertEquals(expected, ad.addBinary(input2, input2) );
    
    
  }
  @Test
  public void test2(){
      AddBinary ad = new AddBinary();
      String input1= "1234";
      String input2="0001";
      String expected = "Error";
      assertEquals(expected, ad.addBinary(input2, input2) );
  }
  @Test
  public void test3(){
      AddBinary ad = new AddBinary();
      String input1= "a001";
      String input2="0001";
      String expected = "Error";
      assertEquals(expected, ad.addBinary(input2, input2) );
    
    
  }
  @Test
  public void test4(){
      AddBinary ad = new AddBinary();
      String input1= "abcd";
      String input2="abcd";
      boolean c= false;
      String expected = "Error";
      assertEquals(expected, ad.addBinary(input2, input2) );
    
    
  }
    
  
}

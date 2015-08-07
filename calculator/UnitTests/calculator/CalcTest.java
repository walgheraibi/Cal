package calculator;

import static org.junit.Assert.*;

import org.junit.Test;


public class CalcTest {

	@Test
	 public void test_division() {
	      System.out.println("Test if 120/10 returns 12...") ;
	      Calc calc = new Calc() ;
	      assertEquals(12,calc.division(120,10),00);
	   }
	
	@Test
	 public void test_multiplication() {
	      System.out.println("Test if 120/10 returns 12...") ;
	      Calc calc = new Calc() ;
	      assertEquals(99,calc.multiplication(33,3),00);
	   }
	
	@Test
	 public void test_mod() {
	      System.out.println("Test if 120/10 returns 12...") ;
	      Calc calc = new Calc() ;
	      assertEquals(1,calc.modulus(100,3),00);
	   }


}

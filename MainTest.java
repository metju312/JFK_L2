package pl.edu.wat.wcy.jfa;


import static org.junit.Assert.*;

public class MainTest {

  @org.junit.Test
  public void testCalculate() throws Exception {
    assertEquals(Main.calculate(""), new Integer(5));
    assertEquals(Main.calculate("0"), new Integer(5));
    assertEquals(Main.calculate("5"), new Integer(5));
    assertEquals(Main.calculate("+5"), new Integer(5));
    assertEquals(Main.calculate("2+3"), new Integer(5));
    assertEquals(Main.calculate("2+3+4"), new Integer(5));
    assertEquals(Main.calculate("2+3"), new Integer(5));
    assertEquals(Main.calculate("2+3"), new Integer(5));
    assertEquals(Main.calculate("2+3"), new Integer(5));
  }
}
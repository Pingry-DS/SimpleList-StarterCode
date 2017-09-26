/***************************************************/
/* To run this with a default runner try:          */
/* java org.junit.runner.JUnitCore SimpleListTests */
/*                                                 */
/* Or for fancier runner option consider:          */
/* import org.junit.FixMethodOrder;                */
/* import org.junit.runners.MethodSorters;         */
/* @FixMethodOrder(MethodSorters.NAME_ASCENDING)   */
/* (Talk to Jack for details about custom runners) */
/***************************************************/

// static import gives us access to assert methods without class name
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import java.lang.IndexOutOfBoundsException;


public class ListTest {

  /**************************************************/
  /* Setup some testing objects that will streamline*/
  /* test writing. @Before methods run before every */
  /* single test.                                   */
  /**************************************************/

  private SimpleList<String> e;
  private SimpleList<String> f;

  @Before
  public void setUp(){
    e = new MyList<String>();
    f = new MyList<String>();
    f.add("hello");
    f.add("world");
  }

  /**************************************************/
  /* Testing new List is created to specification   */
  /**************************************************/
  @Test
  public void testCreate() {
    assertEquals(0, e.size());
  }

  /**********************************/
  /* Testing valid and invalid adds */
  /**********************************/
  @Test(expected = IndexOutOfBoundsException.class)
  public void testAddNegative() {
    e.add(-1, "Hello");
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testAddAfterEnd() {
    e.add(2, "Hello");
  }

  @Test
  public void testAddAtEnd1() {
    e.add(0, "Hello");
    assertEquals(e.get(0), "Hello");
  }

  @Test
  public void testAddAtEnd2() {
    e.add("Hello");
    assertEquals(e.get(0), "Hello");
  }

  /**********************************/
  /* Testing valid and invalid gets */
  /**********************************/
  @Test(expected = IndexOutOfBoundsException.class)
  public void testGetFromEmpty() {
    e.get(0);
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testGetNegative() {
    f.get(-1);
  }

  @Test
  public void testGetValid() {
    String val = f.get(0);
    assertEquals("hello", val);
  }

  /*****************************************/
  /* Testing a valid and an invalid remove */
  /*****************************************/
  /*
  @Test
  public void d_testRemove0() {
    Logger.addSectionBreak();
    Logger.addTest("vector-remove-0");
    Logger.expectException();

    Vector<Integer> v = new Vector<Integer>();
    v.add(1234);

    try {
      boolean b = v.remove(new Integer(1234));
      assertTrue(b);
      Logger.pass();
    } catch (AssertionError e) {
      Logger.wrongValue();
      throw e;
    }
  }

  @Test
  public void d_testRemove1() {
    Logger.addSectionBreak();
    Logger.addTest("vector-remove-1");
    Logger.expectException();

    Vector<Integer> v = new Vector<Integer>();
    v.add(1234);

    try {
      boolean b = v.remove(new Integer(0));
      assertFalse(b);
      Logger.pass();
    } catch (AssertionError e) {
      Logger.wrongValue();
      throw e;
    }
  }
*/
  /***********************************/
  /* Testing a valid and invalid set */
  /***********************************/
  /*
  @Test
  public void e_testSet0() {
    Logger.addSectionBreak();
    Logger.addTest("vector-set-0");
    Logger.expectException();

    Vector<Integer> v = new Vector<Integer>();
    v.add(1234);

    try {
      Integer i = v.set(0, 10);
      assertNotNull(i);
      Logger.pass();
    } catch (AssertionError e) {
      Logger.wrongValue();
      throw e;
    }
  }
*/
  //TODO Write a test for an invalid set

  /***********************************/
  /* Testing isEmpty                 */
  /***********************************/

  //TODO write these tests.
}

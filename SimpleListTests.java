// To run this with a default runner try:
// java org.junit.runner.JUnitCore SimpleListTests

// static import gives us access to assert methods without class name
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class SimpleListTests {

  private SimpleList<String> e;
  private SimpleList<String> f;

  // This method is called before EVERY test to set up the testing environment.
  @Before
  public void setUp(){
    e = new MyList<String>();
    f = new MyList<String>();
    f.add("hello");
    f.add("world");
  }

  // Test that isEmpty works

  // Test that emptiness is reported correctly
  @Test
  public void empty(){
    assertTrue(e.isEmpty());
  }

  // Test that emptiness is reported correctly for non-empty SimpleList
  @Test
  public void notEmpty(){
    assertFalse(f.isEmpty());
  }

  // Test that size is reported correctpy
}

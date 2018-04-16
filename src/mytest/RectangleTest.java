package mytest;
import localmath.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleTest {
	
	Rectangle rec = new Rectangle(5,6);

  @Test
  public void testGetArea() {
    assertEquals(rec.getArea(), 30);
  }

  @Test
  public void testGetPerimeter() {
    assertEquals(rec.getPerimeter(), 22);
  }


  @Test
  public void testLength() {
    assertEquals(rec.lenght, 5);
  }

  @Test
  public void testWidth() {
    assertEquals(rec.width, 6);
  }


}

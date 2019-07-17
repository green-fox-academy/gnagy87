import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppleTest {
  Apple apple;


  @BeforeEach
    public void setup(){
    apple = new Apple();
  }

  @Test
  public void shouldCheckString(){
    String expected = "apple";
    String actual = apple.getApple("apple");
    assertEquals(expected,actual);
  }
}

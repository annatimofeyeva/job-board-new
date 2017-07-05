import org.junit.*;
import static org.junit.Assert.*;

public class JobOpeningTest {

  @Test
  public void JobOpening_instantiatesCorrectly_true() {
    JobOpening testJobOpening = new JobOpening("Software Developer", "Write Java programs", "Anna and Lynn");
    assertEquals(true, testJobOpening instanceof JobOpening);
  }

  @Test
  public void JobOpening_instantiatesWithTitle_String() {
    JobOpening testJobOpening = new JobOpening("Software Developer", "Write Java programs", "Anna and Lynn");
    assertEquals("Software Developer", testJobOpening.getTitle());
  }

  @Test
  public void JobOpening_instantiatesWithDescription_String() {
    JobOpening testJobOpening = new JobOpening("Software Developer", "Write Java programs", "Anna and Lynn");
    assertEquals("Write Java programs", testJobOpening.getDescription());
  }

  @Test
  public void JobOpening_instantiatesWithContact_String() {
    JobOpening testJobOpening = new JobOpening("Software Developer", "Write Java programs", "Anna and Lynn");
    assertEquals("Anna and Lynn", testJobOpening.getContact());
  }

}

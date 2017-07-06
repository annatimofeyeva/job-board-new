import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

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

  @Test
  public void isCompleted_isFalseAfterInstantiation_false() {
    JobOpening testJobOpening = new JobOpening("Software Developer", "Write Java programs", "Anna and Lynn");
    assertEquals(false, testJobOpening.isCompleted());
  }

  @Test
  public void getCreatedAt_instantiatesWithCurrentTime_today() {
    JobOpening testJobOpening = new JobOpening("Software Developer", "Write Java programs", "Anna and Lynn");
    assertEquals(LocalDateTime.now().getDayOfWeek(), testJobOpening.getCreatedAt().getDayOfWeek());
  }

  @Test
  public void all_returnsAllInstancesOfJobOpening_true() {
    JobOpening firstJobOpening = new JobOpening("Software Developer", "Write Java programs", "Anna and Lynn");
    JobOpening secondJobOpening = new JobOpening("QA Engineer", "Test Java programs", "John Smith");
    assertEquals(true, JobOpening.all().contains(firstJobOpening));
    assertEquals(true, JobOpening.all().contains(secondJobOpening));
  }

  @Test
  public void clear_emptiesAllJobOpeningFromArrayList_0() {
    JobOpening testJobOpening = new JobOpening("Software Developer", "Write Java programs", "Anna and Lynn");
    JobOpening.clear();
    assertEquals(0, JobOpening.all().size());
  }

  @Test
  public void getId_jobsInstantiateWithAnID_1() {
    JobOpening.clear();
    JobOpening testJobOpening = new JobOpening("Software Developer", "Write Java programs", "Anna and Lynn");
    assertEquals(1, testJobOpening.getId());
  }

  @Test
  public void find_returnsJobWithSameId_secondJob() {
    JobOpening firstJobOpening = new JobOpening("Software Developer", "Write Java programs", "Anna and Lynn");
    JobOpening secondJobOpening = new JobOpening("QA Engineer", "Test Java programs", "John Smith");
    assertEquals(JobOpening.find(secondJobOpening.getId()), secondJobOpening);
  }

}

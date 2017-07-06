import org.junit.*;
import static org.junit.Assert.*;

public class CityTest {

  @Before
  public void tearDown() {
    City.clear();
  }

  @Test
  public void city_instantiatesCorrectly_true() {
    City testCity = new City("Seattle");
    assertEquals(true, testCity instanceof City);
  }

  @Test
  public void getName_cityInstantiatesWithName_Seattle() {
    City testCity = new City("Seattle");
    assertEquals("Seattle", testCity.getName());
  }

  @Test
  public void all_returnsAllInstancesOfCity_true() {
    City firstCity = new City("Seattle");
    City secondCity = new City("Portland");
    assertEquals(true, City.all().contains(firstCity));
    assertEquals(true, City.all().contains(secondCity));
  }

  @Test
  public void clear_emptiesAllCitiesFromList_0() {
    City testCity = new City("Seattle");
    City.clear();
    assertEquals(0, City.all().size());
  }

  @Test
  public void getId_citiesInstantiateWithAnId_1() {
    City testCity = new City("Seattle");
    assertEquals(1, testCity.getId());
  }

  @Test
  public void find_returnsCityWithSameId_secondCity() {
    //City.clear();
    City firstCity = new City("Seattle");
    City secondCity = new City("Portland");
    assertEquals(City.find(secondCity.getId()), secondCity);
  }

  @Test
  public void getJobs_initiallyReturnsEmptyList_ArrayList() {
    //City.clear();
    City testCity = new City("Seattle");
    assertEquals(0, testCity.getJobs().size());
  }

  @Test
  public void addJobOpening_addsJobOpeningToList_true() {
    City testCity = new City("Seattle");
    JobOpening testJobOpening = new JobOpening("Software Developer", "Write Java programs", "Anna and Lynn");
    testCity.addJobOpening(testJobOpening);
    assertTrue(testCity.getJobs().contains(testJobOpening));
  }

  @Test
  public void find_returnsNullWhenNoJobOpeningFound_null() {
    assertTrue(City.find(999) == null);
  }
}

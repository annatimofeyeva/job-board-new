import java.util.List;
import java.util.ArrayList;

public class City {
  private String mName;
  private static List<City> instances = new ArrayList<City>();
  private int mId;
  //This is an ArrayList that will eventually hold JobOpening objects belong to each instance of City.
  private List<JobOpening> mJobOpenings;

  public City(String name) {
    mName = name;
    instances.add(this);
    mId = instances.size();
    //Initialize an empty List<JobOpening> in the City constructor, since every single City must contain an attribute to hold corresponding JobOpenings.
    mJobOpenings = new ArrayList<JobOpening>();
  }

  public String getName() {
    return mName;
  }

  public static List<City> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static City find(int id) {
    return instances.get(id - 1);
  }

  //Returns a City's list of JobOpenings.
  public List<JobOpening> getJobs() {
    return mJobOpenings;
  }

//This method will be called upon an individual City object, and a JobOpening object will be passed in as an argument. The method will then add that JobOpening to the City's mJobOpenings property. Once this method runs, the two objects should be successfully associated
  public void addJobOpening(JobOpening jobOpening) {
    mJobOpenings.add(jobOpening);
  }

}

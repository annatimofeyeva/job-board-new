import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class JobOpening {
  private String mTitle;
  private String mDescription;
  private String mContact;
  private boolean mCompleted;
  private LocalDateTime mCreatedAt;
  //Create a private static variable ArrayList named instances. This will eventually contain every JobOpening object we create.
  private static List<JobOpening> instances = new ArrayList<JobOpening>();
  private int mId;

  public JobOpening(String title, String description, String contact) {
    mTitle = title;
    mDescription = description;
    mContact = contact;
    mCompleted = false;
    mCreatedAt = LocalDateTime.now();
    instances.add(this);
    mId = instances.size();
  }

  public String getTitle() {
    return mTitle;
  }

  public String getDescription() {
    return mDescription;
  }

  public String getContact() {
    return mContact;
  }

  public boolean isCompleted() {
    return mCompleted;
  }

  public LocalDateTime getCreatedAt() {
    return mCreatedAt;
  }

  public static List<JobOpening> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }

  public static JobOpening find(int id) {
    return instances.get(id - 1);
  }
}

public class JobOpening {
  private String mTitle;
  private String mDescription;
  private String mContact;
  private String mCity;

  public JobOpening(String title, String description, String contact, String city) {
    mTitle = title;
    mDescription = description;
    mContact = contact;
    mCity = city;
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
}

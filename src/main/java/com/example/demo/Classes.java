
public class classes{
    private String id;
    private bolean available;
    private String department;
    private String title;
    private String description;
    private String instructorName;
    private int credits;

    public class(){}
    public class(String id, boolean avail, String deptId, String title, String description, String instructorName, int credits ){
        this.id = id;
        this.available = avail;
        this.department = deptId;
        this.title = title;
        this.description = description;
        this.instructorName = instructorName;
        this.credits = credits;
        }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public bolean getAvailable() {
        return available;
    }

    public void setAvailable(bolean available) {
        this.available = available;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
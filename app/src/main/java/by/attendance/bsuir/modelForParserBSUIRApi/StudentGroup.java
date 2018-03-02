package by.attendance.bsuir.modelForParserBSUIRApi;

/**
 * Created by Dell on 30.01.2018.
 */

public class StudentGroup {

    private String name;
    private int facultyId;
    private String facultyName;
    private String specialityDepartmentEducationFormId;
    private String specialityName;
    private int course;
    private int id;
    private String calendarId;

    public StudentGroup(String name, int facultyId, String facultyName, String specialityDepartmentEducationFormId, String specialityName, int course, int id, String calendarId) {
        this.name = name;
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.specialityDepartmentEducationFormId = specialityDepartmentEducationFormId;
        this.specialityName = specialityName;
        this.course = course;
        this.id = id;
        this.calendarId = calendarId;
    }

    public StudentGroup() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getSpecialityDepartmentEducationFormId() {
        return specialityDepartmentEducationFormId;
    }

    public void setSpecialityDepartmentEducationFormId(String specialityDepartmentEducationFormId) {
        this.specialityDepartmentEducationFormId = specialityDepartmentEducationFormId;
    }

    public String getSpecialityName() {
        return specialityName;
    }

    public void setSpecialityName(String specialityName) {
        this.specialityName = specialityName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StudentGroup{");
        sb.append("name='").append(name).append('\'');
        sb.append(", facultyId=").append(facultyId);
        sb.append(", facultyName='").append(facultyName).append('\'');
        sb.append(", specialityDepartmentEducationFormId='").append(specialityDepartmentEducationFormId).append('\'');
        sb.append(", specialityName='").append(specialityName).append('\'');
        sb.append(", course=").append(course);
        sb.append(", id=").append(id);
        sb.append(", calendarId='").append(calendarId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

package by.attendance.bsuir.modelForParserBSUIRApi;

public class GroupBsuir {

    private String name;
    private String facultyId;
    private String facultyName;
    private String specialityDepartmentEducationFormId;
    private String specialityName;
    private String course;
    private String id;
    private String calendarId;

    public GroupBsuir(String name, String facultyId, String facultyName, String specialityDepartmentEducationFormId, String specialityName, String course, String id, String calendarId) {
        this.name = name;
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.specialityDepartmentEducationFormId = specialityDepartmentEducationFormId;
        this.specialityName = specialityName;
        this.course = course;
        this.id = id;
        this.calendarId = calendarId;
    }

    public GroupBsuir() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        final StringBuilder sb = new StringBuilder("GroupBsuir{");
        sb.append("name='").append(name).append('\'');
        sb.append(", facultyId='").append(facultyId).append('\'');
        sb.append(", facultyName='").append(facultyName).append('\'');
        sb.append(", specialityDepartmentEducationFormId='").append(specialityDepartmentEducationFormId).append('\'');
        sb.append(", specialityName='").append(specialityName).append('\'');
        sb.append(", course='").append(course).append('\'');
        sb.append(", id='").append(id).append('\'');
        sb.append(", calendarId='").append(calendarId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

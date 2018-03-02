package by.attendance.bsuir.modelForParserBSUIRApi;

import java.util.List;


class Employee {

    private String firstName;
    private String lastName;
    private String middleName;
    private String rank;
    private String photoLink;
    private String calendarId;
    private List<String> academicDepartment;
    private String id;
    private String fio;

    public Employee(String firstName, String lastName, String middleName, String rank, String photoLink, String calendarId, List<String> academicDepartment, String id, String fio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.rank = rank;
        this.photoLink = photoLink;
        this.calendarId = calendarId;
        this.academicDepartment = academicDepartment;
        this.id = id;
        this.fio = fio;
    }

    public Employee() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public List<String> getAcademicDepartment() {
        return academicDepartment;
    }

    public void setAcademicDepartment(List<String> academicDepartment) {
        this.academicDepartment = academicDepartment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", middleName='").append(middleName).append('\'');
        sb.append(", rank='").append(rank).append('\'');
        sb.append(", photoLink='").append(photoLink).append('\'');
        sb.append(", calendarId='").append(calendarId).append('\'');
        sb.append(", academicDepartment=").append(academicDepartment.toString());
        sb.append(", id='").append(id).append('\'');
        sb.append(", fio='").append(fio).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

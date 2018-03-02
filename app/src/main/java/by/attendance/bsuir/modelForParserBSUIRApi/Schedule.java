package by.attendance.bsuir.modelForParserBSUIRApi;

import java.util.List;

// класс с полями для одной пары
public class Schedule{
    private List<Integer> weekNumber;
    private List<String> studentGroup;
    private List<String> studentGroupInformation;
    private String numSubgroup;
    private List<String> auditory;
    private String startLessonTime;
    private String endLessonTime;
    private String subject;
    private String note;
    private List<Employee> employee;
    private String lessonType;
    private String studentGroupModelList;
    private boolean zaoch;

    public Schedule() {
    }

    public Schedule(List<Integer> weekNumber, List<String> studentGroup, List<String> studentGroupInformation, String numSubgroup, List<String> auditory, String startLessonTime, String endLessonTime, String subject, String note, List<Employee> employee, String lessonType, String studentGroupModelList, boolean zaoch) {
        this.weekNumber = weekNumber;
        this.studentGroup = studentGroup;
        this.studentGroupInformation = studentGroupInformation;
        this.numSubgroup = numSubgroup;
        this.auditory = auditory;
        this.startLessonTime = startLessonTime;
        this.endLessonTime = endLessonTime;
        this.subject = subject;
        this.note = note;
        this.employee = employee;
        this.lessonType = lessonType;
        this.studentGroupModelList = studentGroupModelList;
        this.zaoch = zaoch;
    }

    public List<Integer> getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(List<Integer> weekNumber) {
        this.weekNumber = weekNumber;
    }

    public List<String> getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(List<String> studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<String> getStudentGroupInformation() {
        return studentGroupInformation;
    }

    public void setStudentGroupInformation(List<String> studentGroupInformation) {
        this.studentGroupInformation = studentGroupInformation;
    }

    public String getNumSubgroup() {
        return numSubgroup;
    }

    public void setNumSubgroup(String numSubgroup) {
        this.numSubgroup = numSubgroup;
    }

    public List<String> getAuditory() {
        return auditory;
    }

    public void setAuditory(List<String> auditory) {
        this.auditory = auditory;
    }

    public String getStartLessonTime() {
        return startLessonTime;
    }

    public void setStartLessonTime(String startLessonTime) {
        this.startLessonTime = startLessonTime;
    }

    public String getEndLessonTime() {
        return endLessonTime;
    }

    public void setEndLessonTime(String endLessonTime) {
        this.endLessonTime = endLessonTime;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public String getLessonType() {
        return lessonType;
    }

    public void setLessonType(String lessonType) {
        this.lessonType = lessonType;
    }

    public String getStudentGroupModelList() {
        return studentGroupModelList;
    }

    public void setStudentGroupModelList(String studentGroupModelList) {
        this.studentGroupModelList = studentGroupModelList;
    }

    public boolean isZaoch() {
        return zaoch;
    }

    public void setZaoch(boolean zaoch) {
        this.zaoch = zaoch;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schedule{");
        sb.append("weekNumber=").append(weekNumber.toString());
        sb.append(", studentGroup=").append(studentGroup.toString());
        sb.append(", studentGroupInformation=").append(studentGroupInformation.toString());
        sb.append(", numSubgroup='").append(numSubgroup).append('\'');
        sb.append(", auditory=").append(auditory.toString());
        sb.append(", startLessonTime='").append(startLessonTime).append('\'');
        sb.append(", endLessonTime='").append(endLessonTime).append('\'');
        sb.append(", subject='").append(subject).append('\'');
        sb.append(", note='").append(note).append('\'');
        sb.append(", employee=").append(employee.toString());
        sb.append(", lessonType='").append(lessonType).append('\'');
        sb.append(", studentGroupModelList='").append(studentGroupModelList).append('\'');
        sb.append(", zaoch=").append(zaoch);
        sb.append('}');
        return sb.toString();
    }
}

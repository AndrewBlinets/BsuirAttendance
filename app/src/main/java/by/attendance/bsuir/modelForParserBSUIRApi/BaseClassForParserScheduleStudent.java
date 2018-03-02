package by.attendance.bsuir.modelForParserBSUIRApi;

import java.util.List;

/**
 * Created by Dell on 30.01.2018.
 */

public class BaseClassForParserScheduleStudent {

    private String employee;
    private StudentGroup studentGroup;
    private List<DayClass> schedules;
    private List<DayClass> examSchedules;

    public BaseClassForParserScheduleStudent(String employee, StudentGroup studentGroup, List<DayClass> schedules, List<DayClass> examSchedules) {
        this.employee = employee;
        this.studentGroup = studentGroup;
        this.schedules = schedules;
        this.examSchedules = examSchedules;
    }

    public BaseClassForParserScheduleStudent() {
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<DayClass> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<DayClass> schedules) {
        this.schedules = schedules;
    }

    public List<DayClass> getExamSchedules() {
        return examSchedules;
    }

    public void setExamSchedules(List<DayClass> examSchedules) {
        this.examSchedules = examSchedules;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseClassForParserScheduleStudent{");
        sb.append("employee='").append(employee).append('\'');
        sb.append(", studentGroup=").append(studentGroup.toString());
        sb.append(", schedules=").append(schedules.toString());
        sb.append(", examSchedules=").append(examSchedules.toString());
        sb.append('}');
        return sb.toString();
    }
}

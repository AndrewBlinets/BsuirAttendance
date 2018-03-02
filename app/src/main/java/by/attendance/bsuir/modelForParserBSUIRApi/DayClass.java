package by.attendance.bsuir.modelForParserBSUIRApi;

import java.util.List;

public class DayClass {
    private String weekDay;
    private List<Schedule> schedule;

    public DayClass(String weekDay, List<Schedule> schedule) {
        this.weekDay = weekDay;
        this.schedule = schedule;
    }

    public DayClass() {
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public List<Schedule> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Schedule> schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DayClass{");
        sb.append("weekDay='").append(weekDay).append('\'');
        sb.append(", schedule=").append(schedule.toString());
        sb.append('}');
        return sb.toString();
    }
}

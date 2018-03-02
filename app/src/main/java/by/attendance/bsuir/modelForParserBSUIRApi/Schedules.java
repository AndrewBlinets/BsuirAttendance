package by.attendance.bsuir.modelForParserBSUIRApi;

import java.util.List;

public class Schedules {
    private List<DayClass> schedules;

    public Schedules(List<DayClass> schedules) {
        this.schedules = schedules;
    }

    public Schedules() {
    }

    public List<DayClass> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<DayClass> schedules) {
        this.schedules = schedules;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schedules{");
        sb.append("schedules=").append(schedules.toString());
        sb.append('}');
        return sb.toString();
    }
}

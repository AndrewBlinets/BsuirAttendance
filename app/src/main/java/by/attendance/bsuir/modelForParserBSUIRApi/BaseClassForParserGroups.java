package by.attendance.bsuir.modelForParserBSUIRApi;

import java.util.List;


public class BaseClassForParserGroups {
    private List<GroupBsuir> groups;

    public BaseClassForParserGroups(List<GroupBsuir> groups) {
        this.groups = groups;
    }

    public BaseClassForParserGroups() {
    }

    public List<GroupBsuir> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupBsuir> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseClassForParserGroups{");
        sb.append("groups=").append(groups.toString());
        sb.append('}');
        return sb.toString();
    }
}

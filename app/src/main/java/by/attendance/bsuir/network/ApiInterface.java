package by.attendance.bsuir.network;

import java.util.List;

import by.attendance.bsuir.modelForParserBSUIRApi.BaseClassForParserScheduleStudent;
import by.attendance.bsuir.modelForParserBSUIRApi.GroupBsuir;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("studentGroup/schedule")
    Call<BaseClassForParserScheduleStudent> getSchedules(@Query("studentGroup") String group);

    @GET("groups")
    Call<List<GroupBsuir>> getListGroup();
}

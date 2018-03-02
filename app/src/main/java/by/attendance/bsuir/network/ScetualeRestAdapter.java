package by.attendance.bsuir.network;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ScetualeRestAdapter {
    private Retrofit retrofit;
    private static ApiInterface apiInterface;
    private static String host;

    public ScetualeRestAdapter() {
        host = new NetWorkConstance().getHOST();
        retrofit = new Retrofit.Builder()
                .baseUrl(host)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apiInterface = retrofit.create(ApiInterface.class);
    }

    private static Retrofit getRetrofitInstance()
    {
        host = new NetWorkConstance().getHOST();
        return new Retrofit.Builder().baseUrl(host)
                .addConverterFactory(GsonConverterFactory.create( )).build();
    }

    public static ApiInterface getApi() {
        return  getRetrofitInstance().create(ApiInterface.class);
    }
}

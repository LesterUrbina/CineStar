package idat.edu.cinestar;

import android.content.Context;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private Context context;
    private Retrofit retrofit;
    public ApiClient(Context context) {
        this.context =context;
        retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://localhost:8080/")
                .build();
    }

    private Retrofit getRetrofit()
    {

//        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
//        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//
//        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();
        return retrofit;
    }


    public UserService getUserService()
    {
        UserService userService = getRetrofit().create(UserService.class);
        return userService;
    }

}

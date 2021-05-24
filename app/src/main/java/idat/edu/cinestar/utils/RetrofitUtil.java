package idat.edu.cinestar.utils;

import org.jetbrains.annotations.NotNull;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtil {

    private static Retrofit retrofit = null;
    private static final String BASE_URL = "http://192.168.0.21:8080/";

    static {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static Retrofit getInstance() {
        return retrofit;
    }

    public static <T> T getApiService(Class<T> clase) {
        T created = getInstance().create(clase);
        return created;
    }

}

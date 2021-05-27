package idat.edu.cinestar;

import idat.edu.cinestar.utils.ApiResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface PeliculaService {

    @GET("api/peliculas/findAll")
    Call<ApiResponse> findAll();
}

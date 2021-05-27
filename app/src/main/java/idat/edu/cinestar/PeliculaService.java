package idat.edu.cinestar;

import java.util.List;

import idat.edu.cinestar.responses.PeliculaResponse;
import idat.edu.cinestar.utils.ApiResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface PeliculaService {

    @GET("api/peliculas/findAll")
    Call<ApiResponse<List<PeliculaResponse>>> findAll();
}

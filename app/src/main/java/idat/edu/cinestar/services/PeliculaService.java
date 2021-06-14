package idat.edu.cinestar.services;

import java.util.List;

import idat.edu.cinestar.responses.PeliculaCustomResponse;
import idat.edu.cinestar.responses.PeliculaResponse;
import idat.edu.cinestar.utils.ApiResponse;
import retrofit2.Call;
import retrofit2.http.GET;


public interface PeliculaService {

    @GET("api/peliculas/findAll")
    Call<ApiResponse<List<PeliculaResponse>>> findAll();

    @GET("api/peliculas/findAllCustom")
    Call<ApiResponse<List<PeliculaCustomResponse>>> findAllCustom();
}

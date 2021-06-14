package idat.edu.cinestar.services;


import idat.edu.cinestar.dto.JwtDto;
import idat.edu.cinestar.dto.LoginUsuario;
import idat.edu.cinestar.dto.NuevoUsuario;
import idat.edu.cinestar.utils.ApiResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface UserService {

    @Headers({"Accept: application/json"})
    @POST("auth/login")
   Call<ApiResponse<JwtDto>> userLogin(@Body LoginUsuario loginUsuario);

    @Headers({"Accept: application/json"})
    @POST("auth/nuevo")
    Call<ApiResponse> registro(@Body NuevoUsuario nuevoUsuario);
}

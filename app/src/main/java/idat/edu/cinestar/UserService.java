package idat.edu.cinestar;


import idat.edu.cinestar.dto.LoginUsuario;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserService {

    @POST("auth/login")
   Call<Object> userLogin(@Body LoginUsuario loginUsuario);
}

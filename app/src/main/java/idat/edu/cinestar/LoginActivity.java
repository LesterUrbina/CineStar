package idat.edu.cinestar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.gson.internal.LinkedTreeMap;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import idat.edu.cinestar.dto.JwtDto;
import idat.edu.cinestar.dto.LoginUsuario;
import idat.edu.cinestar.utils.ApiResponse;
import idat.edu.cinestar.utils.RetrofitUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class LoginActivity extends AppCompatActivity {

   // private FirebaseAuth auth;
    private EditText edtUsername;
    private EditText edtPassword;
    private MaterialButton btnLogin;
    private MaterialButton btnSignin;

    private ApiClient apiClient;
    private Retrofit retrofit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = findViewById(R.id.edtUserName);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnSignin = findViewById(R.id.btnSignin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(edtUsername.getText().toString()) || TextUtils.isEmpty(edtPassword.getText().toString()))
                {
                    Toast.makeText(LoginActivity.this,"Username / Password Required", Toast.LENGTH_LONG).show();
                }
                else
                {
                    login();
                }

            }
        });


    /*
        auth = FirebaseAuth.getInstance();

        edtUsername = findViewById(R.id.edtUserName);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnSignin = findViewById(R.id.btnSignin);
        
        Context context = this;
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              String username = edtUsername.getText().toString();
              String password = edtPassword.getText().toString();
              login(username, password);


            }
        });

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, UserActivity.class));
            }
        });
        */
    }


    public void login()
    {
        LoginUsuario loginUsuario = new LoginUsuario();
        loginUsuario.setUsuario(edtUsername.getText().toString());
        loginUsuario.setClave(edtPassword.getText().toString());
        apiClient = new ApiClient();
        retrofit = RetrofitUtil.getInstance();
        Call<ApiResponse> loginUsuarioResponseCall = RetrofitUtil.getApiService(UserService.class).userLogin(loginUsuario);
        loginUsuarioResponseCall.enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                if (response.isSuccessful()) {
                    LinkedTreeMap<String, Object> getMap = (LinkedTreeMap<String, Object>) response.body().getData();
                    JwtDto jwtDto = new JwtDto();
                    jwtDto.setToken((String)getMap.get("token"));
                    jwtDto.setBearer((String)getMap.get("bearer"));
                    jwtDto.setNombreUsuario((String)getMap.get("nombreUsuario"));
                    jwtDto.setAuthorities((List<String>) getMap.get("authorities"));
                    new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                            startActivity(new Intent(LoginActivity.this,HomeActivity.class)
                                    .putExtra("data", jwtDto));

                        }}
                    , 700);
                } else {
                    Toast.makeText(LoginActivity.this, ""+response.code() + response.errorBody(), Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {

                Toast.makeText(LoginActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
//        loginUsuarioResponseCall.enqueue(new Callback<LoginUsuarioResponse>() {
//            @Override
//            public void onResponse(Call<LoginUsuarioResponse> call, Response<LoginUsuarioResponse> response) {
//                System.out.println("DENTRO DE ONRESPONSE");
//                System.out.println(response.body().toString());
//                if(response.isSuccessful())
//                {
//                    Toast toast = Toast.makeText(LoginActivity.this, "Login  Exitoso", Toast.LENGTH_LONG);
//                    toast.show();
//                    LoginUsuarioResponse loginUsuarioResponse = response.body();
//                    System.out.println(loginUsuarioResponse);
////                    new Handler().postDelayed(new Runnable() {
////                        @Override
////                        public void run() {
////                            System.out.println(loginUsuarioResponse);
//////                            startActivity(new Intent(LoginActivity.this,HomeActivity.class)
//////                                    .putExtra("data",loginUsuarioResponse.getUsuario()));
////
////                        }
////                    }, 700);
//                }
//                else
//                {
//                    Toast.makeText(LoginActivity.this, "Login  Error", Toast.LENGTH_LONG).show();
//                }
//            }

//            @Override
//            public void onFailure(Call<LoginUsuarioResponse> call, Throwable t) {
//
//                Toast.makeText(LoginActivity.this, "Throwable"+t.getLocalizedMessage(), Toast.LENGTH_LONG).show();
//            }
//      });


    }


    /*
    private void  login(String username, String password)
    {
        // CREACION DE LA PETICION POST

        // CREACION DTO LOGINUSUARIO (SETEAR VALORES EN DURO)

        // ENVIAR EL DTO DENTRO DE LA PETICION

        // LA PETICION RETORNA ALGO, OBTENERLO Y VERIFICARLO

        // SI LA PETICION ES CORRECTA  RETORNARA EL DTO JWTDTO
        Context context =this;
        auth.signInWithEmailAndPassword(username,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    Intent intent =  new Intent(context, HomeActivity.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(context, task.getException().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
*/
}
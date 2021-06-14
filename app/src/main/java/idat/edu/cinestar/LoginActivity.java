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


import com.google.android.material.button.MaterialButton;


import idat.edu.cinestar.dto.JwtDto;
import idat.edu.cinestar.dto.LoginUsuario;
import idat.edu.cinestar.services.UserService;
import idat.edu.cinestar.utils.ApiResponse;
import idat.edu.cinestar.utils.RetrofitUtil;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {


    private EditText edtUsername;
    private EditText edtPassword;
    private MaterialButton btnLogin;
    private MaterialButton btnSignin;
    private RetrofitUtil retrofitUtil = new RetrofitUtil();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = findViewById(R.id.edtUserName);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnSignin = findViewById(R.id.btnSignin);

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), RegistroActivity.class));
            }
        });
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

    }


    public void login()
    {
        LoginUsuario loginUsuario = new LoginUsuario();
        loginUsuario.setUsuario(edtUsername.getText().toString());
        loginUsuario.setClave(edtPassword.getText().toString());
        Call<ApiResponse<JwtDto>> loginUsuarioResponseCall = RetrofitUtil.getApiService(UserService.class).userLogin(loginUsuario);
        loginUsuarioResponseCall.enqueue(new Callback<ApiResponse<JwtDto>>() {
            @Override
            public void onResponse(Call<ApiResponse<JwtDto>> call, Response<ApiResponse<JwtDto>> response) {
                if (response.isSuccessful()) {
                    JwtDto jwtDto = response.body().getData();

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
            public void onFailure(Call<ApiResponse<JwtDto>> call, Throwable t) {

                Toast.makeText(LoginActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });


    }


}
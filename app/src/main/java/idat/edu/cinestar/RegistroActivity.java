package idat.edu.cinestar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import javax.xml.transform.sax.SAXSource;

import idat.edu.cinestar.dto.NuevoUsuario;
import idat.edu.cinestar.services.UserService;
import idat.edu.cinestar.utils.ApiResponse;
import idat.edu.cinestar.utils.RetrofitUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegistroActivity extends AppCompatActivity {

    private EditText edtNombre;
    private EditText edtUsuario;
    private EditText edtCorreo;
    private EditText edtPassword;
    private MaterialButton btnRegistro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

          edtNombre = findViewById(R.id.edtNombre);
          edtUsuario = findViewById(R.id.edtUsuario);
          edtCorreo = findViewById(R.id.edtCorreo);
          edtPassword = findViewById(R.id.edtPassword);
          btnRegistro = findViewById(R.id.btnRegistro);

         btnRegistro.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                registro();
             }
         });

    }

    public void registro()
    {

        NuevoUsuario nuevoUsuario = new NuevoUsuario();
        nuevoUsuario.setNombre(edtNombre.getText().toString());
        nuevoUsuario.setUsuario(edtUsuario.getText().toString());
        nuevoUsuario.setCorreo(edtCorreo.getText().toString());
        nuevoUsuario.setClave(edtPassword.getText().toString());

        Call<ApiResponse> loginUsuarioResponseCall = RetrofitUtil.getApiService(UserService.class).registro(nuevoUsuario);

        loginUsuarioResponseCall.enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                System.out.println(response.body().getData());
                
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {

            }
        });
    }

}
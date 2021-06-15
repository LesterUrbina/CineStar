package idat.edu.cinestar;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import idat.edu.cinestar.adapter.PromocionAdapter;
import idat.edu.cinestar.entity.Peliculas;
import idat.edu.cinestar.entity.Promocion;
import idat.edu.cinestar.responses.PeliculaCustomResponse;
import idat.edu.cinestar.responses.PeliculaResponse;
import idat.edu.cinestar.services.PeliculaService;
import idat.edu.cinestar.utils.ApiResponse;
import idat.edu.cinestar.utils.RetrofitUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static androidx.core.content.ContextCompat.getSystemService;


public class InicioFragment extends Fragment {

    public InicioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        populatePelicula();
        return inflater.inflate(R.layout.fragment_inicio, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

<<<<<<< HEAD

=======
>>>>>>> 43eaa268ecd634ab6d67cedfb61a929598c95041
        RecyclerView rcvPromocion = view.findViewById(R.id.rcvPromocion);
        rcvPromocion.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Promocion> promocion = new ArrayList<>();
        promocion.add(new Promocion(1,"hola",R.drawable.dc));
        promocion.add(new Promocion(2,"hola2",R.drawable.combo2));
        promocion.add(new Promocion(3,"hola3",R.drawable.combo));
        promocion.add(new Promocion(3,"hola3",R.drawable.combo1));

        PromocionAdapter adapter = new PromocionAdapter(promocion);
        rcvPromocion.setAdapter(adapter);
    }

<<<<<<< HEAD
    private void populatePelicula() {
        retrofit = RetrofitUtil.getInstance();
        Call<ApiResponse<List<PeliculaCustomResponse>>> peliculaCall = RetrofitUtil.getApiService(PeliculaService.class).findAllCustom();
        peliculaCall.enqueue(new Callback<ApiResponse<List<PeliculaCustomResponse>>>() {
            @Override
            public void onResponse(Call<ApiResponse<List<PeliculaCustomResponse>>> call, Response<ApiResponse<List<PeliculaCustomResponse>>> response) {
                System.out.println(response.body().getData());
            }

            @Override
            public void onFailure(Call<ApiResponse<List<PeliculaCustomResponse>>> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
    }
=======

>>>>>>> 43eaa268ecd634ab6d67cedfb61a929598c95041

}
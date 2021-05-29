package idat.edu.cinestar;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import idat.edu.cinestar.adapter.CarteleraAdapter;
import idat.edu.cinestar.entity.Peliculas;
import idat.edu.cinestar.responses.PeliculaResponse;
import idat.edu.cinestar.utils.ApiResponse;
import idat.edu.cinestar.utils.RetrofitUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class CarteleraFragment extends Fragment {

    RecyclerView rcvCartelera;

    public CarteleraFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cartelera, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        populatePelicula();
        rcvCartelera = view.findViewById(R.id.rcvCartelera);
        rcvCartelera.setLayoutManager(new LinearLayoutManager(getContext()));

    }

    private void populatePelicula() {
        Call<ApiResponse<List<PeliculaResponse>>> peliculaCall = RetrofitUtil.getApiService(PeliculaService.class).findAll();
        peliculaCall.enqueue(new Callback<ApiResponse<List<PeliculaResponse>>>() {
            @Override
            public void onResponse(Call<ApiResponse<List<PeliculaResponse>>> call, Response<ApiResponse<List<PeliculaResponse>>> response) {
                CarteleraAdapter adapter = new CarteleraAdapter(response.body().getData());
                rcvCartelera.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<ApiResponse<List<PeliculaResponse>>> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
    }
}
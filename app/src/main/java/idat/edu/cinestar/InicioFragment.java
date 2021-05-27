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
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import idat.edu.cinestar.adapter.PromocionAdapter;
import idat.edu.cinestar.entity.Promocion;
import idat.edu.cinestar.utils.ApiResponse;
import idat.edu.cinestar.utils.RetrofitUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import static androidx.core.content.ContextCompat.getSystemService;


public class InicioFragment extends Fragment {

    Retrofit retrofit;

    public InicioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inicio, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        populatePelicula();
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

    private void populatePelicula() {
        retrofit = RetrofitUtil.getInstance();
        Call<ApiResponse> peliculaCall = RetrofitUtil.getApiService(PeliculaService.class).findAll();
        peliculaCall.enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                System.out.println(response.body().getData());

            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                System.out.println(t.getMessage());
            }
        });
    }

}
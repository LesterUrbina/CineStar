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


public class CarteleraFragment extends Fragment {



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

        RecyclerView rcvCartelera = view.findViewById(R.id.rcvCartelera);
        rcvCartelera.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Peliculas> peliculas = new ArrayList<>();
        peliculas.add(new Peliculas(1,"Regresionr","Es una pelicula basada en..",R.drawable.pelicula1));
        peliculas.add(new Peliculas(2,"Fragmento","Es una seria..",R.drawable.pelicula2));
        peliculas.add(new Peliculas(3,"Lobas","Un asesinato por descubrir..",R.drawable.pelicula3));
        peliculas.add(new Peliculas(4,"Avatar","Un asesinato por descubrir..",R.drawable.pelicula4));


        CarteleraAdapter adapter = new CarteleraAdapter(peliculas);
        rcvCartelera.setAdapter(adapter);
    }
}
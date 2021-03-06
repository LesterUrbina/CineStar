package idat.edu.cinestar.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


import idat.edu.cinestar.R;
import idat.edu.cinestar.entity.Peliculas;

public class CarteleraAdapter extends RecyclerView.Adapter<CarteleraViewHolder> {

    private List<Peliculas> peliculas;

    public CarteleraAdapter(){
        this.peliculas= new ArrayList<>();
    }

    public CarteleraAdapter(List<Peliculas> peliculas) {
        this.peliculas = peliculas;
    }


    @NonNull
    @Override
    public CarteleraViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cartelera,parent,false);

        return new CarteleraViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarteleraViewHolder holder, int position) {

        Peliculas pelicula = peliculas.get(position);
        holder.loadData(pelicula);
    }

    @Override
    public int getItemCount() {
        return peliculas.size();
    }
}

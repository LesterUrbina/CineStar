package idat.edu.cinestar.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import idat.edu.cinestar.R;
import idat.edu.cinestar.entity.Peliculas;

public class CarteleraViewHolder extends RecyclerView.ViewHolder {

    private ImageView imgPelicula;
    private TextView txtPelicula,txtSinopsis;


    public CarteleraViewHolder(@NonNull View itemView) {
        super(itemView);

       /* imgPelicula = itemView.findViewById(R.id.imgPelicula);
        txtPelicula= itemView.findViewById(R.id.txtPelicula);
        txtPelicula= itemView.findViewById(R.id.txtSinopsis);*/
    }

    public void loadData(Peliculas pelicula) {
    /*   imgPelicula.setImageResource(pelicula.getImagenId());
        txtPelicula.setText(pelicula.getNombre());
        txtSinopsis.setText(pelicula.getSinopsis());*/
    }
}

package idat.edu.cinestar.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import idat.edu.cinestar.R;
import idat.edu.cinestar.responses.PeliculaResponse;
import idat.edu.cinestar.utils.ByteUtil;

public class CarteleraViewHolder extends RecyclerView.ViewHolder {

    private ImageView imgPelicula;
    private TextView txtPelicula,txtSinopsis;



    public CarteleraViewHolder(@NonNull View itemView) {
        super(itemView);

<<<<<<< HEAD
       imgPelicula = itemView.findViewById(R.id.imgPelicula);
        txtPelicula= itemView.findViewById(R.id.txtPelicula);
        txtSinopsis= itemView.findViewById(R.id.txtSinopsis);
    }

    public void loadData(Peliculas pelicula) {
      imgPelicula.setImageResource(pelicula.getImagenId());
        txtPelicula.setText(pelicula.getNombre());
        txtSinopsis.setText(pelicula.getSinopsis());
=======
        imgPelicula = itemView.findViewById(R.id.imgPelicula);
        txtPelicula = itemView.findViewById(R.id.txtPelicula);
        txtSinopsis = itemView.findViewById(R.id.txtSinopsis);
    }

    public void loadData(PeliculaResponse pelicula) {
        imgPelicula.setImageBitmap(ByteUtil.byteArrayToBitmap(pelicula.getImagen()));
        txtPelicula.setText(pelicula.getNombre());
        txtSinopsis.setText(pelicula.getSinapsis());
>>>>>>> 43eaa268ecd634ab6d67cedfb61a929598c95041
    }


}

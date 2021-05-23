package idat.edu.cinestar.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import idat.edu.cinestar.R;
import idat.edu.cinestar.entity.Promocion;

public class PromocionViewHolder extends RecyclerView.ViewHolder {

    private TextView txtPromocion ;
    private ImageView imgPromocion;

    public PromocionViewHolder(@NonNull View itemView) {
        super(itemView);

        imgPromocion = itemView.findViewById(R.id.imgPromocion);
        txtPromocion = itemView.findViewById(R.id.txtPromocion);
    }

    public void loadData(Promocion promo) {

        imgPromocion.setImageResource(promo.getImgPromoId());
        txtPromocion.setText(promo.getTexto());

    }
}

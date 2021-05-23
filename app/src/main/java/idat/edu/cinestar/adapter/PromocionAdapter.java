package idat.edu.cinestar.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import idat.edu.cinestar.R;
import idat.edu.cinestar.entity.Promocion;

public class PromocionAdapter extends RecyclerView.Adapter<PromocionViewHolder> {

     private List<Promocion> promocion;

     public PromocionAdapter(){
         this.promocion= new ArrayList<>();
     }

    public PromocionAdapter(List<Promocion> promocion) {
        this.promocion = promocion;
    }

    @NonNull
    @Override
    public PromocionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_promocion,parent,false);
        return new PromocionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PromocionViewHolder holder, int position) {

         Promocion promo = promocion.get(position);
         holder.loadData(promo);
    }

    @Override
    public int getItemCount() {
        return promocion.size();
    }
}

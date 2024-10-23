package com.example.tortugas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TortugaAdapter extends RecyclerView.Adapter<TortugaAdapter.TortugaViewHolder> {
    private List<Tortuga> listaTortugas;

    public TortugaAdapter(List<Tortuga> listaTortugas) {
        this.listaTortugas = listaTortugas;
    }

    @NonNull
    @Override
    public TortugaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_tortuga, parent, false);
        return new TortugaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TortugaViewHolder holder, int position) {
        Tortuga tortuga = listaTortugas.get(position);
        holder.nombre.setText(tortuga.getNombre());
        holder.arma.setText(tortuga.getArma());
        holder.descripcion.setText(tortuga.getDescripcion());
        holder.imagen.setImageResource(tortuga.getImagen());
    }


    @Override
    public int getItemCount() {
        return listaTortugas.size();
    }

    public static class TortugaViewHolder extends RecyclerView.ViewHolder {
        TextView nombre, arma, descripcion;
        ImageView imagen;

        public TortugaViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.nombreTortuga);
            arma = itemView.findViewById(R.id.armaTortuga);
            descripcion = itemView.findViewById(R.id.descripcionTortuga);
            imagen = itemView.findViewById(R.id.imagenTortuga);
        }
    }
}

package com.example.tortugas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tortugas.R;
import com.example.tortugas.Tortuga;

public class DetallesTortuga extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_tortuga);


        Tortuga tortuga = (Tortuga) getIntent().getSerializableExtra("tortuga");

        TextView nombre = findViewById(R.id.nombreTortugaDetalle);
        TextView arma = findViewById(R.id.armaTortugaDetalle);
        TextView descripcion = findViewById(R.id.descripcionTortugaDetalle);
        ImageView imagen = findViewById(R.id.imagenTortugaDetalle);

        if (tortuga != null) {
            nombre.setText(tortuga.getNombre());
            arma.setText(tortuga.getArma());
            descripcion.setText(tortuga.getDescripcion());
            imagen.setImageResource(tortuga.getImagen());
        }

        Button botonVolver = findViewById(R.id.botonVolver);
        botonVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

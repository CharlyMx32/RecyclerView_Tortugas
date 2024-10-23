package com.example.tortugas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Tortuga> listaTortugas = new ArrayList<>();
        listaTortugas.add(new Tortuga("Leonardo", "Espada", "Es azul y tiene disciplina", R.drawable.leonardo));
        listaTortugas.add(new Tortuga("Rafael", "Sai", "Es rojo y es muy fuerte", R.drawable.leonardo));
        listaTortugas.add(new Tortuga("Rafael", "Sai", "Es rojo y es muy fuerte", R.drawable.leonardo));
        listaTortugas.add(new Tortuga("Rafael", "Sai", "Es rojo y es muy fuerte", R.drawable.leonardo));
        // Configura el adaptador con la lista de tortugas
        TortugaAdapter adapter = new TortugaAdapter(listaTortugas);
        recyclerView.setAdapter(adapter);
    }
}

package com.example.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class github_act extends AppCompatActivity {

    private Spinner spin;
    private TextView tx;
    int itemSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);
        spin = (Spinner)findViewById(R.id.spinner);
        tx = (TextView) findViewById(R.id.textView_git);

        String[] lista = {"Farenheith", "Revival", "El Alquimista"};

        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);
        spin.setAdapter(adapt);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, final int i, long l) {
                libros(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        libros(itemSelect);

    }



    private void libros(int itemSelect){
        if (itemSelect == 0){
            tx.setText("El valor de Farenheith es: 5000");
        }else if (itemSelect == 1){
            tx.setText("El valor de Revival es: 12000");
        }else if (itemSelect == 2){
            tx.setText("El valor de El Alquimista es: 45000");
        }else{
            tx.setText("Sin seleccion");
        }
    }

}
package com.meicansoft.ticketshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private EditText edtMeio, edtInteiro;
    private TextView txtResultado;
    private Button btnCalcular;
    private RadioGroup radioGroup;
    private Double extra = 0.0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.shows, android.R.layout.simple_spinner_item);
        spinner = findViewById(R.id.spinner);
        spinner.setAdapter(adapter);

        edtInteiro = findViewById(R.id.edtInteiro);
        edtMeio = findViewById(R.id.edtMeio);
        txtResultado = findViewById(R.id.txt_resultado);
        btnCalcular = findViewById(R.id.btn_calcular);
        radioGroup = findViewById(R.id.radio_group);
    }
}
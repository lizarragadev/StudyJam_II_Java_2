package com.miramicodigo.studyjam_ii_java_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvApellido;
    private TextView tvUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvApellido = (TextView) findViewById(R.id.tvApellido);
        tvUsuario = (TextView) findViewById(R.id.tvUsuario);

        Bundle bundle = getIntent().getExtras();

        String nombre = bundle.getString("nom", "").toString();
        String apellido = bundle.getString("ape", "").toString();
        String usuario = bundle.getString("us", "").toString();

        tvNombre.setText(nombre);
        tvApellido.setText(apellido);
        tvUsuario.setText(usuario);
    }
}

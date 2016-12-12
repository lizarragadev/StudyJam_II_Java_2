package com.miramicodigo.studyjam_ii_java_2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String nombre = "Gustavo";
    private String apellido = "Lizarraga";
    private String usuario = "gus";
    private String password = "12345";

    private EditText etUser;
    private EditText etPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        etUser = (EditText) findViewById(R.id.etUser);
        etPass = (EditText) findViewById(R.id.etPassword);
    }

    public void ingresar(View v) {
        if (etUser.getText().toString().equals(usuario) &&
                etPass.getText().toString().equals(password)) {
            Intent intent = new Intent(getApplicationContext(), DetalleActivity.class);
            intent.putExtra("nom", nombre);
            intent.putExtra("ape", apellido);
            intent.putExtra("us", usuario);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(),
                    "Usuario y contrasenia incorrectos",
                    Toast.LENGTH_SHORT).show();
        }
    }

    public void registrar(View v) {
        startActivity(new Intent(getApplicationContext(), RegistroActivity.class));
    }

    public void irpaginaweb(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.gdg.androidbolivia.com"));
        startActivity(intent);
    }
}

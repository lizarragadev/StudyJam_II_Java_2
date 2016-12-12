package com.miramicodigo.studyjam_ii_java_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RegistroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void registrar(View view) {
        Toast.makeText(getApplicationContext(), "No tiene funcionalidad", Toast.LENGTH_SHORT).show();
    }
}

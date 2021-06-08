package com.example.formulario2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MostrarDatos extends AppCompatActivity {

    TextView tvnombre, tvapellidos, tvedad, tvcorreo;
    Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_datos);

        tvnombre = (textView)findViewById(R.id.tvNombre);
        tvapellidos = (textView)findViewById(R.id.tvApellido);
        tvedad = (textView)findViewById(R.id.tvEdad);
        tvcorreo = (textView)findViewById(R.id.tvCorreo);
        btnOK = (Button)findViewById(R.id.btnOk);

        btnOK.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MostrarDatos.this, MainActivity.class);
                starActivity(intent);
            }
        });

        mostrarDato();
    }

    private void mostrarDato(){
        Bundle datos = this.getIntent().getExtras();
        String nombre = datos.getString("name");
        String apellidos = datos.getString("ape");
        String edad = datos.getString("age");
        String correo = datos.getString("email");

        tvnombre.setText(nombre);
        tvapellidos.setText(apellidos);
        tvedad.setText(edad);
        tvcorreo.setText(correo);

    }
}
package com.example.gustavo.appmedipro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button arnica, calendula, romero, manzanilla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //boton arnica
        arnica=(Button)findViewById( R.id.botonArnica);
        arnica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arnica =new Intent(MainActivity.this, Main3ActivityArnica.class);
                startActivity(arnica);
            }
        });

        //boton calendula
        calendula=(Button)findViewById( R.id.botonCalemdula);
        calendula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calendula =new Intent (MainActivity.this, Main4ActivityCalendula.class);
                startActivity(calendula);
            }
        });


        //boton romero
        romero=(Button)findViewById( R.id.botonRomero);
        romero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent romero =new Intent (MainActivity.this, Main5ActivityRomero.class);
                startActivity(romero);
            }
        });

        //boton manzanilla
        manzanilla=(Button)findViewById( R.id.botonManzanilla);
        manzanilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent manzanilla =new Intent (MainActivity.this, Main6ActivityManzanilla.class);
                startActivity(manzanilla);
            }
        });

    }
}

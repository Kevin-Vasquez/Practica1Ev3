package com.example.practica1ev3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Actividad4 extends AppCompatActivity {
    TextView txtPorcen,txtCantP,txtCantN;
    ImageView imgEstado, btnAvanza5, btnRetorna5;
    Integer positivas, negativas;
    ArrayList<String> ListaA;
    ArrayList<String> ListaN;
    private boolean[] Seleccion1=new boolean[7];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad4);

        txtPorcen = findViewById(R.id.txtPrc);
        txtCantP = findViewById(R.id.txtPos);
        txtCantN = findViewById(R.id.txtNeg);
        imgEstado = findViewById(R.id.imgProcentage);
        btnRetorna5 = findViewById(R.id.btnRetorna5);
        btnAvanza5 = findViewById(R.id.btnAvanza5);

        ListaA=new ArrayList<>();
        ListaN=new ArrayList<>();

        ListaA=getIntent().getStringArrayListExtra("arregloP");
        ListaN=getIntent().getStringArrayListExtra("arregloN");
        Seleccion1=getIntent().getBooleanArrayExtra("select");

        positivas = getIntent().getIntExtra("cantP",0);
        negativas = getIntent().getIntExtra("cantN",0);

        txtCantP.setText("        Total Positivas:"+positivas);
        txtCantN.setText("        Total Negativas:"+negativas);


        double prc = (positivas*12.5);

        txtPorcen.setText("        Porcentaje Positivas:"+prc+" %");

        prc = prc/100;

        if(prc<=0.25){
            imgEstado.setImageResource(R.mipmap.malo);
        }else if(prc>0.25&&prc<=0.50){
            imgEstado.setImageResource(R.mipmap.bueno);
        }else if(prc>0.50&&prc<=0.75){
            imgEstado.setImageResource(R.mipmap.muybueno);
        }else if(prc>0.75){
            imgEstado.setImageResource(R.mipmap.exelente);
        }

        btnRetorna5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(Actividad4.this, Actividad3.class);
                intent5.putExtra("resA", ListaA);
                intent5.putExtra("resN", ListaN);
                intent5.putExtra("select", Seleccion1);
                startActivity(intent5);
            }
        });

        btnAvanza5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(Actividad4.this, Actividad2.class);
                startActivity(intent5);
                finish();
            }
        });

    }
}
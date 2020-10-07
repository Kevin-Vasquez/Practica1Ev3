package com.example.practica1ev3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class Actividad2 extends AppCompatActivity {

    ImageView btnRetro,btnAvanzar3;
    Switch switch1,switch2,switch3,switch4,switch5,switch6,switch7,switch8;

    //Creamos un Arreglo para llenar las listas afirmativa
    ArrayList<String> RespuestasA,RespuestasN;
    //ArrayList<Boolean> Seleccion;
    private boolean[] Seleccion=new boolean[8];
    private boolean[] Seleccion1=new boolean[8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        switch1=findViewById(R.id.switch1);
        switch2=findViewById(R.id.switch2);
        switch3=findViewById(R.id.switch3);
        switch4=findViewById(R.id.switch4);
        switch5=findViewById(R.id.switch5);
        switch6=findViewById(R.id.switch6);
        switch7=findViewById(R.id.switch7);
        switch8=findViewById(R.id.switch8);



        btnRetro=findViewById(R.id.btnRetro);
        btnAvanzar3=findViewById(R.id.btnAvanza3);

        Seleccion1=getIntent().getBooleanArrayExtra("select");
       // Seleccion1[0]=true;

        if(Seleccion1==null){
           // Toast.makeText(this,"No tiene Elementos",Toast.LENGTH_LONG).show();
        }else {
          //  Toast.makeText(this,"SI HAY...",Toast.LENGTH_LONG).show();





              if(Seleccion1[0]==true){
                  switch1.setChecked(true);
              }else {
                  switch1.setChecked(false);
              }

            if(Seleccion1[1]==true){
                switch2.setChecked(true);
            }else {
                switch2.setChecked(false);
            }

            if(Seleccion1[2]==true){
                switch3.setChecked(true);
            }else {
                switch3.setChecked(false);
            }

            if(Seleccion1[3]==true){
                switch4.setChecked(true);
            }else {
                switch4.setChecked(false);
            }

            if(Seleccion1[4]==true){
                switch5.setChecked(true);
            }else {
                switch5.setChecked(false);
            }

            if(Seleccion1[5]==true){
                switch6.setChecked(true);
            }else {
                switch6.setChecked(false);
            }

            if(Seleccion1[6]==true){
                switch7.setChecked(true);
            }else {
                switch7.setChecked(false);
            }

            if(Seleccion1[7]==true){
                switch8.setChecked(true);
            }else {
                switch8.setChecked(false);
            }





        }





        btnRetro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Actividad2.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btnAvanzar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(Actividad2.this,Actividad3.class);

                RespuestasA=new ArrayList<>();
                RespuestasN=new ArrayList<>();



                if(switch1.isChecked()==true){
                    RespuestasA.add(switch1.getText().toString());
                    RespuestasN.remove(switch1.getText().toString());
                    Seleccion[0]=true;
                }
                else{
                    RespuestasN.add(switch1.getText().toString());
                    RespuestasA.remove(switch1.getText().toString());
                    Seleccion[0]=false;
                }

                if(switch2.isChecked()==true){
                    RespuestasA.add(switch2.getText().toString());
                    RespuestasN.remove(switch2.getText().toString());
                    Seleccion[1]=true;
                }
                else{
                    RespuestasN.add(switch2.getText().toString());
                    RespuestasA.remove(switch2.getText().toString());
                    Seleccion[1]=false;
                }

 //inicio kevin
                if(switch3.isChecked()==true){
                    RespuestasA.add(switch3.getText().toString());
                    RespuestasN.remove(switch3.getText().toString());
                    Seleccion[2]=true;
                }
                else{
                    RespuestasN.add(switch3.getText().toString());
                    RespuestasA.remove(switch3.getText().toString());
                    Seleccion[2]=false;
                }

                if(switch4.isChecked()==true){
                    RespuestasA.add(switch4.getText().toString());
                    RespuestasN.remove(switch4.getText().toString());
                    Seleccion[3]=true;
                }
                else{
                    RespuestasN.add(switch4.getText().toString());
                    RespuestasA.remove(switch4.getText().toString());
                    Seleccion[3]=false;
                }

                if(switch5.isChecked()==true){
                    RespuestasA.add(switch5.getText().toString());
                    RespuestasN.remove(switch5.getText().toString());
                    Seleccion[4]=true;
                }
                else{
                    RespuestasN.add(switch5.getText().toString());
                    RespuestasA.remove(switch5.getText().toString());
                    Seleccion[4]=false;
                }

                if(switch6.isChecked()==true){
                    RespuestasA.add(switch6.getText().toString());
                    RespuestasN.remove(switch6.getText().toString());
                    Seleccion[5]=true;
                }
                else{
                    RespuestasN.add(switch6.getText().toString());
                    RespuestasA.remove(switch6.getText().toString());
                    Seleccion[5]=false;
                }

                if(switch7.isChecked()==true){
                    RespuestasA.add(switch7.getText().toString());
                    RespuestasN.remove(switch7.getText().toString());
                    Seleccion[6]=true;
                }
                else{
                    RespuestasN.add(switch7.getText().toString());
                    RespuestasA.remove(switch7.getText().toString());
                    Seleccion[6]=false;
                }

                if(switch8.isChecked()==true){
                    RespuestasA.add(switch8.getText().toString());
                    RespuestasN.remove(switch8.getText().toString());
                    Seleccion[7]=true;
                }
                else{
                    RespuestasN.add(switch8.getText().toString());
                    RespuestasA.remove(switch8.getText().toString());
                    Seleccion[7]=false;
                }
      //Fin kevin

                intent2.putExtra("select",Seleccion);
                intent2.putExtra("resN",RespuestasN);
                intent2.putExtra("resA", RespuestasA);


                startActivity(intent2);
            }
        });


    }
}
package com.unidad3.gio.practica003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    /**declaro las cajas de texto;
     * numerouno para la caja numero A,
     * numerodos para la caja de numero B,
     * resultado para la caja que contenera el resultado
     * Ademas los componentes Radiobotton
     * s para suma, r para resta, d para dividir y m para multiplicar
     */
    EditText numerouno, numerodos, resultado;
    RadioButton s,r,d,m;
    Button boton;
    /**se declara las variables que se utilizaran en las operaciones
       a para el numero A
       b para el numero B
       resul para el resultado
     */

  float a,b,resul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Busco los componentes y los asigno
        numerouno=(EditText)findViewById(R.id.Txta);
        numerodos=(EditText)findViewById(R.id.Txtb);
        resultado=(EditText)findViewById(R.id.TxtResultado);
        s=(RadioButton)findViewById(R.id.RbtnSuma);
        r=(RadioButton)findViewById(R.id.RbtnResta);
        d=(RadioButton)findViewById(R.id.RbtnDivi);
        m=(RadioButton)findViewById(R.id.RbtnMult);
        boton=(Button)findViewById(R.id.BtnOperacion);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Float.parseFloat(numerouno.getText().toString());
                b=Float.parseFloat(numerodos.getText().toString());
             if (s.isChecked()){
                 resul=a+b;
                 resultado.setText(Float.toString(resul));
             }
             if (r.isChecked()){
                 resul=a-b;
                 resultado.setText(Float.toString(resul));
             }
             if (d.isChecked()){
                 if (b==0){
                     resultado.setText("no se puede dividir entre cero");
                 }
                 else {
                     resul=a/b;
                     resultado.setText(Float.toString(resul));
                 }
             }
             if (m.isChecked()){
                 resul=a*b;
                 resultado.setText(Float.toString(resul));
             }
            }
        });
    }

}

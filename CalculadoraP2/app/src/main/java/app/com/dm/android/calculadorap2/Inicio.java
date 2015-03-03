package app.com.dm.android.calculadorap2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Inicio extends ActionBarActivity implements View.OnClickListener {

    boolean decimal = false;
    boolean suma = false;
    boolean resta = false;
    boolean multiplicacion = false;
    boolean division = false;
    Double[] numero = new Double[20];
    Double resultado;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Button n0 = (Button)findViewById(R.id.btn0);
        n0.setOnClickListener(this);
        Button n1 = (Button)findViewById(R.id.btn1);
        n1.setOnClickListener(this);
        Button n2 = (Button)findViewById(R.id.btn2);
        n2.setOnClickListener(this);
        Button n3 = (Button)findViewById(R.id.btn3);
        n3.setOnClickListener(this);
        Button n4 = (Button)findViewById(R.id.btn4);
        n4.setOnClickListener(this);
        Button n5 = (Button)findViewById(R.id.btn5);
        n5.setOnClickListener(this);
        Button n6 = (Button)findViewById(R.id.btn6);
        n6.setOnClickListener(this);
        Button n7 = (Button)findViewById(R.id.btn7);
        n7.setOnClickListener(this);
        Button n8 = (Button)findViewById(R.id.btn8);
        n8.setOnClickListener(this);
        Button n9 = (Button)findViewById(R.id.btn9);
        n9.setOnClickListener(this);

        Button punto = (Button)findViewById(R.id.btnPunto);
        punto.setOnClickListener(this);

        Button suma = (Button)findViewById(R.id.btnMas);
        suma.setOnClickListener(this);
        Button resta = (Button)findViewById(R.id.btnMenos);
        resta.setOnClickListener(this);
        Button multiplicacion = (Button)findViewById(R.id.btnPor);
        multiplicacion.setOnClickListener(this);
        Button division = (Button)findViewById(R.id.btnDividir);
        division.setOnClickListener(this);
        Button igual = (Button)findViewById(R.id.btnIgual);
        igual.setOnClickListener(this);

        Button borrar = (Button)findViewById(R.id.btnBorrar);
        borrar.setOnClickListener(this);
        Button eliminar = (Button)findViewById(R.id.btnEliminar);
        eliminar.setOnClickListener(this);
    }
    public void onClick(View v) {
        TextView pantalla = (TextView) findViewById(R.id.texto);
        pantalla.setTextSize(25);
        int seleccion = v.getId();
        String a = pantalla.getText().toString();

        try {
            switch (seleccion) {
                case R.id.btn0:
                    pantalla.setText(a+"0");
                    break;
                case R.id.btn1:
                    pantalla.setText(a+"1");
                    break;
                case R.id.btn2:
                    pantalla.setText(a+"2");
                    break;
                case R.id.btn3:
                    pantalla.setText(a+"3");
                    break;
                case R.id.btn4:
                    pantalla.setText(a+"4");
                    break;
                case R.id.btn5:
                    pantalla.setText(a+"5");
                    break;
                case R.id.btn6:
                    pantalla.setText(a+"6");
                    break;
                case R.id.btn7:
                    pantalla.setText(a+"7");
                    break;
                case R.id.btn8:
                    pantalla.setText(a+"8");
                    break;
                case R.id.btn9:
                    pantalla.setText(a+"9");
                    break;

                case R.id.btnPunto:
                    if(decimal == false){
                        pantalla.setText(a+".");
                        decimal=true;
                    }
                    else
                        return;
                    break;

                case R.id.btnMas:
                    suma = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnMenos:
                    resta = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnPor:
                    multiplicacion = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnDividir:
                    division = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnIgual:
                    numero[1] = Double.parseDouble(a);
                    if(suma == true){

                        resultado = numero[0] + numero [1];
                        pantalla.setText(String.valueOf(resultado));

                    }
                    else if (resta == true){

                        resultado = numero[0] - numero [1];
                        pantalla.setText(String.valueOf(resultado));

                    }
                    else if (multiplicacion == true){

                        resultado = numero[0] * numero [1];
                        pantalla.setText(String.valueOf(resultado));

                    }
                    else if (division == true){

                        resultado = numero[0] / numero [1];
                        pantalla.setText(String.valueOf(resultado));

                    }
                    decimal = false;
                    suma = false;
                    resta = false;
                    multiplicacion = false;
                    division = false;
                    break;

                case R.id.btnBorrar:
            //        int cadena;
            //        cadena = a.length();
            //        pantalla.setText(String.valueOf(cadena));

                    if(pantalla.getText().toString().length() > 1){
                        String screen_new = pantalla.getText().toString().substring(0, pantalla.getText().toString().length()-1);
                        pantalla.setText(screen_new);
                    }else{
                        pantalla.setText("");
                    }

                    break;

                case R.id.btnEliminar:
                    pantalla.setText("");
                    decimal = false;
                    break;

            }
        }
        catch(Exception e){
             pantalla.setText("error");
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inicio, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

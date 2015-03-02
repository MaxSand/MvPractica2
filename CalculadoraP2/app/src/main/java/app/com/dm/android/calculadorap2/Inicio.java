package app.com.dm.android.calculadorap2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Inicio extends ActionBarActivity implements OnClickListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Button n0 = (Button)findViewById(R.id.btn0);
        n0.setOnClickListener(this);
        Button n1 = (Button)findViewById(R.id.btn1);
        n0.setOnClickListener(this);
        Button n2 = (Button)findViewById(R.id.btn2);
        n0.setOnClickListener(this);
        Button n3 = (Button)findViewById(R.id.btn3);
        n0.setOnClickListener(this);
        Button n4 = (Button)findViewById(R.id.btn4);
        n0.setOnClickListener(this);
        Button n5 = (Button)findViewById(R.id.btn5);
        n0.setOnClickListener(this);
        Button n6 = (Button)findViewById(R.id.btn6);
        n0.setOnClickListener(this);
        Button n7 = (Button)findViewById(R.id.btn7);
        n0.setOnClickListener(this);
        Button n8 = (Button)findViewById(R.id.btn8);
        n0.setOnClickListener(this);
        Button n9 = (Button)findViewById(R.id.btn9);
        n0.setOnClickListener(this);

        Button punto = (Button)findViewById(R.id.btnPunto);
        n0.setOnClickListener(this);

        Button suma = (Button)findViewById(R.id.btnMas);
        n0.setOnClickListener(this);
        Button resta = (Button)findViewById(R.id.btnMenos);
        n0.setOnClickListener(this);
        Button multiplicacion = (Button)findViewById(R.id.btnPor);
        n0.setOnClickListener(this);
        Button division = (Button)findViewById(R.id.btnDividir);
        n0.setOnClickListener(this);
        Button igual = (Button)findViewById(R.id.btnIgual);
        n0.setOnClickListener(this);

        Button borrar = (Button)findViewById(R.id.btnBorrar);
        n0.setOnClickListener(this);
        Button eliminar = (Button)findViewById(R.id.btnEliminar);
        n0.setOnClickListener(this);
    }
    public void onClick(View v) {
        TextView pantalla = (TextView) findViewById(R.id.texto);
        int seleccion = v.getId();

        try {
            switch (seleccion) {
                case R.id.btn0:
                    pantalla.setText("0");
                    break;
                case R.id.btn1:
                    pantalla.setText("1");
                    break;
                case R.id.btn2:
                    pantalla.setText("2");
                    break;
                case R.id.btn3:
                    pantalla.setText("3");
                    break;
                case R.id.btn4:
                    pantalla.setText("4");
                    break;
                case R.id.btn5:
                    pantalla.setText("5");
                    break;
                case R.id.btn6:
                    pantalla.setText("6");
                    break;
                case R.id.btn7:
                    pantalla.setText("7");
                    break;
                case R.id.btn8:
                    pantalla.setText("8");
                    break;
                case R.id.btn9:
                    pantalla.setText("9");
                    break;
                case R.id.btnPunto:
                    pantalla.setText(".");
                    break;
                case R.id.btnMas:
                    pantalla.setText("");
                    break;
                case R.id.btnMenos:
                    pantalla.setText("");
                    break;
                case R.id.btnPor:
                    pantalla.setText("");
                    break;
                case R.id.btnDividir:
                    pantalla.setText("");
                    break;

                case R.id.btnBorrar:
                    pantalla.setText("");
                    break;

            }
            catch(Exception e){
                pantalla.setText("error");
            }

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

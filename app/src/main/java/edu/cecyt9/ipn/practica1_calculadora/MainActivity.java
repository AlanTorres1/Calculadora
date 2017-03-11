package edu.cecyt9.ipn.practica1_calculadora;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;


public class MainActivity extends Activity { //se crea la clase

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    Double numero1,numero2,resultado;
    String operador;
    public void onClickButtonUno(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "1");
    }
    public void onClickButtonDos(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "2");
    }
    public void onClickButtonTres(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "3");
    }
    public void onClickButtonCuatro(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "4");
    }
    public void onClickButtonCinco(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "5");
    }
    public void onClickButtonSeis(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "6");
    }
    public void onClickButtonSiete(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "7");
    }
    public void onClickButtonOcho(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "8");
    }
    public void onClickButtonNueve(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "9");
    }
    public void onClickButtonCero(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + "0");
    }

    public void onClickButtonPunto(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText(tv.getText() + ".");
    }

    public void onClickOperacionCapturaNumero1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickSuma(View miView)
    {
        operador="+";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickResta(View miView)
    {
        operador="-";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickMultiplicacion(View miView)
    {
        operador="*";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickDivision(View miView)
    {
        operador="/";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickRaiz(View miView) //RAIZ
    {
        operador="Raiz";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickMod(View miView) //MOD
    {
        operador="Mod";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickFactorial(View miView)//Factorial
    {
        operador="x!";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickPotencia(View miView)//Potencia
    {
        operador="x^n";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickPrimo(View miView){
        operador="Primo";
        onClickOperacionCapturaNumero1(miView);

    }

    public void onClickIgual(View miView)
    {



        try {

            if (operador.equals("+")) {
                TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
                numero2 = Double.parseDouble(tv.getText().toString());
                resultado = numero1 + numero2;
                tv.setText(resultado.toString());
            } else if (operador.equals("-")) {
                TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
                numero2 = Double.parseDouble(tv.getText().toString());
                resultado = numero1 - numero2;
                tv.setText(resultado.toString());
            } else if (operador.equals("*")) {
                TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
                numero2 = Double.parseDouble(tv.getText().toString());
                resultado = numero1 * numero2;
                tv.setText(resultado.toString());
            } else if (operador.equals("/")) {
                TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
                numero2 = Double.parseDouble(tv.getText().toString());
                resultado = numero1 / numero2;
                tv.setText(resultado.toString());
            } else if (operador.equals("Raiz")){
                TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
                resultado =  Math.sqrt(numero1);
                tv.setText(resultado.toString());
            } else if (operador.equals("Mod")){
                TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
                numero2 = Double.parseDouble(tv.getText().toString());
                resultado = numero1%numero2;
                tv.setText(resultado.toString());
            } else if (operador.equals("x!")){
                TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
                double factorial=numero1;
                resultado=factorial;
                while(factorial !=1){
                    factorial--;
                    resultado=resultado*factorial;
                }
                tv.setText(resultado.toString());
            } else if (operador.equals("x^n")) {
                TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
                numero2 = Double.parseDouble(tv.getText().toString());
                resultado = Math.pow(numero1, numero2);
                tv.setText(resultado.toString());
            } else if (operador.equals("Primo")){
                TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
                int a=0;
                for(int i=1;i<(numero1+1);i++){
                    if(numero1%i==0){
                        a++;
                    }
                }
                if(a!=2){
                    resultado=0.0;//"El numero no es Primo"
                }else {
                    resultado =1.1;//"El numero si es Primo")
                }
                tv.setText(resultado.toString());

            }

        }catch(NumberFormatException nfe){
            Toast.makeText(this,"Numero Incorrecto", LENGTH_SHORT).show();
        }
    }

    public void onClickLimpia(View miView)
    {
        numero1=0.0;
        numero2=0.0;
        TextView tv = (TextView) findViewById(R.id.textViewNumero) ;
        tv.setText("");
    }

    @Override
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

package com.project.aaron.fizzbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText textFrom;
    public EditText textTo;
    public EditText textFizz;
    public EditText textBuzz;
    public TextView result;

    public int fromNum = 0;
    public int toNum = 0;
    public int fizz = 0;
    public int buzz = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textFrom = ((EditText) findViewById(R.id.number_from));
        textTo = ((EditText) findViewById(R.id.number_to));
        textFizz = ((EditText) findViewById(R.id.fizz));
        textBuzz = ((EditText) findViewById(R.id.buzz));
        result = ((TextView) findViewById(R.id.result));

    }

    public void doIt(View view) {
        fizzBuzz();
    }

    public void fizzBuzz(){
        fromNum = Integer.parseInt( textFrom.getText().toString());
        toNum = Integer.parseInt( textTo.getText().toString());
        fizz = Integer.parseInt( textFizz.getText().toString());
        buzz = Integer.parseInt( textBuzz.getText().toString());

        StringBuilder res = new StringBuilder();

        boolean fizzFlag = false;
        boolean buzzFlag = false;

        for (int number =  fromNum; number <= toNum ; number++){

            fizzFlag = false;
            buzzFlag = false;

            if(number % fizz == 0 ){
                fizzFlag = true;
                res.append("fizz");
            }
            if(number % buzz == 0 ){
                buzzFlag = true;
                res.append("buzz");
            }

            if(!(fizzFlag || buzzFlag)){
                res.append( String.valueOf( number));
            }

            res.append("\n");

        }

        result.setText( res.toString());
    }
}

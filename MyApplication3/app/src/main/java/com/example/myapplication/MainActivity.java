package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.quickaccesswallet.WalletServiceEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText IdIn;
    private EditText ageln;
    private EditText departurein;
    private EditText arrivalin;
    private EditText departreDateln;
    private Button  button;

    private String id;
    private int age;
    private String departurePoint;
    private String arrivalinPoint;
    private String departureDate;

    @Override
    protected  void  onCreate(Bundle savedIntanceState) {
        super.onCreate(savedIntanceState);
        setContentView(R.layout.activity_main);

        IdIn = findViewById(R.id.IdIn);
        ageln = findViewById(R.id.ageln);
        departurein = findViewById(R.id.departurein);
        arrivalin = findViewById(R.id.arrivalin);
        departreDateln = findViewById(R.id.departreDateln);
        button = findViewById(R.id.button);

        button.setOnClickListener(listener);

    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            id = IdIn.getText().toString();
            departurePoint = departurein.getText().toString();
            arrivalinPoint = arrivalin.getText().toString();
            departureDate = departreDateln.getText().toString();

            try {
                age = Integer.parseInt(ageln.getText().toString());
            } catch (NumberFormatException exception){
                Toast.makeText( MainActivity.this,  "Вы ввели не число", Toast.LENGTH_LONG).show();
            }
            if (age < 18 ){
                Toast.makeText( MainActivity.this,  "Билет можно оформить только с 18 лет", Toast.LENGTH_LONG).show();
            } else {
               switch (arrivalinPoint){
                   case "Москва":
                      cost = 1000;
                       break;
                   case "Владивосток":
                       cost = 6000;
                       break;
                   default:
                       cost = 1999;
               }
            }
            user = new User(id, age, departurePoint, arrivalinPoint, departureDate, cost);
            Intent intent = new Intent (getApplicationContext() SecondActivity.class );
            intent.putExtra(User.class.getSimpleName(). user);
            startActivity(intent);

        }
    }
}
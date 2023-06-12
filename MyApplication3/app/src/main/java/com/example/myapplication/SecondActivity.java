package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView dataTicket;
    private Button button;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        dataTicket = findViewById(R.id.dataTicket);
        button = findViewById(R.id.button);

        Bundle bundleTicket = getIntent().getExtras();
        if (bundleTicket != null) {
            user = (User) bundleTicket.getSerializable(User.class.getSimpleName());

            dataTicket.setText("Билет на пассажире" + user.getId() + "\n" + "Место отправления" + user.getDeparturePoint()
                    + "\n" + "Местро прибывания" + user.getArrivalPoint() + "\n" + "Время отправления" + user.getDepartureDate()
                    + "\n" + "Стоимость билета" + user.getCost());
        }
        button.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener(){
        @Override
        public  void onClick(View view){
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    }

}
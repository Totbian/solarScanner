package com.example.solarscanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_calc;

    //logging if the button is pressed

    public void open_calc(View view) {

        Log.i("info", "Button pressed!");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//finding Számolás button on MainActivity

        button_calc = (Button) findViewById(R.id.button_calc);
        button_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActvity2();
            }
        });

    }

//opening Main2Activity with the Számolás button
    public void openActvity2() {

        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);

    }
}

package com.mintu.sdkcheck;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int[] BUTTON_IDS = {
            R.id.location_delhi,
            R.id.location_dhanbad,
            R.id.location_kolkata,
            R.id.location_gurgaon,
            R.id.location_kanpur,
            R.id.location_mumbai,
            R.id.location_ranchi,
            R.id.location_noida,
            R.id.location_greater_noida,
            R.id.location_bokaro
    };

    private static final String[] LOCATIONS_NAME = {
            "delhi",
            "dhanbad",
            "kolkata",
            "gurgaon",
            "kanpur",
            "mumbai",
            "ranchi",
            "noida",
            "greater noida",
            "bokaro"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing Views
        init();

    }

    private void init() {

        Button button[] = new Button[10];
        for (int id : BUTTON_IDS )
        {
            for (int i=0;i<10;i++)
            {
                button[i] = (Button) findViewById(id);
                button[i].setOnClickListener(this);
            }
        }
    }

    @Override
    public void onClick(View view) {

        for (int i = 0; i<10; i++)
        {
            if (view.getId() == BUTTON_IDS[i])
            {
                SendToWeatherStatusActivity(LOCATIONS_NAME[i]);
            }
        }
    }

    private void SendToWeatherStatusActivity(String city) {
        Intent intent = new Intent(this, WeatherStatusActivity.class);
        intent.putExtra("city",city);
        startActivity(intent);
    }
}


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

        if (view.getId() == BUTTON_IDS[0])
        {
            SendToWeatherStatusActivity("delhi");
        }
        else if ( view.getId() == BUTTON_IDS[1])
        {
            SendToWeatherStatusActivity("dhanbad");
        }
        else if ( view.getId() == BUTTON_IDS[2])
        {
            SendToWeatherStatusActivity("kolkata");
        }
        else if ( view.getId() == BUTTON_IDS[3])
        {
            SendToWeatherStatusActivity("gurgaon");
        }
        else if ( view.getId() == BUTTON_IDS[4])
        {
            SendToWeatherStatusActivity("kanpur");
        }
        else if ( view.getId() == BUTTON_IDS[5])
        {
            SendToWeatherStatusActivity("mumbai");
        }
        else if ( view.getId() == BUTTON_IDS[6])
        {
            SendToWeatherStatusActivity("ranchi");
        }
        else if ( view.getId() == BUTTON_IDS[7])
        {
            SendToWeatherStatusActivity("noida");
        }
        else if ( view.getId() == BUTTON_IDS[8])
        {
            SendToWeatherStatusActivity("greater noida");
        }
        else if ( view.getId() == BUTTON_IDS[9])
        {
            SendToWeatherStatusActivity("bokaro");
        }

    }

    private void SendToWeatherStatusActivity(String city) {
        Intent intent = new Intent(this, WeatherStatusActivity.class);
        intent.putExtra("city",city);
        startActivity(intent);
    }
}


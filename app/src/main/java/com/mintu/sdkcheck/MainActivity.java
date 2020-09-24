package com.mintu.sdkcheck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button locationDelhi,locationDhanbad,locationKolkata,locationGurgaon,locationKanpur,
                   locationMumbai,locationRanchi,locationNoida,locationGreaterNoida,locationBokaro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing Views
        init();

        //Setting click listener
        setClick();

    }

    private void init() {
        locationDelhi = (Button) findViewById(R.id.location_delhi);
        locationDhanbad = (Button) findViewById(R.id.location_dhanbad);
        locationKolkata = (Button) findViewById(R.id.location_kolkata);
        locationGurgaon = (Button) findViewById(R.id.location_gurgaon);
        locationKanpur = (Button) findViewById(R.id.location_kanpur);
        locationMumbai = (Button) findViewById(R.id.location_mumbai);
        locationRanchi = (Button) findViewById(R.id.location_ranchi);
        locationNoida = (Button) findViewById(R.id.location_noida);
        locationGreaterNoida = (Button) findViewById(R.id.location_greater_noida);
        locationBokaro = (Button) findViewById(R.id.location_bokaro);
    }

    private void setClick() {
        locationDelhi.setOnClickListener(this);
        locationBokaro.setOnClickListener(this);
        locationGreaterNoida.setOnClickListener(this);
        locationNoida.setOnClickListener(this);
        locationRanchi.setOnClickListener(this);
        locationMumbai.setOnClickListener(this);
        locationKanpur.setOnClickListener(this);
        locationGurgaon.setOnClickListener(this);
        locationKolkata.setOnClickListener(this);
        locationDhanbad.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view == locationDelhi)
        {
            SendToWeatherStatusActivity("delhi");
        }
        else if ( view == locationDhanbad)
        {
            SendToWeatherStatusActivity("dhanbad");
        }
        else if ( view == locationBokaro)
        {
            SendToWeatherStatusActivity("bokaro");
        }
        else if ( view == locationGreaterNoida)
        {
            SendToWeatherStatusActivity("greater noida");
        }
        else if ( view == locationGurgaon)
        {
            SendToWeatherStatusActivity("gurgaon");
        }
        else if ( view == locationKanpur)
        {
            SendToWeatherStatusActivity("kanpur");
        }
        else if ( view == locationKolkata)
        {
            SendToWeatherStatusActivity("kolkata");
        }
        else if ( view == locationMumbai)
        {
            SendToWeatherStatusActivity("mumbai");
        }
        else if ( view == locationNoida)
        {
            SendToWeatherStatusActivity("noida");
        }
        else
        {
            SendToWeatherStatusActivity("ranchi");
        }

    }

    private void SendToWeatherStatusActivity(String city) {
        Intent intent = new Intent(this, WeatherStatusActivity.class);
        intent.putExtra("city",city);
        startActivity(intent);
    }
}


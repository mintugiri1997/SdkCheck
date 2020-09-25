package com.mintu.sdkcheck;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.TypedArrayUtils;

import java.util.ArrayList;

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
            for (int i=0;i<BUTTON_IDS.length;i++)
            {
                button[i] = (Button) findViewById(id);
                button[i].setOnClickListener(this);
            }
        }
    }

    @Override
    public void onClick(View view) {

//        for (int i = 0; i<BUTTON_IDS.length; i++)
//        {
//            if (view.getId() == BUTTON_IDS[i])
//            {
//                SendToWeatherStatusActivity(LOCATIONS_NAME[i]);
//            }
//        }

        ArrayList<Integer> buttonIdArray = new ArrayList<>();
        for (int i = 0; i < BUTTON_IDS.length; i++)
        {
            buttonIdArray.add(BUTTON_IDS[i]);
        }
        int clickedButtonId = view.getId();
        int clickedButtonIndex =  buttonIdArray.indexOf(clickedButtonId);
        String selectedLocation = LOCATIONS_NAME[clickedButtonIndex];
        Log.d("clickedButtonIndex: ", String.valueOf(clickedButtonIndex));
        Log.d("selectedLocation: ", selectedLocation);
        SendToWeatherStatusActivity(selectedLocation);
    }

    private void SendToWeatherStatusActivity(String city) {
        Intent intent = new Intent(this, WeatherStatusActivity.class);
        intent.putExtra("city",city);
        startActivity(intent);
    }
}


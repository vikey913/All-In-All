package com.getzetgo.all_in_all;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        Bitmap[] services = new Bitmap[25];
        services[0] = BitmapFactory.decodeResource(getResources(), R.drawable.bike_puncture);
        services[1] = BitmapFactory.decodeResource(getResources(), R.drawable.car_puncture);
        services[2] = BitmapFactory.decodeResource(getResources(), R.drawable.emergency_petrol);
        services[3] = BitmapFactory.decodeResource(getResources(), R.drawable.medicine_home_delivery);
        services[4] = BitmapFactory.decodeResource(getResources(), R.drawable.travel_ticket_booking);
        services[5] = BitmapFactory.decodeResource(getResources(), R.drawable.mobile_recharge);
        services[6] = BitmapFactory.decodeResource(getResources(), R.drawable.water_purifier);
        services[7] = BitmapFactory.decodeResource(getResources(), R.drawable.water_cane_supply);
        services[8] = BitmapFactory.decodeResource(getResources(), R.drawable.car_water_service);
        services[9] = BitmapFactory.decodeResource(getResources(), R.drawable.groceries_shopping);
        services[10] = BitmapFactory.decodeResource(getResources(), R.drawable.stationery);
        services[11] = BitmapFactory.decodeResource(getResources(), R.drawable.women_personal_trainer);
        services[12] = BitmapFactory.decodeResource(getResources(), R.drawable.function_arrangement);
        services[13] = BitmapFactory.decodeResource(getResources(), R.drawable.video_coverage);
        services[14] = BitmapFactory.decodeResource(getResources(), R.drawable.camera_coverage);
        services[15] = BitmapFactory.decodeResource(getResources(), R.drawable.bridal_makeup);
        services[16] = BitmapFactory.decodeResource(getResources(), R.drawable.beauty_parlour);
        services[17] = BitmapFactory.decodeResource(getResources(), R.drawable.hotel_booking);
        services[18] = BitmapFactory.decodeResource(getResources(), R.drawable.acting_driver);
        services[19] = BitmapFactory.decodeResource(getResources(), R.drawable.sewer_worker);
        services[20] = BitmapFactory.decodeResource(getResources(), R.drawable.packers_and_movers);
        services[21] = BitmapFactory.decodeResource(getResources(), R.drawable.rent_cars);



        ServiceAdapter myAdaptor = new ServiceAdapter(getResources().getStringArray(R.array.service_list),services);
//                recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 3));
                recyclerView.setScrollbarFadingEnabled(true);
        recyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 3, LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(myAdaptor);
    }
}

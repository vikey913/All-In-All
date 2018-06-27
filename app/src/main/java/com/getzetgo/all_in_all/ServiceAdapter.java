package com.getzetgo.all_in_all;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.logging.Logger;

/**
 * Created by VigneshwaranArumugam on 2018-06-26.
 */

public class ServiceAdapter extends RecyclerView.Adapter<ServiceViewHolder> {

    Logger logger = Logger.getLogger(ServiceAdapter.class.getName());


    String[] companyList;
    Bitmap[] logoList;

    public ServiceAdapter(String[] companyList, Bitmap[] logoList) {
        this.companyList = companyList;
        this.logoList = logoList;
    }


    @Override
    public ServiceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.service_layout, parent, false);
        ServiceViewHolder viewHolder = new ServiceViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ServiceViewHolder holder, final int position) {
        holder.logo.setImageBitmap(logoList[position]);
        holder.name.setText(companyList[position]);

        holder.logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "This is: " + companyList[position], Toast.LENGTH_SHORT).show();
                logger.info("Clicked" + "This is: " + companyList[position]);
            }
        });
    }

    @Override
    public int getItemCount() {
        return companyList.length;
    }
}
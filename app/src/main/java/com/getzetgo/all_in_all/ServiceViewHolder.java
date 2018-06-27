package com.getzetgo.all_in_all;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by VigneshwaranArumugam on 2018-06-26.
 */

public class ServiceViewHolder extends RecyclerView.ViewHolder{

    public ImageView logo;
    public TextView name;

    public ServiceViewHolder(View itemView) {
        super(itemView);
        logo = (ImageView)itemView.findViewById(R.id.logo);
        name = (TextView)itemView.findViewById(R.id.name);
    }
}
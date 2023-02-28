package com.example.assigne;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MyViewHolder extends RecyclerView.ViewHolder {

    public TextView title;
    public TextView description;
    public ImageView image;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.card_image);
        title = itemView.findViewById(R.id.card_title);
        description = itemView.findViewById(R.id.card_description);
    }
}

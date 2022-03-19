package com.example.recyclerview_cat.RV;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_cat.R;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView img;
    TextView text;
    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        img= itemView.findViewById(R.id.iv);
        text =itemView.findViewById(R.id.tv);
    }
}
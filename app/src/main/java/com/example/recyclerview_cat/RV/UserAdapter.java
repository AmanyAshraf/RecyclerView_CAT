package com.example.recyclerview_cat.RV;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_cat.R;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    ArrayList<User> users;

    public UserAdapter(ArrayList<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.user_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user= users.get(position);
        holder.img.setImageResource(user.getImg());
        holder.text.setText(user.getText());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}

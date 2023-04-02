package com.kaapo.opiskelijalista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class UserListAdapter extends RecyclerView.Adapter<UserViewHolder>{

    private Context context;
    private ArrayList<User> users;

    public UserListAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.userName.setText(users.get(position).getName() + " " + users.get(position).getLastName());
        holder.userEmail.setText(users.get(position).getEmail());
        holder.userDegree.setText(users.get(position).getDegreeProgram());


    }
    public void sortUsersByLastName() {
        users.sort(Comparator.comparing(User::getLastName));
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}

package com.kaapo.opiskelijalista;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    TextView userName, userLastName, userEmail, userDegree;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        userName = itemView.findViewById(R.id.txtNimi);
        userEmail = itemView.findViewById(R.id.txtSahkoposti);
        userDegree = itemView.findViewById(R.id.txtOpinnot);
    }
}

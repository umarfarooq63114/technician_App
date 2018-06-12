package com.example.umar.technician_app;

import android.Manifest;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.umar.technician_app.Model.Technician;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class TechnicianAdapter extends RecyclerView.Adapter<TechnicianAdapter.ViewHolder> {
    List<Technician> users;
    Context context;

    TechnicianAdapter(Context context, List<Technician> users) {
        this.context = context;
        this.users = users;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
//        ViewHolder viewHolder = new ViewHolder(view);
        return new ViewHolder(view);


    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.productName.setText(users.get(position).getName());
        holder.productFault.setText(users.get(position).getCategory());
        holder.productImage.setImageResource(users.get(position).getImage());









       /* holder.recyclerViewList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Ali baba", Toast.LENGTH_SHORT).show();
            }
        });*/


    }

    @Override
    public int getItemCount() {
        return users.size();



    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView productName,productBrand,productFault;
        ImageView productImage;
        LinearLayout recyclerViewList;


        public ViewHolder(View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.pImage);
            productName = itemView.findViewById(R.id.pName);
            productBrand = itemView.findViewById(R.id.pBrand);
            productFault = itemView.findViewById(R.id.pFault);
            recyclerViewList=itemView.findViewById(R.id.recyclerViewList);

        }
    }
}

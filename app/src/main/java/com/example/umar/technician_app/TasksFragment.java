package com.example.umar.technician_app;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.umar.technician_app.Model.Product;
import com.example.umar.technician_app.Model.Technician;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class TasksFragment extends Fragment {

    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    View view;
    private List<Product> own;

    public TasksFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tasks, container, false);


        recyclerView =(RecyclerView) view.findViewById(R.id.recyclerView);
         productAdapter = new ProductAdapter( own,getContext());

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        recyclerView.setAdapter(productAdapter);
        return  view;

    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    int pic1 = R.drawable.pix;
    own = new ArrayList<>();
    String name = null, phone = null;
    float ratingbar = (float) 1.5;

      for (int i = 1; i <= 5; i++) {
        own.add(new Product("SAMSUNG "+i, "MOBILE", pic1,
                "Screen and microphone does not working and battery issue",
                "Umar Farooq","03104187789","lahore"));
    }

}


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_tasks, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_call) {
            Toast.makeText(getActivity(), "Clicked on " + item.getTitle(), Toast.LENGTH_SHORT)
                    .show();
        }
        return true;
    }
}

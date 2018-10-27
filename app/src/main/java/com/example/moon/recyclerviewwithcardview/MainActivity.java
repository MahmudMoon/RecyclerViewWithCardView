package com.example.moon.recyclerviewwithcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> images;
    ArrayList<String> names;
    RecyclerView recyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init_views();
        init_variables();
        init_functions();
        init_listeners();
    }

    private void init_views() {
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
    }

    private void init_variables() {
        names = new ArrayList<>();
        images = new ArrayList<>();

    }

    private void init_functions() {
        loadImages();
        loadNames();
        loadDataToRecyclerView();
    }

    private void loadImages() {
        images.add("https://www.gstatic.com/webp/gallery/2.jpg");
        images.add("https://www.gstatic.com/webp/gallery/4.jpg");
        images.add("https://www.gstatic.com/webp/gallery/5.jpg");
        images.add("https://www.gstatic.com/webp/gallery3/1.png");
        images.add("https://www.gstatic.com/webp/gallery3/2.png");
        images.add("https://www.gstatic.com/webp/gallery/2.jpg");
        images.add("https://www.gstatic.com/webp/gallery/4.jpg");
        images.add("https://www.gstatic.com/webp/gallery/5.jpg");
        images.add("https://www.gstatic.com/webp/gallery3/1.png");
        images.add("https://www.gstatic.com/webp/gallery3/2.png");
        images.add("https://www.gstatic.com/webp/gallery/2.jpg");
        images.add("https://www.gstatic.com/webp/gallery/4.jpg");
        images.add("https://www.gstatic.com/webp/gallery/5.jpg");
        images.add("https://www.gstatic.com/webp/gallery3/1.png");
        images.add("https://www.gstatic.com/webp/gallery3/2.png");
        images.add("https://www.gstatic.com/webp/gallery/2.jpg");
        images.add("https://www.gstatic.com/webp/gallery/4.jpg");
        images.add("https://www.gstatic.com/webp/gallery/5.jpg");
        images.add("https://www.gstatic.com/webp/gallery3/1.png");
        images.add("https://www.gstatic.com/webp/gallery3/2.png");
        images.add("https://www.gstatic.com/webp/gallery/2.jpg");
        images.add("https://www.gstatic.com/webp/gallery/4.jpg");
        images.add("https://www.gstatic.com/webp/gallery/5.jpg");
        images.add("https://www.gstatic.com/webp/gallery3/1.png");
        images.add("https://www.gstatic.com/webp/gallery3/2.png");
        images.add("https://www.gstatic.com/webp/gallery/2.jpg");
        images.add("https://www.gstatic.com/webp/gallery/4.jpg");
        images.add("https://www.gstatic.com/webp/gallery/5.jpg");
        images.add("https://www.gstatic.com/webp/gallery3/1.png");
        images.add("https://www.gstatic.com/webp/gallery3/2.png");
        images.add("https://www.gstatic.com/webp/gallery/2.jpg");
        images.add("https://www.gstatic.com/webp/gallery/4.jpg");
        images.add("https://www.gstatic.com/webp/gallery/5.jpg");
        images.add("https://www.gstatic.com/webp/gallery3/1.png");
        images.add("https://www.gstatic.com/webp/gallery3/2.png");



    }

    private void loadNames() {
        names.add("swim");
        names.add("Tree");
        names.add("Fire");
        names.add("Rose");
        names.add("Penguine");
        names.add("swim");
        names.add("Tree");
        names.add("Fire");
        names.add("Rose");
        names.add("Penguine");
        names.add("swim");
        names.add("Tree");
        names.add("Fire");
        names.add("Rose");
        names.add("Penguine");
        names.add("swim");
        names.add("Tree");
        names.add("Fire");
        names.add("Rose");
        names.add("Penguine");
        names.add("swim");
        names.add("Tree");
        names.add("Fire");
        names.add("Rose");
        names.add("Penguine");
        names.add("swim");
        names.add("Tree");
        names.add("Fire");
        names.add("Rose");
        names.add("Penguine");
        names.add("swim");
        names.add("Tree");
        names.add("Fire");
        names.add("Rose");
        names.add("Penguine");


    }

    private void loadDataToRecyclerView() {
        myAdapter = new MyAdapter(getApplicationContext(),names,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //myAdapter.notify();
    }

    private void init_listeners() {

    }
}

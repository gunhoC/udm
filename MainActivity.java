package com.example.choi.udm;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AndroidException;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ScrollView;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ServerResponse {

    private RecyclerView recycler;
    private LinearLayoutManager llm;
    private RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recycler);
        llm = new LinearLayoutManager(this);

        recycler.addItemDecoration(new DividerItemDecoration(this,llm.getOrientation()));

        recycler.setLayoutManager(llm);

        List<Compo> compo = new ArrayList<>();

        //data 삽입
        compo.add(new Compo("asa1",42,65,32,96));
        compo.add(new Compo("asa2",41,25,26,82));
        compo.add(new Compo("asa3",25,26,67,65));
        compo.add(new Compo("asa4",27,29,27,99));
        compo.add(new Compo("asa5",82,65,32,25));
        compo.add(new Compo("asa6",82,42,32,42));


        recyclerViewAdapter = new RecyclerViewAdapter(this,compo);
        recycler.setAdapter(recyclerViewAdapter);

    }

    @Override
    public void processFinish(String output) throws JSONException {




    }
}
package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Search extends AppCompatActivity {

    ListView Searcher;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Searcher = (ListView) findViewById(R.id.Searcher);

        ArrayList<String> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(getResources().getStringArray(R.array.dest)));

        adapter = new ArrayAdapter<String>(

                Search.this,
                android.R.layout.simple_list_item_1,
                arr
        );

        Searcher.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)   {
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.search_menu,menu);
     MenuItem item= menu.findItem(R.id.Searcher);
     SearchView searchview = (SearchView) item.getActionView();
     searchview.setOnQueryTextListener(new SearchView.OnQueryTextListener(){
         @Override
         public boolean onQueryTextSubmit(String s)
         {

             return false;
         }
         @Override
         public boolean onQueryTextChange(String s)
         {
             adapter.getFilter().filter(s);
             return false;
         }
     });
    return super.onCreateOptionsMenu(menu);

    }

}

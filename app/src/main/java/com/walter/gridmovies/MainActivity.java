package com.walter.gridmovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid= (GridView) findViewById(R.id.grid);

        ImageAdapter adapter =new ImageAdapter(this);

        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Navigate to Details page
                //pass the info
                Intent y =new Intent(MainActivity.this,DetailsActivity.class);
                y.putExtra("data",position);
                startActivity(y);

            }
        });

    }
}

package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] cities = {"delhi","banglaore","jaipur","gurgaon","Noida","hyderabaad","chandigarh","mohali"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,cities);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast toast = Toast.makeText(MainActivity.this,"clicked"+cities[position],Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,0);
            }
        });


    }
}
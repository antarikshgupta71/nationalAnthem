package com.example.aloofwillow.nationalanthems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CountriesActivity extends AppCompatActivity {
    ArrayList<String>Countries;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);
        Countries=new ArrayList<>();
        Countries.add("India");
        Countries.add("Russia");
        Countries.add("Us");
        Countries.add("Germany");
        ListView listView=findViewById(R.id.listview);
        intent=new Intent(getApplicationContext(),FlagActivity.class);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Countries);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(CountriesActivity.this,Countries.get(i), Toast.LENGTH_SHORT).show();
                intent.putExtra("country",Countries.get(i));
                startActivity(intent);

            }
        });


    }
}

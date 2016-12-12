package com.example.vigneshravi.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter<String> adapter;
    ListView l;
    String[] cars={"VOLVO","BMW","BENZ","AMBASSADOR","AUDI","TOYOTA"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=(ListView)findViewById(R.id.lv);
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,cars);
        l.setAdapter(adapter);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TextView tv=(TextView)view;
                Toast.makeText(getBaseContext(),tv.getText().toString()+" is selected",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

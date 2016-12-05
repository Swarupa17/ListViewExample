package com.example.swarupa.listviewexample;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {ListView listView;
    String[] Names = {"ABD","XYZ","Neha","Mandar","Shweta","Swa","nfgvjrn"};
    String[]toView = {"9999999","9028388225","8087287247","123245","87756748399","13594869058","12343435355",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DisplayContact adapter = new DisplayContact(MainActivity.this, Names, toView);
        listView = (ListView) findViewById(R.id.contact_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


            }
        });

    }

}

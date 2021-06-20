package com.example.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class CountryList extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list);
        lv=findViewById(R.id.listview);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
                switch(pos){
                    case 0:
                        Toast.makeText(CountryList.this, "you clicked india", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(CountryList.this,India.class));
                        break;
                    case 1:
                        Toast.makeText(CountryList.this, "you clicked Pakistan", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(CountryList.this,Pakistan.class));
                        break;
                    case 2:
                        startActivity(new Intent(CountryList.this,Africa.class));
                        break;
                    case 3:
                        startActivity(new Intent(CountryList.this ,China.class));
                        break;
                    case 4:
                        startActivity(new Intent(CountryList.this,Japan.class));

                }
            }
        });
    }
}

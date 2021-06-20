package com.example.assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText t1,t2;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        btnSubmit=findViewById(R.id.btn);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String usn=t1.getText().toString();
                    String pwd=t2.getText().toString();
                    if(usn.equals("abc")&& pwd.equals("abc")){
                            startActivity(new Intent(MainActivity.this,CountryList.class));
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Authenticated Denied", Toast.LENGTH_SHORT).show();
                    }
                t1.getText().clear();
                t2.getText().clear();
            }
        });
    }
}



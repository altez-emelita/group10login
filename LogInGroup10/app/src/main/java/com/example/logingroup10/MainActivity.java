package com.example.logingroup10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);

    }

    public void verifydata(View view) {
        String strusername = username.getText().toString();
        String strpassword = password.getText().toString();


        if (strusername.equals("eme") && strpassword.equals("eme2021")){

            Intent intent = new Intent(this, EmeData.class);
            startActivity(intent);

        }else if (strusername.equals("jc") && strpassword.equals("jc2021")){

            Intent intent = new Intent(this, ChrisData.class);
            startActivity(intent);

        }else if (strusername.equals("pat") && strpassword.equals("pat2021")){

            Intent intent = new Intent(this, PatData.class);
            startActivity(intent);

        }else if (strusername.equals("mia") && strpassword.equals("mia2021")){

            Intent intent = new Intent(this, MiaData.class);
            startActivity(intent);

        }else{

            Toast.makeText(this, "Username or Password is Incorrect!", Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}
package com.example.myapp00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private View button;
    private EditText inputEmail;

    public void mensajeEmail(){
        //set email variable
        this.inputEmail = findViewById(R.id.idEmail);
        this.button = findViewById(R.id.idButon);
        this.button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, inputEmail.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mensajeEmail();
    }
}

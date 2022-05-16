package com.example.nguyenquanghuy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edUser, edEmail, edComment;
    private Button btSend;
    private Spinner spinner;
    private CheckBox ck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        innitView();

    }

    private void innitView(){
        edUser = (EditText)findViewById(R.id.edUser);
        edEmail = (EditText)findViewById(R.id.edEmail);
        edComment = (EditText)findViewById(R.id.edComment);
        btSend = findViewById(R.id.btSend);
        btSend.setOnClickListener(this);
        ck = findViewById(R.id.ck);

        String[] genders = {"Male", "Female", "Unknown"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item,
                genders);
        this.spinner.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        if (view == btSend) {
            onSend();
        }
    }
    private void onSend() {
        if (edUser.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Field Name cant not be null", Toast.LENGTH_LONG).show();
        }
        if (edEmail.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Field Emal cant not be null", Toast.LENGTH_LONG).show();
        }
        if (edComment.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "Field descriptin cant not be null", Toast.LENGTH_LONG).show();

        }
    }
}
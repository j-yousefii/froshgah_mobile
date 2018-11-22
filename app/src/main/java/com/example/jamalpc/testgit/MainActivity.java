package com.example.jamalpc.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button btnok;
    public EditText edtname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        finds();
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Your Name is "+edtname.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }

    private void finds() {
        btnok=(Button)findViewById(R.id.Main_btn);
        edtname=(EditText)findViewById(R.id.Main_edt);

    }


}

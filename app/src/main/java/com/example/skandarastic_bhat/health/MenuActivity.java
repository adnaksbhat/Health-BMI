package com.example.skandarastic_bhat.health;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    private EditText weight,height;
    private TextView output;
    private Resources res;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        weight=findViewById(R.id.weight);
        height=findViewById(R.id.height);
        output=findViewById(R.id.answer);
        res=getResources();
        b1=findViewById(R.id.again1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
        b2=findViewById(R.id.again2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,Main3Activity.class);
                startActivity(intent);
            }
        });

    }

    public void calcAreaClick(View view){
        double h = 0;
        double w = 0;
        double ans = 0;

        try {
              h = Double.parseDouble(height.getText().toString());
              w = Double.parseDouble(weight.getText().toString());
            }


        catch (Exception ex)
        {
           output.setText(res.getString(R.string.error));
           return;
        }


        ans = w/h;

        output.setText(ans + "kg/m^2");
        if(ans>=21)
        {
            Toast.makeText(this, "Go to Reduce your weight", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Increase your weight", Toast.LENGTH_SHORT).show();
        }

    }
}

package com.example.y.hideshow;

import android.support.v4.print.PrintHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mbutton;
    private TextView mtextview;
    private boolean mvisible = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbutton = (Button) findViewById(R.id.button);
        mtextview = (TextView) findViewById(R.id.textview);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mvisible) {
                    mtextview.setVisibility(View.INVISIBLE);
                    mvisible = false;
                    mbutton.setText("Show");
                }
                else{
                    mtextview.setVisibility(View.VISIBLE);
                    mvisible = true;
                    mbutton.setText("Hide");


                }
            }
        });

    }
}

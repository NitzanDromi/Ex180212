package com.example.user.ex180212;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    LinearLayout bg;
    ToggleButton ry;
    Switch gb;
    Random rnd=new Random ();
    int n;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bg=(LinearLayout)findViewById(R.id.bkgn);
        ry=(ToggleButton) findViewById(R.id.toggleButton2);
        gb=(Switch) findViewById(R.id.switch2);
    }

    /*public void redyellow(View view) {
        if (ry.isChecked())
            bg.setBackgroundColor(Color.RED);
        else
            bg.setBackgroundColor(Color.YELLOW);

    }

    public void greenblue(View view) {
        if (gb.isChecked())
            bg.setBackgroundColor(Color.GREEN);
        else
            bg.setBackgroundColor(Color.BLUE);
    }*/

    public void change(View view) {
        if ((gb.isChecked())&& (!ry.isChecked()))
            bg.setBackgroundColor(Color.GREEN);
        else {
            if ((ry.isChecked()) && (!gb.isChecked()))
                bg.setBackgroundColor(Color.BLUE);
            else {
                if ((ry.isChecked() && (gb.isChecked())))
                    bg.setBackgroundColor(Color.YELLOW);
                else {
                    if ((!gb.isChecked()) && (!ry.isChecked()))
                        bg.setBackgroundColor(Color.RED);
                }
            }
        }

    }
}

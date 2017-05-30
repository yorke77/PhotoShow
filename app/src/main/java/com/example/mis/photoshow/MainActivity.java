package com.example.mis.photoshow;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView;
    private boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!flag) {
                    //粗体
                    textView.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
                    //阴影(半径，x，y，color)
                    textView.setShadowLayer(1F, 20F, -20F, Color.GRAY);
                    flag = true;
                } else {
                    textView.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
                    textView.setShadowLayer(0F, 0F, 0F, Color.BLACK);
                    flag = false;
                }
            }
        });

        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!flag) {
                    imageView.setImageResource(R.drawable.s_128px);
                    flag = true;
                } else {
                    imageView.setImageResource(R.drawable.s_64px);
                    flag = false;
                }
            }
        });
    }
}

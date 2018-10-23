package com.cmy.www.trybutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                Toast.makeText(getApplicationContext(), "Click1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(getApplicationContext(), "Click2", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void onclickwidget(View view) {
        Toast.makeText(getApplicationContext(), "Click1", Toast.LENGTH_SHORT).show();
    }

    public void onclickwidget2(View view) {
        Toast.makeText(getApplicationContext(), "Click2", Toast.LENGTH_SHORT).show();
    }

    //public void onclickwidget(View view){
//      Toast.makeText(view.getContext(), "Alert", Toast.LENGTH_SHORT).show();
//}
}
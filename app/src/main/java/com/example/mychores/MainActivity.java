package com.example.mychores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView textView_Wishes;
    TextView textView_Scroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_Wishes = (TextView)findViewById(R.id.textView_Wishes);
        textView_Scroll = (TextView)findViewById(R.id.textView_Scroll);
        textView_Scroll.setSelected(true);


        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss a");
        String formattedDate = df.format(c.getTime());

        if (formattedDate.contains("AM")) {
            textView_Wishes.setText("Good Morning");
        } else {
            textView_Wishes.setText("Good Afternoon");
        }    }


    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);

    }

    public void goto1(View view ){
        Toast.makeText(this,"Opening the newspaper tab ", Toast.LENGTH_LONG).show();
        goToUrl ("https://newspapertoday.xyz/epaper/the-hindu-pdf/");

    }

    public void goto2(View view ){
        Toast.makeText(this,"Opening the  current affairs tab", Toast.LENGTH_LONG ).show();
        goToUrl ("https://www.jagranjosh.com/current-affairs");

    }



    public void goto3(View view ) {
        Toast.makeText(this,"Android developer guides", Toast.LENGTH_LONG ).show();
        goToUrl("https://developer.android.com/studio/intro");

    }




}


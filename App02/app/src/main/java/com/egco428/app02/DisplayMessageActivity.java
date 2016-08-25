package com.egco428.app02;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Bundle intentData = getIntent().getExtras();
        if(intentData==null){
            return;
        }
        String message = intentData.getString(MainActivity.EXTRA_MESSAGE);
        int mess = Integer.parseInt(message);
        TextView showMessage = (TextView)findViewById(R.id.showMsgText);
        ImageView pic = (ImageView)findViewById(R.id.imageView3);
        if(mess%2==0) {
            showMessage.setText(message);
            showMessage.setTextColor(Color.RED);
            pic.setImageResource(R.drawable.pen);

        }
        else{
            showMessage.setText(message);
            showMessage.setTextColor(Color.BLUE);
            pic.setImageResource(R.drawable.cin);
        }

    }
}

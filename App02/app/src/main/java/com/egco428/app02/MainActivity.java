package com.egco428.app02;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "Message";
    boolean color;
    ImageView logoImage;
    Button propertyButton;
    TextView showtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        color=true;
        showtxt = (TextView)findViewById(R.id.showText);
        propertyButton = (Button)findViewById(R.id.propBtn);
        logoImage = (ImageView)findViewById(R.id.imageView);
        propertyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(color){
                    logoImage.setImageResource(R.drawable.cin);
                    showtxt.setTextColor(Color.BLUE);
                    color=false;
                }
                else{
                    logoImage.setImageResource(R.drawable.pen);
                    showtxt.setTextColor(Color.GREEN);
                    color=true;
                }
            }
        });
    }
    public void sendMethod(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        final EditText messageText = (EditText)findViewById(R.id.MessageText);
        String message = messageText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
        finish();
    }
}

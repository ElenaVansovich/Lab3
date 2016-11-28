package com.mypackage.lab3_4;

import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private Button frameButton;
    private Button transformButton;
    private Button myButton;
    private Button cancelButton;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameButton = (Button) findViewById(R.id.frameAnimationButton);
        transformButton  =(Button) findViewById(R.id.transformAnimationButton);
        myButton = (Button) findViewById(R.id.myAnimationButton);
        cancelButton = (Button) findViewById(R.id.cancelAnimationButton);
        imageView = (ImageView) findViewById(R.id.imageView);

        frameButton.setOnClickListener(this);
        transformButton.setOnClickListener(this);
        myButton.setOnClickListener(this);
        cancelButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if(frameButton.equals(v)) {
            imageView.setBackgroundResource(R.drawable.frame_anim);
            AnimationDrawable anim = (AnimationDrawable) imageView.getBackground();
            anim.start();
        }
        else if(transformButton.equals(v)) {
            imageView.setBackgroundResource(R.mipmap.ic_launcher);
            Animation transformAnimation = AnimationUtils.loadAnimation(this, R.anim.transform_anim);
            imageView.startAnimation(transformAnimation);
        }
        else if(myButton.equals(v)) {
            imageView.setBackgroundResource(R.mipmap.ic_launcher);
            Animation myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha);
            imageView.startAnimation(myFadeInAnimation);
        }
        else if(cancelButton.equals(v)) {
            imageView.setBackgroundColor(Color.BLACK);
        }
    }
}

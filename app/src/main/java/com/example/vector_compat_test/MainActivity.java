package com.example.vector_compat_test;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.wnafee.vector.compat.ResourcesCompat;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Drawable drawable = ResourcesCompat.getDrawable(this, R.drawable.circle_fade);

        ImageView circleView = (ImageView) findViewById(R.id.circle);
        circleView.setImageDrawable(drawable);

        circleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                } else {
                    Log.d(TAG, "!(drawable instanceof Animatable)");
                }
            }
        });
    }

}

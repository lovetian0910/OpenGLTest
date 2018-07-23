package com.kuang.opengltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TriangleView mTriangleView;
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTriangleView = (TriangleView) super.findViewById(R.id.triangle_view);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mTriangleView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mTriangleView.onPause();
    }
}

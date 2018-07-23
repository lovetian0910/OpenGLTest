package com.kuang.opengltest;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class TriangleView extends GLSurfaceView {
    public TriangleView(Context context) {
        super(context);
        init();
    }

    public TriangleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init(){
        setEGLConfigChooser(8, 8, 8, 0, 16, 0);
        setEGLContextClientVersion(3);
        setRenderer(new TriangleRender());
    }
    class TriangleRender implements GLSurfaceView.Renderer{

        @Override
        public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {
            OpenGLTestLib.init();
        }

        @Override
        public void onSurfaceChanged(GL10 gl10, int i, int i1) {
            OpenGLTestLib.resize(i, i1);
        }

        @Override
        public void onDrawFrame(GL10 gl10) {
            OpenGLTestLib.step();
        }
    }
}

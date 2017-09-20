package com.application.admin.mycameraapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by admin on 2017/9/20.
 */

public class SquareCameraContainer extends FrameLayout implements ICameraOperation, IActivityLifiCycle {
    public SquareCameraContainer(@NonNull Context context) {
        super(context);
    }

    public SquareCameraContainer(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public boolean takePicture() {
        return false;
    }

    @Override
    public void releaseCamera() {

    }
}

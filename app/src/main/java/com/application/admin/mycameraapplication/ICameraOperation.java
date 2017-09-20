package com.application.admin.mycameraapplication;

/**
 * Created by admin on 2017/9/20.
 */

interface ICameraOperation {
    /**
     *  拍照
     */
    boolean takePicture();
    /**
     * 释放相机
     *
     */
    void releaseCamera();
}

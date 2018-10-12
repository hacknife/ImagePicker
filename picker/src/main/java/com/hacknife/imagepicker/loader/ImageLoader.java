package com.hacknife.imagepicker.loader;

import android.app.Activity;
import android.os.Parcelable;
import android.widget.ImageView;

/**
 * author  : Hacknife
 * e-mail  : 4884280@qq.com
 * github  : http://github.com/hacknife
 * project : ImagePicker
 */
public interface ImageLoader extends Parcelable {

    void displayImage(Activity activity, String path, ImageView imageView, int width, int height);

    void displayImagePreview(Activity activity, String path, ImageView imageView, int width, int height);

    void displayImage(String path, ImageView imageView);

    void clearMemoryCache();


}
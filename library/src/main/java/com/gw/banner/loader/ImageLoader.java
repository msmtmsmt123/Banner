package com.gw.banner.loader;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by GongWen on 17/11/9.
 */

public abstract class ImageLoader implements ViewLoaderInterface<Integer, ImageView> {
    @Override
    public ImageView createView(Context context) {
        ImageView imageView = new ImageView(context);
        return imageView;
    }
}
package com.swt.zxingdemo;

/**
 * Created by huangzhao on 2016/12/22.
 */

public class CommonUtils {
    /**
     * 计算相对应的长度
     *
     * @param dip
     * @return float
     */
    public static int convertDip2Pixel(int dip) {
        final float scale = MyApplication.getInstance().getApplicationContext().getResources().getDisplayMetrics().density;
        int pixel = (int) (dip * scale + 0.5f);
        return pixel;
    }
}

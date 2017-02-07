package com.nvt2896.toastcolorsample;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by nvt2896 on 07/02/2017.
 */

public class ToastColor {

    private static final int MSG_COLOR_DEFAULT = Color.WHITE;
    private static final int BG_COLOR_DEFAULT = Color.parseColor("#616161");
    private static final int BG_COLOR_SUCCESS = Color.parseColor("#4CAF50");
    private static final int BG_COLOR_ERROR  = Color.parseColor("#FF5252");
    private static final int BG_COLOR_DEBUG = Color.parseColor("#FFC107");
    private static final int BG_COLOR_INFO = Color.parseColor("#3F51B5");
    private static final int BG_COLOR_WARN = Color.parseColor("#FF5722");
    private static final int BG_COLOR_ASSERT = Color.parseColor("#673AB7");

    public static final int LENGTH_SHORT = Toast.LENGTH_SHORT;
    public static final int LENGTH_LONG = Toast.LENGTH_LONG;


    public static Toast normal (@NonNull Context context, @NonNull String message, int duration) {
        return custom(context,message,duration,MSG_COLOR_DEFAULT,false,null,BG_COLOR_DEFAULT,true);
    }
    public static Toast normal (@NonNull Context context, @NonNull String message, int duration, Drawable icon) {
        return custom(context,message,duration,MSG_COLOR_DEFAULT,true,icon,BG_COLOR_DEFAULT,true);
    }

    public static Toast normal (@NonNull Context context, @NonNull String message, int duration, Drawable icon, boolean withIcon) {
        return custom(context, message, duration, MSG_COLOR_DEFAULT, withIcon, icon,BG_COLOR_DEFAULT,true);
    }
    public static Toast normal (@NonNull Context context, @NonNull String message, int duration, boolean withIcon, Drawable icon, int msgColor) {
        return custom(context,message,duration,msgColor,withIcon,icon,BG_COLOR_DEFAULT,true);
    }

    public static Toast success (@NonNull Context context, @NonNull String message, int duration) {
        return custom(context,message,duration,MSG_COLOR_DEFAULT,true,ResourcesCompat.getDrawable(context.getResources(),R.drawable.ic_done_white_48dp,null),BG_COLOR_SUCCESS,true);
    }
    public static Toast success (@NonNull Context context, @NonNull String message, int duration, Drawable icon) {
        return custom(context,message,duration,MSG_COLOR_DEFAULT,true,icon,BG_COLOR_SUCCESS,true);
    }

    public static Toast success (@NonNull Context context, @NonNull String message, int duration, boolean withIcon, Drawable icon) {
        return custom(context, message, duration, MSG_COLOR_DEFAULT, withIcon, icon,BG_COLOR_SUCCESS,true);
    }
    public static Toast success (@NonNull Context context, @NonNull String message, int duration, boolean withIcon, Drawable icon, int msgColor) {
        return custom(context,message,duration,msgColor,withIcon,icon,BG_COLOR_SUCCESS,true);
    }

    public static Toast error (@NonNull Context context, @NonNull String message, int duration) {
        return custom(context,message,duration,MSG_COLOR_DEFAULT,true,ResourcesCompat.getDrawable(context.getResources(),R.drawable.ic_close_white_48dp,null),BG_COLOR_ERROR,true);
    }
    public static Toast error (@NonNull Context context, @NonNull String message, int duration, Drawable icon) {
        return custom(context,message,duration,MSG_COLOR_DEFAULT,true,icon,BG_COLOR_ERROR,true);
    }

    public static Toast error (@NonNull Context context, @NonNull String message, int duration, boolean withIcon, Drawable icon) {
        return custom(context, message, duration, MSG_COLOR_DEFAULT, withIcon, icon,BG_COLOR_ERROR,true);
    }
    public static Toast error (@NonNull Context context, @NonNull String message, int duration, boolean withIcon, Drawable icon, int msgColor) {
        return custom(context,message,duration,msgColor,withIcon,icon,BG_COLOR_ERROR,true);
    }

    public static Toast debug (@NonNull Context context, @NonNull String message, int duration) {
        return custom(context,message,duration,MSG_COLOR_DEFAULT,true,ResourcesCompat.getDrawable(context.getResources(),R.drawable.ic_bug_report_white_48dp,null),BG_COLOR_DEBUG,true);
    }
    public static Toast debug (@NonNull Context context, @NonNull String message, int duration, Drawable icon) {
        return custom(context,message,duration,MSG_COLOR_DEFAULT,true,icon,BG_COLOR_DEBUG,true);
    }

    public static Toast debug (@NonNull Context context, @NonNull String message, int duration, boolean withIcon, Drawable icon) {
        return custom(context, message, duration, MSG_COLOR_DEFAULT, withIcon, icon,BG_COLOR_DEBUG,true);
    }
    public static Toast debug (@NonNull Context context, @NonNull String message, int duration, boolean withIcon, Drawable icon, int msgColor) {
        return custom(context,message,duration,msgColor,withIcon,icon,BG_COLOR_DEBUG,true);
    }

    public static Toast info (@NonNull Context context, @NonNull String message, int duration) {
        return custom(context,message,duration,MSG_COLOR_DEFAULT,true,ResourcesCompat.getDrawable(context.getResources(),R.drawable.ic_error_white_48dp,null),BG_COLOR_INFO,true);
    }
    public static Toast info (@NonNull Context context, @NonNull String message, int duration, Drawable icon) {
        return custom(context,message,duration,MSG_COLOR_DEFAULT,true,icon,BG_COLOR_INFO,true);
    }

    public static Toast info (@NonNull Context context, @NonNull String message, int duration, boolean withIcon, Drawable icon) {
        return custom(context, message, duration, MSG_COLOR_DEFAULT, withIcon, icon,BG_COLOR_INFO,true);
    }
    public static Toast info (@NonNull Context context, @NonNull String message, int duration, boolean withIcon, Drawable icon, int msgColor) {
        return custom(context,message,duration,msgColor,withIcon,icon,BG_COLOR_INFO,true);
    }

    public static Toast warn (@NonNull Context context, @NonNull String message, int duration) {
        return custom(context,message,duration,MSG_COLOR_DEFAULT,true,ResourcesCompat.getDrawable(context.getResources(),R.drawable.ic_warning_white_48dp,null),BG_COLOR_WARN,true);
    }
    public static Toast warn (@NonNull Context context, @NonNull String message, int duration, Drawable icon) {
        return custom(context,message,duration,MSG_COLOR_DEFAULT,true,icon,BG_COLOR_WARN,true);
    }

    public static Toast warn (@NonNull Context context, @NonNull String message, int duration, boolean withIcon, Drawable icon) {
        return custom(context, message, duration, MSG_COLOR_DEFAULT, withIcon, icon,BG_COLOR_WARN,true);
    }
    public static Toast warn (@NonNull Context context, @NonNull String message, int duration, boolean withIcon, Drawable icon, int msgColor) {
        return custom(context,message,duration,msgColor,withIcon,icon,BG_COLOR_WARN,true);
    }
    public static Toast confirm (@NonNull Context context, @NonNull String message, int duration) {
        return custom(context,message,duration,MSG_COLOR_DEFAULT,true,ResourcesCompat.getDrawable(context.getResources(),R.drawable.ic_beenhere_white_48dp,null),BG_COLOR_ASSERT,true);
    }
    public static Toast confirm (@NonNull Context context, @NonNull String message, int duration, Drawable icon) {
        return custom(context,message,duration,MSG_COLOR_DEFAULT,true,icon,BG_COLOR_ASSERT,true);
    }
    public static Toast confirm (@NonNull Context context, @NonNull String message, int duration, boolean withIcon, Drawable icon) {
        return custom(context, message, duration, MSG_COLOR_DEFAULT, withIcon, icon,BG_COLOR_ASSERT,true);
    }
    public static Toast confirm (@NonNull Context context, @NonNull String message, int duration, boolean withIcon, Drawable icon, int msgColor) {
        return custom(context,message,duration,msgColor,withIcon,icon,BG_COLOR_ASSERT,true);
    }
    public static Toast custom (@NonNull Context context, @NonNull String message, int duration, @ColorInt int msgColor, boolean withIcon, Drawable icon, @ColorInt int tintColor, boolean shouldTint) {
        final Toast currentToast = new Toast(context);
        final View customToast = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.layout_toast, null);
        final ImageView iconToast = (ImageView) customToast.findViewById(R.id.toast_icon);
        final TextView msgToast = (TextView) customToast.findViewById(R.id.toast_message);

        Drawable drawableFrame;

        if (shouldTint)
            drawableFrame = ToastColorUtils.tint9PatchDrawableFrame(context, tintColor);
        else
            drawableFrame = ToastColorUtils.getDrawable(context, R.drawable.toast_frame);
        ToastColorUtils.setBackground(customToast, drawableFrame);

        if (withIcon) {
            if (icon == null)
                throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
            ToastColorUtils.setBackground(iconToast, icon);
            iconToast.setVisibility(View.VISIBLE);
        } else {
            iconToast.setVisibility(View.GONE);
        }
        msgToast.setText(message);
        msgToast.setTextColor(msgColor);
        currentToast.setView(customToast);
        currentToast.setDuration(duration);
        return currentToast;

    }
}

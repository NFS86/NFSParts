package com.needforspeed.parts.preferences;

import android.content.Context;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class VibrationSeekBarPreferenceBottom extends SecureSettingSeekBarPreferenceBottom {

    private final Vibrator mVibrator;

    private static final long testVibrationPattern[] = {0,250};

    public VibrationSeekBarPreferenceBottom(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mVibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
    }

    public VibrationSeekBarPreferenceBottom(Context context, AttributeSet attrs) {
        super(context, attrs);
        mVibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
    }

    public VibrationSeekBarPreferenceBottom(Context context) {
        super(context, null);
        mVibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
    }

    private void saveValue(String newValue) {
        mVibrator.vibrate(testVibrationPattern, -1);
    }

    @Override
    protected void changeValue(int newValue) {
        saveValue(String.valueOf(newValue));
    }
}
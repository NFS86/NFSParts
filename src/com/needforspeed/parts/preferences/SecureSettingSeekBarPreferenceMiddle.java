package com.needforspeed.parts.preferences;

import android.content.Context;
import android.util.AttributeSet;

public class SecureSettingSeekBarPreferenceMiddle extends CustomSeekBarPreferenceMiddle {

    public SecureSettingSeekBarPreferenceMiddle(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setPreferenceDataStore(new SecureSettingsStore(context.getContentResolver()));
    }

    public SecureSettingSeekBarPreferenceMiddle(Context context, AttributeSet attrs) {
        super(context, attrs);
        setPreferenceDataStore(new SecureSettingsStore(context.getContentResolver()));
    }

    public SecureSettingSeekBarPreferenceMiddle(Context context) {
        super(context, null);
        setPreferenceDataStore(new SecureSettingsStore(context.getContentResolver()));
    }
}
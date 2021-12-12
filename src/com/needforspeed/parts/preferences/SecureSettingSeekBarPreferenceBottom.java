package com.needforspeed.parts.preferences;

import android.content.Context;
import android.util.AttributeSet;

public class SecureSettingSeekBarPreferenceBottom extends CustomSeekBarPreferenceBottom {

    public SecureSettingSeekBarPreferenceBottom(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setPreferenceDataStore(new SecureSettingsStore(context.getContentResolver()));
    }

    public SecureSettingSeekBarPreferenceBottom(Context context, AttributeSet attrs) {
        super(context, attrs);
        setPreferenceDataStore(new SecureSettingsStore(context.getContentResolver()));
    }

    public SecureSettingSeekBarPreferenceBottom(Context context) {
        super(context, null);
        setPreferenceDataStore(new SecureSettingsStore(context.getContentResolver()));
    }
}
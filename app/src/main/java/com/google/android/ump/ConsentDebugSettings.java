package com.google.android.ump;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public final class ConsentDebugSettings {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
    }
}

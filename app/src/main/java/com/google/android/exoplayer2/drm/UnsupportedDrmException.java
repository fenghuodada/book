package com.google.android.exoplayer2.drm;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class UnsupportedDrmException extends Exception {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Reason {
    }

    public UnsupportedDrmException() {
    }

    public UnsupportedDrmException(Exception exc) {
        super(exc);
    }
}

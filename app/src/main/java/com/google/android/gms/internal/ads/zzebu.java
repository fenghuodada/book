package com.google.android.gms.internal.ads;

import com.google.firebase.ktx.BuildConfig;

/* loaded from: classes.dex */
public enum zzebu {
    BEGIN_TO_RENDER("beginToRender"),
    DEFINED_BY_JAVASCRIPT("definedByJavascript"),
    ONE_PIXEL("onePixel"),
    UNSPECIFIED(BuildConfig.VERSION_NAME);
    
    private final String zzf;

    zzebu(String str) {
        this.zzf = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzf;
    }
}

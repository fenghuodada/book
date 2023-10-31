package com.google.android.exoplayer2.text.webvtt;

import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class WebvttCssStyle {
    @ColorInt

    /* renamed from: f */
    public int f13314f;

    /* renamed from: h */
    public int f13316h;

    /* renamed from: o */
    public float f13323o;

    /* renamed from: a */
    public String f13309a = "";

    /* renamed from: b */
    public String f13310b = "";

    /* renamed from: c */
    public Set<String> f13311c = Collections.emptySet();

    /* renamed from: d */
    public String f13312d = "";
    @Nullable

    /* renamed from: e */
    public String f13313e = null;

    /* renamed from: g */
    public boolean f13315g = false;

    /* renamed from: i */
    public boolean f13317i = false;

    /* renamed from: j */
    public final int f13318j = -1;

    /* renamed from: k */
    public int f13319k = -1;

    /* renamed from: l */
    public int f13320l = -1;

    /* renamed from: m */
    public int f13321m = -1;

    /* renamed from: n */
    public int f13322n = -1;

    /* renamed from: p */
    public int f13324p = -1;

    /* renamed from: q */
    public boolean f13325q = false;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface FontSizeUnit {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface StyleFlags {
    }

    /* renamed from: a */
    public static int m5300a(int i, int i2, String str, @Nullable String str2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}

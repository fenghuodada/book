package com.google.android.exoplayer2.p038ui;

import android.graphics.Typeface;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.google.android.exoplayer2.ui.CaptionStyleCompat */
/* loaded from: classes.dex */
public final class CaptionStyleCompat {

    /* renamed from: g */
    public static final CaptionStyleCompat f13502g = new CaptionStyleCompat(-1, -16777216, 0, 0, -1, null);

    /* renamed from: a */
    public final int f13503a;

    /* renamed from: b */
    public final int f13504b;

    /* renamed from: c */
    public final int f13505c;

    /* renamed from: d */
    public final int f13506d;

    /* renamed from: e */
    public final int f13507e;
    @Nullable

    /* renamed from: f */
    public final Typeface f13508f;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.ui.CaptionStyleCompat$EdgeType */
    /* loaded from: classes.dex */
    public @interface EdgeType {
    }

    public CaptionStyleCompat(int i, int i2, int i3, int i4, int i5, @Nullable Typeface typeface) {
        this.f13503a = i;
        this.f13504b = i2;
        this.f13505c = i3;
        this.f13506d = i4;
        this.f13507e = i5;
        this.f13508f = typeface;
    }
}

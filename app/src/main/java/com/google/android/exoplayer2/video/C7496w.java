package com.google.android.exoplayer2.video;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;

/* renamed from: com.google.android.exoplayer2.video.w */
/* loaded from: classes.dex */
public final class C7496w {

    /* renamed from: e */
    public static final C7496w f14218e = new C7496w(0, 0, 0, 1.0f);
    @IntRange(from = 0)

    /* renamed from: a */
    public final int f14219a;
    @IntRange(from = 0)

    /* renamed from: b */
    public final int f14220b;
    @IntRange(from = 0, m13044to = 359)

    /* renamed from: c */
    public final int f14221c;
    @FloatRange(from = 0.0d, fromInclusive = false)

    /* renamed from: d */
    public final float f14222d;

    public C7496w(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0, m13044to = 359) int i3, @FloatRange(from = 0.0d, fromInclusive = false) float f) {
        this.f14219a = i;
        this.f14220b = i2;
        this.f14221c = i3;
        this.f14222d = f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7496w) {
            C7496w c7496w = (C7496w) obj;
            return this.f14219a == c7496w.f14219a && this.f14220b == c7496w.f14220b && this.f14221c == c7496w.f14221c && this.f14222d == c7496w.f14222d;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f14222d) + ((((((217 + this.f14219a) * 31) + this.f14220b) * 31) + this.f14221c) * 31);
    }
}

package com.google.android.exoplayer2.decoder;

/* renamed from: com.google.android.exoplayer2.decoder.a */
/* loaded from: classes.dex */
public abstract class AbstractC6742a {

    /* renamed from: a */
    public int f10915a;

    /* renamed from: f */
    public final boolean m6018f(int i) {
        return (this.f10915a & i) == i;
    }

    /* renamed from: g */
    public final boolean m6017g() {
        return m6018f(Integer.MIN_VALUE);
    }
}

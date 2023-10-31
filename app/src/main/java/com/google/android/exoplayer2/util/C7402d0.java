package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.util.d0 */
/* loaded from: classes.dex */
public final class C7402d0<V> {

    /* renamed from: a */
    public long[] f13892a = new long[10];

    /* renamed from: b */
    public V[] f13893b = (V[]) new Object[10];

    /* renamed from: c */
    public int f13894c;

    /* renamed from: d */
    public int f13895d;

    /* renamed from: a */
    public final synchronized void m5118a(long j, V v) {
        int i = this.f13895d;
        if (i > 0) {
            if (j <= this.f13892a[((this.f13894c + i) - 1) % this.f13893b.length]) {
                m5117b();
            }
        }
        m5116c();
        int i2 = this.f13894c;
        int i3 = this.f13895d;
        V[] vArr = this.f13893b;
        int length = (i2 + i3) % vArr.length;
        this.f13892a[length] = j;
        vArr[length] = v;
        this.f13895d = i3 + 1;
    }

    /* renamed from: b */
    public final synchronized void m5117b() {
        this.f13894c = 0;
        this.f13895d = 0;
        Arrays.fill(this.f13893b, (Object) null);
    }

    /* renamed from: c */
    public final void m5116c() {
        int length = this.f13893b.length;
        if (this.f13895d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) new Object[i];
        int i2 = this.f13894c;
        int i3 = length - i2;
        System.arraycopy(this.f13892a, i2, jArr, 0, i3);
        System.arraycopy(this.f13893b, this.f13894c, vArr, 0, i3);
        int i4 = this.f13894c;
        if (i4 > 0) {
            System.arraycopy(this.f13892a, 0, jArr, i3, i4);
            System.arraycopy(this.f13893b, 0, vArr, i3, this.f13894c);
        }
        this.f13892a = jArr;
        this.f13893b = vArr;
        this.f13894c = 0;
    }

    @Nullable
    /* renamed from: d */
    public final V m5115d(long j, boolean z) {
        V v = null;
        long j2 = Long.MAX_VALUE;
        while (this.f13895d > 0) {
            long j3 = j - this.f13892a[this.f13894c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            v = m5113f();
            j2 = j3;
        }
        return v;
    }

    @Nullable
    /* renamed from: e */
    public final synchronized V m5114e(long j) {
        return m5115d(j, true);
    }

    @Nullable
    /* renamed from: f */
    public final V m5113f() {
        C7394a.m5131d(this.f13895d > 0);
        V[] vArr = this.f13893b;
        int i = this.f13894c;
        V v = vArr[i];
        vArr[i] = null;
        this.f13894c = (i + 1) % vArr.length;
        this.f13895d--;
        return v;
    }
}

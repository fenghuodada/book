package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.extractor.mp4.k */
/* loaded from: classes.dex */
public final class C6883k {

    /* renamed from: a */
    public final Track f11526a;

    /* renamed from: b */
    public final int f11527b;

    /* renamed from: c */
    public final long[] f11528c;

    /* renamed from: d */
    public final int[] f11529d;

    /* renamed from: e */
    public final int f11530e;

    /* renamed from: f */
    public final long[] f11531f;

    /* renamed from: g */
    public final int[] f11532g;

    /* renamed from: h */
    public final long f11533h;

    public C6883k(Track track, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        C7394a.m5134a(iArr.length == jArr2.length);
        C7394a.m5134a(jArr.length == jArr2.length);
        C7394a.m5134a(iArr2.length == jArr2.length);
        this.f11526a = track;
        this.f11528c = jArr;
        this.f11529d = iArr;
        this.f11530e = i;
        this.f11531f = jArr2;
        this.f11532g = iArr2;
        this.f11533h = j;
        this.f11527b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public final int m5868a(long j) {
        long[] jArr = this.f11531f;
        for (int m5104b = C7408g0.m5104b(jArr, j, true); m5104b < jArr.length; m5104b++) {
            if ((this.f11532g[m5104b] & 1) != 0) {
                return m5104b;
            }
        }
        return -1;
    }
}

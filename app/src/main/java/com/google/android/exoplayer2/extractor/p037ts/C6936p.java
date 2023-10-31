package com.google.android.exoplayer2.extractor.p037ts;

import com.google.android.exoplayer2.util.C7394a;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.ts.p */
/* loaded from: classes.dex */
public final class C6936p {

    /* renamed from: a */
    public final int f11905a;

    /* renamed from: b */
    public boolean f11906b;

    /* renamed from: c */
    public boolean f11907c;

    /* renamed from: d */
    public byte[] f11908d;

    /* renamed from: e */
    public int f11909e;

    public C6936p(int i) {
        this.f11905a = i;
        byte[] bArr = new byte[131];
        this.f11908d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public final void m5830a(int i, byte[] bArr, int i2) {
        if (this.f11906b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f11908d;
            int length = bArr2.length;
            int i4 = this.f11909e;
            if (length < i4 + i3) {
                this.f11908d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f11908d, this.f11909e, i3);
            this.f11909e += i3;
        }
    }

    /* renamed from: b */
    public final boolean m5829b(int i) {
        if (this.f11906b) {
            this.f11909e -= i;
            this.f11906b = false;
            this.f11907c = true;
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void m5828c() {
        this.f11906b = false;
        this.f11907c = false;
    }

    /* renamed from: d */
    public final void m5827d(int i) {
        C7394a.m5131d(!this.f11906b);
        boolean z = i == this.f11905a;
        this.f11906b = z;
        if (z) {
            this.f11909e = 3;
            this.f11907c = false;
        }
    }
}

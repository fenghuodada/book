package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.C7408g0;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.upstream.l */
/* loaded from: classes.dex */
public final class C7367l {

    /* renamed from: d */
    public int f13780d;

    /* renamed from: e */
    public int f13781e;

    /* renamed from: a */
    public final boolean f13777a = true;

    /* renamed from: b */
    public final int f13778b = 65536;

    /* renamed from: f */
    public int f13782f = 0;

    /* renamed from: g */
    public C7344a[] f13783g = new C7344a[100];

    /* renamed from: c */
    public final C7344a[] f13779c = new C7344a[1];

    /* renamed from: a */
    public final synchronized void m5171a(C7344a[] c7344aArr) {
        int i = this.f13782f;
        int length = c7344aArr.length + i;
        C7344a[] c7344aArr2 = this.f13783g;
        if (length >= c7344aArr2.length) {
            this.f13783g = (C7344a[]) Arrays.copyOf(c7344aArr2, Math.max(c7344aArr2.length * 2, i + c7344aArr.length));
        }
        for (C7344a c7344a : c7344aArr) {
            C7344a[] c7344aArr3 = this.f13783g;
            int i2 = this.f13782f;
            this.f13782f = i2 + 1;
            c7344aArr3[i2] = c7344a;
        }
        this.f13781e -= c7344aArr.length;
        notifyAll();
    }

    /* renamed from: b */
    public final synchronized void m5170b(int i) {
        boolean z = i < this.f13780d;
        this.f13780d = i;
        if (z) {
            m5169c();
        }
    }

    /* renamed from: c */
    public final synchronized void m5169c() {
        int i = this.f13780d;
        int i2 = this.f13778b;
        int i3 = C7408g0.f13905a;
        int max = Math.max(0, (((i + i2) - 1) / i2) - this.f13781e);
        int i4 = this.f13782f;
        if (max >= i4) {
            return;
        }
        Arrays.fill(this.f13783g, max, i4, (Object) null);
        this.f13782f = max;
    }
}

package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.InterfaceC7188p;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.s0 */
/* loaded from: classes.dex */
public final class C7137s0 {

    /* renamed from: a */
    public final InterfaceC7188p.C7189a f12689a;

    /* renamed from: b */
    public final long f12690b;

    /* renamed from: c */
    public final long f12691c;

    /* renamed from: d */
    public final long f12692d;

    /* renamed from: e */
    public final long f12693e;

    /* renamed from: f */
    public final boolean f12694f;

    /* renamed from: g */
    public final boolean f12695g;

    /* renamed from: h */
    public final boolean f12696h;

    /* renamed from: i */
    public final boolean f12697i;

    public C7137s0(InterfaceC7188p.C7189a c7189a, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        C7394a.m5134a(!z4 || z2);
        C7394a.m5134a(!z3 || z2);
        if (!z || (!z2 && !z3 && !z4)) {
            z5 = true;
        }
        C7394a.m5134a(z5);
        this.f12689a = c7189a;
        this.f12690b = j;
        this.f12691c = j2;
        this.f12692d = j3;
        this.f12693e = j4;
        this.f12694f = z;
        this.f12695g = z2;
        this.f12696h = z3;
        this.f12697i = z4;
    }

    /* renamed from: a */
    public final C7137s0 m5490a(long j) {
        return j == this.f12691c ? this : new C7137s0(this.f12689a, this.f12690b, j, this.f12692d, this.f12693e, this.f12694f, this.f12695g, this.f12696h, this.f12697i);
    }

    /* renamed from: b */
    public final C7137s0 m5489b(long j) {
        return j == this.f12690b ? this : new C7137s0(this.f12689a, j, this.f12691c, this.f12692d, this.f12693e, this.f12694f, this.f12695g, this.f12696h, this.f12697i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7137s0.class != obj.getClass()) {
            return false;
        }
        C7137s0 c7137s0 = (C7137s0) obj;
        return this.f12690b == c7137s0.f12690b && this.f12691c == c7137s0.f12691c && this.f12692d == c7137s0.f12692d && this.f12693e == c7137s0.f12693e && this.f12694f == c7137s0.f12694f && this.f12695g == c7137s0.f12695g && this.f12696h == c7137s0.f12696h && this.f12697i == c7137s0.f12697i && C7408g0.m5105a(this.f12689a, c7137s0.f12689a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f12689a.hashCode() + 527) * 31) + ((int) this.f12690b)) * 31) + ((int) this.f12691c)) * 31) + ((int) this.f12692d)) * 31) + ((int) this.f12693e)) * 31) + (this.f12694f ? 1 : 0)) * 31) + (this.f12695g ? 1 : 0)) * 31) + (this.f12696h ? 1 : 0)) * 31) + (this.f12697i ? 1 : 0);
    }
}

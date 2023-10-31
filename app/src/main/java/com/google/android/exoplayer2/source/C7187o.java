package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;

/* renamed from: com.google.android.exoplayer2.source.o */
/* loaded from: classes.dex */
public class C7187o {

    /* renamed from: a */
    public final Object f12928a;

    /* renamed from: b */
    public final int f12929b;

    /* renamed from: c */
    public final int f12930c;

    /* renamed from: d */
    public final long f12931d;

    /* renamed from: e */
    public final int f12932e;

    public C7187o(C7187o c7187o) {
        this.f12928a = c7187o.f12928a;
        this.f12929b = c7187o.f12929b;
        this.f12930c = c7187o.f12930c;
        this.f12931d = c7187o.f12931d;
        this.f12932e = c7187o.f12932e;
    }

    public C7187o(Object obj, int i, int i2, long j, int i3) {
        this.f12928a = obj;
        this.f12929b = i;
        this.f12930c = i2;
        this.f12931d = j;
        this.f12932e = i3;
    }

    /* renamed from: a */
    public final boolean m5394a() {
        return this.f12929b != -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7187o) {
            C7187o c7187o = (C7187o) obj;
            return this.f12928a.equals(c7187o.f12928a) && this.f12929b == c7187o.f12929b && this.f12930c == c7187o.f12930c && this.f12931d == c7187o.f12931d && this.f12932e == c7187o.f12932e;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f12928a.hashCode() + 527) * 31) + this.f12929b) * 31) + this.f12930c) * 31) + ((int) this.f12931d)) * 31) + this.f12932e;
    }
}

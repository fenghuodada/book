package com.google.android.exoplayer2.extractor;

import android.support.p000v4.media.session.C0017a;
import androidx.annotation.Nullable;

/* renamed from: com.google.android.exoplayer2.extractor.u */
/* loaded from: classes.dex */
public final class C6950u {

    /* renamed from: c */
    public static final C6950u f11974c = new C6950u(0, 0);

    /* renamed from: a */
    public final long f11975a;

    /* renamed from: b */
    public final long f11976b;

    public C6950u(long j, long j2) {
        this.f11975a = j;
        this.f11976b = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6950u.class != obj.getClass()) {
            return false;
        }
        C6950u c6950u = (C6950u) obj;
        return this.f11975a == c6950u.f11975a && this.f11976b == c6950u.f11976b;
    }

    public final int hashCode() {
        return (((int) this.f11975a) * 31) + ((int) this.f11976b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(this.f11975a);
        sb.append(", position=");
        return C0017a.m13071a(sb, this.f11976b, "]");
    }
}

package androidx.core.util;

import androidx.annotation.NonNull;

/* renamed from: androidx.core.util.d */
/* loaded from: classes.dex */
public final class C0800d<F, S> {

    /* renamed from: a */
    public final F f2500a;

    /* renamed from: b */
    public final S f2501b;

    public C0800d(F f, S s) {
        this.f2500a = f;
        this.f2501b = s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0800d)) {
            return false;
        }
        C0800d c0800d = (C0800d) obj;
        if (!C0799c.m11795a(c0800d.f2500a, this.f2500a) || !C0799c.m11795a(c0800d.f2501b, this.f2501b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        F f = this.f2500a;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f2501b;
        return (s != null ? s.hashCode() : 0) ^ hashCode;
    }

    @NonNull
    public final String toString() {
        return "Pair{" + this.f2500a + " " + this.f2501b + "}";
    }
}

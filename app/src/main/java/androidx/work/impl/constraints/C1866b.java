package androidx.work.impl.constraints;

import androidx.annotation.NonNull;

/* renamed from: androidx.work.impl.constraints.b */
/* loaded from: classes.dex */
public final class C1866b {

    /* renamed from: a */
    public final boolean f4548a;

    /* renamed from: b */
    public final boolean f4549b;

    /* renamed from: c */
    public final boolean f4550c;

    /* renamed from: d */
    public final boolean f4551d;

    public C1866b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f4548a = z;
        this.f4549b = z2;
        this.f4550c = z3;
        this.f4551d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1866b) {
            C1866b c1866b = (C1866b) obj;
            return this.f4548a == c1866b.f4548a && this.f4549b == c1866b.f4549b && this.f4550c == c1866b.f4550c && this.f4551d == c1866b.f4551d;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final int hashCode() {
        boolean z = this.f4549b;
        ?? r1 = this.f4548a;
        int i = r1;
        if (z) {
            i = r1 + 16;
        }
        int i2 = i;
        if (this.f4550c) {
            i2 = i + 256;
        }
        return this.f4551d ? i2 + 4096 : i2;
    }

    @NonNull
    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f4548a), Boolean.valueOf(this.f4549b), Boolean.valueOf(this.f4550c), Boolean.valueOf(this.f4551d));
    }
}

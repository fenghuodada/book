package androidx.core.graphics;

import android.graphics.Insets;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* renamed from: androidx.core.graphics.b */
/* loaded from: classes.dex */
public final class C0690b {
    @NonNull

    /* renamed from: e */
    public static final C0690b f2383e = new C0690b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f2384a;

    /* renamed from: b */
    public final int f2385b;

    /* renamed from: c */
    public final int f2386c;

    /* renamed from: d */
    public final int f2387d;

    @RequiresApi(29)
    /* renamed from: androidx.core.graphics.b$a */
    /* loaded from: classes.dex */
    public static class C0691a {
        @DoNotInline
        /* renamed from: a */
        public static Insets m11965a(int i, int i2, int i3, int i4) {
            Insets of;
            of = Insets.of(i, i2, i3, i4);
            return of;
        }
    }

    public C0690b(int i, int i2, int i3, int i4) {
        this.f2384a = i;
        this.f2385b = i2;
        this.f2386c = i3;
        this.f2387d = i4;
    }

    @NonNull
    /* renamed from: a */
    public static C0690b m11969a(@NonNull C0690b c0690b, @NonNull C0690b c0690b2) {
        return m11968b(Math.max(c0690b.f2384a, c0690b2.f2384a), Math.max(c0690b.f2385b, c0690b2.f2385b), Math.max(c0690b.f2386c, c0690b2.f2386c), Math.max(c0690b.f2387d, c0690b2.f2387d));
    }

    @NonNull
    /* renamed from: b */
    public static C0690b m11968b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f2383e : new C0690b(i, i2, i3, i4);
    }

    @NonNull
    @RequiresApi(api = 29)
    /* renamed from: c */
    public static C0690b m11967c(@NonNull Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return m11968b(i, i2, i3, i4);
    }

    @NonNull
    @RequiresApi(29)
    /* renamed from: d */
    public final Insets m11966d() {
        return C0691a.m11965a(this.f2384a, this.f2385b, this.f2386c, this.f2387d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0690b.class != obj.getClass()) {
            return false;
        }
        C0690b c0690b = (C0690b) obj;
        return this.f2387d == c0690b.f2387d && this.f2384a == c0690b.f2384a && this.f2386c == c0690b.f2386c && this.f2385b == c0690b.f2385b;
    }

    public final int hashCode() {
        return (((((this.f2384a * 31) + this.f2385b) * 31) + this.f2386c) * 31) + this.f2387d;
    }

    @NonNull
    public final String toString() {
        return "Insets{left=" + this.f2384a + ", top=" + this.f2385b + ", right=" + this.f2386c + ", bottom=" + this.f2387d + '}';
    }
}

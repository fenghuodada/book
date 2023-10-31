package kotlin;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.1")
/* renamed from: kotlin.f */
/* loaded from: classes3.dex */
public final class C10793f implements Comparable<C10793f> {
    @JvmField
    @NotNull

    /* renamed from: e */
    public static final C10793f f21386e = new C10793f();

    /* renamed from: a */
    public final int f21387a = 1;

    /* renamed from: b */
    public final int f21388b = 8;

    /* renamed from: c */
    public final int f21389c = 20;

    /* renamed from: d */
    public final int f21390d;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r1 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C10793f() {
        /*
            r6 = this;
            r6.<init>()
            r0 = 1
            r6.f21387a = r0
            r1 = 8
            r6.f21388b = r1
            r2 = 20
            r6.f21389c = r2
            kotlin.ranges.c r3 = new kotlin.ranges.c
            r4 = 0
            r5 = 255(0xff, float:3.57E-43)
            r3.<init>(r4, r5)
            int r3 = r3.f21423b
            if (r0 > r3) goto L1c
            r3 = r0
            goto L1d
        L1c:
            r3 = r4
        L1d:
            if (r3 == 0) goto L3c
            kotlin.ranges.c r3 = new kotlin.ranges.c
            r3.<init>(r4, r5)
            int r3 = r3.f21423b
            if (r1 > r3) goto L2a
            r1 = r0
            goto L2b
        L2a:
            r1 = r4
        L2b:
            if (r1 == 0) goto L3c
            kotlin.ranges.c r1 = new kotlin.ranges.c
            r1.<init>(r4, r5)
            int r1 = r1.f21423b
            if (r2 > r1) goto L38
            r1 = r0
            goto L39
        L38:
            r1 = r4
        L39:
            if (r1 == 0) goto L3c
            goto L3d
        L3c:
            r0 = r4
        L3d:
            if (r0 == 0) goto L45
            r0 = 67604(0x10814, float:9.4733E-41)
            r6.f21390d = r0
            return
        L45:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Version components are out of range: 1.8.20"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C10793f.<init>():void");
    }

    @Override // java.lang.Comparable
    public final int compareTo(C10793f c10793f) {
        C10793f other = c10793f;
        C10843j.m430f(other, "other");
        return this.f21390d - other.f21390d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        C10793f c10793f = obj instanceof C10793f ? (C10793f) obj : null;
        return c10793f != null && this.f21390d == c10793f.f21390d;
    }

    public final int hashCode() {
        return this.f21390d;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21387a);
        sb.append('.');
        sb.append(this.f21388b);
        sb.append('.');
        sb.append(this.f21389c);
        return sb.toString();
    }
}

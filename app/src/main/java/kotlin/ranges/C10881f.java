package kotlin.ranges;

import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.ranges.f */
/* loaded from: classes3.dex */
public final class C10881f extends C10879d {
    static {
        new C10881f(1L, 0L);
    }

    public C10881f(long j, long j2) {
        super(j, j2);
    }

    /* renamed from: a */
    public final boolean m414a(long j) {
        return this.f21430a <= j && j <= this.f21431b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r0 == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof kotlin.ranges.C10881f
            r1 = 0
            if (r0 == 0) goto L32
            long r2 = r11.f21430a
            long r4 = r11.f21431b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r6 = 1
            if (r0 <= 0) goto L10
            r0 = r6
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 == 0) goto L23
            r0 = r12
            kotlin.ranges.f r0 = (kotlin.ranges.C10881f) r0
            long r7 = r0.f21430a
            long r9 = r0.f21431b
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L20
            r0 = r6
            goto L21
        L20:
            r0 = r1
        L21:
            if (r0 != 0) goto L31
        L23:
            kotlin.ranges.f r12 = (kotlin.ranges.C10881f) r12
            long r7 = r12.f21430a
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto L32
            long r2 = r12.f21431b
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 != 0) goto L32
        L31:
            r1 = r6
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.C10881f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long j = this.f21430a;
        long j2 = this.f21431b;
        if (j > j2) {
            return -1;
        }
        return (int) ((31 * (j ^ (j >>> 32))) + ((j2 >>> 32) ^ j2));
    }

    @NotNull
    public final String toString() {
        return this.f21430a + ".." + this.f21431b;
    }
}

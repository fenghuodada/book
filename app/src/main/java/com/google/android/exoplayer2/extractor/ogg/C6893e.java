package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.util.C7436v;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.ogg.e */
/* loaded from: classes.dex */
public final class C6893e {

    /* renamed from: a */
    public int f11577a;

    /* renamed from: b */
    public long f11578b;

    /* renamed from: c */
    public int f11579c;

    /* renamed from: d */
    public int f11580d;

    /* renamed from: e */
    public int f11581e;

    /* renamed from: f */
    public final int[] f11582f = new int[255];

    /* renamed from: g */
    public final C7436v f11583g = new C7436v(255);

    /* renamed from: a */
    public final boolean m5860a(C6820e c6820e, boolean z) throws IOException {
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        this.f11577a = 0;
        this.f11578b = 0L;
        this.f11579c = 0;
        this.f11580d = 0;
        this.f11581e = 0;
        C7436v c7436v = this.f11583g;
        c7436v.m4995w(27);
        try {
            z2 = c6820e.mo5928d(c7436v.f13978a, 0, 27, z);
        } catch (EOFException e) {
            if (z) {
                z2 = false;
            } else {
                throw e;
            }
        }
        if (!z2 || c7436v.m5001q() != 1332176723) {
            return false;
        }
        if (c7436v.m5002p() != 0) {
            if (z) {
                return false;
            }
            throw C7506y0.m4868b("unsupported bit stream revision");
        }
        this.f11577a = c7436v.m5002p();
        byte[] bArr = c7436v.f13978a;
        c7436v.f13979b = c7436v.f13979b + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        this.f11578b = ((bArr[i8] & 255) << 56) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 40) | ((bArr[i7] & 255) << 48);
        c7436v.m5011g();
        c7436v.m5011g();
        c7436v.m5011g();
        int m5002p = c7436v.m5002p();
        this.f11579c = m5002p;
        this.f11580d = m5002p + 27;
        c7436v.m4995w(m5002p);
        try {
            z3 = c6820e.mo5928d(c7436v.f13978a, 0, this.f11579c, z);
        } catch (EOFException e2) {
            if (z) {
                z3 = false;
            } else {
                throw e2;
            }
        }
        if (!z3) {
            return false;
        }
        for (int i9 = 0; i9 < this.f11579c; i9++) {
            int m5002p2 = c7436v.m5002p();
            this.f11582f[i9] = m5002p2;
            this.f11581e += m5002p2;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        if (r10.f11126d >= r11) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
        if (r10.m5946p() == (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
        return false;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m5859b(com.google.android.exoplayer2.extractor.C6820e r10, long r11) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r10.f11126d
            long r2 = r10.mo5927e()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            com.google.android.exoplayer2.util.C7394a.m5134a(r0)
            com.google.android.exoplayer2.util.v r0 = r9.f11583g
            r3 = 4
            r0.m4995w(r3)
        L18:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L27
            long r5 = r10.f11126d
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L46
        L27:
            byte[] r5 = r0.f13978a
            boolean r5 = r10.mo5928d(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L2e
            goto L2f
        L2e:
            r5 = r1
        L2f:
            if (r5 == 0) goto L46
            r0.m4992z(r1)
            long r4 = r0.m5001q()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L42
            r10.f11128f = r1
            return r2
        L42:
            r10.mo5924j(r2)
            goto L18
        L46:
            if (r4 == 0) goto L4e
            long r2 = r10.f11126d
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L56
        L4e:
            int r0 = r10.m5946p()
            r2 = -1
            if (r0 == r2) goto L56
            goto L46
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ogg.C6893e.m5859b(com.google.android.exoplayer2.extractor.e, long):boolean");
    }
}

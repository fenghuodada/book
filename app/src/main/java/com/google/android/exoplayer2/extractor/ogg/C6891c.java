package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.extractor.C6952w;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.InterfaceC6832h;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7436v;
import java.io.IOException;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.google.android.exoplayer2.extractor.ogg.c */
/* loaded from: classes.dex */
public final class C6891c implements Extractor {

    /* renamed from: a */
    public InterfaceC6833i f11569a;

    /* renamed from: b */
    public AbstractC6896h f11570b;

    /* renamed from: c */
    public boolean f11571c;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* renamed from: a */
    public final boolean m5862a(C6820e c6820e) throws IOException {
        boolean z;
        boolean z2;
        boolean equals;
        AbstractC6896h c6895g;
        C6893e c6893e = new C6893e();
        if (c6893e.m5860a(c6820e, true) && (c6893e.f11577a & 2) == 2) {
            int min = Math.min(c6893e.f11581e, 8);
            C7436v c7436v = new C7436v(min);
            c6820e.mo5928d(c7436v.f13978a, 0, min, false);
            c7436v.m4992z(0);
            if (c7436v.f13980c - c7436v.f13979b >= 5 && c7436v.m5002p() == 127 && c7436v.m5001q() == 1179402563) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c6895g = new C6889b();
            } else {
                c7436v.m4992z(0);
                try {
                    z2 = C6952w.m5808b(1, c7436v, true);
                } catch (C7506y0 unused) {
                    z2 = false;
                }
                if (z2) {
                    c6895g = new C6899i();
                } else {
                    c7436v.m4992z(0);
                    if (c7436v.f13980c - c7436v.f13979b < 8) {
                        equals = false;
                    } else {
                        byte[] bArr = new byte[8];
                        c7436v.m5016b(0, bArr, 8);
                        equals = Arrays.equals(bArr, C6895g.f11584o);
                    }
                    if (equals) {
                        c6895g = new C6895g();
                    }
                }
            }
            this.f11570b = c6895g;
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public final boolean mo5807b(InterfaceC6832h interfaceC6832h) throws IOException {
        try {
            return m5862a((C6820e) interfaceC6832h);
        } catch (C7506y0 unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0179  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo5806e(com.google.android.exoplayer2.extractor.InterfaceC6832h r21, com.google.android.exoplayer2.extractor.C6904s r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ogg.C6891c.mo5806e(com.google.android.exoplayer2.extractor.h, com.google.android.exoplayer2.extractor.s):int");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: f */
    public final void mo5805f(InterfaceC6833i interfaceC6833i) {
        this.f11569a = interfaceC6833i;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public final void mo5804g(long j, long j2) {
        AbstractC6896h abstractC6896h = this.f11570b;
        if (abstractC6896h != null) {
            C6892d c6892d = abstractC6896h.f11586a;
            C6893e c6893e = c6892d.f11572a;
            c6893e.f11577a = 0;
            c6893e.f11578b = 0L;
            c6893e.f11579c = 0;
            c6893e.f11580d = 0;
            c6893e.f11581e = 0;
            c6892d.f11573b.m4995w(0);
            c6892d.f11574c = -1;
            c6892d.f11576e = false;
            if (j == 0) {
                abstractC6896h.mo5852d(!abstractC6896h.f11597l);
            } else if (abstractC6896h.f11593h != 0) {
                long j3 = (abstractC6896h.f11594i * j2) / 1000000;
                abstractC6896h.f11590e = j3;
                InterfaceC6894f interfaceC6894f = abstractC6896h.f11589d;
                int i = C7408g0.f13905a;
                interfaceC6894f.mo5856c(j3);
                abstractC6896h.f11593h = 2;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}

package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.metadata.id3.C7080g;
import com.google.android.exoplayer2.util.C7436v;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.q */
/* loaded from: classes.dex */
public final class C6902q {

    /* renamed from: a */
    public final C7436v f11613a = new C7436v(10);

    @Nullable
    /* renamed from: a */
    public final C7042a m5849a(C6820e c6820e, @Nullable C7080g.InterfaceC7081a interfaceC7081a) throws IOException {
        C7436v c7436v = this.f11613a;
        C7042a c7042a = null;
        int i = 0;
        while (true) {
            try {
                c6820e.mo5928d(c7436v.f13978a, 0, 10, false);
                c7436v.m4992z(0);
                if (c7436v.m5000r() != 4801587) {
                    break;
                }
                c7436v.m5018A(3);
                int m5003o = c7436v.m5003o();
                int i2 = m5003o + 10;
                if (c7042a == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(c7436v.f13978a, 0, bArr, 0, 10);
                    c6820e.mo5928d(bArr, 10, m5003o, false);
                    c7042a = new C7080g(interfaceC7081a).m5533c(i2, bArr);
                } else {
                    c6820e.m5950l(m5003o, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        c6820e.f11128f = 0;
        c6820e.m5950l(i, false);
        return c7042a;
    }
}

package com.google.android.exoplayer2.extractor.wav;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7436v;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.wav.c */
/* loaded from: classes.dex */
public final class C6961c {

    /* renamed from: com.google.android.exoplayer2.extractor.wav.c$a */
    /* loaded from: classes.dex */
    public static final class C6962a {

        /* renamed from: a */
        public final int f12023a;

        /* renamed from: b */
        public final long f12024b;

        public C6962a(int i, long j) {
            this.f12023a = i;
            this.f12024b = j;
        }

        /* renamed from: a */
        public static C6962a m5798a(C6820e c6820e, C7436v c7436v) throws IOException {
            c6820e.mo5928d(c7436v.f13978a, 0, 8, false);
            c7436v.m4992z(0);
            return new C6962a(c7436v.m5015c(), c7436v.m5011g());
        }
    }

    @Nullable
    /* renamed from: a */
    public static C6960b m5799a(C6820e c6820e) throws IOException {
        long j;
        boolean z;
        byte[] bArr;
        C7436v c7436v = new C7436v(16);
        if (C6962a.m5798a(c6820e, c7436v).f12023a != 1380533830) {
            return null;
        }
        c6820e.mo5928d(c7436v.f13978a, 0, 4, false);
        c7436v.m4992z(0);
        int m5015c = c7436v.m5015c();
        if (m5015c != 1463899717) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(m5015c);
            Log.e("WavHeaderReader", sb.toString());
            return null;
        }
        while (true) {
            C6962a m5798a = C6962a.m5798a(c6820e, c7436v);
            int i = m5798a.f12023a;
            j = m5798a.f12024b;
            if (i == 1718449184) {
                break;
            }
            c6820e.m5950l((int) j, false);
        }
        if (j >= 16) {
            z = true;
        } else {
            z = false;
        }
        C7394a.m5131d(z);
        c6820e.mo5928d(c7436v.f13978a, 0, 16, false);
        c7436v.m4992z(0);
        int m5009i = c7436v.m5009i();
        int m5009i2 = c7436v.m5009i();
        int m5010h = c7436v.m5010h();
        c7436v.m5010h();
        int m5009i3 = c7436v.m5009i();
        int m5009i4 = c7436v.m5009i();
        int i2 = ((int) j) - 16;
        if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            c6820e.mo5928d(bArr2, 0, i2, false);
            bArr = bArr2;
        } else {
            bArr = C7408g0.f13910f;
        }
        return new C6960b(m5009i, m5009i2, m5010h, m5009i3, m5009i4, bArr);
    }
}

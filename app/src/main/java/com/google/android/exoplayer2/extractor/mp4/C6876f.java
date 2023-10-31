package com.google.android.exoplayer2.extractor.mp4;

import android.util.Log;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.activity.p010b.C2745h;
import com.google.android.exoplayer2.C6964f;
import com.google.android.exoplayer2.util.C7436v;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.extractor.mp4.f */
/* loaded from: classes.dex */
public final class C6876f {

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.f$a */
    /* loaded from: classes.dex */
    public static class C6877a {

        /* renamed from: a */
        public final UUID f11492a;

        /* renamed from: b */
        public final int f11493b;

        /* renamed from: c */
        public final byte[] f11494c;

        public C6877a(UUID uuid, int i, byte[] bArr) {
            this.f11492a = uuid;
            this.f11493b = i;
            this.f11494c = bArr;
        }
    }

    @Nullable
    /* renamed from: a */
    public static C6877a m5871a(byte[] bArr) {
        C7436v c7436v = new C7436v(bArr);
        if (c7436v.f13980c < 32) {
            return null;
        }
        c7436v.m4992z(0);
        if (c7436v.m5015c() != (c7436v.f13980c - c7436v.f13979b) + 4 || c7436v.m5015c() != 1886614376) {
            return null;
        }
        int m5015c = (c7436v.m5015c() >> 24) & 255;
        if (m5015c > 1) {
            C6964f.m5792c(37, "Unsupported pssh version: ", m5015c, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(c7436v.m5008j(), c7436v.m5008j());
        if (m5015c == 1) {
            c7436v.m5018A(c7436v.m4999s() * 16);
        }
        int m4999s = c7436v.m4999s();
        if (m4999s != c7436v.f13980c - c7436v.f13979b) {
            return null;
        }
        byte[] bArr2 = new byte[m4999s];
        c7436v.m5016b(0, bArr2, m4999s);
        return new C6877a(uuid, m5015c, bArr2);
    }

    @Nullable
    /* renamed from: b */
    public static byte[] m5870b(UUID uuid, byte[] bArr) {
        C6877a m5871a = m5871a(bArr);
        if (m5871a == null) {
            return null;
        }
        UUID uuid2 = m5871a.f11492a;
        if (!uuid.equals(uuid2)) {
            String valueOf = String.valueOf(uuid);
            String valueOf2 = String.valueOf(uuid2);
            StringBuilder m9043a = C2745h.m9043a(valueOf2.length() + valueOf.length() + 33, "UUID mismatch. Expected: ", valueOf, ", got: ", valueOf2);
            m9043a.append(".");
            Log.w("PsshAtomUtil", m9043a.toString());
            return null;
        }
        return m5871a.f11494c;
    }
}

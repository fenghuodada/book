package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.util.C7436v;

/* renamed from: com.google.android.exoplayer2.extractor.w */
/* loaded from: classes.dex */
public final class C6952w {

    /* renamed from: com.google.android.exoplayer2.extractor.w$a */
    /* loaded from: classes.dex */
    public static final class C6953a {

        /* renamed from: a */
        public final String[] f11981a;

        public C6953a(String[] strArr) {
            this.f11981a = strArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.w$b */
    /* loaded from: classes.dex */
    public static final class C6954b {

        /* renamed from: a */
        public final boolean f11982a;

        public C6954b(boolean z) {
            this.f11982a = z;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.w$c */
    /* loaded from: classes.dex */
    public static final class C6955c {

        /* renamed from: a */
        public final int f11983a;

        /* renamed from: b */
        public final int f11984b;

        /* renamed from: c */
        public final int f11985c;

        /* renamed from: d */
        public final int f11986d;

        /* renamed from: e */
        public final int f11987e;

        /* renamed from: f */
        public final int f11988f;

        /* renamed from: g */
        public final byte[] f11989g;

        public C6955c(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
            this.f11983a = i;
            this.f11984b = i2;
            this.f11985c = i3;
            this.f11986d = i4;
            this.f11987e = i5;
            this.f11988f = i6;
            this.f11989g = bArr;
        }
    }

    /* renamed from: a */
    public static C6953a m5809a(C7436v c7436v, boolean z, boolean z2) throws C7506y0 {
        if (z) {
            m5808b(3, c7436v, false);
        }
        c7436v.m5005m((int) c7436v.m5011g());
        long m5011g = c7436v.m5011g();
        String[] strArr = new String[(int) m5011g];
        for (int i = 0; i < m5011g; i++) {
            strArr[i] = c7436v.m5005m((int) c7436v.m5011g());
        }
        if (z2 && (c7436v.m5002p() & 1) == 0) {
            throw C7506y0.m4869a("framing bit expected to be set", null);
        }
        return new C6953a(strArr);
    }

    /* renamed from: b */
    public static boolean m5808b(int i, C7436v c7436v, boolean z) throws C7506y0 {
        String str;
        int i2 = c7436v.f13980c - c7436v.f13979b;
        if (i2 < 7) {
            if (z) {
                return false;
            }
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(i2);
            throw C7506y0.m4869a(sb.toString(), null);
        } else if (c7436v.m5002p() != i) {
            if (z) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i));
            if (valueOf.length() != 0) {
                str = "expected header type ".concat(valueOf);
            } else {
                str = new String("expected header type ");
            }
            throw C7506y0.m4869a(str, null);
        } else if (c7436v.m5002p() == 118 && c7436v.m5002p() == 111 && c7436v.m5002p() == 114 && c7436v.m5002p() == 98 && c7436v.m5002p() == 105 && c7436v.m5002p() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw C7506y0.m4869a("expected characters 'vorbis'", null);
        }
    }
}

package com.google.android.exoplayer2.metadata.id3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.C6764a;
import com.google.android.exoplayer2.metadata.AbstractC7062g;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.metadata.C7048d;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7435u;
import com.google.android.exoplayer2.util.C7436v;
import com.google.common.base.C7929b;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.google.android.exoplayer2.metadata.id3.g */
/* loaded from: classes.dex */
public final class C7080g extends AbstractC7062g {

    /* renamed from: b */
    public static final C6764a f12560b = new C6764a();
    @Nullable

    /* renamed from: a */
    public final InterfaceC7081a f12561a;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.g$a */
    /* loaded from: classes.dex */
    public interface InterfaceC7081a {
        /* renamed from: a */
        boolean mo5512a(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: com.google.android.exoplayer2.metadata.id3.g$b */
    /* loaded from: classes.dex */
    public static final class C7082b {

        /* renamed from: a */
        public final int f12562a;

        /* renamed from: b */
        public final boolean f12563b;

        /* renamed from: c */
        public final int f12564c;

        public C7082b(int i, boolean z, int i2) {
            this.f12562a = i;
            this.f12563b = z;
            this.f12564c = i2;
        }
    }

    public C7080g(@Nullable InterfaceC7081a interfaceC7081a) {
        this.f12561a = interfaceC7081a;
    }

    /* renamed from: d */
    public static C7068a m5532d(C7436v c7436v, int i, int i2) throws UnsupportedEncodingException {
        int m5515u;
        String str;
        byte[] copyOfRange;
        int m5002p = c7436v.m5002p();
        String m5518r = m5518r(m5002p);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        c7436v.m5016b(0, bArr, i3);
        if (i2 == 2) {
            String valueOf = String.valueOf(C7929b.m4294a(new String(bArr, 0, 3, "ISO-8859-1")));
            if (valueOf.length() != 0) {
                str = "image/".concat(valueOf);
            } else {
                str = new String("image/");
            }
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            m5515u = 2;
        } else {
            m5515u = m5515u(0, bArr);
            String m4294a = C7929b.m4294a(new String(bArr, 0, m5515u, "ISO-8859-1"));
            if (m4294a.indexOf(47) == -1) {
                if (m4294a.length() != 0) {
                    str = "image/".concat(m4294a);
                } else {
                    str = new String("image/");
                }
            } else {
                str = m4294a;
            }
        }
        int i4 = bArr[m5515u + 1] & 255;
        int i5 = m5515u + 2;
        int m5516t = m5516t(i5, bArr, m5002p);
        String str2 = new String(bArr, i5, m5516t - i5, m5518r);
        int m5519q = m5519q(m5002p) + m5516t;
        if (i3 <= m5519q) {
            copyOfRange = C7408g0.f13910f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, m5519q, i3);
        }
        return new C7068a(str, str2, i4, copyOfRange);
    }

    /* renamed from: e */
    public static C7072c m5531e(C7436v c7436v, int i, int i2, boolean z, int i3, @Nullable InterfaceC7081a interfaceC7081a) throws UnsupportedEncodingException {
        long j;
        long j2;
        int i4 = c7436v.f13979b;
        int m5515u = m5515u(i4, c7436v.f13978a);
        String str = new String(c7436v.f13978a, i4, m5515u - i4, "ISO-8859-1");
        c7436v.m4992z(m5515u + 1);
        int m5015c = c7436v.m5015c();
        int m5015c2 = c7436v.m5015c();
        long m5001q = c7436v.m5001q();
        if (m5001q == 4294967295L) {
            j = -1;
        } else {
            j = m5001q;
        }
        long m5001q2 = c7436v.m5001q();
        if (m5001q2 == 4294967295L) {
            j2 = -1;
        } else {
            j2 = m5001q2;
        }
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (c7436v.f13979b < i5) {
            AbstractC7083h m5528h = m5528h(i2, c7436v, z, i3, interfaceC7081a);
            if (m5528h != null) {
                arrayList.add(m5528h);
            }
        }
        return new C7072c(str, m5015c, m5015c2, j, j2, (AbstractC7083h[]) arrayList.toArray(new AbstractC7083h[0]));
    }

    /* renamed from: f */
    public static C7074d m5530f(C7436v c7436v, int i, int i2, boolean z, int i3, @Nullable InterfaceC7081a interfaceC7081a) throws UnsupportedEncodingException {
        boolean z2;
        boolean z3;
        int i4 = c7436v.f13979b;
        int m5515u = m5515u(i4, c7436v.f13978a);
        String str = new String(c7436v.f13978a, i4, m5515u - i4, "ISO-8859-1");
        c7436v.m4992z(m5515u + 1);
        int m5002p = c7436v.m5002p();
        if ((m5002p & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((m5002p & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int m5002p2 = c7436v.m5002p();
        String[] strArr = new String[m5002p2];
        for (int i5 = 0; i5 < m5002p2; i5++) {
            int i6 = c7436v.f13979b;
            int m5515u2 = m5515u(i6, c7436v.f13978a);
            strArr[i5] = new String(c7436v.f13978a, i6, m5515u2 - i6, "ISO-8859-1");
            c7436v.m4992z(m5515u2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (c7436v.f13979b < i7) {
            AbstractC7083h m5528h = m5528h(i2, c7436v, z, i3, interfaceC7081a);
            if (m5528h != null) {
                arrayList.add(m5528h);
            }
        }
        return new C7074d(str, z2, z3, strArr, (AbstractC7083h[]) arrayList.toArray(new AbstractC7083h[0]));
    }

    @Nullable
    /* renamed from: g */
    public static C7076e m5529g(int i, C7436v c7436v) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int m5002p = c7436v.m5002p();
        String m5518r = m5518r(m5002p);
        byte[] bArr = new byte[3];
        c7436v.m5016b(0, bArr, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        c7436v.m5016b(0, bArr2, i2);
        int m5516t = m5516t(0, bArr2, m5002p);
        String str2 = new String(bArr2, 0, m5516t, m5518r);
        int m5519q = m5519q(m5002p) + m5516t;
        return new C7076e(str, str2, m5524l(m5518r, bArr2, m5519q, m5516t(m5519q, bArr2, m5002p)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0185, code lost:
        if (r13 == 67) goto L107;
     */
    @androidx.annotation.Nullable
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.metadata.id3.AbstractC7083h m5528h(int r18, com.google.android.exoplayer2.util.C7436v r19, boolean r20, int r21, @androidx.annotation.Nullable com.google.android.exoplayer2.metadata.id3.C7080g.InterfaceC7081a r22) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.C7080g.m5528h(int, com.google.android.exoplayer2.util.v, boolean, int, com.google.android.exoplayer2.metadata.id3.g$a):com.google.android.exoplayer2.metadata.id3.h");
    }

    /* renamed from: i */
    public static C7078f m5527i(int i, C7436v c7436v) throws UnsupportedEncodingException {
        byte[] copyOfRange;
        int m5002p = c7436v.m5002p();
        String m5518r = m5518r(m5002p);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c7436v.m5016b(0, bArr, i2);
        int m5515u = m5515u(0, bArr);
        String str = new String(bArr, 0, m5515u, "ISO-8859-1");
        int i3 = m5515u + 1;
        int m5516t = m5516t(i3, bArr, m5002p);
        String m5524l = m5524l(m5518r, bArr, i3, m5516t);
        int m5519q = m5519q(m5002p) + m5516t;
        int m5516t2 = m5516t(m5519q, bArr, m5002p);
        String m5524l2 = m5524l(m5518r, bArr, m5519q, m5516t2);
        int m5519q2 = m5519q(m5002p) + m5516t2;
        if (i2 <= m5519q2) {
            copyOfRange = C7408g0.f13910f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, m5519q2, i2);
        }
        return new C7078f(str, m5524l, m5524l2, copyOfRange);
    }

    /* renamed from: j */
    public static C7086j m5526j(int i, C7436v c7436v) {
        int m4997u = c7436v.m4997u();
        int m5000r = c7436v.m5000r();
        int m5000r2 = c7436v.m5000r();
        int m5002p = c7436v.m5002p();
        int m5002p2 = c7436v.m5002p();
        C7435u c7435u = new C7435u();
        c7435u.m5023i(c7436v.f13980c, c7436v.f13978a);
        c7435u.m5022j(c7436v.f13979b * 8);
        int i2 = ((i - 10) * 8) / (m5002p + m5002p2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int m5026f = c7435u.m5026f(m5002p);
            int m5026f2 = c7435u.m5026f(m5002p2);
            iArr[i3] = m5026f;
            iArr2[i3] = m5026f2;
        }
        return new C7086j(m4997u, m5000r, m5000r2, iArr, iArr2);
    }

    /* renamed from: k */
    public static C7088k m5525k(int i, C7436v c7436v) throws UnsupportedEncodingException {
        byte[] copyOfRange;
        byte[] bArr = new byte[i];
        c7436v.m5016b(0, bArr, i);
        int m5515u = m5515u(0, bArr);
        String str = new String(bArr, 0, m5515u, "ISO-8859-1");
        int i2 = m5515u + 1;
        if (i <= i2) {
            copyOfRange = C7408g0.f13910f;
        } else {
            copyOfRange = Arrays.copyOfRange(bArr, i2, i);
        }
        return new C7088k(str, copyOfRange);
    }

    /* renamed from: l */
    public static String m5524l(String str, byte[] bArr, int i, int i2) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    @Nullable
    /* renamed from: m */
    public static C7090l m5523m(int i, C7436v c7436v, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int m5002p = c7436v.m5002p();
        String m5518r = m5518r(m5002p);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c7436v.m5016b(0, bArr, i2);
        return new C7090l(str, null, new String(bArr, 0, m5516t(0, bArr, m5002p), m5518r));
    }

    @Nullable
    /* renamed from: n */
    public static C7090l m5522n(int i, C7436v c7436v) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int m5002p = c7436v.m5002p();
        String m5518r = m5518r(m5002p);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c7436v.m5016b(0, bArr, i2);
        int m5516t = m5516t(0, bArr, m5002p);
        String str = new String(bArr, 0, m5516t, m5518r);
        int m5519q = m5519q(m5002p) + m5516t;
        return new C7090l("TXXX", str, m5524l(m5518r, bArr, m5519q, m5516t(m5519q, bArr, m5002p)));
    }

    /* renamed from: o */
    public static C7092m m5521o(int i, C7436v c7436v, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        c7436v.m5016b(0, bArr, i);
        return new C7092m(str, null, new String(bArr, 0, m5515u(0, bArr), "ISO-8859-1"));
    }

    @Nullable
    /* renamed from: p */
    public static C7092m m5520p(int i, C7436v c7436v) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int m5002p = c7436v.m5002p();
        String m5518r = m5518r(m5002p);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c7436v.m5016b(0, bArr, i2);
        int m5516t = m5516t(0, bArr, m5002p);
        String str = new String(bArr, 0, m5516t, m5518r);
        int m5519q = m5519q(m5002p) + m5516t;
        return new C7092m("WXXX", str, m5524l("ISO-8859-1", bArr, m5519q, m5515u(m5519q, bArr)));
    }

    /* renamed from: q */
    public static int m5519q(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: r */
    public static String m5518r(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: s */
    public static String m5517s(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* renamed from: t */
    public static int m5516t(int i, byte[] bArr, int i2) {
        int m5515u = m5515u(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return m5515u;
        }
        while (m5515u < bArr.length - 1) {
            if ((m5515u - i) % 2 == 0 && bArr[m5515u + 1] == 0) {
                return m5515u;
            }
            m5515u = m5515u(m5515u + 1, bArr);
        }
        return bArr.length;
    }

    /* renamed from: u */
    public static int m5515u(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* renamed from: v */
    public static int m5514v(int i, C7436v c7436v) {
        byte[] bArr = c7436v.f13978a;
        int i2 = c7436v.f13979b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 < i2 + i) {
                if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                    System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                    i--;
                }
                i3 = i4;
            } else {
                return i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
        if ((r10 & 128) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0086, code lost:
        r4 = false;
     */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m5513w(com.google.android.exoplayer2.util.C7436v r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.C7080g.m5513w(com.google.android.exoplayer2.util.v, int, int, boolean):boolean");
    }

    @Override // com.google.android.exoplayer2.metadata.AbstractC7062g
    @Nullable
    /* renamed from: b */
    public final C7042a mo5507b(C7048d c7048d, ByteBuffer byteBuffer) {
        return m5533c(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    @androidx.annotation.Nullable
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.exoplayer2.metadata.C7042a m5533c(int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.C7080g.m5533c(int, byte[]):com.google.android.exoplayer2.metadata.a");
    }
}

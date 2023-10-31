package com.google.android.exoplayer2.text.pgs;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.AbstractC7207a;
import com.google.android.exoplayer2.text.C7234e;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.InterfaceC7209c;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7436v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* renamed from: com.google.android.exoplayer2.text.pgs.a */
/* loaded from: classes.dex */
public final class C7241a extends AbstractC7207a {

    /* renamed from: m */
    public final C7436v f13170m = new C7436v();

    /* renamed from: n */
    public final C7436v f13171n = new C7436v();

    /* renamed from: o */
    public final C7242a f13172o = new C7242a();
    @Nullable

    /* renamed from: p */
    public Inflater f13173p;

    /* renamed from: com.google.android.exoplayer2.text.pgs.a$a */
    /* loaded from: classes.dex */
    public static final class C7242a {

        /* renamed from: a */
        public final C7436v f13174a = new C7436v();

        /* renamed from: b */
        public final int[] f13175b = new int[256];

        /* renamed from: c */
        public boolean f13176c;

        /* renamed from: d */
        public int f13177d;

        /* renamed from: e */
        public int f13178e;

        /* renamed from: f */
        public int f13179f;

        /* renamed from: g */
        public int f13180g;

        /* renamed from: h */
        public int f13181h;

        /* renamed from: i */
        public int f13182i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.exoplayer2.text.AbstractC7207a
    /* renamed from: h */
    public final InterfaceC7209c mo5287h(byte[] bArr, int i, boolean z) throws C7234e {
        char c;
        Cue cue;
        int i2;
        int i3;
        int m5002p;
        int i4;
        int i5;
        int m5000r;
        C7436v c7436v = this.f13170m;
        c7436v.m4994x(i, bArr);
        int i6 = c7436v.f13980c;
        int i7 = c7436v.f13979b;
        char c2 = 255;
        if (i6 - i7 > 0 && (c7436v.f13978a[i7] & 255) == 120) {
            if (this.f13173p == null) {
                this.f13173p = new Inflater();
            }
            Inflater inflater = this.f13173p;
            C7436v c7436v2 = this.f13171n;
            if (C7408g0.m5087s(c7436v, c7436v2, inflater)) {
                c7436v.m4994x(c7436v2.f13980c, c7436v2.f13978a);
            }
        }
        C7242a c7242a = this.f13172o;
        int i8 = 0;
        c7242a.f13177d = 0;
        c7242a.f13178e = 0;
        c7242a.f13179f = 0;
        c7242a.f13180g = 0;
        c7242a.f13181h = 0;
        c7242a.f13182i = 0;
        c7242a.f13174a.m4995w(0);
        c7242a.f13176c = false;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i9 = c7436v.f13980c;
            if (i9 - c7436v.f13979b >= 3) {
                int m5002p2 = c7436v.m5002p();
                int m4997u = c7436v.m4997u();
                int i10 = c7436v.f13979b + m4997u;
                if (i10 > i9) {
                    c7436v.m4992z(i9);
                    c = c2;
                    cue = null;
                } else {
                    int[] iArr = c7242a.f13175b;
                    C7436v c7436v3 = c7242a.f13174a;
                    if (m5002p2 != 128) {
                        switch (m5002p2) {
                            case 20:
                                if (m4997u % 5 == 2) {
                                    c7436v.m5018A(2);
                                    Arrays.fill(iArr, i8);
                                    int i11 = m4997u / 5;
                                    int i12 = i8;
                                    while (i12 < i11) {
                                        int m5002p3 = c7436v.m5002p();
                                        int[] iArr2 = iArr;
                                        double m5002p4 = c7436v.m5002p();
                                        double m5002p5 = c7436v.m5002p() - 128;
                                        double m5002p6 = c7436v.m5002p() - 128;
                                        iArr2[m5002p3] = (C7408g0.m5099g((int) ((m5002p4 - (0.34414d * m5002p6)) - (m5002p5 * 0.71414d)), 0, 255) << 8) | (C7408g0.m5099g((int) ((1.402d * m5002p5) + m5002p4), 0, 255) << 16) | (c7436v.m5002p() << 24) | C7408g0.m5099g((int) ((m5002p6 * 1.772d) + m5002p4), 0, 255);
                                        i12++;
                                        c2 = 255;
                                        i11 = i11;
                                        iArr = iArr2;
                                    }
                                    c = c2;
                                    c7242a.f13176c = true;
                                    break;
                                }
                                c = c2;
                                break;
                            case 21:
                                if (m4997u >= 4) {
                                    c7436v.m5018A(3);
                                    if ((128 & c7436v.m5002p()) != 0) {
                                        i5 = 1;
                                    } else {
                                        i5 = i8;
                                    }
                                    int i13 = m4997u - 4;
                                    if (i5 != 0) {
                                        if (i13 >= 7 && (m5000r = c7436v.m5000r()) >= 4) {
                                            c7242a.f13181h = c7436v.m4997u();
                                            c7242a.f13182i = c7436v.m4997u();
                                            c7436v3.m4995w(m5000r - 4);
                                            i13 -= 7;
                                        }
                                    }
                                    int i14 = c7436v3.f13979b;
                                    int i15 = c7436v3.f13980c;
                                    if (i14 < i15 && i13 > 0) {
                                        int min = Math.min(i13, i15 - i14);
                                        c7436v.m5016b(i14, c7436v3.f13978a, min);
                                        c7436v3.m4992z(i14 + min);
                                    }
                                }
                                c = c2;
                                break;
                            case 22:
                                if (m4997u >= 19) {
                                    c7242a.f13177d = c7436v.m4997u();
                                    c7242a.f13178e = c7436v.m4997u();
                                    c7436v.m5018A(11);
                                    c7242a.f13179f = c7436v.m4997u();
                                    c7242a.f13180g = c7436v.m4997u();
                                }
                                c = c2;
                                break;
                            default:
                                c = c2;
                                break;
                        }
                        i8 = 0;
                        cue = null;
                    } else {
                        c = c2;
                        if (c7242a.f13177d != 0 && c7242a.f13178e != 0 && c7242a.f13181h != 0 && c7242a.f13182i != 0 && (i2 = c7436v3.f13980c) != 0 && c7436v3.f13979b == i2 && c7242a.f13176c) {
                            c7436v3.m4992z(0);
                            int i16 = c7242a.f13181h * c7242a.f13182i;
                            int[] iArr3 = new int[i16];
                            int i17 = 0;
                            while (i17 < i16) {
                                int m5002p7 = c7436v3.m5002p();
                                if (m5002p7 != 0) {
                                    i3 = i17 + 1;
                                    iArr3[i17] = iArr[m5002p7];
                                } else {
                                    int m5002p8 = c7436v3.m5002p();
                                    if (m5002p8 != 0) {
                                        if ((m5002p8 & 64) == 0) {
                                            m5002p = m5002p8 & 63;
                                        } else {
                                            m5002p = ((m5002p8 & 63) << 8) | c7436v3.m5002p();
                                        }
                                        if ((m5002p8 & 128) == 0) {
                                            i4 = 0;
                                        } else {
                                            i4 = iArr[c7436v3.m5002p()];
                                        }
                                        i3 = m5002p + i17;
                                        Arrays.fill(iArr3, i17, i3, i4);
                                    }
                                }
                                i17 = i3;
                            }
                            Bitmap createBitmap = Bitmap.createBitmap(iArr3, c7242a.f13181h, c7242a.f13182i, Bitmap.Config.ARGB_8888);
                            Cue.C7206a c7206a = new Cue.C7206a();
                            c7206a.f12987b = createBitmap;
                            float f = c7242a.f13177d;
                            c7206a.f12993h = c7242a.f13179f / f;
                            c7206a.f12994i = 0;
                            float f2 = c7242a.f13178e;
                            c7206a.f12990e = c7242a.f13180g / f2;
                            c7206a.f12991f = 0;
                            c7206a.f12992g = 0;
                            c7206a.f12997l = c7242a.f13181h / f;
                            c7206a.f12998m = c7242a.f13182i / f2;
                            cue = c7206a.m5372a();
                        } else {
                            cue = null;
                        }
                        i8 = 0;
                        c7242a.f13177d = 0;
                        c7242a.f13178e = 0;
                        c7242a.f13179f = 0;
                        c7242a.f13180g = 0;
                        c7242a.f13181h = 0;
                        c7242a.f13182i = 0;
                        c7436v3.m4995w(0);
                        c7242a.f13176c = false;
                    }
                    c7436v.m4992z(i10);
                }
                if (cue != null) {
                    arrayList.add(cue);
                }
                c2 = c;
            } else {
                return new C7243b(Collections.unmodifiableList(arrayList));
            }
        }
    }
}

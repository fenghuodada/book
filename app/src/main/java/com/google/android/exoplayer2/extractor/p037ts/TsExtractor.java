package com.google.android.exoplayer2.extractor.p037ts;

import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.fragment.C1349a;
import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.extractor.C6820e;
import com.google.android.exoplayer2.extractor.C6904s;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.InterfaceC6832h;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.extractor.p037ts.TsPayloadReader;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7404e0;
import com.google.android.exoplayer2.util.C7435u;
import com.google.android.exoplayer2.util.C7436v;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.ts.TsExtractor */
/* loaded from: classes.dex */
public final class TsExtractor implements Extractor {

    /* renamed from: a */
    public final int f11634a;

    /* renamed from: b */
    public final int f11635b;

    /* renamed from: c */
    public final List<C7404e0> f11636c;

    /* renamed from: d */
    public final C7436v f11637d;

    /* renamed from: e */
    public final SparseIntArray f11638e;

    /* renamed from: f */
    public final TsPayloadReader.InterfaceC6912c f11639f;

    /* renamed from: g */
    public final SparseArray<TsPayloadReader> f11640g;

    /* renamed from: h */
    public final SparseBooleanArray f11641h;

    /* renamed from: i */
    public final SparseBooleanArray f11642i;

    /* renamed from: j */
    public final C6949z f11643j;

    /* renamed from: k */
    public C6947y f11644k;

    /* renamed from: l */
    public InterfaceC6833i f11645l;

    /* renamed from: m */
    public int f11646m;

    /* renamed from: n */
    public boolean f11647n;

    /* renamed from: o */
    public boolean f11648o;

    /* renamed from: p */
    public boolean f11649p;

    /* renamed from: q */
    public TsPayloadReader f11650q;

    /* renamed from: r */
    public int f11651r;

    /* renamed from: s */
    public int f11652s;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsExtractor$Mode */
    /* loaded from: classes.dex */
    public @interface Mode {
    }

    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsExtractor$a */
    /* loaded from: classes.dex */
    public class C6908a implements InterfaceC6944v {

        /* renamed from: a */
        public final C7435u f11653a = new C7435u(new byte[4], 4);

        public C6908a() {
        }

        @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6944v
        /* renamed from: a */
        public final void mo5821a(C7404e0 c7404e0, InterfaceC6833i interfaceC6833i, TsPayloadReader.C6913d c6913d) {
        }

        @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6944v
        /* renamed from: b */
        public final void mo5820b(C7436v c7436v) {
            TsExtractor tsExtractor;
            if (c7436v.m5002p() != 0 || (c7436v.m5002p() & 128) == 0) {
                return;
            }
            c7436v.m5018A(6);
            int i = (c7436v.f13980c - c7436v.f13979b) / 4;
            int i2 = 0;
            while (true) {
                tsExtractor = TsExtractor.this;
                if (i2 >= i) {
                    break;
                }
                C7435u c7435u = this.f11653a;
                c7436v.m5016b(0, c7435u.f13974a, 4);
                c7435u.m5022j(0);
                int m5026f = c7435u.m5026f(16);
                c7435u.m5020l(3);
                if (m5026f == 0) {
                    c7435u.m5020l(13);
                } else {
                    int m5026f2 = c7435u.m5026f(13);
                    if (tsExtractor.f11640g.get(m5026f2) == null) {
                        tsExtractor.f11640g.put(m5026f2, new C6945w(new C6909b(m5026f2)));
                        tsExtractor.f11646m++;
                    }
                }
                i2++;
            }
            if (tsExtractor.f11634a != 2) {
                tsExtractor.f11640g.remove(0);
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.ts.TsExtractor$b */
    /* loaded from: classes.dex */
    public class C6909b implements InterfaceC6944v {

        /* renamed from: a */
        public final C7435u f11655a = new C7435u(new byte[5], 5);

        /* renamed from: b */
        public final SparseArray<TsPayloadReader> f11656b = new SparseArray<>();

        /* renamed from: c */
        public final SparseIntArray f11657c = new SparseIntArray();

        /* renamed from: d */
        public final int f11658d;

        public C6909b(int i) {
            this.f11658d = i;
        }

        @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6944v
        /* renamed from: a */
        public final void mo5821a(C7404e0 c7404e0, InterfaceC6833i interfaceC6833i, TsPayloadReader.C6913d c6913d) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x0136, code lost:
            if (r27.m5002p() == 21) goto L43;
         */
        /* JADX WARN: Removed duplicated region for block: B:95:0x01e5  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01f5  */
        @Override // com.google.android.exoplayer2.extractor.p037ts.InterfaceC6944v
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo5820b(com.google.android.exoplayer2.util.C7436v r27) {
            /*
                Method dump skipped, instructions count: 665
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p037ts.TsExtractor.C6909b.mo5820b(com.google.android.exoplayer2.util.v):void");
        }
    }

    public TsExtractor() {
        C7404e0 c7404e0 = new C7404e0(0L);
        this.f11639f = new DefaultTsPayloadReaderFactory();
        this.f11635b = 112800;
        this.f11634a = 1;
        this.f11636c = Collections.singletonList(c7404e0);
        this.f11637d = new C7436v(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f11641h = sparseBooleanArray;
        this.f11642i = new SparseBooleanArray();
        SparseArray<TsPayloadReader> sparseArray = new SparseArray<>();
        this.f11640g = sparseArray;
        this.f11638e = new SparseIntArray();
        this.f11643j = new C6949z();
        this.f11652s = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(sparseArray2.keyAt(i), (TsPayloadReader) sparseArray2.valueAt(i));
        }
        sparseArray.put(0, new C6945w(new C6908a()));
        this.f11650q = null;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public final boolean mo5807b(InterfaceC6832h interfaceC6832h) throws IOException {
        boolean z;
        byte[] bArr = this.f11637d.f13978a;
        C6820e c6820e = (C6820e) interfaceC6832h;
        c6820e.mo5928d(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 < 5) {
                    if (bArr[(i2 * 188) + i] != 71) {
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                c6820e.mo5924j(i);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r7v10, types: [android.util.SparseBooleanArray] */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public final int mo5806e(InterfaceC6832h interfaceC6832h, C6904s c6904s) throws IOException {
        C6820e c6820e;
        ?? r3;
        int i;
        ?? r15;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        boolean z5;
        C6820e c6820e2;
        long j;
        C6904s c6904s2;
        boolean z6;
        boolean z7;
        boolean z8;
        InterfaceC6833i interfaceC6833i;
        InterfaceC6905t c6907b;
        long j2;
        long j3;
        boolean z9;
        C6820e c6820e3 = (C6820e) interfaceC6832h;
        long j4 = c6820e3.f11125c;
        boolean z10 = this.f11647n;
        int i5 = this.f11634a;
        if (z10) {
            if (j4 != -1 && i5 != 2) {
                z5 = true;
            } else {
                z5 = false;
            }
            C6949z c6949z = this.f11643j;
            if (z5 && !c6949z.f11968d) {
                int i6 = this.f11652s;
                if (i6 <= 0) {
                    c6949z.m5813a(c6820e3);
                    return 0;
                }
                boolean z11 = c6949z.f11970f;
                C7436v c7436v = c6949z.f11967c;
                int i7 = c6949z.f11965a;
                if (!z11) {
                    int min = (int) Math.min(i7, j4);
                    long j5 = j4 - min;
                    if (c6820e3.f11126d != j5) {
                        c6904s.f11618a = j5;
                    } else {
                        c7436v.m4995w(min);
                        c6820e3.f11128f = 0;
                        c6820e3.mo5928d(c7436v.f13978a, 0, min, false);
                        int i8 = c7436v.f13979b;
                        int i9 = c7436v.f13980c;
                        int i10 = i9 - 188;
                        while (true) {
                            if (i10 >= i8) {
                                byte[] bArr = c7436v.f13978a;
                                int i11 = -4;
                                int i12 = 0;
                                while (true) {
                                    if (i11 <= 4) {
                                        int i13 = (i11 * 188) + i10;
                                        if (i13 >= i8 && i13 < i9 && bArr[i13] == 71) {
                                            i12++;
                                            if (i12 == 5) {
                                                z9 = true;
                                                break;
                                            }
                                        } else {
                                            i12 = 0;
                                        }
                                        i11++;
                                    } else {
                                        z9 = false;
                                        break;
                                    }
                                }
                                if (z9) {
                                    long m10607d = C1349a.m10607d(c7436v, i10, i6);
                                    if (m10607d != -9223372036854775807L) {
                                        j3 = m10607d;
                                        break;
                                    }
                                }
                                i10--;
                            } else {
                                j3 = -9223372036854775807L;
                                break;
                            }
                        }
                        c6949z.f11972h = j3;
                        c6949z.f11970f = true;
                        return 0;
                    }
                } else {
                    if (c6949z.f11972h != -9223372036854775807L) {
                        if (!c6949z.f11969e) {
                            int min2 = (int) Math.min(i7, j4);
                            long j6 = 0;
                            if (c6820e3.f11126d != j6) {
                                c6904s.f11618a = j6;
                            } else {
                                c7436v.m4995w(min2);
                                c6820e3.f11128f = 0;
                                c6820e3.mo5928d(c7436v.f13978a, 0, min2, false);
                                int i14 = c7436v.f13979b;
                                int i15 = c7436v.f13980c;
                                while (true) {
                                    if (i14 < i15) {
                                        if (c7436v.f13978a[i14] == 71) {
                                            long m10607d2 = C1349a.m10607d(c7436v, i14, i6);
                                            if (m10607d2 != -9223372036854775807L) {
                                                j2 = m10607d2;
                                                break;
                                            }
                                        }
                                        i14++;
                                    } else {
                                        j2 = -9223372036854775807L;
                                        break;
                                    }
                                }
                                c6949z.f11971g = j2;
                                c6949z.f11969e = true;
                                return 0;
                            }
                        } else {
                            long j7 = c6949z.f11971g;
                            if (j7 != -9223372036854775807L) {
                                C7404e0 c7404e0 = c6949z.f11966b;
                                long m5111b = c7404e0.m5111b(c6949z.f11972h) - c7404e0.m5111b(j7);
                                c6949z.f11973i = m5111b;
                                if (m5111b < 0) {
                                    StringBuilder sb = new StringBuilder(65);
                                    sb.append("Invalid duration: ");
                                    sb.append(m5111b);
                                    sb.append(". Using TIME_UNSET instead.");
                                    Log.w("TsDurationReader", sb.toString());
                                    c6949z.f11973i = -9223372036854775807L;
                                }
                            }
                        }
                    }
                    c6949z.m5813a(c6820e3);
                    return 0;
                }
                return 1;
            }
            if (!this.f11648o) {
                this.f11648o = true;
                long j8 = c6949z.f11973i;
                if (j8 != -9223372036854775807L) {
                    c6820e2 = c6820e3;
                    j = 0;
                    z8 = false;
                    C6947y c6947y = new C6947y(c6949z.f11966b, j8, j4, this.f11652s, this.f11635b);
                    this.f11644k = c6947y;
                    InterfaceC6833i interfaceC6833i2 = this.f11645l;
                    c6907b = c6947y.f11071a;
                    interfaceC6833i = interfaceC6833i2;
                    z7 = true;
                    i = i5;
                } else {
                    c6820e2 = c6820e3;
                    j = 0;
                    z7 = true;
                    i = i5;
                    z8 = false;
                    interfaceC6833i = this.f11645l;
                    c6907b = new InterfaceC6905t.C6907b(j8);
                }
                interfaceC6833i.mo5484a(c6907b);
                r3 = z7;
                r15 = z8;
            } else {
                c6820e2 = c6820e3;
                j = 0;
                r3 = 1;
                i = i5;
                r15 = 0;
            }
            if (this.f11649p) {
                this.f11649p = r15;
                mo5804g(j, j);
                c6820e = c6820e2;
                if (c6820e.f11126d != j) {
                    c6904s.f11618a = j;
                    return r3 == true ? 1 : 0;
                }
                c6904s2 = c6904s;
            } else {
                c6904s2 = c6904s;
                c6820e = c6820e2;
            }
            C6947y c6947y2 = this.f11644k;
            if (c6947y2 != null) {
                if (c6947y2.f11073c != null) {
                    z6 = r3 == true ? 1 : 0;
                } else {
                    z6 = r15 == true ? 1 : 0;
                }
                if (z6) {
                    return c6947y2.m5959a(c6820e, c6904s2);
                }
            }
        } else {
            c6820e = c6820e3;
            r3 = 1;
            i = i5;
            r15 = 0;
        }
        C7436v c7436v2 = this.f11637d;
        byte[] bArr2 = c7436v2.f13978a;
        int i16 = c7436v2.f13979b;
        if (9400 - i16 < 188) {
            int i17 = c7436v2.f13980c - i16;
            if (i17 > 0) {
                System.arraycopy(bArr2, i16, bArr2, r15, i17);
            }
            c7436v2.m4994x(i17, bArr2);
        }
        while (true) {
            int i18 = c7436v2.f13980c;
            if (i18 - c7436v2.f13979b < 188) {
                int read = c6820e.read(bArr2, i18, 9400 - i18);
                if (read == -1) {
                    z = r15;
                    break;
                }
                c7436v2.m4993y(i18 + read);
            } else {
                z = r3;
                break;
            }
        }
        if (!z) {
            return -1;
        }
        int i19 = c7436v2.f13979b;
        int i20 = c7436v2.f13980c;
        byte[] bArr3 = c7436v2.f13978a;
        int i21 = i19;
        while (i21 < i20 && bArr3[i21] != 71) {
            i21++;
        }
        c7436v2.m4992z(i21);
        int i22 = i21 + 188;
        TsPayloadReader tsPayloadReader = null;
        if (i22 > i20) {
            int i23 = (i21 - i19) + this.f11651r;
            this.f11651r = i23;
            i2 = 2;
            if (i == 2 && i23 > 376) {
                throw C7506y0.m4869a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i2 = 2;
            this.f11651r = r15;
        }
        int i24 = c7436v2.f13980c;
        if (i22 > i24) {
            return r15;
        }
        int m5015c = c7436v2.m5015c();
        if ((8388608 & m5015c) != 0) {
            c7436v2.m4992z(i22);
            return r15;
        }
        if ((4194304 & m5015c) != 0) {
            i3 = r3;
        } else {
            i3 = r15;
        }
        int i25 = i3 | r15;
        int i26 = (2096896 & m5015c) >> 8;
        if ((m5015c & 32) != 0) {
            z2 = r3;
        } else {
            z2 = r15;
        }
        if ((m5015c & 16) != 0) {
            z3 = r3;
        } else {
            z3 = r15;
        }
        if (z3) {
            tsPayloadReader = this.f11640g.get(i26);
        }
        if (tsPayloadReader == null) {
            c7436v2.m4992z(i22);
            return r15;
        }
        if (i != i2) {
            int i27 = m5015c & 15;
            SparseIntArray sparseIntArray = this.f11638e;
            int i28 = sparseIntArray.get(i26, i27 - 1);
            sparseIntArray.put(i26, i27);
            if (i28 == i27) {
                c7436v2.m4992z(i22);
                return r15;
            } else if (i27 != ((i28 + r3) & 15)) {
                tsPayloadReader.mo5817c();
            }
        }
        if (z2) {
            int m5002p = c7436v2.m5002p();
            if ((c7436v2.m5002p() & 64) != 0) {
                i4 = 2;
            } else {
                i4 = r15;
            }
            i25 |= i4;
            c7436v2.m5018A(m5002p - r3);
        }
        boolean z12 = this.f11647n;
        if (i != 2 && !z12 && this.f11642i.get(i26, r15)) {
            z4 = r15;
        } else {
            z4 = r3;
        }
        if (z4) {
            c7436v2.m4993y(i22);
            tsPayloadReader.mo5818b(i25, c7436v2);
            c7436v2.m4993y(i24);
        }
        if (i != 2 && !z12 && this.f11647n && j4 != -1) {
            this.f11649p = r3;
        }
        c7436v2.m4992z(i22);
        return r15;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: f */
    public final void mo5805f(InterfaceC6833i interfaceC6833i) {
        this.f11645l = interfaceC6833i;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public final void mo5804g(long j, long j2) {
        C6947y c6947y;
        C7394a.m5131d(this.f11634a != 2);
        List<C7404e0> list = this.f11636c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C7404e0 c7404e0 = list.get(i);
            boolean z = c7404e0.m5109d() == -9223372036854775807L;
            if (!z) {
                long m5110c = c7404e0.m5110c();
                z = (m5110c == -9223372036854775807L || m5110c == 0 || m5110c == j2) ? false : true;
            }
            if (z) {
                c7404e0.m5108e(j2);
            }
        }
        if (j2 != 0 && (c6947y = this.f11644k) != null) {
            c6947y.m5957c(j2);
        }
        this.f11637d.m4995w(0);
        this.f11638e.clear();
        int i2 = 0;
        while (true) {
            SparseArray<TsPayloadReader> sparseArray = this.f11640g;
            if (i2 >= sparseArray.size()) {
                this.f11651r = 0;
                return;
            } else {
                sparseArray.valueAt(i2).mo5817c();
                i2++;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}

package com.google.android.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.drm.C6779g;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.InterfaceC6832h;
import com.google.android.exoplayer2.extractor.InterfaceC6833i;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mp4.AbstractC6865a;
import com.google.android.exoplayer2.extractor.mp4.C6876f;
import com.google.android.exoplayer2.metadata.emsg.C7056c;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7427r;
import com.google.android.exoplayer2.util.C7436v;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class FragmentedMp4Extractor implements Extractor {

    /* renamed from: F */
    public static final byte[] f11377F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: G */
    public static final C7003m0 f11378G;

    /* renamed from: A */
    public boolean f11379A;

    /* renamed from: B */
    public InterfaceC6833i f11380B;

    /* renamed from: C */
    public TrackOutput[] f11381C;

    /* renamed from: D */
    public TrackOutput[] f11382D;

    /* renamed from: E */
    public boolean f11383E;

    /* renamed from: a */
    public final int f11384a;

    /* renamed from: b */
    public final List<C7003m0> f11385b;

    /* renamed from: c */
    public final SparseArray<C6863b> f11386c;

    /* renamed from: d */
    public final C7436v f11387d;

    /* renamed from: e */
    public final C7436v f11388e;

    /* renamed from: f */
    public final C7436v f11389f;

    /* renamed from: g */
    public final byte[] f11390g;

    /* renamed from: h */
    public final C7436v f11391h;

    /* renamed from: i */
    public final C7056c f11392i;

    /* renamed from: j */
    public final C7436v f11393j;

    /* renamed from: k */
    public final ArrayDeque<AbstractC6865a.C6866a> f11394k;

    /* renamed from: l */
    public final ArrayDeque<C6862a> f11395l;

    /* renamed from: m */
    public int f11396m;

    /* renamed from: n */
    public int f11397n;

    /* renamed from: o */
    public long f11398o;

    /* renamed from: p */
    public int f11399p;
    @Nullable

    /* renamed from: q */
    public C7436v f11400q;

    /* renamed from: r */
    public long f11401r;

    /* renamed from: s */
    public int f11402s;

    /* renamed from: t */
    public long f11403t;

    /* renamed from: u */
    public long f11404u;

    /* renamed from: v */
    public long f11405v;
    @Nullable

    /* renamed from: w */
    public C6863b f11406w;

    /* renamed from: x */
    public int f11407x;

    /* renamed from: y */
    public int f11408y;

    /* renamed from: z */
    public int f11409z;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Flags {
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$a */
    /* loaded from: classes.dex */
    public static final class C6862a {

        /* renamed from: a */
        public final long f11410a;

        /* renamed from: b */
        public final int f11411b;

        public C6862a(long j, int i) {
            this.f11410a = j;
            this.f11411b = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor$b */
    /* loaded from: classes.dex */
    public static final class C6863b {

        /* renamed from: a */
        public final TrackOutput f11412a;

        /* renamed from: d */
        public C6883k f11415d;

        /* renamed from: e */
        public C6873c f11416e;

        /* renamed from: f */
        public int f11417f;

        /* renamed from: g */
        public int f11418g;

        /* renamed from: h */
        public int f11419h;

        /* renamed from: i */
        public int f11420i;

        /* renamed from: l */
        public boolean f11423l;

        /* renamed from: b */
        public final C6882j f11413b = new C6882j();

        /* renamed from: c */
        public final C7436v f11414c = new C7436v();

        /* renamed from: j */
        public final C7436v f11421j = new C7436v(1);

        /* renamed from: k */
        public final C7436v f11422k = new C7436v();

        public C6863b(TrackOutput trackOutput, C6883k c6883k, C6873c c6873c) {
            this.f11412a = trackOutput;
            this.f11415d = c6883k;
            this.f11416e = c6873c;
            this.f11415d = c6883k;
            this.f11416e = c6873c;
            trackOutput.mo5451e(c6883k.f11526a.f11457f);
            m5890d();
        }

        @Nullable
        /* renamed from: a */
        public final C6881i m5893a() {
            if (!this.f11423l) {
                return null;
            }
            C6882j c6882j = this.f11413b;
            C6873c c6873c = c6882j.f11508a;
            int i = C7408g0.f13905a;
            int i2 = c6873c.f11486a;
            C6881i c6881i = c6882j.f11521n;
            if (c6881i == null) {
                C6881i[] c6881iArr = this.f11415d.f11526a.f11462k;
                if (c6881iArr == null) {
                    c6881i = null;
                } else {
                    c6881i = c6881iArr[i2];
                }
            }
            if (c6881i == null || !c6881i.f11503a) {
                return null;
            }
            return c6881i;
        }

        /* renamed from: b */
        public final boolean m5892b() {
            this.f11417f++;
            if (this.f11423l) {
                int i = this.f11418g + 1;
                this.f11418g = i;
                int[] iArr = this.f11413b.f11514g;
                int i2 = this.f11419h;
                if (i == iArr[i2]) {
                    this.f11419h = i2 + 1;
                    this.f11418g = 0;
                    return false;
                }
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final int m5891c(int i, int i2) {
            C7436v c7436v;
            boolean z;
            boolean z2;
            int i3;
            C6881i m5893a = m5893a();
            if (m5893a == null) {
                return 0;
            }
            C6882j c6882j = this.f11413b;
            int i4 = m5893a.f11506d;
            if (i4 != 0) {
                c7436v = c6882j.f11522o;
            } else {
                int i5 = C7408g0.f13905a;
                byte[] bArr = m5893a.f11507e;
                int length = bArr.length;
                C7436v c7436v2 = this.f11422k;
                c7436v2.m4994x(length, bArr);
                i4 = bArr.length;
                c7436v = c7436v2;
            }
            int i6 = this.f11417f;
            if (c6882j.f11519l && c6882j.f11520m[i6]) {
                z = true;
            } else {
                z = false;
            }
            if (!z && i2 == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            C7436v c7436v3 = this.f11421j;
            byte[] bArr2 = c7436v3.f13978a;
            if (z2) {
                i3 = 128;
            } else {
                i3 = 0;
            }
            bArr2[0] = (byte) (i3 | i4);
            c7436v3.m4992z(0);
            TrackOutput trackOutput = this.f11412a;
            trackOutput.mo5453c(c7436v3, 1);
            trackOutput.mo5453c(c7436v, i4);
            if (!z2) {
                return i4 + 1;
            }
            C7436v c7436v4 = this.f11414c;
            if (!z) {
                c7436v4.m4995w(8);
                byte[] bArr3 = c7436v4.f13978a;
                bArr3[0] = 0;
                bArr3[1] = 1;
                bArr3[2] = (byte) ((i2 >> 8) & 255);
                bArr3[3] = (byte) (i2 & 255);
                bArr3[4] = (byte) ((i >> 24) & 255);
                bArr3[5] = (byte) ((i >> 16) & 255);
                bArr3[6] = (byte) ((i >> 8) & 255);
                bArr3[7] = (byte) (i & 255);
                trackOutput.mo5453c(c7436v4, 8);
                return i4 + 1 + 8;
            }
            C7436v c7436v5 = c6882j.f11522o;
            int m4997u = c7436v5.m4997u();
            c7436v5.m5018A(-2);
            int i7 = (m4997u * 6) + 2;
            if (i2 != 0) {
                c7436v4.m4995w(i7);
                byte[] bArr4 = c7436v4.f13978a;
                c7436v5.m5016b(0, bArr4, i7);
                int i8 = (((bArr4[2] & 255) << 8) | (bArr4[3] & 255)) + i2;
                bArr4[2] = (byte) ((i8 >> 8) & 255);
                bArr4[3] = (byte) (i8 & 255);
            } else {
                c7436v4 = c7436v5;
            }
            trackOutput.mo5453c(c7436v4, i7);
            return i4 + 1 + i7;
        }

        /* renamed from: d */
        public final void m5890d() {
            C6882j c6882j = this.f11413b;
            c6882j.f11511d = 0;
            c6882j.f11524q = 0L;
            c6882j.f11525r = false;
            c6882j.f11519l = false;
            c6882j.f11523p = false;
            c6882j.f11521n = null;
            this.f11417f = 0;
            this.f11419h = 0;
            this.f11418g = 0;
            this.f11420i = 0;
            this.f11423l = false;
        }
    }

    static {
        C7003m0.C7005b c7005b = new C7003m0.C7005b();
        c7005b.f12316k = "application/x-emsg";
        f11378G = c7005b.m5614a();
    }

    public FragmentedMp4Extractor() {
        List emptyList = Collections.emptyList();
        this.f11384a = 0;
        this.f11385b = Collections.unmodifiableList(emptyList);
        this.f11392i = new C7056c();
        this.f11393j = new C7436v(16);
        this.f11387d = new C7436v(C7427r.f13945a);
        this.f11388e = new C7436v(5);
        this.f11389f = new C7436v();
        byte[] bArr = new byte[16];
        this.f11390g = bArr;
        this.f11391h = new C7436v(bArr);
        this.f11394k = new ArrayDeque<>();
        this.f11395l = new ArrayDeque<>();
        this.f11386c = new SparseArray<>();
        this.f11404u = -9223372036854775807L;
        this.f11403t = -9223372036854775807L;
        this.f11405v = -9223372036854775807L;
        this.f11380B = InterfaceC6833i.f11181a0;
        this.f11381C = new TrackOutput[0];
        this.f11382D = new TrackOutput[0];
    }

    @Nullable
    /* renamed from: a */
    public static C6779g m5896a(ArrayList arrayList) {
        UUID uuid;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            AbstractC6865a.C6867b c6867b = (AbstractC6865a.C6867b) arrayList.get(i);
            if (c6867b.f11463a == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = c6867b.f11467b.f13978a;
                C6876f.C6877a m5871a = C6876f.m5871a(bArr);
                if (m5871a == null) {
                    uuid = null;
                } else {
                    uuid = m5871a.f11492a;
                }
                if (uuid == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new C6779g.C6781b(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new C6779g(null, false, (C6779g.C6781b[]) arrayList2.toArray(new C6779g.C6781b[0]));
    }

    /* renamed from: c */
    public static void m5895c(C7436v c7436v, int i, C6882j c6882j) throws C7506y0 {
        boolean z;
        c7436v.m4992z(i + 8);
        int m5015c = c7436v.m5015c() & 16777215;
        if ((m5015c & 1) == 0) {
            if ((m5015c & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            int m4999s = c7436v.m4999s();
            if (m4999s == 0) {
                Arrays.fill(c6882j.f11520m, 0, c6882j.f11512e, false);
                return;
            }
            int i2 = c6882j.f11512e;
            if (m4999s == i2) {
                Arrays.fill(c6882j.f11520m, 0, m4999s, z);
                int i3 = c7436v.f13980c - c7436v.f13979b;
                C7436v c7436v2 = c6882j.f11522o;
                c7436v2.m4995w(i3);
                c6882j.f11519l = true;
                c6882j.f11523p = true;
                c7436v.m5016b(0, c7436v2.f13978a, c7436v2.f13980c);
                c7436v2.m4992z(0);
                c6882j.f11523p = false;
                return;
            }
            StringBuilder sb = new StringBuilder(80);
            sb.append("Senc sample count ");
            sb.append(m4999s);
            sb.append(" is different from fragment sample count");
            sb.append(i2);
            throw C7506y0.m4869a(sb.toString(), null);
        }
        throw C7506y0.m4868b("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public final boolean mo5807b(InterfaceC6832h interfaceC6832h) throws IOException {
        return C6880h.m5869a(interfaceC6832h, true, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:334:0x07a0, code lost:
        r6 = r0;
        r6.f11396m = 0;
        r6.f11399p = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x07a6, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x068c  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5894d(long r51) throws com.google.android.exoplayer2.C7506y0 {
        /*
            Method dump skipped, instructions count: 1959
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.m5894d(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x02ed, code lost:
        if (r2.m5892b() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02f1, code lost:
        r1.f11396m = 3;
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0109, code lost:
        if (r2.m5892b() == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010b, code lost:
        r1.f11406w = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01de, code lost:
        if ((r13 & 31) != 6) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0775 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0781 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0777 A[SYNTHETIC] */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo5806e(com.google.android.exoplayer2.extractor.InterfaceC6832h r25, com.google.android.exoplayer2.extractor.C6904s r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1928
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.mo5806e(com.google.android.exoplayer2.extractor.h, com.google.android.exoplayer2.extractor.s):int");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: f */
    public final void mo5805f(InterfaceC6833i interfaceC6833i) {
        int i;
        this.f11380B = interfaceC6833i;
        int i2 = 0;
        this.f11396m = 0;
        this.f11399p = 0;
        TrackOutput[] trackOutputArr = new TrackOutput[2];
        this.f11381C = trackOutputArr;
        int i3 = 100;
        if ((this.f11384a & 4) != 0) {
            trackOutputArr[0] = interfaceC6833i.mo5482p(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        TrackOutput[] trackOutputArr2 = (TrackOutput[]) C7408g0.m5083w(i, this.f11381C);
        this.f11381C = trackOutputArr2;
        for (TrackOutput trackOutput : trackOutputArr2) {
            trackOutput.mo5451e(f11378G);
        }
        List<C7003m0> list = this.f11385b;
        this.f11382D = new TrackOutput[list.size()];
        while (i2 < this.f11382D.length) {
            TrackOutput mo5482p = this.f11380B.mo5482p(i3, 3);
            mo5482p.mo5451e(list.get(i2));
            this.f11382D[i2] = mo5482p;
            i2++;
            i3++;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public final void mo5804g(long j, long j2) {
        SparseArray<C6863b> sparseArray = this.f11386c;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.valueAt(i).m5890d();
        }
        this.f11395l.clear();
        this.f11402s = 0;
        this.f11403t = j2;
        this.f11394k.clear();
        this.f11396m = 0;
        this.f11399p = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}

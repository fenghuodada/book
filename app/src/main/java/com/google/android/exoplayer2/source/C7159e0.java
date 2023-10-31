package com.google.android.exoplayer2.source;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.analytics.C6651l;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.InterfaceC6789n;
import com.google.android.exoplayer2.drm.InterfaceC6792o;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.C7154d0;
import com.google.android.exoplayer2.upstream.C7344a;
import com.google.android.exoplayer2.upstream.C7367l;
import com.google.android.exoplayer2.upstream.InterfaceC7361g;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7424q;
import com.google.android.exoplayer2.util.C7436v;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.source.e0 */
/* loaded from: classes.dex */
public final class C7159e0 implements TrackOutput {
    @Nullable

    /* renamed from: A */
    public C7003m0 f12833A;

    /* renamed from: B */
    public boolean f12834B;

    /* renamed from: C */
    public boolean f12835C;

    /* renamed from: a */
    public final C7154d0 f12836a;
    @Nullable

    /* renamed from: d */
    public final InterfaceC6792o f12839d;
    @Nullable

    /* renamed from: e */
    public final InterfaceC6789n.C6790a f12840e;
    @Nullable

    /* renamed from: f */
    public final Looper f12841f;
    @Nullable

    /* renamed from: g */
    public InterfaceC7162c f12842g;
    @Nullable

    /* renamed from: h */
    public C7003m0 f12843h;
    @Nullable

    /* renamed from: i */
    public DrmSession f12844i;

    /* renamed from: q */
    public int f12852q;

    /* renamed from: r */
    public int f12853r;

    /* renamed from: s */
    public int f12854s;

    /* renamed from: t */
    public int f12855t;

    /* renamed from: x */
    public boolean f12859x;

    /* renamed from: b */
    public final C7160a f12837b = new C7160a();

    /* renamed from: j */
    public int f12845j = 1000;

    /* renamed from: k */
    public int[] f12846k = new int[1000];

    /* renamed from: l */
    public long[] f12847l = new long[1000];

    /* renamed from: o */
    public long[] f12850o = new long[1000];

    /* renamed from: n */
    public int[] f12849n = new int[1000];

    /* renamed from: m */
    public int[] f12848m = new int[1000];

    /* renamed from: p */
    public TrackOutput.C6809a[] f12851p = new TrackOutput.C6809a[1000];

    /* renamed from: c */
    public final C7173i0<C7161b> f12838c = new C7173i0<>(new C6651l());

    /* renamed from: u */
    public long f12856u = Long.MIN_VALUE;

    /* renamed from: v */
    public long f12857v = Long.MIN_VALUE;

    /* renamed from: w */
    public long f12858w = Long.MIN_VALUE;

    /* renamed from: z */
    public boolean f12861z = true;

    /* renamed from: y */
    public boolean f12860y = true;

    /* renamed from: com.google.android.exoplayer2.source.e0$a */
    /* loaded from: classes.dex */
    public static final class C7160a {

        /* renamed from: a */
        public int f12862a;

        /* renamed from: b */
        public long f12863b;
        @Nullable

        /* renamed from: c */
        public TrackOutput.C6809a f12864c;
    }

    /* renamed from: com.google.android.exoplayer2.source.e0$b */
    /* loaded from: classes.dex */
    public static final class C7161b {

        /* renamed from: a */
        public final C7003m0 f12865a;

        /* renamed from: b */
        public final InterfaceC6792o.InterfaceC6794b f12866b;

        public C7161b(C7003m0 c7003m0, InterfaceC6792o.InterfaceC6794b interfaceC6794b) {
            this.f12865a = c7003m0;
            this.f12866b = interfaceC6794b;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.e0$c */
    /* loaded from: classes.dex */
    public interface InterfaceC7162c {
    }

    public C7159e0(C7367l c7367l, @Nullable Looper looper, @Nullable InterfaceC6792o interfaceC6792o, @Nullable InterfaceC6789n.C6790a c6790a) {
        this.f12841f = looper;
        this.f12839d = interfaceC6792o;
        this.f12840e = c6790a;
        this.f12836a = new C7154d0(c7367l);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: a */
    public final int mo5455a(InterfaceC7361g interfaceC7361g, int i, boolean z) {
        return m5439q(interfaceC7361g, i, z);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: b */
    public final void mo5454b(int i, C7436v c7436v) {
        mo5453c(c7436v, i);
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: c */
    public final void mo5453c(C7436v c7436v, int i) {
        while (true) {
            C7154d0 c7154d0 = this.f12836a;
            if (i > 0) {
                int m5464b = c7154d0.m5464b(i);
                C7154d0.C7155a c7155a = c7154d0.f12814f;
                C7344a c7344a = c7155a.f12819d;
                c7436v.m5016b(((int) (c7154d0.f12815g - c7155a.f12816a)) + c7344a.f13723b, c7344a.f13722a, m5464b);
                i -= m5464b;
                long j = c7154d0.f12815g + m5464b;
                c7154d0.f12815g = j;
                C7154d0.C7155a c7155a2 = c7154d0.f12814f;
                if (j == c7155a2.f12817b) {
                    c7154d0.f12814f = c7155a2.f12820e;
                }
            } else {
                c7154d0.getClass();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
        if (r9.f12838c.f12891b.valueAt(r10.size() - 1).f12865a.equals(r9.f12833A) == false) goto L46;
     */
    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo5452d(long r10, int r12, int r13, int r14, @androidx.annotation.Nullable com.google.android.exoplayer2.extractor.TrackOutput.C6809a r15) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.C7159e0.mo5452d(long, int, int, int, com.google.android.exoplayer2.extractor.TrackOutput$a):void");
    }

    @Override // com.google.android.exoplayer2.extractor.TrackOutput
    /* renamed from: e */
    public final void mo5451e(C7003m0 c7003m0) {
        boolean z;
        boolean z2;
        SparseArray<C7161b> sparseArray;
        SparseArray<C7161b> sparseArray2;
        synchronized (this) {
            z = false;
            this.f12861z = false;
            if (!C7408g0.m5105a(c7003m0, this.f12833A)) {
                if (this.f12838c.f12891b.size() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    if (this.f12838c.f12891b.valueAt(sparseArray.size() - 1).f12865a.equals(c7003m0)) {
                        c7003m0 = this.f12838c.f12891b.valueAt(sparseArray2.size() - 1).f12865a;
                    }
                }
                this.f12833A = c7003m0;
                this.f12834B = C7424q.m5049a(c7003m0.f12287l, c7003m0.f12284i);
                this.f12835C = false;
                z = true;
            }
        }
        InterfaceC7162c interfaceC7162c = this.f12842g;
        if (interfaceC7162c != null && z) {
            C7139a0 c7139a0 = (C7139a0) interfaceC7162c;
            c7139a0.f12733p.post(c7139a0.f12731n);
        }
    }

    @GuardedBy("this")
    /* renamed from: f */
    public final long m5450f(int i) {
        int i2;
        this.f12857v = Math.max(this.f12857v, m5446j(i));
        this.f12852q -= i;
        int i3 = this.f12853r + i;
        this.f12853r = i3;
        int i4 = this.f12854s + i;
        this.f12854s = i4;
        int i5 = this.f12845j;
        if (i4 >= i5) {
            this.f12854s = i4 - i5;
        }
        int i6 = this.f12855t - i;
        this.f12855t = i6;
        int i7 = 0;
        if (i6 < 0) {
            this.f12855t = 0;
        }
        while (true) {
            C7173i0<C7161b> c7173i0 = this.f12838c;
            SparseArray<C7161b> sparseArray = c7173i0.f12891b;
            if (i7 >= sparseArray.size() - 1) {
                break;
            }
            int i8 = i7 + 1;
            if (i3 < sparseArray.keyAt(i8)) {
                break;
            }
            c7173i0.f12892c.accept(sparseArray.valueAt(i7));
            sparseArray.removeAt(i7);
            int i9 = c7173i0.f12890a;
            if (i9 > 0) {
                c7173i0.f12890a = i9 - 1;
            }
            i7 = i8;
        }
        if (this.f12852q == 0) {
            int i10 = this.f12854s;
            if (i10 == 0) {
                i10 = this.f12845j;
            }
            return this.f12847l[i10 - 1] + this.f12848m[i2];
        }
        return this.f12847l[this.f12854s];
    }

    /* renamed from: g */
    public final void m5449g() {
        long m5450f;
        C7154d0 c7154d0 = this.f12836a;
        synchronized (this) {
            int i = this.f12852q;
            if (i == 0) {
                m5450f = -1;
            } else {
                m5450f = m5450f(i);
            }
        }
        c7154d0.m5465a(m5450f);
    }

    /* renamed from: h */
    public final int m5448h(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f12850o[i];
            if (j2 > j) {
                return i3;
            }
            if (!z || (this.f12849n[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f12845j) {
                i = 0;
            }
        }
        return i3;
    }

    /* renamed from: i */
    public final synchronized long m5447i() {
        return this.f12858w;
    }

    /* renamed from: j */
    public final long m5446j(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int m5445k = m5445k(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.f12850o[m5445k]);
            if ((this.f12849n[m5445k] & 1) != 0) {
                break;
            }
            m5445k--;
            if (m5445k == -1) {
                m5445k = this.f12845j - 1;
            }
        }
        return j;
    }

    /* renamed from: k */
    public final int m5445k(int i) {
        int i2 = this.f12854s + i;
        int i3 = this.f12845j;
        return i2 < i3 ? i2 : i2 - i3;
    }

    @Nullable
    /* renamed from: l */
    public final synchronized C7003m0 m5444l() {
        return this.f12861z ? null : this.f12833A;
    }

    @CallSuper
    /* renamed from: m */
    public final synchronized boolean m5443m(boolean z) {
        boolean z2;
        C7003m0 c7003m0;
        int i = this.f12855t;
        boolean z3 = true;
        if (i != this.f12852q) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (!z && !this.f12859x && ((c7003m0 = this.f12833A) == null || c7003m0 == this.f12843h)) {
                z3 = false;
            }
            return z3;
        } else if (this.f12838c.m5421a(this.f12853r + i).f12865a != this.f12843h) {
            return true;
        } else {
            return m5442n(m5445k(this.f12855t));
        }
    }

    /* renamed from: n */
    public final boolean m5442n(int i) {
        DrmSession drmSession = this.f12844i;
        return drmSession == null || drmSession.getState() == 4 || ((this.f12849n[i] & 1073741824) == 0 && this.f12844i.mo5975d());
    }

    @CallSuper
    /* renamed from: o */
    public final void m5441o(boolean z) {
        C7173i0<C7161b> c7173i0;
        SparseArray<C7161b> sparseArray;
        C7154d0 c7154d0 = this.f12836a;
        C7154d0.C7155a c7155a = c7154d0.f12812d;
        boolean z2 = c7155a.f12818c;
        int i = 0;
        C7367l c7367l = c7154d0.f12809a;
        int i2 = c7154d0.f12810b;
        if (z2) {
            C7154d0.C7155a c7155a2 = c7154d0.f12814f;
            int i3 = (((int) (c7155a2.f12816a - c7155a.f12816a)) / i2) + (c7155a2.f12818c ? 1 : 0);
            C7344a[] c7344aArr = new C7344a[i3];
            int i4 = 0;
            while (i4 < i3) {
                c7344aArr[i4] = c7155a.f12819d;
                c7155a.f12819d = null;
                C7154d0.C7155a c7155a3 = c7155a.f12820e;
                c7155a.f12820e = null;
                i4++;
                c7155a = c7155a3;
            }
            c7367l.m5171a(c7344aArr);
        }
        C7154d0.C7155a c7155a4 = new C7154d0.C7155a(0L, i2);
        c7154d0.f12812d = c7155a4;
        c7154d0.f12813e = c7155a4;
        c7154d0.f12814f = c7155a4;
        c7154d0.f12815g = 0L;
        c7367l.m5169c();
        this.f12852q = 0;
        this.f12853r = 0;
        this.f12854s = 0;
        this.f12855t = 0;
        this.f12860y = true;
        this.f12856u = Long.MIN_VALUE;
        this.f12857v = Long.MIN_VALUE;
        this.f12858w = Long.MIN_VALUE;
        this.f12859x = false;
        while (true) {
            c7173i0 = this.f12838c;
            sparseArray = c7173i0.f12891b;
            if (i >= sparseArray.size()) {
                break;
            }
            c7173i0.f12892c.accept(sparseArray.valueAt(i));
            i++;
        }
        c7173i0.f12890a = -1;
        sparseArray.clear();
        if (z) {
            this.f12833A = null;
            this.f12861z = true;
        }
    }

    /* renamed from: p */
    public final synchronized void m5440p() {
        this.f12855t = 0;
        C7154d0 c7154d0 = this.f12836a;
        c7154d0.f12813e = c7154d0.f12812d;
    }

    /* renamed from: q */
    public final int m5439q(InterfaceC7361g interfaceC7361g, int i, boolean z) throws IOException {
        C7154d0 c7154d0 = this.f12836a;
        int m5464b = c7154d0.m5464b(i);
        C7154d0.C7155a c7155a = c7154d0.f12814f;
        C7344a c7344a = c7155a.f12819d;
        int read = interfaceC7361g.read(c7344a.f13722a, ((int) (c7154d0.f12815g - c7155a.f12816a)) + c7344a.f13723b, m5464b);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = c7154d0.f12815g + read;
        c7154d0.f12815g = j;
        C7154d0.C7155a c7155a2 = c7154d0.f12814f;
        if (j == c7155a2.f12817b) {
            c7154d0.f12814f = c7155a2.f12820e;
            return read;
        }
        return read;
    }

    /* renamed from: r */
    public final synchronized boolean m5438r(long j, boolean z) {
        boolean z2;
        m5440p();
        int m5445k = m5445k(this.f12855t);
        int i = this.f12855t;
        int i2 = this.f12852q;
        if (i != i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && j >= this.f12850o[m5445k] && (j <= this.f12858w || z)) {
            int m5448h = m5448h(m5445k, i2 - i, j, true);
            if (m5448h == -1) {
                return false;
            }
            this.f12856u = j;
            this.f12855t += m5448h;
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final synchronized void m5437s(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.f12855t + i <= this.f12852q) {
                    z = true;
                    C7394a.m5134a(z);
                    this.f12855t += i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        C7394a.m5134a(z);
        this.f12855t += i;
    }
}

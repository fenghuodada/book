package com.google.android.exoplayer2;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7127q0;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.j1 */
/* loaded from: classes.dex */
public abstract class AbstractC6984j1 {

    /* renamed from: a */
    public static final C6985a f12151a = new C6985a();

    /* renamed from: com.google.android.exoplayer2.j1$a */
    /* loaded from: classes.dex */
    public class C6985a extends AbstractC6984j1 {
        @Override // com.google.android.exoplayer2.AbstractC6984j1
        /* renamed from: b */
        public final int mo5414b(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.AbstractC6984j1
        /* renamed from: f */
        public final C6986b mo5413f(int i, C6986b c6986b, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.AbstractC6984j1
        /* renamed from: h */
        public final int mo5412h() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.AbstractC6984j1
        /* renamed from: l */
        public final Object mo5411l(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.AbstractC6984j1
        /* renamed from: n */
        public final C6987c mo5410n(int i, C6987c c6987c, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.AbstractC6984j1
        /* renamed from: o */
        public final int mo5409o() {
            return 0;
        }
    }

    /* renamed from: com.google.android.exoplayer2.j1$b */
    /* loaded from: classes.dex */
    public static final class C6986b {
        @Nullable

        /* renamed from: a */
        public Object f12152a;
        @Nullable

        /* renamed from: b */
        public Object f12153b;

        /* renamed from: c */
        public int f12154c;

        /* renamed from: d */
        public long f12155d;

        /* renamed from: e */
        public long f12156e;

        /* renamed from: f */
        public boolean f12157f;

        /* renamed from: g */
        public AdPlaybackState f12158g = AdPlaybackState.f12766g;

        /* renamed from: a */
        public final long m5684a(int i, int i2) {
            AdPlaybackState.C7145a m5472a = this.f12158g.m5472a(i);
            if (m5472a.f12775b != -1) {
                return m5472a.f12778e[i2];
            }
            return -9223372036854775807L;
        }

        /* renamed from: b */
        public final int m5683b(long j) {
            int i;
            boolean z;
            AdPlaybackState adPlaybackState = this.f12158g;
            long j2 = this.f12155d;
            adPlaybackState.getClass();
            if (j == Long.MIN_VALUE) {
                return -1;
            }
            if (j2 != -9223372036854775807L && j >= j2) {
                return -1;
            }
            int i2 = adPlaybackState.f12772e;
            while (true) {
                i = adPlaybackState.f12769b;
                if (i2 >= i) {
                    break;
                }
                if (adPlaybackState.m5472a(i2).f12774a == Long.MIN_VALUE || adPlaybackState.m5472a(i2).f12774a > j) {
                    AdPlaybackState.C7145a m5472a = adPlaybackState.m5472a(i2);
                    int i3 = m5472a.f12775b;
                    if (i3 != -1 && m5472a.m5471a(-1) >= i3) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        break;
                    }
                }
                i2++;
            }
            if (i2 >= i) {
                return -1;
            }
            return i2;
        }

        /* renamed from: c */
        public final int m5682c(int i) {
            return this.f12158g.m5472a(i).m5471a(-1);
        }

        /* renamed from: d */
        public final boolean m5681d(int i) {
            return this.f12158g.m5472a(i).f12780g;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C6986b.class.equals(obj.getClass())) {
                return false;
            }
            C6986b c6986b = (C6986b) obj;
            return C7408g0.m5105a(this.f12152a, c6986b.f12152a) && C7408g0.m5105a(this.f12153b, c6986b.f12153b) && this.f12154c == c6986b.f12154c && this.f12155d == c6986b.f12155d && this.f12156e == c6986b.f12156e && this.f12157f == c6986b.f12157f && C7408g0.m5105a(this.f12158g, c6986b.f12158g);
        }

        public final int hashCode() {
            Object obj = this.f12152a;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f12153b;
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            long j = this.f12155d;
            long j2 = this.f12156e;
            return this.f12158g.hashCode() + ((((((((((hashCode + hashCode2) * 31) + this.f12154c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f12157f ? 1 : 0)) * 31);
        }
    }

    /* renamed from: com.google.android.exoplayer2.j1$c */
    /* loaded from: classes.dex */
    public static final class C6987c {

        /* renamed from: r */
        public static final Object f12159r = new Object();

        /* renamed from: s */
        public static final C7127q0 f12160s;
        @Nullable
        @Deprecated

        /* renamed from: b */
        public Object f12162b;
        @Nullable

        /* renamed from: d */
        public Object f12164d;

        /* renamed from: e */
        public long f12165e;

        /* renamed from: f */
        public long f12166f;

        /* renamed from: g */
        public long f12167g;

        /* renamed from: h */
        public boolean f12168h;

        /* renamed from: i */
        public boolean f12169i;
        @Deprecated

        /* renamed from: j */
        public boolean f12170j;
        @Nullable

        /* renamed from: k */
        public C7127q0.C7132e f12171k;

        /* renamed from: l */
        public boolean f12172l;

        /* renamed from: m */
        public long f12173m;

        /* renamed from: n */
        public long f12174n;

        /* renamed from: o */
        public int f12175o;

        /* renamed from: p */
        public int f12176p;

        /* renamed from: q */
        public long f12177q;

        /* renamed from: a */
        public Object f12161a = f12159r;

        /* renamed from: c */
        public C7127q0 f12163c = f12160s;

        static {
            C7127q0.C7129b c7129b = new C7127q0.C7129b();
            c7129b.f12646a = "com.google.android.exoplayer2.Timeline";
            c7129b.f12647b = Uri.EMPTY;
            f12160s = c7129b.m5501a();
        }

        /* renamed from: a */
        public final boolean m5680a() {
            C7394a.m5131d(this.f12170j == (this.f12171k != null));
            return this.f12171k != null;
        }

        /* renamed from: b */
        public final void m5679b(@Nullable C7127q0 c7127q0, @Nullable Object obj, long j, long j2, long j3, boolean z, boolean z2, @Nullable C7127q0.C7132e c7132e, long j4, long j5, long j6) {
            C7127q0.C7133f c7133f;
            this.f12161a = f12159r;
            this.f12163c = c7127q0 != null ? c7127q0 : f12160s;
            this.f12162b = (c7127q0 == null || (c7133f = c7127q0.f12642b) == null) ? null : c7133f.f12672f;
            this.f12164d = obj;
            this.f12165e = j;
            this.f12166f = j2;
            this.f12167g = j3;
            this.f12168h = z;
            this.f12169i = z2;
            this.f12170j = c7132e != null;
            this.f12171k = c7132e;
            this.f12173m = j4;
            this.f12174n = j5;
            this.f12175o = 0;
            this.f12176p = 0;
            this.f12177q = j6;
            this.f12172l = false;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C6987c.class.equals(obj.getClass())) {
                return false;
            }
            C6987c c6987c = (C6987c) obj;
            return C7408g0.m5105a(this.f12161a, c6987c.f12161a) && C7408g0.m5105a(this.f12163c, c6987c.f12163c) && C7408g0.m5105a(this.f12164d, c6987c.f12164d) && C7408g0.m5105a(this.f12171k, c6987c.f12171k) && this.f12165e == c6987c.f12165e && this.f12166f == c6987c.f12166f && this.f12167g == c6987c.f12167g && this.f12168h == c6987c.f12168h && this.f12169i == c6987c.f12169i && this.f12172l == c6987c.f12172l && this.f12173m == c6987c.f12173m && this.f12174n == c6987c.f12174n && this.f12175o == c6987c.f12175o && this.f12176p == c6987c.f12176p && this.f12177q == c6987c.f12177q;
        }

        public final int hashCode() {
            int hashCode = (this.f12163c.hashCode() + ((this.f12161a.hashCode() + 217) * 31)) * 31;
            Object obj = this.f12164d;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            C7127q0.C7132e c7132e = this.f12171k;
            int hashCode3 = c7132e != null ? c7132e.hashCode() : 0;
            long j = this.f12165e;
            long j2 = this.f12166f;
            long j3 = this.f12167g;
            long j4 = this.f12173m;
            long j5 = this.f12174n;
            long j6 = this.f12177q;
            return ((((((((((((((((((((((hashCode2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f12168h ? 1 : 0)) * 31) + (this.f12169i ? 1 : 0)) * 31) + (this.f12172l ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f12175o) * 31) + this.f12176p) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }
    }

    /* renamed from: a */
    public int mo5425a(boolean z) {
        return m5685p() ? -1 : 0;
    }

    /* renamed from: b */
    public abstract int mo5414b(Object obj);

    /* renamed from: c */
    public int mo5424c(boolean z) {
        if (m5685p()) {
            return -1;
        }
        return mo5409o() - 1;
    }

    /* renamed from: d */
    public final int m5690d(int i, C6986b c6986b, C6987c c6987c, int i2, boolean z) {
        int i3 = mo5413f(i, c6986b, false).f12154c;
        if (m5686m(i3, c6987c).f12176p == i) {
            int mo5423e = mo5423e(i3, i2, z);
            if (mo5423e == -1) {
                return -1;
            }
            return m5686m(mo5423e, c6987c).f12175o;
        }
        return i + 1;
    }

    /* renamed from: e */
    public int mo5423e(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo5424c(z)) {
                return -1;
            }
            return i + 1;
        } else if (i2 != 1) {
            if (i2 == 2) {
                return i == mo5424c(z) ? mo5425a(z) : i + 1;
            }
            throw new IllegalStateException();
        } else {
            return i;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC6984j1) {
            AbstractC6984j1 abstractC6984j1 = (AbstractC6984j1) obj;
            if (abstractC6984j1.mo5409o() == mo5409o() && abstractC6984j1.mo5412h() == mo5412h()) {
                C6987c c6987c = new C6987c();
                C6986b c6986b = new C6986b();
                C6987c c6987c2 = new C6987c();
                C6986b c6986b2 = new C6986b();
                for (int i = 0; i < mo5409o(); i++) {
                    if (!m5686m(i, c6987c).equals(abstractC6984j1.m5686m(i, c6987c2))) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < mo5412h(); i2++) {
                    if (!mo5413f(i2, c6986b, true).equals(abstractC6984j1.mo5413f(i2, c6986b2, true))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public abstract C6986b mo5413f(int i, C6986b c6986b, boolean z);

    /* renamed from: g */
    public C6986b mo5689g(Object obj, C6986b c6986b) {
        return mo5413f(mo5414b(obj), c6986b, true);
    }

    /* renamed from: h */
    public abstract int mo5412h();

    public final int hashCode() {
        int i;
        C6987c c6987c = new C6987c();
        C6986b c6986b = new C6986b();
        int mo5409o = mo5409o() + 217;
        int i2 = 0;
        while (true) {
            i = mo5409o * 31;
            if (i2 >= mo5409o()) {
                break;
            }
            mo5409o = i + m5686m(i2, c6987c).hashCode();
            i2++;
        }
        int mo5412h = mo5412h() + i;
        for (int i3 = 0; i3 < mo5412h(); i3++) {
            mo5412h = (mo5412h * 31) + mo5413f(i3, c6986b, true).hashCode();
        }
        return mo5412h;
    }

    /* renamed from: i */
    public final Pair<Object, Long> m5688i(C6987c c6987c, C6986b c6986b, int i, long j) {
        Pair<Object, Long> m5687j = m5687j(c6987c, c6986b, i, j, 0L);
        m5687j.getClass();
        return m5687j;
    }

    @Nullable
    /* renamed from: j */
    public final Pair<Object, Long> m5687j(C6987c c6987c, C6986b c6986b, int i, long j, long j2) {
        C7394a.m5132c(i, mo5409o());
        mo5410n(i, c6987c, j2);
        if (j == -9223372036854775807L) {
            j = c6987c.f12173m;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c6987c.f12175o;
        mo5413f(i2, c6986b, false);
        while (i2 < c6987c.f12176p && c6986b.f12156e != j) {
            int i3 = i2 + 1;
            if (mo5413f(i3, c6986b, false).f12156e > j) {
                break;
            }
            i2 = i3;
        }
        mo5413f(i2, c6986b, true);
        long j3 = j - c6986b.f12156e;
        long j4 = c6986b.f12155d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        if (max == 9) {
            Log.e("XXX", "YYY");
        }
        Object obj = c6986b.f12153b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    /* renamed from: k */
    public int mo5422k(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo5425a(z)) {
                return -1;
            }
            return i - 1;
        } else if (i2 != 1) {
            if (i2 == 2) {
                return i == mo5425a(z) ? mo5424c(z) : i - 1;
            }
            throw new IllegalStateException();
        } else {
            return i;
        }
    }

    /* renamed from: l */
    public abstract Object mo5411l(int i);

    /* renamed from: m */
    public final C6987c m5686m(int i, C6987c c6987c) {
        return mo5410n(i, c6987c, 0L);
    }

    /* renamed from: n */
    public abstract C6987c mo5410n(int i, C6987c c6987c, long j);

    /* renamed from: o */
    public abstract int mo5409o();

    /* renamed from: p */
    public final boolean m5685p() {
        return mo5409o() == 0;
    }
}

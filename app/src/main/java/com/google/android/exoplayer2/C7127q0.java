package com.google.android.exoplayer2;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.q0 */
/* loaded from: classes.dex */
public final class C7127q0 {

    /* renamed from: f */
    public static final /* synthetic */ int f12640f = 0;

    /* renamed from: a */
    public final String f12641a;
    @Nullable

    /* renamed from: b */
    public final C7133f f12642b;

    /* renamed from: c */
    public final C7132e f12643c;

    /* renamed from: d */
    public final MediaMetadata f12644d;

    /* renamed from: e */
    public final C7130c f12645e;

    /* renamed from: com.google.android.exoplayer2.q0$a */
    /* loaded from: classes.dex */
    public static final class C7128a {
        public final int hashCode() {
            throw null;
        }
    }

    /* renamed from: com.google.android.exoplayer2.q0$b */
    /* loaded from: classes.dex */
    public static final class C7129b {
        @Nullable

        /* renamed from: a */
        public String f12646a;
        @Nullable

        /* renamed from: b */
        public Uri f12647b;

        /* renamed from: c */
        public final long f12648c = Long.MIN_VALUE;

        /* renamed from: d */
        public final List<Integer> f12649d = Collections.emptyList();

        /* renamed from: e */
        public final List<Object> f12650e;

        /* renamed from: f */
        public final List<Object> f12651f;

        /* renamed from: g */
        public final long f12652g;

        /* renamed from: h */
        public final long f12653h;

        /* renamed from: i */
        public final long f12654i;

        /* renamed from: j */
        public final float f12655j;

        /* renamed from: k */
        public final float f12656k;

        public C7129b() {
            Collections.emptyMap();
            this.f12650e = Collections.emptyList();
            this.f12651f = Collections.emptyList();
            this.f12652g = -9223372036854775807L;
            this.f12653h = -9223372036854775807L;
            this.f12654i = -9223372036854775807L;
            this.f12655j = -3.4028235E38f;
            this.f12656k = -3.4028235E38f;
        }

        /* renamed from: a */
        public final C7127q0 m5501a() {
            Uri uri = this.f12647b;
            C7133f c7133f = uri != null ? new C7133f(uri, null, null, null, this.f12650e, null, this.f12651f, null) : null;
            String str = this.f12646a;
            if (str == null) {
                str = "";
            }
            return new C7127q0(str, new C7130c(0L, this.f12648c, false, false, false), c7133f, new C7132e(this.f12652g, this.f12653h, this.f12654i, this.f12655j, this.f12656k), MediaMetadata.f10479D);
        }
    }

    /* renamed from: com.google.android.exoplayer2.q0$c */
    /* loaded from: classes.dex */
    public static final class C7130c {

        /* renamed from: a */
        public final long f12657a;

        /* renamed from: b */
        public final long f12658b;

        /* renamed from: c */
        public final boolean f12659c;

        /* renamed from: d */
        public final boolean f12660d;

        /* renamed from: e */
        public final boolean f12661e;

        public C7130c(long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f12657a = j;
            this.f12658b = j2;
            this.f12659c = z;
            this.f12660d = z2;
            this.f12661e = z3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C7130c) {
                C7130c c7130c = (C7130c) obj;
                return this.f12657a == c7130c.f12657a && this.f12658b == c7130c.f12658b && this.f12659c == c7130c.f12659c && this.f12660d == c7130c.f12660d && this.f12661e == c7130c.f12661e;
            }
            return false;
        }

        public final int hashCode() {
            long j = this.f12657a;
            long j2 = this.f12658b;
            return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.f12659c ? 1 : 0)) * 31) + (this.f12660d ? 1 : 0)) * 31) + (this.f12661e ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.exoplayer2.q0$d */
    /* loaded from: classes.dex */
    public static final class C7131d {
        public final int hashCode() {
            throw null;
        }
    }

    /* renamed from: com.google.android.exoplayer2.q0$e */
    /* loaded from: classes.dex */
    public static final class C7132e {

        /* renamed from: a */
        public final long f12662a;

        /* renamed from: b */
        public final long f12663b;

        /* renamed from: c */
        public final long f12664c;

        /* renamed from: d */
        public final float f12665d;

        /* renamed from: e */
        public final float f12666e;

        public C7132e(long j, long j2, long j3, float f, float f2) {
            this.f12662a = j;
            this.f12663b = j2;
            this.f12664c = j3;
            this.f12665d = f;
            this.f12666e = f2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C7132e) {
                C7132e c7132e = (C7132e) obj;
                return this.f12662a == c7132e.f12662a && this.f12663b == c7132e.f12663b && this.f12664c == c7132e.f12664c && this.f12665d == c7132e.f12665d && this.f12666e == c7132e.f12666e;
            }
            return false;
        }

        public final int hashCode() {
            long j = this.f12662a;
            long j2 = this.f12663b;
            long j3 = this.f12664c;
            int i = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.f12665d;
            int floatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f12666e;
            return floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
        }
    }

    /* renamed from: com.google.android.exoplayer2.q0$f */
    /* loaded from: classes.dex */
    public static final class C7133f {

        /* renamed from: a */
        public final Uri f12667a;
        @Nullable

        /* renamed from: b */
        public final String f12668b;

        /* renamed from: c */
        public final List<Object> f12669c;
        @Nullable

        /* renamed from: d */
        public final String f12670d;

        /* renamed from: e */
        public final List<Object> f12671e;
        @Nullable

        /* renamed from: f */
        public final Object f12672f;

        public C7133f() {
            throw null;
        }

        public C7133f(Uri uri, String str, C7131d c7131d, C7128a c7128a, List list, String str2, List list2, Object obj) {
            this.f12667a = uri;
            this.f12668b = str;
            this.f12669c = list;
            this.f12670d = str2;
            this.f12671e = list2;
            this.f12672f = obj;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C7133f) {
                C7133f c7133f = (C7133f) obj;
                if (this.f12667a.equals(c7133f.f12667a) && C7408g0.m5105a(this.f12668b, c7133f.f12668b)) {
                    c7133f.getClass();
                    if (C7408g0.m5105a(null, null)) {
                        c7133f.getClass();
                        if (C7408g0.m5105a(null, null) && this.f12669c.equals(c7133f.f12669c) && C7408g0.m5105a(this.f12670d, c7133f.f12670d) && this.f12671e.equals(c7133f.f12671e) && C7408g0.m5105a(this.f12672f, c7133f.f12672f)) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f12667a.hashCode() * 31;
            String str = this.f12668b;
            int hashCode2 = (this.f12669c.hashCode() + ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + 0) * 31) + 0) * 31)) * 31;
            String str2 = this.f12670d;
            int hashCode3 = (this.f12671e.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f12672f;
            return hashCode3 + (obj != null ? obj.hashCode() : 0);
        }
    }

    static {
        new C7129b().m5501a();
    }

    public C7127q0(String str, C7130c c7130c, C7133f c7133f, C7132e c7132e, MediaMetadata mediaMetadata) {
        this.f12641a = str;
        this.f12642b = c7133f;
        this.f12643c = c7132e;
        this.f12644d = mediaMetadata;
        this.f12645e = c7130c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7127q0) {
            C7127q0 c7127q0 = (C7127q0) obj;
            return C7408g0.m5105a(this.f12641a, c7127q0.f12641a) && this.f12645e.equals(c7127q0.f12645e) && C7408g0.m5105a(this.f12642b, c7127q0.f12642b) && C7408g0.m5105a(this.f12643c, c7127q0.f12643c) && C7408g0.m5105a(this.f12644d, c7127q0.f12644d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f12641a.hashCode() * 31;
        C7133f c7133f = this.f12642b;
        int hashCode2 = c7133f != null ? c7133f.hashCode() : 0;
        int hashCode3 = this.f12643c.hashCode();
        return this.f12644d.hashCode() + ((this.f12645e.hashCode() + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31);
    }
}

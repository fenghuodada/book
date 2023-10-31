package com.google.android.exoplayer2.analytics;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC6984j1;
import com.google.android.exoplayer2.source.InterfaceC7188p;
import com.google.common.base.C7937f;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes.dex */
public interface AnalyticsListener {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface EventFlags {
    }

    /* renamed from: com.google.android.exoplayer2.analytics.AnalyticsListener$a */
    /* loaded from: classes.dex */
    public static final class C6634a {

        /* renamed from: a */
        public final long f10560a;

        /* renamed from: b */
        public final AbstractC6984j1 f10561b;

        /* renamed from: c */
        public final int f10562c;
        @Nullable

        /* renamed from: d */
        public final InterfaceC7188p.C7189a f10563d;

        /* renamed from: e */
        public final long f10564e;

        /* renamed from: f */
        public final AbstractC6984j1 f10565f;

        /* renamed from: g */
        public final int f10566g;
        @Nullable

        /* renamed from: h */
        public final InterfaceC7188p.C7189a f10567h;

        /* renamed from: i */
        public final long f10568i;

        /* renamed from: j */
        public final long f10569j;

        public C6634a(long j, AbstractC6984j1 abstractC6984j1, int i, @Nullable InterfaceC7188p.C7189a c7189a, long j2, AbstractC6984j1 abstractC6984j12, int i2, @Nullable InterfaceC7188p.C7189a c7189a2, long j3, long j4) {
            this.f10560a = j;
            this.f10561b = abstractC6984j1;
            this.f10562c = i;
            this.f10563d = c7189a;
            this.f10564e = j2;
            this.f10565f = abstractC6984j12;
            this.f10566g = i2;
            this.f10567h = c7189a2;
            this.f10568i = j3;
            this.f10569j = j4;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C6634a.class != obj.getClass()) {
                return false;
            }
            C6634a c6634a = (C6634a) obj;
            return this.f10560a == c6634a.f10560a && this.f10562c == c6634a.f10562c && this.f10564e == c6634a.f10564e && this.f10566g == c6634a.f10566g && this.f10568i == c6634a.f10568i && this.f10569j == c6634a.f10569j && C7937f.m4290a(this.f10561b, c6634a.f10561b) && C7937f.m4290a(this.f10563d, c6634a.f10563d) && C7937f.m4290a(this.f10565f, c6634a.f10565f) && C7937f.m4290a(this.f10567h, c6634a.f10567h);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f10560a), this.f10561b, Integer.valueOf(this.f10562c), this.f10563d, Long.valueOf(this.f10564e), this.f10565f, Integer.valueOf(this.f10566g), this.f10567h, Long.valueOf(this.f10568i), Long.valueOf(this.f10569j)});
        }
    }

    @Deprecated
    /* renamed from: A */
    void m6209A();

    /* renamed from: B */
    void m6208B();

    @Deprecated
    /* renamed from: C */
    void m6207C();

    /* renamed from: D */
    void m6206D();

    /* renamed from: E */
    void m6205E();

    /* renamed from: F */
    void m6204F();

    /* renamed from: G */
    void m6203G();

    /* renamed from: H */
    void m6202H();

    @Deprecated
    /* renamed from: I */
    void m6201I();

    @Deprecated
    /* renamed from: J */
    void m6200J();

    /* renamed from: K */
    void m6199K();

    /* renamed from: L */
    void m6198L();

    /* renamed from: M */
    void m6197M();

    /* renamed from: N */
    void m6196N();

    @Deprecated
    /* renamed from: O */
    void m6195O();

    /* renamed from: P */
    void m6194P();

    /* renamed from: Q */
    void m6193Q();

    /* renamed from: R */
    void m6192R();

    /* renamed from: S */
    void m6191S();

    /* renamed from: T */
    void m6190T();

    /* renamed from: U */
    void m6189U();

    /* renamed from: V */
    void m6188V();

    @Deprecated
    /* renamed from: W */
    void m6187W();

    @Deprecated
    /* renamed from: X */
    void m6186X();

    @Deprecated
    /* renamed from: Y */
    void m6185Y();

    /* renamed from: Z */
    void m6184Z();

    /* renamed from: a */
    void m6183a();

    /* renamed from: a0 */
    void m6182a0();

    /* renamed from: b */
    void m6181b();

    /* renamed from: b0 */
    void m6180b0();

    /* renamed from: c0 */
    void m6179c0();

    @Deprecated
    /* renamed from: d */
    void m6178d();

    /* renamed from: d0 */
    void m6177d0();

    @Deprecated
    /* renamed from: e */
    void m6176e();

    /* renamed from: e0 */
    void m6175e0();

    /* renamed from: f */
    void m6174f();

    /* renamed from: f0 */
    void m6173f0();

    @Deprecated
    /* renamed from: g */
    void m6172g();

    /* renamed from: g0 */
    void m6171g0();

    /* renamed from: h */
    void m6170h();

    /* renamed from: h0 */
    void m6169h0();

    /* renamed from: i */
    void m6168i();

    /* renamed from: i0 */
    void m6167i0();

    /* renamed from: j */
    void m6166j();

    /* renamed from: j0 */
    void m6165j0();

    @Deprecated
    /* renamed from: k */
    void m6164k();

    /* renamed from: k0 */
    void m6163k0();

    @Deprecated
    /* renamed from: l */
    void m6162l();

    @Deprecated
    /* renamed from: l0 */
    void m6161l0();

    /* renamed from: m */
    void m6160m();

    /* renamed from: m0 */
    void m6159m0();

    /* renamed from: n */
    void m6158n();

    /* renamed from: n0 */
    void m6157n0();

    /* renamed from: o */
    void m6156o();

    @Deprecated
    /* renamed from: o0 */
    void m6155o0();

    @Deprecated
    void onSeekProcessed();

    /* renamed from: p */
    void m6154p();

    /* renamed from: p0 */
    void m6153p0();

    /* renamed from: q */
    void m6152q();

    /* renamed from: r */
    void m6151r();

    /* renamed from: s */
    void m6150s();

    /* renamed from: t */
    void m6149t();

    /* renamed from: u */
    void m6148u();

    /* renamed from: v */
    void m6147v();

    /* renamed from: w */
    void m6146w();

    /* renamed from: x */
    void m6145x();

    /* renamed from: y */
    void m6144y();

    /* renamed from: z */
    void m6143z();
}

package com.google.android.exoplayer2;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractC6984j1;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.source.C7178k0;
import com.google.android.exoplayer2.source.InterfaceC7188p;
import com.google.android.exoplayer2.trackselection.C7308n;
import com.google.common.collect.AbstractC8013s;
import com.google.common.collect.C7998n0;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.z0 */
/* loaded from: classes.dex */
public final class C7508z0 {

    /* renamed from: t */
    public static final InterfaceC7188p.C7189a f14255t = new InterfaceC7188p.C7189a(new Object());

    /* renamed from: a */
    public final AbstractC6984j1 f14256a;

    /* renamed from: b */
    public final InterfaceC7188p.C7189a f14257b;

    /* renamed from: c */
    public final long f14258c;

    /* renamed from: d */
    public final long f14259d;

    /* renamed from: e */
    public final int f14260e;
    @Nullable

    /* renamed from: f */
    public final ExoPlaybackException f14261f;

    /* renamed from: g */
    public final boolean f14262g;

    /* renamed from: h */
    public final C7178k0 f14263h;

    /* renamed from: i */
    public final C7308n f14264i;

    /* renamed from: j */
    public final List<C7042a> f14265j;

    /* renamed from: k */
    public final InterfaceC7188p.C7189a f14266k;

    /* renamed from: l */
    public final boolean f14267l;

    /* renamed from: m */
    public final int f14268m;

    /* renamed from: n */
    public final C6633a1 f14269n;

    /* renamed from: o */
    public final boolean f14270o;

    /* renamed from: p */
    public final boolean f14271p;

    /* renamed from: q */
    public volatile long f14272q;

    /* renamed from: r */
    public volatile long f14273r;

    /* renamed from: s */
    public volatile long f14274s;

    public C7508z0(AbstractC6984j1 abstractC6984j1, InterfaceC7188p.C7189a c7189a, long j, long j2, int i, @Nullable ExoPlaybackException exoPlaybackException, boolean z, C7178k0 c7178k0, C7308n c7308n, List<C7042a> list, InterfaceC7188p.C7189a c7189a2, boolean z2, int i2, C6633a1 c6633a1, long j3, long j4, long j5, boolean z3, boolean z4) {
        this.f14256a = abstractC6984j1;
        this.f14257b = c7189a;
        this.f14258c = j;
        this.f14259d = j2;
        this.f14260e = i;
        this.f14261f = exoPlaybackException;
        this.f14262g = z;
        this.f14263h = c7178k0;
        this.f14264i = c7308n;
        this.f14265j = list;
        this.f14266k = c7189a2;
        this.f14267l = z2;
        this.f14268m = i2;
        this.f14269n = c6633a1;
        this.f14272q = j3;
        this.f14273r = j4;
        this.f14274s = j5;
        this.f14270o = z3;
        this.f14271p = z4;
    }

    /* renamed from: h */
    public static C7508z0 m4860h(C7308n c7308n) {
        AbstractC6984j1.C6985a c6985a = AbstractC6984j1.f12151a;
        InterfaceC7188p.C7189a c7189a = f14255t;
        C7178k0 c7178k0 = C7178k0.f12904d;
        AbstractC8013s.C8015b c8015b = AbstractC8013s.f15817b;
        return new C7508z0(c6985a, c7189a, -9223372036854775807L, 0L, 1, null, false, c7178k0, c7308n, C7998n0.f15785e, c7189a, false, 0, C6633a1.f10556d, 0L, 0L, 0L, false, false);
    }

    @CheckResult
    /* renamed from: a */
    public final C7508z0 m4867a(InterfaceC7188p.C7189a c7189a) {
        return new C7508z0(this.f14256a, this.f14257b, this.f14258c, this.f14259d, this.f14260e, this.f14261f, this.f14262g, this.f14263h, this.f14264i, this.f14265j, c7189a, this.f14267l, this.f14268m, this.f14269n, this.f14272q, this.f14273r, this.f14274s, this.f14270o, this.f14271p);
    }

    @CheckResult
    /* renamed from: b */
    public final C7508z0 m4866b(InterfaceC7188p.C7189a c7189a, long j, long j2, long j3, long j4, C7178k0 c7178k0, C7308n c7308n, List<C7042a> list) {
        return new C7508z0(this.f14256a, c7189a, j2, j3, this.f14260e, this.f14261f, this.f14262g, c7178k0, c7308n, list, this.f14266k, this.f14267l, this.f14268m, this.f14269n, this.f14272q, j4, j, this.f14270o, this.f14271p);
    }

    @CheckResult
    /* renamed from: c */
    public final C7508z0 m4865c(boolean z) {
        return new C7508z0(this.f14256a, this.f14257b, this.f14258c, this.f14259d, this.f14260e, this.f14261f, this.f14262g, this.f14263h, this.f14264i, this.f14265j, this.f14266k, this.f14267l, this.f14268m, this.f14269n, this.f14272q, this.f14273r, this.f14274s, z, this.f14271p);
    }

    @CheckResult
    /* renamed from: d */
    public final C7508z0 m4864d(int i, boolean z) {
        return new C7508z0(this.f14256a, this.f14257b, this.f14258c, this.f14259d, this.f14260e, this.f14261f, this.f14262g, this.f14263h, this.f14264i, this.f14265j, this.f14266k, z, i, this.f14269n, this.f14272q, this.f14273r, this.f14274s, this.f14270o, this.f14271p);
    }

    @CheckResult
    /* renamed from: e */
    public final C7508z0 m4863e(@Nullable ExoPlaybackException exoPlaybackException) {
        return new C7508z0(this.f14256a, this.f14257b, this.f14258c, this.f14259d, this.f14260e, exoPlaybackException, this.f14262g, this.f14263h, this.f14264i, this.f14265j, this.f14266k, this.f14267l, this.f14268m, this.f14269n, this.f14272q, this.f14273r, this.f14274s, this.f14270o, this.f14271p);
    }

    @CheckResult
    /* renamed from: f */
    public final C7508z0 m4862f(int i) {
        return new C7508z0(this.f14256a, this.f14257b, this.f14258c, this.f14259d, i, this.f14261f, this.f14262g, this.f14263h, this.f14264i, this.f14265j, this.f14266k, this.f14267l, this.f14268m, this.f14269n, this.f14272q, this.f14273r, this.f14274s, this.f14270o, this.f14271p);
    }

    @CheckResult
    /* renamed from: g */
    public final C7508z0 m4861g(AbstractC6984j1 abstractC6984j1) {
        return new C7508z0(abstractC6984j1, this.f14257b, this.f14258c, this.f14259d, this.f14260e, this.f14261f, this.f14262g, this.f14263h, this.f14264i, this.f14265j, this.f14266k, this.f14267l, this.f14268m, this.f14269n, this.f14272q, this.f14273r, this.f14274s, this.f14270o, this.f14271p);
    }
}

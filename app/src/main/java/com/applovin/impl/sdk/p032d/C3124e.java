package com.applovin.impl.sdk.p032d;

/* renamed from: com.applovin.impl.sdk.d.e */
/* loaded from: classes.dex */
public final class C3124e {

    /* renamed from: a */
    private long f8154a;

    /* renamed from: b */
    private long f8155b;

    /* renamed from: c */
    private boolean f8156c;

    /* renamed from: d */
    private long f8157d;

    /* renamed from: e */
    private long f8158e;

    /* renamed from: f */
    private int f8159f;

    /* renamed from: g */
    private Exception f8160g;

    /* renamed from: a */
    public void m7736a() {
        this.f8156c = true;
    }

    /* renamed from: a */
    public void m7735a(int i) {
        this.f8159f = i;
    }

    /* renamed from: a */
    public void m7734a(long j) {
        this.f8154a += j;
    }

    /* renamed from: a */
    public void m7733a(Exception exc) {
        this.f8160g = exc;
    }

    /* renamed from: b */
    public void m7731b(long j) {
        this.f8155b += j;
    }

    /* renamed from: b */
    public boolean m7732b() {
        return this.f8156c;
    }

    /* renamed from: c */
    public long m7730c() {
        return this.f8154a;
    }

    /* renamed from: d */
    public long m7729d() {
        return this.f8155b;
    }

    /* renamed from: e */
    public void m7728e() {
        this.f8157d++;
    }

    /* renamed from: f */
    public void m7727f() {
        this.f8158e++;
    }

    /* renamed from: g */
    public long m7726g() {
        return this.f8157d;
    }

    /* renamed from: h */
    public long m7725h() {
        return this.f8158e;
    }

    /* renamed from: i */
    public Exception m7724i() {
        return this.f8160g;
    }

    /* renamed from: j */
    public int m7723j() {
        return this.f8159f;
    }

    public String toString() {
        return "CacheStatsTracker{totalDownloadedBytes=" + this.f8154a + ", totalCachedBytes=" + this.f8155b + ", isHTMLCachingCancelled=" + this.f8156c + ", htmlResourceCacheSuccessCount=" + this.f8157d + ", htmlResourceCacheFailureCount=" + this.f8158e + '}';
    }
}

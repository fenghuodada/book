package com.google.android.exoplayer2.util;

import androidx.annotation.GuardedBy;

/* renamed from: com.google.android.exoplayer2.util.e0 */
/* loaded from: classes.dex */
public final class C7404e0 {
    @GuardedBy("this")

    /* renamed from: a */
    public long f13896a;
    @GuardedBy("this")

    /* renamed from: b */
    public long f13897b;
    @GuardedBy("this")

    /* renamed from: c */
    public long f13898c;

    /* renamed from: d */
    public final ThreadLocal<Long> f13899d = new ThreadLocal<>();

    public C7404e0(long j) {
        m5108e(j);
    }

    /* renamed from: a */
    public final synchronized long m5112a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f13897b == -9223372036854775807L) {
            long j2 = this.f13896a;
            if (j2 == 9223372036854775806L) {
                Long l = this.f13899d.get();
                l.getClass();
                j2 = l.longValue();
            }
            this.f13897b = j2 - j;
            notifyAll();
        }
        this.f13898c = j;
        return j + this.f13897b;
    }

    /* renamed from: b */
    public final synchronized long m5111b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f13898c;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = ((j4 - 1) * 8589934592L) + j;
            long j6 = (j4 * 8589934592L) + j;
            if (Math.abs(j5 - j3) < Math.abs(j6 - j3)) {
                j = j5;
            } else {
                j = j6;
            }
        }
        return m5112a((j * 1000000) / 90000);
    }

    /* renamed from: c */
    public final synchronized long m5110c() {
        long j;
        j = this.f13896a;
        return (j == Long.MAX_VALUE || j == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
    }

    /* renamed from: d */
    public final synchronized long m5109d() {
        return this.f13897b;
    }

    /* renamed from: e */
    public final synchronized void m5108e(long j) {
        this.f13896a = j;
        this.f13897b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f13898c = -9223372036854775807L;
    }
}

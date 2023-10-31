package com.google.android.exoplayer2;

/* renamed from: com.google.android.exoplayer2.k */
/* loaded from: classes.dex */
public final class C6988k implements InterfaceC7125p0 {

    /* renamed from: a */
    public final long f12178a;

    /* renamed from: b */
    public final long f12179b;

    /* renamed from: c */
    public final float f12180c;

    /* renamed from: d */
    public long f12181d = -9223372036854775807L;

    /* renamed from: e */
    public long f12182e = -9223372036854775807L;

    /* renamed from: g */
    public long f12184g = -9223372036854775807L;

    /* renamed from: h */
    public long f12185h = -9223372036854775807L;

    /* renamed from: k */
    public float f12188k = 0.97f;

    /* renamed from: j */
    public float f12187j = 1.03f;

    /* renamed from: l */
    public float f12189l = 1.0f;

    /* renamed from: m */
    public long f12190m = -9223372036854775807L;

    /* renamed from: f */
    public long f12183f = -9223372036854775807L;

    /* renamed from: i */
    public long f12186i = -9223372036854775807L;

    /* renamed from: n */
    public long f12191n = -9223372036854775807L;

    /* renamed from: o */
    public long f12192o = -9223372036854775807L;

    public C6988k(long j, long j2, float f) {
        this.f12178a = j;
        this.f12179b = j2;
        this.f12180c = f;
    }

    /* renamed from: a */
    public final void m5678a() {
        long j = this.f12181d;
        if (j != -9223372036854775807L) {
            long j2 = this.f12182e;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f12184g;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f12185h;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f12183f == j) {
            return;
        }
        this.f12183f = j;
        this.f12186i = j;
        this.f12191n = -9223372036854775807L;
        this.f12192o = -9223372036854775807L;
        this.f12190m = -9223372036854775807L;
    }
}

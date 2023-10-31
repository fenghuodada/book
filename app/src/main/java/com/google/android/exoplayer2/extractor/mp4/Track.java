package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C7003m0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class Track {

    /* renamed from: a */
    public final int f11452a;

    /* renamed from: b */
    public final int f11453b;

    /* renamed from: c */
    public final long f11454c;

    /* renamed from: d */
    public final long f11455d;

    /* renamed from: e */
    public final long f11456e;

    /* renamed from: f */
    public final C7003m0 f11457f;

    /* renamed from: g */
    public final int f11458g;
    @Nullable

    /* renamed from: h */
    public final long[] f11459h;
    @Nullable

    /* renamed from: i */
    public final long[] f11460i;

    /* renamed from: j */
    public final int f11461j;
    @Nullable

    /* renamed from: k */
    public final C6881i[] f11462k;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface Transformation {
    }

    public Track(int i, int i2, long j, long j2, long j3, C7003m0 c7003m0, int i3, @Nullable C6881i[] c6881iArr, int i4, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.f11452a = i;
        this.f11453b = i2;
        this.f11454c = j;
        this.f11455d = j2;
        this.f11456e = j3;
        this.f11457f = c7003m0;
        this.f11458g = i3;
        this.f11462k = c6881iArr;
        this.f11461j = i4;
        this.f11459h = jArr;
        this.f11460i = jArr2;
    }
}

package com.google.android.exoplayer2.video.spherical;

import com.google.android.exoplayer2.util.C7394a;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class Projection {

    /* renamed from: a */
    public final C7473a f14122a;

    /* renamed from: b */
    public final C7473a f14123b;

    /* renamed from: c */
    public final int f14124c;

    /* renamed from: d */
    public final boolean f14125d;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface DrawMode {
    }

    /* renamed from: com.google.android.exoplayer2.video.spherical.Projection$a */
    /* loaded from: classes.dex */
    public static final class C7473a {

        /* renamed from: a */
        public final C7474b[] f14126a;

        public C7473a(C7474b... c7474bArr) {
            this.f14126a = c7474bArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.video.spherical.Projection$b */
    /* loaded from: classes.dex */
    public static final class C7474b {

        /* renamed from: a */
        public final int f14127a;

        /* renamed from: b */
        public final int f14128b;

        /* renamed from: c */
        public final float[] f14129c;

        /* renamed from: d */
        public final float[] f14130d;

        public C7474b(int i, float[] fArr, float[] fArr2, int i2) {
            this.f14127a = i;
            C7394a.m5134a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f14129c = fArr;
            this.f14130d = fArr2;
            this.f14128b = i2;
        }
    }

    public Projection() {
        throw null;
    }

    public Projection(C7473a c7473a, C7473a c7473a2, int i) {
        this.f14122a = c7473a;
        this.f14123b = c7473a2;
        this.f14124c = i;
        this.f14125d = c7473a == c7473a2;
    }
}

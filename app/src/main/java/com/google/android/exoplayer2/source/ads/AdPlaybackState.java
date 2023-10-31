package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class AdPlaybackState {

    /* renamed from: g */
    public static final AdPlaybackState f12766g = new AdPlaybackState(new C7145a[0]);

    /* renamed from: h */
    public static final C7145a f12767h;

    /* renamed from: b */
    public final int f12769b;

    /* renamed from: f */
    public final C7145a[] f12773f;
    @Nullable

    /* renamed from: a */
    public final Object f12768a = null;

    /* renamed from: c */
    public final long f12770c = 0;

    /* renamed from: d */
    public final long f12771d = -9223372036854775807L;

    /* renamed from: e */
    public final int f12772e = 0;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface AdState {
    }

    /* renamed from: com.google.android.exoplayer2.source.ads.AdPlaybackState$a */
    /* loaded from: classes.dex */
    public static final class C7145a {

        /* renamed from: a */
        public final long f12774a;

        /* renamed from: b */
        public final int f12775b;

        /* renamed from: c */
        public final Uri[] f12776c;

        /* renamed from: d */
        public final int[] f12777d;

        /* renamed from: e */
        public final long[] f12778e;

        /* renamed from: f */
        public final long f12779f;

        /* renamed from: g */
        public final boolean f12780g;

        public C7145a(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
            C7394a.m5134a(iArr.length == uriArr.length);
            this.f12774a = j;
            this.f12775b = i;
            this.f12777d = iArr;
            this.f12776c = uriArr;
            this.f12778e = jArr;
            this.f12779f = j2;
            this.f12780g = z;
        }

        /* renamed from: a */
        public final int m5471a(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.f12777d;
                if (i3 >= iArr.length || this.f12780g || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C7145a.class != obj.getClass()) {
                return false;
            }
            C7145a c7145a = (C7145a) obj;
            return this.f12774a == c7145a.f12774a && this.f12775b == c7145a.f12775b && Arrays.equals(this.f12776c, c7145a.f12776c) && Arrays.equals(this.f12777d, c7145a.f12777d) && Arrays.equals(this.f12778e, c7145a.f12778e) && this.f12779f == c7145a.f12779f && this.f12780g == c7145a.f12780g;
        }

        public final int hashCode() {
            long j = this.f12774a;
            int hashCode = Arrays.hashCode(this.f12777d);
            int hashCode2 = Arrays.hashCode(this.f12778e);
            long j2 = this.f12779f;
            return ((((hashCode2 + ((hashCode + (((((this.f12775b * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f12776c)) * 31)) * 31)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f12780g ? 1 : 0);
        }
    }

    static {
        int max = Math.max(0, 0);
        int[] copyOf = Arrays.copyOf(new int[0], max);
        Arrays.fill(copyOf, 0, max, 0);
        int max2 = Math.max(0, 0);
        long[] copyOf2 = Arrays.copyOf(new long[0], max2);
        Arrays.fill(copyOf2, 0, max2, -9223372036854775807L);
        f12767h = new C7145a(0L, 0, copyOf, (Uri[]) Arrays.copyOf(new Uri[0], 0), copyOf2, 0L, false);
    }

    public AdPlaybackState(C7145a[] c7145aArr) {
        this.f12769b = c7145aArr.length + 0;
        this.f12773f = c7145aArr;
    }

    /* renamed from: a */
    public final C7145a m5472a(int i) {
        int i2 = this.f12772e;
        return i < i2 ? f12767h : this.f12773f[i - i2];
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdPlaybackState.class != obj.getClass()) {
            return false;
        }
        AdPlaybackState adPlaybackState = (AdPlaybackState) obj;
        return C7408g0.m5105a(this.f12768a, adPlaybackState.f12768a) && this.f12769b == adPlaybackState.f12769b && this.f12770c == adPlaybackState.f12770c && this.f12771d == adPlaybackState.f12771d && this.f12772e == adPlaybackState.f12772e && Arrays.equals(this.f12773f, adPlaybackState.f12773f);
    }

    public final int hashCode() {
        int i = this.f12769b * 31;
        Object obj = this.f12768a;
        return Arrays.hashCode(this.f12773f) + ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f12770c)) * 31) + ((int) this.f12771d)) * 31) + this.f12772e) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.f12768a);
        sb.append(", adResumePositionUs=");
        sb.append(this.f12770c);
        sb.append(", adGroups=[");
        int i = 0;
        while (true) {
            C7145a[] c7145aArr = this.f12773f;
            if (i >= c7145aArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(c7145aArr[i].f12774a);
            sb.append(", ads=[");
            for (int i2 = 0; i2 < c7145aArr[i].f12777d.length; i2++) {
                sb.append("ad(state=");
                int i3 = c7145aArr[i].f12777d[i2];
                sb.append(i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? '?' : '!' : 'P' : 'S' : 'R' : '_');
                sb.append(", durationUs=");
                sb.append(c7145aArr[i].f12778e[i2]);
                sb.append(')');
                if (i2 < c7145aArr[i].f12777d.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < c7145aArr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}

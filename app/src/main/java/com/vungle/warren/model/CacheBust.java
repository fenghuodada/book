package com.vungle.warren.model;

import androidx.annotation.RequiresApi;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class CacheBust {
    @SerializedName(FacebookAdapter.KEY_ID)

    /* renamed from: a */
    String f19764a;
    @SerializedName("timestamp_bust_end")

    /* renamed from: b */
    long f19765b;
    @EventType

    /* renamed from: c */
    public int f19766c;

    /* renamed from: d */
    public String[] f19767d;
    @SerializedName("timestamp_processed")

    /* renamed from: e */
    long f19768e;

    /* loaded from: classes3.dex */
    public @interface EventType {
    }

    /* renamed from: a */
    public final String m1465a() {
        return this.f19764a;
    }

    /* renamed from: b */
    public final long m1464b() {
        return this.f19765b;
    }

    /* renamed from: c */
    public final long m1463c() {
        return this.f19768e;
    }

    /* renamed from: d */
    public final void m1462d(long j) {
        this.f19765b = j;
    }

    /* renamed from: e */
    public final void m1461e(long j) {
        this.f19768e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CacheBust.class != obj.getClass()) {
            return false;
        }
        CacheBust cacheBust = (CacheBust) obj;
        return this.f19766c == cacheBust.f19766c && this.f19768e == cacheBust.f19768e && this.f19764a.equals(cacheBust.f19764a) && this.f19765b == cacheBust.f19765b && Arrays.equals(this.f19767d, cacheBust.f19767d);
    }

    @RequiresApi(api = 19)
    public final int hashCode() {
        return (Objects.hash(this.f19764a, Long.valueOf(this.f19765b), Integer.valueOf(this.f19766c), Long.valueOf(this.f19768e)) * 31) + Arrays.hashCode(this.f19767d);
    }

    public final String toString() {
        return "CacheBust{id='" + this.f19764a + "', timeWindowEnd=" + this.f19765b + ", idType=" + this.f19766c + ", eventIds=" + Arrays.toString(this.f19767d) + ", timestampProcessed=" + this.f19768e + '}';
    }
}

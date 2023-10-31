package com.vungle.warren;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.warren.model.admarkup.AbstractC9853a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class AdRequest implements Serializable {

    /* renamed from: a */
    public final boolean f19306a;
    @NonNull

    /* renamed from: b */
    public final String f19307b;
    @Nullable

    /* renamed from: c */
    public final AbstractC9853a f19308c;
    @Type

    /* renamed from: d */
    public final int f19309d;

    /* renamed from: e */
    public final long f19310e;

    /* renamed from: f */
    public final AtomicLong f19311f;

    /* loaded from: classes3.dex */
    public @interface Type {
        public static final int NORMAL = 0;
        public static final int NO_ASSETS = 1;
        public static final int SINGLE_HBP = 2;
    }

    public AdRequest(@NonNull String str, @Type int i, long j, boolean z) {
        this.f19311f = new AtomicLong(0L);
        this.f19307b = str;
        this.f19308c = null;
        this.f19309d = i;
        this.f19310e = j;
        this.f19306a = z;
    }

    public AdRequest(@NonNull String str, @Nullable AbstractC9853a abstractC9853a, boolean z) {
        this.f19311f = new AtomicLong(0L);
        this.f19307b = str;
        this.f19308c = abstractC9853a;
        this.f19309d = 0;
        this.f19310e = 1L;
        this.f19306a = z;
    }

    @Nullable
    /* renamed from: a */
    public final String m1620a() {
        AbstractC9853a abstractC9853a = this.f19308c;
        if (abstractC9853a == null) {
            return null;
        }
        return abstractC9853a.mo1452a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdRequest.class != obj.getClass()) {
            return false;
        }
        AdRequest adRequest = (AdRequest) obj;
        if (this.f19309d == adRequest.f19309d && this.f19307b.equals(adRequest.f19307b)) {
            AbstractC9853a abstractC9853a = adRequest.f19308c;
            AbstractC9853a abstractC9853a2 = this.f19308c;
            return abstractC9853a2 != null ? abstractC9853a2.equals(abstractC9853a) : abstractC9853a == null;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f19307b.hashCode() * 31;
        AbstractC9853a abstractC9853a = this.f19308c;
        return ((hashCode + (abstractC9853a != null ? abstractC9853a.hashCode() : 0)) * 31) + this.f19309d;
    }

    public final String toString() {
        return "AdRequest{placementId='" + this.f19307b + "', adMarkup=" + this.f19308c + ", type=" + this.f19309d + ", adCount=" + this.f19310e + ", isExplicit=" + this.f19306a + '}';
    }
}

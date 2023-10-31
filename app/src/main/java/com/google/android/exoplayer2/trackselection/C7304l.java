package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.common.collect.AbstractC8013s;
import com.google.common.collect.C7998n0;
import java.util.ArrayList;

/* renamed from: com.google.android.exoplayer2.trackselection.l */
/* loaded from: classes.dex */
public class C7304l implements Parcelable {
    public static final Parcelable.Creator<C7304l> CREATOR;

    /* renamed from: a */
    public final int f13440a;

    /* renamed from: b */
    public final int f13441b;

    /* renamed from: c */
    public final int f13442c;

    /* renamed from: d */
    public final int f13443d;

    /* renamed from: e */
    public final int f13444e;

    /* renamed from: f */
    public final int f13445f;

    /* renamed from: g */
    public final int f13446g;

    /* renamed from: h */
    public final int f13447h;

    /* renamed from: i */
    public final int f13448i;

    /* renamed from: j */
    public final int f13449j;

    /* renamed from: k */
    public final boolean f13450k;

    /* renamed from: l */
    public final AbstractC8013s<String> f13451l;

    /* renamed from: m */
    public final AbstractC8013s<String> f13452m;

    /* renamed from: n */
    public final int f13453n;

    /* renamed from: o */
    public final int f13454o;

    /* renamed from: p */
    public final int f13455p;

    /* renamed from: q */
    public final AbstractC8013s<String> f13456q;

    /* renamed from: r */
    public final AbstractC8013s<String> f13457r;

    /* renamed from: s */
    public final int f13458s;

    /* renamed from: t */
    public final boolean f13459t;

    /* renamed from: u */
    public final boolean f13460u;

    /* renamed from: v */
    public final boolean f13461v;

    /* renamed from: com.google.android.exoplayer2.trackselection.l$a */
    /* loaded from: classes.dex */
    public class C7305a implements Parcelable.Creator<C7304l> {
        @Override // android.os.Parcelable.Creator
        public final C7304l createFromParcel(Parcel parcel) {
            return new C7304l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C7304l[] newArray(int i) {
            return new C7304l[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.l$b */
    /* loaded from: classes.dex */
    public static class C7306b {

        /* renamed from: a */
        public final int f13462a = Integer.MAX_VALUE;

        /* renamed from: b */
        public final int f13463b = Integer.MAX_VALUE;

        /* renamed from: c */
        public final int f13464c = Integer.MAX_VALUE;

        /* renamed from: d */
        public final int f13465d = Integer.MAX_VALUE;

        /* renamed from: e */
        public int f13466e = Integer.MAX_VALUE;

        /* renamed from: f */
        public int f13467f = Integer.MAX_VALUE;

        /* renamed from: g */
        public boolean f13468g = true;

        /* renamed from: h */
        public final C7998n0 f13469h;

        /* renamed from: i */
        public final C7998n0 f13470i;

        /* renamed from: j */
        public final int f13471j;

        /* renamed from: k */
        public final int f13472k;

        /* renamed from: l */
        public final C7998n0 f13473l;

        /* renamed from: m */
        public C7998n0 f13474m;

        /* renamed from: n */
        public int f13475n;

        @Deprecated
        public C7306b() {
            AbstractC8013s.C8015b c8015b = AbstractC8013s.f15817b;
            C7998n0 c7998n0 = C7998n0.f15785e;
            this.f13469h = c7998n0;
            this.f13470i = c7998n0;
            this.f13471j = Integer.MAX_VALUE;
            this.f13472k = Integer.MAX_VALUE;
            this.f13473l = c7998n0;
            this.f13474m = c7998n0;
            this.f13475n = 0;
        }

        /* renamed from: a */
        public C7306b mo5257a(int i, int i2) {
            this.f13466e = i;
            this.f13467f = i2;
            this.f13468g = true;
            return this;
        }
    }

    static {
        new C7304l(new C7306b());
        CREATOR = new C7305a();
    }

    public C7304l(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, null);
        this.f13452m = AbstractC8013s.m4246p(arrayList);
        this.f13453n = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, null);
        this.f13457r = AbstractC8013s.m4246p(arrayList2);
        this.f13458s = parcel.readInt();
        int i = C7408g0.f13905a;
        this.f13459t = parcel.readInt() != 0;
        this.f13440a = parcel.readInt();
        this.f13441b = parcel.readInt();
        this.f13442c = parcel.readInt();
        this.f13443d = parcel.readInt();
        this.f13444e = parcel.readInt();
        this.f13445f = parcel.readInt();
        this.f13446g = parcel.readInt();
        this.f13447h = parcel.readInt();
        this.f13448i = parcel.readInt();
        this.f13449j = parcel.readInt();
        this.f13450k = parcel.readInt() != 0;
        ArrayList arrayList3 = new ArrayList();
        parcel.readList(arrayList3, null);
        this.f13451l = AbstractC8013s.m4246p(arrayList3);
        this.f13454o = parcel.readInt();
        this.f13455p = parcel.readInt();
        ArrayList arrayList4 = new ArrayList();
        parcel.readList(arrayList4, null);
        this.f13456q = AbstractC8013s.m4246p(arrayList4);
        this.f13460u = parcel.readInt() != 0;
        this.f13461v = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7304l c7304l = (C7304l) obj;
        return this.f13440a == c7304l.f13440a && this.f13441b == c7304l.f13441b && this.f13442c == c7304l.f13442c && this.f13443d == c7304l.f13443d && this.f13444e == c7304l.f13444e && this.f13445f == c7304l.f13445f && this.f13446g == c7304l.f13446g && this.f13447h == c7304l.f13447h && this.f13450k == c7304l.f13450k && this.f13448i == c7304l.f13448i && this.f13449j == c7304l.f13449j && this.f13451l.equals(c7304l.f13451l) && this.f13452m.equals(c7304l.f13452m) && this.f13453n == c7304l.f13453n && this.f13454o == c7304l.f13454o && this.f13455p == c7304l.f13455p && this.f13456q.equals(c7304l.f13456q) && this.f13457r.equals(c7304l.f13457r) && this.f13458s == c7304l.f13458s && this.f13459t == c7304l.f13459t && this.f13460u == c7304l.f13460u && this.f13461v == c7304l.f13461v;
    }

    public int hashCode() {
        int hashCode = this.f13451l.hashCode();
        int hashCode2 = this.f13452m.hashCode();
        int hashCode3 = this.f13456q.hashCode();
        return ((((((((this.f13457r.hashCode() + ((hashCode3 + ((((((((hashCode2 + ((hashCode + ((((((((((((((((((((((this.f13440a + 31) * 31) + this.f13441b) * 31) + this.f13442c) * 31) + this.f13443d) * 31) + this.f13444e) * 31) + this.f13445f) * 31) + this.f13446g) * 31) + this.f13447h) * 31) + (this.f13450k ? 1 : 0)) * 31) + this.f13448i) * 31) + this.f13449j) * 31)) * 31)) * 31) + this.f13453n) * 31) + this.f13454o) * 31) + this.f13455p) * 31)) * 31)) * 31) + this.f13458s) * 31) + (this.f13459t ? 1 : 0)) * 31) + (this.f13460u ? 1 : 0)) * 31) + (this.f13461v ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f13452m);
        parcel.writeInt(this.f13453n);
        parcel.writeList(this.f13457r);
        parcel.writeInt(this.f13458s);
        int i2 = C7408g0.f13905a;
        parcel.writeInt(this.f13459t ? 1 : 0);
        parcel.writeInt(this.f13440a);
        parcel.writeInt(this.f13441b);
        parcel.writeInt(this.f13442c);
        parcel.writeInt(this.f13443d);
        parcel.writeInt(this.f13444e);
        parcel.writeInt(this.f13445f);
        parcel.writeInt(this.f13446g);
        parcel.writeInt(this.f13447h);
        parcel.writeInt(this.f13448i);
        parcel.writeInt(this.f13449j);
        parcel.writeInt(this.f13450k ? 1 : 0);
        parcel.writeList(this.f13451l);
        parcel.writeInt(this.f13454o);
        parcel.writeInt(this.f13455p);
        parcel.writeList(this.f13456q);
        parcel.writeInt(this.f13460u ? 1 : 0);
        parcel.writeInt(this.f13461v ? 1 : 0);
    }

    public C7304l(C7306b c7306b) {
        this.f13440a = c7306b.f13462a;
        this.f13441b = c7306b.f13463b;
        this.f13442c = c7306b.f13464c;
        this.f13443d = c7306b.f13465d;
        this.f13444e = 0;
        this.f13445f = 0;
        this.f13446g = 0;
        this.f13447h = 0;
        this.f13448i = c7306b.f13466e;
        this.f13449j = c7306b.f13467f;
        this.f13450k = c7306b.f13468g;
        this.f13451l = c7306b.f13469h;
        this.f13452m = c7306b.f13470i;
        this.f13453n = 0;
        this.f13454o = c7306b.f13471j;
        this.f13455p = c7306b.f13472k;
        this.f13456q = c7306b.f13473l;
        this.f13457r = c7306b.f13474m;
        this.f13458s = c7306b.f13475n;
        this.f13459t = false;
        this.f13460u = false;
        this.f13461v = false;
    }
}

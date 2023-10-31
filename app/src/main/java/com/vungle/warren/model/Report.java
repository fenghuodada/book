package com.vungle.warren.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.C0406q1;
import androidx.coordinatorlayout.C0585a;
import com.google.ads.mediation.adcolony.AdColonyAdapterUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.C8690m;
import com.google.gson.C8695r;
import com.google.gson.annotations.SerializedName;
import com.vungle.warren.AdConfig;
import com.vungle.warren.C9846m1;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class Report {

    /* renamed from: a */
    public int f19781a;

    /* renamed from: b */
    public String f19782b;

    /* renamed from: c */
    public String f19783c;

    /* renamed from: d */
    public String f19784d;

    /* renamed from: e */
    public boolean f19785e;

    /* renamed from: f */
    public boolean f19786f;

    /* renamed from: g */
    public boolean f19787g;

    /* renamed from: h */
    public long f19788h;

    /* renamed from: i */
    public String f19789i;

    /* renamed from: j */
    public long f19790j;

    /* renamed from: k */
    public long f19791k;

    /* renamed from: l */
    public long f19792l;

    /* renamed from: m */
    public String f19793m;

    /* renamed from: n */
    public int f19794n;

    /* renamed from: o */
    public final ArrayList f19795o;

    /* renamed from: p */
    public final ArrayList f19796p;

    /* renamed from: q */
    public final ArrayList f19797q;

    /* renamed from: r */
    public String f19798r;

    /* renamed from: s */
    public String f19799s;

    /* renamed from: t */
    public String f19800t;

    /* renamed from: u */
    public int f19801u;

    /* renamed from: v */
    public String f19802v;

    /* renamed from: w */
    public volatile boolean f19803w;
    @VisibleForTesting

    /* renamed from: x */
    public long f19804x;
    @VisibleForTesting

    /* renamed from: y */
    public long f19805y;

    /* loaded from: classes3.dex */
    public @interface Status {
    }

    /* renamed from: com.vungle.warren.model.Report$a */
    /* loaded from: classes3.dex */
    public static class C9851a {
        @SerializedName("action")

        /* renamed from: a */
        private String f19806a;
        @SerializedName("value")

        /* renamed from: b */
        private String f19807b;
        @SerializedName("timestamp")

        /* renamed from: c */
        private long f19808c;

        public C9851a(String str, String str2, long j) {
            this.f19806a = str;
            this.f19807b = str2;
            this.f19808c = j;
        }

        /* renamed from: a */
        public final C8695r m1454a() {
            C8695r c8695r = new C8695r();
            c8695r.m3215u("action", this.f19806a);
            String str = this.f19807b;
            if (str != null && !str.isEmpty()) {
                c8695r.m3215u("value", this.f19807b);
            }
            c8695r.m3216t("timestamp_millis", Long.valueOf(this.f19808c));
            return c8695r;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C9851a.class != obj.getClass()) {
                return false;
            }
            C9851a c9851a = (C9851a) obj;
            return c9851a.f19806a.equals(this.f19806a) && c9851a.f19807b.equals(this.f19807b) && c9851a.f19808c == this.f19808c;
        }

        public final int hashCode() {
            int m12537a = C0406q1.m12537a(this.f19807b, this.f19806a.hashCode() * 31, 31);
            long j = this.f19808c;
            return m12537a + ((int) (j ^ (j >>> 32)));
        }
    }

    public Report() {
        this.f19781a = 0;
        this.f19795o = new ArrayList();
        this.f19796p = new ArrayList();
        this.f19797q = new ArrayList();
    }

    public Report(@NonNull Advertisement advertisement, @NonNull Placement placement, long j, @Nullable String str) {
        String str2;
        this.f19781a = 0;
        this.f19795o = new ArrayList();
        this.f19796p = new ArrayList();
        this.f19797q = new ArrayList();
        this.f19782b = placement.f19769a;
        this.f19783c = advertisement.f19759x;
        this.f19784d = advertisement.f19739d;
        this.f19785e = placement.f19771c;
        this.f19786f = placement.f19775g;
        this.f19788h = j;
        this.f19789i = advertisement.f19748m;
        this.f19792l = -1L;
        this.f19793m = advertisement.f19744i;
        C9846m1.m1477b().getClass();
        this.f19804x = C9846m1.f19682p;
        this.f19805y = advertisement.f19730R;
        int i = advertisement.f19737b;
        if (i != 0) {
            if (i == 1) {
                str2 = "vungle_mraid";
            } else {
                throw new IllegalArgumentException("Unknown ad type, cannot process!");
            }
        } else {
            str2 = "vungle_local";
        }
        this.f19798r = str2;
        this.f19799s = advertisement.f19717E;
        if (str == null) {
            this.f19800t = "";
        } else {
            this.f19800t = str;
        }
        this.f19801u = advertisement.f19757v.m1651f();
        AdConfig.AdSize m1425a = advertisement.f19757v.m1425a();
        if (AdConfig.AdSize.isNonMrecBannerAdSize(m1425a)) {
            this.f19802v = m1425a.getName();
        }
    }

    @NonNull
    /* renamed from: a */
    public final String m1457a() {
        return this.f19782b + "_" + this.f19788h;
    }

    /* renamed from: b */
    public final synchronized void m1456b(long j, String str, String str2) {
        this.f19795o.add(new C9851a(str, str2, j));
        this.f19796p.add(str);
        if (str.equals("download")) {
            this.f19803w = true;
        }
    }

    /* renamed from: c */
    public final synchronized C8695r m1455c() {
        C8695r c8695r;
        c8695r = new C8695r();
        c8695r.m3215u("placement_reference_id", this.f19782b);
        c8695r.m3215u("ad_token", this.f19783c);
        c8695r.m3215u(AdColonyAdapterUtils.KEY_APP_ID, this.f19784d);
        c8695r.m3216t("incentivized", Integer.valueOf(this.f19785e ? 1 : 0));
        c8695r.m3217s("header_bidding", Boolean.valueOf(this.f19786f));
        c8695r.m3217s("play_remote_assets", Boolean.valueOf(this.f19787g));
        c8695r.m3216t("adStartTime", Long.valueOf(this.f19788h));
        if (!TextUtils.isEmpty(this.f19789i)) {
            c8695r.m3215u(ImagesContract.URL, this.f19789i);
        }
        c8695r.m3216t("adDuration", Long.valueOf(this.f19791k));
        c8695r.m3216t("ttDownload", Long.valueOf(this.f19792l));
        c8695r.m3215u(FirebaseAnalytics.Param.CAMPAIGN, this.f19793m);
        c8695r.m3215u("adType", this.f19798r);
        c8695r.m3215u("templateId", this.f19799s);
        c8695r.m3216t("init_timestamp", Long.valueOf(this.f19804x));
        c8695r.m3216t("asset_download_duration", Long.valueOf(this.f19805y));
        if (!TextUtils.isEmpty(this.f19802v)) {
            c8695r.m3215u("ad_size", this.f19802v);
        }
        C8690m c8690m = new C8690m();
        C8695r c8695r2 = new C8695r();
        c8695r2.m3216t("startTime", Long.valueOf(this.f19788h));
        int i = this.f19794n;
        if (i > 0) {
            c8695r2.m3216t("videoViewed", Integer.valueOf(i));
        }
        long j = this.f19790j;
        if (j > 0) {
            c8695r2.m3216t("videoLength", Long.valueOf(j));
        }
        C8690m c8690m2 = new C8690m();
        Iterator it = this.f19795o.iterator();
        while (it.hasNext()) {
            c8690m2.m3224r(((C9851a) it.next()).m1454a());
        }
        c8695r2.m3218r(c8690m2, "userActions");
        c8690m.m3224r(c8695r2);
        c8695r.m3218r(c8690m, "plays");
        C8690m c8690m3 = new C8690m();
        Iterator it2 = this.f19797q.iterator();
        while (it2.hasNext()) {
            c8690m3.m3223s((String) it2.next());
        }
        c8695r.m3218r(c8690m3, "errors");
        C8690m c8690m4 = new C8690m();
        Iterator it3 = this.f19796p.iterator();
        while (it3.hasNext()) {
            c8690m4.m3223s((String) it3.next());
        }
        c8695r.m3218r(c8690m4, "clickedThrough");
        if (this.f19785e && !TextUtils.isEmpty(this.f19800t)) {
            c8695r.m3215u("user", this.f19800t);
        }
        int i2 = this.f19801u;
        if (i2 > 0) {
            c8695r.m3216t("ordinal_view", Integer.valueOf(i2));
        }
        return c8695r;
    }

    public final synchronized boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (Report.class == obj.getClass()) {
                Report report = (Report) obj;
                if (report.f19782b.equals(this.f19782b)) {
                    if (report.f19783c.equals(this.f19783c)) {
                        if (report.f19784d.equals(this.f19784d)) {
                            if (report.f19785e != this.f19785e) {
                                return false;
                            }
                            if (report.f19786f != this.f19786f) {
                                return false;
                            }
                            if (report.f19788h != this.f19788h) {
                                return false;
                            }
                            if (report.f19789i.equals(this.f19789i)) {
                                if (report.f19790j != this.f19790j) {
                                    return false;
                                }
                                if (report.f19791k != this.f19791k) {
                                    return false;
                                }
                                if (report.f19792l != this.f19792l) {
                                    return false;
                                }
                                if (report.f19793m.equals(this.f19793m)) {
                                    if (report.f19798r.equals(this.f19798r)) {
                                        if (report.f19799s.equals(this.f19799s)) {
                                            if (report.f19803w != this.f19803w) {
                                                return false;
                                            }
                                            if (report.f19800t.equals(this.f19800t)) {
                                                if (report.f19804x != this.f19804x) {
                                                    return false;
                                                }
                                                if (report.f19805y != this.f19805y) {
                                                    return false;
                                                }
                                                if (report.f19796p.size() != this.f19796p.size()) {
                                                    return false;
                                                }
                                                for (int i = 0; i < this.f19796p.size(); i++) {
                                                    if (!((String) report.f19796p.get(i)).equals(this.f19796p.get(i))) {
                                                        return false;
                                                    }
                                                }
                                                if (report.f19797q.size() != this.f19797q.size()) {
                                                    return false;
                                                }
                                                for (int i2 = 0; i2 < this.f19797q.size(); i2++) {
                                                    if (!((String) report.f19797q.get(i2)).equals(this.f19797q.get(i2))) {
                                                        return false;
                                                    }
                                                }
                                                if (report.f19795o.size() != this.f19795o.size()) {
                                                    return false;
                                                }
                                                for (int i3 = 0; i3 < this.f19795o.size(); i3++) {
                                                    if (!((C9851a) report.f19795o.get(i3)).equals(this.f19795o.get(i3))) {
                                                        return false;
                                                    }
                                                }
                                                return true;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
        }
        return false;
    }

    public final synchronized int hashCode() {
        int i;
        int m12131a;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        i = 1;
        m12131a = ((((((C0585a.m12131a(this.f19782b) * 31) + C0585a.m12131a(this.f19783c)) * 31) + C0585a.m12131a(this.f19784d)) * 31) + (this.f19785e ? 1 : 0)) * 31;
        if (!this.f19786f) {
            i = 0;
        }
        j = this.f19788h;
        j2 = this.f19790j;
        j3 = this.f19791k;
        j4 = this.f19792l;
        j5 = this.f19804x;
        j6 = this.f19805y;
        return ((((((((((((((((((((((((((((((m12131a + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + C0585a.m12131a(this.f19789i)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + C0585a.m12131a(this.f19793m)) * 31) + C0585a.m12131a(this.f19795o)) * 31) + C0585a.m12131a(this.f19796p)) * 31) + C0585a.m12131a(this.f19797q)) * 31) + C0585a.m12131a(this.f19798r)) * 31) + C0585a.m12131a(this.f19799s)) * 31) + C0585a.m12131a(this.f19800t)) * 31) + (this.f19803w ? 1 : 0);
    }
}

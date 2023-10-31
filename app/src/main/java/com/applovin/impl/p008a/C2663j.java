package com.applovin.impl.p008a;

import androidx.appcompat.widget.C0406q1;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.C3343r;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.a.j */
/* loaded from: classes.dex */
public class C2663j {

    /* renamed from: a */
    private String f6321a;

    /* renamed from: b */
    private String f6322b;

    /* renamed from: c */
    private String f6323c;

    /* renamed from: d */
    private long f6324d = -1;

    /* renamed from: e */
    private int f6325e = -1;

    private C2663j() {
    }

    /* renamed from: a */
    private static int m9222a(String str, C2657e c2657e) {
        if ("start".equalsIgnoreCase(str)) {
            return 0;
        }
        if ("firstQuartile".equalsIgnoreCase(str)) {
            return 25;
        }
        if ("midpoint".equalsIgnoreCase(str)) {
            return 50;
        }
        if ("thirdQuartile".equalsIgnoreCase(str)) {
            return 75;
        }
        if ("complete".equalsIgnoreCase(str)) {
            if (c2657e != null) {
                return c2657e.m9238h();
            }
            return 95;
        }
        return -1;
    }

    /* renamed from: a */
    public static C2663j m9223a(C3343r c3343r, C2657e c2657e, C3214m c3214m) {
        List<String> explode;
        int size;
        TimeUnit timeUnit;
        long seconds;
        if (c3343r != null) {
            if (c3214m != null) {
                try {
                    String m6880c = c3343r.m6880c();
                    if (!StringUtils.isValidString(m6880c)) {
                        if (C3349v.m6862a()) {
                            c3214m.m7487A().m6850e("VastTracker", "Unable to create tracker. Could not find URL.");
                            return null;
                        }
                        return null;
                    }
                    C2663j c2663j = new C2663j();
                    c2663j.f6323c = m6880c;
                    c2663j.f6321a = c3343r.m6882b().get(FacebookAdapter.KEY_ID);
                    c2663j.f6322b = c3343r.m6882b().get("event");
                    c2663j.f6325e = m9222a(c2663j.m9225a(), c2657e);
                    String str = c3343r.m6882b().get("offset");
                    if (StringUtils.isValidString(str)) {
                        String trim = str.trim();
                        if (trim.contains("%")) {
                            c2663j.f6325e = StringUtils.parseInt(trim.substring(0, trim.length() - 1));
                        } else if (trim.contains(":") && (size = (explode = CollectionUtils.explode(trim, ":")).size()) > 0) {
                            int i = size - 1;
                            long j = 0;
                            for (int i2 = i; i2 >= 0; i2--) {
                                String str2 = explode.get(i2);
                                if (StringUtils.isNumeric(str2)) {
                                    int parseInt = Integer.parseInt(str2);
                                    if (i2 == i) {
                                        seconds = parseInt;
                                    } else {
                                        if (i2 == size - 2) {
                                            timeUnit = TimeUnit.MINUTES;
                                        } else if (i2 == size - 3) {
                                            timeUnit = TimeUnit.HOURS;
                                        }
                                        seconds = timeUnit.toSeconds(parseInt);
                                    }
                                    j += seconds;
                                }
                            }
                            c2663j.f6324d = j;
                            c2663j.f6325e = -1;
                        }
                    }
                    return c2663j;
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        c3214m.m7487A().m6854b("VastTracker", "Error occurred while initializing", th);
                        return null;
                    }
                    return null;
                }
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    /* renamed from: a */
    public String m9225a() {
        return this.f6322b;
    }

    /* renamed from: a */
    public boolean m9224a(long j, int i) {
        long j2 = this.f6324d;
        boolean z = j2 >= 0;
        boolean z2 = j >= j2;
        int i2 = this.f6325e;
        boolean z3 = i2 >= 0;
        boolean z4 = i >= i2;
        if (z && z2) {
            return true;
        }
        return z3 && z4;
    }

    /* renamed from: b */
    public String m9221b() {
        return this.f6323c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2663j) {
            C2663j c2663j = (C2663j) obj;
            if (this.f6324d == c2663j.f6324d && this.f6325e == c2663j.f6325e) {
                String str = this.f6321a;
                if (str == null ? c2663j.f6321a == null : str.equals(c2663j.f6321a)) {
                    String str2 = this.f6322b;
                    if (str2 == null ? c2663j.f6322b == null : str2.equals(c2663j.f6322b)) {
                        return this.f6323c.equals(c2663j.f6323c);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.f6321a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.f6322b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int m12537a = C0406q1.m12537a(this.f6323c, (i3 + i2) * 31, 31);
        long j = this.f6324d;
        return ((m12537a + ((int) (j ^ (j >>> 32)))) * 31) + this.f6325e;
    }

    public String toString() {
        return "VastTracker{identifier='" + this.f6321a + "', event='" + this.f6322b + "', uriString='" + this.f6323c + "', offsetSeconds=" + this.f6324d + ", offsetPercent=" + this.f6325e + '}';
    }
}

package com.applovin.impl.p008a;

import android.net.Uri;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.C3343r;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.a.d */
/* loaded from: classes.dex */
public class C2656d {

    /* renamed from: a */
    private int f6278a;

    /* renamed from: b */
    private int f6279b;

    /* renamed from: c */
    private Uri f6280c;

    /* renamed from: d */
    private C2660h f6281d;

    /* renamed from: e */
    private Set<C2663j> f6282e = new HashSet();

    /* renamed from: f */
    private Map<String, Set<C2663j>> f6283f = new HashMap();

    private C2656d() {
    }

    /* renamed from: a */
    public static C2656d m9249a(C3343r c3343r, C2656d c2656d, C2657e c2657e, C3214m c3214m) {
        C3343r m6881b;
        if (c3343r != null) {
            if (c3214m != null) {
                if (c2656d == null) {
                    try {
                        c2656d = new C2656d();
                    } catch (Throwable th) {
                        if (C3349v.m6862a()) {
                            c3214m.m7487A().m6854b("VastCompanionAd", "Error occurred while initializing", th);
                            return null;
                        }
                        return null;
                    }
                }
                if (c2656d.f6278a == 0 && c2656d.f6279b == 0) {
                    int parseInt = StringUtils.parseInt(c3343r.m6882b().get("width"));
                    int parseInt2 = StringUtils.parseInt(c3343r.m6882b().get("height"));
                    if (parseInt > 0 && parseInt2 > 0) {
                        c2656d.f6278a = parseInt;
                        c2656d.f6279b = parseInt2;
                    }
                }
                c2656d.f6281d = C2660h.m9231a(c3343r, c2656d.f6281d, c3214m);
                if (c2656d.f6280c == null && (m6881b = c3343r.m6881b("CompanionClickThrough")) != null) {
                    String m6880c = m6881b.m6880c();
                    if (StringUtils.isValidString(m6880c)) {
                        c2656d.f6280c = Uri.parse(m6880c);
                    }
                }
                C2665l.m9210a(c3343r.m6883a("CompanionClickTracking"), c2656d.f6282e, c2657e, c3214m);
                C2665l.m9212a(c3343r, c2656d.f6283f, c2657e, c3214m);
                return c2656d;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    /* renamed from: a */
    public Uri m9250a() {
        return this.f6280c;
    }

    /* renamed from: b */
    public C2660h m9248b() {
        return this.f6281d;
    }

    /* renamed from: c */
    public Set<C2663j> m9247c() {
        return this.f6282e;
    }

    /* renamed from: d */
    public Map<String, Set<C2663j>> m9246d() {
        return this.f6283f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2656d) {
            C2656d c2656d = (C2656d) obj;
            if (this.f6278a == c2656d.f6278a && this.f6279b == c2656d.f6279b) {
                Uri uri = this.f6280c;
                if (uri == null ? c2656d.f6280c == null : uri.equals(c2656d.f6280c)) {
                    C2660h c2660h = this.f6281d;
                    if (c2660h == null ? c2656d.f6281d == null : c2660h.equals(c2656d.f6281d)) {
                        Set<C2663j> set = this.f6282e;
                        if (set == null ? c2656d.f6282e == null : set.equals(c2656d.f6282e)) {
                            Map<String, Set<C2663j>> map = this.f6283f;
                            Map<String, Set<C2663j>> map2 = c2656d.f6283f;
                            return map != null ? map.equals(map2) : map2 == null;
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

    public int hashCode() {
        int i = ((this.f6278a * 31) + this.f6279b) * 31;
        Uri uri = this.f6280c;
        int hashCode = (i + (uri != null ? uri.hashCode() : 0)) * 31;
        C2660h c2660h = this.f6281d;
        int hashCode2 = (hashCode + (c2660h != null ? c2660h.hashCode() : 0)) * 31;
        Set<C2663j> set = this.f6282e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<C2663j>> map = this.f6283f;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastCompanionAd{width=" + this.f6278a + ", height=" + this.f6279b + ", destinationUri=" + this.f6280c + ", nonVideoResource=" + this.f6281d + ", clickTrackers=" + this.f6282e + ", eventTrackers=" + this.f6283f + '}';
    }
}

package com.applovin.impl.p008a;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.C3294g;
import com.applovin.impl.sdk.utils.C3343r;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.a.m */
/* loaded from: classes.dex */
public class C2666m {

    /* renamed from: a */
    private List<C2669n> f6329a;

    /* renamed from: b */
    private List<String> f6330b;

    /* renamed from: c */
    private int f6331c;

    /* renamed from: d */
    private Uri f6332d;

    /* renamed from: e */
    private final Set<C2663j> f6333e;

    /* renamed from: f */
    private final Map<String, Set<C2663j>> f6334f;

    /* renamed from: com.applovin.impl.a.m$a */
    /* loaded from: classes.dex */
    public enum EnumC2668a {
        UNSPECIFIED,
        LOW,
        MEDIUM,
        HIGH
    }

    private C2666m() {
        this.f6329a = Collections.emptyList();
        this.f6330b = Collections.emptyList();
        this.f6333e = new HashSet();
        this.f6334f = new HashMap();
    }

    private C2666m(C2657e c2657e) {
        this.f6329a = Collections.emptyList();
        this.f6330b = Collections.emptyList();
        this.f6333e = new HashSet();
        this.f6334f = new HashMap();
        this.f6330b = c2657e.m9239g();
    }

    /* renamed from: a */
    private static int m9197a(String str, C3214m c3214m) {
        try {
            List<String> explode = CollectionUtils.explode(str, ":");
            if (explode.size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt(explode.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt(explode.get(1))) + StringUtils.parseInt(explode.get(2)));
            }
        } catch (Throwable unused) {
            if (C3349v.m6862a()) {
                C3349v m7487A = c3214m.m7487A();
                m7487A.m6850e("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static C2666m m9199a(C3343r c3343r, C2666m c2666m, C2657e c2657e, C3214m c3214m) {
        C3343r m6881b;
        List<C2669n> m9198a;
        C3343r m6881b2;
        int m9197a;
        if (c3343r != null) {
            if (c2657e != null) {
                if (c3214m != null) {
                    if (c2666m == null) {
                        try {
                            c2666m = new C2666m(c2657e);
                        } catch (Throwable th) {
                            if (C3349v.m6862a()) {
                                c3214m.m7487A().m6854b("VastVideoCreative", "Error occurred while initializing", th);
                                return null;
                            }
                            return null;
                        }
                    }
                    if (c2666m.f6331c == 0 && (m6881b2 = c3343r.m6881b("Duration")) != null && (m9197a = m9197a(m6881b2.m6880c(), c3214m)) > 0) {
                        c2666m.f6331c = m9197a;
                    }
                    C3343r m6881b3 = c3343r.m6881b("MediaFiles");
                    if (m6881b3 != null && (m9198a = m9198a(m6881b3, c3214m)) != null && m9198a.size() > 0) {
                        List<C2669n> list = c2666m.f6329a;
                        if (list != null) {
                            m9198a.addAll(list);
                        }
                        c2666m.f6329a = m9198a;
                    }
                    C3343r m6881b4 = c3343r.m6881b("VideoClicks");
                    if (m6881b4 != null) {
                        if (c2666m.f6332d == null && (m6881b = m6881b4.m6881b("ClickThrough")) != null) {
                            String m6880c = m6881b.m6880c();
                            if (StringUtils.isValidString(m6880c)) {
                                c2666m.f6332d = Uri.parse(m6880c);
                            }
                        }
                        C2665l.m9210a(m6881b4.m6883a("ClickTracking"), c2666m.f6333e, c2657e, c3214m);
                    }
                    C2665l.m9212a(c3343r, c2666m.f6334f, c2657e, c3214m);
                    return c2666m;
                }
                throw new IllegalArgumentException("No sdk specified.");
            }
            throw new IllegalArgumentException("No context specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    /* renamed from: a */
    private static List<C2669n> m9198a(C3343r c3343r, C3214m c3214m) {
        List<C3343r> m6883a = c3343r.m6883a("MediaFile");
        ArrayList arrayList = new ArrayList(m6883a.size());
        List<String> explode = CollectionUtils.explode((String) c3214m.m7456a(C3109b.f8039ek));
        List<String> explode2 = CollectionUtils.explode((String) c3214m.m7456a(C3109b.f8038ej));
        for (C3343r c3343r2 : m6883a) {
            C2669n m9189a = C2669n.m9189a(c3343r2, c3214m);
            if (m9189a != null) {
                try {
                    String m9186c = m9189a.m9186c();
                    if (!StringUtils.isValidString(m9186c) || explode.contains(m9186c)) {
                        if (((Boolean) c3214m.m7456a(C3109b.f8040el)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(m9189a.m9187b().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !explode2.contains(fileExtensionFromUrl)) {
                            }
                        }
                        if (C3349v.m6862a()) {
                            C3349v m7487A = c3214m.m7487A();
                            m7487A.m6851d("VastVideoCreative", "Video file not supported: " + m9189a);
                        }
                    }
                    arrayList.add(m9189a);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v m7487A2 = c3214m.m7487A();
                        m7487A2.m6854b("VastVideoCreative", "Failed to validate video file: " + m9189a, th);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public C2669n m9200a(EnumC2668a enumC2668a) {
        List<C2669n> list = this.f6329a;
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(3);
        for (String str : this.f6330b) {
            for (C2669n c2669n : this.f6329a) {
                String m9186c = c2669n.m9186c();
                if (StringUtils.isValidString(m9186c) && str.equalsIgnoreCase(m9186c)) {
                    arrayList.add(c2669n);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        List list2 = arrayList;
        if (isEmpty) {
            list2 = this.f6329a;
        }
        if (C3294g.m7024c()) {
            Collections.sort(list2, new Comparator<C2669n>() { // from class: com.applovin.impl.a.m.1
                @Override // java.util.Comparator
                @TargetApi(19)
                /* renamed from: a */
                public int compare(C2669n c2669n2, C2669n c2669n3) {
                    return Integer.compare(c2669n2.m9185d(), c2669n3.m9185d());
                }
            });
        }
        return (C2669n) list2.get(enumC2668a == EnumC2668a.LOW ? 0 : enumC2668a == EnumC2668a.MEDIUM ? list2.size() / 2 : list2.size() - 1);
    }

    /* renamed from: a */
    public List<C2669n> m9201a() {
        return this.f6329a;
    }

    /* renamed from: b */
    public int m9196b() {
        return this.f6331c;
    }

    /* renamed from: c */
    public Uri m9195c() {
        return this.f6332d;
    }

    /* renamed from: d */
    public Set<C2663j> m9194d() {
        return this.f6333e;
    }

    /* renamed from: e */
    public Map<String, Set<C2663j>> m9193e() {
        return this.f6334f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2666m) {
            C2666m c2666m = (C2666m) obj;
            if (this.f6331c != c2666m.f6331c) {
                return false;
            }
            List<C2669n> list = this.f6329a;
            if (list == null ? c2666m.f6329a == null : list.equals(c2666m.f6329a)) {
                Uri uri = this.f6332d;
                if (uri == null ? c2666m.f6332d == null : uri.equals(c2666m.f6332d)) {
                    Set<C2663j> set = this.f6333e;
                    if (set == null ? c2666m.f6333e == null : set.equals(c2666m.f6333e)) {
                        Map<String, Set<C2663j>> map = this.f6334f;
                        Map<String, Set<C2663j>> map2 = c2666m.f6334f;
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

    public int hashCode() {
        List<C2669n> list = this.f6329a;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f6331c) * 31;
        Uri uri = this.f6332d;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set<C2663j> set = this.f6333e;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, Set<C2663j>> map = this.f6334f;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f6329a + ", durationSeconds=" + this.f6331c + ", destinationUri=" + this.f6332d + ", clickTrackers=" + this.f6333e + ", eventTrackers=" + this.f6334f + '}';
    }
}

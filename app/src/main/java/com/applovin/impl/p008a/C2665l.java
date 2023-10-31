package com.applovin.impl.p008a;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.network.C3262h;
import com.applovin.impl.sdk.utils.C3343r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.a.l */
/* loaded from: classes.dex */
public class C2665l {

    /* renamed from: a */
    private static final DateFormat f6327a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* renamed from: b */
    private static final Random f6328b = new Random(System.currentTimeMillis());

    /* renamed from: a */
    public static Uri m9211a(String str, long j, Uri uri, EnumC2658f enumC2658f, C3214m c3214m) {
        if (!URLUtil.isValidUrl(str)) {
            if (C3349v.m6862a()) {
                c3214m.m7487A().m6850e("VastUtils", "Unable to replace macros in invalid URL string.");
            }
            return null;
        }
        try {
            String num = Integer.toString(enumC2658f.m9237a());
            String replace = str.replace("[ERRORCODE]", num).replace("[REASON]", num);
            if (j >= 0) {
                replace = replace.replace("[CONTENTPLAYHEAD]", m9219a(j));
            }
            if (uri != null) {
                replace = replace.replace("[ASSETURI]", uri.toString());
            }
            return Uri.parse(replace.replace("[CACHEBUSTING]", m9220a()).replace("[TIMESTAMP]", m9205b()));
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                C3349v m7487A = c3214m.m7487A();
                m7487A.m6854b("VastUtils", "Unable to replace macros in URL string " + str, th);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static EnumC2658f m9218a(C2649a c2649a) {
        if (m9204b(c2649a) || m9202c(c2649a)) {
            return null;
        }
        return EnumC2658f.GENERAL_WRAPPER_ERROR;
    }

    /* renamed from: a */
    private static String m9220a() {
        return Integer.toString(f6328b.nextInt(89999999) + 10000000);
    }

    /* renamed from: a */
    private static String m9219a(long j) {
        if (j > 0) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long hours = timeUnit.toHours(j);
            long minutes = timeUnit.toMinutes(j);
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            return String.format(Locale.US, "%02d:%02d:%02d.000", Long.valueOf(hours), Long.valueOf(minutes % timeUnit2.toSeconds(1L)), Long.valueOf(j % timeUnit2.toSeconds(1L)));
        }
        return "00:00:00.000";
    }

    /* renamed from: a */
    public static String m9217a(C2657e c2657e) {
        C3343r m6879c;
        if (c2657e != null) {
            List<C3343r> m9244b = c2657e.m9244b();
            int size = c2657e.m9244b().size();
            if (size <= 0 || (m6879c = m9244b.get(size - 1).m6879c("VASTAdTagURI")) == null) {
                return null;
            }
            return m6879c.m6880c();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    /* renamed from: a */
    public static String m9213a(C3343r c3343r, String str, String str2) {
        C3343r m6881b = c3343r.m6881b(str);
        if (m6881b != null) {
            String m6880c = m6881b.m6880c();
            if (StringUtils.isValidString(m6880c)) {
                return m6880c;
            }
        }
        return str2;
    }

    /* renamed from: a */
    private static Set<C2663j> m9216a(C2657e c2657e, C3214m c3214m) {
        if (c2657e != null) {
            List<C3343r> m9244b = c2657e.m9244b();
            Set<C2663j> hashSet = new HashSet<>(m9244b.size());
            for (C3343r c3343r : m9244b) {
                C3343r m6879c = c3343r.m6879c("Wrapper");
                if (m6879c == null) {
                    m6879c = c3343r.m6879c("InLine");
                }
                hashSet = m9206a(hashSet, m6879c != null ? m6879c.m6883a("Error") : c3343r.m6883a("Error"), c2657e, c3214m);
            }
            if (C3349v.m6862a()) {
                C3349v m7487A = c3214m.m7487A();
                m7487A.m6855b("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
            }
            return hashSet;
        }
        return null;
    }

    /* renamed from: a */
    private static Set<C2663j> m9206a(Set<C2663j> set, List<C3343r> list, C2657e c2657e, C3214m c3214m) {
        if (list != null) {
            for (C3343r c3343r : list) {
                C2663j m9223a = C2663j.m9223a(c3343r, c2657e, c3214m);
                if (m9223a != null) {
                    set.add(m9223a);
                }
            }
        }
        return set;
    }

    /* renamed from: a */
    public static void m9215a(C2657e c2657e, AppLovinAdLoadListener appLovinAdLoadListener, EnumC2658f enumC2658f, int i, C3214m c3214m) {
        if (c3214m == null) {
            throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
        }
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i);
        }
        m9208a(m9216a(c2657e, c3214m), enumC2658f, c3214m);
    }

    /* renamed from: a */
    public static void m9212a(C3343r c3343r, Map<String, Set<C2663j>> map, C2657e c2657e, C3214m c3214m) {
        List<C3343r> m6883a;
        if (c3214m == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        }
        if (c3343r == null) {
            if (C3349v.m6862a()) {
                c3214m.m7487A().m6850e("VastUtils", "Unable to render event trackers; null node provided");
            }
        } else if (map == null) {
            if (C3349v.m6862a()) {
                c3214m.m7487A().m6850e("VastUtils", "Unable to render event trackers; null event trackers provided");
            }
        } else {
            C3343r m6881b = c3343r.m6881b("TrackingEvents");
            if (m6881b == null || (m6883a = m6881b.m6883a("Tracking")) == null) {
                return;
            }
            for (C3343r c3343r2 : m6883a) {
                String str = c3343r2.m6882b().get("event");
                if (StringUtils.isValidString(str)) {
                    C2663j m9223a = C2663j.m9223a(c3343r2, c2657e, c3214m);
                    if (m9223a != null) {
                        Set<C2663j> set = map.get(str);
                        if (set != null) {
                            set.add(m9223a);
                        } else {
                            HashSet hashSet = new HashSet();
                            hashSet.add(m9223a);
                            map.put(str, hashSet);
                        }
                    }
                } else if (C3349v.m6862a()) {
                    C3349v m7487A = c3214m.m7487A();
                    m7487A.m6850e("VastUtils", "Could not find event for tracking node = " + c3343r2);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m9210a(List<C3343r> list, Set<C2663j> set, C2657e c2657e, C3214m c3214m) {
        if (c3214m == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        }
        if (list == null) {
            if (C3349v.m6862a()) {
                c3214m.m7487A().m6850e("VastUtils", "Unable to render trackers; null nodes provided");
            }
        } else if (set == null) {
            if (C3349v.m6862a()) {
                c3214m.m7487A().m6850e("VastUtils", "Unable to render trackers; null trackers provided");
            }
        } else {
            for (C3343r c3343r : list) {
                C2663j m9223a = C2663j.m9223a(c3343r, c2657e, c3214m);
                if (m9223a != null) {
                    set.add(m9223a);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m9209a(Set<C2663j> set, long j, Uri uri, EnumC2658f enumC2658f, C3214m c3214m) {
        if (c3214m == null) {
            throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
        }
        if (set == null || set.isEmpty()) {
            return;
        }
        for (C2663j c2663j : set) {
            Uri m9211a = m9211a(c2663j.m9221b(), j, uri, enumC2658f, c3214m);
            if (m9211a != null) {
                c3214m.m7467U().m7251a(C3262h.m7216o().m7205c(m9211a.toString()).m7211a(false).m7215a(), false);
            }
        }
    }

    /* renamed from: a */
    public static void m9208a(Set<C2663j> set, EnumC2658f enumC2658f, C3214m c3214m) {
        m9209a(set, -1L, (Uri) null, enumC2658f, c3214m);
    }

    /* renamed from: a */
    public static void m9207a(Set<C2663j> set, C3214m c3214m) {
        m9209a(set, -1L, (Uri) null, EnumC2658f.UNSPECIFIED, c3214m);
    }

    /* renamed from: a */
    public static boolean m9214a(C3343r c3343r) {
        if (c3343r != null) {
            return c3343r.m6879c("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    /* renamed from: b */
    private static String m9205b() {
        DateFormat dateFormat = f6327a;
        dateFormat.setTimeZone(TimeZone.getDefault());
        return dateFormat.format(new Date());
    }

    /* renamed from: b */
    public static boolean m9204b(C2649a c2649a) {
        C2666m m9286m;
        List<C2669n> m9201a;
        return (c2649a == null || (m9286m = c2649a.m9286m()) == null || (m9201a = m9286m.m9201a()) == null || m9201a.isEmpty()) ? false : true;
    }

    /* renamed from: b */
    public static boolean m9203b(C3343r c3343r) {
        if (c3343r != null) {
            return c3343r.m6879c("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    /* renamed from: c */
    public static boolean m9202c(C2649a c2649a) {
        C2656d m9303aM;
        C2660h m9248b;
        if (c2649a == null || (m9303aM = c2649a.m9303aM()) == null || (m9248b = m9303aM.m9248b()) == null) {
            return false;
        }
        return m9248b.m9228b() != null || StringUtils.isValidString(m9248b.m9227c());
    }
}

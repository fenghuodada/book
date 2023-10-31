package com.iab.omid.library.applovin.p048d;

import android.text.TextUtils;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.adsession.C8773a;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* renamed from: com.iab.omid.library.applovin.d.e */
/* loaded from: classes3.dex */
public class C8794e {
    /* renamed from: a */
    public static void m3041a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: a */
    public static void m3040a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
        if (owner == Owner.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (impressionType == ImpressionType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: a */
    public static void m3039a(C8773a c8773a) {
        if (c8773a.m3138g()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: a */
    public static void m3038a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m3037a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m3036a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: b */
    public static void m3035b(C8773a c8773a) {
        if (c8773a.m3137h()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    /* renamed from: c */
    public static void m3034c(C8773a c8773a) {
        m3029h(c8773a);
        m3035b(c8773a);
    }

    /* renamed from: d */
    public static void m3033d(C8773a c8773a) {
        if (c8773a.getAdSessionStatePublisher().m3010c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    /* renamed from: e */
    public static void m3032e(C8773a c8773a) {
        if (c8773a.getAdSessionStatePublisher().m3009d() != null) {
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        }
    }

    /* renamed from: f */
    public static void m3031f(C8773a c8773a) {
        if (!c8773a.m3136i()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    /* renamed from: g */
    public static void m3030g(C8773a c8773a) {
        if (!c8773a.m3135j()) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        }
    }

    /* renamed from: h */
    private static void m3029h(C8773a c8773a) {
        if (!c8773a.m3138g()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}

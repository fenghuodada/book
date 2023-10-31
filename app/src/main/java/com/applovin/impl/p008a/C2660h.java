package com.applovin.impl.p008a;

import android.net.Uri;
import android.webkit.URLUtil;
import androidx.concurrent.futures.C0484a;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.C3343r;
import com.applovin.impl.sdk.utils.StringUtils;

/* renamed from: com.applovin.impl.a.h */
/* loaded from: classes.dex */
public class C2660h {

    /* renamed from: a */
    private EnumC2661a f6311a;

    /* renamed from: b */
    private Uri f6312b;

    /* renamed from: c */
    private String f6313c;

    /* renamed from: com.applovin.impl.a.h$a */
    /* loaded from: classes.dex */
    public enum EnumC2661a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private C2660h() {
    }

    /* renamed from: a */
    public static C2660h m9231a(C3343r c3343r, C2660h c2660h, C3214m c3214m) {
        if (c3343r != null) {
            if (c3214m != null) {
                if (c2660h == null) {
                    try {
                        c2660h = new C2660h();
                    } catch (Throwable th) {
                        if (C3349v.m6862a()) {
                            c3214m.m7487A().m6854b("VastNonVideoResource", "Error occurred while initializing", th);
                            return null;
                        }
                        return null;
                    }
                }
                if (c2660h.f6312b == null && !StringUtils.isValidString(c2660h.f6313c)) {
                    String m9230a = m9230a(c3343r, "StaticResource");
                    if (URLUtil.isValidUrl(m9230a)) {
                        c2660h.f6312b = Uri.parse(m9230a);
                        c2660h.f6311a = EnumC2661a.STATIC;
                        return c2660h;
                    }
                    String m9230a2 = m9230a(c3343r, "IFrameResource");
                    if (StringUtils.isValidString(m9230a2)) {
                        c2660h.f6311a = EnumC2661a.IFRAME;
                        if (URLUtil.isValidUrl(m9230a2)) {
                            c2660h.f6312b = Uri.parse(m9230a2);
                        } else {
                            c2660h.f6313c = m9230a2;
                        }
                        return c2660h;
                    }
                    String m9230a3 = m9230a(c3343r, "HTMLResource");
                    if (StringUtils.isValidString(m9230a3)) {
                        c2660h.f6311a = EnumC2661a.HTML;
                        if (URLUtil.isValidUrl(m9230a3)) {
                            c2660h.f6312b = Uri.parse(m9230a3);
                        } else {
                            c2660h.f6313c = m9230a3;
                        }
                    }
                }
                return c2660h;
            }
            throw new IllegalArgumentException("No sdk specified.");
        }
        throw new IllegalArgumentException("No node specified.");
    }

    /* renamed from: a */
    private static String m9230a(C3343r c3343r, String str) {
        C3343r m6881b = c3343r.m6881b(str);
        if (m6881b != null) {
            return m6881b.m6880c();
        }
        return null;
    }

    /* renamed from: a */
    public EnumC2661a m9233a() {
        return this.f6311a;
    }

    /* renamed from: a */
    public void m9232a(Uri uri) {
        this.f6312b = uri;
    }

    /* renamed from: a */
    public void m9229a(String str) {
        this.f6313c = str;
    }

    /* renamed from: b */
    public Uri m9228b() {
        return this.f6312b;
    }

    /* renamed from: c */
    public String m9227c() {
        return this.f6313c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2660h) {
            C2660h c2660h = (C2660h) obj;
            if (this.f6311a != c2660h.f6311a) {
                return false;
            }
            Uri uri = this.f6312b;
            if (uri == null ? c2660h.f6312b == null : uri.equals(c2660h.f6312b)) {
                String str = this.f6313c;
                String str2 = c2660h.f6313c;
                return str != null ? str.equals(str2) : str2 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        EnumC2661a enumC2661a = this.f6311a;
        int hashCode = (enumC2661a != null ? enumC2661a.hashCode() : 0) * 31;
        Uri uri = this.f6312b;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f6313c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VastNonVideoResource{type=");
        sb.append(this.f6311a);
        sb.append(", resourceUri=");
        sb.append(this.f6312b);
        sb.append(", resourceContents='");
        return C0484a.m12392a(sb, this.f6313c, "'}");
    }
}

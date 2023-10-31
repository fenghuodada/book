package com.applovin.impl.p008a;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.C3343r;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;

/* renamed from: com.applovin.impl.a.n */
/* loaded from: classes.dex */
public class C2669n {

    /* renamed from: a */
    private Uri f6341a;

    /* renamed from: b */
    private Uri f6342b;

    /* renamed from: c */
    private EnumC2670a f6343c;

    /* renamed from: d */
    private String f6344d;

    /* renamed from: e */
    private int f6345e;

    /* renamed from: f */
    private int f6346f;

    /* renamed from: g */
    private int f6347g;

    /* renamed from: com.applovin.impl.a.n$a */
    /* loaded from: classes.dex */
    public enum EnumC2670a {
        Progressive,
        Streaming
    }

    private C2669n() {
    }

    /* renamed from: a */
    private static EnumC2670a m9188a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return EnumC2670a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return EnumC2670a.Streaming;
            }
        }
        return EnumC2670a.Progressive;
    }

    /* renamed from: a */
    public static C2669n m9189a(C3343r c3343r, C3214m c3214m) {
        if (c3343r != null) {
            if (c3214m != null) {
                try {
                    String m6880c = c3343r.m6880c();
                    if (!URLUtil.isValidUrl(m6880c)) {
                        if (C3349v.m6862a()) {
                            c3214m.m7487A().m6850e("VastVideoFile", "Unable to create video file. Could not find URL.");
                            return null;
                        }
                        return null;
                    }
                    Uri parse = Uri.parse(m6880c);
                    C2669n c2669n = new C2669n();
                    c2669n.f6341a = parse;
                    c2669n.f6342b = parse;
                    c2669n.f6347g = StringUtils.parseInt(c3343r.m6882b().get("bitrate"));
                    c2669n.f6343c = m9188a(c3343r.m6882b().get("delivery"));
                    c2669n.f6346f = StringUtils.parseInt(c3343r.m6882b().get("height"));
                    c2669n.f6345e = StringUtils.parseInt(c3343r.m6882b().get("width"));
                    c2669n.f6344d = c3343r.m6882b().get("type").toLowerCase(Locale.ENGLISH);
                    return c2669n;
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        c3214m.m7487A().m6854b("VastVideoFile", "Error occurred while initializing", th);
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
    public Uri m9191a() {
        return this.f6341a;
    }

    /* renamed from: a */
    public void m9190a(Uri uri) {
        this.f6342b = uri;
    }

    /* renamed from: b */
    public Uri m9187b() {
        return this.f6342b;
    }

    /* renamed from: c */
    public String m9186c() {
        return this.f6344d;
    }

    /* renamed from: d */
    public int m9185d() {
        return this.f6347g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2669n) {
            C2669n c2669n = (C2669n) obj;
            if (this.f6345e == c2669n.f6345e && this.f6346f == c2669n.f6346f && this.f6347g == c2669n.f6347g) {
                Uri uri = this.f6341a;
                if (uri == null ? c2669n.f6341a == null : uri.equals(c2669n.f6341a)) {
                    Uri uri2 = this.f6342b;
                    if (uri2 == null ? c2669n.f6342b == null : uri2.equals(c2669n.f6342b)) {
                        if (this.f6343c != c2669n.f6343c) {
                            return false;
                        }
                        String str = this.f6344d;
                        String str2 = c2669n.f6344d;
                        return str != null ? str.equals(str2) : str2 == null;
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
        Uri uri = this.f6341a;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f6342b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        EnumC2670a enumC2670a = this.f6343c;
        int hashCode3 = (hashCode2 + (enumC2670a != null ? enumC2670a.hashCode() : 0)) * 31;
        String str = this.f6344d;
        return ((((((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.f6345e) * 31) + this.f6346f) * 31) + this.f6347g;
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f6341a + ", videoUri=" + this.f6342b + ", deliveryType=" + this.f6343c + ", fileType='" + this.f6344d + "', width=" + this.f6345e + ", height=" + this.f6346f + ", bitrate=" + this.f6347g + '}';
    }
}

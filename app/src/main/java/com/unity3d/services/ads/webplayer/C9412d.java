package com.unity3d.services.ads.webplayer;

import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;

/* renamed from: com.unity3d.services.ads.webplayer.d */
/* loaded from: classes3.dex */
public class C9412d {
    /* renamed from: a */
    public static void m2357a(String str, int i, int i2, int i3, int i4, float f) {
        C9620a m1774c = C9620a.m1774c();
        if (m1774c != null) {
            m1774c.m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.FRAME_UPDATE, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(f));
        }
    }

    /* renamed from: a */
    public static void m2356a(String str, String str2, int i, int i2, int i3, int i4, float f) {
        C9620a m1774c = C9620a.m1774c();
        if (m1774c != null) {
            m1774c.m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.GET_FRAME_RESPONSE, str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(f));
        }
    }

    /* renamed from: a */
    public static void m2355a(String str, String str2, String str3) {
        C9620a m1774c = C9620a.m1774c();
        if (m1774c != null) {
            m1774c.m1784a(EnumC9627b.WEBPLAYER, EnumC9411c.ERROR, str2, str3, str);
        }
    }
}

package com.unity3d.services.core.device;

import android.content.Context;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.unity3d.services.core.properties.C9572d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p060j$.util.DesugarCollections;

/* renamed from: com.unity3d.services.core.device.i */
/* loaded from: classes3.dex */
public class C9512i {

    /* renamed from: a */
    private static final Map<EnumC9513a, String> f18833a = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private static final List<C9509f> f18834b = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.unity3d.services.core.device.i$a */
    /* loaded from: classes3.dex */
    public enum EnumC9513a {
        PRIVATE,
        PUBLIC
    }

    /* renamed from: a */
    public static C9509f m2085a(EnumC9513a enumC9513a) {
        List<C9509f> list = f18834b;
        if (list != null) {
            synchronized (list) {
                for (C9509f c9509f : list) {
                    if (c9509f.m2091b().equals(enumC9513a)) {
                        return c9509f;
                    }
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized void m2084a(EnumC9513a enumC9513a, String str) {
        synchronized (C9512i.class) {
            Map<EnumC9513a, String> map = f18833a;
            if (!map.containsKey(enumC9513a)) {
                map.put(enumC9513a, str);
            }
        }
    }

    /* renamed from: a */
    public static boolean m2086a(Context context) {
        File filesDir;
        if (context == null || (filesDir = context.getFilesDir()) == null) {
            return false;
        }
        EnumC9513a enumC9513a = EnumC9513a.PUBLIC;
        m2084a(enumC9513a, filesDir + RemoteSettings.FORWARD_SLASH_STRING + C9572d.m1928l() + "public-data.json");
        if (m2081d(enumC9513a)) {
            EnumC9513a enumC9513a2 = EnumC9513a.PRIVATE;
            m2084a(enumC9513a2, filesDir + RemoteSettings.FORWARD_SLASH_STRING + C9572d.m1928l() + "private-data.json");
            return m2081d(enumC9513a2);
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m2083b(EnumC9513a enumC9513a) {
        List<C9509f> list = f18834b;
        if (list != null) {
            synchronized (list) {
                for (C9509f c9509f : list) {
                    if (c9509f.m2091b().equals(enumC9513a)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m2082c(EnumC9513a enumC9513a) {
        if (m2083b(enumC9513a)) {
            C9509f m2085a = m2085a(enumC9513a);
            if (m2085a != null) {
                m2085a.m2090c();
                return;
            }
            return;
        }
        Map<EnumC9513a, String> map = f18833a;
        if (map.containsKey(enumC9513a)) {
            C9509f c9509f = new C9509f(map.get(enumC9513a), enumC9513a);
            c9509f.m2090c();
            f18834b.add(c9509f);
        }
    }

    /* renamed from: d */
    private static boolean m2081d(EnumC9513a enumC9513a) {
        if (m2083b(enumC9513a)) {
            return true;
        }
        m2082c(enumC9513a);
        C9509f m2085a = m2085a(enumC9513a);
        if (m2085a != null && !m2085a.m2088e()) {
            m2085a.m2087f();
        }
        return m2085a != null;
    }
}

package com.unity3d.services.ads.webplayer;

import java.util.HashMap;

/* renamed from: com.unity3d.services.ads.webplayer.g */
/* loaded from: classes3.dex */
public class C9422g {

    /* renamed from: a */
    private static C9422g f18452a;

    /* renamed from: b */
    private HashMap<String, C9414f> f18453b = new HashMap<>();

    /* renamed from: a */
    public static C9422g m2324a() {
        if (f18452a == null) {
            f18452a = new C9422g();
        }
        return f18452a;
    }

    /* renamed from: a */
    public synchronized C9414f m2323a(String str) {
        if (this.f18453b.containsKey(str)) {
            return this.f18453b.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public synchronized void m2322a(String str, C9414f c9414f) {
        this.f18453b.put(str, c9414f);
    }

    /* renamed from: b */
    public synchronized void m2321b(String str) {
        if (this.f18453b.containsKey(str)) {
            this.f18453b.remove(str);
        }
    }
}

package com.unity3d.services.core.device;

import com.unity3d.services.core.device.C9512i;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.misc.C9561g;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;
import java.io.File;
import java.io.FileNotFoundException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.device.f */
/* loaded from: classes3.dex */
public class C9509f extends C9561g {

    /* renamed from: a */
    private String f18817a;

    /* renamed from: b */
    private C9512i.EnumC9513a f18818b;

    public C9509f(String str, C9512i.EnumC9513a enumC9513a) {
        this.f18817a = str;
        this.f18818b = enumC9513a;
    }

    /* renamed from: a */
    public synchronized void m2092a(EnumC9511h enumC9511h, Object obj) {
        if (!(C9620a.m1774c() != null ? C9620a.m1774c().m1784a(EnumC9627b.STORAGE, enumC9511h, this.f18818b.name(), obj) : false)) {
            C9549a.m2019b("Couldn't send storage event to WebApp");
        }
    }

    /* renamed from: a */
    public synchronized boolean m2093a() {
        clearData();
        return new File(this.f18817a).delete();
    }

    /* renamed from: b */
    public C9512i.EnumC9513a m2091b() {
        return this.f18818b;
    }

    /* renamed from: c */
    public synchronized boolean m2090c() {
        m2089d();
        super.initData();
        return true;
    }

    /* renamed from: d */
    public synchronized boolean m2089d() {
        try {
            try {
                byte[] m1994a = C9564j.m1994a(new File(this.f18817a));
                if (m1994a == null) {
                    return false;
                }
                setData(new JSONObject(new String(m1994a)));
                return true;
            } catch (Exception e) {
                C9549a.m2022a("Failed to read storage JSON file:", e);
                return false;
            }
        } catch (FileNotFoundException e2) {
            C9549a.m2022a("Storage JSON file not found in local cache:", e2);
            return false;
        }
    }

    /* renamed from: e */
    public synchronized boolean m2088e() {
        return new File(this.f18817a).exists();
    }

    /* renamed from: f */
    public synchronized boolean m2087f() {
        File file = new File(this.f18817a);
        if (getData() != null) {
            return C9564j.m1993a(file, getData().toString());
        }
        return false;
    }
}

package com.unity3d.services.core.reflection;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.unity3d.services.core.reflection.a */
/* loaded from: classes3.dex */
public abstract class AbstractC9574a {

    /* renamed from: b */
    private final Map<String, Class<?>[]> f18956b;

    /* renamed from: d */
    private boolean f18958d = false;

    /* renamed from: a */
    private final String f18955a = mo1685g();

    /* renamed from: c */
    private final Map<String, Method> f18957c = new HashMap();

    public AbstractC9574a(Map<String, Class<?>[]> map) {
        this.f18956b = map;
        m1914d();
    }

    /* renamed from: a */
    private Method m1918a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getDeclaredMethod(str, clsArr);
        } catch (Exception e) {
            C9549a.m2022a("ERROR: Could not find method %s in %s", str, cls.getName() + " " + e.getLocalizedMessage());
            C9620a.m1774c().m1784a(EnumC9627b.GMA, GMAEvent.METHOD_ERROR, new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    private Method m1916b(String str) {
        return this.f18957c.get(str);
    }

    /* renamed from: d */
    private void m1914d() {
        boolean z = true;
        for (Map.Entry<String, Class<?>[]> entry : m1911h().entrySet()) {
            Class<?>[] value = entry.getValue();
            try {
                Method m1918a = m1918a(m1913e(), entry.getKey(), value);
                if (m1918a != null) {
                    this.f18957c.put(entry.getKey(), m1918a);
                }
            } catch (Exception unused) {
                C9549a.m2022a("ERROR: Could not find %s class with method %s and parameters : %s", this.f18955a, entry.getKey(), value);
                z = false;
            }
        }
        this.f18958d = z;
    }

    /* renamed from: a */
    public <T> T m1917a(String str, Object obj, Object... objArr) {
        Method m1916b = m1916b(str);
        if (m1916b == null) {
            C9549a.m2022a("ERROR: Could not find method %s", str);
            return null;
        }
        try {
            return (T) m1916b.invoke(obj, objArr);
        } catch (Exception e) {
            C9549a.m2022a("ERROR: Could not invoke method %s : %s", str, e.getLocalizedMessage());
            return null;
        }
    }

    /* renamed from: b */
    public void m1915b(String str, Object obj, Object... objArr) {
        Method m1916b = m1916b(str);
        if (m1916b == null) {
            C9549a.m2022a("ERROR: Could not find method %s", str);
            return;
        }
        try {
            m1916b.invoke(obj, objArr);
        } catch (Exception e) {
            C9549a.m2022a("ERROR: Could not invoke method %s : %s", str, e.getLocalizedMessage());
        }
    }

    /* renamed from: e */
    public Class<?> m1913e() {
        try {
            return Class.forName(this.f18955a);
        } catch (ClassNotFoundException e) {
            C9549a.m2022a("ERROR: Could not find Class %s %s", this.f18955a, e.getLocalizedMessage());
            return null;
        }
    }

    /* renamed from: f */
    public boolean m1912f() {
        if (m1913e() == null) {
            C9549a.m2022a("ERROR: Could not find class %s", this.f18955a);
            return false;
        }
        if (!this.f18958d) {
            m1914d();
        }
        return this.f18957c.size() == m1911h().size();
    }

    /* renamed from: g */
    public abstract String mo1685g();

    /* renamed from: h */
    public Map<String, Class<?>[]> m1911h() {
        return this.f18956b;
    }
}

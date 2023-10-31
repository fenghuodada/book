package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.webview.C9620a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;

/* renamed from: com.unity3d.services.core.webview.bridge.g */
/* loaded from: classes3.dex */
public class C9634g {

    /* renamed from: a */
    private static HashMap<String, HashMap<String, HashMap<Integer, Method>>> f19130a;

    /* renamed from: a */
    private static Method m1756a(String str, String str2, Object[] objArr) throws JSONException, NoSuchMethodException {
        if (f19130a.containsKey(str)) {
            HashMap<String, HashMap<Integer, Method>> hashMap = f19130a.get(str);
            if (hashMap.containsKey(str2)) {
                return hashMap.get(str2).get(Integer.valueOf(Arrays.deepHashCode(m1753a(objArr))));
            }
            throw new NoSuchMethodException();
        }
        throw new NoSuchMethodException();
    }

    /* renamed from: a */
    public static void m1755a(String str, String str2, Object[] objArr, C9644l c9644l) throws Exception {
        try {
            try {
                m1756a(str, str2, objArr).invoke(null, m1752a(objArr, c9644l));
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | JSONException e) {
                c9644l.m1737a(EnumC9635h.INVOCATION_FAILED, str, str2, objArr, e.getMessage());
                throw e;
            }
        } catch (NoSuchMethodException | JSONException e2) {
            c9644l.m1737a(EnumC9635h.METHOD_NOT_FOUND, str, str2, objArr);
            throw e2;
        }
    }

    /* renamed from: a */
    public static void m1754a(Class[] clsArr) {
        Method[] methods;
        if (clsArr == null) {
            return;
        }
        f19130a = new HashMap<>();
        for (Class cls : clsArr) {
            if (cls != null && (cls.getPackage().getName().startsWith("com.unity3d.services") || cls.getPackage().getName().startsWith("com.unity3d.ads.test"))) {
                HashMap<String, HashMap<Integer, Method>> hashMap = new HashMap<>();
                for (Method method : cls.getMethods()) {
                    if (method.getAnnotation(WebViewExposed.class) != null) {
                        String name = method.getName();
                        HashMap<Integer, Method> hashMap2 = hashMap.containsKey(name) ? hashMap.get(name) : new HashMap<>();
                        hashMap2.put(Integer.valueOf(Arrays.deepHashCode(method.getParameterTypes())), method);
                        hashMap.put(name, hashMap2);
                    }
                }
                f19130a.put(cls.getName(), hashMap);
            }
        }
    }

    /* renamed from: a */
    private static Class<?>[] m1753a(Object[] objArr) throws JSONException {
        Class<?>[] clsArr = objArr == null ? new Class[1] : new Class[objArr.length + 1];
        if (objArr != null) {
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = objArr[i].getClass();
            }
        }
        clsArr[clsArr.length - 1] = C9644l.class;
        return clsArr;
    }

    /* renamed from: a */
    private static Object[] m1752a(Object[] objArr, C9644l c9644l) throws JSONException {
        Object[] objArr2;
        if (objArr != null) {
            objArr2 = new Object[objArr.length + (c9644l != null ? 1 : 0)];
        } else if (c9644l == null) {
            return null;
        } else {
            objArr2 = new Object[1];
        }
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        if (c9644l != null) {
            objArr2[objArr2.length - 1] = c9644l;
        }
        return objArr2;
    }

    /* renamed from: b */
    public static void m1751b(String str, String str2, Object[] objArr) throws Exception {
        try {
            C9620a.m1774c().m1783a(str).m1757a(str2, m1752a(objArr, null));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | JSONException e) {
            C9549a.m2017c("Error while invoking method");
            throw e;
        }
    }
}

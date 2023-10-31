package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.webview.C9620a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.unity3d.services.core.webview.bridge.e */
/* loaded from: classes3.dex */
public class C9632e {

    /* renamed from: a */
    private static AtomicInteger f19122a = new AtomicInteger(0);

    /* renamed from: b */
    private static Map<Integer, C9632e> f19123b;

    /* renamed from: c */
    private ArrayList<ArrayList<Object>> f19124c;

    /* renamed from: d */
    private ArrayList<ArrayList<Object>> f19125d;

    /* renamed from: e */
    private int f19126e = f19122a.getAndIncrement();

    public C9632e() {
        if (f19123b == null) {
            f19123b = new HashMap();
        }
        f19123b.put(Integer.valueOf(this.f19126e), this);
    }

    /* renamed from: a */
    public static synchronized C9632e m1764a(int i) {
        synchronized (C9632e.class) {
            Map<Integer, C9632e> map = f19123b;
            if (map == null || !map.containsKey(Integer.valueOf(i))) {
                return null;
            }
            return f19123b.get(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public int m1765a() {
        return this.f19126e;
    }

    /* renamed from: a */
    public void m1763a(EnumC9628a enumC9628a, Enum r3, Object... objArr) {
        if (this.f19125d == null) {
            this.f19125d = new ArrayList<>();
        }
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(enumC9628a);
        arrayList.add(r3);
        arrayList.add(objArr);
        this.f19125d.add(arrayList);
    }

    /* renamed from: a */
    public void m1762a(String str, String str2, Object[] objArr, C9644l c9644l) {
        if (this.f19124c == null) {
            this.f19124c = new ArrayList<>();
        }
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(objArr);
        arrayList.add(c9644l);
        this.f19124c.add(arrayList);
    }

    /* renamed from: b */
    public ArrayList<ArrayList<Object>> m1761b() {
        return this.f19125d;
    }

    /* renamed from: c */
    public boolean m1760c() {
        ArrayList<ArrayList<Object>> arrayList = this.f19124c;
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        ArrayList<Object> remove = this.f19124c.remove(0);
        String str = (String) remove.get(0);
        String str2 = (String) remove.get(1);
        Object[] objArr = (Object[]) remove.get(2);
        try {
            C9634g.m1755a(str, str2, objArr, (C9644l) remove.get(3));
        } catch (Exception e) {
            C9549a.m2023a(String.format("Error handling invocation %s.%s(%s)", str, str2, Arrays.toString(objArr)), e);
        }
        return true;
    }

    /* renamed from: d */
    public void m1759d() {
        f19123b.remove(Integer.valueOf(m1765a()));
        C9620a.m1774c().m1786a(this);
    }
}

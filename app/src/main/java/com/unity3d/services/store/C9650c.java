package com.unity3d.services.store;

import android.annotation.TargetApi;
import com.unity3d.services.core.properties.C9568a;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;
import com.unity3d.services.store.core.C9655a;
import com.unity3d.services.store.core.C9657b;
import com.unity3d.services.store.gpbl.C9690c;
import com.unity3d.services.store.gpbl.EnumC9659a;
import com.unity3d.services.store.gpbl.InterfaceC9660b;
import com.unity3d.services.store.gpbl.bridges.C9661a;
import com.unity3d.services.store.gpbl.bridges.C9679c;
import com.unity3d.services.store.gpbl.bridges.C9681d;
import com.unity3d.services.store.gpbl.bridges.C9684f;
import com.unity3d.services.store.listeners.C9700e;
import com.unity3d.services.store.listeners.InterfaceC9696a;
import com.unity3d.services.store.listeners.InterfaceC9697b;
import com.unity3d.services.store.listeners.InterfaceC9699d;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

@TargetApi(14)
/* renamed from: com.unity3d.services.store.c */
/* loaded from: classes3.dex */
public class C9650c {

    /* renamed from: a */
    private static C9690c f19186a;

    /* renamed from: b */
    private static AtomicBoolean f19187b = new AtomicBoolean(false);

    /* renamed from: c */
    private static C9655a f19188c;

    /* renamed from: d */
    private static C9657b f19189d;

    /* renamed from: com.unity3d.services.store.c$a */
    /* loaded from: classes3.dex */
    public static class C9651a implements InterfaceC9697b {
        @Override // com.unity3d.services.store.listeners.InterfaceC9697b
        /* renamed from: a */
        public void mo1664a(C9661a c9661a, List<C9679c> list) {
            if (c9661a.m1715i() != EnumC9659a.OK) {
                C9620a.m1774c().m1784a(EnumC9627b.STORE, EnumC9649b.PURCHASES_UPDATED_ERROR, c9661a.m1715i());
                return;
            }
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                for (C9679c c9679c : list) {
                    jSONArray.put(c9679c.m1694k());
                }
            }
            C9620a.m1774c().m1784a(EnumC9627b.STORE, EnumC9649b.PURCHASES_UPDATED_RESULT, jSONArray);
        }
    }

    /* renamed from: com.unity3d.services.store.c$b */
    /* loaded from: classes3.dex */
    public static class C9652b implements InterfaceC9660b {
        @Override // com.unity3d.services.store.gpbl.InterfaceC9660b
        /* renamed from: a */
        public void mo1717a() {
            C9620a.m1774c().m1784a(EnumC9627b.STORE, EnumC9649b.DISCONNECTED_RESULT, new Object[0]);
        }

        @Override // com.unity3d.services.store.gpbl.InterfaceC9660b
        /* renamed from: a */
        public void mo1716a(C9661a c9661a) {
            if (c9661a.m1715i() != EnumC9659a.OK) {
                C9620a.m1774c().m1784a(EnumC9627b.STORE, EnumC9649b.INITIALIZATION_REQUEST_FAILED, c9661a.m1715i());
                return;
            }
            C9620a.m1774c().m1784a(EnumC9627b.STORE, EnumC9649b.INITIALIZATION_REQUEST_RESULT, c9661a.m1715i());
            C9650c.f19187b.set(true);
        }
    }

    /* renamed from: com.unity3d.services.store.c$c */
    /* loaded from: classes3.dex */
    public static class C9653c implements InterfaceC9696a {

        /* renamed from: a */
        final /* synthetic */ int f19190a;

        public C9653c(int i) {
            this.f19190a = i;
        }

        @Override // com.unity3d.services.store.listeners.InterfaceC9696a
        /* renamed from: a */
        public void mo1665a(C9661a c9661a, List<C9681d> list) {
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                for (C9681d c9681d : list) {
                    jSONArray.put(c9681d.m1713i());
                }
            }
            C9620a.m1774c().m1784a(EnumC9627b.STORE, EnumC9649b.PURCHASE_HISTORY_LIST_REQUEST_RESULT, Integer.valueOf(this.f19190a), jSONArray);
        }
    }

    /* renamed from: com.unity3d.services.store.c$d */
    /* loaded from: classes3.dex */
    public static class C9654d implements InterfaceC9699d {

        /* renamed from: a */
        final /* synthetic */ int f19191a;

        public C9654d(int i) {
            this.f19191a = i;
        }

        @Override // com.unity3d.services.store.listeners.InterfaceC9699d
        /* renamed from: a */
        public void mo1663a(C9661a c9661a, List<C9684f> list) {
            JSONArray jSONArray = new JSONArray();
            if (list != null) {
                for (C9684f c9684f : list) {
                    jSONArray.put(c9684f.m1713i());
                }
            }
            C9620a.m1774c().m1784a(EnumC9627b.STORE, EnumC9649b.SKU_DETAILS_LIST_REQUEST_RESULT, Integer.valueOf(this.f19191a), jSONArray);
        }
    }

    /* renamed from: a */
    public static void m1730a(int i, String str) {
        try {
            f19186a.m1680a(str, new C9700e(Integer.valueOf(i), EnumC9649b.PURCHASES_REQUEST_RESULT, EnumC9649b.PURCHASES_REQUEST_ERROR));
        } catch (Exception e) {
            f19188c.m1722a(EnumC9649b.PURCHASES_REQUEST_ERROR, i, e);
        }
    }

    /* renamed from: a */
    public static void m1729a(int i, String str, int i2) {
        try {
            f19186a.m1681a(str, i2, new C9653c(i));
        } catch (Exception e) {
            f19188c.m1722a(EnumC9649b.PURCHASE_HISTORY_LIST_REQUEST_ERROR, i, e);
        }
    }

    /* renamed from: a */
    public static void m1728a(int i, String str, ArrayList<String> arrayList) {
        try {
            f19186a.m1679a(str, arrayList, new C9654d(i));
        } catch (Exception e) {
            f19188c.m1722a(EnumC9649b.SKU_DETAILS_LIST_REQUEST_ERROR, i, e);
        }
    }

    /* renamed from: a */
    public static void m1727a(C9655a c9655a) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InterruptedException, InvocationTargetException {
        if (f19187b.get()) {
            C9620a.m1774c().m1784a(EnumC9627b.STORE, EnumC9649b.INITIALIZATION_REQUEST_RESULT, Integer.valueOf(EnumC9659a.OK.m1719a()));
            return;
        }
        f19188c = c9655a;
        C9690c c9690c = new C9690c(C9568a.m1959e(), new C9651a());
        f19186a = c9690c;
        c9690c.m1683a(new C9652b());
    }

    /* renamed from: a */
    public static void m1726a(ArrayList<String> arrayList) {
        if (f19189d != null) {
            m1723c();
        }
        f19189d = new C9657b(arrayList, f19186a);
        C9568a.m1960d().registerActivityLifecycleCallbacks(f19189d);
    }

    /* renamed from: b */
    public static int m1724b(int i, String str) {
        int i2 = -1;
        try {
            i2 = f19186a.m1682a(str);
            C9620a.m1774c().m1784a(EnumC9627b.STORE, EnumC9649b.IS_FEATURE_SUPPORTED_REQUEST_RESULT, Integer.valueOf(i), Integer.valueOf(i2));
            return i2;
        } catch (Exception e) {
            f19188c.m1722a(EnumC9649b.IS_FEATURE_SUPPORTED_REQUEST_ERROR, i, e);
            return i2;
        }
    }

    /* renamed from: b */
    public static boolean m1725b() {
        return f19187b.get();
    }

    /* renamed from: c */
    public static void m1723c() {
        if (f19189d != null) {
            C9568a.m1960d().unregisterActivityLifecycleCallbacks(f19189d);
            f19189d = null;
        }
    }
}

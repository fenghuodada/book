package com.iab.omid.library.vungle.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import androidx.fragment.C1349a;
import com.iab.omid.library.vungle.adsession.C8830i;
import com.iab.omid.library.vungle.p052b.C8832a;
import com.iab.omid.library.vungle.p052b.C8835c;
import com.iab.omid.library.vungle.p053c.C8843b;
import com.iab.omid.library.vungle.p053c.C8844c;
import com.iab.omid.library.vungle.p053c.InterfaceC8841a;
import com.iab.omid.library.vungle.p054d.C8846a;
import com.iab.omid.library.vungle.p054d.C8847b;
import com.iab.omid.library.vungle.walking.C8860c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.walking.b */
/* loaded from: classes3.dex */
public final class C8855b implements InterfaceC8841a.InterfaceC8842a {

    /* renamed from: g */
    public static final C8855b f16863g = new C8855b();

    /* renamed from: h */
    public static final Handler f16864h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    public static Handler f16865i = null;

    /* renamed from: j */
    public static final RunnableC8856a f16866j = new RunnableC8856a();

    /* renamed from: k */
    public static final RunnableC8857b f16867k = new RunnableC8857b();

    /* renamed from: b */
    public int f16869b;

    /* renamed from: f */
    public long f16873f;

    /* renamed from: a */
    public final ArrayList f16868a = new ArrayList();

    /* renamed from: d */
    public final C8860c f16871d = new C8860c();

    /* renamed from: c */
    public final C8843b f16870c = new C8843b();

    /* renamed from: e */
    public final C8870d f16872e = new C8870d(new C8860c.C8866d());

    /* renamed from: com.iab.omid.library.vungle.walking.b$a */
    /* loaded from: classes3.dex */
    public static class RunnableC8856a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            C8843b c8843b;
            HashMap<String, String> hashMap;
            boolean z;
            String str;
            C8855b c8855b = C8855b.f16863g;
            boolean z2 = false;
            c8855b.f16869b = 0;
            c8855b.f16873f = System.nanoTime();
            C8860c c8860c = c8855b.f16871d;
            c8860c.getClass();
            C8832a c8832a = C8832a.f16829c;
            HashSet<View> hashSet = c8860c.f16877d;
            HashMap<View, String> hashMap2 = c8860c.f16874a;
            HashMap<String, String> hashMap3 = c8860c.f16880g;
            HashMap<String, View> hashMap4 = c8860c.f16876c;
            HashSet<String> hashSet2 = c8860c.f16878e;
            HashSet<String> hashSet3 = c8860c.f16879f;
            if (c8832a != null) {
                for (C8830i c8830i : Collections.unmodifiableCollection(c8832a.f16831b)) {
                    View view = c8830i.f16823c.get();
                    if (c8830i.f16825e && !c8830i.f16826f) {
                        z = true;
                    } else {
                        z = z2;
                    }
                    if (z) {
                        String str2 = c8830i.f16827g;
                        if (view != null) {
                            if (!view.hasWindowFocus()) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet4 = new HashSet();
                                View view2 = view;
                                while (true) {
                                    if (view2 != null) {
                                        String m2929a = C8847b.m2929a(view2);
                                        if (m2929a != null) {
                                            str = m2929a;
                                            break;
                                        }
                                        hashSet4.add(view2);
                                        ViewParent parent = view2.getParent();
                                        if (parent instanceof View) {
                                            view2 = (View) parent;
                                        } else {
                                            view2 = null;
                                        }
                                    } else {
                                        hashSet.addAll(hashSet4);
                                        str = null;
                                        break;
                                    }
                                }
                            }
                            if (str == null) {
                                hashSet2.add(str2);
                                hashMap2.put(view, str2);
                                Iterator it = c8830i.f16822b.iterator();
                                if (it.hasNext()) {
                                    ((C8835c) it.next()).getClass();
                                    throw null;
                                }
                            } else {
                                hashSet3.add(str2);
                                hashMap4.put(str2, view);
                                hashMap3.put(str2, str);
                            }
                        } else {
                            hashSet3.add(str2);
                            hashMap3.put(str2, "noAdView");
                        }
                        z2 = false;
                    }
                }
            }
            long nanoTime = System.nanoTime();
            C8843b c8843b2 = c8855b.f16870c;
            C8844c c8844c = c8843b2.f16848b;
            int size = hashSet3.size();
            C8870d c8870d = c8855b.f16872e;
            if (size > 0) {
                Iterator<String> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    c8844c.getClass();
                    Iterator<String> it3 = it2;
                    HashSet<String> hashSet5 = hashSet3;
                    JSONObject m2933a = C8846a.m2933a(0, 0, 0, 0);
                    View view3 = hashMap4.get(next);
                    String str3 = hashMap3.get(next);
                    if (str3 != null) {
                        hashMap = hashMap3;
                        JSONObject mo2935a = c8843b2.f16847a.mo2935a(view3);
                        try {
                            mo2935a.put("adSessionId", next);
                            c8843b = c8843b2;
                        } catch (JSONException e) {
                            c8843b = c8843b2;
                            C1349a.m10610a("Error with setting ad session id", e);
                        }
                        try {
                            mo2935a.put("notVisibleReason", str3);
                        } catch (JSONException e2) {
                            C1349a.m10610a("Error with setting not visible reason", e2);
                        }
                        try {
                            JSONArray optJSONArray = m2933a.optJSONArray("childViews");
                            if (optJSONArray == null) {
                                optJSONArray = new JSONArray();
                                m2933a.put("childViews", optJSONArray);
                            }
                            optJSONArray.put(mo2935a);
                        } catch (JSONException e3) {
                            e3.printStackTrace();
                        }
                    } else {
                        c8843b = c8843b2;
                        hashMap = hashMap3;
                    }
                    C8846a.m2932b(m2933a);
                    HashSet hashSet6 = new HashSet();
                    hashSet6.add(next);
                    c8870d.getClass();
                    C8860c.AsyncTaskC8868f asyncTaskC8868f = new C8860c.AsyncTaskC8868f(c8870d, hashSet6, m2933a, nanoTime);
                    C8860c.C8866d c8866d = c8870d.f16891b;
                    c8866d.getClass();
                    asyncTaskC8868f.f16885a = c8866d;
                    c8866d.f16888b.add(asyncTaskC8868f);
                    if (c8866d.f16889c == null) {
                        c8866d.m2919a();
                    }
                    it2 = it3;
                    hashSet3 = hashSet5;
                    hashMap3 = hashMap;
                    c8843b2 = c8843b;
                }
            }
            HashMap<String, String> hashMap5 = hashMap3;
            HashSet<String> hashSet7 = hashSet3;
            if (hashSet2.size() > 0) {
                c8844c.getClass();
                JSONObject m2933a2 = C8846a.m2933a(0, 0, 0, 0);
                c8844c.mo2934a(null, m2933a2, c8855b, true);
                C8846a.m2932b(m2933a2);
                c8870d.getClass();
                C8860c.AsyncTaskC8869g asyncTaskC8869g = new C8860c.AsyncTaskC8869g(c8870d, hashSet2, m2933a2, nanoTime);
                C8860c.C8866d c8866d2 = c8870d.f16891b;
                c8866d2.getClass();
                asyncTaskC8869g.f16885a = c8866d2;
                c8866d2.f16888b.add(asyncTaskC8869g);
                if (c8866d2.f16889c == null) {
                    c8866d2.m2919a();
                }
            } else {
                c8870d.getClass();
                C8860c.AsyncTaskC8867e asyncTaskC8867e = new C8860c.AsyncTaskC8867e(c8870d);
                C8860c.C8866d c8866d3 = c8870d.f16891b;
                c8866d3.getClass();
                asyncTaskC8867e.f16885a = c8866d3;
                c8866d3.f16888b.add(asyncTaskC8867e);
                if (c8866d3.f16889c == null) {
                    c8866d3.m2919a();
                }
            }
            hashMap2.clear();
            c8860c.f16875b.clear();
            hashMap4.clear();
            hashSet.clear();
            hashSet2.clear();
            hashSet7.clear();
            hashMap5.clear();
            c8860c.f16881h = false;
            long nanoTime2 = System.nanoTime() - c8855b.f16873f;
            ArrayList arrayList = c8855b.f16868a;
            if (arrayList.size() > 0) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    InterfaceC8859d interfaceC8859d = (InterfaceC8859d) it4.next();
                    TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                    interfaceC8859d.m2920b();
                    if (interfaceC8859d instanceof InterfaceC8858c) {
                        ((InterfaceC8858c) interfaceC8859d).m2921a();
                    }
                }
            }
        }
    }

    /* renamed from: com.iab.omid.library.vungle.walking.b$b */
    /* loaded from: classes3.dex */
    public static class RunnableC8857b implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            Handler handler = C8855b.f16865i;
            if (handler != null) {
                handler.post(C8855b.f16866j);
                C8855b.f16865i.postDelayed(C8855b.f16867k, 200L);
            }
        }
    }

    /* renamed from: com.iab.omid.library.vungle.walking.b$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC8858c extends InterfaceC8859d {
        /* renamed from: a */
        void m2921a();
    }

    /* renamed from: com.iab.omid.library.vungle.walking.b$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC8859d {
        /* renamed from: b */
        void m2920b();
    }

    /* renamed from: a */
    public static void m2923a() {
        if (f16865i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f16865i = handler;
            handler.post(f16866j);
            f16865i.postDelayed(f16867k, 200L);
        }
    }

    /* renamed from: b */
    public final void m2922b(View view, InterfaceC8841a interfaceC8841a, JSONObject jSONObject) {
        boolean z;
        char c;
        String str;
        boolean z2;
        boolean z3 = false;
        if (C8847b.m2929a(view) == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        C8860c c8860c = this.f16871d;
        if (c8860c.f16877d.contains(view)) {
            c = 1;
        } else if (c8860c.f16881h) {
            c = 2;
        } else {
            c = 3;
        }
        if (c == 3) {
            return;
        }
        JSONObject mo2935a = interfaceC8841a.mo2935a(view);
        WindowManager windowManager = C8846a.f16851a;
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(mo2935a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        HashMap<View, String> hashMap = c8860c.f16874a;
        if (hashMap.size() == 0) {
            str = null;
        } else {
            str = hashMap.get(view);
            if (str != null) {
                hashMap.remove(view);
            }
        }
        if (str != null) {
            try {
                mo2935a.put("adSessionId", str);
            } catch (JSONException e2) {
                C1349a.m10610a("Error with setting ad session id", e2);
            }
            c8860c.f16881h = true;
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            HashMap<View, C8860c.C8861a> hashMap2 = c8860c.f16875b;
            C8860c.C8861a c8861a = hashMap2.get(view);
            if (c8861a != null) {
                hashMap2.remove(view);
            }
            if (c8861a == null) {
                if (c == 1) {
                    z3 = true;
                }
                interfaceC8841a.mo2934a(view, mo2935a, this, z3);
            } else {
                new JSONArray();
                throw null;
            }
        }
        this.f16869b++;
    }
}

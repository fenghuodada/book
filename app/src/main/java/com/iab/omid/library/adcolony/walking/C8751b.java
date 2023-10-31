package com.iab.omid.library.adcolony.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import androidx.cardview.C0463a;
import com.iab.omid.library.adcolony.p041b.C8731c;
import com.iab.omid.library.adcolony.p042c.C8739b;
import com.iab.omid.library.adcolony.p042c.InterfaceC8737a;
import com.iab.omid.library.adcolony.p043d.C8742a;
import com.iab.omid.library.adcolony.p043d.C8743b;
import com.iab.omid.library.adcolony.walking.C8756c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.walking.b */
/* loaded from: classes3.dex */
public final class C8751b implements InterfaceC8737a.InterfaceC8738a {

    /* renamed from: h */
    public static final C8751b f16637h = new C8751b();

    /* renamed from: i */
    public static final Handler f16638i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    public static Handler f16639j = null;

    /* renamed from: k */
    public static final RunnableC8752a f16640k = new RunnableC8752a();

    /* renamed from: l */
    public static final RunnableC8753b f16641l = new RunnableC8753b();

    /* renamed from: b */
    public int f16643b;

    /* renamed from: g */
    public long f16648g;

    /* renamed from: a */
    public final ArrayList f16642a = new ArrayList();

    /* renamed from: c */
    public final ArrayList f16644c = new ArrayList();

    /* renamed from: e */
    public final C8756c f16646e = new C8756c();

    /* renamed from: d */
    public final C8739b f16645d = new C8739b();

    /* renamed from: f */
    public final C8766d f16647f = new C8766d(new C8756c.C8762d());

    /* renamed from: com.iab.omid.library.adcolony.walking.b$a */
    /* loaded from: classes3.dex */
    public static class RunnableC8752a implements Runnable {
        /* JADX WARN: Removed duplicated region for block: B:47:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0114  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 650
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iab.omid.library.adcolony.walking.C8751b.RunnableC8752a.run():void");
        }
    }

    /* renamed from: com.iab.omid.library.adcolony.walking.b$b */
    /* loaded from: classes3.dex */
    public static class RunnableC8753b implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            Handler handler = C8751b.f16639j;
            if (handler != null) {
                handler.post(C8751b.f16640k);
                C8751b.f16639j.postDelayed(C8751b.f16641l, 200L);
            }
        }
    }

    /* renamed from: com.iab.omid.library.adcolony.walking.b$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC8754c extends InterfaceC8755d {
        /* renamed from: a */
        void m3163a();
    }

    /* renamed from: com.iab.omid.library.adcolony.walking.b$d */
    /* loaded from: classes3.dex */
    public interface InterfaceC8755d {
        /* renamed from: b */
        void m3162b();
    }

    /* renamed from: a */
    public static void m3165a() {
        if (f16639j == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f16639j = handler;
            handler.post(f16640k);
            f16639j.postDelayed(f16641l, 200L);
        }
    }

    /* renamed from: b */
    public final void m3164b(View view, InterfaceC8737a interfaceC8737a, JSONObject jSONObject, boolean z) {
        boolean z2;
        char c;
        Object obj;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (C8743b.m3172a(view) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return;
        }
        C8756c c8756c = this.f16646e;
        if (c8756c.f16652d.contains(view)) {
            c = 1;
        } else if (c8756c.f16657i) {
            c = 2;
        } else {
            c = 3;
        }
        if (c == 3) {
            return;
        }
        JSONObject mo3178a = interfaceC8737a.mo3178a(view);
        WindowManager windowManager = C8742a.f16623a;
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(mo3178a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        HashMap<View, String> hashMap = c8756c.f16649a;
        if (hashMap.size() == 0) {
            obj = null;
        } else {
            Object obj2 = (String) hashMap.get(view);
            if (obj2 != null) {
                hashMap.remove(view);
            }
            obj = obj2;
        }
        if (obj != null) {
            try {
                mo3178a.put("adSessionId", obj);
            } catch (JSONException e2) {
                C0463a.m12440a("Error with setting ad session id", e2);
            }
            WeakHashMap weakHashMap = c8756c.f16656h;
            if (weakHashMap.containsKey(view)) {
                weakHashMap.put(view, Boolean.TRUE);
                z3 = false;
            } else {
                z3 = true;
            }
            try {
                mo3178a.put("hasWindowFocus", Boolean.valueOf(z3));
            } catch (JSONException e3) {
                C0463a.m12440a("Error with setting not visible reason", e3);
            }
            c8756c.f16657i = true;
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            HashMap<View, C8756c.C8757a> hashMap2 = c8756c.f16650b;
            C8756c.C8757a c8757a = hashMap2.get(view);
            if (c8757a != null) {
                hashMap2.remove(view);
            }
            if (c8757a != null) {
                WindowManager windowManager2 = C8742a.f16623a;
                C8731c c8731c = c8757a.f16658a;
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = c8757a.f16659b.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                try {
                    mo3178a.put("isFriendlyObstructionFor", jSONArray);
                    mo3178a.put("friendlyObstructionClass", c8731c.f16599b);
                    mo3178a.put("friendlyObstructionPurpose", c8731c.f16600c);
                    mo3178a.put("friendlyObstructionReason", c8731c.f16601d);
                } catch (JSONException e4) {
                    C0463a.m12440a("Error with setting friendly obstruction", e4);
                }
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z && !z5) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (c == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            interfaceC8737a.mo3177a(view, mo3178a, this, z7, z6);
        }
        this.f16643b++;
    }
}

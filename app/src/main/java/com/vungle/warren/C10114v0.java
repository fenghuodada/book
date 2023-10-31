package com.vungle.warren;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.gson.C8686j;
import com.vungle.warren.downloader.Downloader;
import com.vungle.warren.downloader.InterfaceC9779f;
import com.vungle.warren.locale.InterfaceC9827a;
import com.vungle.warren.log.C9835f;
import com.vungle.warren.omsdk.C9907b;
import com.vungle.warren.omsdk.C9908c;
import com.vungle.warren.persistence.C9914a;
import com.vungle.warren.persistence.C9924e;
import com.vungle.warren.persistence.C9928h;
import com.vungle.warren.persistence.InterfaceC9923d;
import com.vungle.warren.tasks.C9983f;
import com.vungle.warren.tasks.InterfaceC9981d;
import com.vungle.warren.tasks.InterfaceC9982e;
import com.vungle.warren.utility.InterfaceC10086h;
import com.vungle.warren.utility.InterfaceC10107v;
import com.vungle.warren.utility.platform.InterfaceC10100c;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: com.vungle.warren.v0 */
/* loaded from: classes3.dex */
public final class C10114v0 {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d */
    public static C10114v0 f20357d;
    @VisibleForTesting

    /* renamed from: e */
    public static final C10115a f20358e = new C10115a();

    /* renamed from: f */
    public static final C10116b f20359f = new C10116b();

    /* renamed from: a */
    public final Context f20360a;

    /* renamed from: b */
    public final HashMap f20361b;

    /* renamed from: c */
    public final HashMap f20362c;

    /* renamed from: com.vungle.warren.v0$a */
    /* loaded from: classes3.dex */
    public class C10115a implements InterfaceC10128w1 {
        @Override // com.vungle.warren.InterfaceC10128w1
        /* renamed from: a */
        public final Collection<String> mo1227a() {
            return Vungle.getValidPlacements();
        }

        @Override // com.vungle.warren.InterfaceC10128w1
        public final boolean isInitialized() {
            return Vungle.isInitialized();
        }
    }

    /* renamed from: com.vungle.warren.v0$b */
    /* loaded from: classes3.dex */
    public class C10116b implements C9983f.InterfaceC9984a {
    }

    /* renamed from: com.vungle.warren.v0$c */
    /* loaded from: classes3.dex */
    public abstract class AbstractC10117c<T> {
        /* renamed from: a */
        public abstract T mo1226a();
    }

    public C10114v0(@NonNull Context context) {
        HashMap hashMap = new HashMap();
        this.f20361b = hashMap;
        this.f20362c = new HashMap();
        this.f20360a = context.getApplicationContext();
        hashMap.put(InterfaceC9981d.class, new C9766d1(this));
        hashMap.put(InterfaceC9982e.class, new C9783e1(this));
        hashMap.put(AdLoader.class, new C9795f1(this));
        hashMap.put(Downloader.class, new C9798g1(this));
        hashMap.put(VungleApiClient.class, new C9803h1(this));
        hashMap.put(C9928h.class, new C9810i1(this));
        hashMap.put(C9835f.class, new C9820j1(this));
        hashMap.put(InterfaceC9923d.class, new C9823k1(this));
        hashMap.put(C9914a.class, new C9825l0(this));
        hashMap.put(InterfaceC10100c.class, new C9845m0(this));
        hashMap.put(InterfaceC10086h.class, new C9889n0());
        hashMap.put(C9822k0.class, new C9904o0());
        hashMap.put(InterfaceC10128w1.class, new C9912p0());
        hashMap.put(InterfaceC9800h0.class, new C9962q0(this));
        hashMap.put(InterfaceC9779f.class, new C9965r0(this));
        hashMap.put(C9890n1.class, new C9968s0(this));
        hashMap.put(InterfaceC10107v.class, new C9974t0());
        hashMap.put(C9763d0.class, new C9993u0());
        hashMap.put(C9907b.class, new C10127w0(this));
        hashMap.put(C9908c.C9909a.class, new C10130x0());
        hashMap.put(C9964r.class, new C10135y0(this));
        hashMap.put(C9924e.class, new C10137z0(this));
        hashMap.put(C8686j.class, new C9750a1());
        hashMap.put(InterfaceC9827a.class, new C9757b1());
        hashMap.put(C9911p.class, new C9761c1(this));
    }

    /* renamed from: a */
    public static synchronized C10114v0 m1234a(@NonNull Context context) {
        C10114v0 c10114v0;
        synchronized (C10114v0.class) {
            if (f20357d == null) {
                f20357d = new C10114v0(context);
            }
            c10114v0 = f20357d;
        }
        return c10114v0;
    }

    /* renamed from: b */
    public final <T> T m1233b(@NonNull Class<T> cls) {
        Class m1231d = m1231d(cls);
        HashMap hashMap = this.f20362c;
        T t = (T) hashMap.get(m1231d);
        if (t == null) {
            AbstractC10117c abstractC10117c = (AbstractC10117c) this.f20361b.get(m1231d);
            if (abstractC10117c != null) {
                T t2 = (T) abstractC10117c.mo1226a();
                if (!(abstractC10117c instanceof C9962q0)) {
                    hashMap.put(m1231d, t2);
                }
                return t2;
            }
            throw new IllegalArgumentException("Unknown class");
        }
        return t;
    }

    /* renamed from: c */
    public final synchronized <T> T m1232c(Class<T> cls) {
        return (T) m1233b(cls);
    }

    @NonNull
    /* renamed from: d */
    public final Class m1231d(@NonNull Class cls) {
        for (Class cls2 : this.f20361b.keySet()) {
            if (cls2.isAssignableFrom(cls)) {
                return cls2;
            }
        }
        throw new IllegalArgumentException("Unknown dependency for " + cls);
    }

    /* renamed from: e */
    public final synchronized <T> boolean m1230e(Class<T> cls) {
        return this.f20362c.containsKey(m1231d(cls));
    }
}

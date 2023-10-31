package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.AbstractC0066g;
import androidx.activity.result.contract.AbstractC0058a;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.InterfaceC1479k;
import androidx.lifecycle.InterfaceC1483m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* renamed from: androidx.activity.result.g */
/* loaded from: classes.dex */
public abstract class AbstractC0066g {

    /* renamed from: a */
    public Random f115a = new Random();

    /* renamed from: b */
    public final HashMap f116b = new HashMap();

    /* renamed from: c */
    public final HashMap f117c = new HashMap();

    /* renamed from: d */
    public final HashMap f118d = new HashMap();

    /* renamed from: e */
    public ArrayList<String> f119e = new ArrayList<>();

    /* renamed from: f */
    public final transient HashMap f120f = new HashMap();

    /* renamed from: g */
    public final HashMap f121g = new HashMap();

    /* renamed from: h */
    public final Bundle f122h = new Bundle();

    /* renamed from: androidx.activity.result.g$a */
    /* loaded from: classes.dex */
    public static class C0067a<O> {

        /* renamed from: a */
        public final InterfaceC0056b<O> f123a;

        /* renamed from: b */
        public final AbstractC0058a<?, O> f124b;

        public C0067a(AbstractC0058a abstractC0058a, InterfaceC0056b interfaceC0056b) {
            this.f123a = interfaceC0056b;
            this.f124b = abstractC0058a;
        }
    }

    /* renamed from: androidx.activity.result.g$b */
    /* loaded from: classes.dex */
    public static class C0068b {

        /* renamed from: a */
        public final AbstractC1464h f125a;

        /* renamed from: b */
        public final ArrayList<InterfaceC1479k> f126b = new ArrayList<>();

        public C0068b(@NonNull AbstractC1464h abstractC1464h) {
            this.f125a = abstractC1464h;
        }
    }

    @MainThread
    /* renamed from: a */
    public final boolean m13051a(int i, int i2, @Nullable Intent intent) {
        InterfaceC0056b<O> interfaceC0056b;
        String str = (String) this.f116b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0067a c0067a = (C0067a) this.f120f.get(str);
        if (c0067a != null && (interfaceC0056b = c0067a.f123a) != 0 && this.f119e.contains(str)) {
            interfaceC0056b.onActivityResult(c0067a.f124b.parseResult(i2, intent));
            this.f119e.remove(str);
            return true;
        }
        this.f121g.remove(str);
        this.f122h.putParcelable(str, new C0054a(i2, intent));
        return true;
    }

    @MainThread
    /* renamed from: b */
    public abstract void mo13050b(int i, @NonNull AbstractC0058a abstractC0058a, @SuppressLint({"UnknownNullness"}) Object obj);

    @NonNull
    /* renamed from: c */
    public final C0064e m13049c(@NonNull final String str, @NonNull InterfaceC1483m interfaceC1483m, @NonNull final AbstractC0058a abstractC0058a, @NonNull final InterfaceC0056b interfaceC0056b) {
        AbstractC1464h lifecycle = interfaceC1483m.getLifecycle();
        if (!lifecycle.mo10538b().m10546a(AbstractC1464h.EnumC1468b.STARTED)) {
            m13047e(str);
            HashMap hashMap = this.f118d;
            C0068b c0068b = (C0068b) hashMap.get(str);
            if (c0068b == null) {
                c0068b = new C0068b(lifecycle);
            }
            InterfaceC1479k interfaceC1479k = new InterfaceC1479k() { // from class: androidx.activity.result.ActivityResultRegistry$1
                @Override // androidx.lifecycle.InterfaceC1479k
                public final void onStateChanged(@NonNull InterfaceC1483m interfaceC1483m2, @NonNull AbstractC1464h.EnumC1465a enumC1465a) {
                    boolean equals = AbstractC1464h.EnumC1465a.ON_START.equals(enumC1465a);
                    String str2 = str;
                    AbstractC0066g abstractC0066g = AbstractC0066g.this;
                    if (!equals) {
                        if (AbstractC1464h.EnumC1465a.ON_STOP.equals(enumC1465a)) {
                            abstractC0066g.f120f.remove(str2);
                            return;
                        } else if (AbstractC1464h.EnumC1465a.ON_DESTROY.equals(enumC1465a)) {
                            abstractC0066g.m13046f(str2);
                            return;
                        } else {
                            return;
                        }
                    }
                    HashMap hashMap2 = abstractC0066g.f120f;
                    AbstractC0058a abstractC0058a2 = abstractC0058a;
                    InterfaceC0056b interfaceC0056b2 = interfaceC0056b;
                    hashMap2.put(str2, new AbstractC0066g.C0067a(abstractC0058a2, interfaceC0056b2));
                    HashMap hashMap3 = abstractC0066g.f121g;
                    if (hashMap3.containsKey(str2)) {
                        Object obj = hashMap3.get(str2);
                        hashMap3.remove(str2);
                        interfaceC0056b2.onActivityResult(obj);
                    }
                    Bundle bundle = abstractC0066g.f122h;
                    C0054a c0054a = (C0054a) bundle.getParcelable(str2);
                    if (c0054a != null) {
                        bundle.remove(str2);
                        interfaceC0056b2.onActivityResult(abstractC0058a2.parseResult(c0054a.f106a, c0054a.f107b));
                    }
                }
            };
            c0068b.f125a.mo10539a(interfaceC1479k);
            c0068b.f126b.add(interfaceC1479k);
            hashMap.put(str, c0068b);
            return new C0064e(this, str, abstractC0058a);
        }
        throw new IllegalStateException("LifecycleOwner " + interfaceC1483m + " is attempting to register while current state is " + lifecycle.mo10538b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    @NonNull
    /* renamed from: d */
    public final C0065f m13048d(@NonNull String str, @NonNull AbstractC0058a abstractC0058a, @NonNull InterfaceC0056b interfaceC0056b) {
        m13047e(str);
        this.f120f.put(str, new C0067a(abstractC0058a, interfaceC0056b));
        HashMap hashMap = this.f121g;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            interfaceC0056b.onActivityResult(obj);
        }
        Bundle bundle = this.f122h;
        C0054a c0054a = (C0054a) bundle.getParcelable(str);
        if (c0054a != null) {
            bundle.remove(str);
            interfaceC0056b.onActivityResult(abstractC0058a.parseResult(c0054a.f106a, c0054a.f107b));
        }
        return new C0065f(this, str, abstractC0058a);
    }

    /* renamed from: e */
    public final void m13047e(String str) {
        int nextInt;
        HashMap hashMap;
        HashMap hashMap2 = this.f117c;
        if (((Integer) hashMap2.get(str)) != null) {
            return;
        }
        do {
            nextInt = this.f115a.nextInt(2147418112) + 65536;
            hashMap = this.f116b;
        } while (hashMap.containsKey(Integer.valueOf(nextInt)));
        hashMap.put(Integer.valueOf(nextInt), str);
        hashMap2.put(str, Integer.valueOf(nextInt));
    }

    @MainThread
    /* renamed from: f */
    public final void m13046f(@NonNull String str) {
        Integer num;
        if (!this.f119e.contains(str) && (num = (Integer) this.f117c.remove(str)) != null) {
            this.f116b.remove(num);
        }
        this.f120f.remove(str);
        HashMap hashMap = this.f121g;
        if (hashMap.containsKey(str)) {
            StringBuilder m13052b = C0063d.m13052b("Dropping pending result for request ", str, ": ");
            m13052b.append(hashMap.get(str));
            Log.w("ActivityResultRegistry", m13052b.toString());
            hashMap.remove(str);
        }
        Bundle bundle = this.f122h;
        if (bundle.containsKey(str)) {
            StringBuilder m13052b2 = C0063d.m13052b("Dropping pending result for request ", str, ": ");
            m13052b2.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", m13052b2.toString());
            bundle.remove(str);
        }
        HashMap hashMap2 = this.f118d;
        C0068b c0068b = (C0068b) hashMap2.get(str);
        if (c0068b != null) {
            ArrayList<InterfaceC1479k> arrayList = c0068b.f126b;
            Iterator<InterfaceC1479k> it = arrayList.iterator();
            while (it.hasNext()) {
                c0068b.f125a.mo10537c(it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}

package com.unity3d.services.store.gpbl;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.C9685g;
import com.unity3d.services.store.gpbl.bridges.billingclient.C9665a;
import com.unity3d.services.store.gpbl.bridges.billingclient.InterfaceC9666b;
import com.unity3d.services.store.gpbl.proxies.C9691a;
import com.unity3d.services.store.gpbl.proxies.C9692b;
import com.unity3d.services.store.gpbl.proxies.C9693c;
import com.unity3d.services.store.gpbl.proxies.C9694d;
import com.unity3d.services.store.gpbl.proxies.C9695e;
import com.unity3d.services.store.listeners.InterfaceC9696a;
import com.unity3d.services.store.listeners.InterfaceC9697b;
import com.unity3d.services.store.listeners.InterfaceC9698c;
import com.unity3d.services.store.listeners.InterfaceC9699d;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* renamed from: com.unity3d.services.store.gpbl.c */
/* loaded from: classes3.dex */
public class C9690c {

    /* renamed from: a */
    private final InterfaceC9666b f19224a;

    public C9690c(Context context, InterfaceC9697b interfaceC9697b) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        this.f19224a = C9665a.m1712a(context).mo1702a(new C9693c(interfaceC9697b)).mo1703a().mo1697c();
    }

    /* renamed from: a */
    public int m1682a(String str) {
        boolean z;
        if (str.equals("inapp")) {
            z = this.f19224a.mo1705b();
        } else {
            if (str.equals("subs")) {
                str = "subscriptions";
            }
            z = this.f19224a.mo1709a(str) == EnumC9659a.OK;
        }
        return z ? 0 : -1;
    }

    /* renamed from: a */
    public void m1683a(InterfaceC9660b interfaceC9660b) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        this.f19224a.mo1710a(new C9691a(interfaceC9660b));
    }

    /* renamed from: a */
    public void m1681a(String str, int i, InterfaceC9696a interfaceC9696a) throws ClassNotFoundException {
        this.f19224a.mo1708a(str, new C9692b(interfaceC9696a, i));
    }

    /* renamed from: a */
    public void m1680a(String str, InterfaceC9698c interfaceC9698c) throws ClassNotFoundException {
        this.f19224a.mo1699a(str, new C9694d(interfaceC9698c));
    }

    /* renamed from: a */
    public void m1679a(String str, ArrayList<String> arrayList, InterfaceC9699d interfaceC9699d) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        this.f19224a.mo1711a(C9685g.m1688k().m1687a(arrayList).m1686c(str).m1684i(), new C9695e(interfaceC9699d));
    }
}

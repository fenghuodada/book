package com.bumptech.glide.manager;

import androidx.annotation.Nullable;
import com.bumptech.glide.request.InterfaceC3823c;
import com.bumptech.glide.util.C3861k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.manager.r */
/* loaded from: classes.dex */
public final class C3802r {

    /* renamed from: a */
    public final Set<InterfaceC3823c> f9820a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final ArrayList f9821b = new ArrayList();

    /* renamed from: c */
    public boolean f9822c;

    /* renamed from: a */
    public final boolean m6483a(@Nullable InterfaceC3823c interfaceC3823c) {
        boolean z = true;
        if (interfaceC3823c == null) {
            return true;
        }
        boolean remove = this.f9820a.remove(interfaceC3823c);
        if (!this.f9821b.remove(interfaceC3823c) && !remove) {
            z = false;
        }
        if (z) {
            interfaceC3823c.clear();
        }
        return z;
    }

    /* renamed from: b */
    public final void m6482b() {
        Iterator it = C3861k.m6400d(this.f9820a).iterator();
        while (it.hasNext()) {
            InterfaceC3823c interfaceC3823c = (InterfaceC3823c) it.next();
            if (!interfaceC3823c.mo6435i() && !interfaceC3823c.mo6440d()) {
                interfaceC3823c.clear();
                if (this.f9822c) {
                    this.f9821b.add(interfaceC3823c);
                } else {
                    interfaceC3823c.mo6437g();
                }
            }
        }
    }

    public final String toString() {
        return super.toString() + "{numRequests=" + this.f9820a.size() + ", isPaused=" + this.f9822c + "}";
    }
}

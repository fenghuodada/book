package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import com.bumptech.glide.util.C3861k;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.manager.a */
/* loaded from: classes.dex */
public final class C3780a implements InterfaceC3793l {

    /* renamed from: a */
    public final Set<InterfaceC3794m> f9797a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public boolean f9798b;

    /* renamed from: c */
    public boolean f9799c;

    @Override // com.bumptech.glide.manager.InterfaceC3793l
    /* renamed from: a */
    public final void mo6491a(@NonNull InterfaceC3794m interfaceC3794m) {
        this.f9797a.add(interfaceC3794m);
        if (this.f9799c) {
            interfaceC3794m.onDestroy();
        } else if (this.f9798b) {
            interfaceC3794m.onStart();
        } else {
            interfaceC3794m.onStop();
        }
    }

    @Override // com.bumptech.glide.manager.InterfaceC3793l
    /* renamed from: b */
    public final void mo6490b(@NonNull InterfaceC3794m interfaceC3794m) {
        this.f9797a.remove(interfaceC3794m);
    }

    /* renamed from: c */
    public final void m6496c() {
        this.f9799c = true;
        Iterator it = C3861k.m6400d(this.f9797a).iterator();
        while (it.hasNext()) {
            ((InterfaceC3794m) it.next()).onDestroy();
        }
    }

    /* renamed from: d */
    public final void m6495d() {
        this.f9798b = true;
        Iterator it = C3861k.m6400d(this.f9797a).iterator();
        while (it.hasNext()) {
            ((InterfaceC3794m) it.next()).onStart();
        }
    }

    /* renamed from: e */
    public final void m6494e() {
        this.f9798b = false;
        Iterator it = C3861k.m6400d(this.f9797a).iterator();
        while (it.hasNext()) {
            ((InterfaceC3794m) it.next()).onStop();
        }
    }
}

package com.bumptech.glide.manager;

import com.bumptech.glide.request.target.InterfaceC3837g;
import com.bumptech.glide.util.C3861k;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.manager.t */
/* loaded from: classes.dex */
public final class C3805t implements InterfaceC3794m {

    /* renamed from: a */
    public final Set<InterfaceC3837g<?>> f9830a = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.manager.InterfaceC3794m
    public final void onDestroy() {
        Iterator it = C3861k.m6400d(this.f9830a).iterator();
        while (it.hasNext()) {
            ((InterfaceC3837g) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.manager.InterfaceC3794m
    public final void onStart() {
        Iterator it = C3861k.m6400d(this.f9830a).iterator();
        while (it.hasNext()) {
            ((InterfaceC3837g) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.manager.InterfaceC3794m
    public final void onStop() {
        Iterator it = C3861k.m6400d(this.f9830a).iterator();
        while (it.hasNext()) {
            ((InterfaceC3837g) it.next()).onStop();
        }
    }
}

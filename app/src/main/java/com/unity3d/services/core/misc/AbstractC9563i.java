package com.unity3d.services.core.misc;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.unity3d.services.core.misc.i */
/* loaded from: classes3.dex */
public abstract class AbstractC9563i<T> {

    /* renamed from: a */
    private final List<InterfaceC9558d<T>> f18930a = new ArrayList();

    /* renamed from: a */
    public synchronized void m1995a(T t) {
        for (InterfaceC9558d<T> interfaceC9558d : this.f18930a) {
            interfaceC9558d.mo1849a(t);
        }
    }

    public synchronized void registerObserver(InterfaceC9558d<T> interfaceC9558d) {
        if (this.f18930a.contains(interfaceC9558d)) {
            return;
        }
        this.f18930a.add(interfaceC9558d);
    }

    public synchronized void unregisterObserver(InterfaceC9558d<T> interfaceC9558d) {
        if (this.f18930a.contains(interfaceC9558d)) {
            this.f18930a.remove(interfaceC9558d);
        }
    }
}

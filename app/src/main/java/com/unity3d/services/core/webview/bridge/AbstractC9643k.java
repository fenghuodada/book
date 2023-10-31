package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.webview.bridge.InterfaceC9631d;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.unity3d.services.core.webview.bridge.k */
/* loaded from: classes3.dex */
public abstract class AbstractC9643k<T extends InterfaceC9631d> implements InterfaceC9630c<T> {

    /* renamed from: a */
    private ConcurrentHashMap<String, T> f19156a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public void m1741a(T t) {
        if (t == null) {
            return;
        }
        this.f19156a.put(t.mo1766a(), t);
    }

    @Override // com.unity3d.services.core.webview.bridge.InterfaceC9630c
    /* renamed from: a */
    public void mo1740a(String str) {
        this.f19156a.remove(str);
    }

    @Override // com.unity3d.services.core.webview.bridge.InterfaceC9630c
    public T get(String str) {
        if (str == null) {
            return null;
        }
        return this.f19156a.get(str);
    }
}

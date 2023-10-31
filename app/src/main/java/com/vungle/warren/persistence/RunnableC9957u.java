package com.vungle.warren.persistence;

import com.vungle.warren.persistence.C9928h;

/* renamed from: com.vungle.warren.persistence.u */
/* loaded from: classes3.dex */
public final class RunnableC9957u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f19992a;

    /* renamed from: b */
    public final /* synthetic */ Class f19993b;

    /* renamed from: c */
    public final /* synthetic */ C9928h.InterfaceC9942m f19994c;

    /* renamed from: d */
    public final /* synthetic */ C9928h f19995d;

    /* renamed from: com.vungle.warren.persistence.u$a */
    /* loaded from: classes3.dex */
    public class RunnableC9958a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Object f19996a;

        public RunnableC9958a(Object obj) {
            this.f19996a = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RunnableC9957u.this.f19994c.mo1373a(this.f19996a);
        }
    }

    public RunnableC9957u(C9928h c9928h, String str, Class cls, C9928h.InterfaceC9942m interfaceC9942m) {
        this.f19995d = c9928h;
        this.f19992a = str;
        this.f19993b = cls;
        this.f19994c = interfaceC9942m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f19992a;
        Class cls = this.f19993b;
        C9928h c9928h = this.f19995d;
        c9928h.f19931c.execute(new RunnableC9958a(C9928h.m1398a(c9928h, cls, str)));
    }
}

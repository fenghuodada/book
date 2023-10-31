package com.iab.omid.library.vungle.walking;

import com.iab.omid.library.vungle.walking.C8860c;

/* renamed from: com.iab.omid.library.vungle.walking.a */
/* loaded from: classes3.dex */
public final class RunnableC8854a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C8855b f16862a;

    public RunnableC8854a(C8855b c8855b) {
        this.f16862a = c8855b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8870d c8870d = this.f16862a.f16872e;
        c8870d.getClass();
        C8860c.AsyncTaskC8867e asyncTaskC8867e = new C8860c.AsyncTaskC8867e(c8870d);
        C8860c.C8866d c8866d = c8870d.f16891b;
        c8866d.getClass();
        asyncTaskC8867e.f16885a = c8866d;
        c8866d.f16888b.add(asyncTaskC8867e);
        if (c8866d.f16889c == null) {
            c8866d.m2919a();
        }
    }
}

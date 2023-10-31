package com.iab.omid.library.adcolony.walking;

import com.iab.omid.library.adcolony.walking.C8756c;

/* renamed from: com.iab.omid.library.adcolony.walking.a */
/* loaded from: classes3.dex */
public final class RunnableC8750a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C8751b f16636a;

    public RunnableC8750a(C8751b c8751b) {
        this.f16636a = c8751b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8766d c8766d = this.f16636a.f16647f;
        c8766d.getClass();
        C8756c.AsyncTaskC8763e asyncTaskC8763e = new C8756c.AsyncTaskC8763e(c8766d);
        C8756c.C8762d c8762d = c8766d.f16669b;
        c8762d.getClass();
        asyncTaskC8763e.f16663a = c8762d;
        c8762d.f16666b.add(asyncTaskC8763e);
        if (c8762d.f16667c == null) {
            c8762d.m3161a();
        }
    }
}

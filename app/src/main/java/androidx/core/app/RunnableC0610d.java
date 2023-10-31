package androidx.core.app;

import androidx.core.app.C0616g;

/* renamed from: androidx.core.app.d */
/* loaded from: classes.dex */
public final class RunnableC0610d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C0616g.C0617a f2265a;

    /* renamed from: b */
    public final /* synthetic */ Object f2266b;

    public RunnableC0610d(C0616g.C0617a c0617a, Object obj) {
        this.f2265a = c0617a;
        this.f2266b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2265a.f2278a = this.f2266b;
    }
}

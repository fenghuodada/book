package androidx.core.app;

import android.app.Application;
import androidx.core.app.C0616g;

/* renamed from: androidx.core.app.e */
/* loaded from: classes.dex */
public final class RunnableC0612e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Application f2267a;

    /* renamed from: b */
    public final /* synthetic */ C0616g.C0617a f2268b;

    public RunnableC0612e(Application application, C0616g.C0617a c0617a) {
        this.f2267a = application;
        this.f2268b = c0617a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2267a.unregisterActivityLifecycleCallbacks(this.f2268b);
    }
}

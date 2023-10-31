package androidx.work.impl.foreground;

import android.app.Notification;

/* renamed from: androidx.work.impl.foreground.e */
/* loaded from: classes.dex */
public final class RunnableC1899e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4626a;

    /* renamed from: b */
    public final /* synthetic */ Notification f4627b;

    /* renamed from: c */
    public final /* synthetic */ SystemForegroundService f4628c;

    public RunnableC1899e(SystemForegroundService systemForegroundService, int i, Notification notification) {
        this.f4628c = systemForegroundService;
        this.f4626a = i;
        this.f4627b = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4628c.f4608e.notify(this.f4626a, this.f4627b);
    }
}

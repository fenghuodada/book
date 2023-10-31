package androidx.work.impl.foreground;

import android.app.Notification;
import android.os.Build;

/* renamed from: androidx.work.impl.foreground.d */
/* loaded from: classes.dex */
public final class RunnableC1898d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4622a;

    /* renamed from: b */
    public final /* synthetic */ Notification f4623b;

    /* renamed from: c */
    public final /* synthetic */ int f4624c;

    /* renamed from: d */
    public final /* synthetic */ SystemForegroundService f4625d;

    public RunnableC1898d(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.f4625d = systemForegroundService;
        this.f4622a = i;
        this.f4623b = notification;
        this.f4624c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = Build.VERSION.SDK_INT;
        Notification notification = this.f4623b;
        int i2 = this.f4622a;
        SystemForegroundService systemForegroundService = this.f4625d;
        if (i >= 29) {
            systemForegroundService.startForeground(i2, notification, this.f4624c);
        } else {
            systemForegroundService.startForeground(i2, notification);
        }
    }
}

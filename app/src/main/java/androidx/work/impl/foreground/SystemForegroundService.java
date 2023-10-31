package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.ServiceC1487p;
import androidx.work.AbstractC2005l;
import androidx.work.C1839g;
import androidx.work.impl.C1915l;
import androidx.work.impl.foreground.C1896c;
import androidx.work.impl.utils.C1960a;
import androidx.work.impl.utils.taskexecutor.C1999b;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SystemForegroundService extends ServiceC1487p implements C1896c.InterfaceC1897a {

    /* renamed from: f */
    public static final String f4604f = AbstractC2005l.m9732e("SystemFgService");

    /* renamed from: b */
    public Handler f4605b;

    /* renamed from: c */
    public boolean f4606c;

    /* renamed from: d */
    public C1896c f4607d;

    /* renamed from: e */
    public NotificationManager f4608e;

    @MainThread
    /* renamed from: a */
    public final void m9827a() {
        this.f4605b = new Handler(Looper.getMainLooper());
        this.f4608e = (NotificationManager) getApplicationContext().getSystemService("notification");
        C1896c c1896c = new C1896c(getApplicationContext());
        this.f4607d = c1896c;
        if (c1896c.f4621i != null) {
            AbstractC2005l.m9733c().mo9730b(C1896c.f4612j, "A callback already exists.", new Throwable[0]);
            return;
        }
        c1896c.f4621i = this;
    }

    @Override // androidx.lifecycle.ServiceC1487p, android.app.Service
    public final void onCreate() {
        super.onCreate();
        m9827a();
    }

    @Override // androidx.lifecycle.ServiceC1487p, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C1896c c1896c = this.f4607d;
        c1896c.f4621i = null;
        synchronized (c1896c.f4615c) {
            c1896c.f4620h.m9852d();
        }
        c1896c.f4613a.f4660f.m9837f(c1896c);
    }

    @Override // androidx.lifecycle.ServiceC1487p, android.app.Service
    public final int onStartCommand(@Nullable Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.f4606c;
        String str = f4604f;
        int i3 = 0;
        if (z) {
            AbstractC2005l.m9733c().mo9729d(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            C1896c c1896c = this.f4607d;
            c1896c.f4621i = null;
            synchronized (c1896c.f4615c) {
                c1896c.f4620h.m9852d();
            }
            c1896c.f4613a.f4660f.m9837f(c1896c);
            m9827a();
            this.f4606c = false;
        }
        if (intent != null) {
            C1896c c1896c2 = this.f4607d;
            c1896c2.getClass();
            String action = intent.getAction();
            boolean equals = "ACTION_START_FOREGROUND".equals(action);
            String str2 = C1896c.f4612j;
            C1915l c1915l = c1896c2.f4613a;
            if (equals) {
                AbstractC2005l.m9733c().mo9729d(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
                ((C1999b) c1896c2.f4614b).m9738a(new RunnableC1895b(c1896c2, c1915l.f4657c, intent.getStringExtra("KEY_WORKSPEC_ID")));
            } else if (!"ACTION_NOTIFY".equals(action)) {
                if ("ACTION_CANCEL_WORK".equals(action)) {
                    AbstractC2005l.m9733c().mo9729d(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
                    String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                    if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                        UUID fromString = UUID.fromString(stringExtra);
                        c1915l.getClass();
                        ((C1999b) c1915l.f4658d).m9738a(new C1960a(c1915l, fromString));
                    }
                } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                    AbstractC2005l.m9733c().mo9729d(str2, "Stopping foreground service", new Throwable[0]);
                    C1896c.InterfaceC1897a interfaceC1897a = c1896c2.f4621i;
                    if (interfaceC1897a != null) {
                        SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC1897a;
                        systemForegroundService.f4606c = true;
                        AbstractC2005l.m9733c().mo9731a(str, "All commands completed.", new Throwable[0]);
                        if (Build.VERSION.SDK_INT >= 26) {
                            systemForegroundService.stopForeground(true);
                        }
                        systemForegroundService.stopSelf();
                    }
                }
            }
            int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
            int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
            AbstractC2005l.m9733c().mo9731a(str2, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra2, Integer.valueOf(intExtra2)), new Throwable[0]);
            if (notification != null && c1896c2.f4621i != null) {
                C1839g c1839g = new C1839g(intExtra, intExtra2, notification);
                LinkedHashMap linkedHashMap = c1896c2.f4617e;
                linkedHashMap.put(stringExtra2, c1839g);
                if (TextUtils.isEmpty(c1896c2.f4616d)) {
                    c1896c2.f4616d = stringExtra2;
                    SystemForegroundService systemForegroundService2 = (SystemForegroundService) c1896c2.f4621i;
                    systemForegroundService2.f4605b.post(new RunnableC1898d(systemForegroundService2, intExtra, notification, intExtra2));
                } else {
                    SystemForegroundService systemForegroundService3 = (SystemForegroundService) c1896c2.f4621i;
                    systemForegroundService3.f4605b.post(new RunnableC1899e(systemForegroundService3, intExtra, notification));
                    if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            i3 |= ((C1839g) entry.getValue()).f4462b;
                        }
                        C1839g c1839g2 = (C1839g) linkedHashMap.get(c1896c2.f4616d);
                        if (c1839g2 != null) {
                            SystemForegroundService systemForegroundService4 = (SystemForegroundService) c1896c2.f4621i;
                            systemForegroundService4.f4605b.post(new RunnableC1898d(systemForegroundService4, c1839g2.f4461a, c1839g2.f4463c, i3));
                        }
                    }
                }
            }
        }
        return 3;
    }
}

package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.ServiceC1487p;
import androidx.work.AbstractC2005l;
import androidx.work.impl.background.systemalarm.C1853e;
import androidx.work.impl.utils.C1986n;
import java.util.HashMap;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SystemAlarmService extends ServiceC1487p implements C1853e.InterfaceC1856c {

    /* renamed from: d */
    public static final String f4498d = AbstractC2005l.m9732e("SystemAlarmService");

    /* renamed from: b */
    public C1853e f4499b;

    /* renamed from: c */
    public boolean f4500c;

    @MainThread
    /* renamed from: a */
    public final void m9889a() {
        C1853e c1853e = new C1853e(this);
        this.f4499b = c1853e;
        if (c1853e.f4530j != null) {
            AbstractC2005l.m9733c().mo9730b(C1853e.f4520k, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            return;
        }
        c1853e.f4530j = this;
    }

    @MainThread
    /* renamed from: b */
    public final void m9888b() {
        this.f4500c = true;
        AbstractC2005l.m9733c().mo9731a(f4498d, "All commands completed in dispatcher", new Throwable[0]);
        String str = C1986n.f4817a;
        HashMap hashMap = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = C1986n.f4818b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC2005l.m9733c().mo9728f(C1986n.f4817a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.ServiceC1487p, android.app.Service
    public final void onCreate() {
        super.onCreate();
        m9889a();
        this.f4500c = false;
    }

    @Override // androidx.lifecycle.ServiceC1487p, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f4500c = true;
        this.f4499b.m9875e();
    }

    @Override // androidx.lifecycle.ServiceC1487p, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f4500c) {
            AbstractC2005l.m9733c().mo9729d(f4498d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f4499b.m9875e();
            m9889a();
            this.f4500c = false;
        }
        if (intent != null) {
            this.f4499b.m9878a(i2, intent);
            return 3;
        }
        return 3;
    }
}

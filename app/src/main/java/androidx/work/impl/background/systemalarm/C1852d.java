package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.work.AbstractC2005l;
import androidx.work.impl.InterfaceC1844b;
import androidx.work.impl.background.systemalarm.C1853e;
import androidx.work.impl.constraints.C1877d;
import androidx.work.impl.constraints.InterfaceC1867c;
import androidx.work.impl.model.C1940p;
import androidx.work.impl.model.C1943r;
import androidx.work.impl.utils.C1986n;
import androidx.work.impl.utils.C1994t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.background.systemalarm.d */
/* loaded from: classes.dex */
public final class C1852d implements InterfaceC1867c, InterfaceC1844b, C1994t.InterfaceC1996b {

    /* renamed from: j */
    public static final String f4510j = AbstractC2005l.m9732e("DelayMetCommandHandler");

    /* renamed from: a */
    public final Context f4511a;

    /* renamed from: b */
    public final int f4512b;

    /* renamed from: c */
    public final String f4513c;

    /* renamed from: d */
    public final C1853e f4514d;

    /* renamed from: e */
    public final C1877d f4515e;
    @Nullable

    /* renamed from: h */
    public PowerManager.WakeLock f4518h;

    /* renamed from: i */
    public boolean f4519i = false;

    /* renamed from: g */
    public int f4517g = 0;

    /* renamed from: f */
    public final Object f4516f = new Object();

    public C1852d(@NonNull Context context, int i, @NonNull String str, @NonNull C1853e c1853e) {
        this.f4511a = context;
        this.f4512b = i;
        this.f4514d = c1853e;
        this.f4513c = str;
        this.f4515e = new C1877d(context, c1853e.f4522b, this);
    }

    @Override // androidx.work.impl.utils.C1994t.InterfaceC1996b
    /* renamed from: a */
    public final void mo9739a(@NonNull String str) {
        AbstractC2005l.m9733c().mo9731a(f4510j, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        m9879g();
    }

    /* renamed from: b */
    public final void m9881b() {
        synchronized (this.f4516f) {
            this.f4515e.m9852d();
            this.f4514d.f4523c.m9740b(this.f4513c);
            PowerManager.WakeLock wakeLock = this.f4518h;
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC2005l.m9733c().mo9731a(f4510j, String.format("Releasing wakelock %s for WorkSpec %s", this.f4518h, this.f4513c), new Throwable[0]);
                this.f4518h.release();
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC1844b
    /* renamed from: c */
    public final void mo9824c(@NonNull String str, boolean z) {
        AbstractC2005l.m9733c().mo9731a(f4510j, String.format("onExecuted %s, %s", str, Boolean.valueOf(z)), new Throwable[0]);
        m9881b();
        int i = this.f4512b;
        C1853e c1853e = this.f4514d;
        Context context = this.f4511a;
        if (z) {
            c1853e.m9874f(new C1853e.RunnableC1855b(i, C1850b.m9884b(context, this.f4513c), c1853e));
        }
        if (this.f4519i) {
            Intent intent = new Intent(context, SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            c1853e.m9874f(new C1853e.RunnableC1855b(i, intent, c1853e));
        }
    }

    @WorkerThread
    /* renamed from: d */
    public final void m9880d() {
        String str = this.f4513c;
        this.f4518h = C1986n.m9742a(this.f4511a, String.format("%s (%s)", str, Integer.valueOf(this.f4512b)));
        AbstractC2005l m9733c = AbstractC2005l.m9733c();
        Object[] objArr = {this.f4518h, str};
        String str2 = f4510j;
        m9733c.mo9731a(str2, String.format("Acquiring wakelock %s for WorkSpec %s", objArr), new Throwable[0]);
        this.f4518h.acquire();
        C1940p m9793i = ((C1943r) this.f4514d.f4525e.f4657c.mo9893n()).m9793i(str);
        if (m9793i == null) {
            m9879g();
            return;
        }
        boolean m9803b = m9793i.m9803b();
        this.f4519i = m9803b;
        if (!m9803b) {
            AbstractC2005l.m9733c().mo9731a(str2, String.format("No constraints for %s", str), new Throwable[0]);
            mo9735f(Collections.singletonList(str));
            return;
        }
        this.f4515e.m9853c(Collections.singletonList(m9793i));
    }

    @Override // androidx.work.impl.constraints.InterfaceC1867c
    /* renamed from: e */
    public final void mo9736e(@NonNull ArrayList arrayList) {
        m9879g();
    }

    @Override // androidx.work.impl.constraints.InterfaceC1867c
    /* renamed from: f */
    public final void mo9735f(@NonNull List<String> list) {
        if (!list.contains(this.f4513c)) {
            return;
        }
        synchronized (this.f4516f) {
            if (this.f4517g == 0) {
                this.f4517g = 1;
                AbstractC2005l.m9733c().mo9731a(f4510j, String.format("onAllConstraintsMet for %s", this.f4513c), new Throwable[0]);
                if (this.f4514d.f4524d.m9835h(this.f4513c, null)) {
                    this.f4514d.f4523c.m9741a(this.f4513c, this);
                } else {
                    m9881b();
                }
            } else {
                AbstractC2005l.m9733c().mo9731a(f4510j, String.format("Already started work for %s", this.f4513c), new Throwable[0]);
            }
        }
    }

    /* renamed from: g */
    public final void m9879g() {
        synchronized (this.f4516f) {
            if (this.f4517g < 2) {
                this.f4517g = 2;
                AbstractC2005l m9733c = AbstractC2005l.m9733c();
                String str = f4510j;
                m9733c.mo9731a(str, String.format("Stopping work for WorkSpec %s", this.f4513c), new Throwable[0]);
                Context context = this.f4511a;
                String str2 = this.f4513c;
                Intent intent = new Intent(context, SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                C1853e c1853e = this.f4514d;
                c1853e.m9874f(new C1853e.RunnableC1855b(this.f4512b, intent, c1853e));
                if (this.f4514d.f4524d.m9838e(this.f4513c)) {
                    AbstractC2005l.m9733c().mo9731a(str, String.format("WorkSpec %s needs to be rescheduled", this.f4513c), new Throwable[0]);
                    Intent m9884b = C1850b.m9884b(this.f4511a, this.f4513c);
                    C1853e c1853e2 = this.f4514d;
                    c1853e2.m9874f(new C1853e.RunnableC1855b(this.f4512b, m9884b, c1853e2));
                } else {
                    AbstractC2005l.m9733c().mo9731a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f4513c), new Throwable[0]);
                }
            } else {
                AbstractC2005l.m9733c().mo9731a(f4510j, String.format("Already stopped work for %s", this.f4513c), new Throwable[0]);
            }
        }
    }
}

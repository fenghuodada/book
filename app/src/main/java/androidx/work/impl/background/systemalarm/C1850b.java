package androidx.work.impl.background.systemalarm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.work.AbstractC2005l;
import androidx.work.C1833d;
import androidx.work.EnumC2007m;
import androidx.work.impl.C1915l;
import androidx.work.impl.InterfaceC1844b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C1853e;
import androidx.work.impl.constraints.C1877d;
import androidx.work.impl.model.C1925g;
import androidx.work.impl.model.C1927i;
import androidx.work.impl.model.C1940p;
import androidx.work.impl.model.C1943r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.background.systemalarm.b */
/* loaded from: classes.dex */
public final class C1850b implements InterfaceC1844b {

    /* renamed from: d */
    public static final String f4502d = AbstractC2005l.m9732e("CommandHandler");

    /* renamed from: a */
    public final Context f4503a;

    /* renamed from: b */
    public final HashMap f4504b = new HashMap();

    /* renamed from: c */
    public final Object f4505c = new Object();

    public C1850b(@NonNull Context context) {
        this.f4503a = context;
    }

    /* renamed from: a */
    public static Intent m9885a(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: b */
    public static Intent m9884b(@NonNull Context context, @NonNull String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // androidx.work.impl.InterfaceC1844b
    /* renamed from: c */
    public final void mo9824c(@NonNull String str, boolean z) {
        synchronized (this.f4505c) {
            InterfaceC1844b interfaceC1844b = (InterfaceC1844b) this.f4504b.remove(str);
            if (interfaceC1844b != null) {
                interfaceC1844b.mo9824c(str, z);
            }
        }
    }

    /* renamed from: d */
    public final boolean m9883d() {
        boolean z;
        synchronized (this.f4505c) {
            z = !this.f4504b.isEmpty();
        }
        return z;
    }

    @WorkerThread
    /* renamed from: e */
    public final void m9882e(int i, @NonNull Intent intent, @NonNull C1853e c1853e) {
        boolean z;
        boolean z2;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            AbstractC2005l.m9733c().mo9731a(f4502d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            C1851c c1851c = new C1851c(this.f4503a, i, c1853e);
            ArrayList m9797e = ((C1943r) c1853e.f4525e.f4657c.mo9893n()).m9797e();
            String str = ConstraintProxy.f4492a;
            Iterator it = m9797e.iterator();
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            while (it.hasNext()) {
                C1833d c1833d = ((C1940p) it.next()).f4699j;
                z3 |= c1833d.f4447d;
                z4 |= c1833d.f4445b;
                z5 |= c1833d.f4448e;
                if (c1833d.f4444a != EnumC2007m.NOT_REQUIRED) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z6 |= z2;
                if (z3 && z4 && z5 && z6) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f4493a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = c1851c.f4507a;
            intent2.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z4).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z5).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z6);
            context.sendBroadcast(intent2);
            C1877d c1877d = c1851c.f4509c;
            c1877d.m9853c(m9797e);
            ArrayList arrayList = new ArrayList(m9797e.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = m9797e.iterator();
            while (it2.hasNext()) {
                C1940p c1940p = (C1940p) it2.next();
                String str3 = c1940p.f4690a;
                if (currentTimeMillis >= c1940p.m9804a() && (!c1940p.m9803b() || c1877d.m9855a(str3))) {
                    arrayList.add(c1940p);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String str4 = ((C1940p) it3.next()).f4690a;
                Intent m9885a = m9885a(context, str4);
                AbstractC2005l.m9733c().mo9731a(C1851c.f4506d, String.format("Creating a delay_met command for workSpec with id (%s)", str4), new Throwable[0]);
                c1853e.m9874f(new C1853e.RunnableC1855b(c1851c.f4508b, m9885a, c1853e));
            }
            c1877d.m9852d();
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            AbstractC2005l.m9733c().mo9731a(f4502d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            c1853e.f4525e.m9813f();
        } else {
            Bundle extras = intent.getExtras();
            String[] strArr = {"KEY_WORKSPEC_ID"};
            if (extras != null && !extras.isEmpty() && extras.get(strArr[0]) != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                AbstractC2005l.m9733c().mo9730b(f4502d, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
                String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
                String str5 = f4502d;
                AbstractC2005l.m9733c().mo9731a(str5, String.format("Handling schedule work for %s", string), new Throwable[0]);
                WorkDatabase workDatabase = c1853e.f4525e.f4657c;
                workDatabase.m10074c();
                try {
                    C1940p m9793i = ((C1943r) workDatabase.mo9893n()).m9793i(string);
                    if (m9793i == null) {
                        AbstractC2005l.m9733c().mo9728f(str5, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                    } else if (m9793i.f4691b.m9727a()) {
                        AbstractC2005l.m9733c().mo9728f(str5, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                    } else {
                        long m9804a = m9793i.m9804a();
                        boolean m9803b = m9793i.m9803b();
                        Context context2 = this.f4503a;
                        C1915l c1915l = c1853e.f4525e;
                        if (!m9803b) {
                            AbstractC2005l.m9733c().mo9731a(str5, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(m9804a)), new Throwable[0]);
                            C1849a.m9886b(context2, c1915l, string, m9804a);
                        } else {
                            AbstractC2005l.m9733c().mo9731a(str5, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(m9804a)), new Throwable[0]);
                            C1849a.m9886b(context2, c1915l, string, m9804a);
                            Intent intent3 = new Intent(context2, SystemAlarmService.class);
                            intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                            c1853e.m9874f(new C1853e.RunnableC1855b(i, intent3, c1853e));
                        }
                        workDatabase.m10071h();
                    }
                } finally {
                    workDatabase.m10073f();
                }
            } else if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.f4505c) {
                    String string2 = extras2.getString("KEY_WORKSPEC_ID");
                    AbstractC2005l m9733c = AbstractC2005l.m9733c();
                    String str6 = f4502d;
                    m9733c.mo9731a(str6, String.format("Handing delay met for %s", string2), new Throwable[0]);
                    if (!this.f4504b.containsKey(string2)) {
                        C1852d c1852d = new C1852d(this.f4503a, i, string2, c1853e);
                        this.f4504b.put(string2, c1852d);
                        c1852d.m9880d();
                    } else {
                        AbstractC2005l.m9733c().mo9731a(str6, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2), new Throwable[0]);
                    }
                }
            } else if ("ACTION_STOP_WORK".equals(action)) {
                String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
                AbstractC2005l.m9733c().mo9731a(f4502d, String.format("Handing stopWork work for %s", string3), new Throwable[0]);
                c1853e.f4525e.m9811h(string3);
                String str7 = C1849a.f4501a;
                C1927i c1927i = (C1927i) c1853e.f4525e.f4657c.mo9896k();
                C1925g m9806a = c1927i.m9806a(string3);
                if (m9806a != null) {
                    C1849a.m9887a(this.f4503a, m9806a.f4676b, string3);
                    AbstractC2005l.m9733c().mo9731a(C1849a.f4501a, String.format("Removing SystemIdInfo for workSpecId (%s)", string3), new Throwable[0]);
                    c1927i.m9805b(string3);
                }
                c1853e.mo9824c(string3, false);
            } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
                Bundle extras3 = intent.getExtras();
                String string4 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z7 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                AbstractC2005l.m9733c().mo9731a(f4502d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
                mo9824c(string4, z7);
            } else {
                AbstractC2005l.m9733c().mo9728f(f4502d, String.format("Ignoring intent %s", intent), new Throwable[0]);
            }
        }
    }
}

package androidx.work.impl.foreground;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC2005l;
import androidx.work.C1839g;
import androidx.work.impl.C1915l;
import androidx.work.impl.InterfaceC1844b;
import androidx.work.impl.constraints.C1877d;
import androidx.work.impl.constraints.InterfaceC1867c;
import androidx.work.impl.model.C1940p;
import androidx.work.impl.utils.RunnableC1985m;
import androidx.work.impl.utils.taskexecutor.C1999b;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.foreground.c */
/* loaded from: classes.dex */
public final class C1896c implements InterfaceC1867c, InterfaceC1844b {

    /* renamed from: j */
    public static final String f4612j = AbstractC2005l.m9732e("SystemFgDispatcher");

    /* renamed from: a */
    public final C1915l f4613a;

    /* renamed from: b */
    public final InterfaceC1998a f4614b;

    /* renamed from: c */
    public final Object f4615c = new Object();

    /* renamed from: d */
    public String f4616d;

    /* renamed from: e */
    public final LinkedHashMap f4617e;

    /* renamed from: f */
    public final HashMap f4618f;

    /* renamed from: g */
    public final HashSet f4619g;

    /* renamed from: h */
    public final C1877d f4620h;
    @Nullable

    /* renamed from: i */
    public InterfaceC1897a f4621i;

    /* renamed from: androidx.work.impl.foreground.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1897a {
    }

    public C1896c(@NonNull Context context) {
        C1915l m9816c = C1915l.m9816c(context);
        this.f4613a = m9816c;
        InterfaceC1998a interfaceC1998a = m9816c.f4658d;
        this.f4614b = interfaceC1998a;
        this.f4616d = null;
        this.f4617e = new LinkedHashMap();
        this.f4619g = new HashSet();
        this.f4618f = new HashMap();
        this.f4620h = new C1877d(context, interfaceC1998a, this);
        m9816c.f4660f.m9841a(this);
    }

    @NonNull
    /* renamed from: a */
    public static Intent m9826a(@NonNull Context context, @NonNull String str, @NonNull C1839g c1839g) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c1839g.f4461a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c1839g.f4462b);
        intent.putExtra("KEY_NOTIFICATION", c1839g.f4463c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @NonNull
    /* renamed from: b */
    public static Intent m9825b(@NonNull Context context, @NonNull String str, @NonNull C1839g c1839g) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", c1839g.f4461a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c1839g.f4462b);
        intent.putExtra("KEY_NOTIFICATION", c1839g.f4463c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // androidx.work.impl.InterfaceC1844b
    @MainThread
    /* renamed from: c */
    public final void mo9824c(@NonNull String str, boolean z) {
        boolean z2;
        Map.Entry entry;
        synchronized (this.f4615c) {
            try {
                C1940p c1940p = (C1940p) this.f4618f.remove(str);
                if (c1940p != null) {
                    z2 = this.f4619g.remove(c1940p);
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.f4620h.m9853c(this.f4619g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1839g c1839g = (C1839g) this.f4617e.remove(str);
        if (str.equals(this.f4616d) && this.f4617e.size() > 0) {
            Iterator it = this.f4617e.entrySet().iterator();
            do {
                entry = (Map.Entry) it.next();
            } while (it.hasNext());
            this.f4616d = (String) entry.getKey();
            if (this.f4621i != null) {
                C1839g c1839g2 = (C1839g) entry.getValue();
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f4621i;
                systemForegroundService.f4605b.post(new RunnableC1898d(systemForegroundService, c1839g2.f4461a, c1839g2.f4463c, c1839g2.f4462b));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f4621i;
                systemForegroundService2.f4605b.post(new RunnableC1900f(systemForegroundService2, c1839g2.f4461a));
            }
        }
        InterfaceC1897a interfaceC1897a = this.f4621i;
        if (c1839g != null && interfaceC1897a != null) {
            AbstractC2005l.m9733c().mo9731a(f4612j, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(c1839g.f4461a), str, Integer.valueOf(c1839g.f4462b)), new Throwable[0]);
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) interfaceC1897a;
            systemForegroundService3.f4605b.post(new RunnableC1900f(systemForegroundService3, c1839g.f4461a));
        }
    }

    @Override // androidx.work.impl.constraints.InterfaceC1867c
    /* renamed from: e */
    public final void mo9736e(@NonNull ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                AbstractC2005l.m9733c().mo9731a(f4612j, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
                C1915l c1915l = this.f4613a;
                ((C1999b) c1915l.f4658d).m9738a(new RunnableC1985m(c1915l, str, true));
            }
        }
    }

    @Override // androidx.work.impl.constraints.InterfaceC1867c
    /* renamed from: f */
    public final void mo9735f(@NonNull List<String> list) {
    }
}

package androidx.work.impl.constraints;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.AbstractC2005l;
import androidx.work.impl.constraints.controllers.AbstractC1870c;
import androidx.work.impl.constraints.controllers.C1868a;
import androidx.work.impl.constraints.controllers.C1869b;
import androidx.work.impl.constraints.controllers.C1872d;
import androidx.work.impl.constraints.controllers.C1873e;
import androidx.work.impl.constraints.controllers.C1874f;
import androidx.work.impl.constraints.controllers.C1875g;
import androidx.work.impl.constraints.controllers.C1876h;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: androidx.work.impl.constraints.d */
/* loaded from: classes.dex */
public final class C1877d implements AbstractC1870c.InterfaceC1871a {

    /* renamed from: d */
    public static final String f4558d = AbstractC2005l.m9732e("WorkConstraintsTracker");
    @Nullable

    /* renamed from: a */
    public final InterfaceC1867c f4559a;

    /* renamed from: b */
    public final AbstractC1870c<?>[] f4560b;

    /* renamed from: c */
    public final Object f4561c;

    public C1877d(@NonNull Context context, @NonNull InterfaceC1998a interfaceC1998a, @Nullable InterfaceC1867c interfaceC1867c) {
        Context applicationContext = context.getApplicationContext();
        this.f4559a = interfaceC1867c;
        this.f4560b = new AbstractC1870c[]{new C1868a(applicationContext, interfaceC1998a), new C1869b(applicationContext, interfaceC1998a), new C1876h(applicationContext, interfaceC1998a), new C1872d(applicationContext, interfaceC1998a), new C1875g(applicationContext, interfaceC1998a), new C1874f(applicationContext, interfaceC1998a), new C1873e(applicationContext, interfaceC1998a)};
        this.f4561c = new Object();
    }

    /* renamed from: a */
    public final boolean m9855a(@NonNull String str) {
        AbstractC1870c<?>[] abstractC1870cArr;
        boolean z;
        synchronized (this.f4561c) {
            for (AbstractC1870c<?> abstractC1870c : this.f4560b) {
                Object obj = abstractC1870c.f4553b;
                if (obj != null && abstractC1870c.mo9856c(obj) && abstractC1870c.f4552a.contains(str)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    AbstractC2005l.m9733c().mo9731a(f4558d, String.format("Work %s constrained by %s", str, abstractC1870c.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public final void m9854b(@NonNull ArrayList arrayList) {
        synchronized (this.f4561c) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (m9855a(str)) {
                    AbstractC2005l.m9733c().mo9731a(f4558d, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList2.add(str);
                }
            }
            InterfaceC1867c interfaceC1867c = this.f4559a;
            if (interfaceC1867c != null) {
                interfaceC1867c.mo9735f(arrayList2);
            }
        }
    }

    /* renamed from: c */
    public final void m9853c(@NonNull Collection collection) {
        AbstractC1870c<?>[] abstractC1870cArr;
        AbstractC1870c<?>[] abstractC1870cArr2;
        synchronized (this.f4561c) {
            for (AbstractC1870c<?> abstractC1870c : this.f4560b) {
                if (abstractC1870c.f4555d != null) {
                    abstractC1870c.f4555d = null;
                    abstractC1870c.m9858e(null, abstractC1870c.f4553b);
                }
            }
            for (AbstractC1870c<?> abstractC1870c2 : this.f4560b) {
                abstractC1870c2.m9859d(collection);
            }
            for (AbstractC1870c<?> abstractC1870c3 : this.f4560b) {
                if (abstractC1870c3.f4555d != this) {
                    abstractC1870c3.f4555d = this;
                    abstractC1870c3.m9858e(this, abstractC1870c3.f4553b);
                }
            }
        }
    }

    /* renamed from: d */
    public final void m9852d() {
        AbstractC1870c<?>[] abstractC1870cArr;
        synchronized (this.f4561c) {
            for (AbstractC1870c<?> abstractC1870c : this.f4560b) {
                ArrayList arrayList = abstractC1870c.f4552a;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    abstractC1870c.f4554c.m9851b(abstractC1870c);
                }
            }
        }
    }
}

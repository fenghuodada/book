package androidx.work.impl.background.greedy;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC2005l;
import androidx.work.C1830c;
import androidx.work.C1833d;
import androidx.work.EnumC2018s;
import androidx.work.InterfaceC2016q;
import androidx.work.impl.C1843a;
import androidx.work.impl.C1915l;
import androidx.work.impl.InterfaceC1844b;
import androidx.work.impl.InterfaceC1892e;
import androidx.work.impl.constraints.C1877d;
import androidx.work.impl.constraints.InterfaceC1867c;
import androidx.work.impl.model.C1940p;
import androidx.work.impl.utils.C1981j;
import androidx.work.impl.utils.taskexecutor.C1999b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.background.greedy.c */
/* loaded from: classes.dex */
public final class C1847c implements InterfaceC1892e, InterfaceC1867c, InterfaceC1844b {

    /* renamed from: i */
    public static final String f4483i = AbstractC2005l.m9732e("GreedyScheduler");

    /* renamed from: a */
    public final Context f4484a;

    /* renamed from: b */
    public final C1915l f4485b;

    /* renamed from: c */
    public final C1877d f4486c;

    /* renamed from: e */
    public final C1846b f4488e;

    /* renamed from: f */
    public boolean f4489f;

    /* renamed from: h */
    public Boolean f4491h;

    /* renamed from: d */
    public final HashSet f4487d = new HashSet();

    /* renamed from: g */
    public final Object f4490g = new Object();

    public C1847c(@NonNull Context context, @NonNull C1830c c1830c, @NonNull C1999b c1999b, @NonNull C1915l c1915l) {
        this.f4484a = context;
        this.f4485b = c1915l;
        this.f4486c = new C1877d(context, c1999b, this);
        this.f4488e = new C1846b(this, c1830c.f4439e);
    }

    @Override // androidx.work.impl.InterfaceC1892e
    /* renamed from: a */
    public final void mo9831a(@NonNull C1940p... c1940pArr) {
        boolean z;
        if (this.f4491h == null) {
            this.f4491h = Boolean.valueOf(C1981j.m9745a(this.f4484a, this.f4485b.f4656b));
        }
        if (!this.f4491h.booleanValue()) {
            AbstractC2005l.m9733c().mo9729d(f4483i, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f4489f) {
            this.f4485b.f4660f.m9841a(this);
            this.f4489f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C1940p c1940p : c1940pArr) {
            long m9804a = c1940p.m9804a();
            long currentTimeMillis = System.currentTimeMillis();
            if (c1940p.f4691b == EnumC2018s.ENQUEUED) {
                if (currentTimeMillis < m9804a) {
                    C1846b c1846b = this.f4488e;
                    if (c1846b != null) {
                        HashMap hashMap = c1846b.f4482c;
                        Runnable runnable = (Runnable) hashMap.remove(c1940p.f4690a);
                        InterfaceC2016q interfaceC2016q = c1846b.f4481b;
                        if (runnable != null) {
                            ((C1843a) interfaceC2016q).f4476a.removeCallbacks(runnable);
                        }
                        RunnableC1845a runnableC1845a = new RunnableC1845a(c1846b, c1940p);
                        hashMap.put(c1940p.f4690a, runnableC1845a);
                        ((C1843a) interfaceC2016q).f4476a.postDelayed(runnableC1845a, c1940p.m9804a() - System.currentTimeMillis());
                    }
                } else if (c1940p.m9803b()) {
                    int i = Build.VERSION.SDK_INT;
                    C1833d c1833d = c1940p.f4699j;
                    if (c1833d.f4446c) {
                        AbstractC2005l.m9733c().mo9731a(f4483i, String.format("Ignoring WorkSpec %s, Requires device idle.", c1940p), new Throwable[0]);
                    } else {
                        if (i >= 24) {
                            if (c1833d.f4451h.f4454a.size() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                AbstractC2005l.m9733c().mo9731a(f4483i, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", c1940p), new Throwable[0]);
                            }
                        }
                        hashSet.add(c1940p);
                        hashSet2.add(c1940p.f4690a);
                    }
                } else {
                    AbstractC2005l.m9733c().mo9731a(f4483i, String.format("Starting work for %s", c1940p.f4690a), new Throwable[0]);
                    this.f4485b.m9812g(c1940p.f4690a, null);
                }
            }
        }
        synchronized (this.f4490g) {
            if (!hashSet.isEmpty()) {
                AbstractC2005l.m9733c().mo9731a(f4483i, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f4487d.addAll(hashSet);
                this.f4486c.m9853c(this.f4487d);
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC1892e
    /* renamed from: b */
    public final boolean mo9830b() {
        return false;
    }

    @Override // androidx.work.impl.InterfaceC1844b
    /* renamed from: c */
    public final void mo9824c(@NonNull String str, boolean z) {
        synchronized (this.f4490g) {
            Iterator it = this.f4487d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1940p c1940p = (C1940p) it.next();
                if (c1940p.f4690a.equals(str)) {
                    AbstractC2005l.m9733c().mo9731a(f4483i, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f4487d.remove(c1940p);
                    this.f4486c.m9853c(this.f4487d);
                    break;
                }
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC1892e
    /* renamed from: d */
    public final void mo9829d(@NonNull String str) {
        Runnable runnable;
        Boolean bool = this.f4491h;
        C1915l c1915l = this.f4485b;
        if (bool == null) {
            this.f4491h = Boolean.valueOf(C1981j.m9745a(this.f4484a, c1915l.f4656b));
        }
        boolean booleanValue = this.f4491h.booleanValue();
        String str2 = f4483i;
        if (!booleanValue) {
            AbstractC2005l.m9733c().mo9729d(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f4489f) {
            c1915l.f4660f.m9841a(this);
            this.f4489f = true;
        }
        AbstractC2005l.m9733c().mo9731a(str2, String.format("Cancelling work ID %s", str), new Throwable[0]);
        C1846b c1846b = this.f4488e;
        if (c1846b != null && (runnable = (Runnable) c1846b.f4482c.remove(str)) != null) {
            ((C1843a) c1846b.f4481b).f4476a.removeCallbacks(runnable);
        }
        c1915l.m9811h(str);
    }

    @Override // androidx.work.impl.constraints.InterfaceC1867c
    /* renamed from: e */
    public final void mo9736e(@NonNull ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC2005l.m9733c().mo9731a(f4483i, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f4485b.m9811h(str);
        }
    }

    @Override // androidx.work.impl.constraints.InterfaceC1867c
    /* renamed from: f */
    public final void mo9735f(@NonNull List<String> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC2005l.m9733c().mo9731a(f4483i, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f4485b.m9812g(str, null);
        }
    }
}

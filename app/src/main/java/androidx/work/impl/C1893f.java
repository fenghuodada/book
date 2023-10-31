package androidx.work.impl;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC2005l;
import androidx.work.C1830c;
import androidx.work.impl.model.C1940p;
import androidx.work.impl.model.C1943r;
import androidx.work.impl.model.InterfaceC1942q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.f */
/* loaded from: classes.dex */
public final class C1893f {

    /* renamed from: a */
    public static final String f4603a = AbstractC2005l.m9732e("Schedulers");

    /* renamed from: a */
    public static void m9828a(@NonNull C1830c c1830c, @NonNull WorkDatabase workDatabase, List<InterfaceC1892e> list) {
        if (list != null && list.size() != 0) {
            InterfaceC1942q mo9893n = workDatabase.mo9893n();
            workDatabase.m10074c();
            try {
                int i = Build.VERSION.SDK_INT;
                int i2 = c1830c.f4442h;
                if (i == 23) {
                    i2 /= 2;
                }
                C1943r c1943r = (C1943r) mo9893n;
                ArrayList m9799c = c1943r.m9799c(i2);
                ArrayList m9800b = c1943r.m9800b();
                if (m9799c.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = m9799c.iterator();
                    while (it.hasNext()) {
                        c1943r.m9791k(currentTimeMillis, ((C1940p) it.next()).f4690a);
                    }
                }
                workDatabase.m10071h();
                workDatabase.m10073f();
                if (m9799c.size() > 0) {
                    C1940p[] c1940pArr = (C1940p[]) m9799c.toArray(new C1940p[m9799c.size()]);
                    for (InterfaceC1892e interfaceC1892e : list) {
                        if (interfaceC1892e.mo9830b()) {
                            interfaceC1892e.mo9831a(c1940pArr);
                        }
                    }
                }
                if (m9800b.size() > 0) {
                    C1940p[] c1940pArr2 = (C1940p[]) m9800b.toArray(new C1940p[m9800b.size()]);
                    for (InterfaceC1892e interfaceC1892e2 : list) {
                        if (!interfaceC1892e2.mo9830b()) {
                            interfaceC1892e2.mo9831a(c1940pArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.m10073f();
                throw th;
            }
        }
    }
}

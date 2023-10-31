package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.AbstractC2005l;
import androidx.work.EnumC2018s;
import androidx.work.InterfaceC2010o;
import androidx.work.impl.C1864c;
import androidx.work.impl.C1890d;
import androidx.work.impl.C1915l;
import androidx.work.impl.InterfaceC1892e;
import androidx.work.impl.RunnableC1958o;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.C1919c;
import androidx.work.impl.model.C1943r;
import androidx.work.impl.model.InterfaceC1918b;
import androidx.work.impl.model.InterfaceC1942q;
import java.util.LinkedList;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.d */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1963d implements Runnable {

    /* renamed from: a */
    public final C1864c f4767a = new C1864c();

    /* renamed from: a */
    public static void m9766a(C1915l c1915l, String str) {
        boolean z;
        WorkDatabase workDatabase = c1915l.f4657c;
        InterfaceC1942q mo9893n = workDatabase.mo9893n();
        InterfaceC1918b mo9898i = workDatabase.mo9898i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (true) {
            z = false;
            if (linkedList.isEmpty()) {
                break;
            }
            String str2 = (String) linkedList.remove();
            C1943r c1943r = (C1943r) mo9893n;
            EnumC2018s m9796f = c1943r.m9796f(str2);
            if (m9796f != EnumC2018s.SUCCEEDED && m9796f != EnumC2018s.FAILED) {
                c1943r.m9788n(EnumC2018s.CANCELLED, str2);
            }
            linkedList.addAll(((C1919c) mo9898i).m9810a(str2));
        }
        C1890d c1890d = c1915l.f4660f;
        synchronized (c1890d.f4598k) {
            AbstractC2005l.m9733c().mo9731a(C1890d.f4587l, String.format("Processor cancelling %s", str), new Throwable[0]);
            c1890d.f4596i.add(str);
            RunnableC1958o runnableC1958o = (RunnableC1958o) c1890d.f4593f.remove(str);
            if (runnableC1958o != null) {
                z = true;
            }
            if (runnableC1958o == null) {
                runnableC1958o = (RunnableC1958o) c1890d.f4594g.remove(str);
            }
            C1890d.m9840b(str, runnableC1958o);
            if (z) {
                c1890d.m9834i();
            }
        }
        for (InterfaceC1892e interfaceC1892e : c1915l.f4659e) {
            interfaceC1892e.mo9829d(str);
        }
    }

    /* renamed from: b */
    public abstract void mo9765b();

    @Override // java.lang.Runnable
    public final void run() {
        C1864c c1864c = this.f4767a;
        try {
            mo9765b();
            c1864c.m9861a(InterfaceC2010o.f4876a);
        } catch (Throwable th) {
            c1864c.m9861a(new InterfaceC2010o.AbstractC2011a.C2012a(th));
        }
    }
}

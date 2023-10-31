package androidx.work.impl.utils;

import androidx.annotation.WorkerThread;
import androidx.work.impl.C1893f;
import androidx.work.impl.C1915l;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.C1943r;
import java.util.Iterator;

/* renamed from: androidx.work.impl.utils.c */
/* loaded from: classes.dex */
public final class C1962c extends AbstractRunnableC1963d {

    /* renamed from: b */
    public final /* synthetic */ C1915l f4764b;

    /* renamed from: c */
    public final /* synthetic */ String f4765c;

    /* renamed from: d */
    public final /* synthetic */ boolean f4766d = false;

    public C1962c(C1915l c1915l, String str) {
        this.f4764b = c1915l;
        this.f4765c = str;
    }

    @Override // androidx.work.impl.utils.AbstractRunnableC1963d
    @WorkerThread
    /* renamed from: b */
    public final void mo9765b() {
        C1915l c1915l = this.f4764b;
        WorkDatabase workDatabase = c1915l.f4657c;
        workDatabase.m10074c();
        try {
            Iterator it = ((C1943r) workDatabase.mo9893n()).m9795g(this.f4765c).iterator();
            while (it.hasNext()) {
                AbstractRunnableC1963d.m9766a(c1915l, (String) it.next());
            }
            workDatabase.m10071h();
            workDatabase.m10073f();
            if (this.f4766d) {
                C1893f.m9828a(c1915l.f4656b, c1915l.f4657c, c1915l.f4659e);
            }
        } catch (Throwable th) {
            workDatabase.m10073f();
            throw th;
        }
    }
}

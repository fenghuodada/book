package androidx.work.impl.utils;

import androidx.annotation.WorkerThread;
import androidx.work.impl.C1893f;
import androidx.work.impl.C1915l;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.C1943r;
import java.util.Iterator;

/* renamed from: androidx.work.impl.utils.b */
/* loaded from: classes.dex */
public final class C1961b extends AbstractRunnableC1963d {

    /* renamed from: b */
    public final /* synthetic */ C1915l f4762b;

    /* renamed from: c */
    public final /* synthetic */ String f4763c = "offline_ping_sender_work";

    public C1961b(C1915l c1915l) {
        this.f4762b = c1915l;
    }

    @Override // androidx.work.impl.utils.AbstractRunnableC1963d
    @WorkerThread
    /* renamed from: b */
    public final void mo9765b() {
        C1915l c1915l = this.f4762b;
        WorkDatabase workDatabase = c1915l.f4657c;
        workDatabase.m10074c();
        try {
            Iterator it = ((C1943r) workDatabase.mo9893n()).m9794h(this.f4763c).iterator();
            while (it.hasNext()) {
                AbstractRunnableC1963d.m9766a(c1915l, (String) it.next());
            }
            workDatabase.m10071h();
            workDatabase.m10073f();
            C1893f.m9828a(c1915l.f4656b, c1915l.f4657c, c1915l.f4659e);
        } catch (Throwable th) {
            workDatabase.m10073f();
            throw th;
        }
    }
}

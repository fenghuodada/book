package androidx.work.impl.utils;

import androidx.annotation.WorkerThread;
import androidx.work.impl.C1893f;
import androidx.work.impl.C1915l;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* renamed from: androidx.work.impl.utils.a */
/* loaded from: classes.dex */
public final class C1960a extends AbstractRunnableC1963d {

    /* renamed from: b */
    public final /* synthetic */ C1915l f4760b;

    /* renamed from: c */
    public final /* synthetic */ UUID f4761c;

    public C1960a(C1915l c1915l, UUID uuid) {
        this.f4760b = c1915l;
        this.f4761c = uuid;
    }

    @Override // androidx.work.impl.utils.AbstractRunnableC1963d
    @WorkerThread
    /* renamed from: b */
    public final void mo9765b() {
        C1915l c1915l = this.f4760b;
        WorkDatabase workDatabase = c1915l.f4657c;
        workDatabase.m10074c();
        try {
            AbstractRunnableC1963d.m9766a(c1915l, this.f4761c.toString());
            workDatabase.m10071h();
            workDatabase.m10073f();
            C1893f.m9828a(c1915l.f4656b, c1915l.f4657c, c1915l.f4659e);
        } catch (Throwable th) {
            workDatabase.m10073f();
            throw th;
        }
    }
}

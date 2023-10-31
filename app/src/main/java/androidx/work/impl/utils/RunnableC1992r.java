package androidx.work.impl.utils;

import androidx.room.AbstractC1668i;
import androidx.work.AbstractC2005l;
import androidx.work.C1837f;
import androidx.work.EnumC2018s;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.C1934m;
import androidx.work.impl.model.C1936o;
import androidx.work.impl.model.C1940p;
import androidx.work.impl.model.C1943r;
import androidx.work.impl.utils.futures.C1977c;
import java.util.UUID;

/* renamed from: androidx.work.impl.utils.r */
/* loaded from: classes.dex */
public final class RunnableC1992r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ UUID f4838a;

    /* renamed from: b */
    public final /* synthetic */ C1837f f4839b;

    /* renamed from: c */
    public final /* synthetic */ C1977c f4840c;

    /* renamed from: d */
    public final /* synthetic */ C1993s f4841d;

    public RunnableC1992r(C1993s c1993s, UUID uuid, C1837f c1837f, C1977c c1977c) {
        this.f4841d = c1993s;
        this.f4838a = uuid;
        this.f4839b = c1837f;
        this.f4840c = c1977c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1940p m9793i;
        C1977c c1977c = this.f4840c;
        UUID uuid = this.f4838a;
        String uuid2 = uuid.toString();
        AbstractC2005l m9733c = AbstractC2005l.m9733c();
        String str = C1993s.f4842c;
        C1837f c1837f = this.f4839b;
        m9733c.mo9731a(str, String.format("Updating progress for %s (%s)", uuid, c1837f), new Throwable[0]);
        C1993s c1993s = this.f4841d;
        WorkDatabase workDatabase = c1993s.f4843a;
        WorkDatabase workDatabase2 = c1993s.f4843a;
        workDatabase.m10074c();
        try {
            m9793i = ((C1943r) workDatabase2.mo9893n()).m9793i(uuid2);
        } finally {
            try {
                return;
            } finally {
            }
        }
        if (m9793i != null) {
            if (m9793i.f4691b == EnumC2018s.RUNNING) {
                C1934m c1934m = new C1934m(uuid2, c1837f);
                C1936o c1936o = (C1936o) workDatabase2.mo9894m();
                AbstractC1668i abstractC1668i = c1936o.f4686a;
                abstractC1668i.m10075b();
                abstractC1668i.m10074c();
                c1936o.f4687b.m10084e(c1934m);
                abstractC1668i.m10071h();
                abstractC1668i.m10073f();
            } else {
                AbstractC2005l.m9733c().mo9728f(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid2), new Throwable[0]);
            }
            c1977c.m9750h(null);
            workDatabase2.m10071h();
            return;
        }
        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
    }
}

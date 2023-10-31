package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC2005l;
import androidx.work.EnumC2018s;
import androidx.work.impl.C1890d;
import androidx.work.impl.C1915l;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.C1943r;
import androidx.work.impl.model.InterfaceC1942q;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.m */
/* loaded from: classes.dex */
public final class RunnableC1985m implements Runnable {

    /* renamed from: d */
    public static final String f4813d = AbstractC2005l.m9732e("StopWorkRunnable");

    /* renamed from: a */
    public final C1915l f4814a;

    /* renamed from: b */
    public final String f4815b;

    /* renamed from: c */
    public final boolean f4816c;

    public RunnableC1985m(@NonNull C1915l c1915l, @NonNull String str, boolean z) {
        this.f4814a = c1915l;
        this.f4815b = str;
        this.f4816c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean m9832k;
        C1915l c1915l = this.f4814a;
        WorkDatabase workDatabase = c1915l.f4657c;
        C1890d c1890d = c1915l.f4660f;
        InterfaceC1942q mo9893n = workDatabase.mo9893n();
        workDatabase.m10074c();
        try {
            String str = this.f4815b;
            synchronized (c1890d.f4598k) {
                containsKey = c1890d.f4593f.containsKey(str);
            }
            if (this.f4816c) {
                m9832k = this.f4814a.f4660f.m9833j(this.f4815b);
            } else {
                if (!containsKey) {
                    C1943r c1943r = (C1943r) mo9893n;
                    if (c1943r.m9796f(this.f4815b) == EnumC2018s.RUNNING) {
                        c1943r.m9788n(EnumC2018s.ENQUEUED, this.f4815b);
                    }
                }
                m9832k = this.f4814a.f4660f.m9832k(this.f4815b);
            }
            AbstractC2005l.m9733c().mo9731a(f4813d, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f4815b, Boolean.valueOf(m9832k)), new Throwable[0]);
            workDatabase.m10071h();
        } finally {
            workDatabase.m10073f();
        }
    }
}

package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC2005l;
import androidx.work.impl.constraints.InterfaceC1865a;
import androidx.work.impl.constraints.controllers.AbstractC1870c;
import androidx.work.impl.utils.taskexecutor.C1999b;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.constraints.trackers.d */
/* loaded from: classes.dex */
public abstract class AbstractC1882d<T> {

    /* renamed from: f */
    public static final String f4567f = AbstractC2005l.m9732e("ConstraintTracker");

    /* renamed from: a */
    public final InterfaceC1998a f4568a;

    /* renamed from: b */
    public final Context f4569b;

    /* renamed from: c */
    public final Object f4570c = new Object();

    /* renamed from: d */
    public final LinkedHashSet f4571d = new LinkedHashSet();

    /* renamed from: e */
    public T f4572e;

    /* renamed from: androidx.work.impl.constraints.trackers.d$a */
    /* loaded from: classes.dex */
    public class RunnableC1883a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ List f4573a;

        public RunnableC1883a(ArrayList arrayList) {
            this.f4573a = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (InterfaceC1865a interfaceC1865a : this.f4573a) {
                interfaceC1865a.mo9860a(AbstractC1882d.this.f4572e);
            }
        }
    }

    public AbstractC1882d(@NonNull Context context, @NonNull InterfaceC1998a interfaceC1998a) {
        this.f4569b = context.getApplicationContext();
        this.f4568a = interfaceC1998a;
    }

    /* renamed from: a */
    public abstract T mo9845a();

    /* renamed from: b */
    public final void m9851b(AbstractC1870c abstractC1870c) {
        synchronized (this.f4570c) {
            if (this.f4571d.remove(abstractC1870c) && this.f4571d.isEmpty()) {
                mo9847e();
            }
        }
    }

    /* renamed from: c */
    public final void m9850c(T t) {
        synchronized (this.f4570c) {
            T t2 = this.f4572e;
            if (t2 != t && (t2 == null || !t2.equals(t))) {
                this.f4572e = t;
                ((C1999b) this.f4568a).f4855c.execute(new RunnableC1883a(new ArrayList(this.f4571d)));
            }
        }
    }

    /* renamed from: d */
    public abstract void mo9848d();

    /* renamed from: e */
    public abstract void mo9847e();
}

package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC2005l;
import androidx.work.InterfaceC2010o;
import androidx.work.impl.C1864c;
import androidx.work.impl.C1893f;
import androidx.work.impl.C1901g;
import androidx.work.impl.C1915l;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.e */
/* loaded from: classes.dex */
public final class RunnableC1964e implements Runnable {

    /* renamed from: c */
    public static final String f4768c = AbstractC2005l.m9732e("EnqueueRunnable");

    /* renamed from: a */
    public final C1901g f4769a;

    /* renamed from: b */
    public final C1864c f4770b = new C1864c();

    public RunnableC1964e(@NonNull C1901g c1901g) {
        this.f4769a = c1901g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0191  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.util.List] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m9764a(@androidx.annotation.NonNull androidx.work.impl.C1901g r26) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.RunnableC1964e.m9764a(androidx.work.impl.g):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1864c c1864c = this.f4770b;
        C1901g c1901g = this.f4769a;
        try {
            c1901g.getClass();
            C1915l c1915l = c1901g.f4632a;
            if (!C1901g.m9823a(c1901g, new HashSet())) {
                WorkDatabase workDatabase = c1915l.f4657c;
                workDatabase.m10074c();
                boolean m9764a = m9764a(c1901g);
                workDatabase.m10071h();
                workDatabase.m10073f();
                if (m9764a) {
                    C1978g.m9747a(c1915l.f4655a, RescheduleReceiver.class, true);
                    C1893f.m9828a(c1915l.f4656b, c1915l.f4657c, c1915l.f4659e);
                }
                c1864c.m9861a(InterfaceC2010o.f4876a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", c1901g));
        } catch (Throwable th) {
            c1864c.m9861a(new InterfaceC2010o.AbstractC2011a.C2012a(th));
        }
    }
}

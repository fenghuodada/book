package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.WorkerParameters;
import androidx.work.impl.C1915l;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.l */
/* loaded from: classes.dex */
public final class RunnableC1984l implements Runnable {

    /* renamed from: a */
    public final C1915l f4810a;

    /* renamed from: b */
    public final String f4811b;

    /* renamed from: c */
    public final WorkerParameters.C1827a f4812c;

    public RunnableC1984l(C1915l c1915l, String str, WorkerParameters.C1827a c1827a) {
        this.f4810a = c1915l;
        this.f4811b = str;
        this.f4812c = c1827a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4810a.f4660f.m9835h(this.f4811b, this.f4812c);
    }
}

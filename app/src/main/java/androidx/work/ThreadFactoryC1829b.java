package androidx.work;

import androidx.constraintlayout.core.C0499a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.work.b */
/* loaded from: classes.dex */
public final class ThreadFactoryC1829b implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f4433a = new AtomicInteger(0);

    /* renamed from: b */
    public final /* synthetic */ boolean f4434b;

    public ThreadFactoryC1829b(boolean z) {
        this.f4434b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        if (this.f4434b) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        StringBuilder m12383b = C0499a.m12383b(str);
        m12383b.append(this.f4433a.incrementAndGet());
        return new Thread(runnable, m12383b.toString());
    }
}

package androidx.work.impl.foreground;

/* renamed from: androidx.work.impl.foreground.f */
/* loaded from: classes.dex */
public final class RunnableC1900f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4629a;

    /* renamed from: b */
    public final /* synthetic */ SystemForegroundService f4630b;

    public RunnableC1900f(SystemForegroundService systemForegroundService, int i) {
        this.f4630b = systemForegroundService;
        this.f4629a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4630b.f4608e.cancel(this.f4629a);
    }
}

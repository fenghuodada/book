package p060j$.util.stream;

/* renamed from: j$.util.stream.F3 */
/* loaded from: classes2.dex */
final class RunnableC10512F3 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Runnable f20990a;

    /* renamed from: b */
    final /* synthetic */ Runnable f20991b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC10512F3(Runnable runnable, Runnable runnable2) {
        this.f20990a = runnable;
        this.f20991b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f20991b;
        try {
            this.f20990a.run();
            runnable.run();
        } catch (Throwable th) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                try {
                    th.addSuppressed(th2);
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }
}

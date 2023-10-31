package androidx.core.provider;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.util.InterfaceC0797a;
import java.util.concurrent.Callable;

/* renamed from: androidx.core.provider.q */
/* loaded from: classes.dex */
public final class RunnableC0773q<T> implements Runnable {
    @NonNull

    /* renamed from: a */
    public final Callable<T> f2470a;
    @NonNull

    /* renamed from: b */
    public final InterfaceC0797a<T> f2471b;
    @NonNull

    /* renamed from: c */
    public final Handler f2472c;

    /* renamed from: androidx.core.provider.q$a */
    /* loaded from: classes.dex */
    public class RunnableC0774a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC0797a f2473a;

        /* renamed from: b */
        public final /* synthetic */ Object f2474b;

        public RunnableC0774a(InterfaceC0797a interfaceC0797a, Object obj) {
            this.f2473a = interfaceC0797a;
            this.f2474b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f2473a.accept(this.f2474b);
        }
    }

    public RunnableC0773q(@NonNull Handler handler, @NonNull CallableC0765k callableC0765k, @NonNull C0766l c0766l) {
        this.f2470a = callableC0765k;
        this.f2471b = c0766l;
        this.f2472c = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        T t;
        try {
            t = this.f2470a.call();
        } catch (Exception unused) {
            t = null;
        }
        this.f2472c.post(new RunnableC0774a(this.f2471b, t));
    }
}

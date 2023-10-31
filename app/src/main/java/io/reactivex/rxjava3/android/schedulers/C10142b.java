package io.reactivex.rxjava3.android.schedulers;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.rxjava3.android.schedulers.C10142b;
import io.reactivex.rxjava3.core.AbstractC10154g;
import io.reactivex.rxjava3.internal.util.C10231a;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.rxjava3.android.schedulers.b */
/* loaded from: classes3.dex */
public final class C10142b {

    /* renamed from: a */
    public static final AbstractC10154g f20398a;

    /* renamed from: io.reactivex.rxjava3.android.schedulers.b$a */
    /* loaded from: classes3.dex */
    public static final class C10143a {

        /* renamed from: a */
        public static final C10144c f20399a = new C10144c(new Handler(Looper.getMainLooper()));
    }

    static {
        try {
            AbstractC10154g abstractC10154g = (AbstractC10154g) new Callable() { // from class: io.reactivex.rxjava3.android.schedulers.a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C10142b.C10143a.f20399a;
                }
            }.call();
            if (abstractC10154g != null) {
                f20398a = abstractC10154g;
                return;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw C10231a.m1191a(th);
        }
    }

    /* renamed from: a */
    public static AbstractC10154g m1225a() {
        AbstractC10154g abstractC10154g = f20398a;
        if (abstractC10154g != null) {
            return abstractC10154g;
        }
        throw new NullPointerException("scheduler == null");
    }
}

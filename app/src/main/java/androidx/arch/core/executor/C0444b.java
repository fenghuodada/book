package androidx.arch.core.executor;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.arch.core.executor.b */
/* loaded from: classes.dex */
public final class C0444b extends AbstractC0448e {

    /* renamed from: b */
    public static volatile C0444b f1437b;
    @NonNull

    /* renamed from: c */
    public static final ExecutorC0443a f1438c = new Executor() { // from class: androidx.arch.core.executor.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C0444b.m12450a().f1439a.f1441b.execute(runnable);
        }
    };
    @NonNull

    /* renamed from: a */
    public final C0445c f1439a = new C0445c();

    @NonNull
    /* renamed from: a */
    public static C0444b m12450a() {
        if (f1437b != null) {
            return f1437b;
        }
        synchronized (C0444b.class) {
            if (f1437b == null) {
                f1437b = new C0444b();
            }
        }
        return f1437b;
    }

    /* renamed from: b */
    public final void m12449b(@NonNull Runnable runnable) {
        C0445c c0445c = this.f1439a;
        if (c0445c.f1442c == null) {
            synchronized (c0445c.f1440a) {
                if (c0445c.f1442c == null) {
                    c0445c.f1442c = C0445c.m12448a(Looper.getMainLooper());
                }
            }
        }
        c0445c.f1442c.post(runnable);
    }
}

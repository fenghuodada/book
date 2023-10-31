package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC1464h;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.lifecycle.e0 */
/* loaded from: classes.dex */
public final class C1457e0 {
    @NotNull

    /* renamed from: a */
    public final C1484n f3428a;
    @NotNull

    /* renamed from: b */
    public final Handler f3429b;
    @Nullable

    /* renamed from: c */
    public RunnableC1458a f3430c;

    /* renamed from: androidx.lifecycle.e0$a */
    /* loaded from: classes.dex */
    public static final class RunnableC1458a implements Runnable {
        @NotNull

        /* renamed from: a */
        public final C1484n f3431a;
        @NotNull

        /* renamed from: b */
        public final AbstractC1464h.EnumC1465a f3432b;

        /* renamed from: c */
        public boolean f3433c;

        public RunnableC1458a(@NotNull C1484n registry, @NotNull AbstractC1464h.EnumC1465a event) {
            C10843j.m430f(registry, "registry");
            C10843j.m430f(event, "event");
            this.f3431a = registry;
            this.f3432b = event;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f3433c) {
                return;
            }
            this.f3431a.m10534f(this.f3432b);
            this.f3433c = true;
        }
    }

    public C1457e0(@NotNull InterfaceC1483m provider) {
        C10843j.m430f(provider, "provider");
        this.f3428a = new C1484n(provider);
        this.f3429b = new Handler();
    }

    /* renamed from: a */
    public final void m10552a(AbstractC1464h.EnumC1465a enumC1465a) {
        RunnableC1458a runnableC1458a = this.f3430c;
        if (runnableC1458a != null) {
            runnableC1458a.run();
        }
        RunnableC1458a runnableC1458a2 = new RunnableC1458a(this.f3428a, enumC1465a);
        this.f3430c = runnableC1458a2;
        this.f3429b.postAtFrontOfQueue(runnableC1458a2);
    }
}

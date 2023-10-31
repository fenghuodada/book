package androidx.work;

import androidx.annotation.NonNull;
import androidx.work.impl.C1843a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: androidx.work.c */
/* loaded from: classes.dex */
public final class C1830c {
    @NonNull

    /* renamed from: a */
    public final ExecutorService f4435a = m9906a(false);
    @NonNull

    /* renamed from: b */
    public final ExecutorService f4436b = m9906a(true);
    @NonNull

    /* renamed from: c */
    public final C2022v f4437c;
    @NonNull

    /* renamed from: d */
    public final C2003j f4438d;
    @NonNull

    /* renamed from: e */
    public final C1843a f4439e;

    /* renamed from: f */
    public final int f4440f;

    /* renamed from: g */
    public final int f4441g;

    /* renamed from: h */
    public final int f4442h;

    /* renamed from: androidx.work.c$a */
    /* loaded from: classes.dex */
    public static final class C1831a {
    }

    /* renamed from: androidx.work.c$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1832b {
        @NonNull
        /* renamed from: a */
        C1830c m9905a();
    }

    public C1830c(@NonNull C1831a c1831a) {
        String str = AbstractC2023w.f4892a;
        this.f4437c = new C2022v();
        this.f4438d = new C2003j();
        this.f4439e = new C1843a();
        this.f4440f = 4;
        this.f4441g = Integer.MAX_VALUE;
        this.f4442h = 20;
    }

    @NonNull
    /* renamed from: a */
    public static ExecutorService m9906a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ThreadFactoryC1829b(z));
    }
}

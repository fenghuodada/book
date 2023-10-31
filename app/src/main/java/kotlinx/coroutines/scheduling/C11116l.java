package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.internal.C11036g0;
import kotlinx.coroutines.internal.C11038h0;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlinx.coroutines.scheduling.l */
/* loaded from: classes3.dex */
public final class C11116l {
    @JvmField
    @NotNull

    /* renamed from: a */
    public static final String f21748a;
    @JvmField

    /* renamed from: b */
    public static final long f21749b;
    @JvmField

    /* renamed from: c */
    public static final int f21750c;
    @JvmField

    /* renamed from: d */
    public static final int f21751d;
    @JvmField

    /* renamed from: e */
    public static final long f21752e;
    @JvmField
    @NotNull

    /* renamed from: f */
    public static final C11109e f21753f;
    @JvmField
    @NotNull

    /* renamed from: g */
    public static final C11114j f21754g;
    @JvmField
    @NotNull

    /* renamed from: h */
    public static final C11114j f21755h;

    static {
        String str;
        int i = C11038h0.f21629a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f21748a = str;
        f21749b = C11036g0.m264a(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i2 = C11038h0.f21629a;
        if (i2 < 2) {
            i2 = 2;
        }
        f21750c = C11036g0.m263b("kotlinx.coroutines.scheduler.core.pool.size", i2, 1, 0, 8);
        f21751d = C11036g0.m263b("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f21752e = TimeUnit.SECONDS.toNanos(C11036g0.m264a(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f21753f = C11109e.f21742a;
        f21754g = new C11114j(0);
        f21755h = new C11114j(1);
    }
}

package kotlinx.coroutines.internal;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.internal.c */
/* loaded from: classes3.dex */
public final class C11027c {
    @Nullable

    /* renamed from: a */
    public static final Method f21619a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f21619a = method;
    }
}

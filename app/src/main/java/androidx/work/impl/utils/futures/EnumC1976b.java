package androidx.work.impl.utils.futures;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.futures.b */
/* loaded from: classes.dex */
public final class EnumC1976b implements Executor {

    /* renamed from: a */
    public static final EnumC1976b f4799a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC1976b[] f4800b;

    static {
        EnumC1976b enumC1976b = new EnumC1976b();
        f4799a = enumC1976b;
        f4800b = new EnumC1976b[]{enumC1976b};
    }

    public static EnumC1976b valueOf(String str) {
        return (EnumC1976b) Enum.valueOf(EnumC1976b.class, str);
    }

    public static EnumC1976b[] values() {
        return (EnumC1976b[]) f4800b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}

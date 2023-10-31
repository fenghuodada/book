package androidx.concurrent.futures;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.concurrent.futures.e */
/* loaded from: classes.dex */
public final class EnumC0497e implements Executor {

    /* renamed from: a */
    public static final EnumC0497e f1556a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC0497e[] f1557b;

    static {
        EnumC0497e enumC0497e = new EnumC0497e();
        f1556a = enumC0497e;
        f1557b = new EnumC0497e[]{enumC0497e};
    }

    public static EnumC0497e valueOf(String str) {
        return (EnumC0497e) Enum.valueOf(EnumC0497e.class, str);
    }

    public static EnumC0497e[] values() {
        return (EnumC0497e[]) f1557b.clone();
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

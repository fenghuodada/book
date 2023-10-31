package androidx.startup;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* renamed from: androidx.startup.c */
/* loaded from: classes.dex */
public final class C1717c extends RuntimeException {
    public C1717c() {
        super("Context cannot be null");
    }

    public C1717c(@NonNull Throwable th) {
        super(th);
    }
}

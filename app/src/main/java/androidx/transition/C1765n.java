package androidx.transition;

import android.os.Build;

/* renamed from: androidx.transition.n */
/* loaded from: classes.dex */
public final class C1765n {

    /* renamed from: a */
    public static final boolean f4275a;

    /* renamed from: b */
    public static final boolean f4276b;

    /* renamed from: c */
    public static final boolean f4277c;

    static {
        int i = Build.VERSION.SDK_INT;
        f4275a = true;
        f4276b = true;
        f4277c = i >= 28;
    }
}

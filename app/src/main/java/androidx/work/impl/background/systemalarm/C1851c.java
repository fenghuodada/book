package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC2005l;
import androidx.work.impl.constraints.C1877d;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.background.systemalarm.c */
/* loaded from: classes.dex */
public final class C1851c {

    /* renamed from: d */
    public static final String f4506d = AbstractC2005l.m9732e("ConstraintsCmdHandler");

    /* renamed from: a */
    public final Context f4507a;

    /* renamed from: b */
    public final int f4508b;

    /* renamed from: c */
    public final C1877d f4509c;

    public C1851c(@NonNull Context context, int i, @NonNull C1853e c1853e) {
        this.f4507a = context;
        this.f4508b = i;
        this.f4509c = new C1877d(context, c1853e.f4522b, null);
    }
}

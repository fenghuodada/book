package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.constraints.trackers.h */
/* loaded from: classes.dex */
public final class C1889h {

    /* renamed from: e */
    public static C1889h f4582e;

    /* renamed from: a */
    public final C1878a f4583a;

    /* renamed from: b */
    public final C1879b f4584b;

    /* renamed from: c */
    public final C1885f f4585c;

    /* renamed from: d */
    public final C1888g f4586d;

    public C1889h(@NonNull Context context, @NonNull InterfaceC1998a interfaceC1998a) {
        Context applicationContext = context.getApplicationContext();
        this.f4583a = new C1878a(applicationContext, interfaceC1998a);
        this.f4584b = new C1879b(applicationContext, interfaceC1998a);
        this.f4585c = new C1885f(applicationContext, interfaceC1998a);
        this.f4586d = new C1888g(applicationContext, interfaceC1998a);
    }

    @NonNull
    /* renamed from: a */
    public static synchronized C1889h m9842a(Context context, InterfaceC1998a interfaceC1998a) {
        C1889h c1889h;
        synchronized (C1889h.class) {
            if (f4582e == null) {
                f4582e = new C1889h(context, interfaceC1998a);
            }
            c1889h = f4582e;
        }
        return c1889h;
    }
}

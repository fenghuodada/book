package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.motion.widget.C0552c;

/* renamed from: androidx.work.w */
/* loaded from: classes.dex */
public abstract class AbstractC2023w {

    /* renamed from: a */
    public static final String f4892a = AbstractC2005l.m9732e("WorkerFactory");

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: a */
    public final ListenableWorker m9724a(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters) {
        Class cls;
        String str2 = f4892a;
        ListenableWorker listenableWorker = null;
        try {
            cls = Class.forName(str).asSubclass(ListenableWorker.class);
        } catch (Throwable th) {
            AbstractC2005l.m9733c().mo9730b(str2, C0552c.m12192b("Invalid class: ", str), th);
            cls = null;
        }
        if (cls != null) {
            try {
                listenableWorker = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                AbstractC2005l.m9733c().mo9730b(str2, C0552c.m12192b("Could not instantiate ", str), th2);
            }
        }
        if (listenableWorker != null && listenableWorker.isUsed()) {
            throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
        }
        return listenableWorker;
    }
}

package androidx.core.app;

import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: androidx.core.app.f */
/* loaded from: classes.dex */
public final class RunnableC0614f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f2269a;

    /* renamed from: b */
    public final /* synthetic */ Object f2270b;

    public RunnableC0614f(Object obj, Object obj2) {
        this.f2269a = obj;
        this.f2270b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = C0616g.f2274d;
            Object obj = this.f2270b;
            Object obj2 = this.f2269a;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                C0616g.f2275e.invoke(obj2, obj, Boolean.FALSE);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}

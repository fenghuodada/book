package androidx.work.impl;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.work.InterfaceC2016q;
import java.lang.reflect.InvocationTargetException;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.a */
/* loaded from: classes.dex */
public final class C1843a implements InterfaceC2016q {

    /* renamed from: a */
    public final Handler f4476a;

    public C1843a() {
        Handler handler;
        Handler handler2;
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handler2 = Handler.createAsync(mainLooper);
        } else {
            try {
                handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
            } catch (IllegalAccessException e) {
                e = e;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handler2 = handler;
                this.f4476a = handler2;
            } catch (InstantiationException e2) {
                e = e2;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handler2 = handler;
                this.f4476a = handler2;
            } catch (NoSuchMethodException e3) {
                e = e3;
                Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                handler = new Handler(mainLooper);
                handler2 = handler;
                this.f4476a = handler2;
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (!(cause instanceof RuntimeException)) {
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException(cause);
                }
                throw ((RuntimeException) cause);
            }
            handler2 = handler;
        }
        this.f4476a = handler2;
    }
}

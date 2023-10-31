package com.vungle.warren.log;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.AppMeasurement;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.log.C9835f;
import java.lang.Thread;

/* renamed from: com.vungle.warren.log.d */
/* loaded from: classes3.dex */
public final class C9833d implements Thread.UncaughtExceptionHandler {

    /* renamed from: b */
    public final C9835f.InterfaceC9838c f19627b;

    /* renamed from: c */
    public String f19628c = C9835f.f19640o;

    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler f19626a = Thread.getDefaultUncaughtExceptionHandler();

    public C9833d(@NonNull C9835f.InterfaceC9838c interfaceC9838c) {
        this.f19627b = interfaceC9838c;
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        C9835f.C9837b c9837b = (C9835f.C9837b) this.f19627b;
        if (C9835f.this.f19647g.get() && thread != null && th != null) {
            boolean z = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                StackTraceElement[] stackTrace = th2.getStackTrace();
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (stackTrace[i].getClassName().startsWith(this.f19628c)) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (z) {
                C9835f.this.m1487b(VungleLogger.LoggerLevel.CRASH, AppMeasurement.CRASH_ORIGIN, Log.getStackTraceString(th), th.getClass().toString(), String.valueOf(thread.getId()));
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f19626a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}

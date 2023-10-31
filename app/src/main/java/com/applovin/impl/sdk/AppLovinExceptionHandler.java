package com.applovin.impl.sdk;

import android.os.Process;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private static final AppLovinExceptionHandler f7533a = new AppLovinExceptionHandler();

    /* renamed from: b */
    private final Set<C3214m> f7534b = new HashSet(2);

    /* renamed from: c */
    private final AtomicBoolean f7535c = new AtomicBoolean();

    /* renamed from: d */
    private Thread.UncaughtExceptionHandler f7536d;

    public static AppLovinExceptionHandler shared() {
        return f7533a;
    }

    public void addSdk(C3214m c3214m) {
        this.f7534b.add(c3214m);
    }

    public void enable() {
        if (this.f7535c.compareAndSet(false, true)) {
            this.f7536d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        for (C3214m c3214m : this.f7534b) {
            if (C3349v.m6862a()) {
                c3214m.m7487A().m6855b("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            ((EventServiceImpl) c3214m.m7389w()).trackEventSynchronously("paused");
            ((EventServiceImpl) c3214m.m7389w()).trackEventSynchronously("crashed");
        }
        try {
            Thread.sleep(100L);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f7536d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        Process.killProcess(Process.myPid());
        System.exit(1);
    }
}

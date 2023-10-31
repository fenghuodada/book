package com.vungle.warren.utility;

import androidx.annotation.NonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.vungle.warren.utility.m */
/* loaded from: classes3.dex */
public final class ThreadFactoryC10092m implements ThreadFactory {

    /* renamed from: a */
    public final String f20315a;

    /* renamed from: b */
    public final ThreadFactory f20316b = Executors.defaultThreadFactory();

    /* renamed from: c */
    public final AtomicInteger f20317c = new AtomicInteger(0);

    public ThreadFactoryC10092m(String str) {
        this.f20315a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread newThread = this.f20316b.newThread(runnable);
        newThread.setName(this.f20315a + "-th-" + this.f20317c.incrementAndGet());
        return newThread;
    }
}

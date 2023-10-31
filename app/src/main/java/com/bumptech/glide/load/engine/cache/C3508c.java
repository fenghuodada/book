package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.util.C3860j;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.engine.cache.c */
/* loaded from: classes.dex */
public final class C3508c {

    /* renamed from: a */
    public final HashMap f9288a = new HashMap();

    /* renamed from: b */
    public final C3510b f9289b = new C3510b();

    /* renamed from: com.bumptech.glide.load.engine.cache.c$a */
    /* loaded from: classes.dex */
    public static class C3509a {

        /* renamed from: a */
        public final ReentrantLock f9290a = new ReentrantLock();

        /* renamed from: b */
        public int f9291b;
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.c$b */
    /* loaded from: classes.dex */
    public static class C3510b {

        /* renamed from: a */
        public final ArrayDeque f9292a = new ArrayDeque();

        /* renamed from: a */
        public final C3509a m6677a() {
            C3509a c3509a;
            synchronized (this.f9292a) {
                c3509a = (C3509a) this.f9292a.poll();
            }
            return c3509a == null ? new C3509a() : c3509a;
        }

        /* renamed from: b */
        public final void m6676b(C3509a c3509a) {
            synchronized (this.f9292a) {
                if (this.f9292a.size() < 10) {
                    this.f9292a.offer(c3509a);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m6678a(String str) {
        C3509a c3509a;
        synchronized (this) {
            Object obj = this.f9288a.get(str);
            C3860j.m6404b(obj);
            c3509a = (C3509a) obj;
            int i = c3509a.f9291b;
            if (i < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c3509a.f9291b);
            }
            int i2 = i - 1;
            c3509a.f9291b = i2;
            if (i2 == 0) {
                C3509a c3509a2 = (C3509a) this.f9288a.remove(str);
                if (!c3509a2.equals(c3509a)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c3509a + ", but actually removed: " + c3509a2 + ", safeKey: " + str);
                }
                this.f9289b.m6676b(c3509a2);
            }
        }
        c3509a.f9290a.unlock();
    }
}

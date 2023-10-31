package io.reactivex.rxjava3.android.schedulers;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import io.reactivex.rxjava3.core.AbstractC10154g;
import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.internal.disposables.EnumC10176b;
import io.reactivex.rxjava3.plugins.C10234a;
import java.util.concurrent.TimeUnit;

/* renamed from: io.reactivex.rxjava3.android.schedulers.c */
/* loaded from: classes3.dex */
public final class C10144c extends AbstractC10154g {

    /* renamed from: b */
    public final Handler f20400b;

    /* renamed from: c */
    public final boolean f20401c = true;

    /* renamed from: io.reactivex.rxjava3.android.schedulers.c$a */
    /* loaded from: classes3.dex */
    public static final class C10145a extends AbstractC10154g.AbstractC10157c {

        /* renamed from: a */
        public final Handler f20402a;

        /* renamed from: b */
        public final boolean f20403b;

        /* renamed from: c */
        public volatile boolean f20404c;

        public C10145a(Handler handler, boolean z) {
            this.f20402a = handler;
            this.f20403b = z;
        }

        @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
        /* renamed from: b */
        public final void mo49b() {
            this.f20404c = true;
            this.f20402a.removeCallbacksAndMessages(this);
        }

        @Override // io.reactivex.rxjava3.core.AbstractC10154g.AbstractC10157c
        @SuppressLint({"NewApi"})
        /* renamed from: c */
        public final InterfaceC10161b mo1194c(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable != null) {
                if (timeUnit != null) {
                    boolean z = this.f20404c;
                    EnumC10176b enumC10176b = EnumC10176b.INSTANCE;
                    if (z) {
                        return enumC10176b;
                    }
                    Handler handler = this.f20402a;
                    RunnableC10146b runnableC10146b = new RunnableC10146b(handler, runnable);
                    Message obtain = Message.obtain(handler, runnableC10146b);
                    obtain.obj = this;
                    if (this.f20403b) {
                        obtain.setAsynchronous(true);
                    }
                    this.f20402a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                    if (this.f20404c) {
                        this.f20402a.removeCallbacks(runnableC10146b);
                        return enumC10176b;
                    }
                    return runnableC10146b;
                }
                throw new NullPointerException("unit == null");
            }
            throw new NullPointerException("run == null");
        }
    }

    /* renamed from: io.reactivex.rxjava3.android.schedulers.c$b */
    /* loaded from: classes3.dex */
    public static final class RunnableC10146b implements Runnable, InterfaceC10161b {

        /* renamed from: a */
        public final Handler f20405a;

        /* renamed from: b */
        public final Runnable f20406b;

        public RunnableC10146b(Handler handler, Runnable runnable) {
            this.f20405a = handler;
            this.f20406b = runnable;
        }

        @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
        /* renamed from: b */
        public final void mo49b() {
            this.f20405a.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f20406b.run();
            } catch (Throwable th) {
                C10234a.m1188a(th);
            }
        }
    }

    public C10144c(Handler handler) {
        this.f20400b = handler;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC10154g
    /* renamed from: a */
    public final AbstractC10154g.AbstractC10157c mo1197a() {
        return new C10145a(this.f20400b, this.f20401c);
    }

    @Override // io.reactivex.rxjava3.core.AbstractC10154g
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public final InterfaceC10161b mo1195c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (timeUnit != null) {
            Handler handler = this.f20400b;
            RunnableC10146b runnableC10146b = new RunnableC10146b(handler, runnable);
            Message obtain = Message.obtain(handler, runnableC10146b);
            if (this.f20401c) {
                obtain.setAsynchronous(true);
            }
            handler.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            return runnableC10146b;
        }
        throw new NullPointerException("unit == null");
    }
}

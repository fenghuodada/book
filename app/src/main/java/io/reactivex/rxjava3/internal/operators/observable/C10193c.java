package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.AbstractC10151d;
import io.reactivex.rxjava3.core.AbstractC10154g;
import io.reactivex.rxjava3.core.InterfaceC10153f;
import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.internal.disposables.EnumC10175a;
import io.reactivex.rxjava3.internal.schedulers.C10206b;
import io.reactivex.rxjava3.internal.schedulers.C10226m;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.rxjava3.internal.operators.observable.c */
/* loaded from: classes3.dex */
public final class C10193c extends AbstractC10151d<Long> {

    /* renamed from: a */
    public final AbstractC10154g f20446a;

    /* renamed from: b */
    public final long f20447b;

    /* renamed from: c */
    public final long f20448c;

    /* renamed from: d */
    public final TimeUnit f20449d;

    /* renamed from: io.reactivex.rxjava3.internal.operators.observable.c$a */
    /* loaded from: classes3.dex */
    public static final class RunnableC10194a extends AtomicReference<InterfaceC10161b> implements InterfaceC10161b, Runnable {

        /* renamed from: a */
        public final InterfaceC10153f<? super Long> f20450a;

        /* renamed from: b */
        public long f20451b;

        public RunnableC10194a(InterfaceC10153f<? super Long> interfaceC10153f) {
            this.f20450a = interfaceC10153f;
        }

        @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
        /* renamed from: b */
        public final void mo49b() {
            EnumC10175a.m1212a(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (get() != EnumC10175a.f20431a) {
                long j = this.f20451b;
                this.f20451b = 1 + j;
                this.f20450a.mo46c(Long.valueOf(j));
            }
        }
    }

    public C10193c(long j, long j2, TimeUnit timeUnit, C10206b c10206b) {
        this.f20447b = j;
        this.f20448c = j2;
        this.f20449d = timeUnit;
        this.f20446a = c10206b;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC10151d
    /* renamed from: e */
    public final void mo48e(InterfaceC10153f<? super Long> interfaceC10153f) {
        RunnableC10194a runnableC10194a = new RunnableC10194a(interfaceC10153f);
        interfaceC10153f.mo47a(runnableC10194a);
        AbstractC10154g abstractC10154g = this.f20446a;
        if (abstractC10154g instanceof C10226m) {
            AbstractC10154g.AbstractC10157c mo1197a = abstractC10154g.mo1197a();
            EnumC10175a.m1211c(runnableC10194a, mo1197a);
            mo1197a.m1218f(runnableC10194a, this.f20447b, this.f20448c, this.f20449d);
            return;
        }
        EnumC10175a.m1211c(runnableC10194a, abstractC10154g.mo1198d(runnableC10194a, this.f20447b, this.f20448c, this.f20449d));
    }
}

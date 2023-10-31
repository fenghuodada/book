package io.reactivex.rxjava3.core;

import androidx.appcompat.view.menu.C0235r;
import io.reactivex.rxjava3.annotations.CheckReturnValue;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.exceptions.C10169b;
import io.reactivex.rxjava3.functions.InterfaceC10174b;
import io.reactivex.rxjava3.internal.observers.C10187b;
import io.reactivex.rxjava3.internal.operators.observable.C10193c;
import io.reactivex.rxjava3.internal.operators.observable.C10195d;
import io.reactivex.rxjava3.internal.operators.observable.C10199g;
import io.reactivex.rxjava3.internal.schedulers.C10206b;
import io.reactivex.rxjava3.plugins.C10234a;
import io.reactivex.rxjava3.schedulers.C10235a;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: io.reactivex.rxjava3.core.d */
/* loaded from: classes3.dex */
public abstract class AbstractC10151d<T> implements InterfaceC10152e<T> {
    @CheckReturnValue
    @NonNull
    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    /* renamed from: a */
    public static C10193c m1224a(@NonNull TimeUnit timeUnit) {
        C10206b c10206b = C10235a.f20569a;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(c10206b, "scheduler is null");
        return new C10193c(Math.max(0L, 1L), Math.max(0L, 1L), timeUnit, c10206b);
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport(SchedulerSupport.CUSTOM)
    /* renamed from: b */
    public final C10195d m1223b(@NonNull AbstractC10154g abstractC10154g) {
        int i = AbstractC10149b.f20409a;
        if (i > 0) {
            return new C10195d(this, abstractC10154g, i);
        }
        throw new IllegalArgumentException(C0235r.m12816a("bufferSize > 0 required but it was ", i));
    }

    @CheckReturnValue
    @NonNull
    @SchedulerSupport(SchedulerSupport.NONE)
    /* renamed from: c */
    public final InterfaceC10161b m1222c(@NonNull InterfaceC10174b<? super T> interfaceC10174b, @NonNull InterfaceC10174b<? super Throwable> interfaceC10174b2) {
        C10187b c10187b = new C10187b(interfaceC10174b, interfaceC10174b2);
        m1221d(c10187b);
        return c10187b;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    /* renamed from: d */
    public final void m1221d(@NonNull InterfaceC10153f<? super T> interfaceC10153f) {
        Objects.requireNonNull(interfaceC10153f, "observer is null");
        try {
            mo48e(interfaceC10153f);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C10169b.m1213a(th);
            C10234a.m1188a(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: e */
    public abstract void mo48e(@NonNull InterfaceC10153f<? super T> interfaceC10153f);

    @CheckReturnValue
    @NonNull
    @SchedulerSupport(SchedulerSupport.CUSTOM)
    /* renamed from: f */
    public final C10199g m1220f(@NonNull AbstractC10154g abstractC10154g) {
        Objects.requireNonNull(abstractC10154g, "scheduler is null");
        return new C10199g(this, abstractC10154g);
    }
}

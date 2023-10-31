package io.reactivex.rxjava3.internal.observers;

import io.reactivex.rxjava3.core.InterfaceC10153f;
import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.exceptions.C10164a;
import io.reactivex.rxjava3.exceptions.C10169b;
import io.reactivex.rxjava3.functions.InterfaceC10173a;
import io.reactivex.rxjava3.functions.InterfaceC10174b;
import io.reactivex.rxjava3.internal.disposables.EnumC10175a;
import io.reactivex.rxjava3.internal.functions.C10179a;
import io.reactivex.rxjava3.plugins.C10234a;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.rxjava3.internal.observers.b */
/* loaded from: classes3.dex */
public final class C10187b<T> extends AtomicReference<InterfaceC10161b> implements InterfaceC10153f<T>, InterfaceC10161b {

    /* renamed from: a */
    public final InterfaceC10174b<? super T> f20441a;

    /* renamed from: b */
    public final InterfaceC10174b<? super Throwable> f20442b;

    /* renamed from: c */
    public final InterfaceC10173a f20443c;

    /* renamed from: d */
    public final InterfaceC10174b<? super InterfaceC10161b> f20444d;

    public C10187b(InterfaceC10174b interfaceC10174b, InterfaceC10174b interfaceC10174b2) {
        C10179a.C10180a c10180a = C10179a.f20438b;
        C10179a.C10181b c10181b = C10179a.f20439c;
        this.f20441a = interfaceC10174b;
        this.f20442b = interfaceC10174b2;
        this.f20443c = c10180a;
        this.f20444d = c10181b;
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC10153f
    /* renamed from: a */
    public final void mo47a(InterfaceC10161b interfaceC10161b) {
        if (EnumC10175a.m1211c(this, interfaceC10161b)) {
            try {
                this.f20444d.accept(this);
            } catch (Throwable th) {
                C10169b.m1213a(th);
                interfaceC10161b.mo49b();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
    /* renamed from: b */
    public final void mo49b() {
        EnumC10175a.m1212a(this);
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC10153f
    /* renamed from: c */
    public final void mo46c(T t) {
        boolean z;
        if (get() == EnumC10175a.f20431a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                this.f20441a.accept(t);
            } catch (Throwable th) {
                C10169b.m1213a(th);
                get().mo49b();
                onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC10153f
    public final void onComplete() {
        boolean z;
        InterfaceC10161b interfaceC10161b = get();
        EnumC10175a enumC10175a = EnumC10175a.f20431a;
        if (interfaceC10161b == enumC10175a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            lazySet(enumC10175a);
            try {
                this.f20443c.getClass();
            } catch (Throwable th) {
                C10169b.m1213a(th);
                C10234a.m1188a(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC10153f
    public final void onError(Throwable th) {
        boolean z;
        InterfaceC10161b interfaceC10161b = get();
        EnumC10175a enumC10175a = EnumC10175a.f20431a;
        if (interfaceC10161b == enumC10175a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            lazySet(enumC10175a);
            try {
                this.f20442b.accept(th);
                return;
            } catch (Throwable th2) {
                C10169b.m1213a(th2);
                C10234a.m1188a(new C10164a(th, th2));
                return;
            }
        }
        C10234a.m1188a(th);
    }
}

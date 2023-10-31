package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.exceptions.C10170c;
import io.reactivex.rxjava3.functions.InterfaceC10173a;
import io.reactivex.rxjava3.functions.InterfaceC10174b;
import io.reactivex.rxjava3.plugins.C10234a;

/* renamed from: io.reactivex.rxjava3.internal.functions.a */
/* loaded from: classes3.dex */
public final class C10179a {

    /* renamed from: a */
    public static final RunnableC10182c f20437a = new RunnableC10182c();

    /* renamed from: b */
    public static final C10180a f20438b = new C10180a();

    /* renamed from: c */
    public static final C10181b f20439c = new C10181b();

    /* renamed from: d */
    public static final C10183d f20440d = new C10183d();

    /* renamed from: io.reactivex.rxjava3.internal.functions.a$a */
    /* loaded from: classes3.dex */
    public static final class C10180a implements InterfaceC10173a {
        public final String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: io.reactivex.rxjava3.internal.functions.a$b */
    /* loaded from: classes3.dex */
    public static final class C10181b implements InterfaceC10174b<Object> {
        @Override // io.reactivex.rxjava3.functions.InterfaceC10174b
        public final void accept(Object obj) {
        }

        public final String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: io.reactivex.rxjava3.internal.functions.a$c */
    /* loaded from: classes3.dex */
    public static final class RunnableC10182c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
        }

        public final String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: io.reactivex.rxjava3.internal.functions.a$d */
    /* loaded from: classes3.dex */
    public static final class C10183d implements InterfaceC10174b<Throwable> {
        @Override // io.reactivex.rxjava3.functions.InterfaceC10174b
        public final void accept(Throwable th) throws Throwable {
            C10234a.m1188a(new C10170c(th));
        }
    }
}

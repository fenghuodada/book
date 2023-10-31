package p060j$.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p060j$.util.concurrent.C10359u;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.Q */
/* loaded from: classes2.dex */
final class C10322Q implements Iterator, Consumer {

    /* renamed from: a */
    boolean f20727a = false;

    /* renamed from: b */
    Object f20728b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC10321P f20729c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10322Q(InterfaceC10321P interfaceC10321P) {
        this.f20729c = interfaceC10321P;
    }

    @Override // p060j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f20727a = true;
        this.f20728b = obj;
    }

    @Override // p060j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo532e(Consumer consumer) {
        consumer.getClass();
        return new C10359u(3, this, consumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f20727a) {
            this.f20729c.mo534a(this);
        }
        return this.f20727a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f20727a || hasNext()) {
            this.f20727a = false;
            return this.f20728b;
        }
        throw new NoSuchElementException();
    }
}

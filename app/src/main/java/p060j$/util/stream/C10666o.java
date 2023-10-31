package p060j$.util.stream;

import java.util.concurrent.atomic.AtomicBoolean;
import p060j$.util.concurrent.C10359u;
import p060j$.util.concurrent.ConcurrentHashMap;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10394L0;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10403Q;
import p060j$.util.function.InterfaceC10444n0;
import p060j$.util.function.InterfaceC10455t;

/* renamed from: j$.util.stream.o */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10666o implements Consumer, InterfaceC10400O0 {

    /* renamed from: a */
    public final /* synthetic */ int f21216a;

    /* renamed from: b */
    public final /* synthetic */ Object f21217b;

    /* renamed from: c */
    public final /* synthetic */ Object f21218c;

    public /* synthetic */ C10666o(int i, Object obj, Object obj2) {
        this.f21216a = i;
        this.f21217b = obj;
        this.f21218c = obj2;
    }

    @Override // p060j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f21216a;
        Object obj2 = this.f21218c;
        Object obj3 = this.f21217b;
        switch (i) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
                if (obj == null) {
                    atomicBoolean.set(true);
                    return;
                } else {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    return;
                }
            case 5:
                ((BiConsumer) obj3).accept(obj2, obj);
                return;
            default:
                ((C10630g3) obj3).m690j((Consumer) obj2, obj);
                return;
        }
    }

    @Override // p060j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo532e(Consumer consumer) {
        switch (this.f21216a) {
            case 0:
                consumer.getClass();
                return new C10359u(3, this, consumer);
            case 5:
                consumer.getClass();
                return new C10359u(3, this, consumer);
            default:
                consumer.getClass();
                return new C10359u(3, this, consumer);
        }
    }

    @Override // p060j$.util.function.InterfaceC10400O0
    public final Object get() {
        int i = this.f21216a;
        Object obj = this.f21218c;
        Object obj2 = this.f21217b;
        switch (i) {
            case 1:
                return new C10672p0((InterfaceC10403Q) obj, (EnumC10692t0) obj2);
            case 2:
                return new C10667o0((InterfaceC10394L0) obj, (EnumC10692t0) obj2);
            case 3:
                return new C10682r0((InterfaceC10455t) obj, (EnumC10692t0) obj2);
            default:
                return new C10677q0((InterfaceC10444n0) obj, (EnumC10692t0) obj2);
        }
    }
}

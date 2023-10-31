package p060j$.util.stream;

import java.util.LinkedHashSet;
import p060j$.util.C10469g;
import p060j$.util.C10471h;
import p060j$.util.C10472i;
import p060j$.util.C10474k;
import p060j$.util.C10475l;
import p060j$.util.C10476m;
import p060j$.util.Optional;
import p060j$.util.concurrent.C10359u;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.C10386H0;
import p060j$.util.function.C10388I0;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10372A0;
import p060j$.util.function.InterfaceC10378D0;
import p060j$.util.function.InterfaceC10383G;
import p060j$.util.function.InterfaceC10394L0;
import p060j$.util.function.InterfaceC10397N;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10424d0;
import p060j$.util.function.InterfaceC10435j;
import p060j$.util.function.InterfaceC10449q;
import p060j$.util.function.ToLongFunction;

/* renamed from: j$.util.stream.S1 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10566S1 implements InterfaceC10397N, ToLongFunction, Consumer, InterfaceC10400O0, BiConsumer, InterfaceC10435j, InterfaceC10449q, InterfaceC10372A0, InterfaceC10394L0, InterfaceC10383G, InterfaceC10378D0, InterfaceC10424d0 {

    /* renamed from: a */
    public final /* synthetic */ int f21070a;

    public /* synthetic */ C10566S1(int i) {
        this.f21070a = i;
    }

    @Override // p060j$.util.function.InterfaceC10394L0
    /* renamed from: a */
    public final InterfaceC10394L0 mo772a(InterfaceC10394L0 interfaceC10394L0) {
        switch (this.f21070a) {
            case 19:
                interfaceC10394L0.getClass();
                return new C10386H0(this, interfaceC10394L0, 0);
            case 20:
                interfaceC10394L0.getClass();
                return new C10386H0(this, interfaceC10394L0, 0);
            case 21:
                interfaceC10394L0.getClass();
                return new C10386H0(this, interfaceC10394L0, 0);
            default:
                interfaceC10394L0.getClass();
                return new C10386H0(this, interfaceC10394L0, 0);
        }
    }

    @Override // p060j$.util.function.Consumer
    public final void accept(Object obj) {
    }

    @Override // p060j$.util.function.InterfaceC10372A0
    public final void accept(Object obj, double d) {
        ((C10469g) obj).accept(d);
    }

    @Override // p060j$.util.function.InterfaceC10378D0
    public final void accept(Object obj, int i) {
        ((C10471h) obj).accept(i);
    }

    @Override // p060j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f21070a) {
            case 12:
                ((LinkedHashSet) obj).add(obj2);
                return;
            case 13:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                return;
            case 18:
                ((C10469g) obj).m848a((C10469g) obj2);
                return;
            default:
                ((C10471h) obj).m846a((C10471h) obj2);
                return;
        }
    }

    @Override // p060j$.util.function.InterfaceC10449q
    public final Object apply(double d) {
        return Double.valueOf(d);
    }

    @Override // p060j$.util.function.InterfaceC10397N
    public final Object apply(int i) {
        switch (this.f21070a) {
            case 0:
                return new Object[i];
            case 1:
            default:
                return Integer.valueOf(i);
            case 2:
                return new Object[i];
            case 3:
                return new Integer[i];
            case 4:
                return new Long[i];
            case 5:
                return new Double[i];
        }
    }

    @Override // p060j$.util.function.InterfaceC10435j
    public final double applyAsDouble(double d, double d2) {
        switch (this.f21070a) {
            case 14:
                return Math.min(d, d2);
            default:
                return Math.max(d, d2);
        }
    }

    @Override // p060j$.util.function.InterfaceC10383G
    public final int applyAsInt(int i, int i2) {
        switch (this.f21070a) {
            case 23:
                return Math.min(i, i2);
            case 24:
                return i + i2;
            default:
                return Math.max(i, i2);
        }
    }

    @Override // p060j$.util.function.InterfaceC10424d0
    public final long applyAsLong(long j, long j2) {
        return Math.min(j, j2);
    }

    @Override // p060j$.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return 1L;
    }

    @Override // p060j$.util.function.InterfaceC10394L0
    /* renamed from: b */
    public final InterfaceC10394L0 mo771b(InterfaceC10394L0 interfaceC10394L0) {
        switch (this.f21070a) {
            case 19:
                interfaceC10394L0.getClass();
                return new C10386H0(this, interfaceC10394L0, 1);
            case 20:
                interfaceC10394L0.getClass();
                return new C10386H0(this, interfaceC10394L0, 1);
            case 21:
                interfaceC10394L0.getClass();
                return new C10386H0(this, interfaceC10394L0, 1);
            default:
                interfaceC10394L0.getClass();
                return new C10386H0(this, interfaceC10394L0, 1);
        }
    }

    @Override // p060j$.util.function.BiConsumer
    /* renamed from: c */
    public final BiConsumer mo692c(BiConsumer biConsumer) {
        switch (this.f21070a) {
            case 12:
                biConsumer.getClass();
                return new C10359u(1, this, biConsumer);
            case 13:
                biConsumer.getClass();
                return new C10359u(1, this, biConsumer);
            case 18:
                biConsumer.getClass();
                return new C10359u(1, this, biConsumer);
            default:
                biConsumer.getClass();
                return new C10359u(1, this, biConsumer);
        }
    }

    @Override // p060j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo532e(Consumer consumer) {
        switch (this.f21070a) {
            case 6:
                consumer.getClass();
                return new C10359u(3, this, consumer);
            default:
                consumer.getClass();
                return new C10359u(3, this, consumer);
        }
    }

    @Override // p060j$.util.function.InterfaceC10400O0
    public final Object get() {
        switch (this.f21070a) {
            case 8:
                return new C10469g();
            case 9:
                return new C10471h();
            case 10:
                return new C10472i();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // p060j$.util.function.InterfaceC10394L0
    public final InterfaceC10394L0 negate() {
        switch (this.f21070a) {
            case 19:
                return new C10388I0(this);
            case 20:
                return new C10388I0(this);
            case 21:
                return new C10388I0(this);
            default:
                return new C10388I0(this);
        }
    }

    @Override // p060j$.util.function.InterfaceC10394L0
    public final boolean test(Object obj) {
        switch (this.f21070a) {
            case 19:
                return ((C10474k) obj).m834c();
            case 20:
                return ((C10476m) obj).m826c();
            case 21:
                return ((Optional) obj).m1025c();
            default:
                return ((C10475l) obj).m830c();
        }
    }
}

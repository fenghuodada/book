package p060j$.util.stream;

import java.util.Comparator;
import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10321P;
import p060j$.util.concurrent.C10359u;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.stream.A3 */
/* loaded from: classes2.dex */
final class C10487A3 extends AbstractC10497C3 implements InterfaceC10321P, Consumer {

    /* renamed from: e */
    Object f20957e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10487A3(InterfaceC10321P interfaceC10321P, long j, long j2) {
        super(interfaceC10321P, j, j2);
    }

    C10487A3(InterfaceC10321P interfaceC10321P, C10487A3 c10487a3) {
        super(interfaceC10321P, c10487a3);
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final boolean mo534a(Consumer consumer) {
        consumer.getClass();
        while (m819t() != EnumC10492B3.NO_MORE && this.f20967a.mo534a(this)) {
            if (m820r(1L) == 1) {
                consumer.accept(this.f20957e);
                this.f20957e = null;
                return true;
            }
        }
        return false;
    }

    @Override // p060j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f20957e = obj;
    }

    @Override // p060j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo532e(Consumer consumer) {
        consumer.getClass();
        return new C10359u(3, this, consumer);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        C10620e3 c10620e3 = null;
        while (true) {
            EnumC10492B3 m819t = m819t();
            if (m819t == EnumC10492B3.NO_MORE) {
                return;
            }
            EnumC10492B3 enumC10492B3 = EnumC10492B3.MAYBE_MORE;
            InterfaceC10321P interfaceC10321P = this.f20967a;
            if (m819t != enumC10492B3) {
                interfaceC10321P.forEachRemaining(consumer);
                return;
            }
            if (c10620e3 == null) {
                c10620e3 = new C10620e3();
            } else {
                c10620e3.f21171a = 0;
            }
            long j = 0;
            while (interfaceC10321P.mo534a(c10620e3)) {
                j++;
                if (j >= 128) {
                    break;
                }
            }
            if (j == 0) {
                return;
            }
            long m820r = m820r(j);
            for (int i = 0; i < m820r; i++) {
                consumer.accept(c10620e3.f21162b[i]);
            }
        }
    }

    @Override // p060j$.util.InterfaceC10321P
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC10331a.m1013i(this);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC10331a.m1012j(this, i);
    }

    @Override // p060j$.util.stream.AbstractC10497C3
    /* renamed from: s */
    protected final InterfaceC10321P mo533s(InterfaceC10321P interfaceC10321P) {
        return new C10487A3(interfaceC10321P, this);
    }
}

package p060j$.util.stream;

import java.util.Comparator;
import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10318M;
import p060j$.util.InterfaceC10321P;

/* renamed from: j$.util.stream.z3 */
/* loaded from: classes2.dex */
abstract class AbstractC10725z3 extends AbstractC10497C3 implements InterfaceC10318M {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10725z3(InterfaceC10318M interfaceC10318M, long j, long j2) {
        super(interfaceC10318M, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10725z3(InterfaceC10318M interfaceC10318M, AbstractC10725z3 abstractC10725z3) {
        super(interfaceC10318M, abstractC10725z3);
    }

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: forEachRemaining */
    public final void m522d(Object obj) {
        obj.getClass();
        AbstractC10615d3 abstractC10615d3 = null;
        while (true) {
            EnumC10492B3 m819t = m819t();
            if (m819t == EnumC10492B3.NO_MORE) {
                return;
            }
            EnumC10492B3 enumC10492B3 = EnumC10492B3.MAYBE_MORE;
            InterfaceC10321P interfaceC10321P = this.f20967a;
            if (m819t != enumC10492B3) {
                ((InterfaceC10318M) interfaceC10321P).forEachRemaining(obj);
                return;
            }
            if (abstractC10615d3 == null) {
                abstractC10615d3 = mo517v();
            } else {
                abstractC10615d3.f21155b = 0;
            }
            long j = 0;
            while (((InterfaceC10318M) interfaceC10321P).tryAdvance(abstractC10615d3)) {
                j++;
                if (j >= 128) {
                    break;
                }
            }
            if (j == 0) {
                return;
            }
            abstractC10615d3.mo697a(obj, m820r(j));
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

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: tryAdvance */
    public final boolean m519p(Object obj) {
        obj.getClass();
        while (m819t() != EnumC10492B3.NO_MORE && ((InterfaceC10318M) this.f20967a).tryAdvance(this)) {
            if (m820r(1L) == 1) {
                mo518u(obj);
                return true;
            }
        }
        return false;
    }

    /* renamed from: u */
    protected abstract void mo518u(Object obj);

    /* renamed from: v */
    protected abstract AbstractC10615d3 mo517v();
}

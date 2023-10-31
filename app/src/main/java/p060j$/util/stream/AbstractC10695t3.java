package p060j$.util.stream;

import java.util.Comparator;
import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10318M;

/* renamed from: j$.util.stream.t3 */
/* loaded from: classes2.dex */
abstract class AbstractC10695t3 extends AbstractC10705v3 implements InterfaceC10318M {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10695t3(InterfaceC10318M interfaceC10318M, long j, long j2) {
        super(interfaceC10318M, j, j2, 0L, Math.min(interfaceC10318M.estimateSize(), j2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10695t3(InterfaceC10318M interfaceC10318M, long j, long j2, long j3, long j4) {
        super(interfaceC10318M, j, j2, j3, j4);
    }

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: forEachRemaining */
    public final void m611d(Object obj) {
        obj.getClass();
        long j = this.f21285e;
        long j2 = this.f21281a;
        if (j2 >= j) {
            return;
        }
        long j3 = this.f21284d;
        if (j3 >= j) {
            return;
        }
        if (j3 >= j2 && ((InterfaceC10318M) this.f21283c).estimateSize() + j3 <= this.f21282b) {
            ((InterfaceC10318M) this.f21283c).forEachRemaining(obj);
            this.f21284d = this.f21285e;
            return;
        }
        while (j2 > this.f21284d) {
            ((InterfaceC10318M) this.f21283c).tryAdvance(mo609g());
            this.f21284d++;
        }
        while (this.f21284d < this.f21285e) {
            ((InterfaceC10318M) this.f21283c).tryAdvance(obj);
            this.f21284d++;
        }
    }

    /* renamed from: g */
    protected abstract Object mo609g();

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
    public final boolean m607p(Object obj) {
        long j;
        obj.getClass();
        long j2 = this.f21285e;
        long j3 = this.f21281a;
        if (j3 >= j2) {
            return false;
        }
        while (true) {
            j = this.f21284d;
            if (j3 <= j) {
                break;
            }
            ((InterfaceC10318M) this.f21283c).tryAdvance(mo609g());
            this.f21284d++;
        }
        if (j >= this.f21285e) {
            return false;
        }
        this.f21284d = j + 1;
        return ((InterfaceC10318M) this.f21283c).tryAdvance(obj);
    }
}

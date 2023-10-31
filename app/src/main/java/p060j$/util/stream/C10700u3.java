package p060j$.util.stream;

import java.util.Comparator;
import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u3 */
/* loaded from: classes2.dex */
public final class C10700u3 extends AbstractC10705v3 implements InterfaceC10321P {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C10700u3(InterfaceC10321P interfaceC10321P, long j, long j2) {
        super(interfaceC10321P, j, j2, 0L, Math.min(interfaceC10321P.estimateSize(), j2));
    }

    private C10700u3(InterfaceC10321P interfaceC10321P, long j, long j2, long j3, long j4) {
        super(interfaceC10321P, j, j2, j3, j4);
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final boolean mo534a(Consumer consumer) {
        long j;
        consumer.getClass();
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
            this.f21283c.mo534a(new C10566S1(7));
            this.f21284d++;
        }
        if (j >= this.f21285e) {
            return false;
        }
        this.f21284d = j + 1;
        return this.f21283c.mo534a(consumer);
    }

    @Override // p060j$.util.stream.AbstractC10705v3
    /* renamed from: e */
    protected final InterfaceC10321P mo601e(InterfaceC10321P interfaceC10321P, long j, long j2, long j3, long j4) {
        return new C10700u3(interfaceC10321P, j, j2, j3, j4);
    }

    @Override // p060j$.util.InterfaceC10321P
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        long j = this.f21285e;
        long j2 = this.f21281a;
        if (j2 >= j) {
            return;
        }
        long j3 = this.f21284d;
        if (j3 >= j) {
            return;
        }
        if (j3 >= j2 && this.f21283c.estimateSize() + j3 <= this.f21282b) {
            this.f21283c.forEachRemaining(consumer);
            this.f21284d = this.f21285e;
            return;
        }
        while (j2 > this.f21284d) {
            this.f21283c.mo534a(new C10566S1(6));
            this.f21284d++;
        }
        while (this.f21284d < this.f21285e) {
            this.f21283c.mo534a(consumer);
            this.f21284d++;
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
}

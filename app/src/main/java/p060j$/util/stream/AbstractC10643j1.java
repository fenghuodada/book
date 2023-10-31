package p060j$.util.stream;

import java.util.ArrayDeque;
import java.util.Comparator;
import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10309D;
import p060j$.util.InterfaceC10312G;
import p060j$.util.InterfaceC10315J;
import p060j$.util.InterfaceC10318M;
import p060j$.util.InterfaceC10321P;

/* renamed from: j$.util.stream.j1 */
/* loaded from: classes2.dex */
abstract class AbstractC10643j1 implements InterfaceC10321P {

    /* renamed from: a */
    InterfaceC10509F0 f21186a;

    /* renamed from: b */
    int f21187b;

    /* renamed from: c */
    InterfaceC10321P f21188c;

    /* renamed from: d */
    InterfaceC10321P f21189d;

    /* renamed from: e */
    ArrayDeque f21190e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10643j1(InterfaceC10509F0 interfaceC10509F0) {
        this.f21186a = interfaceC10509F0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static InterfaceC10509F0 m679e(ArrayDeque arrayDeque) {
        while (true) {
            InterfaceC10509F0 interfaceC10509F0 = (InterfaceC10509F0) arrayDeque.pollFirst();
            if (interfaceC10509F0 == null) {
                return null;
            }
            if (interfaceC10509F0.mo618p() != 0) {
                int mo618p = interfaceC10509F0.mo618p();
                while (true) {
                    mo618p--;
                    if (mo618p >= 0) {
                        arrayDeque.addFirst(interfaceC10509F0.mo620b(mo618p));
                    }
                }
            } else if (interfaceC10509F0.count() > 0) {
                return interfaceC10509F0;
            }
        }
    }

    @Override // p060j$.util.InterfaceC10321P
    public final int characteristics() {
        return 64;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final long estimateSize() {
        long j = 0;
        if (this.f21186a == null) {
            return 0L;
        }
        InterfaceC10321P interfaceC10321P = this.f21188c;
        if (interfaceC10321P != null) {
            return interfaceC10321P.estimateSize();
        }
        for (int i = this.f21187b; i < this.f21186a.mo618p(); i++) {
            j += this.f21186a.mo620b(i).count();
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final ArrayDeque m678g() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int mo618p = this.f21186a.mo618p();
        while (true) {
            mo618p--;
            if (mo618p < this.f21187b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f21186a.mo620b(mo618p));
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

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean m677h() {
        if (this.f21186a == null) {
            return false;
        }
        if (this.f21189d == null) {
            InterfaceC10321P interfaceC10321P = this.f21188c;
            if (interfaceC10321P == null) {
                ArrayDeque m678g = m678g();
                this.f21190e = m678g;
                InterfaceC10509F0 m679e = m679e(m678g);
                if (m679e == null) {
                    this.f21186a = null;
                    return false;
                }
                interfaceC10321P = m679e.spliterator();
            }
            this.f21189d = interfaceC10321P;
            return true;
        }
        return true;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC10331a.m1012j(this, i);
    }

    @Override // p060j$.util.InterfaceC10321P
    public /* bridge */ /* synthetic */ InterfaceC10309D trySplit() {
        return (InterfaceC10309D) trySplit();
    }

    @Override // p060j$.util.InterfaceC10321P
    public /* bridge */ /* synthetic */ InterfaceC10312G trySplit() {
        return (InterfaceC10312G) trySplit();
    }

    @Override // p060j$.util.InterfaceC10321P
    public /* bridge */ /* synthetic */ InterfaceC10315J trySplit() {
        return (InterfaceC10315J) trySplit();
    }

    @Override // p060j$.util.InterfaceC10321P
    public /* bridge */ /* synthetic */ InterfaceC10318M trySplit() {
        return (InterfaceC10318M) trySplit();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final InterfaceC10321P trySplit() {
        InterfaceC10509F0 interfaceC10509F0 = this.f21186a;
        if (interfaceC10509F0 == null || this.f21189d != null) {
            return null;
        }
        InterfaceC10321P interfaceC10321P = this.f21188c;
        if (interfaceC10321P != null) {
            return interfaceC10321P.trySplit();
        }
        if (this.f21187b < interfaceC10509F0.mo618p() - 1) {
            InterfaceC10509F0 interfaceC10509F02 = this.f21186a;
            int i = this.f21187b;
            this.f21187b = i + 1;
            return interfaceC10509F02.mo620b(i).spliterator();
        }
        InterfaceC10509F0 mo620b = this.f21186a.mo620b(this.f21187b);
        this.f21186a = mo620b;
        if (mo620b.mo618p() == 0) {
            InterfaceC10321P spliterator = this.f21186a.spliterator();
            this.f21188c = spliterator;
            return spliterator.trySplit();
        }
        InterfaceC10509F0 interfaceC10509F03 = this.f21186a;
        this.f21187b = 0 + 1;
        return interfaceC10509F03.mo620b(0).spliterator();
    }
}

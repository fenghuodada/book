package p060j$.util.stream;

import java.util.Comparator;
import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10309D;
import p060j$.util.InterfaceC10312G;
import p060j$.util.InterfaceC10315J;
import p060j$.util.InterfaceC10318M;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.P2 */
/* loaded from: classes2.dex */
public abstract class AbstractC10556P2 implements InterfaceC10318M {

    /* renamed from: a */
    int f21054a;

    /* renamed from: b */
    final int f21055b;

    /* renamed from: c */
    int f21056c;

    /* renamed from: d */
    final int f21057d;

    /* renamed from: e */
    Object f21058e;

    /* renamed from: f */
    final /* synthetic */ AbstractC10560Q2 f21059f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10556P2(AbstractC10560Q2 abstractC10560Q2, int i, int i2, int i3, int i4) {
        this.f21059f = abstractC10560Q2;
        this.f21054a = i;
        this.f21055b = i2;
        this.f21056c = i3;
        this.f21057d = i4;
        Object[] objArr = abstractC10560Q2.f21063f;
        this.f21058e = objArr == null ? abstractC10560Q2.f21062e : objArr[i];
    }

    @Override // p060j$.util.InterfaceC10321P
    public final int characteristics() {
        return 16464;
    }

    /* renamed from: e */
    abstract void mo786e(int i, Object obj, Object obj2);

    @Override // p060j$.util.InterfaceC10321P
    public final long estimateSize() {
        int i = this.f21054a;
        int i2 = this.f21057d;
        int i3 = this.f21055b;
        if (i == i3) {
            return i2 - this.f21056c;
        }
        long[] jArr = this.f21059f.f21159d;
        return ((jArr[i3] + i2) - jArr[i]) - this.f21056c;
    }

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: forEachRemaining */
    public final void m787d(Object obj) {
        AbstractC10560Q2 abstractC10560Q2;
        obj.getClass();
        int i = this.f21054a;
        int i2 = this.f21057d;
        int i3 = this.f21055b;
        if (i < i3 || (i == i3 && this.f21056c < i2)) {
            int i4 = this.f21056c;
            while (true) {
                abstractC10560Q2 = this.f21059f;
                if (i >= i3) {
                    break;
                }
                Object obj2 = abstractC10560Q2.f21063f[i];
                abstractC10560Q2.mo780t(obj2, i4, abstractC10560Q2.mo779u(obj2), obj);
                i++;
                i4 = 0;
            }
            abstractC10560Q2.mo780t(this.f21054a == i3 ? this.f21058e : abstractC10560Q2.f21063f[i3], i4, i2, obj);
            this.f21054a = i3;
            this.f21056c = i2;
        }
    }

    /* renamed from: g */
    abstract InterfaceC10318M mo784g(Object obj, int i, int i2);

    @Override // p060j$.util.InterfaceC10321P
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC10331a.m1013i(this);
    }

    /* renamed from: h */
    abstract InterfaceC10318M mo783h(int i, int i2, int i3, int i4);

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC10331a.m1012j(this, i);
    }

    @Override // p060j$.util.InterfaceC10318M
    /* renamed from: tryAdvance */
    public final boolean m781p(Object obj) {
        obj.getClass();
        int i = this.f21054a;
        int i2 = this.f21055b;
        if (i < i2 || (i == i2 && this.f21056c < this.f21057d)) {
            Object obj2 = this.f21058e;
            int i3 = this.f21056c;
            this.f21056c = i3 + 1;
            mo786e(i3, obj2, obj);
            int i4 = this.f21056c;
            Object obj3 = this.f21058e;
            AbstractC10560Q2 abstractC10560Q2 = this.f21059f;
            if (i4 == abstractC10560Q2.mo779u(obj3)) {
                this.f21056c = 0;
                int i5 = this.f21054a + 1;
                this.f21054a = i5;
                Object[] objArr = abstractC10560Q2.f21063f;
                if (objArr != null && i5 <= i2) {
                    this.f21058e = objArr[i5];
                }
            }
            return true;
        }
        return false;
    }

    @Override // p060j$.util.InterfaceC10318M, p060j$.util.InterfaceC10321P
    public /* bridge */ /* synthetic */ InterfaceC10309D trySplit() {
        return (InterfaceC10309D) trySplit();
    }

    @Override // p060j$.util.InterfaceC10318M, p060j$.util.InterfaceC10321P
    public /* bridge */ /* synthetic */ InterfaceC10312G trySplit() {
        return (InterfaceC10312G) trySplit();
    }

    @Override // p060j$.util.InterfaceC10318M, p060j$.util.InterfaceC10321P
    public /* bridge */ /* synthetic */ InterfaceC10315J trySplit() {
        return (InterfaceC10315J) trySplit();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final InterfaceC10318M trySplit() {
        int i = this.f21054a;
        int i2 = this.f21055b;
        if (i < i2) {
            int i3 = this.f21056c;
            AbstractC10560Q2 abstractC10560Q2 = this.f21059f;
            InterfaceC10318M mo783h = mo783h(i, i2 - 1, i3, abstractC10560Q2.mo779u(abstractC10560Q2.f21063f[i2 - 1]));
            this.f21054a = i2;
            this.f21056c = 0;
            this.f21058e = abstractC10560Q2.f21063f[i2];
            return mo783h;
        } else if (i == i2) {
            int i4 = this.f21056c;
            int i5 = (this.f21057d - i4) / 2;
            if (i5 == 0) {
                return null;
            }
            InterfaceC10318M mo784g = mo784g(this.f21058e, i4, i5);
            this.f21056c += i5;
            return mo784g;
        } else {
            return null;
        }
    }
}

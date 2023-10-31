package p060j$.util.concurrent;

import java.util.Comparator;
import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.k */
/* loaded from: classes2.dex */
public final class C10349k extends C10355q implements InterfaceC10321P {

    /* renamed from: i */
    public final /* synthetic */ int f20797i;

    /* renamed from: j */
    long f20798j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10349k(C10351m[] c10351mArr, int i, int i2, int i3, long j, int i4) {
        super(c10351mArr, i, i2, i3);
        this.f20797i = i4;
        this.f20798j = j;
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final boolean mo534a(Consumer consumer) {
        switch (this.f20797i) {
            case 0:
                consumer.getClass();
                C10351m m967e = m967e();
                if (m967e == null) {
                    return false;
                }
                consumer.accept(m967e.f20803b);
                return true;
            default:
                consumer.getClass();
                C10351m m967e2 = m967e();
                if (m967e2 == null) {
                    return false;
                }
                consumer.accept(m967e2.f20804c);
                return true;
        }
    }

    @Override // p060j$.util.InterfaceC10321P
    public final int characteristics() {
        switch (this.f20797i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // p060j$.util.InterfaceC10321P
    public final long estimateSize() {
        switch (this.f20797i) {
            case 0:
                return this.f20798j;
            default:
                return this.f20798j;
        }
    }

    @Override // p060j$.util.InterfaceC10321P
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f20797i) {
            case 0:
                consumer.getClass();
                while (true) {
                    C10351m m967e = m967e();
                    if (m967e == null) {
                        return;
                    }
                    consumer.accept(m967e.f20803b);
                }
            default:
                consumer.getClass();
                while (true) {
                    C10351m m967e2 = m967e();
                    if (m967e2 == null) {
                        return;
                    }
                    consumer.accept(m967e2.f20804c);
                }
        }
    }

    @Override // p060j$.util.InterfaceC10321P
    public final Comparator getComparator() {
        switch (this.f20797i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f20797i) {
            case 0:
                return AbstractC10331a.m1013i(this);
            default:
                return AbstractC10331a.m1013i(this);
        }
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        switch (this.f20797i) {
            case 0:
                return AbstractC10331a.m1012j(this, i);
            default:
                return AbstractC10331a.m1012j(this, i);
        }
    }

    @Override // p060j$.util.InterfaceC10321P
    public final InterfaceC10321P trySplit() {
        switch (this.f20797i) {
            case 0:
                int i = this.f20815f;
                int i2 = this.f20816g;
                int i3 = (i + i2) >>> 1;
                if (i3 <= i) {
                    return null;
                }
                C10351m[] c10351mArr = this.f20810a;
                int i4 = this.f20817h;
                this.f20816g = i3;
                long j = this.f20798j >>> 1;
                this.f20798j = j;
                return new C10349k(c10351mArr, i4, i3, i2, j, 0);
            default:
                int i5 = this.f20815f;
                int i6 = this.f20816g;
                int i7 = (i5 + i6) >>> 1;
                if (i7 <= i5) {
                    return null;
                }
                C10351m[] c10351mArr2 = this.f20810a;
                int i8 = this.f20817h;
                this.f20816g = i7;
                long j2 = this.f20798j >>> 1;
                this.f20798j = j2;
                return new C10349k(c10351mArr2, i8, i7, i6, j2, 1);
        }
    }
}

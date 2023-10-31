package p060j$.util.stream;

import java.util.Comparator;
import p060j$.util.AbstractC10331a;
import p060j$.util.AbstractC10368e0;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.I2 */
/* loaded from: classes2.dex */
public final class C10526I2 implements InterfaceC10321P {

    /* renamed from: a */
    int f21014a;

    /* renamed from: b */
    final int f21015b;

    /* renamed from: c */
    int f21016c;

    /* renamed from: d */
    final int f21017d;

    /* renamed from: e */
    Object[] f21018e;

    /* renamed from: f */
    final /* synthetic */ C10563R2 f21019f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10526I2(C10563R2 c10563r2, int i, int i2, int i3, int i4) {
        this.f21019f = c10563r2;
        this.f21014a = i;
        this.f21015b = i2;
        this.f21016c = i3;
        this.f21017d = i4;
        Object[][] objArr = c10563r2.f21066f;
        this.f21018e = objArr == null ? c10563r2.f21065e : objArr[i];
    }

    @Override // p060j$.util.InterfaceC10321P
    /* renamed from: a */
    public final boolean mo534a(Consumer consumer) {
        consumer.getClass();
        int i = this.f21014a;
        int i2 = this.f21015b;
        if (i < i2 || (i == i2 && this.f21016c < this.f21017d)) {
            Object[] objArr = this.f21018e;
            int i3 = this.f21016c;
            this.f21016c = i3 + 1;
            consumer.accept(objArr[i3]);
            if (this.f21016c == this.f21018e.length) {
                this.f21016c = 0;
                int i4 = this.f21014a + 1;
                this.f21014a = i4;
                Object[][] objArr2 = this.f21019f.f21066f;
                if (objArr2 != null && i4 <= i2) {
                    this.f21018e = objArr2[i4];
                }
            }
            return true;
        }
        return false;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final int characteristics() {
        return 16464;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final long estimateSize() {
        int i = this.f21014a;
        int i2 = this.f21017d;
        int i3 = this.f21015b;
        if (i == i3) {
            return i2 - this.f21016c;
        }
        long[] jArr = this.f21019f.f21159d;
        return ((jArr[i3] + i2) - jArr[i]) - this.f21016c;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final void forEachRemaining(Consumer consumer) {
        C10563R2 c10563r2;
        consumer.getClass();
        int i = this.f21014a;
        int i2 = this.f21017d;
        int i3 = this.f21015b;
        if (i < i3 || (i == i3 && this.f21016c < i2)) {
            int i4 = this.f21016c;
            while (true) {
                c10563r2 = this.f21019f;
                if (i >= i3) {
                    break;
                }
                Object[] objArr = c10563r2.f21066f[i];
                while (i4 < objArr.length) {
                    consumer.accept(objArr[i4]);
                    i4++;
                }
                i++;
                i4 = 0;
            }
            Object[] objArr2 = this.f21014a == i3 ? this.f21018e : c10563r2.f21066f[i3];
            while (i4 < i2) {
                consumer.accept(objArr2[i4]);
                i4++;
            }
            this.f21014a = i3;
            this.f21016c = i2;
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

    @Override // p060j$.util.InterfaceC10321P
    public final InterfaceC10321P trySplit() {
        int i = this.f21014a;
        int i2 = this.f21015b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.f21016c;
            C10563R2 c10563r2 = this.f21019f;
            C10526I2 c10526i2 = new C10526I2(c10563r2, i, i3, i4, c10563r2.f21066f[i3].length);
            this.f21014a = i2;
            this.f21016c = 0;
            this.f21018e = c10563r2.f21066f[i2];
            return c10526i2;
        } else if (i == i2) {
            int i5 = this.f21016c;
            int i6 = (this.f21017d - i5) / 2;
            if (i6 == 0) {
                return null;
            }
            InterfaceC10321P m937m = AbstractC10368e0.m937m(this.f21018e, i5, i5 + i6);
            this.f21016c += i6;
            return m937m;
        } else {
            return null;
        }
    }
}

package p060j$.util.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import p060j$.util.AbstractC10368e0;
import p060j$.util.C10320O;
import p060j$.util.InterfaceC10321P;
import p060j$.util.concurrent.C10359u;
import p060j$.util.function.Consumer;

/* renamed from: j$.util.stream.R2 */
/* loaded from: classes2.dex */
class C10563R2 extends AbstractC10616e implements Consumer, Iterable {

    /* renamed from: e */
    protected Object[] f21065e = new Object[1 << 4];

    /* renamed from: f */
    protected Object[][] f21066f;

    /* renamed from: a */
    public void mo621a(Consumer consumer) {
        for (int i = 0; i < this.f21158c; i++) {
            for (Object obj : this.f21066f[i]) {
                consumer.accept(obj);
            }
        }
        for (int i2 = 0; i2 < this.f21157b; i2++) {
            consumer.accept(this.f21065e[i2]);
        }
    }

    @Override // p060j$.util.function.Consumer
    public void accept(Object obj) {
        long length;
        int i = this.f21157b;
        Object[] objArr = this.f21065e;
        if (i == objArr.length) {
            if (this.f21066f == null) {
                Object[][] objArr2 = new Object[8];
                this.f21066f = objArr2;
                this.f21159d = new long[8];
                objArr2[0] = objArr;
            }
            int i2 = this.f21158c;
            int i3 = i2 + 1;
            Object[][] objArr3 = this.f21066f;
            if (i3 >= objArr3.length || objArr3[i3] == null) {
                if (i2 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr3[i2].length + this.f21159d[i2];
                }
                m774t(length + 1);
            }
            this.f21157b = 0;
            int i4 = this.f21158c + 1;
            this.f21158c = i4;
            this.f21065e = this.f21066f[i4];
        }
        Object[] objArr4 = this.f21065e;
        int i5 = this.f21157b;
        this.f21157b = i5 + 1;
        objArr4[i5] = obj;
    }

    @Override // p060j$.util.stream.AbstractC10616e
    public final void clear() {
        Object[][] objArr = this.f21066f;
        if (objArr != null) {
            this.f21065e = objArr[0];
            int i = 0;
            while (true) {
                Object[] objArr2 = this.f21065e;
                if (i >= objArr2.length) {
                    break;
                }
                objArr2[i] = null;
                i++;
            }
            this.f21066f = null;
            this.f21159d = null;
        } else {
            for (int i2 = 0; i2 < this.f21157b; i2++) {
                this.f21065e[i2] = null;
            }
        }
        this.f21157b = 0;
        this.f21158c = 0;
    }

    @Override // p060j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo532e(Consumer consumer) {
        consumer.getClass();
        return new C10359u(3, this, consumer);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        mo621a(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC10368e0.m941i(spliterator());
    }

    @Override // java.lang.Iterable
    public InterfaceC10321P spliterator() {
        return new C10526I2(this, 0, this.f21158c, 0, this.f21157b);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C10320O.m1028a(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final void m774t(long j) {
        long length;
        Object[][] objArr;
        int i;
        int i2 = this.f21158c;
        if (i2 == 0) {
            length = this.f21065e.length;
        } else {
            length = this.f21066f[i2].length + this.f21159d[i2];
        }
        if (j <= length) {
            return;
        }
        if (this.f21066f == null) {
            Object[][] objArr2 = new Object[8];
            this.f21066f = objArr2;
            this.f21159d = new long[8];
            objArr2[0] = this.f21065e;
        }
        while (true) {
            i2++;
            if (j <= length) {
                return;
            }
            Object[][] objArr3 = this.f21066f;
            if (i2 >= objArr3.length) {
                int length2 = objArr3.length * 2;
                this.f21066f = (Object[][]) Arrays.copyOf(objArr3, length2);
                this.f21159d = Arrays.copyOf(this.f21159d, length2);
            }
            int i3 = this.f21156a;
            if (i2 != 0 && i2 != 1) {
                i3 = Math.min((i3 + i2) - 1, 30);
            }
            int i4 = 1 << i3;
            this.f21066f[i2] = new Object[i4];
            long[] jArr = this.f21159d;
            jArr[i2] = jArr[i2 - 1] + objArr[i].length;
            length += i4;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        mo621a(new C10596a(arrayList, 8));
        return "SpinedBuffer:" + arrayList.toString();
    }
}

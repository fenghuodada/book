package p060j$.util.stream;

import java.util.Arrays;
import java.util.Spliterator;
import p060j$.util.C10320O;
import p060j$.util.InterfaceC10321P;

/* renamed from: j$.util.stream.Q2 */
/* loaded from: classes2.dex */
abstract class AbstractC10560Q2 extends AbstractC10616e implements Iterable {

    /* renamed from: e */
    Object f21062e;

    /* renamed from: f */
    Object[] f21063f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10560Q2() {
        this.f21062e = newArray(16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10560Q2(int i) {
        super(i);
        this.f21062e = newArray(1 << this.f21156a);
    }

    /* renamed from: c */
    public Object mo655c() {
        long count = count();
        if (count < 2147483639) {
            Object newArray = newArray((int) count);
            mo654d(newArray, 0);
            return newArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // p060j$.util.stream.AbstractC10616e
    public final void clear() {
        Object[] objArr = this.f21063f;
        if (objArr != null) {
            this.f21062e = objArr[0];
            this.f21063f = null;
            this.f21159d = null;
        }
        this.f21157b = 0;
        this.f21158c = 0;
    }

    /* renamed from: d */
    public void mo654d(Object obj, int i) {
        long j = i;
        long count = count() + j;
        if (count > mo779u(obj) || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f21158c == 0) {
            System.arraycopy(this.f21062e, 0, obj, i, this.f21157b);
            return;
        }
        for (int i2 = 0; i2 < this.f21158c; i2++) {
            Object obj2 = this.f21063f[i2];
            System.arraycopy(obj2, 0, obj, i, mo779u(obj2));
            i += mo779u(this.f21063f[i2]);
        }
        int i3 = this.f21157b;
        if (i3 > 0) {
            System.arraycopy(this.f21062e, 0, obj, i, i3);
        }
    }

    /* renamed from: f */
    public void mo653f(Object obj) {
        for (int i = 0; i < this.f21158c; i++) {
            Object obj2 = this.f21063f[i];
            mo780t(obj2, 0, mo779u(obj2), obj);
        }
        mo780t(this.f21062e, 0, this.f21157b, obj);
    }

    public abstract Object newArray(int i);

    public abstract InterfaceC10321P spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator spliterator() {
        return C10320O.m1028a(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public abstract void mo780t(Object obj, int i, int i2, Object obj2);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public abstract int mo779u(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public final int m778v(long j) {
        if (this.f21158c == 0) {
            if (j < this.f21157b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else if (j < count()) {
            for (int i = 0; i <= this.f21158c; i++) {
                if (j < this.f21159d[i] + mo779u(this.f21063f[i])) {
                    return i;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final void m777w(long j) {
        long mo779u;
        int i;
        int i2 = this.f21158c;
        if (i2 == 0) {
            mo779u = mo779u(this.f21062e);
        } else {
            mo779u = mo779u(this.f21063f[i2]) + this.f21159d[i2];
        }
        if (j <= mo779u) {
            return;
        }
        if (this.f21063f == null) {
            Object[] mo776x = mo776x();
            this.f21063f = mo776x;
            this.f21159d = new long[8];
            mo776x[0] = this.f21062e;
        }
        int i3 = this.f21158c;
        while (true) {
            i3++;
            if (j <= mo779u) {
                return;
            }
            Object[] objArr = this.f21063f;
            if (i3 >= objArr.length) {
                int length = objArr.length * 2;
                this.f21063f = Arrays.copyOf(objArr, length);
                this.f21159d = Arrays.copyOf(this.f21159d, length);
            }
            int i4 = this.f21156a;
            if (i3 != 0 && i3 != 1) {
                i4 = Math.min((i4 + i3) - 1, 30);
            }
            int i5 = 1 << i4;
            this.f21063f[i3] = newArray(i5);
            long[] jArr = this.f21159d;
            jArr[i3] = jArr[i3 - 1] + mo779u(this.f21063f[i]);
            mo779u += i5;
        }
    }

    /* renamed from: x */
    protected abstract Object[] mo776x();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final void m775y() {
        long mo779u;
        if (this.f21157b == mo779u(this.f21062e)) {
            if (this.f21063f == null) {
                Object[] mo776x = mo776x();
                this.f21063f = mo776x;
                this.f21159d = new long[8];
                mo776x[0] = this.f21062e;
            }
            int i = this.f21158c;
            int i2 = i + 1;
            Object[] objArr = this.f21063f;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    mo779u = mo779u(this.f21062e);
                } else {
                    mo779u = mo779u(objArr[i]) + this.f21159d[i];
                }
                m777w(mo779u + 1);
            }
            this.f21157b = 0;
            int i3 = this.f21158c + 1;
            this.f21158c = i3;
            this.f21062e = this.f21063f[i3];
        }
    }
}

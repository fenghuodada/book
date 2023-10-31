package androidx.datastore.preferences.protobuf;

import androidx.appcompat.widget.C0406q1;
import androidx.datastore.preferences.protobuf.C1157b0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.x */
/* loaded from: classes.dex */
public final class C1269x extends AbstractC1162c<Float> implements RandomAccess, InterfaceC1165c1 {

    /* renamed from: b */
    public float[] f3138b;

    /* renamed from: c */
    public int f3139c;

    static {
        new C1269x(0, new float[0]).f2946a = false;
    }

    public C1269x() {
        this(0, new float[10]);
    }

    public C1269x(int i, float[] fArr) {
        this.f3138b = fArr;
        this.f3139c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        m11142a();
        if (i < 0 || i > (i2 = this.f3139c)) {
            StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
            m12536b.append(this.f3139c);
            throw new IndexOutOfBoundsException(m12536b.toString());
        }
        float[] fArr = this.f3138b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[C1169e.m11131a(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f3138b, i, fArr2, i + 1, this.f3139c - i);
            this.f3138b = fArr2;
        }
        this.f3138b[i] = floatValue;
        this.f3139c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        m11142a();
        Charset charset = C1157b0.f2944a;
        collection.getClass();
        if (!(collection instanceof C1269x)) {
            return super.addAll(collection);
        }
        C1269x c1269x = (C1269x) collection;
        int i = c1269x.f3139c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f3139c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f3138b;
            if (i3 > fArr.length) {
                this.f3138b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c1269x.f3138b, 0, this.f3138b, this.f3139c, c1269x.f3139c);
            this.f3139c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m10721b(float f) {
        m11142a();
        int i = this.f3139c;
        float[] fArr = this.f3138b;
        if (i == fArr.length) {
            float[] fArr2 = new float[C1169e.m11131a(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f3138b = fArr2;
        }
        float[] fArr3 = this.f3138b;
        int i2 = this.f3139c;
        this.f3139c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // androidx.datastore.preferences.protobuf.C1157b0.InterfaceC1160c
    /* renamed from: d */
    public final C1157b0.InterfaceC1160c mo10720d(int i) {
        if (i >= this.f3139c) {
            return new C1269x(this.f3139c, Arrays.copyOf(this.f3138b, i));
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1269x) {
            C1269x c1269x = (C1269x) obj;
            if (this.f3139c != c1269x.f3139c) {
                return false;
            }
            float[] fArr = c1269x.f3138b;
            for (int i = 0; i < this.f3139c; i++) {
                if (Float.floatToIntBits(this.f3138b[i]) != Float.floatToIntBits(fArr[i])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m10719i(i);
        return Float.valueOf(this.f3138b[i]);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f3139c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f3138b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final void m10719i(int i) {
        if (i >= 0 && i < this.f3139c) {
            return;
        }
        StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
        m12536b.append(this.f3139c);
        throw new IndexOutOfBoundsException(m12536b.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m11142a();
        m10719i(i);
        float[] fArr = this.f3138b;
        float f = fArr[i];
        if (i < this.f3139c - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f3139c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m11142a();
        for (int i = 0; i < this.f3139c; i++) {
            if (obj.equals(Float.valueOf(this.f3138b[i]))) {
                float[] fArr = this.f3138b;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f3139c - i) - 1);
                this.f3139c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m11142a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f3138b;
        System.arraycopy(fArr, i2, fArr, i, this.f3139c - i2);
        this.f3139c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m11142a();
        m10719i(i);
        float[] fArr = this.f3138b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3139c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1162c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m10721b(((Float) obj).floatValue());
        return true;
    }
}

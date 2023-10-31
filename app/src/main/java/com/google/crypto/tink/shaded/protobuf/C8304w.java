package com.google.crypto.tink.shaded.protobuf;

import androidx.appcompat.widget.C0406q1;
import androidx.datastore.preferences.protobuf.C1169e;
import com.google.crypto.tink.shaded.protobuf.C8196a0;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.w */
/* loaded from: classes3.dex */
public final class C8304w extends AbstractC8205c<Float> implements RandomAccess, InterfaceC8200a1 {

    /* renamed from: b */
    public float[] f16126b;

    /* renamed from: c */
    public int f16127c;

    static {
        new C8304w(0, new float[0]).f15955a = false;
    }

    public C8304w() {
        this(0, new float[10]);
    }

    public C8304w(int i, float[] fArr) {
        this.f16126b = fArr;
        this.f16127c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        m3923a();
        if (i < 0 || i > (i2 = this.f16127c)) {
            StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
            m12536b.append(this.f16127c);
            throw new IndexOutOfBoundsException(m12536b.toString());
        }
        float[] fArr = this.f16126b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[C1169e.m11131a(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f16126b, i, fArr2, i + 1, this.f16127c - i);
            this.f16126b = fArr2;
        }
        this.f16126b[i] = floatValue;
        this.f16127c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        m3923a();
        Charset charset = C8196a0.f15949a;
        collection.getClass();
        if (!(collection instanceof C8304w)) {
            return super.addAll(collection);
        }
        C8304w c8304w = (C8304w) collection;
        int i = c8304w.f16127c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f16127c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f16126b;
            if (i3 > fArr.length) {
                this.f16126b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(c8304w.f16126b, 0, this.f16126b, this.f16127c, c8304w.f16127c);
            this.f16127c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: b */
    public final void m3483b(float f) {
        m3923a();
        int i = this.f16127c;
        float[] fArr = this.f16126b;
        if (i == fArr.length) {
            float[] fArr2 = new float[C1169e.m11131a(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f16126b = fArr2;
        }
        float[] fArr3 = this.f16126b;
        int i2 = this.f16127c;
        this.f16127c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C8196a0.InterfaceC8199c
    /* renamed from: d */
    public final C8196a0.InterfaceC8199c mo3453d(int i) {
        if (i >= this.f16127c) {
            return new C8304w(this.f16127c, Arrays.copyOf(this.f16126b, i));
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8304w) {
            C8304w c8304w = (C8304w) obj;
            if (this.f16127c != c8304w.f16127c) {
                return false;
            }
            float[] fArr = c8304w.f16126b;
            for (int i = 0; i < this.f16127c; i++) {
                if (Float.floatToIntBits(this.f16126b[i]) != Float.floatToIntBits(fArr[i])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m3482i(i);
        return Float.valueOf(this.f16126b[i]);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16127c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f16126b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final void m3482i(int i) {
        if (i >= 0 && i < this.f16127c) {
            return;
        }
        StringBuilder m12536b = C0406q1.m12536b("Index:", i, ", Size:");
        m12536b.append(this.f16127c);
        throw new IndexOutOfBoundsException(m12536b.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m3923a();
        m3482i(i);
        float[] fArr = this.f16126b;
        float f = fArr[i];
        if (i < this.f16127c - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f16127c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m3923a();
        for (int i = 0; i < this.f16127c; i++) {
            if (obj.equals(Float.valueOf(this.f16126b[i]))) {
                float[] fArr = this.f16126b;
                System.arraycopy(fArr, i + 1, fArr, i, (this.f16127c - i) - 1);
                this.f16127c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m3923a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f16126b;
        System.arraycopy(fArr, i2, fArr, i, this.f16127c - i2);
        this.f16127c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m3923a();
        m3482i(i);
        float[] fArr = this.f16126b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16127c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC8205c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3483b(((Float) obj).floatValue());
        return true;
    }
}

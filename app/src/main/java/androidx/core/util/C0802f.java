package androidx.core.util;

import androidx.annotation.NonNull;

/* renamed from: androidx.core.util.f */
/* loaded from: classes.dex */
public class C0802f<T> implements InterfaceC0801e<T> {

    /* renamed from: a */
    public final Object[] f2502a;

    /* renamed from: b */
    public int f2503b;

    public C0802f(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f2502a = new Object[i];
    }

    @Override // androidx.core.util.InterfaceC0801e
    /* renamed from: a */
    public boolean mo6395a(@NonNull T t) {
        int i;
        Object[] objArr;
        boolean z;
        int i2 = 0;
        while (true) {
            i = this.f2503b;
            objArr = this.f2502a;
            if (i2 < i) {
                if (objArr[i2] == t) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f2503b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override // androidx.core.util.InterfaceC0801e
    /* renamed from: b */
    public T mo6394b() {
        int i = this.f2503b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f2502a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.f2503b = i - 1;
            return t;
        }
        return null;
    }
}

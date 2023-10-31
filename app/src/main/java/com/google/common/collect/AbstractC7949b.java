package com.google.common.collect;

import androidx.constraintlayout.core.C0511i;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* renamed from: com.google.common.collect.b */
/* loaded from: classes3.dex */
public abstract class AbstractC7949b<T> extends AbstractC8032x0<T> {

    /* renamed from: a */
    public int f15710a = 2;
    @NullableDecl

    /* renamed from: b */
    public T f15711b;

    @Override // java.util.Iterator, p060j$.util.Iterator
    @CanIgnoreReturnValue
    public final boolean hasNext() {
        boolean z;
        T t;
        int i = this.f15710a;
        if (i != 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int m12337b = C0511i.m12337b(i);
            if (m12337b == 0) {
                return true;
            }
            if (m12337b == 2) {
                return false;
            }
            this.f15710a = 4;
            C8017s0 c8017s0 = (C8017s0) this;
            while (true) {
                Iterator<Object> it = c8017s0.f15822c;
                if (it.hasNext()) {
                    t = (T) it.next();
                    if (c8017s0.f15823d.f15825b.contains(t)) {
                        break;
                    }
                } else {
                    c8017s0.f15710a = 3;
                    t = null;
                    break;
                }
            }
            this.f15711b = t;
            if (this.f15710a == 3) {
                return false;
            }
            this.f15710a = 1;
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    @CanIgnoreReturnValue
    public final T next() {
        if (hasNext()) {
            this.f15710a = 2;
            T t = this.f15711b;
            this.f15711b = null;
            return t;
        }
        throw new NoSuchElementException();
    }
}

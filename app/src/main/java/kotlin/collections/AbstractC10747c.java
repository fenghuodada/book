package kotlin.collections;

import java.util.AbstractList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.SinceKotlin;
import kotlin.collections.AbstractC10742b;
import kotlin.jvm.internal.markers.InterfaceC10848b;

@SinceKotlin(version = "1.1")
/* renamed from: kotlin.collections.c */
/* loaded from: classes3.dex */
public abstract class AbstractC10747c<E> extends AbstractList<E> implements List<E>, InterfaceC10848b {
    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        C10749e c10749e = (C10749e) this;
        AbstractC10742b.C10743a c10743a = AbstractC10742b.Companion;
        int i2 = c10749e.f21360c;
        c10743a.getClass();
        AbstractC10742b.C10743a.m501a(i, i2);
        if (i == C10752h.m487b(c10749e)) {
            if (!c10749e.isEmpty()) {
                int m496j = c10749e.m496j(C10752h.m487b(c10749e) + c10749e.f21358a);
                Object[] objArr = c10749e.f21359b;
                E e = (E) objArr[m496j];
                objArr[m496j] = null;
                c10749e.f21360c--;
                return e;
            }
            throw new NoSuchElementException("ArrayDeque is empty.");
        } else if (i == 0) {
            return (E) c10749e.removeFirst();
        } else {
            int m496j2 = c10749e.m496j(c10749e.f21358a + i);
            Object[] objArr2 = c10749e.f21359b;
            E e2 = (E) objArr2[m496j2];
            if (i < (c10749e.f21360c >> 1)) {
                int i3 = c10749e.f21358a;
                if (m496j2 >= i3) {
                    C10751g.m493c(objArr2, i3 + 1, objArr2, i3, m496j2);
                } else {
                    C10751g.m493c(objArr2, 1, objArr2, 0, m496j2);
                    Object[] objArr3 = c10749e.f21359b;
                    objArr3[0] = objArr3[objArr3.length - 1];
                    int i4 = c10749e.f21358a;
                    C10751g.m493c(objArr3, i4 + 1, objArr3, i4, objArr3.length - 1);
                }
                Object[] objArr4 = c10749e.f21359b;
                int i5 = c10749e.f21358a;
                objArr4[i5] = null;
                c10749e.f21358a = c10749e.m497i(i5);
            } else {
                int m496j3 = c10749e.m496j(C10752h.m487b(c10749e) + c10749e.f21358a);
                Object[] objArr5 = c10749e.f21359b;
                int i6 = m496j2 + 1;
                if (m496j2 <= m496j3) {
                    C10751g.m493c(objArr5, m496j2, objArr5, i6, m496j3 + 1);
                } else {
                    C10751g.m493c(objArr5, m496j2, objArr5, i6, objArr5.length);
                    Object[] objArr6 = c10749e.f21359b;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    C10751g.m493c(objArr6, 0, objArr6, 1, m496j3 + 1);
                }
                c10749e.f21359b[m496j3] = null;
            }
            c10749e.f21360c--;
            return e2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((C10749e) this).f21360c;
    }
}

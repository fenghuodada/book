package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.p004db.framework.C1714e;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.room.b */
/* loaded from: classes.dex */
public abstract class AbstractC1657b<T> extends AbstractC1677m {
    public AbstractC1657b(AbstractC1668i abstractC1668i) {
        super(abstractC1668i);
    }

    /* renamed from: d */
    public abstract void mo9785d(C1714e c1714e, T t);

    /* renamed from: e */
    public final void m10084e(T t) {
        C1714e m10062a = m10062a();
        try {
            mo9785d(m10062a, t);
            m10062a.f4171b.executeInsert();
        } finally {
            m10061c(m10062a);
        }
    }
}

package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.AbstractC1657b;
import androidx.room.AbstractC1668i;
import androidx.room.C1675k;
import androidx.sqlite.p004db.framework.C1714e;

/* renamed from: androidx.work.impl.model.f */
/* loaded from: classes.dex */
public final class C1923f implements InterfaceC1922e {

    /* renamed from: a */
    public final AbstractC1668i f4673a;

    /* renamed from: b */
    public final C1924a f4674b;

    /* renamed from: androidx.work.impl.model.f$a */
    /* loaded from: classes.dex */
    public class C1924a extends AbstractC1657b<C1921d> {
        public C1924a(AbstractC1668i abstractC1668i) {
            super(abstractC1668i);
        }

        @Override // androidx.room.AbstractC1677m
        /* renamed from: b */
        public final String mo9786b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // androidx.room.AbstractC1657b
        /* renamed from: d */
        public final void mo9785d(C1714e c1714e, C1921d c1921d) {
            C1921d c1921d2 = c1921d;
            String str = c1921d2.f4671a;
            if (str == null) {
                c1714e.m10018e(1);
            } else {
                c1714e.m10017f(1, str);
            }
            Long l = c1921d2.f4672b;
            if (l == null) {
                c1714e.m10018e(2);
            } else {
                c1714e.m10019d(2, l.longValue());
            }
        }
    }

    public C1923f(AbstractC1668i abstractC1668i) {
        this.f4673a = abstractC1668i;
        this.f4674b = new C1924a(abstractC1668i);
    }

    /* renamed from: a */
    public final Long m9808a(String str) {
        Long l;
        C1675k m10068d = C1675k.m10068d(1, "SELECT long_value FROM Preference where `key`=?");
        m10068d.m10065g(1, str);
        AbstractC1668i abstractC1668i = this.f4673a;
        abstractC1668i.m10075b();
        Cursor m10072g = abstractC1668i.m10072g(m10068d);
        try {
            if (m10072g.moveToFirst() && !m10072g.isNull(0)) {
                l = Long.valueOf(m10072g.getLong(0));
                return l;
            }
            l = null;
            return l;
        } finally {
            m10072g.close();
            m10068d.release();
        }
    }

    /* renamed from: b */
    public final void m9807b(C1921d c1921d) {
        AbstractC1668i abstractC1668i = this.f4673a;
        abstractC1668i.m10075b();
        abstractC1668i.m10074c();
        try {
            this.f4674b.m10084e(c1921d);
            abstractC1668i.m10071h();
        } finally {
            abstractC1668i.m10073f();
        }
    }
}

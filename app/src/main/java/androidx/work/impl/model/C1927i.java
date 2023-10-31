package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.AbstractC1657b;
import androidx.room.AbstractC1668i;
import androidx.room.AbstractC1677m;
import androidx.room.C1675k;
import androidx.room.util.C1680b;
import androidx.sqlite.p004db.framework.C1714e;

/* renamed from: androidx.work.impl.model.i */
/* loaded from: classes.dex */
public final class C1927i implements InterfaceC1926h {

    /* renamed from: a */
    public final AbstractC1668i f4677a;

    /* renamed from: b */
    public final C1928a f4678b;

    /* renamed from: c */
    public final C1929b f4679c;

    /* renamed from: androidx.work.impl.model.i$a */
    /* loaded from: classes.dex */
    public class C1928a extends AbstractC1657b<C1925g> {
        public C1928a(AbstractC1668i abstractC1668i) {
            super(abstractC1668i);
        }

        @Override // androidx.room.AbstractC1677m
        /* renamed from: b */
        public final String mo9786b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // androidx.room.AbstractC1657b
        /* renamed from: d */
        public final void mo9785d(C1714e c1714e, C1925g c1925g) {
            C1925g c1925g2 = c1925g;
            String str = c1925g2.f4675a;
            if (str == null) {
                c1714e.m10018e(1);
            } else {
                c1714e.m10017f(1, str);
            }
            c1714e.m10019d(2, c1925g2.f4676b);
        }
    }

    /* renamed from: androidx.work.impl.model.i$b */
    /* loaded from: classes.dex */
    public class C1929b extends AbstractC1677m {
        public C1929b(AbstractC1668i abstractC1668i) {
            super(abstractC1668i);
        }

        @Override // androidx.room.AbstractC1677m
        /* renamed from: b */
        public final String mo9786b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C1927i(AbstractC1668i abstractC1668i) {
        this.f4677a = abstractC1668i;
        this.f4678b = new C1928a(abstractC1668i);
        this.f4679c = new C1929b(abstractC1668i);
    }

    /* renamed from: a */
    public final C1925g m9806a(String str) {
        C1925g c1925g;
        C1675k m10068d = C1675k.m10068d(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            m10068d.m10066f(1);
        } else {
            m10068d.m10065g(1, str);
        }
        AbstractC1668i abstractC1668i = this.f4677a;
        abstractC1668i.m10075b();
        Cursor m10072g = abstractC1668i.m10072g(m10068d);
        try {
            int m10059a = C1680b.m10059a(m10072g, "work_spec_id");
            int m10059a2 = C1680b.m10059a(m10072g, "system_id");
            if (m10072g.moveToFirst()) {
                c1925g = new C1925g(m10072g.getString(m10059a), m10072g.getInt(m10059a2));
            } else {
                c1925g = null;
            }
            return c1925g;
        } finally {
            m10072g.close();
            m10068d.release();
        }
    }

    /* renamed from: b */
    public final void m9805b(String str) {
        AbstractC1668i abstractC1668i = this.f4677a;
        abstractC1668i.m10075b();
        C1929b c1929b = this.f4679c;
        C1714e m10062a = c1929b.m10062a();
        if (str == null) {
            m10062a.m10018e(1);
        } else {
            m10062a.m10017f(1, str);
        }
        abstractC1668i.m10074c();
        try {
            m10062a.m10016g();
            abstractC1668i.m10071h();
        } finally {
            abstractC1668i.m10073f();
            c1929b.m10061c(m10062a);
        }
    }
}

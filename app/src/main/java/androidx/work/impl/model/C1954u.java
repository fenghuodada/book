package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.AbstractC1657b;
import androidx.room.AbstractC1668i;
import androidx.room.C1675k;
import androidx.sqlite.p004db.framework.C1714e;
import java.util.ArrayList;

/* renamed from: androidx.work.impl.model.u */
/* loaded from: classes.dex */
public final class C1954u implements InterfaceC1953t {

    /* renamed from: a */
    public final AbstractC1668i f4721a;

    /* renamed from: b */
    public final C1955a f4722b;

    /* renamed from: androidx.work.impl.model.u$a */
    /* loaded from: classes.dex */
    public class C1955a extends AbstractC1657b<C1952s> {
        public C1955a(AbstractC1668i abstractC1668i) {
            super(abstractC1668i);
        }

        @Override // androidx.room.AbstractC1677m
        /* renamed from: b */
        public final String mo9786b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.AbstractC1657b
        /* renamed from: d */
        public final void mo9785d(C1714e c1714e, C1952s c1952s) {
            C1952s c1952s2 = c1952s;
            String str = c1952s2.f4719a;
            if (str == null) {
                c1714e.m10018e(1);
            } else {
                c1714e.m10017f(1, str);
            }
            String str2 = c1952s2.f4720b;
            if (str2 == null) {
                c1714e.m10018e(2);
            } else {
                c1714e.m10017f(2, str2);
            }
        }
    }

    public C1954u(AbstractC1668i abstractC1668i) {
        this.f4721a = abstractC1668i;
        this.f4722b = new C1955a(abstractC1668i);
    }

    /* renamed from: a */
    public final ArrayList m9787a(String str) {
        C1675k m10068d = C1675k.m10068d(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            m10068d.m10066f(1);
        } else {
            m10068d.m10065g(1, str);
        }
        AbstractC1668i abstractC1668i = this.f4721a;
        abstractC1668i.m10075b();
        Cursor m10072g = abstractC1668i.m10072g(m10068d);
        try {
            ArrayList arrayList = new ArrayList(m10072g.getCount());
            while (m10072g.moveToNext()) {
                arrayList.add(m10072g.getString(0));
            }
            return arrayList;
        } finally {
            m10072g.close();
            m10068d.release();
        }
    }
}

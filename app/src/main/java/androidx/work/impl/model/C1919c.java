package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.AbstractC1657b;
import androidx.room.AbstractC1668i;
import androidx.room.C1675k;
import androidx.sqlite.p004db.framework.C1714e;
import java.util.ArrayList;

/* renamed from: androidx.work.impl.model.c */
/* loaded from: classes.dex */
public final class C1919c implements InterfaceC1918b {

    /* renamed from: a */
    public final AbstractC1668i f4669a;

    /* renamed from: b */
    public final C1920a f4670b;

    /* renamed from: androidx.work.impl.model.c$a */
    /* loaded from: classes.dex */
    public class C1920a extends AbstractC1657b<C1917a> {
        public C1920a(AbstractC1668i abstractC1668i) {
            super(abstractC1668i);
        }

        @Override // androidx.room.AbstractC1677m
        /* renamed from: b */
        public final String mo9786b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // androidx.room.AbstractC1657b
        /* renamed from: d */
        public final void mo9785d(C1714e c1714e, C1917a c1917a) {
            C1917a c1917a2 = c1917a;
            String str = c1917a2.f4667a;
            if (str == null) {
                c1714e.m10018e(1);
            } else {
                c1714e.m10017f(1, str);
            }
            String str2 = c1917a2.f4668b;
            if (str2 == null) {
                c1714e.m10018e(2);
            } else {
                c1714e.m10017f(2, str2);
            }
        }
    }

    public C1919c(AbstractC1668i abstractC1668i) {
        this.f4669a = abstractC1668i;
        this.f4670b = new C1920a(abstractC1668i);
    }

    /* renamed from: a */
    public final ArrayList m9810a(String str) {
        C1675k m10068d = C1675k.m10068d(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            m10068d.m10066f(1);
        } else {
            m10068d.m10065g(1, str);
        }
        AbstractC1668i abstractC1668i = this.f4669a;
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

    /* renamed from: b */
    public final boolean m9809b(String str) {
        boolean z = true;
        C1675k m10068d = C1675k.m10068d(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            m10068d.m10066f(1);
        } else {
            m10068d.m10065g(1, str);
        }
        AbstractC1668i abstractC1668i = this.f4669a;
        abstractC1668i.m10075b();
        Cursor m10072g = abstractC1668i.m10072g(m10068d);
        try {
            boolean z2 = false;
            if (m10072g.moveToFirst()) {
                if (m10072g.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            m10072g.close();
            m10068d.release();
        }
    }
}

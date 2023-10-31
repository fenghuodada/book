package androidx.work.impl.model;

import androidx.room.AbstractC1657b;
import androidx.room.AbstractC1668i;
import androidx.room.AbstractC1677m;
import androidx.sqlite.p004db.framework.C1714e;
import androidx.work.C1837f;

/* renamed from: androidx.work.impl.model.o */
/* loaded from: classes.dex */
public final class C1936o implements InterfaceC1935n {

    /* renamed from: a */
    public final AbstractC1668i f4686a;

    /* renamed from: b */
    public final C1937a f4687b;

    /* renamed from: c */
    public final C1938b f4688c;

    /* renamed from: d */
    public final C1939c f4689d;

    /* renamed from: androidx.work.impl.model.o$a */
    /* loaded from: classes.dex */
    public class C1937a extends AbstractC1657b<C1934m> {
        public C1937a(AbstractC1668i abstractC1668i) {
            super(abstractC1668i);
        }

        @Override // androidx.room.AbstractC1677m
        /* renamed from: b */
        public final String mo9786b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // androidx.room.AbstractC1657b
        /* renamed from: d */
        public final void mo9785d(C1714e c1714e, C1934m c1934m) {
            C1934m c1934m2 = c1934m;
            String str = c1934m2.f4684a;
            if (str == null) {
                c1714e.m10018e(1);
            } else {
                c1714e.m10017f(1, str);
            }
            byte[] m9903b = C1837f.m9903b(c1934m2.f4685b);
            if (m9903b == null) {
                c1714e.m10018e(2);
            } else {
                c1714e.m10021a(2, m9903b);
            }
        }
    }

    /* renamed from: androidx.work.impl.model.o$b */
    /* loaded from: classes.dex */
    public class C1938b extends AbstractC1677m {
        public C1938b(AbstractC1668i abstractC1668i) {
            super(abstractC1668i);
        }

        @Override // androidx.room.AbstractC1677m
        /* renamed from: b */
        public final String mo9786b() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: androidx.work.impl.model.o$c */
    /* loaded from: classes.dex */
    public class C1939c extends AbstractC1677m {
        public C1939c(AbstractC1668i abstractC1668i) {
            super(abstractC1668i);
        }

        @Override // androidx.room.AbstractC1677m
        /* renamed from: b */
        public final String mo9786b() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C1936o(AbstractC1668i abstractC1668i) {
        this.f4686a = abstractC1668i;
        this.f4687b = new C1937a(abstractC1668i);
        this.f4688c = new C1938b(abstractC1668i);
        this.f4689d = new C1939c(abstractC1668i);
    }
}

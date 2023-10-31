package androidx.work.impl.model;

import androidx.room.AbstractC1657b;
import androidx.room.AbstractC1668i;
import androidx.sqlite.p004db.framework.C1714e;

/* renamed from: androidx.work.impl.model.l */
/* loaded from: classes.dex */
public final class C1932l implements InterfaceC1931k {

    /* renamed from: a */
    public final AbstractC1668i f4682a;

    /* renamed from: b */
    public final C1933a f4683b;

    /* renamed from: androidx.work.impl.model.l$a */
    /* loaded from: classes.dex */
    public class C1933a extends AbstractC1657b<C1930j> {
        public C1933a(AbstractC1668i abstractC1668i) {
            super(abstractC1668i);
        }

        @Override // androidx.room.AbstractC1677m
        /* renamed from: b */
        public final String mo9786b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // androidx.room.AbstractC1657b
        /* renamed from: d */
        public final void mo9785d(C1714e c1714e, C1930j c1930j) {
            C1930j c1930j2 = c1930j;
            String str = c1930j2.f4680a;
            if (str == null) {
                c1714e.m10018e(1);
            } else {
                c1714e.m10017f(1, str);
            }
            String str2 = c1930j2.f4681b;
            if (str2 == null) {
                c1714e.m10018e(2);
            } else {
                c1714e.m10017f(2, str2);
            }
        }
    }

    public C1932l(AbstractC1668i abstractC1668i) {
        this.f4682a = abstractC1668i;
        this.f4683b = new C1933a(abstractC1668i);
    }
}

package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.room.AbstractC1668i;
import androidx.sqlite.p004db.framework.C1707a;

/* renamed from: androidx.work.impl.i */
/* loaded from: classes.dex */
public final class C1903i extends AbstractC1668i.AbstractC1670b {
    @Override // androidx.room.AbstractC1668i.AbstractC1670b
    /* renamed from: a */
    public final void mo9820a(@NonNull C1707a c1707a) {
        c1707a.m10032a();
        try {
            int i = WorkDatabase.f4466k;
            c1707a.m10030d("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f4465j) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            c1707a.m10026h();
        } finally {
            c1707a.m10031c();
        }
    }
}

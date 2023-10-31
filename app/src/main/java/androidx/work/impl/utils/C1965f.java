package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.C1921d;
import androidx.work.impl.model.C1923f;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.f */
/* loaded from: classes.dex */
public final class C1965f {

    /* renamed from: a */
    public final WorkDatabase f4771a;

    public C1965f(@NonNull WorkDatabase workDatabase) {
        this.f4771a = workDatabase;
    }

    /* renamed from: a */
    public final int m9763a(int i) {
        int i2;
        int i3;
        int i4;
        synchronized (C1965f.class) {
            WorkDatabase workDatabase = this.f4771a;
            workDatabase.m10074c();
            Long m9808a = ((C1923f) workDatabase.mo9897j()).m9808a("next_job_scheduler_id");
            i2 = 0;
            if (m9808a != null) {
                i3 = m9808a.intValue();
            } else {
                i3 = 0;
            }
            if (i3 == Integer.MAX_VALUE) {
                i4 = 0;
            } else {
                i4 = i3 + 1;
            }
            ((C1923f) workDatabase.mo9897j()).m9807b(new C1921d("next_job_scheduler_id", i4));
            workDatabase.m10071h();
            workDatabase.m10073f();
            if (i3 >= 0 && i3 <= i) {
                i2 = i3;
            }
            ((C1923f) this.f4771a.mo9897j()).m9807b(new C1921d("next_job_scheduler_id", 1));
        }
        return i2;
    }
}

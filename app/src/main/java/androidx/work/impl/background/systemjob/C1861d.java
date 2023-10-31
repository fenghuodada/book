package androidx.work.impl.background.systemjob;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.AbstractC2005l;

@RequiresApi(api = 23)
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.background.systemjob.d */
/* loaded from: classes.dex */
public final class C1861d {

    /* renamed from: b */
    public static final String f4539b = AbstractC2005l.m9732e("SystemJobInfoConverter");

    /* renamed from: a */
    public final ComponentName f4540a;

    @VisibleForTesting(otherwise = 3)
    public C1861d(@NonNull Context context) {
        this.f4540a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
        if (r2 < 26) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
        if (r2 >= 24) goto L57;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.app.job.JobInfo m9867a(androidx.work.impl.model.C1940p r12, int r13) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.C1861d.m9867a(androidx.work.impl.model.p, int):android.app.job.JobInfo");
    }
}

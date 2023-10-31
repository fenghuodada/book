package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.firebase.transport.C6506c;
import com.google.android.datatransport.runtime.scheduling.persistence.C6567a0;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.C7417m;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.common.Utils;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.p */
/* loaded from: classes.dex */
public final /* synthetic */ class C6596p implements C6567a0.InterfaceC6568a, C7417m.InterfaceC7418a, Continuation {

    /* renamed from: b */
    public final /* synthetic */ Object f10429b;

    public /* synthetic */ C6596p(Object obj) {
        this.f10429b = obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.C6567a0.InterfaceC6568a
    public final Object apply(Object obj) {
        C6567a0 c6567a0 = (C6567a0) this.f10429b;
        Cursor cursor = (Cursor) obj;
        c6567a0.getClass();
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            c6567a0.mo6249e(i, C6506c.EnumC6507a.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).m6161l0();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Void lambda$race$0;
        lambda$race$0 = Utils.lambda$race$0((TaskCompletionSource) this.f10429b, task);
        return lambda$race$0;
    }
}

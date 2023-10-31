package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.util.C7417m;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.Utils;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.exoplayer2.analytics.a0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C6636a0 implements C7417m.InterfaceC7418a, Continuation {

    /* renamed from: b */
    public final /* synthetic */ Object f10570b;

    public /* synthetic */ C6636a0(Object obj) {
        this.f10570b = obj;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).onSeekProcessed();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Object lambda$awaitEvenIfOnMainThread$4;
        lambda$awaitEvenIfOnMainThread$4 = Utils.lambda$awaitEvenIfOnMainThread$4((CountDownLatch) this.f10570b, task);
        return lambda$awaitEvenIfOnMainThread$4;
    }
}

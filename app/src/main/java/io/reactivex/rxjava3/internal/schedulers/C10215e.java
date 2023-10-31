package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.AbstractC10154g;
import java.util.concurrent.ThreadFactory;

/* renamed from: io.reactivex.rxjava3.internal.schedulers.e */
/* loaded from: classes3.dex */
public final class C10215e extends AbstractC10154g {

    /* renamed from: c */
    public static final ThreadFactoryC10217g f20527c = new ThreadFactoryC10217g("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())), false);

    /* renamed from: b */
    public final ThreadFactory f20528b = f20527c;

    @Override // io.reactivex.rxjava3.core.AbstractC10154g
    @NonNull
    /* renamed from: a */
    public final AbstractC10154g.AbstractC10157c mo1197a() {
        return new C10216f(this.f20528b);
    }
}

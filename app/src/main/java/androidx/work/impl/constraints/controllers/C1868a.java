package androidx.work.impl.constraints.controllers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.impl.constraints.trackers.C1889h;
import androidx.work.impl.model.C1940p;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;

/* renamed from: androidx.work.impl.constraints.controllers.a */
/* loaded from: classes.dex */
public final class C1868a extends AbstractC1870c<Boolean> {
    public C1868a(Context context, InterfaceC1998a interfaceC1998a) {
        super(C1889h.m9842a(context, interfaceC1998a).f4583a);
    }

    @Override // androidx.work.impl.constraints.controllers.AbstractC1870c
    /* renamed from: b */
    public final boolean mo9857b(@NonNull C1940p c1940p) {
        return c1940p.f4699j.f4445b;
    }

    @Override // androidx.work.impl.constraints.controllers.AbstractC1870c
    /* renamed from: c */
    public final boolean mo9856c(@NonNull Boolean bool) {
        return !bool.booleanValue();
    }
}

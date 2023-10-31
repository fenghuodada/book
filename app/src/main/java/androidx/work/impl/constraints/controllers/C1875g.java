package androidx.work.impl.constraints.controllers;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.EnumC2007m;
import androidx.work.impl.constraints.C1866b;
import androidx.work.impl.constraints.trackers.C1889h;
import androidx.work.impl.model.C1940p;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;

/* renamed from: androidx.work.impl.constraints.controllers.g */
/* loaded from: classes.dex */
public final class C1875g extends AbstractC1870c<C1866b> {
    public C1875g(@NonNull Context context, @NonNull InterfaceC1998a interfaceC1998a) {
        super(C1889h.m9842a(context, interfaceC1998a).f4585c);
    }

    @Override // androidx.work.impl.constraints.controllers.AbstractC1870c
    /* renamed from: b */
    public final boolean mo9857b(@NonNull C1940p c1940p) {
        EnumC2007m enumC2007m = c1940p.f4699j.f4444a;
        if (enumC2007m != EnumC2007m.UNMETERED && (Build.VERSION.SDK_INT < 30 || enumC2007m != EnumC2007m.TEMPORARILY_UNMETERED)) {
            return false;
        }
        return true;
    }

    @Override // androidx.work.impl.constraints.controllers.AbstractC1870c
    /* renamed from: c */
    public final boolean mo9856c(@NonNull C1866b c1866b) {
        C1866b c1866b2 = c1866b;
        if (c1866b2.f4548a && !c1866b2.f4550c) {
            return false;
        }
        return true;
    }
}

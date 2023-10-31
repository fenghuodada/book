package androidx.work.impl.constraints.controllers;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.work.AbstractC2005l;
import androidx.work.EnumC2007m;
import androidx.work.impl.constraints.C1866b;
import androidx.work.impl.constraints.trackers.C1889h;
import androidx.work.impl.model.C1940p;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;

/* renamed from: androidx.work.impl.constraints.controllers.e */
/* loaded from: classes.dex */
public final class C1873e extends AbstractC1870c<C1866b> {

    /* renamed from: e */
    public static final String f4556e = AbstractC2005l.m9732e("NetworkMeteredCtrlr");

    public C1873e(Context context, InterfaceC1998a interfaceC1998a) {
        super(C1889h.m9842a(context, interfaceC1998a).f4585c);
    }

    @Override // androidx.work.impl.constraints.controllers.AbstractC1870c
    /* renamed from: b */
    public final boolean mo9857b(@NonNull C1940p c1940p) {
        if (c1940p.f4699j.f4444a == EnumC2007m.METERED) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.impl.constraints.controllers.AbstractC1870c
    /* renamed from: c */
    public final boolean mo9856c(@NonNull C1866b c1866b) {
        C1866b c1866b2 = c1866b;
        boolean z = true;
        if (Build.VERSION.SDK_INT < 26) {
            AbstractC2005l.m9733c().mo9731a(f4556e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !c1866b2.f4548a;
        }
        if (c1866b2.f4548a && c1866b2.f4550c) {
            z = false;
        }
        return z;
    }
}

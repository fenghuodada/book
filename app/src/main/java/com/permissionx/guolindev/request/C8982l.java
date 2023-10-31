package com.permissionx.guolindev.request;

import android.provider.Settings;
import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;

/* renamed from: com.permissionx.guolindev.request.l */
/* loaded from: classes3.dex */
public final class C8982l extends AbstractC10844k implements InterfaceC10809a<C10868p> {

    /* renamed from: a */
    public final /* synthetic */ C8991u f17148a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8982l(C8991u c8991u) {
        super(0);
        this.f17148a = c8991u;
    }

    @Override // kotlin.jvm.functions.InterfaceC10809a
    public final C10868p invoke() {
        C8991u c8991u = this.f17148a;
        if (Settings.System.canWrite(c8991u.requireContext())) {
            InterfaceC8971c interfaceC8971c = c8991u.f17163c;
            if (interfaceC8971c != null) {
                interfaceC8971c.mo2828b();
            } else {
                C10843j.m424l("task");
                throw null;
            }
        } else {
            C8992v c8992v = c8991u.f17162b;
            if (c8992v != null) {
                if (c8992v == null) {
                    C10843j.m424l("pb");
                    throw null;
                }
            } else {
                C10843j.m424l("pb");
                throw null;
            }
        }
        return C10868p.f21418a;
    }
}

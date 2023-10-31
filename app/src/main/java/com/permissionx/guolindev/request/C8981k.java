package com.permissionx.guolindev.request;

import android.os.Build;
import androidx.core.app.C0600a0;
import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;

/* renamed from: com.permissionx.guolindev.request.k */
/* loaded from: classes3.dex */
public final class C8981k extends AbstractC10844k implements InterfaceC10809a<C10868p> {

    /* renamed from: a */
    public final /* synthetic */ C8991u f17147a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8981k(C8991u c8991u) {
        super(0);
        this.f17147a = c8991u;
    }

    @Override // kotlin.jvm.functions.InterfaceC10809a
    public final C10868p invoke() {
        InterfaceC8971c interfaceC8971c;
        int i = Build.VERSION.SDK_INT;
        C8991u c8991u = this.f17147a;
        if (i >= 26) {
            if (new C0600a0(c8991u.requireContext()).m12103a()) {
                interfaceC8971c = c8991u.f17163c;
                if (interfaceC8971c == null) {
                    C10843j.m424l("task");
                    throw null;
                }
            } else {
                if (c8991u.f17162b == null) {
                    C10843j.m424l("pb");
                    throw null;
                }
                return C10868p.f21418a;
            }
        } else {
            interfaceC8971c = c8991u.f17163c;
            if (interfaceC8971c == null) {
                C10843j.m424l("task");
                throw null;
            }
        }
        interfaceC8971c.mo2828b();
        return C10868p.f21418a;
    }
}

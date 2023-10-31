package com.permissionx.guolindev.request;

import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;

/* renamed from: com.permissionx.guolindev.request.m */
/* loaded from: classes3.dex */
public final class C8983m extends AbstractC10844k implements InterfaceC10809a<C10868p> {

    /* renamed from: a */
    public final /* synthetic */ C8991u f17149a;

    /* renamed from: b */
    public final /* synthetic */ Boolean f17150b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8983m(C8991u c8991u, Boolean bool) {
        super(0);
        this.f17149a = c8991u;
        this.f17150b = bool;
    }

    @Override // kotlin.jvm.functions.InterfaceC10809a
    public final C10868p invoke() {
        Boolean granted = this.f17150b;
        C10843j.m431e(granted, "granted");
        boolean booleanValue = granted.booleanValue();
        int i = C8991u.f17160l;
        C8991u c8991u = this.f17149a;
        if (c8991u.m2827h()) {
            c8991u.m2825j(new C8977g(c8991u, booleanValue));
        }
        return C10868p.f21418a;
    }
}

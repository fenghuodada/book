package com.permissionx.guolindev.request;

import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;

/* renamed from: com.permissionx.guolindev.request.h */
/* loaded from: classes3.dex */
public final class C8978h extends AbstractC10844k implements InterfaceC10809a<C10868p> {

    /* renamed from: a */
    public final /* synthetic */ boolean f17143a;

    /* renamed from: b */
    public final /* synthetic */ C8991u f17144b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8978h(C8991u c8991u, boolean z) {
        super(0);
        this.f17143a = z;
        this.f17144b = c8991u;
    }

    @Override // kotlin.jvm.functions.InterfaceC10809a
    public final C10868p invoke() {
        InterfaceC8971c interfaceC8971c;
        boolean z = this.f17143a;
        C8991u c8991u = this.f17144b;
        if (z) {
            C8992v c8992v = c8991u.f17162b;
            if (c8992v != null) {
                c8992v.f17178g.add("android.permission.BODY_SENSORS_BACKGROUND");
                C8992v c8992v2 = c8991u.f17162b;
                if (c8992v2 != null) {
                    c8992v2.f17179h.remove("android.permission.BODY_SENSORS_BACKGROUND");
                    C8992v c8992v3 = c8991u.f17162b;
                    if (c8992v3 != null) {
                        c8992v3.f17180i.remove("android.permission.BODY_SENSORS_BACKGROUND");
                        interfaceC8971c = c8991u.f17163c;
                        if (interfaceC8971c == null) {
                            C10843j.m424l("task");
                            throw null;
                        }
                    } else {
                        C10843j.m424l("pb");
                        throw null;
                    }
                } else {
                    C10843j.m424l("pb");
                    throw null;
                }
            } else {
                C10843j.m424l("pb");
                throw null;
            }
        } else {
            c8991u.shouldShowRequestPermissionRationale("android.permission.BODY_SENSORS_BACKGROUND");
            if (c8991u.f17162b != null) {
                interfaceC8971c = c8991u.f17163c;
                if (interfaceC8971c == null) {
                    C10843j.m424l("task");
                    throw null;
                }
            } else {
                C10843j.m424l("pb");
                throw null;
            }
        }
        interfaceC8971c.mo2828b();
        return C10868p.f21418a;
    }
}

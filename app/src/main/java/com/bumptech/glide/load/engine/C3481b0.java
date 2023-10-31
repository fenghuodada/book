package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.load.data.InterfaceC3452d;
import com.bumptech.glide.load.engine.InterfaceC3532h;
import com.bumptech.glide.load.model.InterfaceC3627o;

/* renamed from: com.bumptech.glide.load.engine.b0 */
/* loaded from: classes.dex */
public final class C3481b0 implements InterfaceC3452d.InterfaceC3453a<Object> {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC3627o.C3628a f9233a;

    /* renamed from: b */
    public final /* synthetic */ C3504c0 f9234b;

    public C3481b0(C3504c0 c3504c0, InterfaceC3627o.C3628a c3628a) {
        this.f9234b = c3504c0;
        this.f9233a = c3628a;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d.InterfaceC3453a
    /* renamed from: c */
    public final void mo6590c(@NonNull Exception exc) {
        boolean z;
        C3504c0 c3504c0 = this.f9234b;
        InterfaceC3627o.C3628a<?> c3628a = this.f9233a;
        InterfaceC3627o.C3628a<?> c3628a2 = c3504c0.f9286f;
        if (c3628a2 != null && c3628a2 == c3628a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C3530f c3530f = c3504c0.f9287g;
            InterfaceC3452d<?> interfaceC3452d = c3628a.f9567c;
            c3504c0.f9282b.mo6664a(c3530f, exc, interfaceC3452d, interfaceC3452d.mo6577d());
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d.InterfaceC3453a
    /* renamed from: f */
    public final void mo6589f(@Nullable Object obj) {
        boolean z;
        C3504c0 c3504c0 = this.f9234b;
        InterfaceC3627o.C3628a<?> c3628a = this.f9233a;
        InterfaceC3627o.C3628a<?> c3628a2 = c3504c0.f9286f;
        if (c3628a2 != null && c3628a2 == c3628a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AbstractC3543m abstractC3543m = c3504c0.f9281a.f9352p;
            if (obj != null && abstractC3543m.mo6641c(c3628a.f9567c.mo6577d())) {
                c3504c0.f9285e = obj;
                c3504c0.f9282b.mo6663c();
                return;
            }
            InterfaceC3532h.InterfaceC3533a interfaceC3533a = c3504c0.f9282b;
            InterfaceC3577g interfaceC3577g = c3628a.f9565a;
            InterfaceC3452d<?> interfaceC3452d = c3628a.f9567c;
            interfaceC3533a.mo6662d(interfaceC3577g, obj, interfaceC3452d, interfaceC3452d.mo6577d(), c3504c0.f9287g);
        }
    }
}

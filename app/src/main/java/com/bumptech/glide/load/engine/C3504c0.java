package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.InterfaceC3447d;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.load.data.InterfaceC3452d;
import com.bumptech.glide.load.engine.C3549n;
import com.bumptech.glide.load.engine.InterfaceC3532h;
import com.bumptech.glide.load.model.InterfaceC3627o;
import com.bumptech.glide.util.C3855f;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.bumptech.glide.load.engine.c0 */
/* loaded from: classes.dex */
public final class C3504c0 implements InterfaceC3532h, InterfaceC3532h.InterfaceC3533a {

    /* renamed from: a */
    public final C3534i<?> f9281a;

    /* renamed from: b */
    public final InterfaceC3532h.InterfaceC3533a f9282b;

    /* renamed from: c */
    public int f9283c;

    /* renamed from: d */
    public C3526e f9284d;

    /* renamed from: e */
    public Object f9285e;

    /* renamed from: f */
    public volatile InterfaceC3627o.C3628a<?> f9286f;

    /* renamed from: g */
    public C3530f f9287g;

    public C3504c0(C3534i<?> c3534i, InterfaceC3532h.InterfaceC3533a interfaceC3533a) {
        this.f9281a = c3534i;
        this.f9282b = interfaceC3533a;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3532h.InterfaceC3533a
    /* renamed from: a */
    public final void mo6664a(InterfaceC3577g interfaceC3577g, Exception exc, InterfaceC3452d<?> interfaceC3452d, EnumC3444a enumC3444a) {
        this.f9282b.mo6664a(interfaceC3577g, exc, interfaceC3452d, this.f9286f.f9567c.mo6577d());
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3532h
    /* renamed from: b */
    public final boolean mo6610b() {
        boolean z;
        boolean z2;
        Object obj = this.f9285e;
        if (obj != null) {
            this.f9285e = null;
            int i = C3855f.f9946b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                InterfaceC3447d<X> m6666d = this.f9281a.m6666d(obj);
                C3531g c3531g = new C3531g(m6666d, obj, this.f9281a.f9345i);
                InterfaceC3577g interfaceC3577g = this.f9286f.f9565a;
                C3534i<?> c3534i = this.f9281a;
                this.f9287g = new C3530f(interfaceC3577g, c3534i.f9350n);
                ((C3549n.C3554c) c3534i.f9344h).m6632a().mo6675a(this.f9287g, c3531g);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f9287g + ", data: " + obj + ", encoder: " + m6666d + ", duration: " + C3855f.m6413a(elapsedRealtimeNanos));
                }
                this.f9286f.f9567c.mo6578b();
                this.f9284d = new C3526e(Collections.singletonList(this.f9286f.f9565a), this.f9281a, this);
            } catch (Throwable th) {
                this.f9286f.f9567c.mo6578b();
                throw th;
            }
        }
        C3526e c3526e = this.f9284d;
        if (c3526e != null && c3526e.mo6610b()) {
            return true;
        }
        this.f9284d = null;
        this.f9286f = null;
        boolean z3 = false;
        while (!z3) {
            if (this.f9283c < this.f9281a.m6668b().size()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            ArrayList m6668b = this.f9281a.m6668b();
            int i2 = this.f9283c;
            this.f9283c = i2 + 1;
            this.f9286f = (InterfaceC3627o.C3628a) m6668b.get(i2);
            if (this.f9286f != null) {
                if (!this.f9281a.f9352p.mo6641c(this.f9286f.f9567c.mo6577d())) {
                    if (this.f9281a.m6667c(this.f9286f.f9567c.mo6579a()) != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                    }
                }
                this.f9286f.f9567c.mo6576e(this.f9281a.f9351o, new C3481b0(this, this.f9286f));
                z3 = true;
            }
        }
        return z3;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3532h.InterfaceC3533a
    /* renamed from: c */
    public final void mo6663c() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3532h
    public final void cancel() {
        InterfaceC3627o.C3628a<?> c3628a = this.f9286f;
        if (c3628a != null) {
            c3628a.f9567c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3532h.InterfaceC3533a
    /* renamed from: d */
    public final void mo6662d(InterfaceC3577g interfaceC3577g, Object obj, InterfaceC3452d<?> interfaceC3452d, EnumC3444a enumC3444a, InterfaceC3577g interfaceC3577g2) {
        this.f9282b.mo6662d(interfaceC3577g, obj, interfaceC3452d, this.f9286f.f9567c.mo6577d(), interfaceC3577g);
    }
}

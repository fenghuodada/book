package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* renamed from: com.bumptech.glide.request.b */
/* loaded from: classes.dex */
public final class C3822b implements InterfaceC3825e, InterfaceC3823c {

    /* renamed from: a */
    public final Object f9874a;
    @Nullable

    /* renamed from: b */
    public final InterfaceC3825e f9875b;

    /* renamed from: c */
    public volatile InterfaceC3823c f9876c;

    /* renamed from: d */
    public volatile InterfaceC3823c f9877d;
    @GuardedBy("requestLock")

    /* renamed from: e */
    public int f9878e = 3;
    @GuardedBy("requestLock")

    /* renamed from: f */
    public int f9879f = 3;

    public C3822b(Object obj, @Nullable InterfaceC3825e interfaceC3825e) {
        this.f9874a = obj;
        this.f9875b = interfaceC3825e;
    }

    @Override // com.bumptech.glide.request.InterfaceC3825e, com.bumptech.glide.request.InterfaceC3823c
    /* renamed from: a */
    public final boolean mo6443a() {
        boolean z;
        synchronized (this.f9874a) {
            z = this.f9876c.mo6443a() || this.f9877d.mo6443a();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3825e
    /* renamed from: b */
    public final void mo6442b(InterfaceC3823c interfaceC3823c) {
        synchronized (this.f9874a) {
            if (interfaceC3823c.equals(this.f9877d)) {
                this.f9879f = 5;
                InterfaceC3825e interfaceC3825e = this.f9875b;
                if (interfaceC3825e != null) {
                    interfaceC3825e.mo6442b(this);
                }
                return;
            }
            this.f9878e = 5;
            if (this.f9879f != 1) {
                this.f9879f = 1;
                this.f9877d.mo6437g();
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3823c
    /* renamed from: c */
    public final boolean mo6441c(InterfaceC3823c interfaceC3823c) {
        if (interfaceC3823c instanceof C3822b) {
            C3822b c3822b = (C3822b) interfaceC3823c;
            return this.f9876c.mo6441c(c3822b.f9876c) && this.f9877d.mo6441c(c3822b.f9877d);
        }
        return false;
    }

    @Override // com.bumptech.glide.request.InterfaceC3823c
    public final void clear() {
        synchronized (this.f9874a) {
            this.f9878e = 3;
            this.f9876c.clear();
            if (this.f9879f != 3) {
                this.f9879f = 3;
                this.f9877d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3823c
    /* renamed from: d */
    public final boolean mo6440d() {
        boolean z;
        synchronized (this.f9874a) {
            z = this.f9878e == 3 && this.f9879f == 3;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3825e
    /* renamed from: e */
    public final boolean mo6439e(InterfaceC3823c interfaceC3823c) {
        boolean z;
        boolean z2;
        synchronized (this.f9874a) {
            InterfaceC3825e interfaceC3825e = this.f9875b;
            z = false;
            if (interfaceC3825e != null && !interfaceC3825e.mo6439e(this)) {
                z2 = false;
                if (z2 && m6455k(interfaceC3823c)) {
                    z = true;
                }
            }
            z2 = true;
            if (z2) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3825e
    /* renamed from: f */
    public final boolean mo6438f(InterfaceC3823c interfaceC3823c) {
        boolean z;
        boolean z2;
        synchronized (this.f9874a) {
            InterfaceC3825e interfaceC3825e = this.f9875b;
            z = false;
            if (interfaceC3825e != null && !interfaceC3825e.mo6438f(this)) {
                z2 = false;
                if (z2 && m6455k(interfaceC3823c)) {
                    z = true;
                }
            }
            z2 = true;
            if (z2) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3823c
    /* renamed from: g */
    public final void mo6437g() {
        synchronized (this.f9874a) {
            if (this.f9878e != 1) {
                this.f9878e = 1;
                this.f9876c.mo6437g();
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3825e
    public final InterfaceC3825e getRoot() {
        InterfaceC3825e root;
        synchronized (this.f9874a) {
            InterfaceC3825e interfaceC3825e = this.f9875b;
            root = interfaceC3825e != null ? interfaceC3825e.getRoot() : this;
        }
        return root;
    }

    @Override // com.bumptech.glide.request.InterfaceC3825e
    /* renamed from: h */
    public final void mo6436h(InterfaceC3823c interfaceC3823c) {
        synchronized (this.f9874a) {
            if (interfaceC3823c.equals(this.f9876c)) {
                this.f9878e = 4;
            } else if (interfaceC3823c.equals(this.f9877d)) {
                this.f9879f = 4;
            }
            InterfaceC3825e interfaceC3825e = this.f9875b;
            if (interfaceC3825e != null) {
                interfaceC3825e.mo6436h(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3823c
    /* renamed from: i */
    public final boolean mo6435i() {
        boolean z;
        synchronized (this.f9874a) {
            z = this.f9878e == 4 || this.f9879f == 4;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3823c
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f9874a) {
            z = true;
            if (this.f9878e != 1 && this.f9879f != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3825e
    /* renamed from: j */
    public final boolean mo6434j(InterfaceC3823c interfaceC3823c) {
        boolean z;
        boolean z2;
        synchronized (this.f9874a) {
            InterfaceC3825e interfaceC3825e = this.f9875b;
            z = false;
            if (interfaceC3825e != null && !interfaceC3825e.mo6434j(this)) {
                z2 = false;
                if (z2 && m6455k(interfaceC3823c)) {
                    z = true;
                }
            }
            z2 = true;
            if (z2) {
                z = true;
            }
        }
        return z;
    }

    @GuardedBy("requestLock")
    /* renamed from: k */
    public final boolean m6455k(InterfaceC3823c interfaceC3823c) {
        return interfaceC3823c.equals(this.f9876c) || (this.f9878e == 5 && interfaceC3823c.equals(this.f9877d));
    }

    @Override // com.bumptech.glide.request.InterfaceC3823c
    public final void pause() {
        synchronized (this.f9874a) {
            if (this.f9878e == 1) {
                this.f9878e = 2;
                this.f9876c.pause();
            }
            if (this.f9879f == 1) {
                this.f9879f = 2;
                this.f9877d.pause();
            }
        }
    }
}

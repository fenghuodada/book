package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* renamed from: com.bumptech.glide.request.j */
/* loaded from: classes.dex */
public final class C3830j implements InterfaceC3825e, InterfaceC3823c {
    @Nullable

    /* renamed from: a */
    public final InterfaceC3825e f9910a;

    /* renamed from: b */
    public final Object f9911b;

    /* renamed from: c */
    public volatile InterfaceC3823c f9912c;

    /* renamed from: d */
    public volatile InterfaceC3823c f9913d;
    @GuardedBy("requestLock")

    /* renamed from: e */
    public int f9914e = 3;
    @GuardedBy("requestLock")

    /* renamed from: f */
    public int f9915f = 3;
    @GuardedBy("requestLock")

    /* renamed from: g */
    public boolean f9916g;

    public C3830j(Object obj, @Nullable InterfaceC3825e interfaceC3825e) {
        this.f9911b = obj;
        this.f9910a = interfaceC3825e;
    }

    @Override // com.bumptech.glide.request.InterfaceC3825e, com.bumptech.glide.request.InterfaceC3823c
    /* renamed from: a */
    public final boolean mo6443a() {
        boolean z;
        synchronized (this.f9911b) {
            z = this.f9913d.mo6443a() || this.f9912c.mo6443a();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3825e
    /* renamed from: b */
    public final void mo6442b(InterfaceC3823c interfaceC3823c) {
        synchronized (this.f9911b) {
            if (!interfaceC3823c.equals(this.f9912c)) {
                this.f9915f = 5;
                return;
            }
            this.f9914e = 5;
            InterfaceC3825e interfaceC3825e = this.f9910a;
            if (interfaceC3825e != null) {
                interfaceC3825e.mo6442b(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3823c
    /* renamed from: c */
    public final boolean mo6441c(InterfaceC3823c interfaceC3823c) {
        if (interfaceC3823c instanceof C3830j) {
            C3830j c3830j = (C3830j) interfaceC3823c;
            if (this.f9912c == null) {
                if (c3830j.f9912c != null) {
                    return false;
                }
            } else if (!this.f9912c.mo6441c(c3830j.f9912c)) {
                return false;
            }
            if (this.f9913d == null) {
                if (c3830j.f9913d != null) {
                    return false;
                }
            } else if (!this.f9913d.mo6441c(c3830j.f9913d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.bumptech.glide.request.InterfaceC3823c
    public final void clear() {
        synchronized (this.f9911b) {
            this.f9916g = false;
            this.f9914e = 3;
            this.f9915f = 3;
            this.f9913d.clear();
            this.f9912c.clear();
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3823c
    /* renamed from: d */
    public final boolean mo6440d() {
        boolean z;
        synchronized (this.f9911b) {
            z = this.f9914e == 3;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3825e
    /* renamed from: e */
    public final boolean mo6439e(InterfaceC3823c interfaceC3823c) {
        boolean z;
        boolean z2;
        synchronized (this.f9911b) {
            InterfaceC3825e interfaceC3825e = this.f9910a;
            z = false;
            if (interfaceC3825e != null && !interfaceC3825e.mo6439e(this)) {
                z2 = false;
                if (z2 && interfaceC3823c.equals(this.f9912c) && !mo6443a()) {
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
        synchronized (this.f9911b) {
            InterfaceC3825e interfaceC3825e = this.f9910a;
            z = false;
            if (interfaceC3825e != null && !interfaceC3825e.mo6438f(this)) {
                z2 = false;
                if (z2 && (interfaceC3823c.equals(this.f9912c) || this.f9914e != 4)) {
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
        synchronized (this.f9911b) {
            this.f9916g = true;
            if (this.f9914e != 4 && this.f9915f != 1) {
                this.f9915f = 1;
                this.f9913d.mo6437g();
            }
            if (this.f9916g && this.f9914e != 1) {
                this.f9914e = 1;
                this.f9912c.mo6437g();
            }
            this.f9916g = false;
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3825e
    public final InterfaceC3825e getRoot() {
        InterfaceC3825e root;
        synchronized (this.f9911b) {
            InterfaceC3825e interfaceC3825e = this.f9910a;
            root = interfaceC3825e != null ? interfaceC3825e.getRoot() : this;
        }
        return root;
    }

    @Override // com.bumptech.glide.request.InterfaceC3825e
    /* renamed from: h */
    public final void mo6436h(InterfaceC3823c interfaceC3823c) {
        synchronized (this.f9911b) {
            if (interfaceC3823c.equals(this.f9913d)) {
                this.f9915f = 4;
                return;
            }
            this.f9914e = 4;
            InterfaceC3825e interfaceC3825e = this.f9910a;
            if (interfaceC3825e != null) {
                interfaceC3825e.mo6436h(this);
            }
            if (!C3824d.m6454a(this.f9915f)) {
                this.f9913d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.InterfaceC3823c
    /* renamed from: i */
    public final boolean mo6435i() {
        boolean z;
        synchronized (this.f9911b) {
            z = this.f9914e == 4;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.InterfaceC3823c
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f9911b) {
            z = true;
            if (this.f9914e != 1) {
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
        synchronized (this.f9911b) {
            InterfaceC3825e interfaceC3825e = this.f9910a;
            z = false;
            if (interfaceC3825e != null && !interfaceC3825e.mo6434j(this)) {
                z2 = false;
                if (z2 && interfaceC3823c.equals(this.f9912c) && this.f9914e != 2) {
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
    public final void pause() {
        synchronized (this.f9911b) {
            if (!C3824d.m6454a(this.f9915f)) {
                this.f9915f = 2;
                this.f9913d.pause();
            }
            if (!C3824d.m6454a(this.f9914e)) {
                this.f9914e = 2;
                this.f9912c.pause();
            }
        }
    }
}

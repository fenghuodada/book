package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.load.data.InterfaceC3452d;
import com.bumptech.glide.load.engine.C3549n;
import com.bumptech.glide.load.engine.InterfaceC3532h;
import com.bumptech.glide.load.model.InterfaceC3627o;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.e */
/* loaded from: classes.dex */
public final class C3526e implements InterfaceC3532h, InterfaceC3452d.InterfaceC3453a<Object> {

    /* renamed from: a */
    public final List<InterfaceC3577g> f9316a;

    /* renamed from: b */
    public final C3534i<?> f9317b;

    /* renamed from: c */
    public final InterfaceC3532h.InterfaceC3533a f9318c;

    /* renamed from: d */
    public int f9319d = -1;

    /* renamed from: e */
    public InterfaceC3577g f9320e;

    /* renamed from: f */
    public List<InterfaceC3627o<File, ?>> f9321f;

    /* renamed from: g */
    public int f9322g;

    /* renamed from: h */
    public volatile InterfaceC3627o.C3628a<?> f9323h;

    /* renamed from: i */
    public File f9324i;

    public C3526e(List<InterfaceC3577g> list, C3534i<?> c3534i, InterfaceC3532h.InterfaceC3533a interfaceC3533a) {
        this.f9316a = list;
        this.f9317b = c3534i;
        this.f9318c = interfaceC3533a;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3532h
    /* renamed from: b */
    public final boolean mo6610b() {
        boolean z;
        boolean z2;
        boolean z3;
        while (true) {
            List<InterfaceC3627o<File, ?>> list = this.f9321f;
            if (list != null) {
                if (this.f9322g < list.size()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f9323h = null;
                    boolean z4 = false;
                    while (!z4) {
                        if (this.f9322g < this.f9321f.size()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            break;
                        }
                        List<InterfaceC3627o<File, ?>> list2 = this.f9321f;
                        int i = this.f9322g;
                        this.f9322g = i + 1;
                        File file = this.f9324i;
                        C3534i<?> c3534i = this.f9317b;
                        this.f9323h = list2.get(i).mo6573b(file, c3534i.f9341e, c3534i.f9342f, c3534i.f9345i);
                        if (this.f9323h != null) {
                            if (this.f9317b.m6667c(this.f9323h.f9567c.mo6579a()) != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                this.f9323h.f9567c.mo6576e(this.f9317b.f9351o, this);
                                z4 = true;
                            }
                        }
                    }
                    return z4;
                }
            }
            int i2 = this.f9319d + 1;
            this.f9319d = i2;
            if (i2 >= this.f9316a.size()) {
                return false;
            }
            InterfaceC3577g interfaceC3577g = this.f9316a.get(this.f9319d);
            C3534i<?> c3534i2 = this.f9317b;
            File mo6674b = ((C3549n.C3554c) c3534i2.f9344h).m6632a().mo6674b(new C3530f(interfaceC3577g, c3534i2.f9350n));
            this.f9324i = mo6674b;
            if (mo6674b != null) {
                this.f9320e = interfaceC3577g;
                this.f9321f = this.f9317b.f9339c.f9077b.m6741g(mo6674b);
                this.f9322g = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d.InterfaceC3453a
    /* renamed from: c */
    public final void mo6590c(@NonNull Exception exc) {
        this.f9318c.mo6664a(this.f9320e, exc, this.f9323h.f9567c, EnumC3444a.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3532h
    public final void cancel() {
        InterfaceC3627o.C3628a<?> c3628a = this.f9323h;
        if (c3628a != null) {
            c3628a.f9567c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d.InterfaceC3453a
    /* renamed from: f */
    public final void mo6589f(Object obj) {
        this.f9318c.mo6662d(this.f9320e, obj, this.f9323h.f9567c, EnumC3444a.DATA_DISK_CACHE, this.f9320e);
    }
}

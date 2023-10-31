package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.C3433j;
import com.bumptech.glide.load.EnumC3444a;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.load.InterfaceC3585m;
import com.bumptech.glide.load.data.InterfaceC3452d;
import com.bumptech.glide.load.engine.C3549n;
import com.bumptech.glide.load.engine.InterfaceC3532h;
import com.bumptech.glide.load.model.InterfaceC3627o;
import com.bumptech.glide.provider.C3816d;
import com.bumptech.glide.util.C3859i;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.y */
/* loaded from: classes.dex */
public final class C3574y implements InterfaceC3532h, InterfaceC3452d.InterfaceC3453a<Object> {

    /* renamed from: a */
    public final InterfaceC3532h.InterfaceC3533a f9495a;

    /* renamed from: b */
    public final C3534i<?> f9496b;

    /* renamed from: c */
    public int f9497c;

    /* renamed from: d */
    public int f9498d = -1;

    /* renamed from: e */
    public InterfaceC3577g f9499e;

    /* renamed from: f */
    public List<InterfaceC3627o<File, ?>> f9500f;

    /* renamed from: g */
    public int f9501g;

    /* renamed from: h */
    public volatile InterfaceC3627o.C3628a<?> f9502h;

    /* renamed from: i */
    public File f9503i;

    /* renamed from: j */
    public C3575z f9504j;

    public C3574y(C3534i<?> c3534i, InterfaceC3532h.InterfaceC3533a interfaceC3533a) {
        this.f9496b = c3534i;
        this.f9495a = interfaceC3533a;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3532h
    /* renamed from: b */
    public final boolean mo6610b() {
        List<Class<?>> orDefault;
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList m6669a = this.f9496b.m6669a();
        if (m6669a.isEmpty()) {
            return false;
        }
        C3534i<?> c3534i = this.f9496b;
        C3433j c3433j = c3534i.f9339c.f9077b;
        Class<?> cls = c3534i.f9340d.getClass();
        Class<?> cls2 = c3534i.f9343g;
        Class<?> cls3 = c3534i.f9347k;
        C3816d c3816d = c3433j.f9146h;
        C3859i andSet = c3816d.f9838a.getAndSet(null);
        if (andSet == null) {
            andSet = new C3859i(cls, cls2, cls3);
        } else {
            andSet.f9953a = cls;
            andSet.f9954b = cls2;
            andSet.f9955c = cls3;
        }
        synchronized (c3816d.f9839b) {
            orDefault = c3816d.f9839b.getOrDefault(andSet, null);
        }
        c3816d.f9838a.set(andSet);
        ArrayList arrayList = orDefault;
        if (orDefault == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = c3433j.f9139a.m6591a(cls).iterator();
            while (it.hasNext()) {
                Iterator it2 = c3433j.f9141c.m6473b((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!c3433j.f9144f.m6499b(cls4, cls3).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            c3433j.f9146h.m6475a(cls, cls2, cls3, Collections.unmodifiableList(arrayList2));
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            if (File.class.equals(this.f9496b.f9347k)) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f9496b.f9340d.getClass() + " to " + this.f9496b.f9347k);
        }
        while (true) {
            List<InterfaceC3627o<File, ?>> list = this.f9500f;
            if (list != null) {
                if (this.f9501g < list.size()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f9502h = null;
                    boolean z4 = false;
                    while (!z4) {
                        if (this.f9501g < this.f9500f.size()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            break;
                        }
                        List<InterfaceC3627o<File, ?>> list2 = this.f9500f;
                        int i = this.f9501g;
                        this.f9501g = i + 1;
                        File file = this.f9503i;
                        C3534i<?> c3534i2 = this.f9496b;
                        this.f9502h = list2.get(i).mo6573b(file, c3534i2.f9341e, c3534i2.f9342f, c3534i2.f9345i);
                        if (this.f9502h != null) {
                            if (this.f9496b.m6667c(this.f9502h.f9567c.mo6579a()) != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                this.f9502h.f9567c.mo6576e(this.f9496b.f9351o, this);
                                z4 = true;
                            }
                        }
                    }
                    return z4;
                }
            }
            int i2 = this.f9498d + 1;
            this.f9498d = i2;
            if (i2 >= arrayList.size()) {
                int i3 = this.f9497c + 1;
                this.f9497c = i3;
                if (i3 >= m6669a.size()) {
                    return false;
                }
                this.f9498d = 0;
            }
            InterfaceC3577g interfaceC3577g = (InterfaceC3577g) m6669a.get(this.f9497c);
            Class<?> cls5 = arrayList.get(this.f9498d);
            InterfaceC3585m<Z> m6665e = this.f9496b.m6665e(cls5);
            C3534i<?> c3534i3 = this.f9496b;
            this.f9504j = new C3575z(c3534i3.f9339c.f9076a, interfaceC3577g, c3534i3.f9350n, c3534i3.f9341e, c3534i3.f9342f, m6665e, cls5, c3534i3.f9345i);
            File mo6674b = ((C3549n.C3554c) c3534i3.f9344h).m6632a().mo6674b(this.f9504j);
            this.f9503i = mo6674b;
            if (mo6674b != null) {
                this.f9499e = interfaceC3577g;
                this.f9500f = this.f9496b.f9339c.f9077b.m6741g(mo6674b);
                this.f9501g = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d.InterfaceC3453a
    /* renamed from: c */
    public final void mo6590c(@NonNull Exception exc) {
        this.f9495a.mo6664a(this.f9504j, exc, this.f9502h.f9567c, EnumC3444a.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC3532h
    public final void cancel() {
        InterfaceC3627o.C3628a<?> c3628a = this.f9502h;
        if (c3628a != null) {
            c3628a.f9567c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3452d.InterfaceC3453a
    /* renamed from: f */
    public final void mo6589f(Object obj) {
        this.f9495a.mo6662d(this.f9499e, obj, this.f9502h.f9567c, EnumC3444a.RESOURCE_DISK_CACHE, this.f9504j);
    }
}

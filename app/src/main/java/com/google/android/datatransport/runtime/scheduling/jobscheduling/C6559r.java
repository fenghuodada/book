package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.C6429b;
import com.google.android.datatransport.runtime.AbstractC6517k;
import com.google.android.datatransport.runtime.AbstractC6522n;
import com.google.android.datatransport.runtime.C6477b;
import com.google.android.datatransport.runtime.C6511g;
import com.google.android.datatransport.runtime.backends.C6479a;
import com.google.android.datatransport.runtime.backends.C6480b;
import com.google.android.datatransport.runtime.backends.InterfaceC6483e;
import com.google.android.datatransport.runtime.backends.InterfaceC6494o;
import com.google.android.datatransport.runtime.firebase.transport.C6503a;
import com.google.android.datatransport.runtime.firebase.transport.C6506c;
import com.google.android.datatransport.runtime.logging.C6520a;
import com.google.android.datatransport.runtime.scheduling.persistence.AbstractC6591k;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6572c;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6574d;
import com.google.android.datatransport.runtime.synchronization.InterfaceC6608b;
import com.google.android.datatransport.runtime.time.InterfaceC6611a;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.inject.Inject;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.r */
/* loaded from: classes.dex */
public final class C6559r {

    /* renamed from: a */
    public final Context f10360a;

    /* renamed from: b */
    public final InterfaceC6483e f10361b;

    /* renamed from: c */
    public final InterfaceC6574d f10362c;

    /* renamed from: d */
    public final InterfaceC6565x f10363d;

    /* renamed from: e */
    public final Executor f10364e;

    /* renamed from: f */
    public final InterfaceC6608b f10365f;

    /* renamed from: g */
    public final InterfaceC6611a f10366g;

    /* renamed from: h */
    public final InterfaceC6611a f10367h;

    /* renamed from: i */
    public final InterfaceC6572c f10368i;

    @Inject
    public C6559r(Context context, InterfaceC6483e interfaceC6483e, InterfaceC6574d interfaceC6574d, InterfaceC6565x interfaceC6565x, Executor executor, InterfaceC6608b interfaceC6608b, @WallTime InterfaceC6611a interfaceC6611a, @Monotonic InterfaceC6611a interfaceC6611a2, InterfaceC6572c interfaceC6572c) {
        this.f10360a = context;
        this.f10361b = interfaceC6483e;
        this.f10362c = interfaceC6574d;
        this.f10363d = interfaceC6565x;
        this.f10364e = executor;
        this.f10365f = interfaceC6608b;
        this.f10366g = interfaceC6611a;
        this.f10367h = interfaceC6611a2;
        this.f10368i = interfaceC6572c;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: a */
    public final void m6260a(final AbstractC6522n abstractC6522n, int i) {
        boolean z;
        C6480b mo6302b;
        int valueOf;
        InterfaceC6494o interfaceC6494o = this.f10361b.get(abstractC6522n.mo6277b());
        new C6480b(1, 0L);
        final long j = 0;
        while (true) {
            boolean z2 = false;
            C6548g c6548g = new C6548g(0, this, abstractC6522n);
            InterfaceC6608b interfaceC6608b = this.f10365f;
            if (((Boolean) interfaceC6608b.mo6227c(c6548g)).booleanValue()) {
                final Iterable<AbstractC6591k> iterable = (Iterable) interfaceC6608b.mo6227c(new InterfaceC6608b.InterfaceC6609a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.i
                    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6608b.InterfaceC6609a
                    public final Object execute() {
                        return C6559r.this.f10362c.mo6243n(abstractC6522n);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return;
                }
                if (interfaceC6494o == null) {
                    C6520a.m6286a(abstractC6522n, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                    mo6302b = new C6480b(3, -1L);
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (AbstractC6591k abstractC6591k : iterable) {
                        arrayList.add(abstractC6591k.mo6232a());
                    }
                    if (abstractC6522n.mo6276c() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        InterfaceC6572c interfaceC6572c = this.f10368i;
                        Objects.requireNonNull(interfaceC6572c);
                        C6503a c6503a = (C6503a) interfaceC6608b.mo6227c(new C6556o(interfaceC6572c));
                        C6477b.C6478a c6478a = new C6477b.C6478a();
                        c6478a.f10201f = new HashMap();
                        c6478a.f10199d = Long.valueOf(this.f10366g.mo6226a());
                        c6478a.f10200e = Long.valueOf(this.f10367h.mo6226a());
                        c6478a.m6314d("GDT_CLIENT_METRICS");
                        C6429b c6429b = new C6429b("proto");
                        c6503a.getClass();
                        c6478a.m6315c(new C6511g(c6429b, AbstractC6517k.f10275a.encode(c6503a)));
                        arrayList.add(interfaceC6494o.mo6303a(c6478a.m6316b()));
                    }
                    mo6302b = interfaceC6494o.mo6302b(new C6479a(arrayList, abstractC6522n.mo6276c()));
                }
                if (mo6302b.f10204a == 2) {
                    interfaceC6608b.mo6227c(new InterfaceC6608b.InterfaceC6609a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.j
                        @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6608b.InterfaceC6609a
                        public final Object execute() {
                            C6559r c6559r = C6559r.this;
                            InterfaceC6574d interfaceC6574d = c6559r.f10362c;
                            interfaceC6574d.mo6246D(iterable);
                            interfaceC6574d.mo6241t(c6559r.f10366g.mo6226a() + j, abstractC6522n);
                            return null;
                        }
                    });
                    this.f10363d.mo6258b(abstractC6522n, i + 1, true);
                    return;
                }
                interfaceC6608b.mo6227c(new C6552k(this, iterable));
                int i2 = mo6302b.f10204a;
                if (i2 == 1) {
                    j = Math.max(j, mo6302b.f10205b);
                    if (abstractC6522n.mo6276c() != null) {
                        z2 = true;
                    }
                    if (z2) {
                        interfaceC6608b.mo6227c(new C6553l(this));
                    }
                } else if (i2 == 4) {
                    final HashMap hashMap = new HashMap();
                    for (AbstractC6591k abstractC6591k2 : iterable) {
                        String mo6291g = abstractC6591k2.mo6232a().mo6291g();
                        if (!hashMap.containsKey(mo6291g)) {
                            valueOf = 1;
                        } else {
                            valueOf = Integer.valueOf(((Integer) hashMap.get(mo6291g)).intValue() + 1);
                        }
                        hashMap.put(mo6291g, valueOf);
                    }
                    interfaceC6608b.mo6227c(new InterfaceC6608b.InterfaceC6609a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.m
                        @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6608b.InterfaceC6609a
                        public final Object execute() {
                            C6559r c6559r = C6559r.this;
                            c6559r.getClass();
                            for (Map.Entry entry : hashMap.entrySet()) {
                                c6559r.f10368i.mo6249e(((Integer) entry.getValue()).intValue(), C6506c.EnumC6507a.INVALID_PAYLOD, (String) entry.getKey());
                            }
                            return null;
                        }
                    });
                }
            } else {
                interfaceC6608b.mo6227c(new InterfaceC6608b.InterfaceC6609a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.n
                    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6608b.InterfaceC6609a
                    public final Object execute() {
                        C6559r c6559r = C6559r.this;
                        c6559r.f10362c.mo6241t(c6559r.f10366g.mo6226a() + j, abstractC6522n);
                        return null;
                    }
                });
                return;
            }
        }
    }
}

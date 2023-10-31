package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.C6429b;
import com.google.android.datatransport.cct.C6431a;
import com.google.android.datatransport.runtime.C6496d;
import com.google.android.datatransport.runtime.scheduling.InterfaceC6533e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6559r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6563v;
import com.google.android.datatransport.runtime.time.InterfaceC6611a;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
/* renamed from: com.google.android.datatransport.runtime.r */
/* loaded from: classes.dex */
public final class C6527r implements InterfaceC6526q {

    /* renamed from: e */
    public static volatile C6501e f10286e;

    /* renamed from: a */
    public final InterfaceC6611a f10287a;

    /* renamed from: b */
    public final InterfaceC6611a f10288b;

    /* renamed from: c */
    public final InterfaceC6533e f10289c;

    /* renamed from: d */
    public final C6559r f10290d;

    @Inject
    public C6527r(@WallTime InterfaceC6611a interfaceC6611a, @Monotonic InterfaceC6611a interfaceC6611a2, InterfaceC6533e interfaceC6533e, C6559r c6559r, final C6563v c6563v) {
        this.f10287a = interfaceC6611a;
        this.f10288b = interfaceC6611a2;
        this.f10289c = interfaceC6533e;
        this.f10290d = c6559r;
        c6563v.getClass();
        c6563v.f10380a.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.t
            @Override // java.lang.Runnable
            public final void run() {
                C6563v c6563v2 = C6563v.this;
                c6563v2.getClass();
                c6563v2.f10383d.mo6227c(new C6562u(c6563v2));
            }
        });
    }

    /* renamed from: a */
    public static C6527r m6271a() {
        C6501e c6501e = f10286e;
        if (c6501e != null) {
            return c6501e.f10243f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: b */
    public static void m6270b(Context context) {
        if (f10286e == null) {
            synchronized (C6527r.class) {
                if (f10286e == null) {
                    context.getClass();
                    f10286e = new C6501e(context);
                }
            }
        }
    }

    /* renamed from: c */
    public final C6524o m6269c(C6431a c6431a) {
        Set singleton;
        if (c6431a instanceof InterfaceC6502f) {
            c6431a.getClass();
            singleton = Collections.unmodifiableSet(C6431a.f10061d);
        } else {
            singleton = Collections.singleton(new C6429b("proto"));
        }
        C6496d.C6497a m6278a = AbstractC6522n.m6278a();
        c6431a.getClass();
        m6278a.m6300b("cct");
        m6278a.f10232b = c6431a.m6352b();
        return new C6524o(singleton, m6278a.m6301a(), this);
    }
}

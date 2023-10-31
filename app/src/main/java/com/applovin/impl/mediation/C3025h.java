package com.applovin.impl.mediation;

import com.applovin.impl.mediation.p011a.AbstractC2823a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.h */
/* loaded from: classes.dex */
public class C3025h {

    /* renamed from: a */
    private final List<InterfaceC3026a> f7496a = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.applovin.impl.mediation.h$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3026a {
        /* renamed from: a */
        void mo7604a(AbstractC2823a abstractC2823a);
    }

    /* renamed from: a */
    public void m8114a(AbstractC2823a abstractC2823a) {
        Iterator it = new ArrayList(this.f7496a).iterator();
        while (it.hasNext()) {
            ((InterfaceC3026a) it.next()).mo7604a(abstractC2823a);
        }
    }

    /* renamed from: a */
    public void m8113a(InterfaceC3026a interfaceC3026a) {
        this.f7496a.add(interfaceC3026a);
    }

    /* renamed from: b */
    public void m8112b(InterfaceC3026a interfaceC3026a) {
        this.f7496a.remove(interfaceC3026a);
    }
}

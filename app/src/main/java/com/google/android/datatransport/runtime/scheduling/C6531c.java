package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.InterfaceC6468h;
import com.google.android.datatransport.runtime.AbstractC6512h;
import com.google.android.datatransport.runtime.AbstractC6522n;
import com.google.android.datatransport.runtime.C6477b;
import com.google.android.datatransport.runtime.C6496d;
import com.google.android.datatransport.runtime.C6527r;
import com.google.android.datatransport.runtime.backends.InterfaceC6483e;
import com.google.android.datatransport.runtime.backends.InterfaceC6494o;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6565x;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6574d;
import com.google.android.datatransport.runtime.synchronization.InterfaceC6608b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.inject.Inject;

/* renamed from: com.google.android.datatransport.runtime.scheduling.c */
/* loaded from: classes.dex */
public final class C6531c implements InterfaceC6533e {

    /* renamed from: f */
    public static final Logger f10298f = Logger.getLogger(C6527r.class.getName());

    /* renamed from: a */
    public final InterfaceC6565x f10299a;

    /* renamed from: b */
    public final Executor f10300b;

    /* renamed from: c */
    public final InterfaceC6483e f10301c;

    /* renamed from: d */
    public final InterfaceC6574d f10302d;

    /* renamed from: e */
    public final InterfaceC6608b f10303e;

    @Inject
    public C6531c(Executor executor, InterfaceC6483e interfaceC6483e, InterfaceC6565x interfaceC6565x, InterfaceC6574d interfaceC6574d, InterfaceC6608b interfaceC6608b) {
        this.f10300b = executor;
        this.f10301c = interfaceC6483e;
        this.f10299a = interfaceC6565x;
        this.f10302d = interfaceC6574d;
        this.f10303e = interfaceC6608b;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.InterfaceC6533e
    /* renamed from: a */
    public final void mo6268a(final InterfaceC6468h interfaceC6468h, final C6477b c6477b, final C6496d c6496d) {
        this.f10300b.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.a
            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC6522n abstractC6522n = c6496d;
                InterfaceC6468h interfaceC6468h2 = interfaceC6468h;
                AbstractC6512h abstractC6512h = c6477b;
                final C6531c c6531c = C6531c.this;
                c6531c.getClass();
                Logger logger = C6531c.f10298f;
                try {
                    InterfaceC6494o interfaceC6494o = c6531c.f10301c.get(abstractC6522n.mo6277b());
                    if (interfaceC6494o == null) {
                        String format = String.format("Transport backend '%s' is not registered", abstractC6522n.mo6277b());
                        logger.warning(format);
                        interfaceC6468h2.mo3314a(new IllegalArgumentException(format));
                    } else {
                        final C6477b mo6303a = interfaceC6494o.mo6303a(abstractC6512h);
                        c6531c.f10303e.mo6227c(new InterfaceC6608b.InterfaceC6609a() { // from class: com.google.android.datatransport.runtime.scheduling.b
                            @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6608b.InterfaceC6609a
                            public final Object execute() {
                                C6531c c6531c2 = C6531c.this;
                                InterfaceC6574d interfaceC6574d = c6531c2.f10302d;
                                AbstractC6512h abstractC6512h2 = mo6303a;
                                AbstractC6522n abstractC6522n2 = abstractC6522n;
                                interfaceC6574d.mo6240z(abstractC6522n2, abstractC6512h2);
                                c6531c2.f10299a.mo6259a(abstractC6522n2, 1);
                                return null;
                            }
                        });
                        interfaceC6468h2.mo3314a(null);
                    }
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    interfaceC6468h2.mo3314a(e);
                }
            }
        });
    }
}

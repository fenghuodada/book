package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6574d;
import com.google.android.datatransport.runtime.synchronization.InterfaceC6608b;
import java.util.concurrent.Executor;
import javax.inject.Inject;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.v */
/* loaded from: classes.dex */
public final class C6563v {

    /* renamed from: a */
    public final Executor f10380a;

    /* renamed from: b */
    public final InterfaceC6574d f10381b;

    /* renamed from: c */
    public final InterfaceC6565x f10382c;

    /* renamed from: d */
    public final InterfaceC6608b f10383d;

    @Inject
    public C6563v(Executor executor, InterfaceC6574d interfaceC6574d, InterfaceC6565x interfaceC6565x, InterfaceC6608b interfaceC6608b) {
        this.f10380a = executor;
        this.f10381b = interfaceC6574d;
        this.f10382c = interfaceC6565x;
        this.f10383d = interfaceC6608b;
    }
}

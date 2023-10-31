package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.InterfaceC6483e;
import com.google.android.datatransport.runtime.dagger.internal.InterfaceC6499b;
import com.google.android.datatransport.runtime.scheduling.C6537i;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6572c;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6574d;
import com.google.android.datatransport.runtime.synchronization.InterfaceC6608b;
import com.google.android.datatransport.runtime.time.C6613c;
import com.google.android.datatransport.runtime.time.C6615d;
import com.google.android.datatransport.runtime.time.InterfaceC6611a;
import java.util.concurrent.Executor;
import javax.inject.InterfaceC10733a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.s */
/* loaded from: classes.dex */
public final class C6560s implements InterfaceC6499b<C6559r> {

    /* renamed from: a */
    public final InterfaceC10733a<Context> f10369a;

    /* renamed from: b */
    public final InterfaceC10733a<InterfaceC6483e> f10370b;

    /* renamed from: c */
    public final InterfaceC10733a<InterfaceC6574d> f10371c;

    /* renamed from: d */
    public final InterfaceC10733a<InterfaceC6565x> f10372d;

    /* renamed from: e */
    public final InterfaceC10733a<Executor> f10373e;

    /* renamed from: f */
    public final InterfaceC10733a<InterfaceC6608b> f10374f;

    /* renamed from: g */
    public final InterfaceC10733a<InterfaceC6611a> f10375g;

    /* renamed from: h */
    public final InterfaceC10733a<InterfaceC6611a> f10376h;

    /* renamed from: i */
    public final InterfaceC10733a<InterfaceC6572c> f10377i;

    public C6560s(InterfaceC10733a interfaceC10733a, InterfaceC10733a interfaceC10733a2, InterfaceC10733a interfaceC10733a3, C6537i c6537i, InterfaceC10733a interfaceC10733a4, InterfaceC10733a interfaceC10733a5, InterfaceC10733a interfaceC10733a6) {
        C6613c c6613c = C6613c.C6614a.f10452a;
        C6615d c6615d = C6615d.C6616a.f10453a;
        this.f10369a = interfaceC10733a;
        this.f10370b = interfaceC10733a2;
        this.f10371c = interfaceC10733a3;
        this.f10372d = c6537i;
        this.f10373e = interfaceC10733a4;
        this.f10374f = interfaceC10733a5;
        this.f10375g = c6613c;
        this.f10376h = c6615d;
        this.f10377i = interfaceC10733a6;
    }

    @Override // javax.inject.InterfaceC10733a
    public final Object get() {
        return new C6559r(this.f10369a.get(), this.f10370b.get(), this.f10371c.get(), this.f10372d.get(), this.f10373e.get(), this.f10374f.get(), this.f10375g.get(), this.f10376h.get(), this.f10377i.get());
    }
}

package com.unity3d.services.core.misc;

import com.unity3d.services.core.timer.InterfaceC9614d;
import com.unity3d.services.core.timer.InterfaceC9615e;
import com.unity3d.services.core.timer.InterfaceC9616f;
import java.util.Queue;
import java.util.concurrent.Executors;

/* renamed from: com.unity3d.services.core.misc.a */
/* loaded from: classes3.dex */
public class C9554a<T> {

    /* renamed from: a */
    InterfaceC9614d f18921a;

    /* renamed from: b */
    Queue<T> f18922b;

    /* renamed from: c */
    private InterfaceC9556b<T> f18923c;

    /* renamed from: com.unity3d.services.core.misc.a$a */
    /* loaded from: classes3.dex */
    public class C9555a implements InterfaceC9616f {
        public C9555a() {
        }

        @Override // com.unity3d.services.core.timer.InterfaceC9616f
        /* renamed from: a */
        public void mo1799a() {
            C9554a.this.m2006c();
        }
    }

    public C9554a(Queue<T> queue, Integer num, InterfaceC9615e interfaceC9615e) {
        this.f18922b = queue;
        this.f18921a = interfaceC9615e.mo1800a(num, Integer.valueOf(queue.size()), new C9555a());
    }

    /* renamed from: b */
    private void m2007b() {
        InterfaceC9614d interfaceC9614d = this.f18921a;
        if (interfaceC9614d != null) {
            interfaceC9614d.mo1797a();
            this.f18921a = null;
        }
    }

    /* renamed from: d */
    private void m2005d() {
        InterfaceC9614d interfaceC9614d = this.f18921a;
        if (interfaceC9614d != null) {
            interfaceC9614d.mo1801a(Executors.newSingleThreadScheduledExecutor());
        }
    }

    /* renamed from: a */
    public void m2008a(InterfaceC9556b<T> interfaceC9556b) {
        Queue<T> queue = this.f18922b;
        if (queue == null || queue.size() <= 0 || this.f18921a == null || interfaceC9556b == null) {
            return;
        }
        this.f18923c = interfaceC9556b;
        m2005d();
    }

    /* renamed from: a */
    public boolean m2009a() {
        return this.f18922b.isEmpty();
    }

    /* renamed from: c */
    public void m2006c() {
        InterfaceC9556b<T> interfaceC9556b = this.f18923c;
        if (interfaceC9556b != null) {
            interfaceC9556b.mo2003a(this.f18922b.remove());
        }
        if (this.f18922b.size() <= 0) {
            m2004e();
        }
    }

    /* renamed from: e */
    public void m2004e() {
        m2007b();
        this.f18923c = null;
    }
}

package com.vungle.warren;

import java.util.concurrent.ExecutorService;

/* renamed from: com.vungle.warren.w */
/* loaded from: classes3.dex */
public final class C10124w implements InterfaceC10113v {

    /* renamed from: a */
    public final InterfaceC10113v f20380a;

    /* renamed from: b */
    public final ExecutorService f20381b;

    /* renamed from: com.vungle.warren.w$a */
    /* loaded from: classes3.dex */
    public class RunnableC10125a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f20382a;

        /* renamed from: b */
        public final /* synthetic */ String f20383b;

        public RunnableC10125a(String str, String str2) {
            this.f20382a = str;
            this.f20383b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C10124w.this.f20380a.mo1229a(this.f20382a, this.f20383b);
        }
    }

    /* renamed from: com.vungle.warren.w$b */
    /* loaded from: classes3.dex */
    public class RunnableC10126b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f20385a;

        /* renamed from: b */
        public final /* synthetic */ String f20386b;

        public RunnableC10126b(String str, String str2) {
            this.f20385a = str;
            this.f20386b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C10124w.this.f20380a.mo1228b(this.f20385a, this.f20386b);
        }
    }

    public C10124w(ExecutorService executorService, InterfaceC10113v interfaceC10113v) {
        this.f20380a = interfaceC10113v;
        this.f20381b = executorService;
    }

    @Override // com.vungle.warren.InterfaceC10113v
    /* renamed from: a */
    public final void mo1229a(String str, String str2) {
        if (this.f20380a == null) {
            return;
        }
        this.f20381b.execute(new RunnableC10125a(str, str2));
    }

    @Override // com.vungle.warren.InterfaceC10113v
    /* renamed from: b */
    public final void mo1228b(String str, String str2) {
        if (this.f20380a == null) {
            return;
        }
        this.f20381b.execute(new RunnableC10126b(str, str2));
    }
}

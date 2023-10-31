package com.vungle.warren;

import com.vungle.warren.error.VungleException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.vungle.warren.a0 */
/* loaded from: classes3.dex */
public class C9747a0 implements InterfaceC10136z {

    /* renamed from: a */
    public final InterfaceC10136z f19406a;

    /* renamed from: b */
    public final ExecutorService f19407b;

    /* renamed from: com.vungle.warren.a0$a */
    /* loaded from: classes3.dex */
    public class RunnableC9748a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f19408a;

        public RunnableC9748a(String str) {
            this.f19408a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9747a0.this.f19406a.onAdLoad(this.f19408a);
        }
    }

    /* renamed from: com.vungle.warren.a0$b */
    /* loaded from: classes3.dex */
    public class RunnableC9749b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f19410a;

        /* renamed from: b */
        public final /* synthetic */ VungleException f19411b;

        public RunnableC9749b(String str, VungleException vungleException) {
            this.f19410a = str;
            this.f19411b = vungleException;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9747a0.this.f19406a.onError(this.f19410a, this.f19411b);
        }
    }

    public C9747a0(ExecutorService executorService, InterfaceC10136z interfaceC10136z) {
        this.f19406a = interfaceC10136z;
        this.f19407b = executorService;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9747a0 c9747a0 = (C9747a0) obj;
        InterfaceC10136z interfaceC10136z = c9747a0.f19406a;
        InterfaceC10136z interfaceC10136z2 = this.f19406a;
        if (interfaceC10136z2 == null ? interfaceC10136z == null : interfaceC10136z2.equals(interfaceC10136z)) {
            ExecutorService executorService = c9747a0.f19407b;
            ExecutorService executorService2 = this.f19407b;
            return executorService2 != null ? executorService2.equals(executorService) : executorService == null;
        }
        return false;
    }

    public final int hashCode() {
        InterfaceC10136z interfaceC10136z = this.f19406a;
        int hashCode = (interfaceC10136z != null ? interfaceC10136z.hashCode() : 0) * 31;
        ExecutorService executorService = this.f19407b;
        return hashCode + (executorService != null ? executorService.hashCode() : 0);
    }

    @Override // com.vungle.warren.InterfaceC10136z
    public final void onAdLoad(String str) {
        if (this.f19406a == null) {
            return;
        }
        this.f19407b.execute(new RunnableC9748a(str));
    }

    @Override // com.vungle.warren.InterfaceC10136z, com.vungle.warren.InterfaceC9782e0
    public final void onError(String str, VungleException vungleException) {
        if (this.f19406a == null) {
            return;
        }
        this.f19407b.execute(new RunnableC9749b(str, vungleException));
    }
}

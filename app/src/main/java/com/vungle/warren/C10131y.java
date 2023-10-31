package com.vungle.warren;

import com.vungle.warren.error.VungleException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.vungle.warren.y */
/* loaded from: classes3.dex */
public final class C10131y implements InterfaceC10129x {

    /* renamed from: a */
    public final InterfaceC10129x f20389a;

    /* renamed from: b */
    public final ExecutorService f20390b;

    /* renamed from: com.vungle.warren.y$a */
    /* loaded from: classes3.dex */
    public class RunnableC10132a implements Runnable {
        public RunnableC10132a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C10131y.this.f20389a.onSuccess();
        }
    }

    /* renamed from: com.vungle.warren.y$b */
    /* loaded from: classes3.dex */
    public class RunnableC10133b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ VungleException f20392a;

        public RunnableC10133b(VungleException vungleException) {
            this.f20392a = vungleException;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C10131y.this.f20389a.onError(this.f20392a);
        }
    }

    /* renamed from: com.vungle.warren.y$c */
    /* loaded from: classes3.dex */
    public class RunnableC10134c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f20394a;

        public RunnableC10134c(String str) {
            this.f20394a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C10131y.this.f20389a.onAutoCacheAdAvailable(this.f20394a);
        }
    }

    public C10131y(ExecutorService executorService, InterfaceC10129x interfaceC10129x) {
        this.f20389a = interfaceC10129x;
        this.f20390b = executorService;
    }

    @Override // com.vungle.warren.InterfaceC10129x
    public final void onAutoCacheAdAvailable(String str) {
        if (this.f20389a == null) {
            return;
        }
        this.f20390b.execute(new RunnableC10134c(str));
    }

    @Override // com.vungle.warren.InterfaceC10129x
    public final void onError(VungleException vungleException) {
        if (this.f20389a == null) {
            return;
        }
        this.f20390b.execute(new RunnableC10133b(vungleException));
    }

    @Override // com.vungle.warren.InterfaceC10129x
    public final void onSuccess() {
        if (this.f20389a == null) {
            return;
        }
        this.f20390b.execute(new RunnableC10132a());
    }
}

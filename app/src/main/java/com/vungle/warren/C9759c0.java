package com.vungle.warren;

import androidx.annotation.Nullable;
import com.vungle.warren.model.Advertisement;
import java.util.concurrent.ExecutorService;

/* renamed from: com.vungle.warren.c0 */
/* loaded from: classes3.dex */
public final class C9759c0 extends C9747a0 implements InterfaceC9756b0 {

    /* renamed from: c */
    public final InterfaceC9756b0 f19430c;

    /* renamed from: d */
    public final ExecutorService f19431d;

    /* renamed from: com.vungle.warren.c0$a */
    /* loaded from: classes3.dex */
    public class RunnableC9760a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Advertisement f19432a;

        public RunnableC9760a(Advertisement advertisement) {
            this.f19432a = advertisement;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9759c0.this.f19430c.mo1586a(this.f19432a);
        }
    }

    public C9759c0(ExecutorService executorService, InterfaceC9756b0 interfaceC9756b0) {
        super(executorService, interfaceC9756b0);
        this.f19430c = interfaceC9756b0;
        this.f19431d = executorService;
    }

    @Override // com.vungle.warren.InterfaceC9756b0
    /* renamed from: a */
    public final void mo1586a(@Nullable Advertisement advertisement) {
        if (this.f19430c == null) {
            return;
        }
        this.f19431d.execute(new RunnableC9760a(advertisement));
    }
}

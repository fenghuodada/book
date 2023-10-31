package com.unity3d.services.ads.token;

import android.os.ConditionVariable;
import com.unity3d.services.core.configuration.PrivacyConfig;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.misc.InterfaceC9558d;
import java.util.concurrent.ExecutorService;

/* renamed from: com.unity3d.services.ads.token.e */
/* loaded from: classes3.dex */
public class C9393e implements InterfaceC9389b {

    /* renamed from: a */
    private final InterfaceC9389b f18338a;

    /* renamed from: b */
    private final ConditionVariable f18339b = new ConditionVariable();

    /* renamed from: c */
    private final ExecutorService f18340c;

    /* renamed from: d */
    private final int f18341d;

    /* renamed from: com.unity3d.services.ads.token.e$a */
    /* loaded from: classes3.dex */
    public class C9394a implements InterfaceC9558d<PrivacyConfig> {
        public C9394a() {
        }

        @Override // com.unity3d.services.core.misc.InterfaceC9558d
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo1849a(PrivacyConfig privacyConfig) {
            C9393e.this.f18339b.open();
        }
    }

    /* renamed from: com.unity3d.services.ads.token.e$b */
    /* loaded from: classes3.dex */
    public class RunnableC9395b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC9558d f18343a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC9390c f18344b;

        public RunnableC9395b(InterfaceC9558d interfaceC9558d, InterfaceC9390c interfaceC9390c) {
            this.f18343a = interfaceC9558d;
            this.f18344b = interfaceC9390c;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9393e.this.f18339b.block(C9393e.this.f18341d);
            PrivacyConfigStorage.getInstance().unregisterObserver(this.f18343a);
            C9393e.this.f18338a.mo2380a(this.f18344b);
        }
    }

    public C9393e(ExecutorService executorService, InterfaceC9389b interfaceC9389b, int i) {
        this.f18340c = executorService;
        this.f18338a = interfaceC9389b;
        this.f18341d = i;
    }

    @Override // com.unity3d.services.ads.token.InterfaceC9389b
    /* renamed from: a */
    public void mo2380a(InterfaceC9390c interfaceC9390c) {
        C9394a c9394a = new C9394a();
        PrivacyConfigStorage.getInstance().registerObserver(c9394a);
        this.f18340c.execute(new RunnableC9395b(c9394a, interfaceC9390c));
    }
}

package com.unity3d.services.ads.token;

import android.util.Base64;
import com.unity3d.services.core.device.reader.C9517a;
import com.unity3d.services.core.device.reader.C9518b;
import com.unity3d.services.core.log.C9549a;
import java.util.concurrent.ExecutorService;

/* renamed from: com.unity3d.services.ads.token.d */
/* loaded from: classes3.dex */
public class C9391d implements InterfaceC9389b {

    /* renamed from: a */
    private ExecutorService f18333a;

    /* renamed from: b */
    private C9517a f18334b;

    /* renamed from: c */
    private String f18335c;

    /* renamed from: com.unity3d.services.ads.token.d$a */
    /* loaded from: classes3.dex */
    public class RunnableC9392a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC9390c f18336a;

        public RunnableC9392a(InterfaceC9390c interfaceC9390c) {
            this.f18336a = interfaceC9390c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String encodeToString = Base64.encodeToString(new C9518b(C9391d.this.f18334b.mo2063a()).m2070b(), 2);
                if (C9391d.this.f18335c == null || C9391d.this.f18335c.isEmpty()) {
                    this.f18336a.mo2367a(encodeToString);
                } else {
                    StringBuilder sb = new StringBuilder(C9391d.this.f18335c.length() + encodeToString.length());
                    sb.append(C9391d.this.f18335c);
                    sb.append(encodeToString);
                    this.f18336a.mo2367a(sb.toString());
                }
            } catch (Exception e) {
                C9549a.m2023a("Unity Ads failed to generate token.", e);
                this.f18336a.mo2367a(null);
            }
        }
    }

    public C9391d(ExecutorService executorService, C9517a c9517a) {
        this(executorService, c9517a, "1:");
    }

    public C9391d(ExecutorService executorService, C9517a c9517a, String str) {
        this.f18333a = executorService;
        this.f18334b = c9517a;
        this.f18335c = str;
    }

    @Override // com.unity3d.services.ads.token.InterfaceC9389b
    /* renamed from: a */
    public void mo2380a(InterfaceC9390c interfaceC9390c) {
        this.f18333a.execute(new RunnableC9392a(interfaceC9390c));
    }
}

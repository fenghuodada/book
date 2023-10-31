package com.unity3d.services.ads.operation;

import android.os.ConditionVariable;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.timer.C9609a;
import com.unity3d.services.core.webview.bridge.InterfaceC9631d;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: com.unity3d.services.ads.operation.e */
/* loaded from: classes3.dex */
public class C9351e implements InterfaceC9631d {

    /* renamed from: a */
    private static String f18253a = "";

    /* renamed from: b */
    public String f18254b;

    /* renamed from: c */
    public String f18255c;

    /* renamed from: d */
    public Configuration f18256d;

    /* renamed from: e */
    public ConditionVariable f18257e;

    /* renamed from: f */
    public long f18258f;

    /* renamed from: g */
    public C9609a f18259g;

    public C9351e(String str, Configuration configuration) {
        this.f18255c = str == null ? f18253a : str;
        this.f18256d = configuration;
        this.f18257e = new ConditionVariable();
        this.f18254b = UUID.randomUUID().toString();
    }

    @Override // com.unity3d.services.core.webview.bridge.InterfaceC9631d
    /* renamed from: a */
    public String mo1766a() {
        return this.f18254b;
    }

    /* renamed from: d */
    public long m2433d() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.f18258f);
    }

    /* renamed from: e */
    public void m2432e() {
        this.f18258f = System.nanoTime();
    }
}

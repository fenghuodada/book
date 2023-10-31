package com.vungle.warren;

import com.vungle.warren.AdLoader;
import com.vungle.warren.error.VungleException;
import java.io.IOException;
import java.net.UnknownHostException;

/* renamed from: com.vungle.warren.e */
/* loaded from: classes3.dex */
public final class RunnableC9781e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Throwable f19503a;

    /* renamed from: b */
    public final /* synthetic */ AdLoader.C9715d f19504b;

    public RunnableC9781e(AdLoader.C9715d c9715d, Throwable th) {
        this.f19504b = c9715d;
        this.f19503a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VungleException vungleException;
        AdLoader.C9715d c9715d = this.f19504b;
        AdLoader adLoader = AdLoader.this;
        int i = AdLoader.f19266q;
        adLoader.getClass();
        Throwable th = this.f19503a;
        if (th instanceof UnknownHostException) {
            vungleException = new VungleException(11);
        } else if (th instanceof IOException) {
            vungleException = new VungleException(20);
        } else {
            vungleException = new VungleException(11);
        }
        adLoader.m1632q(vungleException, c9715d.f19288a.f19294a, null);
    }
}

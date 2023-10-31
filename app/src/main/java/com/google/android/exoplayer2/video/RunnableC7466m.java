package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.decoder.C6747e;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.video.InterfaceC7494v;

/* renamed from: com.google.android.exoplayer2.video.m */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7466m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC7494v.C7495a f14105a;

    /* renamed from: b */
    public final /* synthetic */ C6747e f14106b;

    public /* synthetic */ RunnableC7466m(InterfaceC7494v.C7495a c7495a, C6747e c6747e) {
        this.f14105a = c7495a;
        this.f14106b = c6747e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC7494v.C7495a c7495a = this.f14105a;
        C6747e c6747e = this.f14106b;
        c7495a.getClass();
        synchronized (c6747e) {
        }
        InterfaceC7494v interfaceC7494v = c7495a.f14217b;
        int i = C7408g0.f13905a;
        interfaceC7494v.mo4899J(c6747e);
    }
}

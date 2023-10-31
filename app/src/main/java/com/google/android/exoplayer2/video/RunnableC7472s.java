package com.google.android.exoplayer2.video;

import android.view.Surface;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.video.InterfaceC7494v;

/* renamed from: com.google.android.exoplayer2.video.s */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7472s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC7494v.C7495a f14119a;

    /* renamed from: b */
    public final /* synthetic */ Object f14120b;

    /* renamed from: c */
    public final /* synthetic */ long f14121c;

    public /* synthetic */ RunnableC7472s(InterfaceC7494v.C7495a c7495a, Surface surface, long j) {
        this.f14119a = c7495a;
        this.f14120b = surface;
        this.f14121c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC7494v.C7495a c7495a = this.f14119a;
        c7495a.getClass();
        int i = C7408g0.f13905a;
        c7495a.f14217b.mo4900I(this.f14121c, this.f14120b);
    }
}

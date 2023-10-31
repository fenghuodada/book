package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Renderer;

/* renamed from: com.google.android.exoplayer2.j0 */
/* loaded from: classes.dex */
public final class C6983j0 implements Renderer.InterfaceC6630a {

    /* renamed from: a */
    public final /* synthetic */ C6989k0 f12150a;

    public C6983j0(C6989k0 c6989k0) {
        this.f12150a = c6989k0;
    }

    @Override // com.google.android.exoplayer2.Renderer.InterfaceC6630a
    /* renamed from: a */
    public final void mo5692a() {
        this.f12150a.f12213g.mo5064i(2);
    }

    @Override // com.google.android.exoplayer2.Renderer.InterfaceC6630a
    /* renamed from: b */
    public final void mo5691b(long j) {
        if (j >= 2000) {
            this.f12150a.f12199G = true;
        }
    }
}

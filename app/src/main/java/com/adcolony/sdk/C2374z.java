package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.z */
/* loaded from: classes.dex */
public final class C2374z implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2066c0 f5699a;

    public C2374z(C2066c0 c2066c0) {
        this.f5699a = c2066c0;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        int i;
        C2066c0 c2066c0 = this.f5699a;
        if (C2066c0.m9683a(c2066c0, c2100e2)) {
            if (c2100e2.f5098b.m9444o("visible")) {
                i = 0;
            } else {
                i = 4;
            }
            c2066c0.setVisibility(i);
        }
    }
}

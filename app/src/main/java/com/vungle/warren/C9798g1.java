package com.vungle.warren;

import com.vungle.warren.C10114v0;
import com.vungle.warren.downloader.AssetDownloader;
import com.vungle.warren.downloader.InterfaceC9779f;
import com.vungle.warren.utility.C10095p;
import com.vungle.warren.utility.InterfaceC10086h;

/* renamed from: com.vungle.warren.g1 */
/* loaded from: classes3.dex */
public final class C9798g1 extends C10114v0.AbstractC10117c {

    /* renamed from: a */
    public final /* synthetic */ C10114v0 f19537a;

    public C9798g1(C10114v0 c10114v0) {
        this.f19537a = c10114v0;
    }

    @Override // com.vungle.warren.C10114v0.AbstractC10117c
    /* renamed from: a */
    public final Object mo1226a() {
        C10114v0 c10114v0 = this.f19537a;
        return new AssetDownloader((InterfaceC9779f) c10114v0.m1233b(InterfaceC9779f.class), AssetDownloader.f19447m, C10095p.m1262b(c10114v0.f20360a), ((InterfaceC10086h) c10114v0.m1233b(InterfaceC10086h.class)).mo1243g(), ((InterfaceC10086h) c10114v0.m1233b(InterfaceC10086h.class)).mo1248b());
    }
}

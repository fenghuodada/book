package com.ambrose.overwall.p005mv.main;

import com.android.tool.util.util.C2603g;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ambrose.overwall.mv.main.o */
/* loaded from: classes.dex */
public final class C2514o extends AdListener {

    /* renamed from: a */
    public final /* synthetic */ C2507n f5995a;

    public C2514o(C2507n c2507n) {
        this.f5995a = c2507n;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(@NotNull LoadAdError loadError) {
        C10843j.m430f(loadError, "loadError");
        super.onAdFailedToLoad(loadError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f5995a.getClass();
        C2603g.m9336d(C2507n.m9406b(), "ok");
    }
}

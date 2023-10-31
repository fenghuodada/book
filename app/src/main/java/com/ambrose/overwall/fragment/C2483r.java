package com.ambrose.overwall.fragment;

import android.util.Log;
import androidx.annotation.NonNull;
import com.ambrose.overwall.p005mv.main.C2507n;
import com.android.tool.util.util.C2603g;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* renamed from: com.ambrose.overwall.fragment.r */
/* loaded from: classes.dex */
public final class C2483r extends AdListener {

    /* renamed from: a */
    public final /* synthetic */ C2470n f5943a;

    public C2483r(C2470n c2470n) {
        this.f5943a = c2470n;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
        Log.e("ConnectFragment", "onAdFailedToLoad: " + loadAdError.toString());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f5943a.f5906H.getClass();
        C2603g.m9336d(C2507n.m9406b(), "ok");
        super.onAdOpened();
    }
}

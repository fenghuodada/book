package com.unity3d.services.ads.adunit;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.unity3d.services.core.misc.C9565k;

/* loaded from: classes3.dex */
public class AdUnitTransparentActivity extends AdUnitActivity {
    @Override // com.unity3d.services.ads.adunit.AdUnitActivity
    /* renamed from: a */
    public void mo2498a() {
        super.mo2498a();
        C9565k.m1981a(this.f18115a, new ColorDrawable(0));
    }

    @Override // com.unity3d.services.ads.adunit.AdUnitActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9565k.m1981a(this.f18115a, new ColorDrawable(0));
    }
}

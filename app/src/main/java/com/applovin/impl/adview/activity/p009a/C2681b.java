package com.applovin.impl.adview.activity.p009a;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.C2789m;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;

/* renamed from: com.applovin.impl.adview.activity.a.b */
/* loaded from: classes.dex */
public class C2681b extends AbstractC2680a {
    public C2681b(AbstractC3080e abstractC3080e, Activity activity, C3214m c3214m) {
        super(abstractC3080e, activity, c3214m);
    }

    /* renamed from: a */
    public void m9166a(C2789m c2789m, AppLovinAdView appLovinAdView, @Nullable ViewGroup viewGroup) {
        this.f6389d.addView(appLovinAdView);
        if (c2789m != null) {
            m9167a(this.f6388c.m7951X(), (this.f6388c.m7928ab() ? 3 : 5) | 48, c2789m);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f6389d);
        } else {
            this.f6387b.setContentView(this.f6389d);
        }
    }
}

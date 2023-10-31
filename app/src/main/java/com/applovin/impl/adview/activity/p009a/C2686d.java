package com.applovin.impl.adview.activity.p009a;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.C2671a;
import com.applovin.impl.adview.C2789m;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.activity.a.d */
/* loaded from: classes.dex */
public class C2686d extends AbstractC2680a {
    public C2686d(AbstractC3080e abstractC3080e, Activity activity, C3214m c3214m) {
        super(abstractC3080e, activity, c3214m);
    }

    /* renamed from: a */
    public void m9163a(ImageView imageView, C2789m c2789m, C2789m c2789m2, C2671a c2671a, AppLovinAdView appLovinAdView, @Nullable ViewGroup viewGroup) {
        this.f6389d.addView(appLovinAdView);
        if (c2789m != null) {
            m9167a(this.f6388c.m7951X(), (this.f6388c.m7927ac() ? 3 : 5) | 48, c2789m);
        }
        if (c2789m2 != null) {
            m9167a(this.f6388c.m7951X(), (this.f6388c.m7928ab() ? 3 : 5) | 48, c2789m2);
        }
        if (imageView != null) {
            int dpToPx = AppLovinSdkUtils.dpToPx(this.f6387b, ((Integer) this.f6386a.m7456a(C3109b.f7948cv)).intValue());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) this.f6386a.m7456a(C3109b.f7950cx)).intValue());
            int dpToPx2 = AppLovinSdkUtils.dpToPx(this.f6387b, ((Integer) this.f6386a.m7456a(C3109b.f7949cw)).intValue());
            layoutParams.setMargins(dpToPx2, dpToPx2, dpToPx2, dpToPx2);
            this.f6389d.addView(imageView, layoutParams);
        }
        if (c2671a != null) {
            this.f6389d.addView(c2671a, this.f6390e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f6389d);
        } else {
            this.f6387b.setContentView(this.f6389d);
        }
    }
}

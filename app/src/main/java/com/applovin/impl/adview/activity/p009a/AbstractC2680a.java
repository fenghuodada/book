package com.applovin.impl.adview.activity.p009a;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.applovin.impl.adview.C2789m;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;

/* renamed from: com.applovin.impl.adview.activity.a.a */
/* loaded from: classes.dex */
abstract class AbstractC2680a {

    /* renamed from: a */
    final C3214m f6386a;

    /* renamed from: b */
    final Activity f6387b;

    /* renamed from: c */
    final AbstractC3080e f6388c;

    /* renamed from: d */
    final ViewGroup f6389d;

    /* renamed from: e */
    final FrameLayout.LayoutParams f6390e;

    public AbstractC2680a(AbstractC3080e abstractC3080e, Activity activity, C3214m c3214m) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        this.f6390e = layoutParams;
        this.f6388c = abstractC3080e;
        this.f6386a = c3214m;
        this.f6387b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f6389d = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void m9167a(AbstractC3080e.C3084c c3084c, int i, C2789m c2789m) {
        c2789m.m8917a(c3084c.f7684a, c3084c.f7688e, c3084c.f7687d, i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c2789m.getLayoutParams());
        int i2 = c3084c.f7686c;
        layoutParams.setMargins(i2, c3084c.f7685b, i2, 0);
        layoutParams.gravity = i;
        this.f6389d.addView(c2789m, layoutParams);
    }
}

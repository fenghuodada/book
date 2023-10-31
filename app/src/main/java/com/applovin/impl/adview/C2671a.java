package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.a */
/* loaded from: classes.dex */
public class C2671a extends RelativeLayout {

    /* renamed from: a */
    private final ProgressBar f6365a;

    public C2671a(Context context, int i, int i2) {
        super(context);
        RelativeLayout.LayoutParams layoutParams;
        setClickable(false);
        ProgressBar progressBar = new ProgressBar(context, null, i2);
        this.f6365a = progressBar;
        progressBar.setIndeterminate(true);
        progressBar.setClickable(false);
        if (i == -2 || i == -1) {
            layoutParams = new RelativeLayout.LayoutParams(i, i);
        } else {
            int dpToPx = AppLovinSdkUtils.dpToPx(context, i);
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        }
        layoutParams.addRule(13);
        progressBar.setLayoutParams(layoutParams);
        addView(progressBar);
    }

    /* renamed from: a */
    public void m9180a() {
        setVisibility(0);
    }

    /* renamed from: b */
    public void m9179b() {
        setVisibility(8);
    }

    public void setColor(int i) {
        this.f6365a.getIndeterminateDrawable().setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }
}

package com.applovin.mediation.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.provider.C0761g;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.mediation.ads.AbstractC2854a;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.sdk.utils.C3288b;
import com.applovin.impl.sdk.utils.C3340q;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class MaxAdView extends RelativeLayout {

    /* renamed from: a */
    private MaxAdViewImpl f8876a;

    /* renamed from: b */
    private View f8877b;

    /* renamed from: c */
    private int f8878c;

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String m7048a = C3288b.m7048a(context, attributeSet, AppLovinAdView.NAMESPACE, "adUnitId");
        String m7048a2 = C3288b.m7048a(context, attributeSet, AppLovinAdView.NAMESPACE, "adFormat");
        MaxAdFormat formatFromString = StringUtils.isValidString(m7048a2) ? MaxAdFormat.formatFromString(m7048a2) : C3288b.m7049a(context);
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (m7048a == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(m7048a)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        m6818a(m7048a, formatFromString, attributeIntValue, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        super(context.getApplicationContext());
        AbstractC2854a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", sdk=" + appLovinSdk + ")");
        m6818a(str, maxAdFormat, 49, appLovinSdk, context);
    }

    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, C3288b.m7049a(context), appLovinSdk, context);
    }

    /* renamed from: a */
    private void m6819a(MaxAdFormat maxAdFormat, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int applyDimension = maxAdFormat == MaxAdFormat.MREC ? (int) TypedValue.applyDimension(1, maxAdFormat.getSize().getWidth(), displayMetrics) : displayMetrics.widthPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(-16777216);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, applyDimension, (int) TypedValue.applyDimension(1, maxAdFormat.getSize().getHeight(), displayMetrics));
    }

    /* renamed from: a */
    private void m6818a(String str, MaxAdFormat maxAdFormat, int i, AppLovinSdk appLovinSdk, Context context) {
        if (isInEditMode()) {
            m6819a(maxAdFormat, context);
            return;
        }
        View view = new View(context.getApplicationContext());
        this.f8877b = view;
        view.setBackgroundColor(0);
        addView(this.f8877b);
        this.f8877b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f8878c = getVisibility();
        this.f8876a = new MaxAdViewImpl(str.trim(), maxAdFormat, this, this.f8877b, appLovinSdk.coreSdk, context);
        setGravity(i);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.f8876a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.f8876a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f8876a.getAdUnitId();
    }

    public String getPlacement() {
        return this.f8876a.getPlacement();
    }

    public void loadAd() {
        this.f8876a.loadAd();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        MaxAdViewImpl maxAdViewImpl = this.f8876a;
        maxAdViewImpl.logApiCall("onWindowVisibilityChanged(visibility=" + i + ")");
        if (this.f8876a != null && C3340q.m6889a(this.f8878c, i)) {
            this.f8876a.onWindowVisibilityChanged(i);
        }
        this.f8878c = i;
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        MaxAdViewImpl maxAdViewImpl = this.f8876a;
        maxAdViewImpl.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f8876a.setAdReviewListener(maxAdReviewListener);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        MaxAdViewImpl maxAdViewImpl = this.f8876a;
        maxAdViewImpl.logApiCall("setAlpha(alpha=" + f + ")");
        View view = this.f8877b;
        if (view != null) {
            view.setAlpha(f);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        MaxAdViewImpl maxAdViewImpl = this.f8876a;
        maxAdViewImpl.logApiCall("setBackgroundColor(color=" + i + ")");
        MaxAdViewImpl maxAdViewImpl2 = this.f8876a;
        if (maxAdViewImpl2 != null) {
            maxAdViewImpl2.setPublisherBackgroundColor(i);
        }
        View view = this.f8877b;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setCustomData(String str) {
        MaxAdViewImpl maxAdViewImpl = this.f8876a;
        maxAdViewImpl.logApiCall("setCustomData(value=" + str + ")");
        this.f8876a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f8876a.logApiCall(C0761g.m11824a("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f8876a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        MaxAdViewImpl maxAdViewImpl = this.f8876a;
        maxAdViewImpl.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f8876a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxAdViewImpl maxAdViewImpl = this.f8876a;
        maxAdViewImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f8876a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        this.f8876a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxAdViewImpl maxAdViewImpl = this.f8876a;
        maxAdViewImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f8876a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f8876a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f8876a.stopAutoRefresh();
    }

    @Override // android.view.View
    @NonNull
    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f8876a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }
}

package com.applovin.adview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.impl.adview.C2746b;
import com.applovin.impl.sdk.C3349v;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class AppLovinAdView extends RelativeLayout {
    public static final String NAMESPACE = "http://schemas.applovin.com/android/1.0";

    /* renamed from: a */
    private C2746b f6220a;

    public AppLovinAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppLovinAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m9317a(null, null, null, context, attributeSet);
    }

    public AppLovinAdView(AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinAdSize, (String) null, context);
    }

    public AppLovinAdView(AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context);
        m9317a(appLovinAdSize, str, null, context, null);
    }

    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, Context context) {
        this(appLovinSdk, appLovinAdSize, null, context);
    }

    public AppLovinAdView(AppLovinSdk appLovinSdk, AppLovinAdSize appLovinAdSize, String str, Context context) {
        super(context.getApplicationContext());
        m9317a(appLovinAdSize, str, appLovinSdk, context, null);
    }

    /* renamed from: a */
    private void m9318a(AttributeSet attributeSet, Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(-16777216);
        textView.setText("AppLovin Ad");
        textView.setGravity(17);
        addView(textView, displayMetrics.widthPixels, (int) TypedValue.applyDimension(1, 50.0f, displayMetrics));
    }

    /* renamed from: a */
    private void m9317a(AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, Context context, AttributeSet attributeSet) {
        if (isInEditMode()) {
            m9318a(attributeSet, context);
            return;
        }
        C2746b c2746b = new C2746b();
        this.f6220a = c2746b;
        c2746b.m9037a(this, context, appLovinAdSize, str, appLovinSdk, attributeSet);
    }

    public void destroy() {
        C2746b c2746b = this.f6220a;
        if (c2746b != null) {
            c2746b.m9010f();
        }
    }

    public C2746b getController() {
        return this.f6220a;
    }

    public AppLovinAdSize getSize() {
        C2746b c2746b = this.f6220a;
        if (c2746b != null) {
            return c2746b.m9021b();
        }
        return null;
    }

    public String getZoneId() {
        C2746b c2746b = this.f6220a;
        if (c2746b != null) {
            return c2746b.m9016c();
        }
        return null;
    }

    public void loadNextAd() {
        C2746b c2746b = this.f6220a;
        if (c2746b != null) {
            c2746b.m9042a();
        } else {
            C3349v.m6848g("AppLovinSdk", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2746b c2746b = this.f6220a;
        if (c2746b != null) {
            c2746b.m9004i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C2746b c2746b = this.f6220a;
        if (c2746b != null) {
            c2746b.m9002j();
        }
        super.onDetachedFromWindow();
    }

    public void pause() {
        C2746b c2746b = this.f6220a;
        if (c2746b != null) {
            c2746b.m9014d();
        }
    }

    public void renderAd(AppLovinAd appLovinAd) {
        C2746b c2746b = this.f6220a;
        if (c2746b != null) {
            c2746b.m9028a(appLovinAd);
        }
    }

    public void resume() {
        C2746b c2746b = this.f6220a;
        if (c2746b != null) {
            c2746b.m9012e();
        }
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        C2746b c2746b = this.f6220a;
        if (c2746b != null) {
            c2746b.m9026a(appLovinAdClickListener);
        }
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        C2746b c2746b = this.f6220a;
        if (c2746b != null) {
            c2746b.m9025a(appLovinAdDisplayListener);
        }
    }

    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        C2746b c2746b = this.f6220a;
        if (c2746b != null) {
            c2746b.m9024a(appLovinAdLoadListener);
        }
    }

    public void setAdViewEventListener(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        C2746b c2746b = this.f6220a;
        if (c2746b != null) {
            c2746b.m9035a(appLovinAdViewEventListener);
        }
    }

    @Override // android.view.View
    public String toString() {
        return "AppLovinAdView{zoneId='" + getZoneId() + "\", size=" + getSize() + '}';
    }
}

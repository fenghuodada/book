package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.iab.omid.library.adcolony.adsession.EnumC8717g;
import java.io.File;

/* renamed from: com.adcolony.sdk.k */
/* loaded from: classes.dex */
public final class C2178k extends FrameLayout {

    /* renamed from: a */
    public final C2135i1 f5309a;

    /* renamed from: b */
    public AbstractC2187l f5310b;

    /* renamed from: c */
    public final C2124h f5311c;

    /* renamed from: d */
    public final String f5312d;

    /* renamed from: e */
    public final String f5313e;

    /* renamed from: f */
    public final String f5314f;

    /* renamed from: g */
    public String f5315g;

    /* renamed from: h */
    public ImageView f5316h;

    /* renamed from: i */
    public C2120g4 f5317i;

    /* renamed from: j */
    public C2100e2 f5318j;

    /* renamed from: k */
    public final boolean f5319k;

    /* renamed from: l */
    public boolean f5320l;

    /* renamed from: m */
    public boolean f5321m;

    /* renamed from: n */
    public boolean f5322n;

    /* renamed from: o */
    public final boolean f5323o;

    /* renamed from: p */
    public boolean f5324p;

    /* renamed from: q */
    public int f5325q;

    /* renamed from: r */
    public int f5326r;

    /* renamed from: s */
    public int f5327s;

    /* renamed from: t */
    public final int f5328t;

    /* renamed from: u */
    public final int f5329u;

    /* renamed from: v */
    public InterfaceC2179a f5330v;

    /* renamed from: com.adcolony.sdk.k$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2179a {
    }

    public C2178k(Context context, C2100e2 c2100e2, AbstractC2187l abstractC2187l) throws RuntimeException {
        super(context);
        this.f5324p = true;
        this.f5310b = abstractC2187l;
        this.f5313e = abstractC2187l.m9596c();
        C2367y1 c2367y1 = c2100e2.f5098b;
        String m9436w = c2367y1.m9436w(FacebookAdapter.KEY_ID);
        this.f5312d = m9436w;
        this.f5314f = c2367y1.m9436w("close_button_filepath");
        this.f5319k = c2367y1.m9444o("trusted_demand_source");
        this.f5323o = c2367y1.m9444o("close_button_snap_to_webview");
        this.f5328t = c2367y1.m9441r("close_button_width");
        this.f5329u = c2367y1.m9441r("close_button_height");
        C2135i1 c2135i1 = C2201m0.m9588d().m9692k().f5265b.get(m9436w);
        this.f5309a = c2135i1;
        if (c2135i1 != null) {
            this.f5311c = abstractC2187l.m9601a();
            setLayoutParams(new FrameLayout.LayoutParams(c2135i1.f5199h, c2135i1.f5200i));
            setBackgroundColor(0);
            addView(c2135i1);
            return;
        }
        throw new RuntimeException("AdColonyAdView container cannot be null");
    }

    /* renamed from: a */
    public final void m9602a() {
        int width;
        int i;
        if (!this.f5319k && !this.f5322n) {
            if (this.f5318j != null) {
                C2367y1 c2367y1 = new C2367y1();
                C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, false);
                this.f5318j.m9641a(c2367y1).m9640b();
                this.f5318j = null;
                return;
            }
            return;
        }
        C2201m0.m9588d().m9691l().getClass();
        Rect m9523h = C2247p4.m9523h();
        int i2 = this.f5326r;
        if (i2 <= 0) {
            i2 = m9523h.width();
        }
        int i3 = this.f5327s;
        if (i3 <= 0) {
            i3 = m9523h.height();
        }
        int width2 = (m9523h.width() - i2) / 2;
        int height = (m9523h.height() - i3) / 2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m9523h.width(), m9523h.height());
        C2135i1 c2135i1 = this.f5309a;
        c2135i1.setLayoutParams(layoutParams);
        C2218o0 webView = getWebView();
        if (webView != null) {
            C2100e2 c2100e2 = new C2100e2("WebView.set_bounds", 0);
            C2367y1 c2367y12 = new C2367y1();
            C2080d1.m9657k(width2, c2367y12, "x");
            C2080d1.m9657k(height, c2367y12, "y");
            C2080d1.m9657k(i2, c2367y12, "width");
            C2080d1.m9657k(i3, c2367y12, "height");
            c2100e2.f5098b = c2367y12;
            webView.setBounds(c2100e2);
            float m9524g = C2247p4.m9524g();
            C2367y1 c2367y13 = new C2367y1();
            C2080d1.m9657k(C2232o6.m9543t(C2232o6.m9539x()), c2367y13, "app_orientation");
            C2080d1.m9657k((int) (i2 / m9524g), c2367y13, "width");
            C2080d1.m9657k((int) (i3 / m9524g), c2367y13, "height");
            C2080d1.m9657k(C2232o6.m9561b(webView), c2367y13, "x");
            C2080d1.m9657k(C2232o6.m9553j(webView), c2367y13, "y");
            C2080d1.m9660h(c2367y13, "ad_session_id", this.f5312d);
            new C2100e2(c2135i1.f5202k, c2367y13, "MRAID.on_size_change").m9640b();
        }
        ImageView imageView = this.f5316h;
        if (imageView != null) {
            c2135i1.removeView(imageView);
        }
        Context context = C2201m0.f5363a;
        if (context != null && !this.f5321m && webView != null) {
            C2201m0.m9588d().m9691l().getClass();
            float m9524g2 = C2247p4.m9524g();
            int i4 = (int) (this.f5328t * m9524g2);
            int i5 = (int) (this.f5329u * m9524g2);
            boolean z = this.f5323o;
            if (z) {
                width = webView.getCurrentWidth() + webView.getCurrentX();
            } else {
                width = m9523h.width();
            }
            if (z) {
                i = webView.getCurrentY();
            } else {
                i = 0;
            }
            ImageView imageView2 = new ImageView(context.getApplicationContext());
            this.f5316h = imageView2;
            imageView2.setImageURI(Uri.fromFile(new File(this.f5314f)));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i4, i5);
            layoutParams2.setMargins(width - i4, i, 0, 0);
            this.f5316h.setOnClickListener(new View$OnClickListenerC2141j(context));
            c2135i1.addView(this.f5316h, layoutParams2);
            c2135i1.m9618a(this.f5316h, EnumC8717g.CLOSE_AD);
        }
        if (this.f5318j != null) {
            C2367y1 c2367y14 = new C2367y1();
            C2080d1.m9656l(c2367y14, FirebaseAnalytics.Param.SUCCESS, true);
            this.f5318j.m9641a(c2367y14).m9640b();
            this.f5318j = null;
        }
    }

    public C2124h getAdSize() {
        return this.f5311c;
    }

    public String getClickOverride() {
        return this.f5315g;
    }

    public C2135i1 getContainer() {
        return this.f5309a;
    }

    public AbstractC2187l getListener() {
        return this.f5310b;
    }

    public C2120g4 getOmidManager() {
        return this.f5317i;
    }

    public int getOrientation() {
        return this.f5325q;
    }

    public boolean getTrustedDemandSource() {
        return this.f5319k;
    }

    public C2218o0 getWebView() {
        C2135i1 c2135i1 = this.f5309a;
        if (c2135i1 == null) {
            return null;
        }
        return c2135i1.f5194c.get(2);
    }

    public String getZoneId() {
        return this.f5313e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f5324p || this.f5320l) {
            return;
        }
        this.f5324p = false;
        AbstractC2187l abstractC2187l = this.f5310b;
        if (abstractC2187l != null) {
            abstractC2187l.onShow(this);
        }
    }

    public void setClickOverride(String str) {
        this.f5315g = str;
    }

    public void setExpandMessage(C2100e2 c2100e2) {
        this.f5318j = c2100e2;
    }

    public void setExpandedHeight(int i) {
        C2201m0.m9588d().m9691l().getClass();
        this.f5327s = (int) (C2247p4.m9524g() * i);
    }

    public void setExpandedWidth(int i) {
        C2201m0.m9588d().m9691l().getClass();
        this.f5326r = (int) (C2247p4.m9524g() * i);
    }

    public void setListener(AbstractC2187l abstractC2187l) {
        this.f5310b = abstractC2187l;
    }

    public void setNoCloseButton(boolean z) {
        this.f5321m = this.f5319k && z;
    }

    public void setOmidManager(C2120g4 c2120g4) {
        this.f5317i = c2120g4;
    }

    public void setOnDestroyListenerOrCall(@NonNull InterfaceC2179a interfaceC2179a) {
        if (this.f5320l) {
            C2058b3 c2058b3 = ((C2109f3) interfaceC2179a).f5108a;
            int i = c2058b3.f4981W - 1;
            c2058b3.f4981W = i;
            if (i == 0) {
                c2058b3.m9701b();
                return;
            }
            return;
        }
        this.f5330v = interfaceC2179a;
    }

    public void setOrientation(int i) {
        this.f5325q = i;
    }

    public void setUserInteraction(boolean z) {
        this.f5322n = z;
    }
}

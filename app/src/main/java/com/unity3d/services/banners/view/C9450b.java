package com.unity3d.services.banners.view;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.unity3d.services.ads.webplayer.C9414f;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.C9446a;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.misc.C9565k;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.banners.view.b */
/* loaded from: classes3.dex */
public class C9450b extends RelativeLayout {

    /* renamed from: a */
    private C9414f f18554a;

    /* renamed from: b */
    private int f18555b;

    /* renamed from: c */
    private UnityBannerSize f18556c;

    /* renamed from: d */
    private String f18557d;

    /* renamed from: e */
    private JSONObject f18558e;

    /* renamed from: f */
    private JSONObject f18559f;

    /* renamed from: g */
    private JSONObject f18560g;

    /* renamed from: h */
    private Runnable f18561h;

    /* renamed from: com.unity3d.services.banners.view.b$a */
    /* loaded from: classes3.dex */
    public class View$OnLayoutChangeListenerC9451a implements View.OnLayoutChangeListener {
        public View$OnLayoutChangeListenerC9451a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C9450b.this.m2271a(view, i, i2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: com.unity3d.services.banners.view.b$b */
    /* loaded from: classes3.dex */
    public class RunnableC9452b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View.OnLayoutChangeListener f18563a;

        public RunnableC9452b(View.OnLayoutChangeListener onLayoutChangeListener) {
            this.f18563a = onLayoutChangeListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9450b.this.removeOnLayoutChangeListener(this.f18563a);
        }
    }

    /* renamed from: com.unity3d.services.banners.view.b$c */
    /* loaded from: classes3.dex */
    public class RunnableC9453c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C9450b f18565a;

        public RunnableC9453c(C9450b c9450b) {
            this.f18565a = c9450b;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18565a.removeAllViews();
            ViewParent parent = this.f18565a.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.f18565a);
            }
            if (this.f18565a.f18554a != null) {
                this.f18565a.f18554a.destroy();
            }
            this.f18565a.f18554a = null;
        }
    }

    public C9450b(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, UnityBannerSize unityBannerSize) {
        super(context);
        this.f18555b = -1;
        this.f18561h = null;
        this.f18556c = unityBannerSize;
        this.f18557d = str;
        this.f18558e = jSONObject;
        this.f18559f = jSONObject2;
        this.f18560g = jSONObject3;
        C9414f c9414f = new C9414f(context, str, this.f18558e, this.f18559f);
        this.f18554a = c9414f;
        c9414f.setEventSettings(this.f18560g);
        m2266c();
        addView(this.f18554a);
        m2267b();
    }

    /* renamed from: b */
    private void m2267b() {
        setLayoutParams(new RelativeLayout.LayoutParams(Math.round(C9565k.m1980b(getContext(), this.f18556c.getWidth())), Math.round(C9565k.m1980b(getContext(), this.f18556c.getHeight()))));
        ViewGroup.LayoutParams layoutParams = this.f18554a.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        this.f18554a.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    private void m2266c() {
        Runnable runnable = this.f18561h;
        if (runnable != null) {
            runnable.run();
        }
        View$OnLayoutChangeListenerC9451a view$OnLayoutChangeListenerC9451a = new View$OnLayoutChangeListenerC9451a();
        addOnLayoutChangeListener(view$OnLayoutChangeListenerC9451a);
        this.f18561h = new RunnableC9452b(view$OnLayoutChangeListenerC9451a);
    }

    /* renamed from: a */
    public void m2272a() {
        Runnable runnable = this.f18561h;
        if (runnable != null) {
            runnable.run();
        }
        C9564j.m1991a(new RunnableC9453c(this));
    }

    /* renamed from: a */
    public void m2271a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C9446a.m2281a(this.f18557d, i, i2, i3, i4, getAlpha());
        if (getParent() != null) {
            Rect rect = new Rect();
            getHitRect(rect);
            if (!(getParent() instanceof View) || ((View) getParent()).getLocalVisibleRect(rect)) {
                return;
            }
            onVisibilityChanged(this, 8);
        }
    }

    /* renamed from: a */
    public void m2268a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f18558e = jSONObject;
        this.f18559f = jSONObject2;
    }

    public C9414f getWebPlayer() {
        return this.f18554a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9446a.m2279b(this.f18557d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C9446a.m2278c(this.f18557d);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 == 0 && i4 == 0) {
            return;
        }
        C9446a.m2281a(this.f18557d, getLeft(), getRight(), i, i2, getAlpha());
        Rect rect = new Rect();
        getHitRect(rect);
        if (((View) getParent()).getLocalVisibleRect(rect)) {
            onVisibilityChanged(this, 8);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        if (view == this) {
            int i2 = this.f18555b;
            if (i2 != -1 && i != 0 && i2 == 0) {
                C9446a.m2282a(this.f18557d, i);
            }
            this.f18555b = i;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        m2271a(this, getLeft(), getTop(), getRight(), getBottom(), getLeft(), getTop(), getRight(), getBottom());
    }

    public void setWebPlayerEventSettings(JSONObject jSONObject) {
        this.f18560g = jSONObject;
    }
}

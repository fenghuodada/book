package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.VideoView;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.iab.omid.library.adcolony.adsession.AbstractC8712b;
import com.iab.omid.library.adcolony.adsession.EnumC8717g;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.adcolony.sdk.i1 */
/* loaded from: classes.dex */
public final class C2135i1 extends FrameLayout {

    /* renamed from: a */
    public HashMap<Integer, TextureView$SurfaceTextureListenerC2142j0> f5192a;

    /* renamed from: b */
    public HashMap<Integer, C2132h6> f5193b;

    /* renamed from: c */
    public HashMap<Integer, C2218o0> f5194c;

    /* renamed from: d */
    public HashMap<Integer, C2231o5> f5195d;

    /* renamed from: e */
    public HashMap<Integer, C2066c0> f5196e;

    /* renamed from: f */
    public HashMap<Integer, Boolean> f5197f;

    /* renamed from: g */
    public HashMap<Integer, View> f5198g;

    /* renamed from: h */
    public int f5199h;

    /* renamed from: i */
    public int f5200i;

    /* renamed from: j */
    public int f5201j;

    /* renamed from: k */
    public int f5202k;

    /* renamed from: l */
    public final String f5203l;

    /* renamed from: m */
    public boolean f5204m;

    /* renamed from: n */
    public boolean f5205n;

    /* renamed from: o */
    public float f5206o;

    /* renamed from: p */
    public double f5207p;

    /* renamed from: q */
    public int f5208q;

    /* renamed from: r */
    public int f5209r;

    /* renamed from: s */
    public ArrayList<InterfaceC2203m2> f5210s;

    /* renamed from: t */
    public ArrayList<String> f5211t;

    /* renamed from: u */
    public boolean f5212u;

    /* renamed from: v */
    public boolean f5213v;

    /* renamed from: w */
    public boolean f5214w;

    /* renamed from: x */
    public AbstractC8712b f5215x;

    /* renamed from: y */
    public Context f5216y;

    /* renamed from: z */
    public VideoView f5217z;

    public C2135i1(Context context, String str) {
        super(context);
        this.f5206o = 0.0f;
        this.f5207p = 0.0d;
        this.f5208q = 0;
        this.f5209r = 0;
        this.f5216y = context;
        this.f5203l = str;
        setBackgroundColor(-16777216);
    }

    /* renamed from: a */
    public final void m9618a(View view, EnumC8717g enumC8717g) {
        AbstractC8712b abstractC8712b = this.f5215x;
        if (abstractC8712b == null || view == null) {
            return;
        }
        try {
            abstractC8712b.mo3191a(view, enumC8717g);
        } catch (RuntimeException unused) {
        }
    }

    /* renamed from: b */
    public final boolean m9617b(C2100e2 c2100e2) {
        C2367y1 c2367y1 = c2100e2.f5098b;
        if (c2367y1.m9441r("container_id") == this.f5201j && c2367y1.m9436w("ad_session_id").equals(this.f5203l)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C2100e2 c2100e2;
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        C2058b3 m9588d = C2201m0.m9588d();
        C2145j1 m9692k = m9588d.m9692k();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C2367y1 c2367y1 = new C2367y1();
        C2080d1.m9657k(-1, c2367y1, "view_id");
        String str = this.f5203l;
        C2080d1.m9660h(c2367y1, "ad_session_id", str);
        C2080d1.m9657k(x, c2367y1, "container_x");
        C2080d1.m9657k(y, c2367y1, "container_y");
        C2080d1.m9657k(x, c2367y1, "view_x");
        C2080d1.m9657k(y, c2367y1, "view_y");
        C2080d1.m9657k(this.f5201j, c2367y1, FacebookAdapter.KEY_ID);
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                int action2 = (motionEvent.getAction() & 65280) >> 8;
                                C2080d1.m9657k((int) motionEvent.getX(action2), c2367y1, "container_x");
                                C2080d1.m9657k((int) motionEvent.getY(action2), c2367y1, "container_y");
                                C2080d1.m9657k((int) motionEvent.getX(action2), c2367y1, "view_x");
                                C2080d1.m9657k((int) motionEvent.getY(action2), c2367y1, "view_y");
                                C2080d1.m9657k((int) motionEvent.getX(action2), c2367y1, "x");
                                C2080d1.m9657k((int) motionEvent.getY(action2), c2367y1, "y");
                                if (!this.f5212u) {
                                    m9588d.f4996n = m9692k.f5269f.get(str);
                                }
                                c2100e2 = new C2100e2(this.f5202k, c2367y1, "AdContainer.on_touch_ended");
                            }
                            return true;
                        }
                        int action3 = (motionEvent.getAction() & 65280) >> 8;
                        C2080d1.m9657k((int) motionEvent.getX(action3), c2367y1, "container_x");
                        C2080d1.m9657k((int) motionEvent.getY(action3), c2367y1, "container_y");
                        C2080d1.m9657k((int) motionEvent.getX(action3), c2367y1, "view_x");
                        C2080d1.m9657k((int) motionEvent.getY(action3), c2367y1, "view_y");
                        c2100e2 = new C2100e2(this.f5202k, c2367y1, "AdContainer.on_touch_began");
                    } else {
                        c2100e2 = new C2100e2(this.f5202k, c2367y1, "AdContainer.on_touch_cancelled");
                    }
                } else {
                    c2100e2 = new C2100e2(this.f5202k, c2367y1, "AdContainer.on_touch_moved");
                }
            } else {
                if (!this.f5212u) {
                    m9588d.f4996n = m9692k.f5269f.get(str);
                }
                c2100e2 = new C2100e2(this.f5202k, c2367y1, "AdContainer.on_touch_ended");
            }
        } else {
            c2100e2 = new C2100e2(this.f5202k, c2367y1, "AdContainer.on_touch_began");
        }
        c2100e2.m9640b();
        return true;
    }
}

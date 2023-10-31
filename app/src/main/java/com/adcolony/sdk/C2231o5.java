package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.EditText;
import com.google.ads.mediation.facebook.FacebookAdapter;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.adcolony.sdk.o5 */
/* loaded from: classes.dex */
public final class C2231o5 extends EditText {

    /* renamed from: a */
    public final int f5430a;

    /* renamed from: b */
    public int f5431b;

    /* renamed from: c */
    public int f5432c;

    /* renamed from: d */
    public int f5433d;

    /* renamed from: e */
    public int f5434e;

    /* renamed from: f */
    public int f5435f;

    /* renamed from: g */
    public int f5436g;

    /* renamed from: h */
    public int f5437h;

    /* renamed from: i */
    public int f5438i;

    /* renamed from: j */
    public int f5439j;

    /* renamed from: k */
    public String f5440k;

    /* renamed from: l */
    public String f5441l;

    /* renamed from: m */
    public String f5442m;

    /* renamed from: n */
    public String f5443n;

    /* renamed from: o */
    public final C2135i1 f5444o;

    /* renamed from: p */
    public final C2100e2 f5445p;

    public C2231o5(Context context, C2100e2 c2100e2, int i, C2135i1 c2135i1) {
        super(context);
        this.f5430a = i;
        this.f5445p = c2100e2;
        this.f5444o = c2135i1;
    }

    /* renamed from: a */
    public static int m9565a(int i, boolean z) {
        if (i == 0) {
            return z ? 1 : 16;
        } else if (i == 1) {
            return z ? 8388611 : 48;
        } else if (i != 2) {
            return 17;
        } else {
            return z ? 8388613 : 80;
        }
    }

    /* renamed from: b */
    public final boolean m9564b(C2100e2 c2100e2) {
        C2367y1 c2367y1 = c2100e2.f5098b;
        if (c2367y1.m9441r(FacebookAdapter.KEY_ID) == this.f5430a) {
            int m9441r = c2367y1.m9441r("container_id");
            C2135i1 c2135i1 = this.f5444o;
            if (m9441r == c2135i1.f5201j && c2367y1.m9436w("ad_session_id").equals(c2135i1.f5203l)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C2100e2 c2100e2;
        C2058b3 m9588d = C2201m0.m9588d();
        C2145j1 m9692k = m9588d.m9692k();
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C2367y1 c2367y1 = new C2367y1();
        C2080d1.m9657k(this.f5430a, c2367y1, "view_id");
        C2080d1.m9660h(c2367y1, "ad_session_id", this.f5440k);
        C2080d1.m9657k(this.f5431b + x, c2367y1, "container_x");
        C2080d1.m9657k(this.f5432c + y, c2367y1, "container_y");
        C2080d1.m9657k(x, c2367y1, "view_x");
        C2080d1.m9657k(y, c2367y1, "view_y");
        C2135i1 c2135i1 = this.f5444o;
        C2080d1.m9657k(c2135i1.f5201j, c2367y1, FacebookAdapter.KEY_ID);
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                int action2 = (motionEvent.getAction() & 65280) >> 8;
                                C2080d1.m9657k(((int) motionEvent.getX(action2)) + this.f5431b, c2367y1, "container_x");
                                C2080d1.m9657k(((int) motionEvent.getY(action2)) + this.f5432c, c2367y1, "container_y");
                                C2080d1.m9657k((int) motionEvent.getX(action2), c2367y1, "view_x");
                                C2080d1.m9657k((int) motionEvent.getY(action2), c2367y1, "view_y");
                                if (!c2135i1.f5212u) {
                                    m9588d.f4996n = m9692k.f5269f.get(this.f5440k);
                                }
                                c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_ended");
                            }
                            return true;
                        }
                        int action3 = (motionEvent.getAction() & 65280) >> 8;
                        C2080d1.m9657k(((int) motionEvent.getX(action3)) + this.f5431b, c2367y1, "container_x");
                        C2080d1.m9657k(((int) motionEvent.getY(action3)) + this.f5432c, c2367y1, "container_y");
                        C2080d1.m9657k((int) motionEvent.getX(action3), c2367y1, "view_x");
                        C2080d1.m9657k((int) motionEvent.getY(action3), c2367y1, "view_y");
                        c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_began");
                    } else {
                        c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_cancelled");
                    }
                } else {
                    c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_moved");
                }
            } else {
                if (!c2135i1.f5212u) {
                    m9588d.f4996n = m9692k.f5269f.get(this.f5440k);
                }
                c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_ended");
            }
        } else {
            c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_began");
        }
        c2100e2.m9640b();
        return true;
    }
}

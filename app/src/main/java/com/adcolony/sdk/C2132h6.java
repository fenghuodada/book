package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.Button;
import com.google.ads.mediation.facebook.FacebookAdapter;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.adcolony.sdk.h6 */
/* loaded from: classes.dex */
public final class C2132h6 extends Button {

    /* renamed from: a */
    public final int f5174a;

    /* renamed from: b */
    public int f5175b;

    /* renamed from: c */
    public int f5176c;

    /* renamed from: d */
    public int f5177d;

    /* renamed from: e */
    public int f5178e;

    /* renamed from: f */
    public int f5179f;

    /* renamed from: g */
    public int f5180g;

    /* renamed from: h */
    public int f5181h;

    /* renamed from: i */
    public int f5182i;

    /* renamed from: j */
    public int f5183j;

    /* renamed from: k */
    public String f5184k;

    /* renamed from: l */
    public String f5185l;

    /* renamed from: m */
    public String f5186m;

    /* renamed from: n */
    public String f5187n;

    /* renamed from: o */
    public final C2135i1 f5188o;

    /* renamed from: p */
    public final C2100e2 f5189p;

    public C2132h6(Context context, C2100e2 c2100e2, int i, C2135i1 c2135i1) {
        super(context);
        this.f5174a = i;
        this.f5189p = c2100e2;
        this.f5188o = c2135i1;
    }

    public C2132h6(Context context, C2100e2 c2100e2, int i, C2135i1 c2135i1, int i2) {
        super(context, null, 16974145);
        this.f5174a = i;
        this.f5189p = c2100e2;
        this.f5188o = c2135i1;
    }

    /* renamed from: a */
    public static int m9621a(int i, boolean z) {
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0165  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9620b() {
        /*
            Method dump skipped, instructions count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2132h6.m9620b():void");
    }

    /* renamed from: c */
    public final boolean m9619c(C2100e2 c2100e2) {
        C2367y1 c2367y1 = c2100e2.f5098b;
        if (c2367y1.m9441r(FacebookAdapter.KEY_ID) == this.f5174a) {
            int m9441r = c2367y1.m9441r("container_id");
            C2135i1 c2135i1 = this.f5188o;
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
        C2080d1.m9657k(this.f5174a, c2367y1, "view_id");
        C2080d1.m9660h(c2367y1, "ad_session_id", this.f5187n);
        C2080d1.m9657k(this.f5175b + x, c2367y1, "container_x");
        C2080d1.m9657k(this.f5176c + y, c2367y1, "container_y");
        C2080d1.m9657k(x, c2367y1, "view_x");
        C2080d1.m9657k(y, c2367y1, "view_y");
        C2135i1 c2135i1 = this.f5188o;
        C2080d1.m9657k(c2135i1.getId(), c2367y1, FacebookAdapter.KEY_ID);
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                int action2 = (motionEvent.getAction() & 65280) >> 8;
                                int x2 = (int) motionEvent.getX(action2);
                                int y2 = (int) motionEvent.getY(action2);
                                C2080d1.m9657k(((int) motionEvent.getX(action2)) + this.f5175b, c2367y1, "container_x");
                                C2080d1.m9657k(((int) motionEvent.getY(action2)) + this.f5176c, c2367y1, "container_y");
                                C2080d1.m9657k((int) motionEvent.getX(action2), c2367y1, "view_x");
                                C2080d1.m9657k((int) motionEvent.getY(action2), c2367y1, "view_y");
                                if (!c2135i1.f5212u) {
                                    m9588d.f4996n = m9692k.f5269f.get(this.f5187n);
                                }
                                if (x2 > 0 && x2 < getWidth() && y2 > 0 && y2 < getHeight()) {
                                    c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_ended");
                                } else {
                                    c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_cancelled");
                                }
                            } else {
                                return true;
                            }
                        } else {
                            int action3 = (motionEvent.getAction() & 65280) >> 8;
                            C2080d1.m9657k(((int) motionEvent.getX(action3)) + this.f5175b, c2367y1, "container_x");
                            C2080d1.m9657k(((int) motionEvent.getY(action3)) + this.f5176c, c2367y1, "container_y");
                            C2080d1.m9657k((int) motionEvent.getX(action3), c2367y1, "view_x");
                            C2080d1.m9657k((int) motionEvent.getY(action3), c2367y1, "view_y");
                            c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_began");
                        }
                    } else {
                        c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_cancelled");
                    }
                } else {
                    c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_moved");
                }
            } else {
                if (!c2135i1.f5212u) {
                    m9588d.f4996n = m9692k.f5269f.get(this.f5187n);
                }
                if (x > 0 && x < getWidth() && y > 0 && y < getHeight()) {
                    c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_ended");
                } else {
                    c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_cancelled");
                }
            }
        } else {
            c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_began");
        }
        c2100e2.m9640b();
        return true;
    }
}

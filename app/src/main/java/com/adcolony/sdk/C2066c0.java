package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.google.ads.mediation.facebook.FacebookAdapter;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.adcolony.sdk.c0 */
/* loaded from: classes.dex */
public final class C2066c0 extends ImageView {

    /* renamed from: a */
    public final int f5017a;

    /* renamed from: b */
    public int f5018b;

    /* renamed from: c */
    public int f5019c;

    /* renamed from: d */
    public int f5020d;

    /* renamed from: e */
    public int f5021e;

    /* renamed from: f */
    public boolean f5022f;

    /* renamed from: g */
    public boolean f5023g;

    /* renamed from: h */
    public boolean f5024h;

    /* renamed from: i */
    public String f5025i;

    /* renamed from: j */
    public String f5026j;

    /* renamed from: k */
    public final C2100e2 f5027k;

    /* renamed from: l */
    public final C2135i1 f5028l;

    public C2066c0(Context context, C2100e2 c2100e2, int i, C2135i1 c2135i1) {
        super(context);
        this.f5017a = i;
        this.f5027k = c2100e2;
        this.f5028l = c2135i1;
    }

    /* renamed from: a */
    public static boolean m9683a(C2066c0 c2066c0, C2100e2 c2100e2) {
        c2066c0.getClass();
        C2367y1 c2367y1 = c2100e2.f5098b;
        if (c2367y1.m9441r(FacebookAdapter.KEY_ID) == c2066c0.f5017a) {
            int m9441r = c2367y1.m9441r("container_id");
            C2135i1 c2135i1 = c2066c0.f5028l;
            if (m9441r == c2135i1.f5201j && c2367y1.m9436w("ad_session_id").equals(c2135i1.f5203l)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
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
        C2080d1.m9657k(this.f5017a, c2367y1, "view_id");
        C2080d1.m9660h(c2367y1, "ad_session_id", this.f5026j);
        C2080d1.m9657k(this.f5018b + x, c2367y1, "container_x");
        C2080d1.m9657k(this.f5019c + y, c2367y1, "container_y");
        C2080d1.m9657k(x, c2367y1, "view_x");
        C2080d1.m9657k(y, c2367y1, "view_y");
        C2135i1 c2135i1 = this.f5028l;
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
                                C2080d1.m9657k(((int) motionEvent.getX(action2)) + this.f5018b, c2367y1, "container_x");
                                C2080d1.m9657k(((int) motionEvent.getY(action2)) + this.f5019c, c2367y1, "container_y");
                                C2080d1.m9657k((int) motionEvent.getX(action2), c2367y1, "view_x");
                                C2080d1.m9657k((int) motionEvent.getY(action2), c2367y1, "view_y");
                                if (!c2135i1.f5212u) {
                                    m9588d.f4996n = m9692k.f5269f.get(this.f5026j);
                                }
                                if (x2 > 0 && x2 < this.f5020d && y2 > 0 && y2 < this.f5021e) {
                                    c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_ended");
                                } else {
                                    c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_cancelled");
                                }
                            } else {
                                return true;
                            }
                        } else {
                            int action3 = (motionEvent.getAction() & 65280) >> 8;
                            C2080d1.m9657k(((int) motionEvent.getX(action3)) + this.f5018b, c2367y1, "container_x");
                            C2080d1.m9657k(((int) motionEvent.getY(action3)) + this.f5019c, c2367y1, "container_y");
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
                    m9588d.f4996n = m9692k.f5269f.get(this.f5026j);
                }
                if (x > 0 && x < this.f5020d && y > 0 && y < this.f5021e) {
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

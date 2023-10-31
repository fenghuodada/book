package com.adcolony.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.adcolony.sdk.n0 */
/* loaded from: classes.dex */
public class ActivityC2209n0 extends Activity {

    /* renamed from: a */
    public C2135i1 f5376a;

    /* renamed from: b */
    public int f5377b = -1;

    /* renamed from: c */
    public int f5378c;

    /* renamed from: d */
    public boolean f5379d;

    /* renamed from: e */
    public boolean f5380e;

    /* renamed from: f */
    public boolean f5381f;

    /* renamed from: g */
    public boolean f5382g;

    /* renamed from: h */
    public boolean f5383h;

    /* renamed from: i */
    public boolean f5384i;

    /* renamed from: com.adcolony.sdk.n0$a */
    /* loaded from: classes.dex */
    public class C2210a implements InterfaceC2203m2 {
        public C2210a() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            ActivityC2209n0.this.mo9582b(c2100e2);
        }
    }

    /* renamed from: a */
    public final void m9583a() {
        Rect m9523h;
        C2058b3 m9588d = C2201m0.m9588d();
        if (this.f5376a == null) {
            this.f5376a = m9588d.f4994l;
        }
        C2135i1 c2135i1 = this.f5376a;
        if (c2135i1 == null) {
            return;
        }
        c2135i1.f5214w = false;
        if (C2232o6.m9537z()) {
            this.f5376a.f5214w = true;
        }
        if (this.f5382g) {
            m9588d.m9691l().getClass();
            m9523h = C2247p4.m9522i();
        } else {
            m9588d.m9691l().getClass();
            m9523h = C2247p4.m9523h();
        }
        if (m9523h.width() > 0 && m9523h.height() > 0) {
            C2367y1 c2367y1 = new C2367y1();
            C2367y1 c2367y12 = new C2367y1();
            m9588d.m9691l().getClass();
            float m9524g = C2247p4.m9524g();
            C2080d1.m9657k((int) (m9523h.width() / m9524g), c2367y12, "width");
            C2080d1.m9657k((int) (m9523h.height() / m9524g), c2367y12, "height");
            C2080d1.m9657k(C2232o6.m9543t(C2232o6.m9539x()), c2367y12, "app_orientation");
            C2080d1.m9657k(0, c2367y12, "x");
            C2080d1.m9657k(0, c2367y12, "y");
            C2080d1.m9660h(c2367y12, "ad_session_id", this.f5376a.f5203l);
            C2080d1.m9657k(m9523h.width(), c2367y1, "screen_width");
            C2080d1.m9657k(m9523h.height(), c2367y1, "screen_height");
            C2080d1.m9660h(c2367y1, "ad_session_id", this.f5376a.f5203l);
            C2080d1.m9657k(this.f5376a.f5201j, c2367y1, FacebookAdapter.KEY_ID);
            this.f5376a.setLayoutParams(new FrameLayout.LayoutParams(m9523h.width(), m9523h.height()));
            this.f5376a.f5199h = m9523h.width();
            this.f5376a.f5200i = m9523h.height();
            new C2100e2(this.f5376a.f5202k, c2367y12, "MRAID.on_size_change").m9640b();
            new C2100e2(this.f5376a.f5202k, c2367y1, "AdContainer.on_orientation_change").m9640b();
        }
    }

    /* renamed from: b */
    public void mo9582b(C2100e2 c2100e2) {
        int m9441r = c2100e2.f5098b.m9441r("status");
        if ((m9441r != 5 && m9441r != 0 && m9441r != 6 && m9441r != 1) || this.f5379d) {
            return;
        }
        C2058b3 m9588d = C2201m0.m9588d();
        if (m9588d.f4987e == null) {
            m9588d.f4987e = new C2264q4();
        }
        C2264q4 c2264q4 = m9588d.f4987e;
        m9588d.f5001s = c2100e2;
        AlertDialog alertDialog = c2264q4.f5515b;
        if (alertDialog != null) {
            alertDialog.dismiss();
            c2264q4.f5515b = null;
        }
        if (!this.f5381f) {
            finish();
        }
        this.f5379d = true;
        ((ViewGroup) getWindow().getDecorView()).removeAllViews();
        m9588d.f4959A = false;
        C2367y1 c2367y1 = new C2367y1();
        C2080d1.m9660h(c2367y1, FacebookAdapter.KEY_ID, this.f5376a.f5203l);
        new C2100e2(this.f5376a.f5202k, c2367y1, "AdSession.on_close").m9640b();
        m9588d.f4994l = null;
        m9588d.f4997o = null;
        m9588d.f4996n = null;
        C2201m0.m9588d().m9692k().f5266c.remove(this.f5376a.f5203l);
    }

    /* renamed from: c */
    public final void m9581c(boolean z) {
        boolean z2;
        Iterator<Map.Entry<Integer, TextureView$SurfaceTextureListenerC2142j0>> it = this.f5376a.f5192a.entrySet().iterator();
        while (it.hasNext() && !isFinishing()) {
            TextureView$SurfaceTextureListenerC2142j0 value = it.next().getValue();
            if (!value.f5254s && value.f5232K.isPlaying()) {
                value.m9613c();
            }
        }
        C2249q c2249q = C2201m0.m9588d().f4997o;
        if (c2249q != null) {
            C2120g4 c2120g4 = c2249q.f5480e;
            if (c2120g4 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && c2120g4.f5137a != null && z && this.f5383h) {
                c2120g4.m9624c("pause", 0.0f);
            }
        }
    }

    /* renamed from: d */
    public final void m9580d(boolean z) {
        boolean z2;
        for (Map.Entry<Integer, TextureView$SurfaceTextureListenerC2142j0> entry : this.f5376a.f5192a.entrySet()) {
            TextureView$SurfaceTextureListenerC2142j0 value = entry.getValue();
            if (!value.f5254s && !value.f5232K.isPlaying()) {
                C2058b3 m9588d = C2201m0.m9588d();
                if (m9588d.f4987e == null) {
                    m9588d.f4987e = new C2264q4();
                }
                if (!m9588d.f4987e.f5516c) {
                    value.m9612d();
                }
            }
        }
        C2249q c2249q = C2201m0.m9588d().f4997o;
        if (c2249q != null) {
            C2120g4 c2120g4 = c2249q.f5480e;
            if (c2120g4 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && c2120g4.f5137a != null) {
                if ((!z || !this.f5383h) && this.f5384i) {
                    c2120g4.m9624c("resume", 0.0f);
                }
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        C2367y1 c2367y1 = new C2367y1();
        C2080d1.m9660h(c2367y1, FacebookAdapter.KEY_ID, this.f5376a.f5203l);
        new C2100e2(this.f5376a.f5202k, c2367y1, "AdSession.on_back_button").m9640b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this instanceof AdColonyInterstitialActivity) {
            m9583a();
        } else {
            ((AdColonyAdViewActivity) this).f4909j.m9602a();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (C2201m0.m9586f() && C2201m0.m9588d().f4994l != null) {
            C2058b3 m9588d = C2201m0.m9588d();
            this.f5381f = false;
            C2135i1 c2135i1 = m9588d.f4994l;
            this.f5376a = c2135i1;
            c2135i1.f5214w = false;
            if (C2232o6.m9537z()) {
                this.f5376a.f5214w = true;
            }
            this.f5376a.getClass();
            this.f5378c = this.f5376a.f5202k;
            boolean m9444o = m9588d.m9687p().f5362b.m9444o("multi_window_enabled");
            this.f5382g = m9444o;
            if (m9444o) {
                getWindow().addFlags(2048);
                getWindow().clearFlags(1024);
            } else {
                getWindow().addFlags(1024);
                getWindow().clearFlags(2048);
            }
            requestWindowFeature(1);
            getWindow().getDecorView().setBackgroundColor(-16777216);
            if (m9588d.m9687p().f5362b.m9444o("keep_screen_on")) {
                getWindow().addFlags(128);
            }
            ViewParent parent = this.f5376a.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.f5376a);
            }
            setContentView(this.f5376a);
            ArrayList<InterfaceC2203m2> arrayList = this.f5376a.f5210s;
            C2210a c2210a = new C2210a();
            C2201m0.m9589c("AdSession.finish_fullscreen_ad", c2210a);
            arrayList.add(c2210a);
            this.f5376a.f5211t.add("AdSession.finish_fullscreen_ad");
            int i2 = this.f5377b;
            if (i2 != 0) {
                if (i2 != 1) {
                    i = 4;
                } else {
                    i = 6;
                }
            } else {
                i = 7;
            }
            setRequestedOrientation(i);
            this.f5377b = i2;
            if (!this.f5376a.f5213v) {
                C2367y1 c2367y1 = new C2367y1();
                C2080d1.m9660h(c2367y1, FacebookAdapter.KEY_ID, this.f5376a.f5203l);
                C2080d1.m9657k(this.f5376a.f5199h, c2367y1, "screen_width");
                C2080d1.m9657k(this.f5376a.f5200i, c2367y1, "screen_height");
                new C2100e2(this.f5376a.f5202k, c2367y1, "AdSession.on_fullscreen_ad_started").m9640b();
                this.f5376a.f5213v = true;
                return;
            }
            m9583a();
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (C2201m0.m9586f() && this.f5376a != null && !this.f5379d) {
            if ((Build.VERSION.SDK_INT < 24 || !C2232o6.m9537z()) && !this.f5376a.f5214w) {
                C2367y1 c2367y1 = new C2367y1();
                C2080d1.m9660h(c2367y1, FacebookAdapter.KEY_ID, this.f5376a.f5203l);
                new C2100e2(this.f5376a.f5202k, c2367y1, "AdSession.on_error").m9640b();
                this.f5381f = true;
            }
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        m9581c(this.f5380e);
        this.f5380e = false;
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        m9583a();
        m9580d(this.f5380e);
        this.f5380e = true;
        this.f5384i = true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        if (z && this.f5380e) {
            C2201m0.m9588d().m9686q().m9425b(true);
            m9580d(this.f5380e);
            this.f5383h = true;
        } else if (z || !this.f5380e) {
        } else {
            C2201m0.m9588d().m9686q().m9426a(true);
            m9581c(this.f5380e);
            this.f5383h = false;
        }
    }
}

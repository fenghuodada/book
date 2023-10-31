package com.vungle.warren;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.activity.result.C0063d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.work.C1828a;
import com.google.gson.C8695r;
import com.vungle.warren.AdConfig;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.C9879m;
import com.vungle.warren.p058ui.view.C10055l;
import com.vungle.warren.utility.C10078c;
import com.vungle.warren.utility.C10112z;
import com.vungle.warren.utility.HandlerC10102r;
import com.vungle.warren.utility.RunnableC10076a0;
import com.vungle.warren.utility.ViewUtility;

/* renamed from: com.vungle.warren.t1 */
/* loaded from: classes3.dex */
public final class C9975t1 extends RelativeLayout {

    /* renamed from: k */
    public static final /* synthetic */ int f20034k = 0;

    /* renamed from: a */
    public final String f20035a;

    /* renamed from: b */
    public final int f20036b;

    /* renamed from: c */
    public final int f20037c;

    /* renamed from: d */
    public boolean f20038d;

    /* renamed from: e */
    public boolean f20039e;
    @Nullable

    /* renamed from: f */
    public C10055l f20040f;

    /* renamed from: g */
    public final C9821k f20041g;

    /* renamed from: h */
    public InterfaceC9782e0 f20042h;

    /* renamed from: i */
    public final HandlerC10102r f20043i;

    /* renamed from: j */
    public final C9977b f20044j;

    /* renamed from: com.vungle.warren.t1$a */
    /* loaded from: classes3.dex */
    public class RunnableC9976a implements Runnable {
        public RunnableC9976a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = C9975t1.f20034k;
            Log.d("t1", "Refresh Timeout Reached");
            C9975t1 c9975t1 = C9975t1.this;
            c9975t1.f20039e = true;
            Log.d("t1", "Loading Ad");
            C10112z c10112z = new C10112z(c9975t1.f20044j);
            C9888n.m1438a(c9975t1.f20035a, null, c9975t1.f20041g, c10112z);
        }
    }

    /* renamed from: com.vungle.warren.t1$b */
    /* loaded from: classes3.dex */
    public class C9977b implements InterfaceC10136z {
        public C9977b() {
        }

        @Override // com.vungle.warren.InterfaceC10136z
        public final void onAdLoad(String str) {
            int i = C9975t1.f20034k;
            Log.d("t1", "Ad Loaded : " + str);
            C9975t1 c9975t1 = C9975t1.this;
            if (c9975t1.f20039e && (!c9975t1.f20038d)) {
                c9975t1.f20039e = false;
                c9975t1.m1364a(false);
                AdConfig adConfig = new AdConfig(c9975t1.f20041g);
                InterfaceC9782e0 interfaceC9782e0 = c9975t1.f20042h;
                String str2 = c9975t1.f20035a;
                C10055l bannerViewInternal = Vungle.getBannerViewInternal(str2, null, adConfig, interfaceC9782e0);
                if (bannerViewInternal != null) {
                    c9975t1.f20040f = bannerViewInternal;
                    c9975t1.m1363b();
                    return;
                }
                onError(str2, new VungleException(10));
                VungleLogger.m1603c(C9975t1.class.getSimpleName().concat("#loadAdCallback; onAdLoad"), "VungleBannerView is null");
            }
        }

        @Override // com.vungle.warren.InterfaceC10136z, com.vungle.warren.InterfaceC9782e0
        public final void onError(String str, VungleException vungleException) {
            int i = C9975t1.f20034k;
            StringBuilder m13052b = C0063d.m13052b("Ad Load Error : ", str, " Message : ");
            m13052b.append(vungleException.getLocalizedMessage());
            Log.d("t1", m13052b.toString());
            C9975t1 c9975t1 = C9975t1.this;
            if (c9975t1.getVisibility() == 0 && (!c9975t1.f20038d)) {
                c9975t1.f20043i.m1250b();
            }
        }
    }

    public C9975t1(@NonNull Context context, String str, @Nullable String str2, int i, C9821k c9821k, C9785f0 c9785f0) {
        super(context);
        boolean z;
        RunnableC9976a runnableC9976a = new RunnableC9976a();
        this.f20044j = new C9977b();
        long currentTimeMillis = System.currentTimeMillis();
        VungleLogger.m1600f("t1", "ttDownloadContext", String.format("Creating banner ad, id = %1$s, at: %2$d", str, Long.valueOf(currentTimeMillis)));
        this.f20035a = str;
        this.f20041g = c9821k;
        AdConfig.AdSize m1425a = c9821k.m1425a();
        this.f20042h = c9785f0;
        this.f20037c = ViewUtility.m1289a(context, m1425a.getHeight());
        this.f20036b = ViewUtility.m1289a(context, m1425a.getWidth());
        C9846m1 m1477b = C9846m1.m1477b();
        m1477b.getClass();
        if (c9821k.f19891c) {
            C8695r c8695r = new C8695r();
            c8695r.m3215u("event", C0539e.m12265a(13));
            if ((c9821k.f19889a & 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            c8695r.m3217s(C1828a.m9909a(9), Boolean.valueOf(z));
            m1477b.m1474e(new C9879m(13, c8695r));
        }
        this.f20040f = Vungle.getBannerViewInternal(str, C10078c.m1278a(str2), new AdConfig(c9821k), this.f20042h);
        this.f20043i = new HandlerC10102r(new RunnableC10076a0(runnableC9976a), i * 1000);
        VungleLogger.m1600f("t1", "ttDownloadContext", String.format("Banner ad created, id = %1$s, elapsed time: %2$dms", str, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
    }

    /* renamed from: a */
    public final void m1364a(boolean z) {
        synchronized (this) {
            this.f20043i.m1251a();
            C10055l c10055l = this.f20040f;
            if (c10055l != null) {
                c10055l.m1297s(z);
                this.f20040f = null;
                removeAllViews();
            }
        }
    }

    /* renamed from: b */
    public final void m1363b() {
        if (getVisibility() != 0) {
            return;
        }
        C10055l c10055l = this.f20040f;
        String str = this.f20035a;
        if (c10055l == null) {
            if (!this.f20038d) {
                this.f20039e = true;
                Log.d("t1", "Loading Ad");
                C9888n.m1438a(str, null, this.f20041g, new C10112z(this.f20044j));
                return;
            }
            return;
        }
        ViewParent parent = c10055l.getParent();
        int i = this.f20037c;
        int i2 = this.f20036b;
        if (parent != this) {
            addView(c10055l, i2, i);
            Log.d("t1", "Add VungleBannerView to Parent");
        }
        Log.d("t1", "Rendering new ad for: " + str);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
            layoutParams.width = i2;
            requestLayout();
        }
        this.f20043i.m1250b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d("t1", "Banner onAttachedToWindow");
        m1363b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1364a(true);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        setAdVisibility(i == 0);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        setAdVisibility(z);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        Log.d("t1", "Banner onWindowVisibilityChanged: " + i);
        setAdVisibility(i == 0);
    }

    public void setAdVisibility(boolean z) {
        if (z && (!this.f20038d)) {
            this.f20043i.m1250b();
        } else {
            HandlerC10102r handlerC10102r = this.f20043i;
            synchronized (handlerC10102r) {
                if (handlerC10102r.hasMessages(0)) {
                    handlerC10102r.f20338b = (System.currentTimeMillis() - handlerC10102r.f20337a) + handlerC10102r.f20338b;
                    handlerC10102r.removeMessages(0);
                    handlerC10102r.removeCallbacks(handlerC10102r.f20340d);
                }
            }
        }
        C10055l c10055l = this.f20040f;
        if (c10055l != null) {
            c10055l.setAdVisibility(z);
        }
    }
}

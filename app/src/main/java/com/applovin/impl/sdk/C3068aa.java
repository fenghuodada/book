package com.applovin.impl.sdk;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.impl.mediation.p011a.AbstractC2827e;
import com.applovin.impl.mediation.p011a.C2824b;
import com.applovin.impl.mediation.p011a.C2826d;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.sdk.aa */
/* loaded from: classes.dex */
public class C3068aa {

    /* renamed from: a */
    private final C3349v f7618a;

    /* renamed from: e */
    private final Runnable f7622e;

    /* renamed from: f */
    private final ViewTreeObserver.OnPreDrawListener f7623f;

    /* renamed from: g */
    private final WeakReference<View> f7624g;

    /* renamed from: h */
    private final long f7625h;

    /* renamed from: k */
    private int f7628k;

    /* renamed from: l */
    private long f7629l;

    /* renamed from: b */
    private final Object f7619b = new Object();

    /* renamed from: c */
    private final Rect f7620c = new Rect();

    /* renamed from: i */
    private WeakReference<ViewTreeObserver> f7626i = new WeakReference<>(null);

    /* renamed from: j */
    private WeakReference<View> f7627j = new WeakReference<>(null);

    /* renamed from: m */
    private long f7630m = Long.MIN_VALUE;

    /* renamed from: d */
    private final Handler f7621d = new Handler(Looper.getMainLooper());

    /* renamed from: com.applovin.impl.sdk.aa$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3071a {
        void onLogVisibilityImpression();
    }

    public C3068aa(final View view, C3214m c3214m, InterfaceC3071a interfaceC3071a) {
        this.f7618a = c3214m.m7487A();
        this.f7625h = ((Long) c3214m.m7456a(C3109b.f7868bT)).longValue();
        this.f7624g = new WeakReference<>(view);
        final WeakReference weakReference = new WeakReference(interfaceC3071a);
        this.f7622e = new Runnable() { // from class: com.applovin.impl.sdk.aa.1
            @Override // java.lang.Runnable
            public void run() {
                View view2 = (View) C3068aa.this.f7624g.get();
                ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                View view3 = (View) C3068aa.this.f7627j.get();
                if (viewGroup == null || view3 == null) {
                    return;
                }
                if (!C3068aa.this.m8018b(viewGroup, view3)) {
                    C3068aa.this.m8020b();
                    return;
                }
                if (C3349v.m6862a()) {
                    C3068aa.this.f7618a.m6855b("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
                }
                C3068aa.this.m8027a();
                InterfaceC3071a interfaceC3071a2 = (InterfaceC3071a) weakReference.get();
                if (interfaceC3071a2 != null) {
                    interfaceC3071a2.onLogVisibilityImpression();
                }
            }
        };
        this.f7623f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.sdk.aa.2
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                C3068aa.this.m8020b();
                C3068aa.this.m8019b(view);
                return true;
            }
        };
    }

    /* renamed from: a */
    private void m8026a(View view) {
        View rootView = Utils.getRootView(this.f7624g.get());
        if (rootView == null) {
            rootView = Utils.getRootView(view);
        }
        if (rootView == null) {
            if (C3349v.m6862a()) {
                this.f7618a.m6855b("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f7626i = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f7623f);
        } else if (C3349v.m6862a()) {
            this.f7618a.m6851d("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
        }
    }

    /* renamed from: a */
    private boolean m8025a(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f7620c)) {
            return false;
        }
        return ((long) (AppLovinSdkUtils.pxToDp(view2.getContext(), this.f7620c.height()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f7620c.width()))) >= ((long) this.f7628k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m8020b() {
        this.f7621d.postDelayed(this.f7622e, this.f7625h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m8019b(View view) {
        ViewTreeObserver viewTreeObserver = this.f7626i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f7623f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f7623f);
            }
        }
        this.f7626i.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public boolean m8018b(View view, View view2) {
        if (m8025a(view, view2)) {
            if (this.f7630m == Long.MIN_VALUE) {
                this.f7630m = SystemClock.uptimeMillis();
            }
            return SystemClock.uptimeMillis() - this.f7630m >= this.f7629l;
        }
        return false;
    }

    /* renamed from: a */
    public void m8027a() {
        synchronized (this.f7619b) {
            this.f7621d.removeMessages(0);
            m8019b(this.f7624g.get());
            this.f7630m = Long.MIN_VALUE;
            this.f7627j.clear();
        }
    }

    /* renamed from: a */
    public void m8024a(AbstractC2827e abstractC2827e) {
        WeakReference<View> weakReference;
        synchronized (this.f7619b) {
            if (C3349v.m6862a()) {
                this.f7618a.m6855b("VisibilityTracker", "Tracking Visibility...");
            }
            m8027a();
            if (abstractC2827e instanceof C2824b) {
                weakReference = new WeakReference<>(((C2824b) abstractC2827e).m8778w());
            } else if (!(abstractC2827e instanceof C2826d)) {
                return;
            } else {
                weakReference = new WeakReference<>(((C2826d) abstractC2827e).m8757u());
            }
            this.f7627j = weakReference;
            this.f7628k = abstractC2827e.m8749F();
            this.f7629l = abstractC2827e.m8747H();
            m8026a(this.f7627j.get());
        }
    }
}

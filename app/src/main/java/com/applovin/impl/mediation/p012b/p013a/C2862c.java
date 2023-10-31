package com.applovin.impl.mediation.p012b.p013a;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.applovin.impl.mediation.b.a.c */
/* loaded from: classes.dex */
public class C2862c {

    /* renamed from: a */
    private final WeakHashMap<View, Integer> f6921a = new WeakHashMap<>();

    /* renamed from: b */
    private final Object f6922b = new Object();

    /* renamed from: c */
    private final Handler f6923c = new Handler();

    /* renamed from: d */
    private boolean f6924d = false;

    /* renamed from: e */
    private final WeakReference<View> f6925e;

    /* renamed from: f */
    private final ViewTreeObserver.OnPreDrawListener f6926f;

    /* renamed from: g */
    private InterfaceC2865a f6927g;

    /* renamed from: com.applovin.impl.mediation.b.a.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2865a {
        /* renamed from: a */
        void mo6794a(int i, int i2);
    }

    public C2862c(View view) {
        this.f6925e = new WeakReference<>(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f6926f = null;
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.mediation.b.a.c.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                C2862c.this.m8566b();
                return true;
            }
        };
        this.f6926f = onPreDrawListener;
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m8566b() {
        if (this.f6924d) {
            return;
        }
        this.f6924d = true;
        this.f6923c.postDelayed(new Runnable() { // from class: com.applovin.impl.mediation.b.a.c.2
            @Override // java.lang.Runnable
            public void run() {
                synchronized (C2862c.this.f6922b) {
                    C2862c.this.f6924d = false;
                    int i = -1;
                    int i2 = -1;
                    for (Map.Entry entry : C2862c.this.f6921a.entrySet()) {
                        if (C2862c.this.m8565b((View) entry.getKey())) {
                            Integer num = (Integer) entry.getValue();
                            if (i == -1 && i2 == -1) {
                                i = num.intValue();
                                i2 = num.intValue();
                            } else {
                                i = Math.min(i, ((Integer) entry.getValue()).intValue());
                                i2 = Math.max(i2, ((Integer) entry.getValue()).intValue());
                            }
                        }
                    }
                    if (C2862c.this.f6927g != null) {
                        C2862c.this.f6927g.mo6794a(i, i2);
                    }
                }
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public boolean m8565b(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }

    /* renamed from: a */
    public void m8573a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f6927g = null;
        View view = this.f6925e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f6926f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f6925e.clear();
        }
    }

    /* renamed from: a */
    public void m8572a(View view) {
        synchronized (this.f6922b) {
            this.f6921a.remove(view);
        }
    }

    /* renamed from: a */
    public void m8571a(View view, int i) {
        synchronized (this.f6922b) {
            this.f6921a.put(view, Integer.valueOf(i));
            m8566b();
        }
    }

    /* renamed from: a */
    public void m8570a(InterfaceC2865a interfaceC2865a) {
        this.f6927g = interfaceC2865a;
    }
}

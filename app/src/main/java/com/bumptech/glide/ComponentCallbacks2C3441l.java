package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.load.engine.AbstractC3543m;
import com.bumptech.glide.load.resource.gif.C3757c;
import com.bumptech.glide.manager.C3785e;
import com.bumptech.glide.manager.C3787f;
import com.bumptech.glide.manager.C3795n;
import com.bumptech.glide.manager.C3802r;
import com.bumptech.glide.manager.C3805t;
import com.bumptech.glide.manager.InterfaceC3782c;
import com.bumptech.glide.manager.InterfaceC3784d;
import com.bumptech.glide.manager.InterfaceC3793l;
import com.bumptech.glide.manager.InterfaceC3794m;
import com.bumptech.glide.manager.InterfaceC3801q;
import com.bumptech.glide.request.C3827g;
import com.bumptech.glide.request.InterfaceC3823c;
import com.bumptech.glide.request.InterfaceC3826f;
import com.bumptech.glide.request.target.InterfaceC3837g;
import com.bumptech.glide.util.C3861k;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bumptech.glide.l */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C3441l implements ComponentCallbacks2, InterfaceC3794m {

    /* renamed from: k */
    public static final C3827g f9163k;

    /* renamed from: a */
    public final ComponentCallbacks2C3409b f9164a;

    /* renamed from: b */
    public final Context f9165b;

    /* renamed from: c */
    public final InterfaceC3793l f9166c;
    @GuardedBy("this")

    /* renamed from: d */
    public final C3802r f9167d;
    @GuardedBy("this")

    /* renamed from: e */
    public final InterfaceC3801q f9168e;
    @GuardedBy("this")

    /* renamed from: f */
    public final C3805t f9169f;

    /* renamed from: g */
    public final RunnableC3442a f9170g;

    /* renamed from: h */
    public final InterfaceC3782c f9171h;

    /* renamed from: i */
    public final CopyOnWriteArrayList<InterfaceC3826f<Object>> f9172i;
    @GuardedBy("this")

    /* renamed from: j */
    public C3827g f9173j;

    /* renamed from: com.bumptech.glide.l$a */
    /* loaded from: classes.dex */
    public class RunnableC3442a implements Runnable {
        public RunnableC3442a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentCallbacks2C3441l componentCallbacks2C3441l = ComponentCallbacks2C3441l.this;
            componentCallbacks2C3441l.f9166c.mo6491a(componentCallbacks2C3441l);
        }
    }

    /* renamed from: com.bumptech.glide.l$b */
    /* loaded from: classes.dex */
    public class C3443b implements InterfaceC3782c.InterfaceC3783a {
        @GuardedBy("RequestManager.this")

        /* renamed from: a */
        public final C3802r f9175a;

        public C3443b(@NonNull C3802r c3802r) {
            this.f9175a = c3802r;
        }
    }

    static {
        C3827g m6469c = new C3827g().m6469c(Bitmap.class);
        m6469c.f9867t = true;
        f9163k = m6469c;
        new C3827g().m6469c(C3757c.class).f9867t = true;
        C3827g c3827g = (C3827g) ((C3827g) new C3827g().m6468d(AbstractC3543m.f9401b).m6463j()).m6459n();
    }

    public ComponentCallbacks2C3441l(@NonNull ComponentCallbacks2C3409b componentCallbacks2C3409b, @NonNull InterfaceC3793l interfaceC3793l, @NonNull InterfaceC3801q interfaceC3801q, @NonNull Context context) {
        boolean z;
        InterfaceC3782c c3795n;
        C3827g c3827g;
        String str;
        C3802r c3802r = new C3802r();
        InterfaceC3784d interfaceC3784d = componentCallbacks2C3409b.f9039g;
        this.f9169f = new C3805t();
        RunnableC3442a runnableC3442a = new RunnableC3442a();
        this.f9170g = runnableC3442a;
        this.f9164a = componentCallbacks2C3409b;
        this.f9166c = interfaceC3793l;
        this.f9168e = interfaceC3801q;
        this.f9167d = c3802r;
        this.f9165b = context;
        Context applicationContext = context.getApplicationContext();
        C3443b c3443b = new C3443b(c3802r);
        ((C3787f) interfaceC3784d).getClass();
        if (ContextCompat.m12040a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z = true;
        } else {
            z = false;
        }
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            if (z) {
                str = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
            } else {
                str = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
            }
            Log.d("ConnectivityMonitor", str);
        }
        if (z) {
            c3795n = new C3785e(applicationContext, c3443b);
        } else {
            c3795n = new C3795n();
        }
        this.f9171h = c3795n;
        char[] cArr = C3861k.f9956a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            C3861k.m6399e().post(runnableC3442a);
        } else {
            interfaceC3793l.mo6491a(this);
        }
        interfaceC3793l.mo6491a(c3795n);
        this.f9172i = new CopyOnWriteArrayList<>(componentCallbacks2C3409b.f9035c.f9080e);
        C3424g c3424g = componentCallbacks2C3409b.f9035c;
        synchronized (c3424g) {
            if (c3424g.f9085j == null) {
                ((C3411c) c3424g.f9079d).getClass();
                C3827g c3827g2 = new C3827g();
                c3827g2.f9867t = true;
                c3424g.f9085j = c3827g2;
            }
            c3827g = c3424g.f9085j;
        }
        m6726l(c3827g);
        componentCallbacks2C3409b.m6785c(this);
    }

    /* renamed from: i */
    public final void m6729i(@Nullable InterfaceC3837g<?> interfaceC3837g) {
        boolean z;
        if (interfaceC3837g == null) {
            return;
        }
        boolean m6725m = m6725m(interfaceC3837g);
        InterfaceC3823c mo6426f = interfaceC3837g.mo6426f();
        if (!m6725m) {
            ComponentCallbacks2C3409b componentCallbacks2C3409b = this.f9164a;
            synchronized (componentCallbacks2C3409b.f9040h) {
                Iterator it = componentCallbacks2C3409b.f9040h.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((ComponentCallbacks2C3441l) it.next()).m6725m(interfaceC3837g)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
            }
            if (!z && mo6426f != null) {
                interfaceC3837g.mo6427c(null);
                mo6426f.clear();
            }
        }
    }

    /* renamed from: j */
    public final synchronized void m6728j() {
        C3802r c3802r = this.f9167d;
        c3802r.f9822c = true;
        Iterator it = C3861k.m6400d(c3802r.f9820a).iterator();
        while (it.hasNext()) {
            InterfaceC3823c interfaceC3823c = (InterfaceC3823c) it.next();
            if (interfaceC3823c.isRunning()) {
                interfaceC3823c.pause();
                c3802r.f9821b.add(interfaceC3823c);
            }
        }
    }

    /* renamed from: k */
    public final synchronized void m6727k() {
        C3802r c3802r = this.f9167d;
        c3802r.f9822c = false;
        Iterator it = C3861k.m6400d(c3802r.f9820a).iterator();
        while (it.hasNext()) {
            InterfaceC3823c interfaceC3823c = (InterfaceC3823c) it.next();
            if (!interfaceC3823c.mo6435i() && !interfaceC3823c.isRunning()) {
                interfaceC3823c.mo6437g();
            }
        }
        c3802r.f9821b.clear();
    }

    /* renamed from: l */
    public final synchronized void m6726l(@NonNull C3827g c3827g) {
        C3827g clone = c3827g.clone();
        if (clone.f9867t && !clone.f9869v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        clone.f9869v = true;
        clone.f9867t = true;
        this.f9173j = clone;
    }

    /* renamed from: m */
    public final synchronized boolean m6725m(@NonNull InterfaceC3837g<?> interfaceC3837g) {
        InterfaceC3823c mo6426f = interfaceC3837g.mo6426f();
        if (mo6426f == null) {
            return true;
        }
        if (this.f9167d.m6483a(mo6426f)) {
            this.f9169f.f9830a.remove(interfaceC3837g);
            interfaceC3837g.mo6427c(null);
            return true;
        }
        return false;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.InterfaceC3794m
    public final synchronized void onDestroy() {
        this.f9169f.onDestroy();
        Iterator it = C3861k.m6400d(this.f9169f.f9830a).iterator();
        while (it.hasNext()) {
            m6729i((InterfaceC3837g) it.next());
        }
        this.f9169f.f9830a.clear();
        C3802r c3802r = this.f9167d;
        Iterator it2 = C3861k.m6400d(c3802r.f9820a).iterator();
        while (it2.hasNext()) {
            c3802r.m6483a((InterfaceC3823c) it2.next());
        }
        c3802r.f9821b.clear();
        this.f9166c.mo6490b(this);
        this.f9166c.mo6490b(this.f9171h);
        C3861k.m6399e().removeCallbacks(this.f9170g);
        this.f9164a.m6784d(this);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.InterfaceC3794m
    public final synchronized void onStart() {
        m6727k();
        this.f9169f.onStart();
    }

    @Override // com.bumptech.glide.manager.InterfaceC3794m
    public final synchronized void onStop() {
        m6728j();
        this.f9169f.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f9167d + ", treeNode=" + this.f9168e + "}";
    }
}

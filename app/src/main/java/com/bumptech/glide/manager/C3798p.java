package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.C0470b;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C3423f;
import com.bumptech.glide.C3430h;
import com.bumptech.glide.ComponentCallbacks2C3409b;
import com.bumptech.glide.ComponentCallbacks2C3441l;
import com.bumptech.glide.load.resource.bitmap.C3728u;
import com.bumptech.glide.manager.FragmentC3796o;
import com.bumptech.glide.util.C3861k;
import java.util.HashMap;

/* renamed from: com.bumptech.glide.manager.p */
/* loaded from: classes.dex */
public final class C3798p implements Handler.Callback {

    /* renamed from: g */
    public static final C3799a f9813g = new C3799a();

    /* renamed from: a */
    public volatile ComponentCallbacks2C3441l f9814a;
    @VisibleForTesting

    /* renamed from: b */
    public final HashMap f9815b = new HashMap();
    @VisibleForTesting

    /* renamed from: c */
    public final HashMap f9816c = new HashMap();

    /* renamed from: d */
    public final Handler f9817d;

    /* renamed from: e */
    public final InterfaceC3800b f9818e;

    /* renamed from: f */
    public final InterfaceC3792k f9819f;

    /* renamed from: com.bumptech.glide.manager.p$a */
    /* loaded from: classes.dex */
    public class C3799a implements InterfaceC3800b {
    }

    /* renamed from: com.bumptech.glide.manager.p$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3800b {
    }

    public C3798p(@Nullable InterfaceC3800b interfaceC3800b, C3430h c3430h) {
        InterfaceC3792k c3788g;
        new C0470b();
        new C0470b();
        new Bundle();
        this.f9818e = interfaceC3800b == null ? f9813g : interfaceC3800b;
        this.f9817d = new Handler(Looper.getMainLooper(), this);
        if (C3728u.f9694h && C3728u.f9693g) {
            if (c3430h.f9132a.containsKey(C3423f.class)) {
                c3788g = new ComponentCallbacks2C3790i();
            } else {
                c3788g = new C3791j();
            }
        } else {
            c3788g = new C3788g();
        }
        this.f9819f = c3788g;
    }

    @Nullable
    /* renamed from: a */
    public static Activity m6488a(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m6488a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @NonNull
    /* renamed from: b */
    public final ComponentCallbacks2C3441l m6487b(@NonNull Context context) {
        boolean z;
        boolean z2;
        if (context != null) {
            char[] cArr = C3861k.f9956a;
            boolean z3 = true;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z = true;
            } else {
                z = false;
            }
            if (z && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return m6486c((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        return m6487b(activity.getApplicationContext());
                    }
                    if (activity instanceof FragmentActivity) {
                        return m6486c((FragmentActivity) activity);
                    }
                    if (!activity.isDestroyed()) {
                        this.f9819f.mo6492a();
                        FragmentManager fragmentManager = activity.getFragmentManager();
                        Activity m6488a = m6488a(activity);
                        if (m6488a != null && m6488a.isFinishing()) {
                            z3 = false;
                        }
                        FragmentC3796o m6485d = m6485d(fragmentManager);
                        ComponentCallbacks2C3441l componentCallbacks2C3441l = m6485d.f9809d;
                        if (componentCallbacks2C3441l == null) {
                            ComponentCallbacks2C3409b m6786b = ComponentCallbacks2C3409b.m6786b(activity);
                            FragmentC3796o.C3797a c3797a = m6485d.f9807b;
                            ((C3799a) this.f9818e).getClass();
                            ComponentCallbacks2C3441l componentCallbacks2C3441l2 = new ComponentCallbacks2C3441l(m6786b, m6485d.f9806a, c3797a, activity);
                            if (z3) {
                                componentCallbacks2C3441l2.onStart();
                            }
                            m6485d.f9809d = componentCallbacks2C3441l2;
                            return componentCallbacks2C3441l2;
                        }
                        return componentCallbacks2C3441l;
                    }
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                } else if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return m6487b(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f9814a == null) {
                synchronized (this) {
                    if (this.f9814a == null) {
                        ComponentCallbacks2C3409b m6786b2 = ComponentCallbacks2C3409b.m6786b(context.getApplicationContext());
                        InterfaceC3800b interfaceC3800b = this.f9818e;
                        C3781b c3781b = new C3781b();
                        C3789h c3789h = new C3789h();
                        Context applicationContext = context.getApplicationContext();
                        ((C3799a) interfaceC3800b).getClass();
                        this.f9814a = new ComponentCallbacks2C3441l(m6786b2, c3781b, c3789h, applicationContext);
                    }
                }
            }
            return this.f9814a;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @NonNull
    /* renamed from: c */
    public final ComponentCallbacks2C3441l m6486c(@NonNull FragmentActivity fragmentActivity) {
        boolean z;
        char[] cArr = C3861k.f9956a;
        boolean z2 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return m6487b(fragmentActivity.getApplicationContext());
        }
        if (!fragmentActivity.isDestroyed()) {
            this.f9819f.mo6492a();
            androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Activity m6488a = m6488a(fragmentActivity);
            if (m6488a == null || !m6488a.isFinishing()) {
                z2 = true;
            }
            C3803s m6484e = m6484e(supportFragmentManager);
            ComponentCallbacks2C3441l componentCallbacks2C3441l = m6484e.f9827e;
            if (componentCallbacks2C3441l == null) {
                ComponentCallbacks2C3409b m6786b = ComponentCallbacks2C3409b.m6786b(fragmentActivity);
                ((C3799a) this.f9818e).getClass();
                ComponentCallbacks2C3441l componentCallbacks2C3441l2 = new ComponentCallbacks2C3441l(m6786b, m6484e.f9823a, m6484e.f9824b, fragmentActivity);
                if (z2) {
                    componentCallbacks2C3441l2.onStart();
                }
                m6484e.f9827e = componentCallbacks2C3441l2;
                return componentCallbacks2C3441l2;
            }
            return componentCallbacks2C3441l;
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    @NonNull
    /* renamed from: d */
    public final FragmentC3796o m6485d(@NonNull FragmentManager fragmentManager) {
        FragmentC3796o fragmentC3796o = (FragmentC3796o) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (fragmentC3796o == null) {
            HashMap hashMap = this.f9815b;
            FragmentC3796o fragmentC3796o2 = (FragmentC3796o) hashMap.get(fragmentManager);
            if (fragmentC3796o2 == null) {
                fragmentC3796o2 = new FragmentC3796o();
                fragmentC3796o2.f9811f = null;
                hashMap.put(fragmentManager, fragmentC3796o2);
                fragmentManager.beginTransaction().add(fragmentC3796o2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f9817d.obtainMessage(1, fragmentManager).sendToTarget();
            }
            return fragmentC3796o2;
        }
        return fragmentC3796o;
    }

    @NonNull
    /* renamed from: e */
    public final C3803s m6484e(@NonNull androidx.fragment.app.FragmentManager fragmentManager) {
        C3803s c3803s = (C3803s) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (c3803s == null) {
            HashMap hashMap = this.f9816c;
            C3803s c3803s2 = (C3803s) hashMap.get(fragmentManager);
            if (c3803s2 == null) {
                c3803s2 = new C3803s();
                c3803s2.f9828f = null;
                hashMap.put(fragmentManager, c3803s2);
                fragmentManager.beginTransaction().add(c3803s2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f9817d.obtainMessage(2, fragmentManager).sendToTarget();
            }
            return c3803s2;
        }
        return c3803s;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        HashMap hashMap;
        Object obj2;
        Object obj3;
        int i = message.what;
        boolean z = true;
        if (i == 1) {
            obj = (FragmentManager) message.obj;
            hashMap = this.f9815b;
        } else if (i != 2) {
            obj3 = null;
            z = false;
            obj2 = null;
            if (z && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
            }
            return z;
        } else {
            obj = (androidx.fragment.app.FragmentManager) message.obj;
            hashMap = this.f9816c;
        }
        Object remove = hashMap.remove(obj);
        obj2 = obj;
        obj3 = remove;
        if (z) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z;
    }
}

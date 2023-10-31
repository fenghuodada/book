package com.vungle.warren.utility;

import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.warren.p058ui.C10011f;
import com.vungle.warren.p058ui.InterfaceC10009e;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.vungle.warren.utility.a */
/* loaded from: classes3.dex */
public final class C10069a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: j */
    public static final C10069a f20278j = new C10069a();

    /* renamed from: a */
    public boolean f20279a;

    /* renamed from: b */
    public int f20280b;

    /* renamed from: c */
    public int f20281c;

    /* renamed from: f */
    public Handler f20284f;

    /* renamed from: d */
    public final CopyOnWriteArraySet<C10075f> f20282d = new CopyOnWriteArraySet<>();

    /* renamed from: e */
    public final ConcurrentHashMap<InterfaceC10074e, C10075f> f20283e = new ConcurrentHashMap<>();

    /* renamed from: g */
    public boolean f20285g = true;

    /* renamed from: h */
    public boolean f20286h = true;

    /* renamed from: i */
    public final RunnableC10070a f20287i = new RunnableC10070a();

    /* renamed from: com.vungle.warren.utility.a$a */
    /* loaded from: classes3.dex */
    public class RunnableC10070a implements Runnable {
        public RunnableC10070a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C10069a c10069a = C10069a.this;
            if (c10069a.f20281c == 0 && !c10069a.f20285g) {
                c10069a.f20285g = true;
                Iterator<C10075f> it = c10069a.f20282d.iterator();
                while (it.hasNext()) {
                    it.next().mo1282a();
                }
            }
            if (c10069a.f20280b == 0 && c10069a.f20285g && !c10069a.f20286h) {
                c10069a.f20286h = true;
                Iterator<C10075f> it2 = c10069a.f20282d.iterator();
                while (it2.hasNext()) {
                    it2.next().mo1280d();
                }
            }
        }
    }

    /* renamed from: com.vungle.warren.utility.a$b */
    /* loaded from: classes3.dex */
    public class RunnableC10071b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f20289a;

        public RunnableC10071b(WeakReference weakReference) {
            this.f20289a = weakReference;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C10075f remove;
            C10069a c10069a = C10069a.this;
            c10069a.f20284f.removeCallbacks(this);
            InterfaceC10074e interfaceC10074e = (InterfaceC10074e) this.f20289a.get();
            if (interfaceC10074e != null && (remove = c10069a.f20283e.remove(interfaceC10074e)) != null) {
                c10069a.f20282d.remove(remove);
            }
        }
    }

    /* renamed from: com.vungle.warren.utility.a$c */
    /* loaded from: classes3.dex */
    public class C10072c extends C10075f {

        /* renamed from: a */
        public boolean f20291a = false;

        /* renamed from: b */
        public final /* synthetic */ WeakReference f20292b;

        /* renamed from: c */
        public final /* synthetic */ Runnable f20293c;

        public C10072c(WeakReference weakReference, RunnableC10071b runnableC10071b) {
            this.f20292b = weakReference;
            this.f20293c = runnableC10071b;
        }

        @Override // com.vungle.warren.utility.C10069a.C10075f
        /* renamed from: a */
        public final void mo1282a() {
            this.f20291a = true;
            C10069a.this.f20284f.removeCallbacks(this.f20293c);
        }

        @Override // com.vungle.warren.utility.C10069a.C10075f
        /* renamed from: b */
        public final void mo1281b() {
            C10069a.this.f20284f.postDelayed(this.f20293c, 1400L);
        }

        @Override // com.vungle.warren.utility.C10069a.C10075f
        /* renamed from: d */
        public final void mo1280d() {
            InterfaceC10074e interfaceC10074e = (InterfaceC10074e) this.f20292b.get();
            boolean z = this.f20291a;
            C10069a c10069a = C10069a.this;
            if (z && interfaceC10074e != null && c10069a.f20283e.containsKey(interfaceC10074e)) {
                interfaceC10074e.mo1283a();
            }
            if (interfaceC10074e == null) {
                c10069a.getClass();
            } else {
                C10075f remove = c10069a.f20283e.remove(interfaceC10074e);
                if (remove != null) {
                    c10069a.f20282d.remove(remove);
                }
            }
            c10069a.f20284f.removeCallbacks(this.f20293c);
        }
    }

    /* renamed from: com.vungle.warren.utility.a$d */
    /* loaded from: classes3.dex */
    public class C10073d extends C10075f {

        /* renamed from: a */
        public final /* synthetic */ WeakReference f20295a;

        /* renamed from: b */
        public final /* synthetic */ Runnable f20296b;

        public C10073d(WeakReference weakReference, RunnableC10071b runnableC10071b) {
            this.f20295a = weakReference;
            this.f20296b = runnableC10071b;
        }

        @Override // com.vungle.warren.utility.C10069a.C10075f
        /* renamed from: c */
        public final void mo1279c() {
            C10069a.f20278j.f20282d.remove(this);
            C10069a c10069a = C10069a.this;
            C10075f c10075f = c10069a.f20283e.get(this.f20295a.get());
            if (c10075f != null) {
                c10069a.f20284f.postDelayed(this.f20296b, 3000L);
                c10069a.m1287a(c10075f);
            }
        }
    }

    /* renamed from: com.vungle.warren.utility.a$e */
    /* loaded from: classes3.dex */
    public interface InterfaceC10074e {
        /* renamed from: a */
        void mo1283a();
    }

    /* renamed from: com.vungle.warren.utility.a$f */
    /* loaded from: classes3.dex */
    public static class C10075f {
        /* renamed from: a */
        public void mo1282a() {
        }

        /* renamed from: b */
        public void mo1281b() {
        }

        /* renamed from: c */
        public void mo1279c() {
        }

        /* renamed from: d */
        public void mo1280d() {
        }
    }

    /* renamed from: c */
    public static boolean m1285c(Context context, @Nullable Intent intent, Intent intent2, InterfaceC10009e interfaceC10009e) {
        if (intent == null && intent2 == null) {
            return false;
        }
        InterfaceC10009e.EnumC10010a enumC10010a = InterfaceC10009e.EnumC10010a.DEFAULT;
        try {
            if (intent != null) {
                context.startActivity(intent);
            } else {
                context.startActivity(intent2);
            }
            if (interfaceC10009e != null) {
                if (intent != null) {
                    enumC10010a = InterfaceC10009e.EnumC10010a.DEEP_LINK;
                }
                interfaceC10009e.mo1324a(enumC10010a);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            Log.e("a", "Cannot find activity to handle the Implicit intent: " + e.getLocalizedMessage());
            if (intent != null && intent2 != null) {
                try {
                    context.startActivity(intent2);
                    if (interfaceC10009e != null) {
                        interfaceC10009e.mo1324a(enumC10010a);
                    }
                    return true;
                } catch (ActivityNotFoundException unused) {
                    return false;
                }
            }
            return false;
        }
    }

    /* renamed from: d */
    public static void m1284d(Context context, @Nullable Intent intent, Intent intent2, @Nullable C10011f c10011f, @Nullable InterfaceC10009e interfaceC10009e) {
        boolean z;
        WeakReference weakReference = new WeakReference(context);
        C10069a c10069a = f20278j;
        if (c10069a.f20279a && c10069a.f20280b <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (m1285c(context, intent, intent2, interfaceC10009e)) {
                c10069a.m1286b(c10011f);
                return;
            }
            return;
        }
        c10069a.m1287a(new C10077b(weakReference, intent, intent2, interfaceC10009e, c10011f));
    }

    /* renamed from: a */
    public final void m1287a(C10075f c10075f) {
        this.f20282d.add(c10075f);
    }

    /* renamed from: b */
    public final void m1286b(@Nullable InterfaceC10074e interfaceC10074e) {
        boolean z;
        if (interfaceC10074e == null) {
            return;
        }
        if (!this.f20279a) {
            interfaceC10074e.mo1283a();
            return;
        }
        WeakReference weakReference = new WeakReference(interfaceC10074e);
        RunnableC10071b runnableC10071b = new RunnableC10071b(weakReference);
        C10072c c10072c = new C10072c(weakReference, runnableC10071b);
        this.f20283e.put(interfaceC10074e, c10072c);
        if (this.f20279a && this.f20280b <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f20284f.postDelayed(runnableC10071b, 3000L);
            m1287a(c10072c);
            return;
        }
        f20278j.m1287a(new C10073d(weakReference, runnableC10071b));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull Activity activity) {
        this.f20281c = Math.max(0, this.f20281c - 1);
        this.f20284f.postDelayed(this.f20287i, 700L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull Activity activity) {
        int i = this.f20281c + 1;
        this.f20281c = i;
        if (i == 1) {
            if (!this.f20285g) {
                this.f20284f.removeCallbacks(this.f20287i);
                return;
            }
            this.f20285g = false;
            Iterator<C10075f> it = this.f20282d.iterator();
            while (it.hasNext()) {
                it.next().mo1281b();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
        int i = this.f20280b + 1;
        this.f20280b = i;
        if (i == 1 && this.f20286h) {
            this.f20286h = false;
            Iterator<C10075f> it = this.f20282d.iterator();
            while (it.hasNext()) {
                it.next().mo1279c();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
        this.f20280b = Math.max(0, this.f20280b - 1);
        this.f20284f.postDelayed(this.f20287i, 700L);
    }
}

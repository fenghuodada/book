package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import androidx.activity.RunnableC0047i;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.FragmentC1502w;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.lifecycle.u */
/* loaded from: classes.dex */
public final class C1492u implements InterfaceC1483m {
    @NotNull

    /* renamed from: i */
    public static final C1492u f3464i = new C1492u();

    /* renamed from: a */
    public int f3465a;

    /* renamed from: b */
    public int f3466b;
    @Nullable

    /* renamed from: e */
    public Handler f3469e;

    /* renamed from: c */
    public boolean f3467c = true;

    /* renamed from: d */
    public boolean f3468d = true;
    @NotNull

    /* renamed from: f */
    public final C1484n f3470f = new C1484n(this);
    @NotNull

    /* renamed from: g */
    public final RunnableC0047i f3471g = new RunnableC0047i(this, 1);
    @NotNull

    /* renamed from: h */
    public final C1494b f3472h = new C1494b();

    @RequiresApi(29)
    /* renamed from: androidx.lifecycle.u$a */
    /* loaded from: classes.dex */
    public static final class C1493a {
        @JvmStatic
        @DoNotInline
        /* renamed from: a */
        public static final void m10525a(@NotNull Activity activity, @NotNull Application.ActivityLifecycleCallbacks callback) {
            C10843j.m430f(activity, "activity");
            C10843j.m430f(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* renamed from: androidx.lifecycle.u$b */
    /* loaded from: classes.dex */
    public static final class C1494b implements FragmentC1502w.InterfaceC1503a {
        public C1494b() {
        }

        @Override // androidx.lifecycle.FragmentC1502w.InterfaceC1503a
        /* renamed from: a */
        public final void mo10523a() {
        }

        @Override // androidx.lifecycle.FragmentC1502w.InterfaceC1503a
        public final void onResume() {
            C1492u.this.m10526a();
        }

        @Override // androidx.lifecycle.FragmentC1502w.InterfaceC1503a
        public final void onStart() {
            C1492u c1492u = C1492u.this;
            int i = c1492u.f3465a + 1;
            c1492u.f3465a = i;
            if (i == 1 && c1492u.f3468d) {
                c1492u.f3470f.m10534f(AbstractC1464h.EnumC1465a.ON_START);
                c1492u.f3468d = false;
            }
        }
    }

    /* renamed from: a */
    public final void m10526a() {
        int i = this.f3466b + 1;
        this.f3466b = i;
        if (i == 1) {
            if (this.f3467c) {
                this.f3470f.m10534f(AbstractC1464h.EnumC1465a.ON_RESUME);
                this.f3467c = false;
                return;
            }
            Handler handler = this.f3469e;
            C10843j.m433c(handler);
            handler.removeCallbacks(this.f3471g);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1483m
    @NotNull
    public final AbstractC1464h getLifecycle() {
        return this.f3470f;
    }
}

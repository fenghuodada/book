package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.InterfaceC1479k;
import androidx.lifecycle.InterfaceC1483m;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.collections.C10749e;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.InterfaceC10809a;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nOnBackPressedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,317:1\n1747#2,3:318\n533#2,6:321\n*S KotlinDebug\n*F\n+ 1 OnBackPressedDispatcher.kt\nandroidx/activity/OnBackPressedDispatcher\n*L\n194#1:318,3\n209#1:321,6\n*E\n"})
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    @Nullable

    /* renamed from: a */
    public final Runnable f61a;
    @NotNull

    /* renamed from: b */
    public final C10749e<AbstractC0050l> f62b = new C10749e<>();
    @Nullable

    /* renamed from: c */
    public final C0033a f63c;
    @Nullable

    /* renamed from: d */
    public final OnBackInvokedCallback f64d;
    @Nullable

    /* renamed from: e */
    public OnBackInvokedDispatcher f65e;

    /* renamed from: f */
    public boolean f66f;

    @Metadata(m509d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m508d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/k;", "Landroidx/activity/a;", "activity_release"}, m507k = 1, m506mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public final class LifecycleOnBackPressedCancellable implements InterfaceC1479k, InterfaceC0037a {
        @NotNull

        /* renamed from: a */
        public final AbstractC1464h f67a;
        @NotNull

        /* renamed from: b */
        public final AbstractC0050l f68b;
        @Nullable

        /* renamed from: c */
        public C0036d f69c;

        /* renamed from: d */
        public final /* synthetic */ OnBackPressedDispatcher f70d;

        public LifecycleOnBackPressedCancellable(@NotNull OnBackPressedDispatcher onBackPressedDispatcher, @NotNull AbstractC1464h abstractC1464h, AbstractC0050l onBackPressedCallback) {
            C10843j.m430f(onBackPressedCallback, "onBackPressedCallback");
            this.f70d = onBackPressedDispatcher;
            this.f67a = abstractC1464h;
            this.f68b = onBackPressedCallback;
            abstractC1464h.mo10539a(this);
        }

        @Override // androidx.activity.InterfaceC0037a
        public final void cancel() {
            this.f67a.mo10537c(this);
            this.f68b.removeCancellable(this);
            C0036d c0036d = this.f69c;
            if (c0036d != null) {
                c0036d.cancel();
            }
            this.f69c = null;
        }

        @Override // androidx.lifecycle.InterfaceC1479k
        public final void onStateChanged(@NotNull InterfaceC1483m interfaceC1483m, @NotNull AbstractC1464h.EnumC1465a enumC1465a) {
            if (enumC1465a == AbstractC1464h.EnumC1465a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = this.f70d;
                onBackPressedDispatcher.getClass();
                AbstractC0050l onBackPressedCallback = this.f68b;
                C10843j.m430f(onBackPressedCallback, "onBackPressedCallback");
                onBackPressedDispatcher.f62b.addLast(onBackPressedCallback);
                C0036d c0036d = new C0036d(onBackPressedCallback);
                onBackPressedCallback.addCancellable(c0036d);
                if (Build.VERSION.SDK_INT >= 33) {
                    onBackPressedDispatcher.m13061c();
                    onBackPressedCallback.setEnabledChangedCallback$activity_release(onBackPressedDispatcher.f63c);
                }
                this.f69c = c0036d;
            } else if (enumC1465a == AbstractC1464h.EnumC1465a.ON_STOP) {
                C0036d c0036d2 = this.f69c;
                if (c0036d2 != null) {
                    c0036d2.cancel();
                }
            } else if (enumC1465a == AbstractC1464h.EnumC1465a.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    /* loaded from: classes.dex */
    public static final class C0033a extends AbstractC10844k implements InterfaceC10809a<C10868p> {
        public C0033a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.InterfaceC10809a
        public final C10868p invoke() {
            OnBackPressedDispatcher.this.m13061c();
            return C10868p.f21418a;
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$b */
    /* loaded from: classes.dex */
    public static final class C0034b extends AbstractC10844k implements InterfaceC10809a<C10868p> {
        public C0034b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.InterfaceC10809a
        public final C10868p invoke() {
            OnBackPressedDispatcher.this.m13062b();
            return C10868p.f21418a;
        }
    }

    @RequiresApi(33)
    /* renamed from: androidx.activity.OnBackPressedDispatcher$c */
    /* loaded from: classes.dex */
    public static final class C0035c {
        @NotNull

        /* renamed from: a */
        public static final C0035c f73a = new C0035c();

        @DoNotInline
        @NotNull
        /* renamed from: a */
        public final OnBackInvokedCallback m13060a(@NotNull final InterfaceC10809a<C10868p> onBackInvoked) {
            C10843j.m430f(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.m
                public final void onBackInvoked() {
                    InterfaceC10809a onBackInvoked2 = InterfaceC10809a.this;
                    C10843j.m430f(onBackInvoked2, "$onBackInvoked");
                    onBackInvoked2.invoke();
                }
            };
        }

        @DoNotInline
        /* renamed from: b */
        public final void m13059b(@NotNull Object dispatcher, int i, @NotNull Object callback) {
            C10843j.m430f(dispatcher, "dispatcher");
            C10843j.m430f(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) callback);
        }

        @DoNotInline
        /* renamed from: c */
        public final void m13058c(@NotNull Object dispatcher, @NotNull Object callback) {
            C10843j.m430f(dispatcher, "dispatcher");
            C10843j.m430f(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$d */
    /* loaded from: classes.dex */
    public final class C0036d implements InterfaceC0037a {
        @NotNull

        /* renamed from: a */
        public final AbstractC0050l f74a;

        public C0036d(@NotNull AbstractC0050l abstractC0050l) {
            this.f74a = abstractC0050l;
        }

        @Override // androidx.activity.InterfaceC0037a
        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
            C10749e<AbstractC0050l> c10749e = onBackPressedDispatcher.f62b;
            AbstractC0050l abstractC0050l = this.f74a;
            c10749e.remove(abstractC0050l);
            abstractC0050l.removeCancellable(this);
            if (Build.VERSION.SDK_INT >= 33) {
                abstractC0050l.setEnabledChangedCallback$activity_release(null);
                onBackPressedDispatcher.m13061c();
            }
        }
    }

    @JvmOverloads
    public OnBackPressedDispatcher(@Nullable Runnable runnable) {
        this.f61a = runnable;
        if (Build.VERSION.SDK_INT >= 33) {
            this.f63c = new C0033a();
            this.f64d = C0035c.f73a.m13060a(new C0034b());
        }
    }

    @MainThread
    /* renamed from: a */
    public final void m13063a(@NotNull InterfaceC1483m owner, @NotNull AbstractC0050l onBackPressedCallback) {
        C10843j.m430f(owner, "owner");
        C10843j.m430f(onBackPressedCallback, "onBackPressedCallback");
        AbstractC1464h lifecycle = owner.getLifecycle();
        if (lifecycle.mo10538b() == AbstractC1464h.EnumC1468b.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        if (Build.VERSION.SDK_INT >= 33) {
            m13061c();
            onBackPressedCallback.setEnabledChangedCallback$activity_release(this.f63c);
        }
    }

    @MainThread
    /* renamed from: b */
    public final void m13062b() {
        AbstractC0050l abstractC0050l;
        C10749e<AbstractC0050l> c10749e = this.f62b;
        ListIterator<AbstractC0050l> listIterator = c10749e.listIterator(c10749e.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                abstractC0050l = null;
                break;
            }
            abstractC0050l = listIterator.previous();
            if (abstractC0050l.isEnabled()) {
                break;
            }
        }
        AbstractC0050l abstractC0050l2 = abstractC0050l;
        if (abstractC0050l2 != null) {
            abstractC0050l2.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.f61a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @RequiresApi(33)
    /* renamed from: c */
    public final void m13061c() {
        boolean z;
        OnBackInvokedCallback onBackInvokedCallback;
        C10749e<AbstractC0050l> c10749e = this.f62b;
        if (!(c10749e instanceof Collection) || !c10749e.isEmpty()) {
            Iterator<AbstractC0050l> it = c10749e.iterator();
            while (it.hasNext()) {
                if (it.next().isEnabled()) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f65e;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f64d) != null) {
            C0035c c0035c = C0035c.f73a;
            if (z && !this.f66f) {
                c0035c.m13059b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f66f = true;
            } else if (!z && this.f66f) {
                c0035c.m13058c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f66f = false;
            }
        }
    }
}

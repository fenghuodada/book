package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.StyleRes;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.C1482l0;
import androidx.lifecycle.C1484n;
import androidx.lifecycle.InterfaceC1483m;
import androidx.savedstate.C1689b;
import androidx.savedstate.C1692c;
import androidx.savedstate.C1694e;
import androidx.savedstate.InterfaceC1693d;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.activity.j */
/* loaded from: classes.dex */
public class DialogC0048j extends Dialog implements InterfaceC1483m, InterfaceC0052n, InterfaceC1693d {
    @Nullable

    /* renamed from: a */
    public C1484n f93a;
    @NotNull

    /* renamed from: b */
    public final C1692c f94b;
    @NotNull

    /* renamed from: c */
    public final OnBackPressedDispatcher f95c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DialogC0048j(@NotNull Context context, @StyleRes int i) {
        super(context, i);
        C10843j.m430f(context, "context");
        this.f94b = new C1692c(this);
        this.f95c = new OnBackPressedDispatcher(new RunnableC0047i(this, 0));
    }

    /* renamed from: a */
    public static void m13057a(DialogC0048j this$0) {
        C10843j.m430f(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        C10843j.m430f(view, "view");
        m13056b();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: b */
    public final void m13056b() {
        Window window = getWindow();
        C10843j.m433c(window);
        View decorView = window.getDecorView();
        C10843j.m431e(decorView, "window!!.decorView");
        C1482l0.m10540a(decorView, this);
        Window window2 = getWindow();
        C10843j.m433c(window2);
        View decorView2 = window2.getDecorView();
        C10843j.m431e(decorView2, "window!!.decorView");
        C0053o.m13054a(decorView2, this);
        Window window3 = getWindow();
        C10843j.m433c(window3);
        View decorView3 = window3.getDecorView();
        C10843j.m431e(decorView3, "window!!.decorView");
        C1694e.m10045a(decorView3, this);
    }

    @Override // androidx.lifecycle.InterfaceC1483m
    @NotNull
    public final AbstractC1464h getLifecycle() {
        C1484n c1484n = this.f93a;
        if (c1484n == null) {
            C1484n c1484n2 = new C1484n(this);
            this.f93a = c1484n2;
            return c1484n2;
        }
        return c1484n;
    }

    @Override // androidx.activity.InterfaceC0052n
    @NotNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f95c;
    }

    @Override // androidx.savedstate.InterfaceC1693d
    @NotNull
    public final C1689b getSavedStateRegistry() {
        return this.f94b.f4131b;
    }

    @Override // android.app.Dialog
    @CallSuper
    public final void onBackPressed() {
        this.f95c.m13062b();
    }

    @Override // android.app.Dialog
    @CallSuper
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            C10843j.m431e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            OnBackPressedDispatcher onBackPressedDispatcher = this.f95c;
            onBackPressedDispatcher.getClass();
            onBackPressedDispatcher.f65e = onBackInvokedDispatcher;
            onBackPressedDispatcher.m13061c();
        }
        this.f94b.m10047b(bundle);
        C1484n c1484n = this.f93a;
        if (c1484n == null) {
            c1484n = new C1484n(this);
            this.f93a = c1484n;
        }
        c1484n.m10534f(AbstractC1464h.EnumC1465a.ON_CREATE);
    }

    @Override // android.app.Dialog
    @NotNull
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        C10843j.m431e(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f94b.m10046c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    @CallSuper
    public void onStart() {
        super.onStart();
        C1484n c1484n = this.f93a;
        if (c1484n == null) {
            c1484n = new C1484n(this);
            this.f93a = c1484n;
        }
        c1484n.m10534f(AbstractC1464h.EnumC1465a.ON_RESUME);
    }

    @Override // android.app.Dialog
    @CallSuper
    public void onStop() {
        C1484n c1484n = this.f93a;
        if (c1484n == null) {
            c1484n = new C1484n(this);
            this.f93a = c1484n;
        }
        c1484n.m10534f(AbstractC1464h.EnumC1465a.ON_DESTROY);
        this.f93a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m13056b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view) {
        C10843j.m430f(view, "view");
        m13056b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        C10843j.m430f(view, "view");
        m13056b();
        super.setContentView(view, layoutParams);
    }
}

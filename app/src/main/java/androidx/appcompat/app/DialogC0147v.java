package androidx.appcompat.app;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.DialogC0048j;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.C0153z;
import androidx.appcompat.view.AbstractC0178a;
import androidx.core.view.C0957k;

/* renamed from: androidx.appcompat.app.v */
/* loaded from: classes.dex */
public class DialogC0147v extends DialogC0048j implements InterfaceC0106e {

    /* renamed from: d */
    public LayoutInflater$Factory2C0114h f386d;

    /* renamed from: e */
    public final C0146u f387e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.appcompat.app.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DialogC0147v(@androidx.annotation.NonNull android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130969017(0x7f0401b9, float:1.7546704E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            androidx.appcompat.app.u r2 = new androidx.appcompat.app.u
            r2.<init>()
            r4.f387e = r2
            androidx.appcompat.app.AppCompatDelegate r2 = r4.m12931c()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r5 = r2
            androidx.appcompat.app.h r5 = (androidx.appcompat.app.LayoutInflater$Factory2C0114h) r5
            r5.f313U = r6
            r2.mo12968p()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.DialogC0147v.<init>(android.content.Context, int):void");
    }

    @Override // androidx.activity.DialogC0048j, android.app.Dialog
    public void addContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        m12931c().mo12980c(view, layoutParams);
    }

    @NonNull
    /* renamed from: c */
    public final AppCompatDelegate m12931c() {
        if (this.f386d == null) {
            C0153z.ExecutorC0154a executorC0154a = AppCompatDelegate.f205a;
            this.f386d = new LayoutInflater$Factory2C0114h(getContext(), getWindow(), this, this);
        }
        return this.f386d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean m12930d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m12931c().mo12967q();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0957k.m11426b(this.f387e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    @Nullable
    public final <T extends View> T findViewById(@IdRes int i) {
        return (T) m12931c().mo12977f(i);
    }

    @Override // android.app.Dialog
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public final void invalidateOptionsMenu() {
        m12931c().mo12970m();
    }

    @Override // androidx.activity.DialogC0048j, android.app.Dialog
    public void onCreate(Bundle bundle) {
        m12931c().mo12971l();
        super.onCreate(bundle);
        m12931c().mo12968p();
    }

    @Override // androidx.activity.DialogC0048j, android.app.Dialog
    public void onStop() {
        super.onStop();
        m12931c().mo12962v();
    }

    @Override // androidx.appcompat.app.InterfaceC0106e
    public final void onSupportActionModeFinished(AbstractC0178a abstractC0178a) {
    }

    @Override // androidx.appcompat.app.InterfaceC0106e
    public final void onSupportActionModeStarted(AbstractC0178a abstractC0178a) {
    }

    @Override // androidx.appcompat.app.InterfaceC0106e
    @Nullable
    public final AbstractC0178a onWindowStartingSupportActionMode(AbstractC0178a.InterfaceC0179a interfaceC0179a) {
        return null;
    }

    @Override // androidx.activity.DialogC0048j, android.app.Dialog
    public void setContentView(@LayoutRes int i) {
        m12931c().mo12960y(i);
    }

    @Override // androidx.activity.DialogC0048j, android.app.Dialog
    public void setContentView(@NonNull View view) {
        m12931c().mo12959z(view);
    }

    @Override // androidx.activity.DialogC0048j, android.app.Dialog
    public void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        m12931c().mo13008A(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        m12931c().mo13005D(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m12931c().mo13005D(charSequence);
    }
}

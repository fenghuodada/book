package com.android.tool.util.weight.dialogFragment;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.ambrose.overwall.R;
import com.android.tool.util.weight.dialogFragment.DialogInterface$OnShowListenerC2606a;

/* renamed from: com.android.tool.util.weight.dialogFragment.b */
/* loaded from: classes.dex */
public class C2615b extends DialogFragment {

    /* renamed from: b */
    public static String f6145b;

    /* renamed from: c */
    public static long f6146c;

    /* renamed from: a */
    public final DialogInterface$OnShowListenerC2606a f6147a;

    /* renamed from: com.android.tool.util.weight.dialogFragment.b$a */
    /* loaded from: classes.dex */
    public static class C2616a<B extends C2616a> extends DialogInterface$OnShowListenerC2606a.C2607a<B> {

        /* renamed from: h */
        public final FragmentActivity f6148h;

        /* renamed from: i */
        public C2615b f6149i;

        public C2616a(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            this.f6148h = fragmentActivity;
        }

        /* renamed from: e */
        public final void m9323e() {
            int i;
            if (this.f6137c != null) {
                if (this.f6139e == 0) {
                    this.f6139e = 17;
                }
                if (this.f6138d == 0) {
                    int i2 = this.f6139e;
                    if (i2 != 3) {
                        if (i2 != 5) {
                            if (i2 != 48) {
                                if (i2 != 80) {
                                    i = R.style.ScaleAnimStyle;
                                } else {
                                    i = R.style.BottomAnimStyle;
                                }
                            } else {
                                i = R.style.TopAnimStyle;
                            }
                        } else {
                            i = R.style.RightAnimStyle;
                        }
                    } else {
                        i = R.style.LeftAnimStyle;
                    }
                    this.f6138d = i;
                }
                DialogInterface$OnShowListenerC2606a dialogInterface$OnShowListenerC2606a = new DialogInterface$OnShowListenerC2606a(this.f6135a);
                this.f6136b = dialogInterface$OnShowListenerC2606a;
                dialogInterface$OnShowListenerC2606a.setContentView(this.f6137c);
                this.f6136b.setCancelable(true);
                this.f6136b.setCanceledOnTouchOutside(true);
                Window window = this.f6136b.getWindow();
                if (window != null) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.width = this.f6140f;
                    attributes.height = this.f6141g;
                    attributes.gravity = this.f6139e;
                    attributes.windowAnimations = this.f6138d;
                    window.setAttributes(attributes);
                    window.addFlags(2);
                    window.setDimAmount(0.5f);
                }
                DialogInterface$OnShowListenerC2606a dialogInterface$OnShowListenerC2606a2 = this.f6136b;
                C2615b c2615b = new C2615b(dialogInterface$OnShowListenerC2606a2);
                this.f6149i = c2615b;
                c2615b.setCancelable(dialogInterface$OnShowListenerC2606a2.f6130g);
                this.f6149i.show(this.f6148h.getSupportFragmentManager(), getClass().getName());
                return;
            }
            throw new IllegalArgumentException("Dialog layout cannot be empty");
        }
    }

    public C2615b() {
    }

    @SuppressLint({"ValidFragment"})
    public C2615b(DialogInterface$OnShowListenerC2606a dialogInterface$OnShowListenerC2606a) {
        this.f6147a = dialogInterface$OnShowListenerC2606a;
        if (dialogInterface$OnShowListenerC2606a == null) {
            throw new IllegalArgumentException("The dialog box cannot be empty");
        }
    }

    /* renamed from: h */
    public static boolean m9324h(String str) {
        boolean z = str.equals(f6145b) && SystemClock.uptimeMillis() - f6146c < 500;
        f6145b = str;
        f6146c = SystemClock.uptimeMillis();
        return z;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog getDialog() {
        return this.f6147a;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(@Nullable Bundle bundle) {
        DialogInterface$OnShowListenerC2606a dialogInterface$OnShowListenerC2606a = this.f6147a;
        if (dialogInterface$OnShowListenerC2606a == null) {
            setShowsDialog(false);
        }
        super.onActivityCreated(bundle);
        if (dialogInterface$OnShowListenerC2606a == null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        return this.f6147a;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final int show(@NonNull FragmentTransaction fragmentTransaction, String str) {
        if (m9324h(str) || isStateSaved()) {
            return -1;
        }
        return super.show(fragmentTransaction, str);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void show(@NonNull FragmentManager fragmentManager, String str) {
        if (m9324h(str) || fragmentManager.isStateSaved()) {
            return;
        }
        super.show(fragmentManager, str);
    }
}

package com.android.tool.util.weight.dialogFragment;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.DialogC0147v;
import com.ambrose.overwall.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.android.tool.util.weight.dialogFragment.a */
/* loaded from: classes.dex */
public final class DialogInterface$OnShowListenerC2606a extends DialogC0147v implements DialogInterface.OnShowListener, DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: l */
    public static final Handler f6128l = new Handler(Looper.getMainLooper());

    /* renamed from: f */
    public final Integer f6129f;

    /* renamed from: g */
    public boolean f6130g;

    /* renamed from: h */
    public final DialogInterface$OnShowListenerC2610d<DialogInterface$OnShowListenerC2606a> f6131h;

    /* renamed from: i */
    public List<InterfaceC2613g> f6132i;

    /* renamed from: j */
    public List<InterfaceC2611e> f6133j;

    /* renamed from: k */
    public List<InterfaceC2612f> f6134k;

    /* renamed from: com.android.tool.util.weight.dialogFragment.a$a */
    /* loaded from: classes.dex */
    public static class C2607a<B extends C2607a> {

        /* renamed from: a */
        public final Context f6135a;

        /* renamed from: b */
        public DialogInterface$OnShowListenerC2606a f6136b;

        /* renamed from: c */
        public View f6137c;

        /* renamed from: d */
        public int f6138d = 0;

        /* renamed from: e */
        public int f6139e = 0;

        /* renamed from: f */
        public int f6140f = -2;

        /* renamed from: g */
        public int f6141g = -2;

        public C2607a(Context context) {
            this.f6135a = context;
        }

        /* renamed from: a */
        public final <V extends View> V m9331a(@IdRes int i) {
            View view = this.f6137c;
            if (view != null) {
                return (V) view.findViewById(i);
            }
            throw new IllegalStateException("are you ok?");
        }

        /* renamed from: b */
        public final void m9330b(@StyleRes int i) {
            boolean z;
            Window window;
            this.f6138d = i;
            DialogInterface$OnShowListenerC2606a dialogInterface$OnShowListenerC2606a = this.f6136b;
            if (dialogInterface$OnShowListenerC2606a != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && (window = dialogInterface$OnShowListenerC2606a.getWindow()) != null) {
                window.setWindowAnimations(i);
            }
        }

        /* renamed from: c */
        public final void m9329c(@LayoutRes int i) {
            boolean z;
            int i2;
            Window window;
            boolean z2;
            ViewGroup.LayoutParams layoutParams;
            Context context = this.f6135a;
            LayoutInflater from = LayoutInflater.from(context);
            FrameLayout frameLayout = new FrameLayout(context);
            boolean z3 = false;
            View inflate = from.inflate(i, (ViewGroup) frameLayout, false);
            C2617c c2617c = (C2617c) this;
            c2617c.f6137c = inflate;
            DialogInterface$OnShowListenerC2606a dialogInterface$OnShowListenerC2606a = c2617c.f6136b;
            if (dialogInterface$OnShowListenerC2606a != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                dialogInterface$OnShowListenerC2606a.setContentView(inflate);
            } else if (inflate != null) {
                ViewGroup.LayoutParams layoutParams2 = inflate.getLayoutParams();
                if (layoutParams2 != null && c2617c.f6140f == -2 && c2617c.f6141g == -2) {
                    int i3 = layoutParams2.width;
                    c2617c.f6140f = i3;
                    DialogInterface$OnShowListenerC2606a dialogInterface$OnShowListenerC2606a2 = c2617c.f6136b;
                    if (dialogInterface$OnShowListenerC2606a2 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        Window window2 = dialogInterface$OnShowListenerC2606a2.getWindow();
                        if (window2 != null) {
                            WindowManager.LayoutParams attributes = window2.getAttributes();
                            attributes.width = i3;
                            window2.setAttributes(attributes);
                        }
                    } else {
                        View view = c2617c.f6137c;
                        if (view != null) {
                            layoutParams = view.getLayoutParams();
                        } else {
                            layoutParams = null;
                        }
                        if (layoutParams != null) {
                            layoutParams.width = i3;
                            c2617c.f6137c.setLayoutParams(layoutParams);
                        }
                    }
                    c2617c.m9328d(layoutParams2.height);
                }
                if (c2617c.f6139e == 0) {
                    if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                        i2 = ((FrameLayout.LayoutParams) layoutParams2).gravity;
                    } else if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                        i2 = ((LinearLayout.LayoutParams) layoutParams2).gravity;
                    } else {
                        i2 = 17;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i2, c2617c.f6135a.getResources().getConfiguration().getLayoutDirection());
                    c2617c.f6139e = absoluteGravity;
                    DialogInterface$OnShowListenerC2606a dialogInterface$OnShowListenerC2606a3 = c2617c.f6136b;
                    if (dialogInterface$OnShowListenerC2606a3 != null) {
                        z3 = true;
                    }
                    if (z3 && (window = dialogInterface$OnShowListenerC2606a3.getWindow()) != null) {
                        window.setGravity(absoluteGravity);
                    }
                }
            }
        }

        /* renamed from: d */
        public final void m9328d(int i) {
            boolean z;
            ViewGroup.LayoutParams layoutParams;
            this.f6141g = i;
            DialogInterface$OnShowListenerC2606a dialogInterface$OnShowListenerC2606a = this.f6136b;
            if (dialogInterface$OnShowListenerC2606a != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Window window = dialogInterface$OnShowListenerC2606a.getWindow();
                if (window != null) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.height = i;
                    window.setAttributes(attributes);
                    return;
                }
                return;
            }
            View view = this.f6137c;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.height = i;
                this.f6137c.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: com.android.tool.util.weight.dialogFragment.a$b */
    /* loaded from: classes.dex */
    public static final class C2608b implements InterfaceC2611e {

        /* renamed from: a */
        public final DialogInterface.OnCancelListener f6142a;

        public C2608b(DialogInterface.OnCancelListener onCancelListener) {
            this.f6142a = onCancelListener;
        }

        @Override // com.android.tool.util.weight.dialogFragment.DialogInterface$OnShowListenerC2606a.InterfaceC2611e
        /* renamed from: a */
        public final void mo9327a(DialogInterface$OnShowListenerC2606a dialogInterface$OnShowListenerC2606a) {
            DialogInterface.OnCancelListener onCancelListener = this.f6142a;
            if (onCancelListener != null) {
                onCancelListener.onCancel(dialogInterface$OnShowListenerC2606a);
            }
        }
    }

    /* renamed from: com.android.tool.util.weight.dialogFragment.a$c */
    /* loaded from: classes.dex */
    public static final class C2609c implements InterfaceC2612f {

        /* renamed from: a */
        public final DialogInterface.OnDismissListener f6143a;

        public C2609c(DialogInterface.OnDismissListener onDismissListener) {
            this.f6143a = onDismissListener;
        }

        @Override // com.android.tool.util.weight.dialogFragment.DialogInterface$OnShowListenerC2606a.InterfaceC2612f
        /* renamed from: a */
        public final void mo9326a(DialogInterface$OnShowListenerC2606a dialogInterface$OnShowListenerC2606a) {
            DialogInterface.OnDismissListener onDismissListener = this.f6143a;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(dialogInterface$OnShowListenerC2606a);
            }
        }
    }

    /* renamed from: com.android.tool.util.weight.dialogFragment.a$d */
    /* loaded from: classes.dex */
    public static final class DialogInterface$OnShowListenerC2610d<T extends DialogInterface.OnShowListener & DialogInterface.OnCancelListener & DialogInterface.OnDismissListener> extends WeakReference<T> implements DialogInterface.OnShowListener, DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
        public DialogInterface$OnShowListenerC2610d(DialogInterface.OnShowListener onShowListener) {
            super(onShowListener);
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            if (get() != 0) {
                ((DialogInterface.OnCancelListener) ((DialogInterface.OnShowListener) get())).onCancel(dialogInterface);
            }
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            if (get() != 0) {
                ((DialogInterface.OnDismissListener) ((DialogInterface.OnShowListener) get())).onDismiss(dialogInterface);
            }
        }

        @Override // android.content.DialogInterface.OnShowListener
        public final void onShow(DialogInterface dialogInterface) {
            if (get() != 0) {
                ((DialogInterface.OnShowListener) get()).onShow(dialogInterface);
            }
        }
    }

    /* renamed from: com.android.tool.util.weight.dialogFragment.a$e */
    /* loaded from: classes.dex */
    public interface InterfaceC2611e {
        /* renamed from: a */
        void mo9327a(DialogInterface$OnShowListenerC2606a dialogInterface$OnShowListenerC2606a);
    }

    /* renamed from: com.android.tool.util.weight.dialogFragment.a$f */
    /* loaded from: classes.dex */
    public interface InterfaceC2612f {
        /* renamed from: a */
        void mo9326a(DialogInterface$OnShowListenerC2606a dialogInterface$OnShowListenerC2606a);
    }

    /* renamed from: com.android.tool.util.weight.dialogFragment.a$g */
    /* loaded from: classes.dex */
    public interface InterfaceC2613g {
        /* renamed from: a */
        void mo9325a(DialogInterface$OnShowListenerC2606a dialogInterface$OnShowListenerC2606a);
    }

    /* renamed from: com.android.tool.util.weight.dialogFragment.a$h */
    /* loaded from: classes.dex */
    public static final class C2614h implements InterfaceC2613g {

        /* renamed from: a */
        public final DialogInterface.OnShowListener f6144a;

        public C2614h(DialogInterface.OnShowListener onShowListener) {
            this.f6144a = onShowListener;
        }

        @Override // com.android.tool.util.weight.dialogFragment.DialogInterface$OnShowListenerC2606a.InterfaceC2613g
        /* renamed from: a */
        public final void mo9325a(DialogInterface$OnShowListenerC2606a dialogInterface$OnShowListenerC2606a) {
            DialogInterface.OnShowListener onShowListener = this.f6144a;
            if (onShowListener != null) {
                onShowListener.onShow(dialogInterface$OnShowListenerC2606a);
            }
        }
    }

    public DialogInterface$OnShowListenerC2606a(Context context) {
        super(context, R.style.BaseDialogStyle);
        this.f6129f = Integer.valueOf(hashCode());
        this.f6130g = true;
        this.f6131h = new DialogInterface$OnShowListenerC2610d<>(this);
    }

    @Override // android.app.Dialog
    public final void hide() {
        if (getCurrentFocus() != null) {
            dismiss();
        } else {
            super.hide();
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        List<InterfaceC2611e> list = this.f6133j;
        if (list != null) {
            for (InterfaceC2611e interfaceC2611e : list) {
                interfaceC2611e.mo9327a(this);
            }
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        List<InterfaceC2612f> list = this.f6134k;
        if (list != null) {
            for (InterfaceC2612f interfaceC2612f : list) {
                interfaceC2612f.mo9326a(this);
            }
        }
        f6128l.removeCallbacksAndMessages(this.f6129f);
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        List<InterfaceC2613g> list = this.f6132i;
        if (list != null) {
            for (InterfaceC2613g interfaceC2613g : list) {
                interfaceC2613g.mo9325a(this);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        this.f6130g = z;
        super.setCancelable(z);
    }

    @Override // android.app.Dialog
    @Deprecated
    public final void setOnCancelListener(@Nullable DialogInterface.OnCancelListener onCancelListener) {
        if (onCancelListener == null) {
            return;
        }
        C2608b c2608b = new C2608b(onCancelListener);
        if (this.f6133j == null) {
            this.f6133j = new ArrayList();
            super.setOnCancelListener(this.f6131h);
        }
        this.f6133j.add(c2608b);
    }

    @Override // android.app.Dialog
    @Deprecated
    public final void setOnDismissListener(@Nullable DialogInterface.OnDismissListener onDismissListener) {
        if (onDismissListener == null) {
            return;
        }
        C2609c c2609c = new C2609c(onDismissListener);
        if (this.f6134k == null) {
            this.f6134k = new ArrayList();
            super.setOnDismissListener(this.f6131h);
        }
        this.f6134k.add(c2609c);
    }

    @Override // android.app.Dialog
    @Deprecated
    public final void setOnKeyListener(@Nullable DialogInterface.OnKeyListener onKeyListener) {
        super.setOnKeyListener(onKeyListener);
    }

    @Override // android.app.Dialog
    @Deprecated
    public final void setOnShowListener(@Nullable DialogInterface.OnShowListener onShowListener) {
        if (onShowListener == null) {
            return;
        }
        C2614h c2614h = new C2614h(onShowListener);
        if (this.f6132i == null) {
            this.f6132i = new ArrayList();
            super.setOnShowListener(this.f6131h);
        }
        this.f6132i.add(c2614h);
    }
}

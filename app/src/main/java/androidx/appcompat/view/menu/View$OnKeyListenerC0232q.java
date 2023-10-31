package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0226m;
import androidx.appcompat.widget.C0357i1;
import androidx.appcompat.widget.C0407r;
import androidx.appcompat.widget.C0435z0;
import com.ambrose.overwall.R;

/* renamed from: androidx.appcompat.view.menu.q */
/* loaded from: classes.dex */
public final class View$OnKeyListenerC0232q extends AbstractC0222k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b */
    public final Context f767b;

    /* renamed from: c */
    public final C0210g f768c;

    /* renamed from: d */
    public final C0209f f769d;

    /* renamed from: e */
    public final boolean f770e;

    /* renamed from: f */
    public final int f771f;

    /* renamed from: g */
    public final int f772g;

    /* renamed from: h */
    public final int f773h;

    /* renamed from: i */
    public final C0357i1 f774i;

    /* renamed from: l */
    public PopupWindow.OnDismissListener f777l;

    /* renamed from: m */
    public View f778m;

    /* renamed from: n */
    public View f779n;

    /* renamed from: o */
    public InterfaceC0226m.InterfaceC0227a f780o;

    /* renamed from: p */
    public ViewTreeObserver f781p;

    /* renamed from: q */
    public boolean f782q;

    /* renamed from: r */
    public boolean f783r;

    /* renamed from: s */
    public int f784s;

    /* renamed from: u */
    public boolean f786u;

    /* renamed from: j */
    public final ViewTreeObserver$OnGlobalLayoutListenerC0233a f775j = new ViewTreeObserver$OnGlobalLayoutListenerC0233a();

    /* renamed from: k */
    public final View$OnAttachStateChangeListenerC0234b f776k = new View$OnAttachStateChangeListenerC0234b();

    /* renamed from: t */
    public int f785t = 0;

    /* renamed from: androidx.appcompat.view.menu.q$a */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC0233a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC0233a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            View$OnKeyListenerC0232q view$OnKeyListenerC0232q = View$OnKeyListenerC0232q.this;
            if (view$OnKeyListenerC0232q.mo12653a() && !view$OnKeyListenerC0232q.f774i.f1220y) {
                View view = view$OnKeyListenerC0232q.f779n;
                if (view != null && view.isShown()) {
                    view$OnKeyListenerC0232q.f774i.show();
                } else {
                    view$OnKeyListenerC0232q.dismiss();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.q$b */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC0234b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC0234b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            View$OnKeyListenerC0232q view$OnKeyListenerC0232q = View$OnKeyListenerC0232q.this;
            ViewTreeObserver viewTreeObserver = view$OnKeyListenerC0232q.f781p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    view$OnKeyListenerC0232q.f781p = view.getViewTreeObserver();
                }
                view$OnKeyListenerC0232q.f781p.removeGlobalOnLayoutListener(view$OnKeyListenerC0232q.f775j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public View$OnKeyListenerC0232q(int i, int i2, Context context, View view, C0210g c0210g, boolean z) {
        this.f767b = context;
        this.f768c = c0210g;
        this.f770e = z;
        this.f769d = new C0209f(c0210g, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f772g = i;
        this.f773h = i2;
        Resources resources = context.getResources();
        this.f771f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f778m = view;
        this.f774i = new C0357i1(context, i, i2);
        c0210g.m12849b(this, context);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0231p
    /* renamed from: a */
    public final boolean mo12653a() {
        return !this.f782q && this.f774i.mo12653a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: b */
    public final void mo12710b(C0210g c0210g, boolean z) {
        if (c0210g != this.f768c) {
            return;
        }
        dismiss();
        InterfaceC0226m.InterfaceC0227a interfaceC0227a = this.f780o;
        if (interfaceC0227a != null) {
            interfaceC0227a.mo12698b(c0210g, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: c */
    public final boolean mo12709c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: d */
    public final void mo12825d(InterfaceC0226m.InterfaceC0227a interfaceC0227a) {
        this.f780o = interfaceC0227a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0231p
    public final void dismiss() {
        if (mo12653a()) {
            this.f774i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: g */
    public final void mo12707g() {
        this.f783r = false;
        C0209f c0209f = this.f769d;
        if (c0209f != null) {
            c0209f.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0231p
    /* renamed from: h */
    public final C0435z0 mo12649h() {
        return this.f774i.f1198c;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo12705i(androidx.appcompat.view.menu.SubMenuC0236s r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L7a
            androidx.appcompat.view.menu.l r0 = new androidx.appcompat.view.menu.l
            android.content.Context r5 = r9.f767b
            android.view.View r6 = r9.f779n
            boolean r8 = r9.f770e
            int r3 = r9.f772g
            int r4 = r9.f773h
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.m$a r2 = r9.f780o
            r0.f761i = r2
            androidx.appcompat.view.menu.k r3 = r0.f762j
            if (r3 == 0) goto L23
            r3.mo12825d(r2)
        L23:
            boolean r2 = androidx.appcompat.view.menu.AbstractC0222k.m12830t(r10)
            r0.f760h = r2
            androidx.appcompat.view.menu.k r3 = r0.f762j
            if (r3 == 0) goto L30
            r3.mo12822n(r2)
        L30:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f777l
            r0.f763k = r2
            r2 = 0
            r9.f777l = r2
            androidx.appcompat.view.menu.g r2 = r9.f768c
            r2.m12848c(r1)
            androidx.appcompat.widget.i1 r2 = r9.f774i
            int r3 = r2.f1201f
            int r2 = r2.m12646n()
            int r4 = r9.f785t
            android.view.View r5 = r9.f778m
            java.util.WeakHashMap<android.view.View, androidx.core.view.g2> r6 = androidx.core.view.ViewCompat.f2518a
            int r5 = androidx.core.view.ViewCompat.C0815e.m11742d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5e
            android.view.View r4 = r9.f778m
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5e:
            boolean r4 = r0.m12828b()
            r5 = 1
            if (r4 == 0) goto L66
            goto L6f
        L66:
            android.view.View r4 = r0.f758f
            if (r4 != 0) goto L6c
            r0 = r1
            goto L70
        L6c:
            r0.m12827d(r3, r2, r5, r5)
        L6f:
            r0 = r5
        L70:
            if (r0 == 0) goto L7a
            androidx.appcompat.view.menu.m$a r0 = r9.f780o
            if (r0 == 0) goto L79
            r0.mo12697c(r10)
        L79:
            return r5
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.View$OnKeyListenerC0232q.mo12705i(androidx.appcompat.view.menu.s):boolean");
    }

    @Override // androidx.appcompat.view.menu.AbstractC0222k
    /* renamed from: k */
    public final void mo12824k(C0210g c0210g) {
    }

    @Override // androidx.appcompat.view.menu.AbstractC0222k
    /* renamed from: m */
    public final void mo12823m(View view) {
        this.f778m = view;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0222k
    /* renamed from: n */
    public final void mo12822n(boolean z) {
        this.f769d.f680c = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0222k
    /* renamed from: o */
    public final void mo12821o(int i) {
        this.f785t = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f782q = true;
        this.f768c.m12848c(true);
        ViewTreeObserver viewTreeObserver = this.f781p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f781p = this.f779n.getViewTreeObserver();
            }
            this.f781p.removeGlobalOnLayoutListener(this.f775j);
            this.f781p = null;
        }
        this.f779n.removeOnAttachStateChangeListener(this.f776k);
        PopupWindow.OnDismissListener onDismissListener = this.f777l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0222k
    /* renamed from: p */
    public final void mo12820p(int i) {
        this.f774i.f1201f = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0222k
    /* renamed from: q */
    public final void mo12819q(PopupWindow.OnDismissListener onDismissListener) {
        this.f777l = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0222k
    /* renamed from: r */
    public final void mo12818r(boolean z) {
        this.f786u = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0222k
    /* renamed from: s */
    public final void mo12817s(int i) {
        this.f774i.m12647k(i);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0231p
    public final void show() {
        View view;
        boolean z;
        Rect rect;
        boolean z2 = true;
        if (!mo12653a()) {
            if (!this.f782q && (view = this.f778m) != null) {
                this.f779n = view;
                C0357i1 c0357i1 = this.f774i;
                c0357i1.f1221z.setOnDismissListener(this);
                c0357i1.f1211p = this;
                c0357i1.f1220y = true;
                C0407r c0407r = c0357i1.f1221z;
                c0407r.setFocusable(true);
                View view2 = this.f779n;
                if (this.f781p == null) {
                    z = true;
                } else {
                    z = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f781p = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f775j);
                }
                view2.addOnAttachStateChangeListener(this.f776k);
                c0357i1.f1210o = view2;
                c0357i1.f1207l = this.f785t;
                boolean z3 = this.f783r;
                Context context = this.f767b;
                C0209f c0209f = this.f769d;
                if (!z3) {
                    this.f784s = AbstractC0222k.m12831l(c0209f, context, this.f771f);
                    this.f783r = true;
                }
                c0357i1.m12644q(this.f784s);
                c0407r.setInputMethodMode(2);
                Rect rect2 = this.f752a;
                if (rect2 != null) {
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                c0357i1.f1219x = rect;
                c0357i1.show();
                C0435z0 c0435z0 = c0357i1.f1198c;
                c0435z0.setOnKeyListener(this);
                if (this.f786u) {
                    C0210g c0210g = this.f768c;
                    if (c0210g.f697m != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0435z0, false);
                        TextView textView = (TextView) frameLayout.findViewById(16908310);
                        if (textView != null) {
                            textView.setText(c0210g.f697m);
                        }
                        frameLayout.setEnabled(false);
                        c0435z0.addHeaderView(frameLayout, null, false);
                    }
                }
                c0357i1.mo12645o(c0209f);
                c0357i1.show();
            } else {
                z2 = false;
            }
        }
        if (z2) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }
}

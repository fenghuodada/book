package com.qmuiteam.qmui.widget.popup;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.qmuiteam.qmui.skin.C9108h;
import com.qmuiteam.qmui.widget.popup.AbstractC9221a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: com.qmuiteam.qmui.widget.popup.a */
/* loaded from: classes3.dex */
public abstract class AbstractC9221a<T extends AbstractC9221a> {

    /* renamed from: a */
    public final PopupWindow f17892a;

    /* renamed from: b */
    public final WindowManager f17893b;

    /* renamed from: c */
    public final Context f17894c;

    /* renamed from: d */
    public WeakReference<View> f17895d;

    /* renamed from: f */
    public PopupWindow.OnDismissListener f17897f;

    /* renamed from: g */
    public C9108h f17898g;

    /* renamed from: e */
    public float f17896e = -1.0f;

    /* renamed from: h */
    public final C9222a f17899h = new C9222a();

    /* renamed from: i */
    public final View$OnAttachStateChangeListenerC9223b f17900i = new View$OnAttachStateChangeListenerC9223b();

    /* renamed from: com.qmuiteam.qmui.widget.popup.a$a */
    /* loaded from: classes3.dex */
    public class C9222a implements C9108h.InterfaceC9112d {
        public C9222a() {
        }

        @Override // com.qmuiteam.qmui.skin.C9108h.InterfaceC9112d
        /* renamed from: a */
        public final void mo2564a(int i) {
            AbstractC9221a.this.getClass();
        }
    }

    /* renamed from: com.qmuiteam.qmui.widget.popup.a$b */
    /* loaded from: classes3.dex */
    public class View$OnAttachStateChangeListenerC9223b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC9223b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AbstractC9221a.this.f17892a.dismiss();
        }
    }

    /* renamed from: com.qmuiteam.qmui.widget.popup.a$c */
    /* loaded from: classes3.dex */
    public class View$OnTouchListenerC9224c implements View.OnTouchListener {
        public View$OnTouchListenerC9224c() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 4) {
                AbstractC9221a.this.f17892a.dismiss();
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.qmuiteam.qmui.widget.popup.a$d */
    /* loaded from: classes3.dex */
    public class C9225d implements PopupWindow.OnDismissListener {
        public C9225d() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            View view;
            AbstractC9221a abstractC9221a = AbstractC9221a.this;
            WeakReference<View> weakReference = abstractC9221a.f17895d;
            if (weakReference != null && (view = weakReference.get()) != null) {
                view.removeOnAttachStateChangeListener(abstractC9221a.f17900i);
            }
            abstractC9221a.f17895d = null;
            C9108h c9108h = abstractC9221a.f17898g;
            if (c9108h != null) {
                c9108h.m2664l(abstractC9221a.f17892a);
                C9108h c9108h2 = abstractC9221a.f17898g;
                if (!c9108h2.f17554e) {
                    c9108h2.f17557h.remove(abstractC9221a.f17899h);
                } else {
                    throw new RuntimeException("Can not add skinChangeListener while dispatching");
                }
            }
            PopupWindow.OnDismissListener onDismissListener = abstractC9221a.f17897f;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }
    }

    public AbstractC9221a(Context context) {
        View$OnTouchListenerC9224c view$OnTouchListenerC9224c = new View$OnTouchListenerC9224c();
        this.f17894c = context;
        this.f17893b = (WindowManager) context.getSystemService("window");
        PopupWindow popupWindow = new PopupWindow(context);
        this.f17892a = popupWindow;
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setFocusable(true);
        popupWindow.setTouchable(true);
        popupWindow.setOnDismissListener(new C9225d());
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(view$OnTouchListenerC9224c);
    }

    /* renamed from: a */
    public void mo2563a(WindowManager.LayoutParams layoutParams) {
    }

    /* renamed from: b */
    public final void m2565b(@NonNull View view, int i, int i2) {
        View view2;
        ViewParent parent;
        View view3;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (!ViewCompat.C0817g.m11730b(view)) {
            return;
        }
        WeakReference<View> weakReference = this.f17895d;
        View$OnAttachStateChangeListenerC9223b view$OnAttachStateChangeListenerC9223b = this.f17900i;
        if (weakReference != null && (view3 = weakReference.get()) != null) {
            view3.removeOnAttachStateChangeListener(view$OnAttachStateChangeListenerC9223b);
        }
        view.addOnAttachStateChangeListener(view$OnAttachStateChangeListenerC9223b);
        this.f17895d = new WeakReference<>(view);
        PopupWindow popupWindow = this.f17892a;
        popupWindow.showAtLocation(view, 0, i, i2);
        C9108h c9108h = this.f17898g;
        if (c9108h != null) {
            if (!c9108h.m2672d(popupWindow)) {
                c9108h.f17556g.add(new WeakReference(popupWindow));
            }
            c9108h.m2669g(c9108h.f17555f, popupWindow.getContentView());
            C9108h c9108h2 = this.f17898g;
            if (!c9108h2.f17554e) {
                c9108h2.f17557h.add(this.f17899h);
            } else {
                throw new RuntimeException("Can not add skinChangeListener while dispatching");
            }
        }
        float f = this.f17896e;
        if (f != -1.0f) {
            try {
                if (popupWindow.getBackground() == null) {
                    parent = popupWindow.getContentView().getParent();
                } else {
                    parent = popupWindow.getContentView().getParent().getParent();
                }
                view2 = (View) parent;
            } catch (Exception unused) {
                view2 = null;
            }
            if (view2 != null) {
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view2.getLayoutParams();
                layoutParams.flags |= 2;
                layoutParams.dimAmount = f;
                mo2563a(layoutParams);
                this.f17893b.updateViewLayout(view2, layoutParams);
            }
        }
    }
}

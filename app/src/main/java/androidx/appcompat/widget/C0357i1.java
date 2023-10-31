package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0209f;
import androidx.appcompat.view.menu.C0210g;
import androidx.appcompat.view.menu.C0214i;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.i1 */
/* loaded from: classes.dex */
public final class C0357i1 extends C0334e1 implements InterfaceC0353h1 {

    /* renamed from: E */
    public static final Method f1271E;

    /* renamed from: D */
    public InterfaceC0353h1 f1272D;

    @RequiresApi(23)
    /* renamed from: androidx.appcompat.widget.i1$a */
    /* loaded from: classes.dex */
    public static class C0358a {
        @DoNotInline
        /* renamed from: a */
        public static void m12620a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m12619b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    @RequiresApi(29)
    /* renamed from: androidx.appcompat.widget.i1$b */
    /* loaded from: classes.dex */
    public static class C0359b {
        @DoNotInline
        /* renamed from: a */
        public static void m12618a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.widget.i1$c */
    /* loaded from: classes.dex */
    public static class C0360c extends C0435z0 {

        /* renamed from: m */
        public final int f1273m;

        /* renamed from: n */
        public final int f1274n;

        /* renamed from: o */
        public InterfaceC0353h1 f1275o;

        /* renamed from: p */
        public C0214i f1276p;

        @RequiresApi(17)
        /* renamed from: androidx.appcompat.widget.i1$c$a */
        /* loaded from: classes.dex */
        public static class C0361a {
            @DoNotInline
            /* renamed from: a */
            public static int m12617a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public C0360c(Context context, boolean z) {
            super(context, z);
            if (1 == C0361a.m12617a(context.getResources().getConfiguration())) {
                this.f1273m = 21;
                this.f1274n = 22;
                return;
            }
            this.f1273m = 22;
            this.f1274n = 21;
        }

        @Override // androidx.appcompat.widget.C0435z0, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            C0209f c0209f;
            int i;
            C0214i c0214i;
            int pointToPosition;
            int i2;
            if (this.f1275o != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    c0209f = (C0209f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0209f = (C0209f) adapter;
                    i = 0;
                }
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < c0209f.getCount()) {
                    c0214i = c0209f.getItem(i2);
                } else {
                    c0214i = null;
                }
                C0214i c0214i2 = this.f1276p;
                if (c0214i2 != c0214i) {
                    C0210g c0210g = c0209f.f678a;
                    if (c0214i2 != null) {
                        this.f1275o.mo12622f(c0210g, c0214i2);
                    }
                    this.f1276p = c0214i;
                    if (c0214i != null) {
                        this.f1275o.mo12623c(c0210g, c0214i);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1273m) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView != null && i == this.f1274n) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((C0209f) adapter).f678a.m12848c(false);
                return true;
            } else {
                return super.onKeyDown(i, keyEvent);
            }
        }

        public void setHoverListener(InterfaceC0353h1 interfaceC0353h1) {
            this.f1275o = interfaceC0353h1;
        }

        @Override // androidx.appcompat.widget.C0435z0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1271E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0357i1(@NonNull Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // androidx.appcompat.widget.InterfaceC0353h1
    /* renamed from: c */
    public final void mo12623c(@NonNull C0210g c0210g, @NonNull C0214i c0214i) {
        InterfaceC0353h1 interfaceC0353h1 = this.f1272D;
        if (interfaceC0353h1 != null) {
            interfaceC0353h1.mo12623c(c0210g, c0214i);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0353h1
    /* renamed from: f */
    public final void mo12622f(@NonNull C0210g c0210g, @NonNull MenuItem menuItem) {
        InterfaceC0353h1 interfaceC0353h1 = this.f1272D;
        if (interfaceC0353h1 != null) {
            interfaceC0353h1.mo12622f(c0210g, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.C0334e1
    @NonNull
    /* renamed from: p */
    public final C0435z0 mo12621p(Context context, boolean z) {
        C0360c c0360c = new C0360c(context, z);
        c0360c.setHoverListener(this);
        return c0360c;
    }
}

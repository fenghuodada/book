package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.InterfaceC0226m;
import androidx.appcompat.widget.C0357i1;
import androidx.appcompat.widget.C0435z0;
import androidx.appcompat.widget.InterfaceC0353h1;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CascadingMenuPopup extends AbstractC0222k implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A */
    public boolean f588A;

    /* renamed from: b */
    public final Context f589b;

    /* renamed from: c */
    public final int f590c;

    /* renamed from: d */
    public final int f591d;

    /* renamed from: e */
    public final int f592e;

    /* renamed from: f */
    public final boolean f593f;

    /* renamed from: g */
    public final Handler f594g;

    /* renamed from: o */
    public View f602o;

    /* renamed from: p */
    public View f603p;

    /* renamed from: q */
    public int f604q;

    /* renamed from: r */
    public boolean f605r;

    /* renamed from: s */
    public boolean f606s;

    /* renamed from: t */
    public int f607t;

    /* renamed from: u */
    public int f608u;

    /* renamed from: w */
    public boolean f610w;

    /* renamed from: x */
    public InterfaceC0226m.InterfaceC0227a f611x;

    /* renamed from: y */
    public ViewTreeObserver f612y;

    /* renamed from: z */
    public PopupWindow.OnDismissListener f613z;

    /* renamed from: h */
    public final ArrayList f595h = new ArrayList();

    /* renamed from: i */
    public final ArrayList f596i = new ArrayList();

    /* renamed from: j */
    public final ViewTreeObserver$OnGlobalLayoutListenerC0199a f597j = new ViewTreeObserver$OnGlobalLayoutListenerC0199a();

    /* renamed from: k */
    public final View$OnAttachStateChangeListenerC0200b f598k = new View$OnAttachStateChangeListenerC0200b();

    /* renamed from: l */
    public final C0201c f599l = new C0201c();

    /* renamed from: m */
    public int f600m = 0;

    /* renamed from: n */
    public int f601n = 0;

    /* renamed from: v */
    public boolean f609v = false;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface HorizPosition {
    }

    /* renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$a */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC0199a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC0199a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            if (cascadingMenuPopup.mo12653a()) {
                ArrayList arrayList = cascadingMenuPopup.f596i;
                if (arrayList.size() > 0 && !((C0202d) arrayList.get(0)).f617a.f1220y) {
                    View view = cascadingMenuPopup.f603p;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((C0202d) it.next()).f617a.show();
                        }
                        return;
                    }
                    cascadingMenuPopup.dismiss();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$b */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC0200b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC0200b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            ViewTreeObserver viewTreeObserver = cascadingMenuPopup.f612y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    cascadingMenuPopup.f612y = view.getViewTreeObserver();
                }
                cascadingMenuPopup.f612y.removeGlobalOnLayoutListener(cascadingMenuPopup.f597j);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$c */
    /* loaded from: classes.dex */
    public class C0201c implements InterfaceC0353h1 {
        public C0201c() {
        }

        @Override // androidx.appcompat.widget.InterfaceC0353h1
        /* renamed from: c */
        public final void mo12623c(@NonNull C0210g c0210g, @NonNull C0214i c0214i) {
            CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
            cascadingMenuPopup.f594g.removeCallbacksAndMessages(null);
            ArrayList arrayList = cascadingMenuPopup.f596i;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (c0210g == ((C0202d) arrayList.get(i)).f618b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            cascadingMenuPopup.f594g.postAtTime(new RunnableC0206d(this, i2 < arrayList.size() ? (C0202d) arrayList.get(i2) : null, c0214i, c0210g), c0210g, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.InterfaceC0353h1
        /* renamed from: f */
        public final void mo12622f(@NonNull C0210g c0210g, @NonNull MenuItem menuItem) {
            CascadingMenuPopup.this.f594g.removeCallbacksAndMessages(c0210g);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.CascadingMenuPopup$d */
    /* loaded from: classes.dex */
    public static class C0202d {

        /* renamed from: a */
        public final C0357i1 f617a;

        /* renamed from: b */
        public final C0210g f618b;

        /* renamed from: c */
        public final int f619c;

        public C0202d(@NonNull C0357i1 c0357i1, @NonNull C0210g c0210g, int i) {
            this.f617a = c0357i1;
            this.f618b = c0210g;
            this.f619c = i;
        }
    }

    public CascadingMenuPopup(@NonNull Context context, @NonNull View view, @AttrRes int i, @StyleRes int i2, boolean z) {
        this.f589b = context;
        this.f602o = view;
        this.f591d = i;
        this.f592e = i2;
        this.f593f = z;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        this.f604q = ViewCompat.C0815e.m11742d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f590c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f594g = new Handler();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0231p
    /* renamed from: a */
    public final boolean mo12653a() {
        ArrayList arrayList = this.f596i;
        return arrayList.size() > 0 && ((C0202d) arrayList.get(0)).f617a.mo12653a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: b */
    public final void mo12710b(C0210g c0210g, boolean z) {
        int i;
        ArrayList arrayList = this.f596i;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (c0210g == ((C0202d) arrayList.get(i2)).f618b) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((C0202d) arrayList.get(i3)).f618b.m12848c(false);
        }
        C0202d c0202d = (C0202d) arrayList.remove(i2);
        c0202d.f618b.m12841r(this);
        boolean z2 = this.f588A;
        C0357i1 c0357i1 = c0202d.f617a;
        if (z2) {
            C0357i1.C0358a.m12619b(c0357i1.f1221z, null);
            c0357i1.f1221z.setAnimationStyle(0);
        }
        c0357i1.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            i = ((C0202d) arrayList.get(size2 - 1)).f619c;
        } else {
            View view = this.f602o;
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            if (ViewCompat.C0815e.m11742d(view) == 1) {
                i = 0;
            } else {
                i = 1;
            }
        }
        this.f604q = i;
        if (size2 == 0) {
            dismiss();
            InterfaceC0226m.InterfaceC0227a interfaceC0227a = this.f611x;
            if (interfaceC0227a != null) {
                interfaceC0227a.mo12698b(c0210g, true);
            }
            ViewTreeObserver viewTreeObserver = this.f612y;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.f612y.removeGlobalOnLayoutListener(this.f597j);
                }
                this.f612y = null;
            }
            this.f603p.removeOnAttachStateChangeListener(this.f598k);
            this.f613z.onDismiss();
        } else if (z) {
            ((C0202d) arrayList.get(0)).f618b.m12848c(false);
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
        this.f611x = interfaceC0227a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0231p
    public final void dismiss() {
        ArrayList arrayList = this.f596i;
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        C0202d[] c0202dArr = (C0202d[]) arrayList.toArray(new C0202d[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C0202d c0202d = c0202dArr[size];
            if (c0202d.f617a.mo12653a()) {
                c0202d.f617a.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: g */
    public final void mo12707g() {
        Iterator it = this.f596i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0202d) it.next()).f617a.f1198c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0209f) adapter).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0231p
    /* renamed from: h */
    public final C0435z0 mo12649h() {
        ArrayList arrayList = this.f596i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0202d) arrayList.get(arrayList.size() - 1)).f617a.f1198c;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: i */
    public final boolean mo12705i(SubMenuC0236s subMenuC0236s) {
        Iterator it = this.f596i.iterator();
        while (it.hasNext()) {
            C0202d c0202d = (C0202d) it.next();
            if (subMenuC0236s == c0202d.f618b) {
                c0202d.f617a.f1198c.requestFocus();
                return true;
            }
        }
        if (subMenuC0236s.hasVisibleItems()) {
            mo12824k(subMenuC0236s);
            InterfaceC0226m.InterfaceC0227a interfaceC0227a = this.f611x;
            if (interfaceC0227a != null) {
                interfaceC0227a.mo12697c(subMenuC0236s);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0222k
    /* renamed from: k */
    public final void mo12824k(C0210g c0210g) {
        c0210g.m12849b(this, this.f589b);
        if (mo12653a()) {
            m12858u(c0210g);
        } else {
            this.f595h.add(c0210g);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0222k
    /* renamed from: m */
    public final void mo12823m(@NonNull View view) {
        if (this.f602o != view) {
            this.f602o = view;
            int i = this.f600m;
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            this.f601n = Gravity.getAbsoluteGravity(i, ViewCompat.C0815e.m11742d(view));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0222k
    /* renamed from: n */
    public final void mo12822n(boolean z) {
        this.f609v = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0222k
    /* renamed from: o */
    public final void mo12821o(int i) {
        if (this.f600m != i) {
            this.f600m = i;
            View view = this.f602o;
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            this.f601n = Gravity.getAbsoluteGravity(i, ViewCompat.C0815e.m11742d(view));
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0202d c0202d;
        ArrayList arrayList = this.f596i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0202d = null;
                break;
            }
            c0202d = (C0202d) arrayList.get(i);
            if (!c0202d.f617a.mo12653a()) {
                break;
            }
            i++;
        }
        if (c0202d != null) {
            c0202d.f618b.m12848c(false);
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
        this.f605r = true;
        this.f607t = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0222k
    /* renamed from: q */
    public final void mo12819q(PopupWindow.OnDismissListener onDismissListener) {
        this.f613z = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0222k
    /* renamed from: r */
    public final void mo12818r(boolean z) {
        this.f610w = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0222k
    /* renamed from: s */
    public final void mo12817s(int i) {
        this.f606s = true;
        this.f608u = i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0231p
    public final void show() {
        if (mo12653a()) {
            return;
        }
        ArrayList arrayList = this.f595h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m12858u((C0210g) it.next());
        }
        arrayList.clear();
        View view = this.f602o;
        this.f603p = view;
        if (view != null) {
            boolean z = this.f612y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f612y = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f597j);
            }
            this.f603p.addOnAttachStateChangeListener(this.f598k);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a1  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12858u(@androidx.annotation.NonNull androidx.appcompat.view.menu.C0210g r19) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.CascadingMenuPopup.m12858u(androidx.appcompat.view.menu.g):void");
    }
}

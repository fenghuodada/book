package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.InterfaceC0226m;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: classes.dex */
public class C0223l {

    /* renamed from: a */
    public final Context f753a;

    /* renamed from: b */
    public final C0210g f754b;

    /* renamed from: c */
    public final boolean f755c;

    /* renamed from: d */
    public final int f756d;

    /* renamed from: e */
    public final int f757e;

    /* renamed from: f */
    public View f758f;

    /* renamed from: g */
    public int f759g;

    /* renamed from: h */
    public boolean f760h;

    /* renamed from: i */
    public InterfaceC0226m.InterfaceC0227a f761i;

    /* renamed from: j */
    public AbstractC0222k f762j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f763k;

    /* renamed from: l */
    public final C0224a f764l;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    /* loaded from: classes.dex */
    public class C0224a implements PopupWindow.OnDismissListener {
        public C0224a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            C0223l.this.mo12699c();
        }
    }

    @RequiresApi(17)
    /* renamed from: androidx.appcompat.view.menu.l$b */
    /* loaded from: classes.dex */
    public static class C0225b {
        @DoNotInline
        /* renamed from: a */
        public static void m12826a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public C0223l(@AttrRes int i, @StyleRes int i2, @NonNull Context context, @NonNull View view, @NonNull C0210g c0210g, boolean z) {
        this.f759g = 8388611;
        this.f764l = new C0224a();
        this.f753a = context;
        this.f754b = c0210g;
        this.f758f = view;
        this.f755c = z;
        this.f756d = i;
        this.f757e = i2;
    }

    public C0223l(@NonNull Context context, @NonNull C0210g c0210g, @NonNull View view, boolean z) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, c0210g, z);
    }

    @NonNull
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: a */
    public final AbstractC0222k m12829a() {
        boolean z;
        AbstractC0222k view$OnKeyListenerC0232q;
        if (this.f762j == null) {
            Context context = this.f753a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            C0225b.m12826a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                view$OnKeyListenerC0232q = new CascadingMenuPopup(this.f753a, this.f758f, this.f756d, this.f757e, this.f755c);
            } else {
                Context context2 = this.f753a;
                C0210g c0210g = this.f754b;
                view$OnKeyListenerC0232q = new View$OnKeyListenerC0232q(this.f756d, this.f757e, context2, this.f758f, c0210g, this.f755c);
            }
            view$OnKeyListenerC0232q.mo12824k(this.f754b);
            view$OnKeyListenerC0232q.mo12819q(this.f764l);
            view$OnKeyListenerC0232q.mo12823m(this.f758f);
            view$OnKeyListenerC0232q.mo12825d(this.f761i);
            view$OnKeyListenerC0232q.mo12822n(this.f760h);
            view$OnKeyListenerC0232q.mo12821o(this.f759g);
            this.f762j = view$OnKeyListenerC0232q;
        }
        return this.f762j;
    }

    /* renamed from: b */
    public final boolean m12828b() {
        AbstractC0222k abstractC0222k = this.f762j;
        return abstractC0222k != null && abstractC0222k.mo12653a();
    }

    /* renamed from: c */
    public void mo12699c() {
        this.f762j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f763k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: d */
    public final void m12827d(int i, int i2, boolean z, boolean z2) {
        AbstractC0222k m12829a = m12829a();
        m12829a.mo12818r(z2);
        if (z) {
            int i3 = this.f759g;
            View view = this.f758f;
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            if ((Gravity.getAbsoluteGravity(i3, ViewCompat.C0815e.m11742d(view)) & 7) == 5) {
                i -= this.f758f.getWidth();
            }
            m12829a.mo12820p(i);
            m12829a.mo12817s(i2);
            int i4 = (int) ((this.f753a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m12829a.f752a = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        m12829a.show();
    }
}

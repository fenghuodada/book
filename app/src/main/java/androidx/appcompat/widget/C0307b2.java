package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0157c;
import androidx.appcompat.app.LayoutInflater$Factory2C0114h;
import androidx.appcompat.content.res.C0158a;
import androidx.appcompat.view.menu.C0210g;
import androidx.appcompat.view.menu.C0214i;
import androidx.appcompat.widget.C0309c;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0922g2;
import androidx.core.view.C0934i2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.b2 */
/* loaded from: classes.dex */
public final class C0307b2 implements InterfaceC0412s0 {

    /* renamed from: a */
    public final Toolbar f1121a;

    /* renamed from: b */
    public int f1122b;

    /* renamed from: c */
    public C0396n1 f1123c;

    /* renamed from: d */
    public View f1124d;

    /* renamed from: e */
    public Drawable f1125e;

    /* renamed from: f */
    public Drawable f1126f;

    /* renamed from: g */
    public Drawable f1127g;

    /* renamed from: h */
    public boolean f1128h;

    /* renamed from: i */
    public CharSequence f1129i;

    /* renamed from: j */
    public CharSequence f1130j;

    /* renamed from: k */
    public CharSequence f1131k;

    /* renamed from: l */
    public Window.Callback f1132l;

    /* renamed from: m */
    public boolean f1133m;

    /* renamed from: n */
    public C0309c f1134n;

    /* renamed from: o */
    public int f1135o;

    /* renamed from: p */
    public Drawable f1136p;

    /* renamed from: androidx.appcompat.widget.b2$a */
    /* loaded from: classes.dex */
    public class C0308a extends C0934i2 {

        /* renamed from: a */
        public boolean f1137a = false;

        /* renamed from: b */
        public final /* synthetic */ int f1138b;

        public C0308a(int i) {
            this.f1138b = i;
        }

        @Override // androidx.core.view.C0934i2, androidx.core.view.InterfaceC0928h2
        /* renamed from: a */
        public final void mo11452a(View view) {
            this.f1137a = true;
        }

        @Override // androidx.core.view.C0934i2, androidx.core.view.InterfaceC0928h2
        /* renamed from: b */
        public final void mo11451b() {
            C0307b2.this.f1121a.setVisibility(0);
        }

        @Override // androidx.core.view.InterfaceC0928h2
        /* renamed from: c */
        public final void mo11463c() {
            if (this.f1137a) {
                return;
            }
            C0307b2.this.f1121a.setVisibility(this.f1138b);
        }
    }

    public C0307b2(Toolbar toolbar, boolean z) {
        boolean z2;
        Drawable drawable;
        this.f1135o = 0;
        this.f1121a = toolbar;
        this.f1129i = toolbar.getTitle();
        this.f1130j = toolbar.getSubtitle();
        if (this.f1129i != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f1128h = z2;
        this.f1127g = toolbar.getNavigationIcon();
        C0430x1 m12465m = C0430x1.m12465m(toolbar.getContext(), null, C0157c.f410a, R.attr.actionBarStyle);
        int i = 15;
        this.f1136p = m12465m.m12473e(15);
        if (z) {
            CharSequence m12467k = m12465m.m12467k(27);
            if (!TextUtils.isEmpty(m12467k)) {
                this.f1128h = true;
                this.f1129i = m12467k;
                if ((this.f1122b & 8) != 0) {
                    toolbar.setTitle(m12467k);
                    if (this.f1128h) {
                        ViewCompat.m11770o(toolbar.getRootView(), m12467k);
                    }
                }
            }
            CharSequence m12467k2 = m12465m.m12467k(25);
            if (!TextUtils.isEmpty(m12467k2)) {
                this.f1130j = m12467k2;
                if ((this.f1122b & 8) != 0) {
                    toolbar.setSubtitle(m12467k2);
                }
            }
            Drawable m12473e = m12465m.m12473e(20);
            if (m12473e != null) {
                this.f1126f = m12473e;
                m12712u();
            }
            Drawable m12473e2 = m12465m.m12473e(17);
            if (m12473e2 != null) {
                setIcon(m12473e2);
            }
            if (this.f1127g == null && (drawable = this.f1136p) != null) {
                this.f1127g = drawable;
                toolbar.setNavigationIcon((this.f1122b & 4) == 0 ? null : drawable);
            }
            mo12511k(m12465m.m12470h(10, 0));
            int m12469i = m12465m.m12469i(9, 0);
            if (m12469i != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(m12469i, (ViewGroup) toolbar, false);
                View view = this.f1124d;
                if (view != null && (this.f1122b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f1124d = inflate;
                if (inflate != null && (this.f1122b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                mo12511k(this.f1122b | 16);
            }
            int layoutDimension = m12465m.f1406b.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int m12475c = m12465m.m12475c(7, -1);
            int m12475c2 = m12465m.m12475c(3, -1);
            if (m12475c >= 0 || m12475c2 >= 0) {
                int max = Math.max(m12475c, 0);
                int max2 = Math.max(m12475c2, 0);
                if (toolbar.f1049t == null) {
                    toolbar.f1049t = new C0387m1();
                }
                toolbar.f1049t.m12566a(max, max2);
            }
            int m12469i2 = m12465m.m12469i(28, 0);
            if (m12469i2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f1041l = m12469i2;
                C0383m0 c0383m0 = toolbar.f1031b;
                if (c0383m0 != null) {
                    c0383m0.setTextAppearance(context, m12469i2);
                }
            }
            int m12469i3 = m12465m.m12469i(26, 0);
            if (m12469i3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f1042m = m12469i3;
                C0383m0 c0383m02 = toolbar.f1032c;
                if (c0383m02 != null) {
                    c0383m02.setTextAppearance(context2, m12469i3);
                }
            }
            int m12469i4 = m12465m.m12469i(22, 0);
            if (m12469i4 != 0) {
                toolbar.setPopupTheme(m12469i4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f1136p = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f1122b = i;
        }
        m12465m.m12464n();
        if (R.string.abc_action_bar_up_description != this.f1135o) {
            this.f1135o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i2 = this.f1135o;
                String string = i2 != 0 ? getContext().getString(i2) : null;
                this.f1131k = string;
                if ((this.f1122b & 4) != 0) {
                    if (TextUtils.isEmpty(string)) {
                        toolbar.setNavigationContentDescription(this.f1135o);
                    } else {
                        toolbar.setNavigationContentDescription(this.f1131k);
                    }
                }
            }
        }
        this.f1131k = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new View$OnClickListenerC0301a2(this));
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    /* renamed from: a */
    public final boolean mo12521a() {
        boolean z;
        ActionMenuView actionMenuView = this.f1121a.f1030a;
        if (actionMenuView == null) {
            return false;
        }
        C0309c c0309c = actionMenuView.f851t;
        if (c0309c != null && c0309c.m12704k()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    /* renamed from: b */
    public final void mo12520b() {
        this.f1133m = true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    /* renamed from: c */
    public final boolean mo12519c() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f1121a;
        if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1030a) != null && actionMenuView.f850s) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    public final void collapseActionView() {
        C0214i c0214i;
        Toolbar.C0278f c0278f = this.f1121a.f1022M;
        if (c0278f == null) {
            c0214i = null;
        } else {
            c0214i = c0278f.f1061b;
        }
        if (c0214i != null) {
            c0214i.collapseActionView();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.widget.InterfaceC0412s0
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo12518d() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f1121a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f1030a
            r1 = 0
            if (r0 == 0) goto L22
            androidx.appcompat.widget.c r0 = r0.f851t
            r2 = 1
            if (r0 == 0) goto L1e
            androidx.appcompat.widget.c$c r3 = r0.f1152u
            if (r3 != 0) goto L19
            boolean r0 = r0.m12704k()
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = r1
            goto L1a
        L19:
            r0 = r2
        L1a:
            if (r0 == 0) goto L1e
            r0 = r2
            goto L1f
        L1e:
            r0 = r1
        L1f:
            if (r0 == 0) goto L22
            r1 = r2
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0307b2.mo12518d():boolean");
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    /* renamed from: e */
    public final void mo12517e(C0210g c0210g, LayoutInflater$Factory2C0114h.C0118d c0118d) {
        C0309c c0309c = this.f1134n;
        Toolbar toolbar = this.f1121a;
        if (c0309c == null) {
            this.f1134n = new C0309c(toolbar.getContext());
        }
        C0309c c0309c2 = this.f1134n;
        c0309c2.f659e = c0118d;
        if (c0210g != null || toolbar.f1030a != null) {
            toolbar.m12761e();
            C0210g c0210g2 = toolbar.f1030a.f847p;
            if (c0210g2 != c0210g) {
                if (c0210g2 != null) {
                    c0210g2.m12841r(toolbar.f1021L);
                    c0210g2.m12841r(toolbar.f1022M);
                }
                if (toolbar.f1022M == null) {
                    toolbar.f1022M = new Toolbar.C0278f();
                }
                c0309c2.f1148q = true;
                if (c0210g != null) {
                    c0210g.m12849b(c0309c2, toolbar.f1039j);
                    c0210g.m12849b(toolbar.f1022M, toolbar.f1039j);
                } else {
                    c0309c2.mo12708f(toolbar.f1039j, null);
                    toolbar.f1022M.mo12708f(toolbar.f1039j, null);
                    c0309c2.mo12707g();
                    toolbar.f1022M.mo12707g();
                }
                toolbar.f1030a.setPopupTheme(toolbar.f1040k);
                toolbar.f1030a.setPresenter(c0309c2);
                toolbar.f1021L = c0309c2;
                toolbar.m12748s();
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    /* renamed from: f */
    public final boolean mo12516f() {
        boolean z;
        ActionMenuView actionMenuView = this.f1121a.f1030a;
        if (actionMenuView == null) {
            return false;
        }
        C0309c c0309c = actionMenuView.f851t;
        if (c0309c != null && c0309c.m12706h()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    /* renamed from: g */
    public final boolean mo12515g() {
        boolean z;
        ActionMenuView actionMenuView = this.f1121a.f1030a;
        if (actionMenuView == null) {
            return false;
        }
        C0309c c0309c = actionMenuView.f851t;
        if (c0309c != null && c0309c.m12703l()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    public final Context getContext() {
        return this.f1121a.getContext();
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    public final CharSequence getTitle() {
        return this.f1121a.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    /* renamed from: h */
    public final void mo12514h() {
        C0309c c0309c;
        ActionMenuView actionMenuView = this.f1121a.f1030a;
        if (actionMenuView != null && (c0309c = actionMenuView.f851t) != null) {
            c0309c.m12706h();
            C0309c.C0310a c0310a = c0309c.f1151t;
            if (c0310a != null && c0310a.m12828b()) {
                c0310a.f762j.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    /* renamed from: i */
    public final void mo12513i() {
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    /* renamed from: j */
    public final boolean mo12512j() {
        Toolbar.C0278f c0278f = this.f1121a.f1022M;
        if (c0278f != null && c0278f.f1061b != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    /* renamed from: k */
    public final void mo12511k(int i) {
        View view;
        Drawable drawable;
        int i2 = this.f1122b ^ i;
        this.f1122b = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            CharSequence charSequence = null;
            Toolbar toolbar = this.f1121a;
            if (i3 != 0) {
                if ((i & 4) != 0 && (i & 4) != 0) {
                    if (TextUtils.isEmpty(this.f1131k)) {
                        toolbar.setNavigationContentDescription(this.f1135o);
                    } else {
                        toolbar.setNavigationContentDescription(this.f1131k);
                    }
                }
                if ((this.f1122b & 4) != 0) {
                    drawable = this.f1127g;
                    if (drawable == null) {
                        drawable = this.f1136p;
                    }
                } else {
                    drawable = null;
                }
                toolbar.setNavigationIcon(drawable);
            }
            if ((i2 & 3) != 0) {
                m12712u();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.f1129i);
                    charSequence = this.f1130j;
                } else {
                    toolbar.setTitle((CharSequence) null);
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && (view = this.f1124d) != null) {
                if ((i & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    /* renamed from: l */
    public final void mo12510l() {
        C0396n1 c0396n1 = this.f1123c;
        if (c0396n1 != null) {
            ViewParent parent = c0396n1.getParent();
            Toolbar toolbar = this.f1121a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1123c);
            }
        }
        this.f1123c = null;
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    /* renamed from: m */
    public final void mo12509m(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C0158a.m12920a(getContext(), i);
        } else {
            drawable = null;
        }
        this.f1126f = drawable;
        m12712u();
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    /* renamed from: n */
    public final void mo12508n() {
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    /* renamed from: o */
    public final C0922g2 mo12507o(int i, long j) {
        C0922g2 m11784a = ViewCompat.m11784a(this.f1121a);
        m11784a.m11473a(i == 0 ? 1.0f : 0.0f);
        m11784a.m11471c(j);
        m11784a.m11470d(new C0308a(i));
        return m11784a;
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    /* renamed from: p */
    public final void mo12506p(int i) {
        this.f1121a.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    /* renamed from: q */
    public final int mo12505q() {
        return this.f1122b;
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    /* renamed from: r */
    public final void mo12504r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    /* renamed from: s */
    public final void mo12503s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    public final void setIcon(int i) {
        setIcon(i != 0 ? C0158a.m12920a(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    public final void setIcon(Drawable drawable) {
        this.f1125e = drawable;
        m12712u();
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    public final void setWindowCallback(Window.Callback callback) {
        this.f1132l = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    public final void setWindowTitle(CharSequence charSequence) {
        if (!this.f1128h) {
            this.f1129i = charSequence;
            if ((this.f1122b & 8) != 0) {
                Toolbar toolbar = this.f1121a;
                toolbar.setTitle(charSequence);
                if (this.f1128h) {
                    ViewCompat.m11770o(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0412s0
    /* renamed from: t */
    public final void mo12502t(boolean z) {
        this.f1121a.setCollapsible(z);
    }

    /* renamed from: u */
    public final void m12712u() {
        Drawable drawable;
        int i = this.f1122b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f1126f) == null) {
            drawable = this.f1125e;
        }
        this.f1121a.setLogo(drawable);
    }
}

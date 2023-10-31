package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.C0158a;
import androidx.core.graphics.drawable.C0700a;
import androidx.core.internal.view.InterfaceMenuItemC0726b;
import androidx.core.view.AbstractC0893b;
import java.util.ArrayList;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.i */
/* loaded from: classes.dex */
public final class C0214i implements InterfaceMenuItemC0726b {

    /* renamed from: A */
    public AbstractC0893b f712A;

    /* renamed from: B */
    public MenuItem.OnActionExpandListener f713B;

    /* renamed from: a */
    public final int f715a;

    /* renamed from: b */
    public final int f716b;

    /* renamed from: c */
    public final int f717c;

    /* renamed from: d */
    public final int f718d;

    /* renamed from: e */
    public CharSequence f719e;

    /* renamed from: f */
    public CharSequence f720f;

    /* renamed from: g */
    public Intent f721g;

    /* renamed from: h */
    public char f722h;

    /* renamed from: j */
    public char f724j;

    /* renamed from: l */
    public Drawable f726l;

    /* renamed from: n */
    public final C0210g f728n;

    /* renamed from: o */
    public SubMenuC0236s f729o;

    /* renamed from: p */
    public MenuItem.OnMenuItemClickListener f730p;

    /* renamed from: q */
    public CharSequence f731q;

    /* renamed from: r */
    public CharSequence f732r;

    /* renamed from: y */
    public int f739y;

    /* renamed from: z */
    public View f740z;

    /* renamed from: i */
    public int f723i = 4096;

    /* renamed from: k */
    public int f725k = 4096;

    /* renamed from: m */
    public int f727m = 0;

    /* renamed from: s */
    public ColorStateList f733s = null;

    /* renamed from: t */
    public PorterDuff.Mode f734t = null;

    /* renamed from: u */
    public boolean f735u = false;

    /* renamed from: v */
    public boolean f736v = false;

    /* renamed from: w */
    public boolean f737w = false;

    /* renamed from: x */
    public int f738x = 16;

    /* renamed from: C */
    public boolean f714C = false;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    /* loaded from: classes.dex */
    public class C0215a implements AbstractC0893b.InterfaceC0894a {
        public C0215a() {
        }
    }

    public C0214i(C0210g c0210g, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f728n = c0210g;
        this.f715a = i2;
        this.f716b = i;
        this.f717c = i3;
        this.f718d = i4;
        this.f719e = charSequence;
        this.f739y = i5;
    }

    /* renamed from: c */
    public static void m12835c(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b
    @NonNull
    /* renamed from: a */
    public final InterfaceMenuItemC0726b mo11872a(AbstractC0893b abstractC0893b) {
        AbstractC0893b abstractC0893b2 = this.f712A;
        if (abstractC0893b2 != null) {
            abstractC0893b2.f2624a = null;
        }
        this.f740z = null;
        this.f712A = abstractC0893b;
        this.f728n.m12843p(true);
        AbstractC0893b abstractC0893b3 = this.f712A;
        if (abstractC0893b3 != null) {
            abstractC0893b3.mo11528h(new C0215a());
        }
        return this;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b
    /* renamed from: b */
    public final AbstractC0893b mo11871b() {
        return this.f712A;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f739y & 8) == 0) {
            return false;
        }
        if (this.f740z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f713B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f728n.mo12815d(this);
        }
        return false;
    }

    /* renamed from: d */
    public final Drawable m12834d(Drawable drawable) {
        if (drawable != null && this.f737w && (this.f735u || this.f736v)) {
            drawable = drawable.mutate();
            if (this.f735u) {
                C0700a.C0702b.m11924h(drawable, this.f733s);
            }
            if (this.f736v) {
                C0700a.C0702b.m11923i(drawable, this.f734t);
            }
            this.f737w = false;
        }
        return drawable;
    }

    /* renamed from: e */
    public final boolean m12833e() {
        AbstractC0893b abstractC0893b;
        if ((this.f739y & 8) != 0) {
            if (this.f740z == null && (abstractC0893b = this.f712A) != null) {
                this.f740z = abstractC0893b.mo11532d(this);
            }
            return this.f740z != null;
        }
        return false;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final boolean expandActionView() {
        if (m12833e()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.f713B;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f728n.mo12813f(this);
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final void m12832f(boolean z) {
        this.f738x = z ? this.f738x | 32 : this.f738x & (-33);
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final View getActionView() {
        View view = this.f740z;
        if (view != null) {
            return view;
        }
        AbstractC0893b abstractC0893b = this.f712A;
        if (abstractC0893b != null) {
            View mo11532d = abstractC0893b.mo11532d(this);
            this.f740z = mo11532d;
            return mo11532d;
        }
        return null;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f725k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f724j;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f731q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f716b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f726l;
        if (drawable != null) {
            return m12834d(drawable);
        }
        int i = this.f727m;
        if (i != 0) {
            Drawable m12920a = C0158a.m12920a(this.f728n.f685a, i);
            this.f727m = 0;
            this.f726l = m12920a;
            return m12834d(m12920a);
        }
        return null;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f733s;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f734t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f721g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f715a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f723i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f722h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f717c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f729o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f719e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f720f;
        return charSequence != null ? charSequence : this.f719e;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f732r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f729o != null;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f714C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f738x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f738x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f738x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC0893b abstractC0893b = this.f712A;
        return (abstractC0893b == null || !abstractC0893b.mo11529g()) ? (this.f738x & 8) == 0 : (this.f738x & 8) == 0 && this.f712A.mo11534b();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    @NonNull
    public final MenuItem setActionView(int i) {
        int i2;
        C0210g c0210g = this.f728n;
        Context context = c0210g.f685a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f740z = inflate;
        this.f712A = null;
        if (inflate != null && inflate.getId() == -1 && (i2 = this.f715a) > 0) {
            inflate.setId(i2);
        }
        c0210g.f695k = true;
        c0210g.m12843p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f724j == c) {
            return this;
        }
        this.f724j = Character.toLowerCase(c);
        this.f728n.m12843p(false);
        return this;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    @NonNull
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f724j == c && this.f725k == i) {
            return this;
        }
        this.f724j = Character.toLowerCase(c);
        this.f725k = KeyEvent.normalizeMetaState(i);
        this.f728n.m12843p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.f738x;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f738x = i2;
        if (i != i2) {
            this.f728n.m12843p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        boolean z2;
        int i;
        int i2 = this.f738x;
        int i3 = i2 & 4;
        C0210g c0210g = this.f728n;
        int i4 = 2;
        if (i3 != 0) {
            c0210g.getClass();
            ArrayList<C0214i> arrayList = c0210g.f690f;
            int size = arrayList.size();
            c0210g.m12836w();
            for (int i5 = 0; i5 < size; i5++) {
                C0214i c0214i = arrayList.get(i5);
                if (c0214i.f716b == this.f716b) {
                    boolean z3 = true;
                    if ((c0214i.f738x & 4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 && c0214i.isCheckable()) {
                        if (c0214i != this) {
                            z3 = false;
                        }
                        int i6 = c0214i.f738x;
                        int i7 = i6 & (-3);
                        if (z3) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        int i8 = i | i7;
                        c0214i.f738x = i8;
                        if (i6 != i8) {
                            c0214i.f728n.m12843p(false);
                        }
                    }
                }
            }
            c0210g.m12837v();
        } else {
            int i9 = i2 & (-3);
            if (!z) {
                i4 = 0;
            }
            int i10 = i4 | i9;
            this.f738x = i10;
            if (i2 != i10) {
                c0210g.m12843p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    @NonNull
    public final InterfaceMenuItemC0726b setContentDescription(CharSequence charSequence) {
        this.f731q = charSequence;
        this.f728n.m12843p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f738x = z ? this.f738x | 16 : this.f738x & (-17);
        this.f728n.m12843p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f726l = null;
        this.f727m = i;
        this.f737w = true;
        this.f728n.m12843p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f727m = 0;
        this.f726l = drawable;
        this.f737w = true;
        this.f728n.m12843p(false);
        return this;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    @NonNull
    public final MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.f733s = colorStateList;
        this.f735u = true;
        this.f737w = true;
        this.f728n.m12843p(false);
        return this;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    @NonNull
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f734t = mode;
        this.f736v = true;
        this.f737w = true;
        this.f728n.m12843p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f721g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f722h == c) {
            return this;
        }
        this.f722h = c;
        this.f728n.m12843p(false);
        return this;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    @NonNull
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f722h == c && this.f723i == i) {
            return this;
        }
        this.f722h = c;
        this.f723i = KeyEvent.normalizeMetaState(i);
        this.f728n.m12843p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f713B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f730p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f722h = c;
        this.f724j = Character.toLowerCase(c2);
        this.f728n.m12843p(false);
        return this;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    @NonNull
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f722h = c;
        this.f723i = KeyEvent.normalizeMetaState(i);
        this.f724j = Character.toLowerCase(c2);
        this.f725k = KeyEvent.normalizeMetaState(i2);
        this.f728n.m12843p(false);
        return this;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f739y = i;
        C0210g c0210g = this.f728n;
        c0210g.f695k = true;
        c0210g.m12843p(true);
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    @NonNull
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f728n.f685a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f719e = charSequence;
        this.f728n.m12843p(false);
        SubMenuC0236s subMenuC0236s = this.f729o;
        if (subMenuC0236s != null) {
            subMenuC0236s.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f720f = charSequence;
        this.f728n.m12843p(false);
        return this;
    }

    @Override // android.view.MenuItem
    @NonNull
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    @NonNull
    public final InterfaceMenuItemC0726b setTooltipText(CharSequence charSequence) {
        this.f732r = charSequence;
        this.f728n.m12843p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i;
        int i2 = this.f738x;
        int i3 = i2 & (-9);
        boolean z2 = false;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i4 = i | i3;
        this.f738x = i4;
        if (i2 != i4) {
            z2 = true;
        }
        if (z2) {
            C0210g c0210g = this.f728n;
            c0210g.f692h = true;
            c0210g.m12843p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f719e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // androidx.core.internal.view.InterfaceMenuItemC0726b, android.view.MenuItem
    @NonNull
    public final MenuItem setActionView(View view) {
        int i;
        this.f740z = view;
        this.f712A = null;
        if (view != null && view.getId() == -1 && (i = this.f715a) > 0) {
            view.setId(i);
        }
        C0210g c0210g = this.f728n;
        c0210g.f695k = true;
        c0210g.m12843p(true);
        return this;
    }
}

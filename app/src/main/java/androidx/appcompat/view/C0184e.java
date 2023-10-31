package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.AbstractC0178a;
import androidx.appcompat.view.menu.C0210g;
import androidx.appcompat.view.menu.MenuC0230o;
import androidx.appcompat.view.menu.MenuItemC0216j;
import androidx.collection.C0482i;
import androidx.core.internal.view.InterfaceMenuItemC0726b;
import java.util.ArrayList;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.e */
/* loaded from: classes.dex */
public final class C0184e extends ActionMode {

    /* renamed from: a */
    public final Context f520a;

    /* renamed from: b */
    public final AbstractC0178a f521b;

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.view.e$a */
    /* loaded from: classes.dex */
    public static class C0185a implements AbstractC0178a.InterfaceC0179a {

        /* renamed from: a */
        public final ActionMode.Callback f522a;

        /* renamed from: b */
        public final Context f523b;

        /* renamed from: c */
        public final ArrayList<C0184e> f524c = new ArrayList<>();

        /* renamed from: d */
        public final C0482i<Menu, Menu> f525d = new C0482i<>();

        public C0185a(Context context, ActionMode.Callback callback) {
            this.f523b = context;
            this.f522a = callback;
        }

        @Override // androidx.appcompat.view.AbstractC0178a.InterfaceC0179a
        /* renamed from: a */
        public final void mo12880a(AbstractC0178a abstractC0178a) {
            this.f522a.onDestroyActionMode(m12876e(abstractC0178a));
        }

        @Override // androidx.appcompat.view.AbstractC0178a.InterfaceC0179a
        /* renamed from: b */
        public final boolean mo12879b(AbstractC0178a abstractC0178a, C0210g c0210g) {
            C0184e m12876e = m12876e(abstractC0178a);
            C0482i<Menu, Menu> c0482i = this.f525d;
            Menu orDefault = c0482i.getOrDefault(c0210g, null);
            if (orDefault == null) {
                orDefault = new MenuC0230o(this.f523b, c0210g);
                c0482i.put(c0210g, orDefault);
            }
            return this.f522a.onCreateActionMode(m12876e, orDefault);
        }

        @Override // androidx.appcompat.view.AbstractC0178a.InterfaceC0179a
        /* renamed from: c */
        public final boolean mo12878c(AbstractC0178a abstractC0178a, MenuItem menuItem) {
            return this.f522a.onActionItemClicked(m12876e(abstractC0178a), new MenuItemC0216j(this.f523b, (InterfaceMenuItemC0726b) menuItem));
        }

        @Override // androidx.appcompat.view.AbstractC0178a.InterfaceC0179a
        /* renamed from: d */
        public final boolean mo12877d(AbstractC0178a abstractC0178a, C0210g c0210g) {
            C0184e m12876e = m12876e(abstractC0178a);
            C0482i<Menu, Menu> c0482i = this.f525d;
            Menu orDefault = c0482i.getOrDefault(c0210g, null);
            if (orDefault == null) {
                orDefault = new MenuC0230o(this.f523b, c0210g);
                c0482i.put(c0210g, orDefault);
            }
            return this.f522a.onPrepareActionMode(m12876e, orDefault);
        }

        /* renamed from: e */
        public final C0184e m12876e(AbstractC0178a abstractC0178a) {
            ArrayList<C0184e> arrayList = this.f524c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0184e c0184e = arrayList.get(i);
                if (c0184e != null && c0184e.f521b == abstractC0178a) {
                    return c0184e;
                }
            }
            C0184e c0184e2 = new C0184e(this.f523b, abstractC0178a);
            arrayList.add(c0184e2);
            return c0184e2;
        }
    }

    public C0184e(Context context, AbstractC0178a abstractC0178a) {
        this.f520a = context;
        this.f521b = abstractC0178a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f521b.mo12894c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f521b.mo12893d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC0230o(this.f520a, this.f521b.mo12892e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f521b.mo12891f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f521b.mo12890g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f521b.f506a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f521b.mo12889h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f521b.f507b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f521b.mo12888i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f521b.mo12887j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f521b.mo12886k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f521b.mo12885l(i);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f521b.mo12884m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f521b.f506a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f521b.mo12883n(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f521b.mo12882o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f521b.mo12881p(z);
    }
}

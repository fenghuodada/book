package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: androidx.appcompat.view.menu.k */
/* loaded from: classes.dex */
public abstract class AbstractC0222k implements InterfaceC0231p, InterfaceC0226m, AdapterView.OnItemClickListener {

    /* renamed from: a */
    public Rect f752a;

    /* renamed from: l */
    public static int m12831l(C0209f c0209f, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = c0209f.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = c0209f.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = c0209f.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: t */
    public static boolean m12830t(C0210g c0210g) {
        int size = c0210g.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0210g.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: e */
    public final boolean mo12741e(C0214i c0214i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: f */
    public final void mo12708f(@NonNull Context context, @Nullable C0210g c0210g) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: j */
    public final boolean mo12740j(C0214i c0214i) {
        return false;
    }

    /* renamed from: k */
    public abstract void mo12824k(C0210g c0210g);

    /* renamed from: m */
    public abstract void mo12823m(View view);

    /* renamed from: n */
    public abstract void mo12822n(boolean z);

    /* renamed from: o */
    public abstract void mo12821o(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C0209f c0209f;
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            c0209f = (C0209f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            c0209f = (C0209f) listAdapter;
        }
        C0210g c0210g = c0209f.f678a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (!(this instanceof CascadingMenuPopup)) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        c0210g.m12842q(menuItem, this, i2);
    }

    /* renamed from: p */
    public abstract void mo12820p(int i);

    /* renamed from: q */
    public abstract void mo12819q(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: r */
    public abstract void mo12818r(boolean z);

    /* renamed from: s */
    public abstract void mo12817s(int i);
}

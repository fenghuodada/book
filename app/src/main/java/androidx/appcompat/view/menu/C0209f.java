package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.InterfaceC0228n;
import java.util.ArrayList;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes.dex */
public final class C0209f extends BaseAdapter {

    /* renamed from: a */
    public final C0210g f678a;

    /* renamed from: b */
    public int f679b = -1;

    /* renamed from: c */
    public boolean f680c;

    /* renamed from: d */
    public final boolean f681d;

    /* renamed from: e */
    public final LayoutInflater f682e;

    /* renamed from: f */
    public final int f683f;

    public C0209f(C0210g c0210g, LayoutInflater layoutInflater, boolean z, int i) {
        this.f681d = z;
        this.f682e = layoutInflater;
        this.f678a = c0210g;
        this.f683f = i;
        m12852a();
    }

    /* renamed from: a */
    public final void m12852a() {
        C0210g c0210g = this.f678a;
        C0214i c0214i = c0210g.f706v;
        if (c0214i != null) {
            c0210g.m12845i();
            ArrayList<C0214i> arrayList = c0210g.f694j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == c0214i) {
                    this.f679b = i;
                    return;
                }
            }
        }
        this.f679b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final C0214i getItem(int i) {
        ArrayList<C0214i> m12844l;
        boolean z = this.f681d;
        C0210g c0210g = this.f678a;
        if (z) {
            c0210g.m12845i();
            m12844l = c0210g.f694j;
        } else {
            m12844l = c0210g.m12844l();
        }
        int i2 = this.f679b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return m12844l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<C0214i> m12844l;
        boolean z = this.f681d;
        C0210g c0210g = this.f678a;
        if (z) {
            c0210g.m12845i();
            m12844l = c0210g.f694j;
        } else {
            m12844l = c0210g.m12844l();
        }
        int i = this.f679b;
        int size = m12844l.size();
        if (i < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z = false;
        if (view == null) {
            view = this.f682e.inflate(this.f683f, viewGroup, false);
        }
        int i3 = getItem(i).f716b;
        int i4 = i - 1;
        if (i4 >= 0) {
            i2 = getItem(i4).f716b;
        } else {
            i2 = i3;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f678a.mo12810m() && i3 != i2) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC0228n.InterfaceC0229a interfaceC0229a = (InterfaceC0228n.InterfaceC0229a) view;
        if (this.f680c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0229a.mo4533j(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m12852a();
        super.notifyDataSetChanged();
    }
}

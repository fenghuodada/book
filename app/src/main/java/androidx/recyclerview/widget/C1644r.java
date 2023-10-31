package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.r */
/* loaded from: classes.dex */
public final class C1644r extends AbstractC1645s {
    public C1644r(RecyclerView.LayoutManager layoutManager) {
        super(layoutManager);
    }

    @Override // androidx.recyclerview.widget.AbstractC1645s
    /* renamed from: b */
    public final int mo10124b(View view) {
        this.f4001a.getClass();
        return RecyclerView.LayoutManager.m10307z(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1579k) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC1645s
    /* renamed from: c */
    public final int mo10123c(View view) {
        RecyclerView.C1579k c1579k = (RecyclerView.C1579k) view.getLayoutParams();
        this.f4001a.getClass();
        Rect rect = ((RecyclerView.C1579k) view.getLayoutParams()).f3739b;
        return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1579k).topMargin + ((ViewGroup.MarginLayoutParams) c1579k).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC1645s
    /* renamed from: d */
    public final int mo10122d(View view) {
        RecyclerView.C1579k c1579k = (RecyclerView.C1579k) view.getLayoutParams();
        this.f4001a.getClass();
        Rect rect = ((RecyclerView.C1579k) view.getLayoutParams()).f3739b;
        return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1579k).leftMargin + ((ViewGroup.MarginLayoutParams) c1579k).rightMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC1645s
    /* renamed from: e */
    public final int mo10121e(View view) {
        this.f4001a.getClass();
        return RecyclerView.LayoutManager.m10343D(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1579k) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.AbstractC1645s
    /* renamed from: f */
    public final int mo10120f() {
        return this.f4001a.f3729o;
    }

    @Override // androidx.recyclerview.widget.AbstractC1645s
    /* renamed from: g */
    public final int mo10119g() {
        RecyclerView.LayoutManager layoutManager = this.f4001a;
        return layoutManager.f3729o - layoutManager.m10340G();
    }

    @Override // androidx.recyclerview.widget.AbstractC1645s
    /* renamed from: h */
    public final int mo10118h() {
        return this.f4001a.m10340G();
    }

    @Override // androidx.recyclerview.widget.AbstractC1645s
    /* renamed from: i */
    public final int mo10117i() {
        return this.f4001a.f3727m;
    }

    @Override // androidx.recyclerview.widget.AbstractC1645s
    /* renamed from: j */
    public final int mo10116j() {
        return this.f4001a.f3726l;
    }

    @Override // androidx.recyclerview.widget.AbstractC1645s
    /* renamed from: k */
    public final int mo10115k() {
        return this.f4001a.m10337J();
    }

    @Override // androidx.recyclerview.widget.AbstractC1645s
    /* renamed from: l */
    public final int mo10114l() {
        RecyclerView.LayoutManager layoutManager = this.f4001a;
        return (layoutManager.f3729o - layoutManager.m10337J()) - layoutManager.m10340G();
    }

    @Override // androidx.recyclerview.widget.AbstractC1645s
    /* renamed from: m */
    public final int mo10113m(View view) {
        RecyclerView.LayoutManager layoutManager = this.f4001a;
        Rect rect = this.f4003c;
        layoutManager.m10333N(view, rect);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.AbstractC1645s
    /* renamed from: n */
    public final int mo10112n(View view) {
        RecyclerView.LayoutManager layoutManager = this.f4001a;
        Rect rect = this.f4003c;
        layoutManager.m10333N(view, rect);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.AbstractC1645s
    /* renamed from: o */
    public final void mo10111o(int i) {
        this.f4001a.mo10255S(i);
    }
}

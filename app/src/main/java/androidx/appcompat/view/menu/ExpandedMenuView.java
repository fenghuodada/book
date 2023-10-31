package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.C0158a;
import androidx.appcompat.view.menu.C0210g;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements C0210g.InterfaceC0212b, InterfaceC0228n, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public static final int[] f620b = {16842964, 16843049};

    /* renamed from: a */
    public C0210g f621a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable;
        int resourceId;
        Drawable drawable2;
        int resourceId2;
        setOnItemClickListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f620b, 16842868, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            if (obtainStyledAttributes.hasValue(0) && (resourceId2 = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                drawable2 = C0158a.m12920a(context, resourceId2);
            } else {
                drawable2 = obtainStyledAttributes.getDrawable(0);
            }
            setBackgroundDrawable(drawable2);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            if (obtainStyledAttributes.hasValue(1) && (resourceId = obtainStyledAttributes.getResourceId(1, 0)) != 0) {
                drawable = C0158a.m12920a(context, resourceId);
            } else {
                drawable = obtainStyledAttributes.getDrawable(1);
            }
            setDivider(drawable);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.view.menu.C0210g.InterfaceC0212b
    /* renamed from: a */
    public final boolean mo12799a(C0214i c0214i) {
        return this.f621a.m12842q(c0214i, null, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228n
    /* renamed from: b */
    public final void mo4532b(C0210g c0210g) {
        this.f621a = c0210g;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo12799a((C0214i) getAdapter().getItem(i));
    }
}

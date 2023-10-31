package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C1627k;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.z */
/* loaded from: classes.dex */
public abstract class AbstractC1653z extends RecyclerView.ItemAnimator {

    /* renamed from: g */
    public final boolean f4013g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    /* renamed from: a */
    public final boolean mo10089a(@NonNull RecyclerView.AbstractC1597y abstractC1597y, @NonNull RecyclerView.AbstractC1597y abstractC1597y2, @NonNull RecyclerView.ItemAnimator.C1564c c1564c, @NonNull RecyclerView.ItemAnimator.C1564c c1564c2) {
        int i;
        int i2;
        int i3 = c1564c.f3713a;
        int i4 = c1564c.f3714b;
        if (abstractC1597y2.shouldIgnore()) {
            int i5 = c1564c.f3713a;
            i2 = c1564c.f3714b;
            i = i5;
        } else {
            i = c1564c2.f3713a;
            i2 = c1564c2.f3714b;
        }
        C1627k c1627k = (C1627k) this;
        if (abstractC1597y == abstractC1597y2) {
            return c1627k.mo10088g(abstractC1597y, i3, i4, i, i2);
        }
        float translationX = abstractC1597y.itemView.getTranslationX();
        float translationY = abstractC1597y.itemView.getTranslationY();
        float alpha = abstractC1597y.itemView.getAlpha();
        c1627k.m10138l(abstractC1597y);
        abstractC1597y.itemView.setTranslationX(translationX);
        abstractC1597y.itemView.setTranslationY(translationY);
        abstractC1597y.itemView.setAlpha(alpha);
        c1627k.m10138l(abstractC1597y2);
        abstractC1597y2.itemView.setTranslationX(-((int) ((i - i3) - translationX)));
        abstractC1597y2.itemView.setTranslationY(-((int) ((i2 - i4) - translationY)));
        abstractC1597y2.itemView.setAlpha(0.0f);
        c1627k.f3914k.add(new C1627k.C1628a(abstractC1597y, abstractC1597y2, i3, i4, i, i2));
        return true;
    }

    /* renamed from: g */
    public abstract boolean mo10088g(RecyclerView.AbstractC1597y abstractC1597y, int i, int i2, int i3, int i4);
}

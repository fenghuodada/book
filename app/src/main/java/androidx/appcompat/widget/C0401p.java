package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0157c;
import androidx.appcompat.content.res.C0158a;
import androidx.core.view.ViewCompat;
import androidx.core.widget.C1052g;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.p */
/* loaded from: classes.dex */
public final class C0401p {
    @NonNull

    /* renamed from: a */
    public final ImageView f1344a;

    /* renamed from: b */
    public C0422v1 f1345b;

    /* renamed from: c */
    public int f1346c = 0;

    public C0401p(@NonNull ImageView imageView) {
        this.f1344a = imageView;
    }

    /* renamed from: a */
    public final void m12542a() {
        C0422v1 c0422v1;
        ImageView imageView = this.f1344a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            C0427x0.m12481a(drawable);
        }
        if (drawable == null || (c0422v1 = this.f1345b) == null) {
            return;
        }
        C0363j.m12611e(drawable, c0422v1, imageView.getDrawableState());
    }

    /* renamed from: b */
    public final void m12541b(AttributeSet attributeSet, int i) {
        int m12469i;
        ImageView imageView = this.f1344a;
        Context context = imageView.getContext();
        int[] iArr = C0157c.f415f;
        C0430x1 m12465m = C0430x1.m12465m(context, attributeSet, iArr, i);
        ViewCompat.m11772m(imageView, imageView.getContext(), iArr, attributeSet, m12465m.f1406b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (m12469i = m12465m.m12469i(1, -1)) != -1 && (drawable = C0158a.m12920a(imageView.getContext(), m12469i)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0427x0.m12481a(drawable);
            }
            if (m12465m.m12466l(2)) {
                C1052g.m11253c(imageView, m12465m.m12476b(2));
            }
            if (m12465m.m12466l(3)) {
                C1052g.m11252d(imageView, C0427x0.m12479c(m12465m.m12470h(3, -1), null));
            }
        } finally {
            m12465m.m12464n();
        }
    }
}

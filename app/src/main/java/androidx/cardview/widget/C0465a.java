package androidx.cardview.widget;

import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;

@RequiresApi(21)
/* renamed from: androidx.cardview.widget.a */
/* loaded from: classes.dex */
public final class C0465a {
    /* renamed from: a */
    public final void m12435a(InterfaceC0466b interfaceC0466b, float f) {
        float f2;
        CardView.C0464a c0464a = (CardView.C0464a) interfaceC0466b;
        C0467c c0467c = (C0467c) c0464a.f1474a;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        CardView cardView = CardView.this;
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f != c0467c.f1480e || c0467c.f1481f != useCompatPadding || c0467c.f1482g != preventCornerOverlap) {
            c0467c.f1480e = f;
            c0467c.f1481f = useCompatPadding;
            c0467c.f1482g = preventCornerOverlap;
            c0467c.m12432c(null);
            c0467c.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            c0464a.m12436a(0, 0, 0, 0);
            return;
        }
        Drawable drawable = c0464a.f1474a;
        float f3 = ((C0467c) drawable).f1480e;
        float f4 = ((C0467c) drawable).f1476a;
        if (cardView.getPreventCornerOverlap()) {
            f2 = (float) (((1.0d - C0468d.f1487a) * f4) + f3);
        } else {
            int i = C0468d.f1488b;
            f2 = f3;
        }
        int ceil = (int) Math.ceil(f2);
        float f5 = f3 * 1.5f;
        if (cardView.getPreventCornerOverlap()) {
            f5 = (float) (((1.0d - C0468d.f1487a) * f4) + f5);
        }
        int ceil2 = (int) Math.ceil(f5);
        c0464a.m12436a(ceil, ceil2, ceil, ceil2);
    }
}

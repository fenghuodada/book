package com.facebook.ads.redexgen.p036X;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.bx */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC6200bx extends AbstractC41754P {
    public static String[] A01 = {"ufm8s7LRmOM7", "sIBwdoM05ajejE", "0NxvrnR7UZDHrBy4xVhLU5lsqzWJ5R3x", "FsILnIqpIa8iE3wffvJrO4tNlZdDmpUd", "wKnqjXSh8f61FKWyknAGi8xlXXoDdiLA", "lpMPMGmveEx5YZPPZgDkriuB4nzdouJK", "fQPzW90JHWOApVaaQbndX59CGXgCnXlm", "Pp9SKBa6RS3IfLIGXA9e4oeVKGHa5CsE"};
    public boolean A00 = true;

    public abstract boolean A0R(AbstractC41974l abstractC41974l);

    public abstract boolean A0S(AbstractC41974l abstractC41974l);

    public abstract boolean A0T(AbstractC41974l abstractC41974l, int i, int i2, int i3, int i4);

    public abstract boolean A0U(AbstractC41974l abstractC41974l, AbstractC41974l abstractC41974l2, int i, int i2, int i3, int i4);

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41754P
    public final boolean A0D(@NonNull AbstractC41974l abstractC41974l) {
        return !this.A00 || abstractC41974l.A0b();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41754P
    public final boolean A0E(@NonNull AbstractC41974l abstractC41974l, @Nullable C41744O c41744o, @NonNull C41744O c41744o2) {
        if (c41744o != null && (c41744o.A01 != c41744o2.A01 || c41744o.A03 != c41744o2.A03)) {
            return A0T(abstractC41974l, c41744o.A01, c41744o.A03, c41744o2.A01, c41744o2.A03);
        }
        return A0R(abstractC41974l);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41754P
    public final boolean A0F(@NonNull AbstractC41974l abstractC41974l, @NonNull C41744O c41744o, @Nullable C41744O c41744o2) {
        int i = c41744o.A01;
        int i2 = c41744o.A03;
        View view = abstractC41974l.A0H;
        int left = c41744o2 == null ? view.getLeft() : c41744o2.A01;
        int newLeft = c41744o2 == null ? view.getTop() : c41744o2.A03;
        if (!abstractC41974l.A0c() && (i != left || i2 != newLeft)) {
            view.layout(left, newLeft, view.getWidth() + left, view.getHeight() + newLeft);
            return A0T(abstractC41974l, i, i2, left, newLeft);
        }
        return A0S(abstractC41974l);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41754P
    public final boolean A0G(@NonNull AbstractC41974l abstractC41974l, @NonNull C41744O c41744o, @NonNull C41744O c41744o2) {
        if (c41744o.A01 != c41744o2.A01 || c41744o.A03 != c41744o2.A03) {
            return A0T(abstractC41974l, c41744o.A01, c41744o.A03, c41744o2.A01, c41744o2.A03);
        }
        A0O(abstractC41974l);
        return false;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC41754P
    public final boolean A0H(@NonNull AbstractC41974l abstractC41974l, @NonNull AbstractC41974l abstractC41974l2, @NonNull C41744O c41744o, @NonNull C41744O c41744o2) {
        int fromTop;
        int toLeft;
        int i = c41744o.A01;
        int i2 = c41744o.A03;
        if (abstractC41974l2.A0h()) {
            fromTop = c41744o.A01;
            toLeft = c41744o.A03;
        } else {
            fromTop = c41744o2.A01;
            toLeft = c41744o2.A03;
        }
        if (A01[1].length() != 14) {
            throw new RuntimeException();
        }
        A01[1] = "7F8ns227Orjao7";
        return A0U(abstractC41974l, abstractC41974l2, i, i2, fromTop, toLeft);
    }

    public final void A0N(AbstractC41974l abstractC41974l) {
        A0C(abstractC41974l);
    }

    public final void A0O(AbstractC41974l abstractC41974l) {
        A0C(abstractC41974l);
    }

    public final void A0P(AbstractC41974l abstractC41974l) {
        A0C(abstractC41974l);
    }

    public final void A0Q(AbstractC41974l abstractC41974l, boolean z) {
        A0C(abstractC41974l);
    }
}

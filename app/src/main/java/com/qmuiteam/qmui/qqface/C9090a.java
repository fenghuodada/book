package com.qmuiteam.qmui.qqface;

import android.text.Spannable;
import com.qmuiteam.qmui.span.AbstractC9139d;
import java.util.Comparator;

/* renamed from: com.qmuiteam.qmui.qqface.a */
/* loaded from: classes3.dex */
public final class C9090a implements Comparator<AbstractC9139d> {

    /* renamed from: a */
    public final /* synthetic */ Spannable f17457a;

    public C9090a(Spannable spannable) {
        this.f17457a = spannable;
    }

    @Override // java.util.Comparator
    public final int compare(AbstractC9139d abstractC9139d, AbstractC9139d abstractC9139d2) {
        Spannable spannable = this.f17457a;
        int spanStart = spannable.getSpanStart(abstractC9139d);
        int spanStart2 = spannable.getSpanStart(abstractC9139d2);
        if (spanStart > spanStart2) {
            return 1;
        }
        if (spanStart == spanStart2) {
            return 0;
        }
        return -1;
    }
}

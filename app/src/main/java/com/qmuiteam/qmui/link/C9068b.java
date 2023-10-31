package com.qmuiteam.qmui.link;

import android.text.Layout;
import android.text.Spannable;
import android.view.MotionEvent;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: com.qmuiteam.qmui.link.b */
/* loaded from: classes3.dex */
public final class C9068b {

    /* renamed from: a */
    public WeakReference<InterfaceC9067a> f17387a;

    /* renamed from: a */
    public static InterfaceC9067a m2736a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
        int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
        int scrollX = textView.getScrollX() + x;
        Layout layout = textView.getLayout();
        int lineForVertical = layout.getLineForVertical(textView.getScrollY() + y);
        float f = scrollX;
        try {
            layout.getOffsetForHorizontal(lineForVertical, f);
            int i = (f < layout.getLineLeft(lineForVertical) || f > layout.getLineRight(lineForVertical)) ? -1 : -1;
            InterfaceC9067a[] interfaceC9067aArr = (InterfaceC9067a[]) spannable.getSpans(i, i, InterfaceC9067a.class);
            if (interfaceC9067aArr.length > 0) {
                return interfaceC9067aArr[0];
            }
        } catch (IndexOutOfBoundsException unused) {
        }
        return null;
    }
}

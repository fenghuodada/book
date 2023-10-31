package com.qmuiteam.qmui.link;

import android.text.method.LinkMovementMethod;

/* renamed from: com.qmuiteam.qmui.link.c */
/* loaded from: classes3.dex */
public final class C9069c extends LinkMovementMethod {

    /* renamed from: a */
    public static C9069c f17388a;

    /* renamed from: b */
    public static final C9068b f17389b = new C9068b();

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r1 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
        if (r5 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
        r1 = true;
     */
    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.widget.TextView r7, android.text.Spannable r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            com.qmuiteam.qmui.link.b r0 = com.qmuiteam.qmui.link.C9069c.f17389b
            int r1 = r9.getAction()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L37
            com.qmuiteam.qmui.link.a r1 = com.qmuiteam.qmui.link.C9068b.m2736a(r7, r8, r9)
            if (r1 == 0) goto L25
            r1.mo2649b(r3)
            int r4 = r8.getSpanStart(r1)
            int r5 = r8.getSpanEnd(r1)
            android.text.Selection.setSelection(r8, r4, r5)
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r1)
            r0.f17387a = r4
        L25:
            boolean r0 = r7 instanceof com.qmuiteam.qmui.widget.textview.InterfaceC9255a
            if (r0 == 0) goto L34
            r0 = r7
            com.qmuiteam.qmui.widget.textview.a r0 = (com.qmuiteam.qmui.widget.textview.InterfaceC9255a) r0
            if (r1 == 0) goto L30
            r4 = r3
            goto L31
        L30:
            r4 = r2
        L31:
            r0.setTouchSpanHit(r4)
        L34:
            if (r1 == 0) goto Lc3
            goto L6e
        L37:
            int r1 = r9.getAction()
            r4 = 2
            r5 = 0
            if (r1 != r4) goto L70
            com.qmuiteam.qmui.link.a r1 = com.qmuiteam.qmui.link.C9068b.m2736a(r7, r8, r9)
            java.lang.ref.WeakReference<com.qmuiteam.qmui.link.a> r4 = r0.f17387a
            if (r4 == 0) goto L4e
            java.lang.Object r4 = r4.get()
            com.qmuiteam.qmui.link.a r4 = (com.qmuiteam.qmui.link.InterfaceC9067a) r4
            goto L4f
        L4e:
            r4 = r5
        L4f:
            if (r4 == 0) goto L5c
            if (r4 == r1) goto L5c
            r4.mo2649b(r2)
            r0.f17387a = r5
            android.text.Selection.removeSelection(r8)
            goto L5d
        L5c:
            r5 = r4
        L5d:
            boolean r0 = r7 instanceof com.qmuiteam.qmui.widget.textview.InterfaceC9255a
            if (r0 == 0) goto L6c
            r0 = r7
            com.qmuiteam.qmui.widget.textview.a r0 = (com.qmuiteam.qmui.widget.textview.InterfaceC9255a) r0
            if (r5 == 0) goto L68
            r1 = r3
            goto L69
        L68:
            r1 = r2
        L69:
            r0.setTouchSpanHit(r1)
        L6c:
            if (r5 == 0) goto Lc3
        L6e:
            r1 = r3
            goto Lc4
        L70:
            int r1 = r9.getAction()
            if (r1 != r3) goto La3
            java.lang.ref.WeakReference<com.qmuiteam.qmui.link.a> r1 = r0.f17387a
            if (r1 == 0) goto L81
            java.lang.Object r1 = r1.get()
            com.qmuiteam.qmui.link.a r1 = (com.qmuiteam.qmui.link.InterfaceC9067a) r1
            goto L82
        L81:
            r1 = r5
        L82:
            if (r1 == 0) goto L92
            r1.mo2649b(r2)
            int r4 = r9.getAction()
            if (r4 != r3) goto L90
            r1.onClick(r7)
        L90:
            r1 = r3
            goto L93
        L92:
            r1 = r2
        L93:
            r0.f17387a = r5
            android.text.Selection.removeSelection(r8)
            boolean r0 = r7 instanceof com.qmuiteam.qmui.widget.textview.InterfaceC9255a
            if (r0 == 0) goto Lc4
            r0 = r7
            com.qmuiteam.qmui.widget.textview.a r0 = (com.qmuiteam.qmui.widget.textview.InterfaceC9255a) r0
            r0.setTouchSpanHit(r1)
            goto Lc4
        La3:
            java.lang.ref.WeakReference<com.qmuiteam.qmui.link.a> r1 = r0.f17387a
            if (r1 == 0) goto Lae
            java.lang.Object r1 = r1.get()
            com.qmuiteam.qmui.link.a r1 = (com.qmuiteam.qmui.link.InterfaceC9067a) r1
            goto Laf
        Lae:
            r1 = r5
        Laf:
            if (r1 == 0) goto Lb4
            r1.mo2649b(r2)
        Lb4:
            boolean r1 = r7 instanceof com.qmuiteam.qmui.widget.textview.InterfaceC9255a
            if (r1 == 0) goto Lbe
            r1 = r7
            com.qmuiteam.qmui.widget.textview.a r1 = (com.qmuiteam.qmui.widget.textview.InterfaceC9255a) r1
            r1.setTouchSpanHit(r2)
        Lbe:
            r0.f17387a = r5
            android.text.Selection.removeSelection(r8)
        Lc3:
            r1 = r2
        Lc4:
            if (r1 != 0) goto Lcc
            boolean r7 = android.text.method.Touch.onTouchEvent(r7, r8, r9)
            if (r7 == 0) goto Lcd
        Lcc:
            r2 = r3
        Lcd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.link.C9069c.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }
}

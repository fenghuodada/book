package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import com.google.android.material.animation.C7556a;
import com.google.android.material.motion.C7769a;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout implements InterfaceC7843n {

    /* renamed from: a */
    public TextView f15371a;

    /* renamed from: b */
    public Button f15372b;

    /* renamed from: c */
    public final TimeInterpolator f15373c;

    /* renamed from: d */
    public int f15374d;

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15373c = C7769a.m4499d(context, R.attr.motionEasingEmphasizedInterpolator, C7556a.f14283b);
    }

    /* renamed from: a */
    public final boolean m4416a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f15371a.getPaddingTop() == i2 && this.f15371a.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f15371a;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (ViewCompat.C0815e.m11739g(textView)) {
            ViewCompat.C0815e.m11735k(textView, ViewCompat.C0815e.m11740f(textView), i2, ViewCompat.C0815e.m11741e(textView), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f15372b;
    }

    public TextView getMessageView() {
        return this.f15371a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f15371a = (TextView) findViewById(R.id.snackbar_text);
        this.f15372b = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (m4416a(1, r0, r0 - r2) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (m4416a(0, r0, r0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
        if (r1 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
        super.onMeasure(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            r2 = 2131165352(0x7f0700a8, float:1.7944919E38)
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131165351(0x7f0700a7, float:1.7944917E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f15371a
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L32
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L32
            r3 = r1
            goto L33
        L32:
            r3 = r4
        L33:
            if (r3 == 0) goto L4c
            int r5 = r7.f15374d
            if (r5 <= 0) goto L4c
            android.widget.Button r5 = r7.f15372b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f15374d
            if (r5 <= r6) goto L4c
            int r2 = r0 - r2
            boolean r0 = r7.m4416a(r1, r0, r2)
            if (r0 == 0) goto L57
            goto L58
        L4c:
            if (r3 == 0) goto L4f
            goto L50
        L4f:
            r0 = r2
        L50:
            boolean r0 = r7.m4416a(r4, r0, r0)
            if (r0 == 0) goto L57
            goto L58
        L57:
            r1 = r4
        L58:
            if (r1 == 0) goto L5d
            super.onMeasure(r8, r9)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f15374d = i;
    }
}

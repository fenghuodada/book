package com.google.android.exoplayer2.p038ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.adcolony.sdk.C2102e4;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout */
/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: d */
    public static final /* synthetic */ int f13496d = 0;

    /* renamed from: a */
    public final RunnableC7312b f13497a;

    /* renamed from: b */
    public float f13498b;

    /* renamed from: c */
    public int f13499c;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$ResizeMode */
    /* loaded from: classes.dex */
    public @interface ResizeMode {
    }

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$a */
    /* loaded from: classes.dex */
    public interface InterfaceC7311a {
    }

    /* renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b */
    /* loaded from: classes.dex */
    public final class RunnableC7312b implements Runnable {

        /* renamed from: a */
        public boolean f13500a;

        public RunnableC7312b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f13500a = false;
            int i = AspectRatioFrameLayout.f13496d;
            AspectRatioFrameLayout.this.getClass();
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13499c = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C2102e4.f5100a, 0, 0);
            try {
                this.f13499c = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f13497a = new RunnableC7312b();
    }

    public int getResizeMode() {
        return this.f13499c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r4 > 0.0f) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r4 > 0.0f) goto L27;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.f13498b
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto Lb
            return
        Lb:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.f13498b
            float r4 = r4 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r3
            float r3 = java.lang.Math.abs(r4)
            r5 = 1008981770(0x3c23d70a, float:0.01)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r5 = 1
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b r6 = r8.f13497a
            if (r3 > 0) goto L37
            boolean r9 = r6.f13500a
            if (r9 != 0) goto L36
            r6.f13500a = r5
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r9 = com.google.android.exoplayer2.p038ui.AspectRatioFrameLayout.this
            r9.post(r6)
        L36:
            return
        L37:
            int r3 = r8.f13499c
            if (r3 == 0) goto L49
            if (r3 == r5) goto L4d
            r7 = 2
            if (r3 == r7) goto L52
            r7 = 4
            if (r3 == r7) goto L44
            goto L56
        L44:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L4d
            goto L52
        L49:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L52
        L4d:
            float r10 = r8.f13498b
            float r1 = r1 / r10
            int r0 = (int) r1
            goto L56
        L52:
            float r9 = r8.f13498b
            float r2 = r2 * r9
            int r9 = (int) r2
        L56:
            boolean r10 = r6.f13500a
            if (r10 != 0) goto L61
            r6.f13500a = r5
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r10 = com.google.android.exoplayer2.p038ui.AspectRatioFrameLayout.this
            r10.post(r6)
        L61:
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p038ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f) {
        if (this.f13498b != f) {
            this.f13498b = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable InterfaceC7311a interfaceC7311a) {
    }

    public void setResizeMode(int i) {
        if (this.f13499c != i) {
            this.f13499c = i;
            requestLayout();
        }
    }
}

package com.google.android.material.textfield;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.material.shape.C7801j;
import com.google.android.material.shape.MaterialShapeDrawable;

/* renamed from: com.google.android.material.textfield.j */
/* loaded from: classes3.dex */
public class C7873j extends MaterialShapeDrawable {

    /* renamed from: y */
    public static final /* synthetic */ int f15511y = 0;
    @NonNull

    /* renamed from: x */
    public C7874a f15512x;

    /* renamed from: com.google.android.material.textfield.j$a */
    /* loaded from: classes3.dex */
    public static final class C7874a extends MaterialShapeDrawable.C7791b {
        @NonNull

        /* renamed from: v */
        public final RectF f15513v;

        public C7874a(C7801j c7801j, RectF rectF) {
            super(c7801j);
            this.f15513v = rectF;
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable.C7791b, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            C7875b c7875b = new C7875b(this);
            c7875b.invalidateSelf();
            return c7875b;
        }

        public C7874a(C7874a c7874a) {
            super(c7874a);
            this.f15513v = c7874a.f15513v;
        }
    }

    @TargetApi(18)
    /* renamed from: com.google.android.material.textfield.j$b */
    /* loaded from: classes3.dex */
    public static class C7875b extends C7873j {
        public C7875b(@NonNull C7874a c7874a) {
            super(c7874a);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable
        /* renamed from: g */
        public final void mo4376g(@NonNull Canvas canvas) {
            if (this.f15512x.f15513v.isEmpty()) {
                super.mo4376g(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f15512x.f15513v);
            } else {
                canvas.clipRect(this.f15512x.f15513v, Region.Op.DIFFERENCE);
            }
            super.mo4376g(canvas);
            canvas.restore();
        }
    }

    public C7873j(C7874a c7874a) {
        super(c7874a);
        this.f15512x = c7874a;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @NonNull
    public final Drawable mutate() {
        this.f15512x = new C7874a(this.f15512x);
        return this;
    }

    /* renamed from: o */
    public final void m4377o(float f, float f2, float f3, float f4) {
        RectF rectF = this.f15512x.f15513v;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }
}

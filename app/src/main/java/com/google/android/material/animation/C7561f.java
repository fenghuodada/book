package com.google.android.material.animation;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* renamed from: com.google.android.material.animation.f */
/* loaded from: classes3.dex */
public final class C7561f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    public final Matrix f14290a;

    public C7561f() {
        super(Matrix.class, "imageMatrixProperty");
        this.f14290a = new Matrix();
    }

    @Override // android.util.Property
    @NonNull
    public final Matrix get(@NonNull ImageView imageView) {
        Matrix matrix = this.f14290a;
        matrix.set(imageView.getImageMatrix());
        return matrix;
    }

    @Override // android.util.Property
    public final void set(@NonNull ImageView imageView, @NonNull Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}

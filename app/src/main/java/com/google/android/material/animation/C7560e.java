package com.google.android.material.animation;

import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.animation.e */
/* loaded from: classes3.dex */
public final class C7560e extends Property<Drawable, Integer> {

    /* renamed from: a */
    public static final C7560e f14289a = new C7560e();

    public C7560e() {
        super(Integer.class, "drawableAlphaCompat");
        new WeakHashMap();
    }

    @Override // android.util.Property
    @Nullable
    public final Integer get(@NonNull Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    public final void set(@NonNull Drawable drawable, @NonNull Integer num) {
        drawable.setAlpha(num.intValue());
    }
}

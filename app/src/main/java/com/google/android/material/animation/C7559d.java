package com.google.android.material.animation;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.ambrose.overwall.R;

/* renamed from: com.google.android.material.animation.d */
/* loaded from: classes3.dex */
public final class C7559d extends Property<ViewGroup, Float> {

    /* renamed from: a */
    public static final C7559d f14288a = new C7559d();

    public C7559d() {
        super(Float.class, "childrenAlpha");
    }

    @Override // android.util.Property
    @NonNull
    public final Float get(@NonNull ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        if (f == null) {
            return Float.valueOf(1.0f);
        }
        return f;
    }

    @Override // android.util.Property
    public final void set(@NonNull ViewGroup viewGroup, @NonNull Float f) {
        ViewGroup viewGroup2 = viewGroup;
        float floatValue = f.floatValue();
        viewGroup2.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup2.getChildAt(i).setAlpha(floatValue);
        }
    }
}

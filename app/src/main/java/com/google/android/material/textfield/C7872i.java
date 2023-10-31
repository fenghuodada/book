package com.google.android.material.textfield;

import androidx.annotation.NonNull;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.textfield.i */
/* loaded from: classes3.dex */
public final class C7872i extends AbstractC7890u {
    public C7872i(@NonNull C7885t c7885t) {
        super(c7885t);
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: r */
    public final void mo4341r() {
        C7885t c7885t = this.f15566b;
        c7885t.f15550o = null;
        CheckableImageButton checkableImageButton = c7885t.f15542g;
        checkableImageButton.setOnLongClickListener(null);
        C7891v.m4336d(checkableImageButton, null);
    }
}

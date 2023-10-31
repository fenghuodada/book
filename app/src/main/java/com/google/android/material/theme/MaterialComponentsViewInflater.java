package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.C0148w;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.C0320d;
import androidx.appcompat.widget.C0343f;
import androidx.appcompat.widget.C0383m0;
import androidx.appcompat.widget.C0414t;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.C7770a;
import com.google.android.material.textfield.C7896z;
import com.google.android.material.textview.C7898a;

/* loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends C0148w {
    @Override // androidx.appcompat.app.C0148w
    @NonNull
    /* renamed from: a */
    public final C0320d mo4321a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        return new C7896z(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0148w
    @NonNull
    /* renamed from: b */
    public final AppCompatButton mo4320b(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0148w
    @NonNull
    /* renamed from: c */
    public final C0343f mo4319c(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0148w
    @NonNull
    /* renamed from: d */
    public final C0414t mo4318d(Context context, AttributeSet attributeSet) {
        return new C7770a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0148w
    @NonNull
    /* renamed from: e */
    public final C0383m0 mo4317e(Context context, AttributeSet attributeSet) {
        return new C7898a(context, attributeSet);
    }
}

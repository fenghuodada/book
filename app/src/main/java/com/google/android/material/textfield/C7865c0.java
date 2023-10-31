package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.ambrose.overwall.R;

/* renamed from: com.google.android.material.textfield.c0 */
/* loaded from: classes3.dex */
public final class C7865c0 extends AbstractC7890u {

    /* renamed from: e */
    public final int f15485e;
    @Nullable

    /* renamed from: f */
    public EditText f15486f;

    /* renamed from: g */
    public final View$OnClickListenerC7863b0 f15487g;

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.material.textfield.b0] */
    public C7865c0(@NonNull C7885t c7885t, @DrawableRes int i) {
        super(c7885t);
        this.f15485e = R.drawable.design_password_eye;
        this.f15487g = new View.OnClickListener() { // from class: com.google.android.material.textfield.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z;
                EditText editText;
                PasswordTransformationMethod passwordTransformationMethod;
                C7865c0 c7865c0 = C7865c0.this;
                EditText editText2 = c7865c0.f15486f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = c7865c0.f15486f;
                    if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        editText = c7865c0.f15486f;
                        passwordTransformationMethod = null;
                    } else {
                        editText = c7865c0.f15486f;
                        passwordTransformationMethod = PasswordTransformationMethod.getInstance();
                    }
                    editText.setTransformationMethod(passwordTransformationMethod);
                    if (selectionEnd >= 0) {
                        c7865c0.f15486f.setSelection(selectionEnd);
                    }
                    c7865c0.m4342q();
                }
            }
        };
        if (i != 0) {
            this.f15485e = i;
        }
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: b */
    public final void mo4357b() {
        m4342q();
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    @StringRes
    /* renamed from: c */
    public final int mo4356c() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    @DrawableRes
    /* renamed from: d */
    public final int mo4355d() {
        return this.f15485e;
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: f */
    public final View.OnClickListener mo4353f() {
        return this.f15487g;
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: k */
    public final boolean mo4348k() {
        return true;
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: l */
    public final boolean mo4347l() {
        EditText editText = this.f15486f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: m */
    public final void mo4346m(@Nullable EditText editText) {
        this.f15486f = editText;
        m4342q();
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: r */
    public final void mo4341r() {
        boolean z;
        EditText editText = this.f15486f;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f15486f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: s */
    public final void mo4340s() {
        EditText editText = this.f15486f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}

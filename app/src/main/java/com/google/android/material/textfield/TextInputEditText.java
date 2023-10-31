package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C0368k;
import com.ambrose.overwall.R;
import com.google.android.material.C7621c;
import com.google.android.material.internal.C7758l;
import com.google.android.material.theme.overlay.C7899a;
import java.util.Locale;

/* loaded from: classes3.dex */
public class TextInputEditText extends C0368k {

    /* renamed from: g */
    public final Rect f15398g;

    /* renamed from: h */
    public boolean f15399h;

    public TextInputEditText(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(C7899a.m4316a(context, attributeSet, R.attr.editTextStyle, 0), attributeSet, 0);
        this.f15398g = new Rect();
        TypedArray m4508d = C7758l.m4508d(context, attributeSet, C7621c.f14606z, R.attr.editTextStyle, 2132018114, new int[0]);
        setTextInputLayoutFocusedRectEnabled(m4508d.getBoolean(0, false));
        m4508d.recycle();
    }

    @Nullable
    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    @Nullable
    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(@Nullable Rect rect) {
        boolean z;
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f15399h) {
            z = true;
        } else {
            z = false;
        }
        if (z && rect != null) {
            Rect rect2 = this.f15398g;
            textInputLayout.getFocusedRect(rect2);
            rect.bottom = rect2.bottom;
        }
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(@Nullable Rect rect, @Nullable Point point) {
        boolean z;
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f15399h) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return textInputLayout.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.f15404C) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.f15404C && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.C0368k, android.widget.TextView, android.view.View
    @Nullable
    public final InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(@Nullable Rect rect) {
        boolean z;
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f15399h) {
            z = true;
        } else {
            z = false;
        }
        if (z && rect != null) {
            int height = textInputLayout.getHeight() - getHeight();
            int i = rect.left;
            int i2 = rect.top;
            int i3 = rect.right;
            int i4 = rect.bottom + height;
            Rect rect2 = this.f15398g;
            rect2.set(i, i2, i3, i4);
            return super.requestRectangleOnScreen(rect2);
        }
        return super.requestRectangleOnScreen(rect);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f15399h = z;
    }
}

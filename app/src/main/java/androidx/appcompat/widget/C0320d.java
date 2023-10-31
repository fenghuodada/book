package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.C0158a;
import androidx.core.view.InterfaceC0969m0;
import androidx.core.widget.InterfaceC1061p;
import androidx.core.widget.TextViewCompat;
import com.ambrose.overwall.R;

/* renamed from: androidx.appcompat.widget.d */
/* loaded from: classes.dex */
public class C0320d extends AutoCompleteTextView implements InterfaceC0969m0, InterfaceC1061p {

    /* renamed from: d */
    public static final int[] f1164d = {16843126};

    /* renamed from: a */
    public final C0326e f1165a;

    /* renamed from: b */
    public final C0327e0 f1166b;
    @NonNull

    /* renamed from: c */
    public final C0379l f1167c;

    public C0320d(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0320d(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        C0419u1.m12491a(context);
        C0413s1.m12501a(this, getContext());
        C0430x1 m12465m = C0430x1.m12465m(getContext(), attributeSet, f1164d, R.attr.autoCompleteTextViewStyle);
        if (m12465m.m12466l(0)) {
            setDropDownBackgroundDrawable(m12465m.m12473e(0));
        }
        m12465m.m12464n();
        C0326e c0326e = new C0326e(this);
        this.f1165a = c0326e;
        c0326e.m12684d(attributeSet, R.attr.autoCompleteTextViewStyle);
        C0327e0 c0327e0 = new C0327e0(this);
        this.f1166b = c0327e0;
        c0327e0.m12673f(attributeSet, R.attr.autoCompleteTextViewStyle);
        c0327e0.m12677b();
        C0379l c0379l = new C0379l(this);
        this.f1167c = c0379l;
        c0379l.m12585b(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener m12586a = c0379l.m12586a(keyListener);
            if (m12586a != keyListener) {
                super.setKeyListener(m12586a);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0326e c0326e = this.f1165a;
        if (c0326e != null) {
            c0326e.m12687a();
        }
        C0327e0 c0327e0 = this.f1166b;
        if (c0327e0 != null) {
            c0327e0.m12677b();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.m11299d(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0326e c0326e = this.f1165a;
        if (c0326e != null) {
            return c0326e.m12686b();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0326e c0326e = this.f1165a;
        if (c0326e != null) {
            return c0326e.m12685c();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1166b.m12675d();
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1166b.m12674e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0388n.m12565a(this, editorInfo, onCreateInputConnection);
        return this.f1167c.m12584c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0326e c0326e = this.f1165a;
        if (c0326e != null) {
            c0326e.m12683e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        C0326e c0326e = this.f1165a;
        if (c0326e != null) {
            c0326e.m12682f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0327e0 c0327e0 = this.f1166b;
        if (c0327e0 != null) {
            c0327e0.m12677b();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0327e0 c0327e0 = this.f1166b;
        if (c0327e0 != null) {
            c0327e0.m12677b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.m11298e(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@DrawableRes int i) {
        setDropDownBackgroundDrawable(C0158a.m12920a(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1167c.m12583d(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        super.setKeyListener(this.f1167c.m12586a(keyListener));
    }

    @Override // androidx.core.view.InterfaceC0969m0
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C0326e c0326e = this.f1165a;
        if (c0326e != null) {
            c0326e.m12680h(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C0326e c0326e = this.f1165a;
        if (c0326e != null) {
            c0326e.m12679i(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC1061p
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        C0327e0 c0327e0 = this.f1166b;
        c0327e0.m12667l(colorStateList);
        c0327e0.m12677b();
    }

    @Override // androidx.core.widget.InterfaceC1061p
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        C0327e0 c0327e0 = this.f1166b;
        c0327e0.m12666m(mode);
        c0327e0.m12677b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0327e0 c0327e0 = this.f1166b;
        if (c0327e0 != null) {
            c0327e0.m12672g(context, i);
        }
    }
}

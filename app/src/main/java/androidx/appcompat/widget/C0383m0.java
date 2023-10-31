package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.InterfaceC0074Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.appcompat.content.res.C0158a;
import androidx.appcompat.widget.C0321d0;
import androidx.core.graphics.C0711e;
import androidx.core.graphics.C0721n;
import androidx.core.text.C0787j;
import androidx.core.util.C0804h;
import androidx.core.view.InterfaceC0969m0;
import androidx.core.widget.InterfaceC1061p;
import androidx.core.widget.TextViewCompat;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: androidx.appcompat.widget.m0 */
/* loaded from: classes.dex */
public class C0383m0 extends TextView implements InterfaceC0969m0, InterfaceC1061p {

    /* renamed from: a */
    public final C0326e f1309a;

    /* renamed from: b */
    public final C0327e0 f1310b;

    /* renamed from: c */
    public final C0321d0 f1311c;
    @NonNull

    /* renamed from: d */
    public C0382m f1312d;

    /* renamed from: e */
    public boolean f1313e;
    @Nullable

    /* renamed from: f */
    public C0385b f1314f;
    @Nullable

    /* renamed from: g */
    public Future<C0787j> f1315g;

    /* renamed from: androidx.appcompat.widget.m0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0384a {
        /* renamed from: a */
        void mo12568a(@InterfaceC0074Px int i);

        /* renamed from: b */
        void mo12567b(@InterfaceC0074Px int i);
    }

    @RequiresApi(api = 26)
    /* renamed from: androidx.appcompat.widget.m0$b */
    /* loaded from: classes.dex */
    public class C0385b implements InterfaceC0384a {
        public C0385b() {
        }

        @Override // androidx.appcompat.widget.C0383m0.InterfaceC0384a
        /* renamed from: a */
        public void mo12568a(int i) {
        }

        @Override // androidx.appcompat.widget.C0383m0.InterfaceC0384a
        /* renamed from: b */
        public void mo12567b(int i) {
        }
    }

    @RequiresApi(api = 28)
    /* renamed from: androidx.appcompat.widget.m0$c */
    /* loaded from: classes.dex */
    public class C0386c extends C0385b {
        public C0386c() {
            super();
        }

        @Override // androidx.appcompat.widget.C0383m0.C0385b, androidx.appcompat.widget.C0383m0.InterfaceC0384a
        /* renamed from: a */
        public final void mo12568a(@InterfaceC0074Px int i) {
            C0383m0.super.setLastBaselineToBottomHeight(i);
        }

        @Override // androidx.appcompat.widget.C0383m0.C0385b, androidx.appcompat.widget.C0383m0.InterfaceC0384a
        /* renamed from: b */
        public final void mo12567b(@InterfaceC0074Px int i) {
            C0383m0.super.setFirstBaselineToTopHeight(i);
        }
    }

    public C0383m0() {
        throw null;
    }

    public C0383m0(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0383m0(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0419u1.m12491a(context);
        this.f1313e = false;
        this.f1314f = null;
        C0413s1.m12501a(this, getContext());
        C0326e c0326e = new C0326e(this);
        this.f1309a = c0326e;
        c0326e.m12684d(attributeSet, i);
        C0327e0 c0327e0 = new C0327e0(this);
        this.f1310b = c0327e0;
        c0327e0.m12673f(attributeSet, i);
        c0327e0.m12677b();
        this.f1311c = new C0321d0(this);
        getEmojiTextViewHelper().m12579b(attributeSet, i);
    }

    @NonNull
    private C0382m getEmojiTextViewHelper() {
        if (this.f1312d == null) {
            this.f1312d = new C0382m(this);
        }
        return this.f1312d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0326e c0326e = this.f1309a;
        if (c0326e != null) {
            c0326e.m12687a();
        }
        C0327e0 c0327e0 = this.f1310b;
        if (c0327e0 != null) {
            c0327e0.m12677b();
        }
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (C0362i2.f1278b) {
            return super.getAutoSizeMaxTextSize();
        }
        C0327e0 c0327e0 = this.f1310b;
        if (c0327e0 != null) {
            return Math.round(c0327e0.f1184i.f1334e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (C0362i2.f1278b) {
            return super.getAutoSizeMinTextSize();
        }
        C0327e0 c0327e0 = this.f1310b;
        if (c0327e0 != null) {
            return Math.round(c0327e0.f1184i.f1333d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (C0362i2.f1278b) {
            return super.getAutoSizeStepGranularity();
        }
        C0327e0 c0327e0 = this.f1310b;
        if (c0327e0 != null) {
            return Math.round(c0327e0.f1184i.f1332c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (C0362i2.f1278b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0327e0 c0327e0 = this.f1310b;
        if (c0327e0 != null) {
            return c0327e0.f1184i.f1335f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        if (C0362i2.f1278b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        C0327e0 c0327e0 = this.f1310b;
        if (c0327e0 == null) {
            return 0;
        }
        return c0327e0.f1184i.f1330a;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.m11299d(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @RequiresApi(api = 26)
    @UiThread
    public InterfaceC0384a getSuperCaller() {
        C0385b c0385b;
        if (this.f1314f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                c0385b = new C0386c();
            } else if (i >= 26) {
                c0385b = new C0385b();
            }
            this.f1314f = c0385b;
        }
        return this.f1314f;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0326e c0326e = this.f1309a;
        if (c0326e != null) {
            return c0326e.m12686b();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0326e c0326e = this.f1309a;
        if (c0326e != null) {
            return c0326e.m12685c();
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1310b.m12675d();
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1310b.m12674e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<C0787j> future = this.f1315g;
        if (future != null) {
            try {
                this.f1315g = null;
                C0787j c0787j = future.get();
                if (Build.VERSION.SDK_INT >= 29) {
                    c0787j.getClass();
                    setText((CharSequence) null);
                } else {
                    C0787j.C0788a m11302a = TextViewCompat.m11302a(this);
                    c0787j.getClass();
                    m11302a.m11801a(null);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        C0321d0 c0321d0;
        if (Build.VERSION.SDK_INT < 28 && (c0321d0 = this.f1311c) != null) {
            TextClassifier textClassifier = c0321d0.f1169b;
            if (textClassifier == null) {
                return C0321d0.C0322a.m12691a(c0321d0.f1168a);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    @NonNull
    public C0787j.C0788a getTextMetricsParamsCompat() {
        return TextViewCompat.m11302a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1310b.getClass();
        C0327e0.m12671h(this, onCreateInputConnection, editorInfo);
        C0388n.m12565a(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0327e0 c0327e0 = this.f1310b;
        if (c0327e0 != null && !C0362i2.f1278b) {
            c0327e0.f1184i.m12564a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future<C0787j> future = this.f1315g;
        if (future != null) {
            try {
                this.f1315g = null;
                C0787j c0787j = future.get();
                if (Build.VERSION.SDK_INT >= 29) {
                    c0787j.getClass();
                    setText((CharSequence) null);
                } else {
                    C0787j.C0788a m11302a = TextViewCompat.m11302a(this);
                    c0787j.getClass();
                    m11302a.m11801a(null);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        super.onTextChanged(charSequence, i, i2, i3);
        boolean z2 = false;
        C0327e0 c0327e0 = this.f1310b;
        if (c0327e0 != null && !C0362i2.f1278b) {
            C0389n0 c0389n0 = c0327e0.f1184i;
            if (c0389n0.m12556i() && c0389n0.f1330a != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            c0327e0.f1184i.m12564a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m12578c(z);
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C0362i2.f1278b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0327e0 c0327e0 = this.f1310b;
        if (c0327e0 != null) {
            c0327e0.m12670i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public final void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        if (C0362i2.f1278b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0327e0 c0327e0 = this.f1310b;
        if (c0327e0 != null) {
            c0327e0.m12669j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C0362i2.f1278b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0327e0 c0327e0 = this.f1310b;
        if (c0327e0 != null) {
            c0327e0.m12668k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0326e c0326e = this.f1309a;
        if (c0326e != null) {
            c0326e.m12683e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        C0326e c0326e = this.f1309a;
        if (c0326e != null) {
            c0326e.m12682f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0327e0 c0327e0 = this.f1310b;
        if (c0327e0 != null) {
            c0327e0.m12677b();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0327e0 c0327e0 = this.f1310b;
        if (c0327e0 != null) {
            c0327e0.m12677b();
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C0158a.m12920a(context, i) : null, i2 != 0 ? C0158a.m12920a(context, i2) : null, i3 != 0 ? C0158a.m12920a(context, i3) : null, i4 != 0 ? C0158a.m12920a(context, i4) : null);
        C0327e0 c0327e0 = this.f1310b;
        if (c0327e0 != null) {
            c0327e0.m12677b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C0158a.m12920a(context, i) : null, i2 != 0 ? C0158a.m12920a(context, i2) : null, i3 != 0 ? C0158a.m12920a(context, i3) : null, i4 != 0 ? C0158a.m12920a(context, i4) : null);
        C0327e0 c0327e0 = this.f1310b;
        if (c0327e0 != null) {
            c0327e0.m12677b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.m11298e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m12577d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m12580a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@IntRange(from = 0) @InterfaceC0074Px int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo12567b(i);
        } else {
            TextViewCompat.m11301b(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@IntRange(from = 0) @InterfaceC0074Px int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo12568a(i);
        } else {
            TextViewCompat.m11300c(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(@IntRange(from = 0) @InterfaceC0074Px int i) {
        C0804h.m11792b(i);
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(@NonNull C0787j c0787j) {
        if (Build.VERSION.SDK_INT >= 29) {
            c0787j.getClass();
            setText((CharSequence) null);
            return;
        }
        C0787j.C0788a m11302a = TextViewCompat.m11302a(this);
        c0787j.getClass();
        m11302a.m11801a(null);
        throw null;
    }

    @Override // androidx.core.view.InterfaceC0969m0
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C0326e c0326e = this.f1309a;
        if (c0326e != null) {
            c0326e.m12680h(colorStateList);
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C0326e c0326e = this.f1309a;
        if (c0326e != null) {
            c0326e.m12679i(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC1061p
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        C0327e0 c0327e0 = this.f1310b;
        c0327e0.m12667l(colorStateList);
        c0327e0.m12677b();
    }

    @Override // androidx.core.widget.InterfaceC1061p
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        C0327e0 c0327e0 = this.f1310b;
        c0327e0.m12666m(mode);
        c0327e0.m12677b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0327e0 c0327e0 = this.f1310b;
        if (c0327e0 != null) {
            c0327e0.m12672g(context, i);
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        C0321d0 c0321d0;
        if (Build.VERSION.SDK_INT < 28 && (c0321d0 = this.f1311c) != null) {
            c0321d0.f1169b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(@Nullable Future<C0787j> future) {
        this.f1315g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull C0787j.C0788a c0788a) {
        int i;
        TextDirectionHeuristic textDirectionHeuristic = c0788a.f2489b;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i = 7;
            }
            TextViewCompat.C1037b.m11287h(this, i);
            getPaint().set(c0788a.f2488a);
            TextViewCompat.C1038c.m11282e(this, c0788a.f2490c);
            TextViewCompat.C1038c.m11279h(this, c0788a.f2491d);
        }
        i = 1;
        TextViewCompat.C1037b.m11287h(this, i);
        getPaint().set(c0788a.f2488a);
        TextViewCompat.C1038c.m11282e(this, c0788a.f2490c);
        TextViewCompat.C1038c.m11279h(this, c0788a.f2491d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z;
        boolean z2 = C0362i2.f1278b;
        if (z2) {
            super.setTextSize(i, f);
            return;
        }
        C0327e0 c0327e0 = this.f1310b;
        if (c0327e0 != null && !z2) {
            C0389n0 c0389n0 = c0327e0.f1184i;
            if (c0389n0.m12556i() && c0389n0.f1330a != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                c0389n0.m12559f(f, i);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(@Nullable Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f1313e) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            C0721n c0721n = C0711e.f2402a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.f1313e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f1313e = false;
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(17)
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0327e0 c0327e0 = this.f1310b;
        if (c0327e0 != null) {
            c0327e0.m12677b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0327e0 c0327e0 = this.f1310b;
        if (c0327e0 != null) {
            c0327e0.m12677b();
        }
    }
}

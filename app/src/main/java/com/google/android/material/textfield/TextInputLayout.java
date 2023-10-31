package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.InterfaceC0074Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.C0158a;
import androidx.appcompat.widget.C0363j;
import androidx.appcompat.widget.C0383m0;
import androidx.appcompat.widget.C0427x0;
import androidx.appcompat.widget.C0430x1;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.C0689a;
import androidx.core.text.C0775a;
import androidx.core.text.C0795m;
import androidx.core.view.C0851a;
import androidx.core.view.C0922g2;
import androidx.core.view.C0963l;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbstractC1068a;
import androidx.transition.C1741d;
import androidx.transition.C1758k;
import com.ambrose.overwall.R;
import com.google.android.exoplayer2.C6964f;
import com.google.android.material.C7621c;
import com.google.android.material.animation.C7556a;
import com.google.android.material.color.C7661a;
import com.google.android.material.internal.C7743b;
import com.google.android.material.internal.C7744c;
import com.google.android.material.internal.C7758l;
import com.google.android.material.internal.C7764q;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.motion.C7769a;
import com.google.android.material.resources.C7771a;
import com.google.android.material.resources.C7773b;
import com.google.android.material.resources.C7774c;
import com.google.android.material.resources.C7775d;
import com.google.android.material.shape.C7792a;
import com.google.android.material.shape.C7795d;
import com.google.android.material.shape.C7798g;
import com.google.android.material.shape.C7801j;
import com.google.android.material.shape.InterfaceC7794c;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.C7899a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: B0 */
    public static final int[][] f15400B0 = {new int[]{16842919}, new int[0]};

    /* renamed from: A */
    public boolean f15401A;

    /* renamed from: A0 */
    public boolean f15402A0;

    /* renamed from: B */
    public CharSequence f15403B;

    /* renamed from: C */
    public boolean f15404C;
    @Nullable

    /* renamed from: D */
    public MaterialShapeDrawable f15405D;

    /* renamed from: E */
    public MaterialShapeDrawable f15406E;

    /* renamed from: F */
    public StateListDrawable f15407F;

    /* renamed from: G */
    public boolean f15408G;
    @Nullable

    /* renamed from: H */
    public MaterialShapeDrawable f15409H;
    @Nullable

    /* renamed from: I */
    public MaterialShapeDrawable f15410I;
    @NonNull

    /* renamed from: J */
    public C7801j f15411J;

    /* renamed from: K */
    public boolean f15412K;

    /* renamed from: L */
    public final int f15413L;

    /* renamed from: M */
    public int f15414M;

    /* renamed from: N */
    public int f15415N;

    /* renamed from: O */
    public int f15416O;

    /* renamed from: P */
    public int f15417P;

    /* renamed from: Q */
    public int f15418Q;
    @ColorInt

    /* renamed from: R */
    public int f15419R;
    @ColorInt

    /* renamed from: S */
    public int f15420S;

    /* renamed from: T */
    public final Rect f15421T;

    /* renamed from: U */
    public final Rect f15422U;

    /* renamed from: V */
    public final RectF f15423V;

    /* renamed from: W */
    public Typeface f15424W;
    @NonNull

    /* renamed from: a */
    public final FrameLayout f15425a;
    @NonNull

    /* renamed from: b */
    public final C7867d0 f15426b;
    @NonNull

    /* renamed from: c */
    public final C7885t f15427c;

    /* renamed from: d */
    public EditText f15428d;
    @Nullable

    /* renamed from: d0 */
    public ColorDrawable f15429d0;

    /* renamed from: e */
    public CharSequence f15430e;

    /* renamed from: e0 */
    public int f15431e0;

    /* renamed from: f */
    public int f15432f;

    /* renamed from: f0 */
    public final LinkedHashSet<InterfaceC7856g> f15433f0;

    /* renamed from: g */
    public int f15434g;
    @Nullable

    /* renamed from: g0 */
    public ColorDrawable f15435g0;

    /* renamed from: h */
    public int f15436h;

    /* renamed from: h0 */
    public int f15437h0;

    /* renamed from: i */
    public int f15438i;

    /* renamed from: i0 */
    public Drawable f15439i0;

    /* renamed from: j */
    public final C7892w f15440j;

    /* renamed from: j0 */
    public ColorStateList f15441j0;

    /* renamed from: k */
    public boolean f15442k;

    /* renamed from: k0 */
    public ColorStateList f15443k0;

    /* renamed from: l */
    public int f15444l;
    @ColorInt

    /* renamed from: l0 */
    public int f15445l0;

    /* renamed from: m */
    public boolean f15446m;
    @ColorInt

    /* renamed from: m0 */
    public int f15447m0;
    @NonNull

    /* renamed from: n */
    public InterfaceC7855f f15448n;
    @ColorInt

    /* renamed from: n0 */
    public int f15449n0;
    @Nullable

    /* renamed from: o */
    public C0383m0 f15450o;

    /* renamed from: o0 */
    public ColorStateList f15451o0;

    /* renamed from: p */
    public int f15452p;
    @ColorInt

    /* renamed from: p0 */
    public int f15453p0;

    /* renamed from: q */
    public int f15454q;
    @ColorInt

    /* renamed from: q0 */
    public int f15455q0;

    /* renamed from: r */
    public CharSequence f15456r;
    @ColorInt

    /* renamed from: r0 */
    public int f15457r0;

    /* renamed from: s */
    public boolean f15458s;
    @ColorInt

    /* renamed from: s0 */
    public int f15459s0;

    /* renamed from: t */
    public C0383m0 f15460t;
    @ColorInt

    /* renamed from: t0 */
    public int f15461t0;
    @Nullable

    /* renamed from: u */
    public ColorStateList f15462u;

    /* renamed from: u0 */
    public boolean f15463u0;

    /* renamed from: v */
    public int f15464v;

    /* renamed from: v0 */
    public final C7744c f15465v0;
    @Nullable

    /* renamed from: w */
    public C1741d f15466w;

    /* renamed from: w0 */
    public boolean f15467w0;
    @Nullable

    /* renamed from: x */
    public C1741d f15468x;

    /* renamed from: x0 */
    public boolean f15469x0;
    @Nullable

    /* renamed from: y */
    public ColorStateList f15470y;

    /* renamed from: y0 */
    public ValueAnimator f15471y0;
    @Nullable

    /* renamed from: z */
    public ColorStateList f15472z;

    /* renamed from: z0 */
    public boolean f15473z0;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface BoxBackgroundMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface EndIconMode {
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    /* loaded from: classes3.dex */
    public class C7850a implements TextWatcher {
        public C7850a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@NonNull Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.m4389s(!textInputLayout.f15402A0, false);
            if (textInputLayout.f15442k) {
                textInputLayout.m4395m(editable);
            }
            if (textInputLayout.f15458s) {
                textInputLayout.m4388t(editable);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    /* loaded from: classes3.dex */
    public class RunnableC7851b implements Runnable {
        public RunnableC7851b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.f15427c.f15542g;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    /* loaded from: classes3.dex */
    public class RunnableC7852c implements Runnable {
        public RunnableC7852c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.f15428d.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    /* loaded from: classes3.dex */
    public class C7853d implements ValueAnimator.AnimatorUpdateListener {
        public C7853d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TextInputLayout.this.f15465v0.m4520k(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    /* loaded from: classes3.dex */
    public static class C7854e extends C0851a {

        /* renamed from: d */
        public final TextInputLayout f15478d;

        public C7854e(@NonNull TextInputLayout textInputLayout) {
            this.f15478d = textInputLayout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
            if (r7 != null) goto L51;
         */
        @Override // androidx.core.view.C0851a
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo4308d(@androidx.annotation.NonNull android.view.View r18, @androidx.annotation.NonNull androidx.core.view.accessibility.C0874o r19) {
            /*
                Method dump skipped, instructions count: 244
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.C7854e.mo4308d(android.view.View, androidx.core.view.accessibility.o):void");
        }

        @Override // androidx.core.view.C0851a
        /* renamed from: e */
        public final void mo4385e(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.mo4385e(view, accessibilityEvent);
            this.f15478d.f15427c.m4371b().mo4344o(accessibilityEvent);
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    /* loaded from: classes3.dex */
    public interface InterfaceC7855f {
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    /* loaded from: classes3.dex */
    public interface InterfaceC7856g {
        /* renamed from: a */
        void mo4359a(@NonNull TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    /* loaded from: classes3.dex */
    public interface InterfaceC7857h {
        /* renamed from: a */
        void m4384a();
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$i */
    /* loaded from: classes3.dex */
    public static class C7858i extends AbstractC1068a {
        public static final Parcelable.Creator<C7858i> CREATOR = new C7859a();
        @Nullable

        /* renamed from: c */
        public CharSequence f15479c;

        /* renamed from: d */
        public boolean f15480d;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$i$a */
        /* loaded from: classes3.dex */
        public class C7859a implements Parcelable.ClassLoaderCreator<C7858i> {
            @Override // android.os.Parcelable.Creator
            @Nullable
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new C7858i(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new C7858i[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final C7858i createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new C7858i(parcel, classLoader);
            }
        }

        public C7858i(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f15479c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f15480d = parcel.readInt() == 1;
        }

        public C7858i(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f15479c) + "}";
        }

        @Override // androidx.customview.view.AbstractC1068a, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeParcelable(this.f2747a, i);
            TextUtils.writeToParcel(this.f15479c, parcel, i);
            parcel.writeInt(this.f15480d ? 1 : 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v57 */
    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(C7899a.m4316a(context, attributeSet, R.attr.textInputStyle, 2132018115), attributeSet, R.attr.textInputStyle);
        ?? r4;
        int colorForState;
        this.f15432f = -1;
        this.f15434g = -1;
        this.f15436h = -1;
        this.f15438i = -1;
        this.f15440j = new C7892w(this);
        this.f15448n = new C6964f();
        this.f15421T = new Rect();
        this.f15422U = new Rect();
        this.f15423V = new RectF();
        this.f15433f0 = new LinkedHashSet<>();
        C7744c c7744c = new C7744c(this);
        this.f15465v0 = c7744c;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f15425a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = C7556a.f14282a;
        c7744c.f15043Q = linearInterpolator;
        c7744c.m4523h(false);
        c7744c.f15042P = linearInterpolator;
        c7744c.m4523h(false);
        if (c7744c.f15065g != 8388659) {
            c7744c.f15065g = 8388659;
            c7744c.m4523h(false);
        }
        int[] iArr = C7621c.f14579A;
        C7758l.m4511a(context2, attributeSet, R.attr.textInputStyle, 2132018115);
        C7758l.m4510b(context2, attributeSet, iArr, R.attr.textInputStyle, 2132018115, 22, 20, 38, 43, 47);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.textInputStyle, 2132018115);
        C0430x1 c0430x1 = new C0430x1(context2, obtainStyledAttributes);
        C7867d0 c7867d0 = new C7867d0(this, c0430x1);
        this.f15426b = c7867d0;
        this.f15401A = c0430x1.m12477a(46, true);
        setHint(c0430x1.m12467k(4));
        this.f15469x0 = c0430x1.m12477a(45, true);
        this.f15467w0 = c0430x1.m12477a(40, true);
        if (c0430x1.m12466l(6)) {
            setMinEms(c0430x1.m12470h(6, -1));
        } else if (c0430x1.m12466l(3)) {
            setMinWidth(c0430x1.m12474d(3, -1));
        }
        if (c0430x1.m12466l(5)) {
            setMaxEms(c0430x1.m12470h(5, -1));
        } else if (c0430x1.m12466l(2)) {
            setMaxWidth(c0430x1.m12474d(2, -1));
        }
        this.f15411J = new C7801j(C7801j.m4457b(context2, attributeSet, R.attr.textInputStyle, 2132018115));
        this.f15413L = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f15415N = c0430x1.m12475c(9, 0);
        this.f15417P = c0430x1.m12474d(16, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f15418Q = c0430x1.m12474d(17, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f15416O = this.f15417P;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        C7801j c7801j = this.f15411J;
        c7801j.getClass();
        C7801j.C7802a c7802a = new C7801j.C7802a(c7801j);
        if (dimension >= 0.0f) {
            c7802a.f15249e = new C7792a(dimension);
        }
        if (dimension2 >= 0.0f) {
            c7802a.f15250f = new C7792a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c7802a.f15251g = new C7792a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c7802a.f15252h = new C7792a(dimension4);
        }
        this.f15411J = new C7801j(c7802a);
        ColorStateList m4494b = C7774c.m4494b(context2, c0430x1, 7);
        if (m4494b != null) {
            int defaultColor = m4494b.getDefaultColor();
            this.f15453p0 = defaultColor;
            this.f15420S = defaultColor;
            if (m4494b.isStateful()) {
                this.f15455q0 = m4494b.getColorForState(new int[]{-16842910}, -1);
                this.f15457r0 = m4494b.getColorForState(new int[]{16842908, 16842910}, -1);
                colorForState = m4494b.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.f15457r0 = this.f15453p0;
                ColorStateList m12039b = ContextCompat.m12039b(context2, R.color.mtrl_filled_background_color);
                this.f15455q0 = m12039b.getColorForState(new int[]{-16842910}, -1);
                colorForState = m12039b.getColorForState(new int[]{16843623}, -1);
            }
            this.f15459s0 = colorForState;
        } else {
            this.f15420S = 0;
            this.f15453p0 = 0;
            this.f15455q0 = 0;
            this.f15457r0 = 0;
            this.f15459s0 = 0;
        }
        if (c0430x1.m12466l(1)) {
            ColorStateList m12476b = c0430x1.m12476b(1);
            this.f15443k0 = m12476b;
            this.f15441j0 = m12476b;
        }
        ColorStateList m4494b2 = C7774c.m4494b(context2, c0430x1, 14);
        this.f15449n0 = obtainStyledAttributes.getColor(14, 0);
        Object obj = ContextCompat.f2323a;
        this.f15445l0 = ContextCompat.C0652d.m12030a(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.f15461t0 = ContextCompat.C0652d.m12030a(context2, R.color.mtrl_textinput_disabled_color);
        this.f15447m0 = ContextCompat.C0652d.m12030a(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (m4494b2 != null) {
            setBoxStrokeColorStateList(m4494b2);
        }
        if (c0430x1.m12466l(15)) {
            setBoxStrokeErrorColor(C7774c.m4494b(context2, c0430x1, 15));
        }
        if (c0430x1.m12469i(47, -1) != -1) {
            r4 = 0;
            setHintTextAppearance(c0430x1.m12469i(47, 0));
        } else {
            r4 = 0;
        }
        int m12469i = c0430x1.m12469i(38, r4);
        CharSequence m12467k = c0430x1.m12467k(33);
        int m12470h = c0430x1.m12470h(32, 1);
        boolean m12477a = c0430x1.m12477a(34, r4);
        int m12469i2 = c0430x1.m12469i(43, r4);
        boolean m12477a2 = c0430x1.m12477a(42, r4);
        CharSequence m12467k2 = c0430x1.m12467k(41);
        int m12469i3 = c0430x1.m12469i(55, r4);
        CharSequence m12467k3 = c0430x1.m12467k(54);
        boolean m12477a3 = c0430x1.m12477a(18, r4);
        setCounterMaxLength(c0430x1.m12470h(19, -1));
        this.f15454q = c0430x1.m12469i(22, 0);
        this.f15452p = c0430x1.m12469i(20, 0);
        setBoxBackgroundMode(c0430x1.m12470h(8, 0));
        setErrorContentDescription(m12467k);
        setErrorAccessibilityLiveRegion(m12470h);
        setCounterOverflowTextAppearance(this.f15452p);
        setHelperTextTextAppearance(m12469i2);
        setErrorTextAppearance(m12469i);
        setCounterTextAppearance(this.f15454q);
        setPlaceholderText(m12467k3);
        setPlaceholderTextAppearance(m12469i3);
        if (c0430x1.m12466l(39)) {
            setErrorTextColor(c0430x1.m12476b(39));
        }
        if (c0430x1.m12466l(44)) {
            setHelperTextColor(c0430x1.m12476b(44));
        }
        if (c0430x1.m12466l(48)) {
            setHintTextColor(c0430x1.m12476b(48));
        }
        if (c0430x1.m12466l(23)) {
            setCounterTextColor(c0430x1.m12476b(23));
        }
        if (c0430x1.m12466l(21)) {
            setCounterOverflowTextColor(c0430x1.m12476b(21));
        }
        if (c0430x1.m12466l(56)) {
            setPlaceholderTextColor(c0430x1.m12476b(56));
        }
        C7885t c7885t = new C7885t(this, c0430x1);
        this.f15427c = c7885t;
        boolean m12477a4 = c0430x1.m12477a(0, true);
        c0430x1.m12464n();
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        ViewCompat.C0814d.m11746s(this, 2);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i >= 26) {
            ViewCompat.C0822k.m11680l(this, 1);
        }
        frameLayout.addView(c7867d0);
        frameLayout.addView(c7885t);
        addView(frameLayout);
        setEnabled(m12477a4);
        setHelperTextEnabled(m12477a2);
        setErrorEnabled(m12477a);
        setCounterEnabled(m12477a3);
        setHelperText(m12467k2);
    }

    @Nullable
    private Drawable getEditTextBoxBackground() {
        boolean z;
        int i;
        EditText editText = this.f15428d;
        if (editText instanceof AutoCompleteTextView) {
            if (editText.getInputType() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int m4621a = C7661a.m4621a(R.attr.colorControlHighlight, this.f15428d);
                int i2 = this.f15414M;
                int[][] iArr = f15400B0;
                if (i2 == 2) {
                    Context context = getContext();
                    MaterialShapeDrawable materialShapeDrawable = this.f15405D;
                    TypedValue m4496c = C7773b.m4496c(context, R.attr.colorSurface, "TextInputLayout");
                    int i3 = m4496c.resourceId;
                    if (i3 != 0) {
                        Object obj = ContextCompat.f2323a;
                        i = ContextCompat.C0652d.m12030a(context, i3);
                    } else {
                        i = m4496c.data;
                    }
                    MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable.f15183a.f15206a);
                    int m4618d = C7661a.m4618d(m4621a, 0.1f, i);
                    materialShapeDrawable2.m4467k(new ColorStateList(iArr, new int[]{m4618d, 0}));
                    materialShapeDrawable2.setTint(i);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m4618d, i});
                    MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable.f15183a.f15206a);
                    materialShapeDrawable3.setTint(-1);
                    return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable2, materialShapeDrawable3), materialShapeDrawable});
                } else if (i2 == 1) {
                    MaterialShapeDrawable materialShapeDrawable4 = this.f15405D;
                    int i4 = this.f15420S;
                    return new RippleDrawable(new ColorStateList(iArr, new int[]{C7661a.m4618d(m4621a, 0.1f, i4), i4}), materialShapeDrawable4, materialShapeDrawable4);
                } else {
                    return null;
                }
            }
        }
        return this.f15405D;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f15407F == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f15407F = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.f15407F.addState(new int[0], m4402f(false));
        }
        return this.f15407F;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f15406E == null) {
            this.f15406E = m4402f(true);
        }
        return this.f15406E;
    }

    /* renamed from: j */
    public static void m4398j(@NonNull ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m4398j((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f15428d == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f15428d = editText;
            int i = this.f15432f;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.f15436h);
            }
            int i2 = this.f15434g;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.f15438i);
            }
            this.f15408G = false;
            m4400h();
            setTextInputAccessibilityDelegate(new C7854e(this));
            Typeface typeface = this.f15428d.getTypeface();
            C7744c c7744c = this.f15465v0;
            c7744c.m4518m(typeface);
            float textSize = this.f15428d.getTextSize();
            if (c7744c.f15066h != textSize) {
                c7744c.f15066h = textSize;
                c7744c.m4523h(false);
            }
            float letterSpacing = this.f15428d.getLetterSpacing();
            if (c7744c.f15049W != letterSpacing) {
                c7744c.f15049W = letterSpacing;
                c7744c.m4523h(false);
            }
            int gravity = this.f15428d.getGravity();
            int i3 = (gravity & (-113)) | 48;
            if (c7744c.f15065g != i3) {
                c7744c.f15065g = i3;
                c7744c.m4523h(false);
            }
            if (c7744c.f15063f != gravity) {
                c7744c.f15063f = gravity;
                c7744c.m4523h(false);
            }
            this.f15428d.addTextChangedListener(new C7850a());
            if (this.f15441j0 == null) {
                this.f15441j0 = this.f15428d.getHintTextColors();
            }
            if (this.f15401A) {
                if (TextUtils.isEmpty(this.f15403B)) {
                    CharSequence hint = this.f15428d.getHint();
                    this.f15430e = hint;
                    setHint(hint);
                    this.f15428d.setHint((CharSequence) null);
                }
                this.f15404C = true;
            }
            if (this.f15450o != null) {
                m4395m(this.f15428d.getText());
            }
            m4392p();
            this.f15440j.m4334b();
            this.f15426b.bringToFront();
            C7885t c7885t = this.f15427c;
            c7885t.bringToFront();
            Iterator<InterfaceC7856g> it = this.f15433f0.iterator();
            while (it.hasNext()) {
                it.next().mo4359a(this);
            }
            c7885t.m4361l();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            m4389s(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f15403B)) {
            this.f15403B = charSequence;
            C7744c c7744c = this.f15465v0;
            if (charSequence == null || !TextUtils.equals(c7744c.f15027A, charSequence)) {
                c7744c.f15027A = charSequence;
                c7744c.f15028B = null;
                Bitmap bitmap = c7744c.f15031E;
                if (bitmap != null) {
                    bitmap.recycle();
                    c7744c.f15031E = null;
                }
                c7744c.m4523h(false);
            }
            if (!this.f15463u0) {
                m4399i();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f15458s == z) {
            return;
        }
        if (z) {
            C0383m0 c0383m0 = this.f15460t;
            if (c0383m0 != null) {
                this.f15425a.addView(c0383m0);
                this.f15460t.setVisibility(0);
            }
        } else {
            C0383m0 c0383m02 = this.f15460t;
            if (c0383m02 != null) {
                c0383m02.setVisibility(8);
            }
            this.f15460t = null;
        }
        this.f15458s = z;
    }

    @VisibleForTesting
    /* renamed from: a */
    public final void m4407a(float f) {
        C7744c c7744c = this.f15465v0;
        if (c7744c.f15055b == f) {
            return;
        }
        if (this.f15471y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f15471y0 = valueAnimator;
            valueAnimator.setInterpolator(C7769a.m4499d(getContext(), R.attr.motionEasingEmphasizedInterpolator, C7556a.f14283b));
            this.f15471y0.setDuration(C7769a.m4500c(getContext(), R.attr.motionDurationMedium4, 167));
            this.f15471y0.addUpdateListener(new C7853d());
        }
        this.f15471y0.setFloatValues(c7744c.f15055b, f);
        this.f15471y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(@NonNull View view, int i, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f15425a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m4390r();
        setEditText((EditText) view);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4406b() {
        /*
            r7 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r7.f15405D
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.material.shape.MaterialShapeDrawable$b r1 = r0.f15183a
            com.google.android.material.shape.j r1 = r1.f15206a
            com.google.android.material.shape.j r2 = r7.f15411J
            if (r1 == r2) goto L10
            r0.setShapeAppearanceModel(r2)
        L10:
            int r0 = r7.f15414M
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L27
            int r0 = r7.f15416O
            if (r0 <= r2) goto L22
            int r0 = r7.f15419R
            if (r0 == 0) goto L22
            r0 = r4
            goto L23
        L22:
            r0 = r3
        L23:
            if (r0 == 0) goto L27
            r0 = r4
            goto L28
        L27:
            r0 = r3
        L28:
            if (r0 == 0) goto L4b
            com.google.android.material.shape.MaterialShapeDrawable r0 = r7.f15405D
            int r1 = r7.f15416O
            float r1 = (float) r1
            int r5 = r7.f15419R
            com.google.android.material.shape.MaterialShapeDrawable$b r6 = r0.f15183a
            r6.f15216k = r1
            r0.invalidateSelf()
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r5)
            com.google.android.material.shape.MaterialShapeDrawable$b r5 = r0.f15183a
            android.content.res.ColorStateList r6 = r5.f15209d
            if (r6 == r1) goto L4b
            r5.f15209d = r1
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
        L4b:
            int r0 = r7.f15420S
            int r1 = r7.f15414M
            if (r1 != r4) goto L62
            android.content.Context r0 = r7.getContext()
            r1 = 2130968919(0x7f040157, float:1.7546505E38)
            int r0 = com.google.android.material.color.C7661a.m4620b(r0, r1, r3)
            int r1 = r7.f15420S
            int r0 = androidx.core.graphics.C0689a.m11971b(r1, r0)
        L62:
            r7.f15420S = r0
            com.google.android.material.shape.MaterialShapeDrawable r1 = r7.f15405D
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.m4467k(r0)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r7.f15409H
            if (r0 == 0) goto La3
            com.google.android.material.shape.MaterialShapeDrawable r1 = r7.f15410I
            if (r1 != 0) goto L76
            goto La3
        L76:
            int r1 = r7.f15416O
            if (r1 <= r2) goto L7f
            int r1 = r7.f15419R
            if (r1 == 0) goto L7f
            r3 = r4
        L7f:
            if (r3 == 0) goto La0
            android.widget.EditText r1 = r7.f15428d
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L8c
            int r1 = r7.f15445l0
            goto L8e
        L8c:
            int r1 = r7.f15419R
        L8e:
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.m4467k(r1)
            com.google.android.material.shape.MaterialShapeDrawable r0 = r7.f15410I
            int r1 = r7.f15419R
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.m4467k(r1)
        La0:
            r7.invalidate()
        La3:
            r7.m4391q()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m4406b():void");
    }

    /* renamed from: c */
    public final int m4405c() {
        float m4527d;
        if (this.f15401A) {
            int i = this.f15414M;
            C7744c c7744c = this.f15465v0;
            if (i == 0) {
                m4527d = c7744c.m4527d();
            } else if (i != 2) {
                return 0;
            } else {
                m4527d = c7744c.m4527d() / 2.0f;
            }
            return (int) m4527d;
        }
        return 0;
    }

    /* renamed from: d */
    public final C1741d m4404d() {
        C1741d c1741d = new C1741d();
        c1741d.f4184c = C7769a.m4500c(getContext(), R.attr.motionDurationShort2, 87);
        c1741d.f4185d = C7769a.m4499d(getContext(), R.attr.motionEasingLinearInterpolator, C7556a.f14282a);
        return c1741d;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i) {
        EditText editText = this.f15428d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f15430e != null) {
            boolean z = this.f15404C;
            this.f15404C = false;
            CharSequence hint = editText.getHint();
            this.f15428d.setHint(this.f15430e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f15428d.setHint(hint);
                this.f15404C = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f15425a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f15428d) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.f15402A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f15402A0 = false;
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        super.draw(canvas);
        boolean z = this.f15401A;
        C7744c c7744c = this.f15465v0;
        if (z) {
            c7744c.getClass();
            int save = canvas.save();
            if (c7744c.f15028B != null) {
                RectF rectF = c7744c.f15061e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c7744c.f15040N;
                    textPaint.setTextSize(c7744c.f15033G);
                    float f = c7744c.f15074p;
                    float f2 = c7744c.f15075q;
                    float f3 = c7744c.f15032F;
                    if (f3 != 1.0f) {
                        canvas.scale(f3, f3, f, f2);
                    }
                    boolean z2 = true;
                    if (c7744c.f15060d0 <= 1 || c7744c.f15029C) {
                        z2 = false;
                    }
                    if (z2) {
                        int alpha = textPaint.getAlpha();
                        canvas.translate(c7744c.f15074p - c7744c.f15051Y.getLineStart(0), f2);
                        float f4 = alpha;
                        textPaint.setAlpha((int) (c7744c.f15056b0 * f4));
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 31) {
                            float f5 = c7744c.f15034H;
                            float f6 = c7744c.f15035I;
                            float f7 = c7744c.f15036J;
                            int i2 = c7744c.f15037K;
                            textPaint.setShadowLayer(f5, f6, f7, C0689a.m11970c(i2, (Color.alpha(i2) * textPaint.getAlpha()) / 255));
                        }
                        c7744c.f15051Y.draw(canvas);
                        textPaint.setAlpha((int) (c7744c.f15054a0 * f4));
                        if (i >= 31) {
                            float f8 = c7744c.f15034H;
                            float f9 = c7744c.f15035I;
                            float f10 = c7744c.f15036J;
                            int i3 = c7744c.f15037K;
                            textPaint.setShadowLayer(f8, f9, f10, C0689a.m11970c(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = c7744c.f15051Y.getLineBaseline(0);
                        CharSequence charSequence = c7744c.f15058c0;
                        float f11 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                        if (i >= 31) {
                            textPaint.setShadowLayer(c7744c.f15034H, c7744c.f15035I, c7744c.f15036J, c7744c.f15037K);
                        }
                        String trim = c7744c.f15058c0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(c7744c.f15051Y.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                    } else {
                        canvas.translate(f, f2);
                        c7744c.f15051Y.draw(canvas);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f15410I != null && (materialShapeDrawable = this.f15409H) != null) {
            materialShapeDrawable.draw(canvas);
            if (this.f15428d.isFocused()) {
                Rect bounds = this.f15410I.getBounds();
                Rect bounds2 = this.f15409H.getBounds();
                float f12 = c7744c.f15055b;
                int centerX = bounds2.centerX();
                int i4 = bounds2.left;
                LinearInterpolator linearInterpolator = C7556a.f14282a;
                bounds.left = Math.round((i4 - centerX) * f12) + centerX;
                bounds.right = Math.round(f12 * (bounds2.right - centerX)) + centerX;
                this.f15410I.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        boolean z2;
        boolean z3;
        if (this.f15473z0) {
            return;
        }
        boolean z4 = true;
        this.f15473z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C7744c c7744c = this.f15465v0;
        if (c7744c != null) {
            c7744c.f15038L = drawableState;
            ColorStateList colorStateList2 = c7744c.f15069k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = c7744c.f15068j) != null && colorStateList.isStateful())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                c7744c.m4523h(false);
                z3 = true;
            } else {
                z3 = false;
            }
            z = z3 | false;
        } else {
            z = false;
        }
        if (this.f15428d != null) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            if (!ViewCompat.C0817g.m11729c(this) || !isEnabled()) {
                z4 = false;
            }
            m4389s(z4, false);
        }
        m4392p();
        m4386v();
        if (z) {
            invalidate();
        }
        this.f15473z0 = false;
    }

    /* renamed from: e */
    public final boolean m4403e() {
        return this.f15401A && !TextUtils.isEmpty(this.f15403B) && (this.f15405D instanceof C7873j);
    }

    /* renamed from: f */
    public final MaterialShapeDrawable m4402f(boolean z) {
        float f;
        float dimensionPixelOffset;
        int i;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        if (z) {
            f = dimensionPixelOffset2;
        } else {
            f = 0.0f;
        }
        EditText editText = this.f15428d;
        if (editText instanceof C7896z) {
            dimensionPixelOffset = ((C7896z) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C7801j.C7802a c7802a = new C7801j.C7802a();
        c7802a.f15249e = new C7792a(f);
        c7802a.f15250f = new C7792a(f);
        c7802a.f15252h = new C7792a(dimensionPixelOffset2);
        c7802a.f15251g = new C7792a(dimensionPixelOffset2);
        C7801j c7801j = new C7801j(c7802a);
        Context context = getContext();
        Paint paint = MaterialShapeDrawable.f15182w;
        TypedValue m4496c = C7773b.m4496c(context, R.attr.colorSurface, MaterialShapeDrawable.class.getSimpleName());
        int i2 = m4496c.resourceId;
        if (i2 != 0) {
            Object obj = ContextCompat.f2323a;
            i = ContextCompat.C0652d.m12030a(context, i2);
        } else {
            i = m4496c.data;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.m4469i(context);
        materialShapeDrawable.m4467k(ColorStateList.valueOf(i));
        materialShapeDrawable.m4468j(dimensionPixelOffset);
        materialShapeDrawable.setShapeAppearanceModel(c7801j);
        MaterialShapeDrawable.C7791b c7791b = materialShapeDrawable.f15183a;
        if (c7791b.f15213h == null) {
            c7791b.f15213h = new Rect();
        }
        materialShapeDrawable.f15183a.f15213h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        materialShapeDrawable.invalidateSelf();
        return materialShapeDrawable;
    }

    /* renamed from: g */
    public final int m4401g(int i, boolean z) {
        int compoundPaddingLeft = this.f15428d.getCompoundPaddingLeft() + i;
        return (getPrefixText() == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f15428d;
        if (editText != null) {
            return m4405c() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    @NonNull
    public MaterialShapeDrawable getBoxBackground() {
        int i = this.f15414M;
        if (i == 1 || i == 2) {
            return this.f15405D;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f15420S;
    }

    public int getBoxBackgroundMode() {
        return this.f15414M;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f15415N;
    }

    public float getBoxCornerRadiusBottomEnd() {
        InterfaceC7794c interfaceC7794c;
        boolean m4505a = C7764q.m4505a(this);
        RectF rectF = this.f15423V;
        if (m4505a) {
            interfaceC7794c = this.f15411J.f15240h;
        } else {
            interfaceC7794c = this.f15411J.f15239g;
        }
        return interfaceC7794c.mo4460a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        InterfaceC7794c interfaceC7794c;
        boolean m4505a = C7764q.m4505a(this);
        RectF rectF = this.f15423V;
        if (m4505a) {
            interfaceC7794c = this.f15411J.f15239g;
        } else {
            interfaceC7794c = this.f15411J.f15240h;
        }
        return interfaceC7794c.mo4460a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        InterfaceC7794c interfaceC7794c;
        boolean m4505a = C7764q.m4505a(this);
        RectF rectF = this.f15423V;
        if (m4505a) {
            interfaceC7794c = this.f15411J.f15237e;
        } else {
            interfaceC7794c = this.f15411J.f15238f;
        }
        return interfaceC7794c.mo4460a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        InterfaceC7794c interfaceC7794c;
        boolean m4505a = C7764q.m4505a(this);
        RectF rectF = this.f15423V;
        if (m4505a) {
            interfaceC7794c = this.f15411J.f15238f;
        } else {
            interfaceC7794c = this.f15411J.f15237e;
        }
        return interfaceC7794c.mo4460a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f15449n0;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f15451o0;
    }

    public int getBoxStrokeWidth() {
        return this.f15417P;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f15418Q;
    }

    public int getCounterMaxLength() {
        return this.f15444l;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        C0383m0 c0383m0;
        if (this.f15442k && this.f15446m && (c0383m0 = this.f15450o) != null) {
            return c0383m0.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.f15472z;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.f15470y;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.f15441j0;
    }

    @Nullable
    public EditText getEditText() {
        return this.f15428d;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.f15427c.f15542g.getContentDescription();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.f15427c.f15542g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f15427c.f15548m;
    }

    public int getEndIconMode() {
        return this.f15427c.f15544i;
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f15427c.f15549n;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f15427c.f15542g;
    }

    @Nullable
    public CharSequence getError() {
        C7892w c7892w = this.f15440j;
        if (c7892w.f15587q) {
            return c7892w.f15586p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f15440j.f15590t;
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.f15440j.f15589s;
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        C0383m0 c0383m0 = this.f15440j.f15588r;
        if (c0383m0 != null) {
            return c0383m0.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.f15427c.f15538c.getDrawable();
    }

    @Nullable
    public CharSequence getHelperText() {
        C7892w c7892w = this.f15440j;
        if (c7892w.f15594x) {
            return c7892w.f15593w;
        }
        return null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        C0383m0 c0383m0 = this.f15440j.f15595y;
        if (c0383m0 != null) {
            return c0383m0.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public CharSequence getHint() {
        if (this.f15401A) {
            return this.f15403B;
        }
        return null;
    }

    @VisibleForTesting
    public final float getHintCollapsedTextHeight() {
        return this.f15465v0.m4527d();
    }

    @VisibleForTesting
    public final int getHintCurrentCollapsedTextColor() {
        C7744c c7744c = this.f15465v0;
        return c7744c.m4526e(c7744c.f15069k);
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.f15443k0;
    }

    @NonNull
    public InterfaceC7855f getLengthCounter() {
        return this.f15448n;
    }

    public int getMaxEms() {
        return this.f15434g;
    }

    @InterfaceC0074Px
    public int getMaxWidth() {
        return this.f15438i;
    }

    public int getMinEms() {
        return this.f15432f;
    }

    @InterfaceC0074Px
    public int getMinWidth() {
        return this.f15436h;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f15427c.f15542g.getContentDescription();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f15427c.f15542g.getDrawable();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.f15458s) {
            return this.f15456r;
        }
        return null;
    }

    @StyleRes
    public int getPlaceholderTextAppearance() {
        return this.f15464v;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.f15462u;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.f15426b.f15491c;
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.f15426b.f15490b.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f15426b.f15490b;
    }

    @NonNull
    public C7801j getShapeAppearanceModel() {
        return this.f15411J;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.f15426b.f15492d.getContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.f15426b.f15492d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f15426b.f15495g;
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f15426b.f15496h;
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.f15427c.f15551p;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.f15427c.f15552q.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f15427c.f15552q;
    }

    @Nullable
    public Typeface getTypeface() {
        return this.f15424W;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4400h() {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m4400h():void");
    }

    /* renamed from: i */
    public final void m4399i() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        if (!m4403e()) {
            return;
        }
        int width = this.f15428d.getWidth();
        int gravity = this.f15428d.getGravity();
        C7744c c7744c = this.f15465v0;
        boolean m4529b = c7744c.m4529b(c7744c.f15027A);
        c7744c.f15029C = m4529b;
        Rect rect = c7744c.f15059d;
        if (gravity != 17 && (gravity & 7) != 1) {
            if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? m4529b : !m4529b) {
                f3 = rect.left;
                float max = Math.max(f3, rect.left);
                rectF = this.f15423V;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity == 17 && (gravity & 7) != 1) {
                    if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                        if (!c7744c.f15029C) {
                            f4 = c7744c.f15052Z + max;
                        }
                        f4 = rect.right;
                    } else {
                        if (c7744c.f15029C) {
                            f4 = c7744c.f15052Z + max;
                        }
                        f4 = rect.right;
                    }
                } else {
                    f4 = (width / 2.0f) + (c7744c.f15052Z / 2.0f);
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = c7744c.m4527d() + rect.top;
                if (rectF.width() <= 0.0f && rectF.height() > 0.0f) {
                    float f5 = rectF.left;
                    float f6 = this.f15413L;
                    rectF.left = f5 - f6;
                    rectF.right += f6;
                    rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f15416O);
                    C7873j c7873j = (C7873j) this.f15405D;
                    c7873j.getClass();
                    c7873j.m4377o(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    return;
                }
            }
            f = rect.right;
            f2 = c7744c.f15052Z;
        } else {
            f = width / 2.0f;
            f2 = c7744c.f15052Z / 2.0f;
        }
        f3 = f - f2;
        float max2 = Math.max(f3, rect.left);
        rectF = this.f15423V;
        rectF.left = max2;
        rectF.top = rect.top;
        if (gravity == 17) {
        }
        f4 = (width / 2.0f) + (c7744c.f15052Z / 2.0f);
        rectF.right = Math.min(f4, rect.right);
        rectF.bottom = c7744c.m4527d() + rect.top;
        if (rectF.width() <= 0.0f) {
        }
    }

    /* renamed from: k */
    public final void m4397k(@NonNull TextView textView, @StyleRes int i) {
        boolean z = true;
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            textView.setTextAppearance(2132017692);
            Context context = getContext();
            Object obj = ContextCompat.f2323a;
            textView.setTextColor(ContextCompat.C0652d.m12030a(context, R.color.design_error));
        }
    }

    /* renamed from: l */
    public final boolean m4396l() {
        C7892w c7892w = this.f15440j;
        if (c7892w.f15585o == 1 && c7892w.f15588r != null && !TextUtils.isEmpty(c7892w.f15586p)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final void m4395m(@Nullable Editable editable) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        C0775a c0775a;
        ((C6964f) this.f15448n).getClass();
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        boolean z3 = this.f15446m;
        int i3 = this.f15444l;
        String str = null;
        if (i3 == -1) {
            this.f15450o.setText(String.valueOf(i));
            this.f15450o.setContentDescription(null);
            this.f15446m = false;
        } else {
            if (i > i3) {
                z = true;
            } else {
                z = false;
            }
            this.f15446m = z;
            Context context = getContext();
            C0383m0 c0383m0 = this.f15450o;
            int i4 = this.f15444l;
            if (this.f15446m) {
                i2 = R.string.character_counter_overflowed_content_description;
            } else {
                i2 = R.string.character_counter_content_description;
            }
            c0383m0.setContentDescription(context.getString(i2, Integer.valueOf(i), Integer.valueOf(i4)));
            if (z3 != this.f15446m) {
                m4394n();
            }
            String str2 = C0775a.f2475d;
            Locale locale = Locale.getDefault();
            int i5 = C0795m.f2499a;
            if (C0795m.C0796a.m11797a(locale) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                c0775a = C0775a.f2478g;
            } else {
                c0775a = C0775a.f2477f;
            }
            C0383m0 c0383m02 = this.f15450o;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.f15444l));
            if (string == null) {
                c0775a.getClass();
            } else {
                str = c0775a.m11820c(string, c0775a.f2481c).toString();
            }
            c0383m02.setText(str);
        }
        if (this.f15428d != null && z3 != this.f15446m) {
            m4389s(false, false);
            m4386v();
            m4392p();
        }
    }

    /* renamed from: n */
    public final void m4394n() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0383m0 c0383m0 = this.f15450o;
        if (c0383m0 != null) {
            m4397k(c0383m0, this.f15446m ? this.f15452p : this.f15454q);
            if (!this.f15446m && (colorStateList2 = this.f15470y) != null) {
                this.f15450o.setTextColor(colorStateList2);
            }
            if (!this.f15446m || (colorStateList = this.f15472z) == null) {
                return;
            }
            this.f15450o.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
        if (r3.m4370c() != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
        if (r3.f15551p != null) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0120  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m4393o() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m4393o():boolean");
    }

    @Override // android.view.View
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f15465v0.m4524g(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a8  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        EditText editText2 = this.f15428d;
        C7885t c7885t = this.f15427c;
        if (editText2 != null && this.f15428d.getMeasuredHeight() < (max = Math.max(c7885t.getMeasuredHeight(), this.f15426b.getMeasuredHeight()))) {
            this.f15428d.setMinimumHeight(max);
            z = true;
        } else {
            z = false;
        }
        boolean m4393o = m4393o();
        if (z || m4393o) {
            this.f15428d.post(new RunnableC7852c());
        }
        if (this.f15460t != null && (editText = this.f15428d) != null) {
            this.f15460t.setGravity(editText.getGravity());
            this.f15460t.setPadding(this.f15428d.getCompoundPaddingLeft(), this.f15428d.getCompoundPaddingTop(), this.f15428d.getCompoundPaddingRight(), this.f15428d.getCompoundPaddingBottom());
        }
        c7885t.m4361l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof C7858i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7858i c7858i = (C7858i) parcelable;
        super.onRestoreInstanceState(c7858i.f2747a);
        setError(c7858i.f15479c);
        if (c7858i.f15480d) {
            post(new RunnableC7851b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != this.f15412K) {
            InterfaceC7794c interfaceC7794c = this.f15411J.f15237e;
            RectF rectF = this.f15423V;
            float mo4460a = interfaceC7794c.mo4460a(rectF);
            float mo4460a2 = this.f15411J.f15238f.mo4460a(rectF);
            float mo4460a3 = this.f15411J.f15240h.mo4460a(rectF);
            float mo4460a4 = this.f15411J.f15239g.mo4460a(rectF);
            C7801j c7801j = this.f15411J;
            C7795d c7795d = c7801j.f15233a;
            C7801j.C7802a c7802a = new C7801j.C7802a();
            C7795d c7795d2 = c7801j.f15234b;
            c7802a.f15245a = c7795d2;
            float m4453b = C7801j.C7802a.m4453b(c7795d2);
            if (m4453b != -1.0f) {
                c7802a.f15249e = new C7792a(m4453b);
            }
            c7802a.f15246b = c7795d;
            float m4453b2 = C7801j.C7802a.m4453b(c7795d);
            if (m4453b2 != -1.0f) {
                c7802a.f15250f = new C7792a(m4453b2);
            }
            C7795d c7795d3 = c7801j.f15235c;
            c7802a.f15248d = c7795d3;
            float m4453b3 = C7801j.C7802a.m4453b(c7795d3);
            if (m4453b3 != -1.0f) {
                c7802a.f15252h = new C7792a(m4453b3);
            }
            C7795d c7795d4 = c7801j.f15236d;
            c7802a.f15247c = c7795d4;
            float m4453b4 = C7801j.C7802a.m4453b(c7795d4);
            if (m4453b4 != -1.0f) {
                c7802a.f15251g = new C7792a(m4453b4);
            }
            c7802a.f15249e = new C7792a(mo4460a2);
            c7802a.f15250f = new C7792a(mo4460a);
            c7802a.f15252h = new C7792a(mo4460a4);
            c7802a.f15251g = new C7792a(mo4460a3);
            C7801j c7801j2 = new C7801j(c7802a);
            this.f15412K = z;
            setShapeAppearanceModel(c7801j2);
        }
    }

    @Override // android.view.View
    @Nullable
    public final Parcelable onSaveInstanceState() {
        boolean z;
        C7858i c7858i = new C7858i(super.onSaveInstanceState());
        if (m4396l()) {
            c7858i.f15479c = getError();
        }
        C7885t c7885t = this.f15427c;
        boolean z2 = true;
        if (c7885t.f15544i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !c7885t.f15542g.isChecked()) {
            z2 = false;
        }
        c7858i.f15480d = z2;
        return c7858i;
    }

    /* renamed from: p */
    public final void m4392p() {
        Drawable background;
        C0383m0 c0383m0;
        int currentTextColor;
        EditText editText = this.f15428d;
        if (editText == null || this.f15414M != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = C0427x0.f1396a;
        Drawable mutate = background.mutate();
        if (m4396l()) {
            currentTextColor = getErrorCurrentTextColors();
        } else if (this.f15446m && (c0383m0 = this.f15450o) != null) {
            currentTextColor = c0383m0.getCurrentTextColor();
        } else {
            mutate.clearColorFilter();
            this.f15428d.refreshDrawableState();
            return;
        }
        mutate.setColorFilter(C0363j.m12613c(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: q */
    public final void m4391q() {
        EditText editText = this.f15428d;
        if (editText != null && this.f15405D != null) {
            if ((this.f15408G || editText.getBackground() == null) && this.f15414M != 0) {
                EditText editText2 = this.f15428d;
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                ViewCompat.C0814d.m11748q(editText2, editTextBoxBackground);
                this.f15408G = true;
            }
        }
    }

    /* renamed from: r */
    public final void m4390r() {
        if (this.f15414M != 1) {
            FrameLayout frameLayout = this.f15425a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int m4405c = m4405c();
            if (m4405c != layoutParams.topMargin) {
                layoutParams.topMargin = m4405c;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012c  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4389s(boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m4389s(boolean, boolean):void");
    }

    public void setBoxBackgroundColor(@ColorInt int i) {
        if (this.f15420S != i) {
            this.f15420S = i;
            this.f15453p0 = i;
            this.f15457r0 = i;
            this.f15459s0 = i;
            m4406b();
        }
    }

    public void setBoxBackgroundColorResource(@ColorRes int i) {
        Context context = getContext();
        Object obj = ContextCompat.f2323a;
        setBoxBackgroundColor(ContextCompat.C0652d.m12030a(context, i));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f15453p0 = defaultColor;
        this.f15420S = defaultColor;
        this.f15455q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f15457r0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f15459s0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m4406b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f15414M) {
            return;
        }
        this.f15414M = i;
        if (this.f15428d != null) {
            m4400h();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f15415N = i;
    }

    public void setBoxCornerFamily(int i) {
        C7801j c7801j = this.f15411J;
        c7801j.getClass();
        C7801j.C7802a c7802a = new C7801j.C7802a(c7801j);
        InterfaceC7794c interfaceC7794c = this.f15411J.f15237e;
        C7795d m4462a = C7798g.m4462a(i);
        c7802a.f15245a = m4462a;
        float m4453b = C7801j.C7802a.m4453b(m4462a);
        if (m4453b != -1.0f) {
            c7802a.f15249e = new C7792a(m4453b);
        }
        c7802a.f15249e = interfaceC7794c;
        InterfaceC7794c interfaceC7794c2 = this.f15411J.f15238f;
        C7795d m4462a2 = C7798g.m4462a(i);
        c7802a.f15246b = m4462a2;
        float m4453b2 = C7801j.C7802a.m4453b(m4462a2);
        if (m4453b2 != -1.0f) {
            c7802a.f15250f = new C7792a(m4453b2);
        }
        c7802a.f15250f = interfaceC7794c2;
        InterfaceC7794c interfaceC7794c3 = this.f15411J.f15240h;
        C7795d m4462a3 = C7798g.m4462a(i);
        c7802a.f15248d = m4462a3;
        float m4453b3 = C7801j.C7802a.m4453b(m4462a3);
        if (m4453b3 != -1.0f) {
            c7802a.f15252h = new C7792a(m4453b3);
        }
        c7802a.f15252h = interfaceC7794c3;
        InterfaceC7794c interfaceC7794c4 = this.f15411J.f15239g;
        C7795d m4462a4 = C7798g.m4462a(i);
        c7802a.f15247c = m4462a4;
        float m4453b4 = C7801j.C7802a.m4453b(m4462a4);
        if (m4453b4 != -1.0f) {
            c7802a.f15251g = new C7792a(m4453b4);
        }
        c7802a.f15251g = interfaceC7794c4;
        this.f15411J = new C7801j(c7802a);
        m4406b();
    }

    public void setBoxStrokeColor(@ColorInt int i) {
        if (this.f15449n0 != i) {
            this.f15449n0 = i;
            m4386v();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.f15449n0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            m4386v();
        }
        this.f15445l0 = colorStateList.getDefaultColor();
        this.f15461t0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f15447m0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f15449n0 = defaultColor;
        m4386v();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.f15451o0 != colorStateList) {
            this.f15451o0 = colorStateList;
            m4386v();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f15417P = i;
        m4386v();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f15418Q = i;
        m4386v();
    }

    public void setBoxStrokeWidthFocusedResource(@DimenRes int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(@DimenRes int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f15442k != z) {
            Editable editable = null;
            C7892w c7892w = this.f15440j;
            if (z) {
                C0383m0 c0383m0 = new C0383m0(getContext(), null);
                this.f15450o = c0383m0;
                c0383m0.setId(R.id.textinput_counter);
                Typeface typeface = this.f15424W;
                if (typeface != null) {
                    this.f15450o.setTypeface(typeface);
                }
                this.f15450o.setMaxLines(1);
                c7892w.m4335a(this.f15450o, 2);
                C0963l.m11416h((ViewGroup.MarginLayoutParams) this.f15450o.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                m4394n();
                if (this.f15450o != null) {
                    EditText editText = this.f15428d;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    m4395m(editable);
                }
            } else {
                c7892w.m4329g(this.f15450o, 2);
                this.f15450o = null;
            }
            this.f15442k = z;
        }
    }

    public void setCounterMaxLength(int i) {
        Editable text;
        if (this.f15444l != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f15444l = i;
            if (this.f15442k && this.f15450o != null) {
                EditText editText = this.f15428d;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                m4395m(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f15452p != i) {
            this.f15452p = i;
            m4394n();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f15472z != colorStateList) {
            this.f15472z = colorStateList;
            m4394n();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f15454q != i) {
            this.f15454q = i;
            m4394n();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f15470y != colorStateList) {
            this.f15470y = colorStateList;
            m4394n();
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.f15441j0 = colorStateList;
        this.f15443k0 = colorStateList;
        if (this.f15428d != null) {
            m4389s(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m4398j(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f15427c.f15542g.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f15427c.f15542g.setCheckable(z);
    }

    public void setEndIconContentDescription(@StringRes int i) {
        C7885t c7885t = this.f15427c;
        CharSequence text = i != 0 ? c7885t.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = c7885t.f15542g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(@DrawableRes int i) {
        C7885t c7885t = this.f15427c;
        Drawable m12920a = i != 0 ? C0158a.m12920a(c7885t.getContext(), i) : null;
        CheckableImageButton checkableImageButton = c7885t.f15542g;
        checkableImageButton.setImageDrawable(m12920a);
        if (m12920a != null) {
            ColorStateList colorStateList = c7885t.f15546k;
            PorterDuff.Mode mode = c7885t.f15547l;
            TextInputLayout textInputLayout = c7885t.f15536a;
            C7891v.m4339a(textInputLayout, checkableImageButton, colorStateList, mode);
            C7891v.m4337c(textInputLayout, checkableImageButton, c7885t.f15546k);
        }
    }

    public void setEndIconMinSize(@IntRange(from = 0) int i) {
        C7885t c7885t = this.f15427c;
        if (i >= 0) {
            if (i != c7885t.f15548m) {
                c7885t.f15548m = i;
                CheckableImageButton checkableImageButton = c7885t.f15542g;
                checkableImageButton.setMinimumWidth(i);
                checkableImageButton.setMinimumHeight(i);
                CheckableImageButton checkableImageButton2 = c7885t.f15538c;
                checkableImageButton2.setMinimumWidth(i);
                checkableImageButton2.setMinimumHeight(i);
                return;
            }
            return;
        }
        c7885t.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i) {
        this.f15427c.m4367f(i);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        C7885t c7885t = this.f15427c;
        View.OnLongClickListener onLongClickListener = c7885t.f15550o;
        CheckableImageButton checkableImageButton = c7885t.f15542g;
        checkableImageButton.setOnClickListener(onClickListener);
        C7891v.m4336d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        C7885t c7885t = this.f15427c;
        c7885t.f15550o = onLongClickListener;
        CheckableImageButton checkableImageButton = c7885t.f15542g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C7891v.m4336d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        C7885t c7885t = this.f15427c;
        c7885t.f15549n = scaleType;
        c7885t.f15542g.setScaleType(scaleType);
        c7885t.f15538c.setScaleType(scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        C7885t c7885t = this.f15427c;
        if (c7885t.f15546k != colorStateList) {
            c7885t.f15546k = colorStateList;
            C7891v.m4339a(c7885t.f15536a, c7885t.f15542g, colorStateList, c7885t.f15547l);
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        C7885t c7885t = this.f15427c;
        if (c7885t.f15547l != mode) {
            c7885t.f15547l = mode;
            C7891v.m4339a(c7885t.f15536a, c7885t.f15542g, c7885t.f15546k, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f15427c.m4366g(z);
    }

    public void setError(@Nullable CharSequence charSequence) {
        C7892w c7892w = this.f15440j;
        if (!c7892w.f15587q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            c7892w.m4333c();
            c7892w.f15586p = charSequence;
            c7892w.f15588r.setText(charSequence);
            int i = c7892w.f15584n;
            if (i != 1) {
                c7892w.f15585o = 1;
            }
            c7892w.m4327i(i, c7892w.f15585o, c7892w.m4328h(c7892w.f15588r, charSequence));
            return;
        }
        c7892w.m4330f();
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C7892w c7892w = this.f15440j;
        c7892w.f15590t = i;
        C0383m0 c0383m0 = c7892w.f15588r;
        if (c0383m0 != null) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0817g.m11726f(c0383m0, i);
        }
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        C7892w c7892w = this.f15440j;
        c7892w.f15589s = charSequence;
        C0383m0 c0383m0 = c7892w.f15588r;
        if (c0383m0 != null) {
            c0383m0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C7892w c7892w = this.f15440j;
        if (c7892w.f15587q != z) {
            c7892w.m4333c();
            TextInputLayout textInputLayout = c7892w.f15578h;
            if (z) {
                C0383m0 c0383m0 = new C0383m0(c7892w.f15577g, null);
                c7892w.f15588r = c0383m0;
                c0383m0.setId(R.id.textinput_error);
                c7892w.f15588r.setTextAlignment(5);
                Typeface typeface = c7892w.f15570B;
                if (typeface != null) {
                    c7892w.f15588r.setTypeface(typeface);
                }
                int i = c7892w.f15591u;
                c7892w.f15591u = i;
                C0383m0 c0383m02 = c7892w.f15588r;
                if (c0383m02 != null) {
                    textInputLayout.m4397k(c0383m02, i);
                }
                ColorStateList colorStateList = c7892w.f15592v;
                c7892w.f15592v = colorStateList;
                C0383m0 c0383m03 = c7892w.f15588r;
                if (c0383m03 != null && colorStateList != null) {
                    c0383m03.setTextColor(colorStateList);
                }
                CharSequence charSequence = c7892w.f15589s;
                c7892w.f15589s = charSequence;
                C0383m0 c0383m04 = c7892w.f15588r;
                if (c0383m04 != null) {
                    c0383m04.setContentDescription(charSequence);
                }
                int i2 = c7892w.f15590t;
                c7892w.f15590t = i2;
                C0383m0 c0383m05 = c7892w.f15588r;
                if (c0383m05 != null) {
                    WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                    ViewCompat.C0817g.m11726f(c0383m05, i2);
                }
                c7892w.f15588r.setVisibility(4);
                c7892w.m4335a(c7892w.f15588r, 0);
            } else {
                c7892w.m4330f();
                c7892w.m4329g(c7892w.f15588r, 0);
                c7892w.f15588r = null;
                textInputLayout.m4392p();
                textInputLayout.m4386v();
            }
            c7892w.f15587q = z;
        }
    }

    public void setErrorIconDrawable(@DrawableRes int i) {
        Drawable drawable;
        C7885t c7885t = this.f15427c;
        if (i != 0) {
            drawable = C0158a.m12920a(c7885t.getContext(), i);
        } else {
            drawable = null;
        }
        c7885t.m4365h(drawable);
        C7891v.m4337c(c7885t.f15536a, c7885t.f15538c, c7885t.f15539d);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.f15427c.m4365h(drawable);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        C7885t c7885t = this.f15427c;
        CheckableImageButton checkableImageButton = c7885t.f15538c;
        View.OnLongClickListener onLongClickListener = c7885t.f15541f;
        checkableImageButton.setOnClickListener(onClickListener);
        C7891v.m4336d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        C7885t c7885t = this.f15427c;
        c7885t.f15541f = onLongClickListener;
        CheckableImageButton checkableImageButton = c7885t.f15538c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C7891v.m4336d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        C7885t c7885t = this.f15427c;
        if (c7885t.f15539d != colorStateList) {
            c7885t.f15539d = colorStateList;
            C7891v.m4339a(c7885t.f15536a, c7885t.f15538c, colorStateList, c7885t.f15540e);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        C7885t c7885t = this.f15427c;
        if (c7885t.f15540e != mode) {
            c7885t.f15540e = mode;
            C7891v.m4339a(c7885t.f15536a, c7885t.f15538c, c7885t.f15539d, mode);
        }
    }

    public void setErrorTextAppearance(@StyleRes int i) {
        C7892w c7892w = this.f15440j;
        c7892w.f15591u = i;
        C0383m0 c0383m0 = c7892w.f15588r;
        if (c0383m0 != null) {
            c7892w.f15578h.m4397k(c0383m0, i);
        }
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        C7892w c7892w = this.f15440j;
        c7892w.f15592v = colorStateList;
        C0383m0 c0383m0 = c7892w.f15588r;
        if (c0383m0 != null && colorStateList != null) {
            c0383m0.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f15467w0 != z) {
            this.f15467w0 = z;
            m4389s(false, false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        C7892w c7892w = this.f15440j;
        if (isEmpty) {
            if (c7892w.f15594x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c7892w.f15594x) {
            setHelperTextEnabled(true);
        }
        c7892w.m4333c();
        c7892w.f15593w = charSequence;
        c7892w.f15595y.setText(charSequence);
        int i = c7892w.f15584n;
        if (i != 2) {
            c7892w.f15585o = 2;
        }
        c7892w.m4327i(i, c7892w.f15585o, c7892w.m4328h(c7892w.f15595y, charSequence));
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        C7892w c7892w = this.f15440j;
        c7892w.f15569A = colorStateList;
        C0383m0 c0383m0 = c7892w.f15595y;
        if (c0383m0 != null && colorStateList != null) {
            c0383m0.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        C7892w c7892w = this.f15440j;
        if (c7892w.f15594x != z) {
            c7892w.m4333c();
            if (z) {
                C0383m0 c0383m0 = new C0383m0(c7892w.f15577g, null);
                c7892w.f15595y = c0383m0;
                c0383m0.setId(R.id.textinput_helper_text);
                c7892w.f15595y.setTextAlignment(5);
                Typeface typeface = c7892w.f15570B;
                if (typeface != null) {
                    c7892w.f15595y.setTypeface(typeface);
                }
                c7892w.f15595y.setVisibility(4);
                C0383m0 c0383m02 = c7892w.f15595y;
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                ViewCompat.C0817g.m11726f(c0383m02, 1);
                int i = c7892w.f15596z;
                c7892w.f15596z = i;
                C0383m0 c0383m03 = c7892w.f15595y;
                if (c0383m03 != null) {
                    c0383m03.setTextAppearance(i);
                }
                ColorStateList colorStateList = c7892w.f15569A;
                c7892w.f15569A = colorStateList;
                C0383m0 c0383m04 = c7892w.f15595y;
                if (c0383m04 != null && colorStateList != null) {
                    c0383m04.setTextColor(colorStateList);
                }
                c7892w.m4335a(c7892w.f15595y, 1);
                c7892w.f15595y.setAccessibilityDelegate(new C7894x(c7892w));
            } else {
                c7892w.m4333c();
                int i2 = c7892w.f15584n;
                if (i2 == 2) {
                    c7892w.f15585o = 0;
                }
                c7892w.m4327i(i2, c7892w.f15585o, c7892w.m4328h(c7892w.f15595y, ""));
                c7892w.m4329g(c7892w.f15595y, 1);
                c7892w.f15595y = null;
                TextInputLayout textInputLayout = c7892w.f15578h;
                textInputLayout.m4392p();
                textInputLayout.m4386v();
            }
            c7892w.f15594x = z;
        }
    }

    public void setHelperTextTextAppearance(@StyleRes int i) {
        C7892w c7892w = this.f15440j;
        c7892w.f15596z = i;
        C0383m0 c0383m0 = c7892w.f15595y;
        if (c0383m0 != null) {
            c0383m0.setTextAppearance(i);
        }
    }

    public void setHint(@StringRes int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.f15401A) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f15469x0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f15401A) {
            this.f15401A = z;
            if (z) {
                CharSequence hint = this.f15428d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f15403B)) {
                        setHint(hint);
                    }
                    this.f15428d.setHint((CharSequence) null);
                }
                this.f15404C = true;
            } else {
                this.f15404C = false;
                if (!TextUtils.isEmpty(this.f15403B) && TextUtils.isEmpty(this.f15428d.getHint())) {
                    this.f15428d.setHint(this.f15403B);
                }
                setHintInternal(null);
            }
            if (this.f15428d != null) {
                m4390r();
            }
        }
    }

    public void setHintTextAppearance(@StyleRes int i) {
        C7744c c7744c = this.f15465v0;
        View view = c7744c.f15053a;
        C7775d c7775d = new C7775d(view.getContext(), i);
        ColorStateList colorStateList = c7775d.f15146j;
        if (colorStateList != null) {
            c7744c.f15069k = colorStateList;
        }
        float f = c7775d.f15147k;
        if (f != 0.0f) {
            c7744c.f15067i = f;
        }
        ColorStateList colorStateList2 = c7775d.f15137a;
        if (colorStateList2 != null) {
            c7744c.f15047U = colorStateList2;
        }
        c7744c.f15045S = c7775d.f15141e;
        c7744c.f15046T = c7775d.f15142f;
        c7744c.f15044R = c7775d.f15143g;
        c7744c.f15048V = c7775d.f15145i;
        C7771a c7771a = c7744c.f15083y;
        if (c7771a != null) {
            c7771a.f15136c = true;
        }
        C7743b c7743b = new C7743b(c7744c);
        c7775d.m4491a();
        c7744c.f15083y = new C7771a(c7743b, c7775d.f15150n);
        c7775d.m4489c(view.getContext(), c7744c.f15083y);
        c7744c.m4523h(false);
        this.f15443k0 = c7744c.f15069k;
        if (this.f15428d != null) {
            m4389s(false, false);
            m4390r();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f15443k0 != colorStateList) {
            if (this.f15441j0 == null) {
                C7744c c7744c = this.f15465v0;
                if (c7744c.f15069k != colorStateList) {
                    c7744c.f15069k = colorStateList;
                    c7744c.m4523h(false);
                }
            }
            this.f15443k0 = colorStateList;
            if (this.f15428d != null) {
                m4389s(false, false);
            }
        }
    }

    public void setLengthCounter(@NonNull InterfaceC7855f interfaceC7855f) {
        this.f15448n = interfaceC7855f;
    }

    public void setMaxEms(int i) {
        this.f15434g = i;
        EditText editText = this.f15428d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(@InterfaceC0074Px int i) {
        this.f15438i = i;
        EditText editText = this.f15428d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(@DimenRes int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f15432f = i;
        EditText editText = this.f15428d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(@InterfaceC0074Px int i) {
        this.f15436h = i;
        EditText editText = this.f15428d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(@DimenRes int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@StringRes int i) {
        C7885t c7885t = this.f15427c;
        c7885t.f15542g.setContentDescription(i != 0 ? c7885t.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i) {
        C7885t c7885t = this.f15427c;
        c7885t.f15542g.setImageDrawable(i != 0 ? C0158a.m12920a(c7885t.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        C7885t c7885t = this.f15427c;
        if (z && c7885t.f15544i != 1) {
            c7885t.m4367f(1);
        } else if (!z) {
            c7885t.m4367f(0);
        } else {
            c7885t.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        C7885t c7885t = this.f15427c;
        c7885t.f15546k = colorStateList;
        C7891v.m4339a(c7885t.f15536a, c7885t.f15542g, colorStateList, c7885t.f15547l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        C7885t c7885t = this.f15427c;
        c7885t.f15547l = mode;
        C7891v.m4339a(c7885t.f15536a, c7885t.f15542g, c7885t.f15546k, mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        Editable editable = null;
        if (this.f15460t == null) {
            C0383m0 c0383m0 = new C0383m0(getContext(), null);
            this.f15460t = c0383m0;
            c0383m0.setId(R.id.textinput_placeholder);
            C0383m0 c0383m02 = this.f15460t;
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0814d.m11746s(c0383m02, 2);
            C1741d m4404d = m4404d();
            this.f15466w = m4404d;
            m4404d.f4183b = 67L;
            this.f15468x = m4404d();
            setPlaceholderTextAppearance(this.f15464v);
            setPlaceholderTextColor(this.f15462u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f15458s) {
                setPlaceholderTextEnabled(true);
            }
            this.f15456r = charSequence;
        }
        EditText editText = this.f15428d;
        if (editText != null) {
            editable = editText.getText();
        }
        m4388t(editable);
    }

    public void setPlaceholderTextAppearance(@StyleRes int i) {
        this.f15464v = i;
        C0383m0 c0383m0 = this.f15460t;
        if (c0383m0 != null) {
            c0383m0.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f15462u != colorStateList) {
            this.f15462u = colorStateList;
            C0383m0 c0383m0 = this.f15460t;
            if (c0383m0 == null || colorStateList == null) {
                return;
            }
            c0383m0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        CharSequence charSequence2;
        C7867d0 c7867d0 = this.f15426b;
        c7867d0.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        c7867d0.f15491c = charSequence2;
        c7867d0.f15490b.setText(charSequence);
        c7867d0.m4380d();
    }

    public void setPrefixTextAppearance(@StyleRes int i) {
        this.f15426b.f15490b.setTextAppearance(i);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f15426b.f15490b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull C7801j c7801j) {
        MaterialShapeDrawable materialShapeDrawable = this.f15405D;
        if (materialShapeDrawable != null && materialShapeDrawable.f15183a.f15206a != c7801j) {
            this.f15411J = c7801j;
            m4406b();
        }
    }

    public void setStartIconCheckable(boolean z) {
        this.f15426b.f15492d.setCheckable(z);
    }

    public void setStartIconContentDescription(@StringRes int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f15426b.f15492d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(@DrawableRes int i) {
        setStartIconDrawable(i != 0 ? C0158a.m12920a(getContext(), i) : null);
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.f15426b.m4383a(drawable);
    }

    public void setStartIconMinSize(@IntRange(from = 0) int i) {
        C7867d0 c7867d0 = this.f15426b;
        if (i >= 0) {
            if (i != c7867d0.f15495g) {
                c7867d0.f15495g = i;
                CheckableImageButton checkableImageButton = c7867d0.f15492d;
                checkableImageButton.setMinimumWidth(i);
                checkableImageButton.setMinimumHeight(i);
                return;
            }
            return;
        }
        c7867d0.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        C7867d0 c7867d0 = this.f15426b;
        View.OnLongClickListener onLongClickListener = c7867d0.f15497i;
        CheckableImageButton checkableImageButton = c7867d0.f15492d;
        checkableImageButton.setOnClickListener(onClickListener);
        C7891v.m4336d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        C7867d0 c7867d0 = this.f15426b;
        c7867d0.f15497i = onLongClickListener;
        CheckableImageButton checkableImageButton = c7867d0.f15492d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C7891v.m4336d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        C7867d0 c7867d0 = this.f15426b;
        c7867d0.f15496h = scaleType;
        c7867d0.f15492d.setScaleType(scaleType);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        C7867d0 c7867d0 = this.f15426b;
        if (c7867d0.f15493e != colorStateList) {
            c7867d0.f15493e = colorStateList;
            C7891v.m4339a(c7867d0.f15489a, c7867d0.f15492d, colorStateList, c7867d0.f15494f);
        }
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        C7867d0 c7867d0 = this.f15426b;
        if (c7867d0.f15494f != mode) {
            c7867d0.f15494f = mode;
            C7891v.m4339a(c7867d0.f15489a, c7867d0.f15492d, c7867d0.f15493e, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f15426b.m4382b(z);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        CharSequence charSequence2;
        C7885t c7885t = this.f15427c;
        c7885t.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        c7885t.f15551p = charSequence2;
        c7885t.f15552q.setText(charSequence);
        c7885t.m4360m();
    }

    public void setSuffixTextAppearance(@StyleRes int i) {
        this.f15427c.f15552q.setTextAppearance(i);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f15427c.f15552q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable C7854e c7854e) {
        EditText editText = this.f15428d;
        if (editText != null) {
            ViewCompat.m11771n(editText, c7854e);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.f15424W) {
            this.f15424W = typeface;
            this.f15465v0.m4518m(typeface);
            C7892w c7892w = this.f15440j;
            if (typeface != c7892w.f15570B) {
                c7892w.f15570B = typeface;
                C0383m0 c0383m0 = c7892w.f15588r;
                if (c0383m0 != null) {
                    c0383m0.setTypeface(typeface);
                }
                C0383m0 c0383m02 = c7892w.f15595y;
                if (c0383m02 != null) {
                    c0383m02.setTypeface(typeface);
                }
            }
            C0383m0 c0383m03 = this.f15450o;
            if (c0383m03 != null) {
                c0383m03.setTypeface(typeface);
            }
        }
    }

    /* renamed from: t */
    public final void m4388t(@Nullable Editable editable) {
        int i;
        ((C6964f) this.f15448n).getClass();
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        FrameLayout frameLayout = this.f15425a;
        if (i == 0 && !this.f15463u0) {
            if (this.f15460t != null && this.f15458s && !TextUtils.isEmpty(this.f15456r)) {
                this.f15460t.setText(this.f15456r);
                C1758k.m9984a(frameLayout, this.f15466w);
                this.f15460t.setVisibility(0);
                this.f15460t.bringToFront();
                announceForAccessibility(this.f15456r);
                return;
            }
            return;
        }
        C0383m0 c0383m0 = this.f15460t;
        if (c0383m0 != null && this.f15458s) {
            c0383m0.setText((CharSequence) null);
            C1758k.m9984a(frameLayout, this.f15468x);
            this.f15460t.setVisibility(4);
        }
    }

    /* renamed from: u */
    public final void m4387u(boolean z, boolean z2) {
        int defaultColor = this.f15451o0.getDefaultColor();
        int colorForState = this.f15451o0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f15451o0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f15419R = colorForState2;
        } else if (z2) {
            this.f15419R = colorForState;
        } else {
            this.f15419R = defaultColor;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011d  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4386v() {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m4386v():void");
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.f15427c.f15542g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.f15427c.f15542g.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f15427c.f15542g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        C7885t c7885t = this.f15427c;
        CheckableImageButton checkableImageButton = c7885t.f15542g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c7885t.f15546k;
            PorterDuff.Mode mode = c7885t.f15547l;
            TextInputLayout textInputLayout = c7885t.f15536a;
            C7891v.m4339a(textInputLayout, checkableImageButton, colorStateList, mode);
            C7891v.m4337c(textInputLayout, checkableImageButton, c7885t.f15546k);
        }
    }
}

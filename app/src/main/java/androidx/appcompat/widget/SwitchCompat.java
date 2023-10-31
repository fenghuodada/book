package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.C0157c;
import androidx.appcompat.content.res.C0158a;
import androidx.appcompat.text.C0177a;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0700a;
import androidx.core.view.C0922g2;
import androidx.core.view.C0990q0;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.emoji2.text.EmojiCompat;
import com.ambrose.overwall.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: R */
    public static final C0270a f964R = new C0270a();

    /* renamed from: S */
    public static final int[] f965S = {16842912};

    /* renamed from: A */
    public int f966A;

    /* renamed from: B */
    public int f967B;

    /* renamed from: C */
    public int f968C;

    /* renamed from: D */
    public int f969D;

    /* renamed from: E */
    public int f970E;

    /* renamed from: F */
    public int f971F;

    /* renamed from: G */
    public int f972G;

    /* renamed from: H */
    public boolean f973H;

    /* renamed from: I */
    public final TextPaint f974I;

    /* renamed from: J */
    public ColorStateList f975J;

    /* renamed from: K */
    public StaticLayout f976K;

    /* renamed from: L */
    public StaticLayout f977L;
    @Nullable

    /* renamed from: M */
    public C0177a f978M;

    /* renamed from: N */
    public ObjectAnimator f979N;
    @NonNull

    /* renamed from: O */
    public C0382m f980O;
    @Nullable

    /* renamed from: P */
    public C0272c f981P;

    /* renamed from: Q */
    public final Rect f982Q;

    /* renamed from: a */
    public Drawable f983a;

    /* renamed from: b */
    public ColorStateList f984b;

    /* renamed from: c */
    public PorterDuff.Mode f985c;

    /* renamed from: d */
    public boolean f986d;

    /* renamed from: e */
    public boolean f987e;

    /* renamed from: f */
    public Drawable f988f;

    /* renamed from: g */
    public ColorStateList f989g;

    /* renamed from: h */
    public PorterDuff.Mode f990h;

    /* renamed from: i */
    public boolean f991i;

    /* renamed from: j */
    public boolean f992j;

    /* renamed from: k */
    public int f993k;

    /* renamed from: l */
    public int f994l;

    /* renamed from: m */
    public int f995m;

    /* renamed from: n */
    public boolean f996n;

    /* renamed from: o */
    public CharSequence f997o;

    /* renamed from: p */
    public CharSequence f998p;

    /* renamed from: q */
    public CharSequence f999q;

    /* renamed from: r */
    public CharSequence f1000r;

    /* renamed from: s */
    public boolean f1001s;

    /* renamed from: t */
    public int f1002t;

    /* renamed from: u */
    public final int f1003u;

    /* renamed from: v */
    public float f1004v;

    /* renamed from: w */
    public float f1005w;

    /* renamed from: x */
    public final VelocityTracker f1006x;

    /* renamed from: y */
    public final int f1007y;

    /* renamed from: z */
    public float f1008z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    /* loaded from: classes.dex */
    public class C0270a extends Property<SwitchCompat, Float> {
        public C0270a() {
            super(Float.class, "thumbPos");
        }

        @Override // android.util.Property
        public final Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1008z);
        }

        @Override // android.util.Property
        public final void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    @RequiresApi(18)
    /* renamed from: androidx.appcompat.widget.SwitchCompat$b */
    /* loaded from: classes.dex */
    public static class C0271b {
        @DoNotInline
        /* renamed from: a */
        public static void m12766a(ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.SwitchCompat$c */
    /* loaded from: classes.dex */
    public static class C0272c extends EmojiCompat.AbstractC1285e {

        /* renamed from: a */
        public final WeakReference f1009a;

        public C0272c(SwitchCompat switchCompat) {
            this.f1009a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.EmojiCompat.AbstractC1285e
        /* renamed from: a */
        public final void mo10686a() {
            SwitchCompat switchCompat = (SwitchCompat) this.f1009a.get();
            if (switchCompat != null) {
                switchCompat.m12768d();
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.AbstractC1285e
        /* renamed from: b */
        public final void mo10645b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f1009a.get();
            if (switchCompat != null) {
                switchCompat.m12768d();
            }
        }
    }

    public SwitchCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchStyle);
        Typeface typeface;
        Typeface create;
        int i;
        int resourceId;
        this.f984b = null;
        this.f985c = null;
        this.f986d = false;
        this.f987e = false;
        this.f989g = null;
        this.f990h = null;
        this.f991i = false;
        this.f992j = false;
        this.f1006x = VelocityTracker.obtain();
        this.f973H = true;
        this.f982Q = new Rect();
        C0413s1.m12501a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f974I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C0157c.f432w;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.switchStyle, 0);
        C0430x1 c0430x1 = new C0430x1(context, obtainStyledAttributes);
        ViewCompat.m11772m(this, context, iArr, attributeSet, obtainStyledAttributes, R.attr.switchStyle);
        Drawable m12473e = c0430x1.m12473e(2);
        this.f983a = m12473e;
        if (m12473e != null) {
            m12473e.setCallback(this);
        }
        Drawable m12473e2 = c0430x1.m12473e(11);
        this.f988f = m12473e2;
        if (m12473e2 != null) {
            m12473e2.setCallback(this);
        }
        setTextOnInternal(c0430x1.m12467k(0));
        setTextOffInternal(c0430x1.m12467k(1));
        this.f1001s = c0430x1.m12477a(3, true);
        this.f993k = c0430x1.m12474d(8, 0);
        this.f994l = c0430x1.m12474d(5, 0);
        this.f995m = c0430x1.m12474d(6, 0);
        this.f996n = c0430x1.m12477a(4, false);
        ColorStateList m12476b = c0430x1.m12476b(9);
        if (m12476b != null) {
            this.f984b = m12476b;
            this.f986d = true;
        }
        PorterDuff.Mode m12479c = C0427x0.m12479c(c0430x1.m12470h(10, -1), null);
        if (this.f985c != m12479c) {
            this.f985c = m12479c;
            this.f987e = true;
        }
        if (this.f986d || this.f987e) {
            m12771a();
        }
        ColorStateList m12476b2 = c0430x1.m12476b(12);
        if (m12476b2 != null) {
            this.f989g = m12476b2;
            this.f991i = true;
        }
        PorterDuff.Mode m12479c2 = C0427x0.m12479c(c0430x1.m12470h(13, -1), null);
        if (this.f990h != m12479c2) {
            this.f990h = m12479c2;
            this.f992j = true;
        }
        if (this.f991i || this.f992j) {
            m12770b();
        }
        int m12469i = c0430x1.m12469i(7, 0);
        if (m12469i != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(m12469i, C0157c.f433x);
            ColorStateList colorStateList = (!obtainStyledAttributes2.hasValue(3) || (resourceId = obtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = ContextCompat.m12039b(context, resourceId)) == null) ? obtainStyledAttributes2.getColorStateList(3) : colorStateList;
            this.f975J = colorStateList == null ? getTextColors() : colorStateList;
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i2 = obtainStyledAttributes2.getInt(1, -1);
            int i3 = obtainStyledAttributes2.getInt(2, -1);
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        typeface = null;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            if (i3 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(i3);
                } else {
                    create = Typeface.create(typeface, i3);
                }
                setSwitchTypeface(create);
                if (create != null) {
                    i = create.getStyle();
                } else {
                    i = 0;
                }
                int i4 = (~i) & i3;
                textPaint.setFakeBoldText((i4 & 1) != 0);
                textPaint.setTextSkewX((i4 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            this.f978M = obtainStyledAttributes2.getBoolean(14, false) ? new C0177a(getContext()) : null;
            setTextOnInternal(this.f997o);
            setTextOffInternal(this.f999q);
            obtainStyledAttributes2.recycle();
        }
        new C0327e0(this).m12673f(attributeSet, R.attr.switchStyle);
        c0430x1.m12464n();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1003u = viewConfiguration.getScaledTouchSlop();
        this.f1007y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m12579b(attributeSet, R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    @NonNull
    private C0382m getEmojiTextViewHelper() {
        if (this.f980O == null) {
            this.f980O = new C0382m(this);
        }
        return this.f980O;
    }

    private boolean getTargetCheckedState() {
        return this.f1008z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C0362i2.m12616a(this) ? 1.0f - this.f1008z : this.f1008z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f988f;
        if (drawable != null) {
            Rect rect = this.f982Q;
            drawable.getPadding(rect);
            Drawable drawable2 = this.f983a;
            Rect m12480b = drawable2 != null ? C0427x0.m12480b(drawable2) : C0427x0.f1398c;
            return ((((this.f966A - this.f968C) - rect.left) - rect.right) - m12480b.left) - m12480b.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f999q = charSequence;
        C0382m emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod mo10647e = emojiTextViewHelper.f1308b.f3241a.mo10647e(this.f978M);
        if (mo10647e != null) {
            charSequence = mo10647e.getTransformation(charSequence, this);
        }
        this.f1000r = charSequence;
        this.f977L = null;
        if (this.f1001s) {
            m12767e();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f997o = charSequence;
        C0382m emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod mo10647e = emojiTextViewHelper.f1308b.f3241a.mo10647e(this.f978M);
        if (mo10647e != null) {
            charSequence = mo10647e.getTransformation(charSequence, this);
        }
        this.f998p = charSequence;
        this.f976K = null;
        if (this.f1001s) {
            m12767e();
        }
    }

    /* renamed from: a */
    public final void m12771a() {
        Drawable drawable = this.f983a;
        if (drawable != null) {
            if (this.f986d || this.f987e) {
                Drawable mutate = drawable.mutate();
                this.f983a = mutate;
                if (this.f986d) {
                    C0700a.C0702b.m11924h(mutate, this.f984b);
                }
                if (this.f987e) {
                    C0700a.C0702b.m11923i(this.f983a, this.f985c);
                }
                if (this.f983a.isStateful()) {
                    this.f983a.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: b */
    public final void m12770b() {
        Drawable drawable = this.f988f;
        if (drawable != null) {
            if (this.f991i || this.f992j) {
                Drawable mutate = drawable.mutate();
                this.f988f = mutate;
                if (this.f991i) {
                    C0700a.C0702b.m11924h(mutate, this.f989g);
                }
                if (this.f992j) {
                    C0700a.C0702b.m11923i(this.f988f, this.f990h);
                }
                if (this.f988f.isStateful()) {
                    this.f988f.setState(getDrawableState());
                }
            }
        }
    }

    /* renamed from: c */
    public final StaticLayout m12769c(CharSequence charSequence) {
        TextPaint textPaint = this.f974I;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: d */
    public final void m12768d() {
        setTextOnInternal(this.f997o);
        setTextOffInternal(this.f999q);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        int i3 = this.f969D;
        int i4 = this.f970E;
        int i5 = this.f971F;
        int i6 = this.f972G;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f983a;
        if (drawable != null) {
            rect = C0427x0.m12480b(drawable);
        } else {
            rect = C0427x0.f1398c;
        }
        Drawable drawable2 = this.f988f;
        Rect rect2 = this.f982Q;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                if (i9 > i10) {
                    i = (i9 - i10) + i4;
                } else {
                    i = i4;
                }
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f988f.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f988f.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f983a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.f968C + rect2.right;
            this.f983a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0700a.C0702b.m11926f(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f983a;
        if (drawable != null) {
            C0700a.C0702b.m11927e(drawable, f, f2);
        }
        Drawable drawable2 = this.f988f;
        if (drawable2 != null) {
            C0700a.C0702b.m11927e(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f983a;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f988f;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m12767e() {
        boolean z;
        if (this.f981P == null && this.f980O.f1308b.f3241a.mo10650b()) {
            if (EmojiCompat.f3154j != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                EmojiCompat m10693a = EmojiCompat.m10693a();
                int m10692b = m10693a.m10692b();
                if (m10692b == 3 || m10692b == 0) {
                    C0272c c0272c = new C0272c(this);
                    this.f981P = c0272c;
                    m10693a.m10687g(c0272c);
                }
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (C0362i2.m12616a(this)) {
            int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f966A;
            return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f995m : compoundPaddingLeft;
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (C0362i2.m12616a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f966A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f995m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.m11299d(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1001s;
    }

    public boolean getSplitTrack() {
        return this.f996n;
    }

    public int getSwitchMinWidth() {
        return this.f994l;
    }

    public int getSwitchPadding() {
        return this.f995m;
    }

    public CharSequence getTextOff() {
        return this.f999q;
    }

    public CharSequence getTextOn() {
        return this.f997o;
    }

    public Drawable getThumbDrawable() {
        return this.f983a;
    }

    @FloatRange(from = 0.0d, m13045to = 1.0d)
    public final float getThumbPosition() {
        return this.f1008z;
    }

    public int getThumbTextPadding() {
        return this.f993k;
    }

    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f984b;
    }

    @Nullable
    public PorterDuff.Mode getThumbTintMode() {
        return this.f985c;
    }

    public Drawable getTrackDrawable() {
        return this.f988f;
    }

    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f989g;
    }

    @Nullable
    public PorterDuff.Mode getTrackTintMode() {
        return this.f990h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f983a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f988f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f979N;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f979N.end();
        this.f979N = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f965S);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f988f;
        Rect rect = this.f982Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f970E;
        int i2 = this.f972G;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f983a;
        if (drawable != null) {
            if (!this.f996n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect m12480b = C0427x0.m12480b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += m12480b.left;
                rect.right -= m12480b.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f976K : this.f977L;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f975J;
            TextPaint textPaint = this.f974I;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f997o : this.f999q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.f983a != null) {
            Drawable drawable = this.f988f;
            Rect rect = this.f982Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect m12480b = C0427x0.m12480b(this.f983a);
            i5 = Math.max(0, m12480b.left - rect.left);
            i9 = Math.max(0, m12480b.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0362i2.m12616a(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.f966A + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.f966A) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int i10 = this.f967B;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i10 / 2);
            i7 = i10 + height;
            i8 = height;
        } else if (gravity != 80) {
            i8 = getPaddingTop();
            i7 = this.f967B + i8;
        } else {
            i7 = getHeight() - getPaddingBottom();
            i8 = i7 - this.f967B;
        }
        this.f969D = i6;
        this.f970E = i8;
        this.f972G = i7;
        this.f971F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f1001s) {
            if (this.f976K == null) {
                this.f976K = m12769c(this.f998p);
            }
            if (this.f977L == null) {
                this.f977L = m12769c(this.f1000r);
            }
        }
        Drawable drawable = this.f983a;
        int i5 = 0;
        Rect rect = this.f982Q;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.f983a.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f983a.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.f968C = Math.max(this.f1001s ? (this.f993k * 2) + Math.max(this.f976K.getWidth(), this.f977L.getWidth()) : 0, i3);
        Drawable drawable2 = this.f988f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f988f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f983a;
        if (drawable3 != null) {
            Rect m12480b = C0427x0.m12480b(drawable3);
            i6 = Math.max(i6, m12480b.left);
            i7 = Math.max(i7, m12480b.right);
        }
        int max = this.f973H ? Math.max(this.f994l, (this.f968C * 2) + i6 + i7) : this.f994l;
        int max2 = Math.max(i5, i4);
        this.f966A = max;
        this.f967B = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f997o : this.f999q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r1 != 3) goto L7;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m12578c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.f997o;
                if (obj == null) {
                    obj = getResources().getString(R.string.abc_capital_on);
                }
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                new C0990q0().m11766e(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj2 = this.f999q;
            if (obj2 == null) {
                obj2 = getResources().getString(R.string.abc_capital_off);
            }
            WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
            new C0990q0().m11766e(this, obj2);
        }
        float f = 1.0f;
        if (getWindowToken() != null) {
            WeakHashMap<View, C0922g2> weakHashMap3 = ViewCompat.f2518a;
            if (ViewCompat.C0817g.m11729c(this)) {
                if (!isChecked) {
                    f = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f964R, f);
                this.f979N = ofFloat;
                ofFloat.setDuration(250L);
                C0271b.m12766a(this.f979N, true);
                this.f979N.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f979N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!isChecked) {
            f = 0.0f;
        }
        setThumbPosition(f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.m11298e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m12577d(z);
        setTextOnInternal(this.f997o);
        setTextOffInternal(this.f999q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.f973H = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m12580a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f1001s != z) {
            this.f1001s = z;
            requestLayout();
            if (z) {
                m12767e();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f996n = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f994l = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f995m = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f974I;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f999q;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_off);
            }
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            new C0990q0().m11766e(this, obj);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f997o;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_on);
            }
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            new C0990q0().m11766e(this, obj);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f983a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f983a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f1008z = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C0158a.m12920a(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f993k = i;
        requestLayout();
    }

    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f984b = colorStateList;
        this.f986d = true;
        m12771a();
    }

    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        this.f985c = mode;
        this.f987e = true;
        m12771a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f988f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f988f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C0158a.m12920a(getContext(), i));
    }

    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f989g = colorStateList;
        this.f991i = true;
        m12770b();
    }

    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        this.f990h = mode;
        this.f992j = true;
        m12770b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f983a || drawable == this.f988f;
    }
}

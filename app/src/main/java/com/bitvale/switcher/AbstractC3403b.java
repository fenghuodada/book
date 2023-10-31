package com.bitvale.switcher;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.C0388n;
import com.ambrose.overwall.R;
import kotlin.C10868p;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.bitvale.switcher.b */
/* loaded from: classes.dex */
public abstract class AbstractC3403b extends View {

    /* renamed from: a */
    public float f9004a;

    /* renamed from: b */
    public float f9005b;

    /* renamed from: c */
    public float f9006c;

    /* renamed from: d */
    public int f9007d;

    /* renamed from: e */
    public int f9008e;

    /* renamed from: f */
    public boolean f9009f;
    @ColorInt

    /* renamed from: g */
    public int f9010g;
    @ColorInt

    /* renamed from: h */
    public int f9011h;
    @ColorInt

    /* renamed from: i */
    public int f9012i;
    @NotNull

    /* renamed from: j */
    public final Paint f9013j;
    @NotNull

    /* renamed from: k */
    public final RectF f9014k;
    @NotNull

    /* renamed from: l */
    public final RectF f9015l;
    @NotNull

    /* renamed from: m */
    public final Paint f9016m;
    @NotNull

    /* renamed from: n */
    public final Paint f9017n;
    @Nullable

    /* renamed from: o */
    public AnimatorSet f9018o;
    @NotNull

    /* renamed from: p */
    public final Paint f9019p;
    @Nullable

    /* renamed from: q */
    public Bitmap f9020q;

    /* renamed from: r */
    public float f9021r;
    @ColorInt

    /* renamed from: s */
    public int f9022s;

    /* renamed from: t */
    public float f9023t;

    /* renamed from: u */
    public float f9024u;

    /* renamed from: v */
    public float f9025v;
    @Nullable

    /* renamed from: w */
    public InterfaceC10820l<? super Boolean, C10868p> f9026w;

    /* renamed from: com.bitvale.switcher.b$a */
    /* loaded from: classes.dex */
    public static final class View$OnClickListenerC3404a implements View.OnClickListener {
        public View$OnClickListenerC3404a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AbstractC3403b abstractC3403b = AbstractC3403b.this;
            abstractC3403b.mo6789b(!abstractC3403b.f9009f, true);
        }
    }

    @JvmOverloads
    public AbstractC3403b(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final void setShadowBlurRadius(float f) {
        Context context = getContext();
        C10843j.m431e(context, "context");
        Resources resources = context.getResources();
        C10843j.m431e(resources, "resources");
        setSwitchElevation(Math.min((f / ((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()))) * 25.0f, 25.0f));
    }

    /* renamed from: a */
    public abstract void mo6790a();

    /* renamed from: b */
    public abstract void mo6789b(boolean z, boolean z2);

    @Nullable
    public AnimatorSet getAnimatorSet() {
        return this.f9018o;
    }

    public int getCurrentColor() {
        return this.f9022s;
    }

    public int getDefHeight() {
        return this.f9007d;
    }

    public int getDefWidth() {
        return this.f9008e;
    }

    @NotNull
    public Paint getIconClipPaint() {
        return this.f9017n;
    }

    public float getIconClipRadius() {
        return this.f9005b;
    }

    @NotNull
    public RectF getIconClipRect() {
        return this.f9015l;
    }

    public float getIconCollapsedWidth() {
        return this.f9006c;
    }

    public int getIconColor() {
        return this.f9012i;
    }

    public float getIconHeight() {
        return this.f9024u;
    }

    @NotNull
    public Paint getIconPaint() {
        return this.f9016m;
    }

    public float getIconProgress() {
        return this.f9025v;
    }

    public float getIconRadius() {
        return this.f9004a;
    }

    @NotNull
    public RectF getIconRect() {
        return this.f9014k;
    }

    @Nullable
    public final InterfaceC10820l<Boolean, C10868p> getListener() {
        return this.f9026w;
    }

    public int getOffColor() {
        return this.f9011h;
    }

    public int getOnColor() {
        return this.f9010g;
    }

    @Nullable
    public Bitmap getShadow() {
        return this.f9020q;
    }

    public float getShadowOffset() {
        return this.f9021r;
    }

    @NotNull
    public Paint getShadowPaint() {
        return this.f9019p;
    }

    public float getSwitchElevation() {
        return this.f9023t;
    }

    @NotNull
    public Paint getSwitcherPaint() {
        return this.f9013j;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("switch_state"));
            setChecked(bundle.getBoolean("checked"));
            if (!this.f9009f) {
                mo6790a();
            }
        }
    }

    @Override // android.view.View
    @NotNull
    public final Parcelable onSaveInstanceState() {
        super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putBoolean("checked", this.f9009f);
        bundle.putParcelable("switch_state", super.onSaveInstanceState());
        return bundle;
    }

    public void setAnimatorSet(@Nullable AnimatorSet animatorSet) {
        this.f9018o = animatorSet;
    }

    public void setChecked(boolean z) {
        this.f9009f = z;
    }

    public void setCurrentColor(int i) {
        this.f9022s = i;
        getSwitcherPaint().setColor(i);
        getIconClipPaint().setColor(i);
    }

    public void setDefHeight(int i) {
        this.f9007d = i;
    }

    public void setDefWidth(int i) {
        this.f9008e = i;
    }

    public void setIconClipRadius(float f) {
        this.f9005b = f;
    }

    public void setIconCollapsedWidth(float f) {
        this.f9006c = f;
    }

    public void setIconColor(int i) {
        this.f9012i = i;
    }

    public void setIconHeight(float f) {
        this.f9024u = f;
    }

    public void setIconProgress(float f) {
        this.f9025v = f;
    }

    public void setIconRadius(float f) {
        this.f9004a = f;
    }

    public final void setListener(@Nullable InterfaceC10820l<? super Boolean, C10868p> interfaceC10820l) {
        this.f9026w = interfaceC10820l;
    }

    public void setOffColor(int i) {
        this.f9011h = i;
    }

    public final void setOnCheckedChangeListener(@NotNull InterfaceC10820l<? super Boolean, C10868p> listener) {
        C10843j.m430f(listener, "listener");
        this.f9026w = listener;
    }

    public void setOnColor(int i) {
        this.f9010g = i;
    }

    public void setShadow(@Nullable Bitmap bitmap) {
        this.f9020q = bitmap;
    }

    public void setShadowOffset(float f) {
        this.f9021r = f;
    }

    public void setSwitchElevation(float f) {
        this.f9023t = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbstractC3403b(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10843j.m430f(context, "context");
        this.f9009f = true;
        this.f9013j = new Paint(1);
        this.f9014k = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f9015l = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f9016m = new Paint(1);
        this.f9017n = new Paint(1);
        this.f9018o = new AnimatorSet();
        this.f9019p = new Paint(1);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0388n.f1326a, i, R.style.Switcher);
            C10843j.m431e(obtainStyledAttributes, "context.obtainStyledAttr….style.Switcher\n        )");
            setSwitchElevation(obtainStyledAttributes.getDimension(1, 0.0f));
            setOnColor(obtainStyledAttributes.getColor(5, 0));
            setOffColor(obtainStyledAttributes.getColor(4, 0));
            setIconColor(obtainStyledAttributes.getColor(3, 0));
            setChecked(obtainStyledAttributes.getBoolean(0, true));
            if (!this.f9009f) {
                setIconProgress(1.0f);
            }
            setCurrentColor(this.f9009f ? getOnColor() : getOffColor());
            getIconPaint().setColor(getIconColor());
            setDefHeight(obtainStyledAttributes.getDimensionPixelOffset(2, 0));
            setDefWidth(obtainStyledAttributes.getDimensionPixelOffset(6, 0));
            obtainStyledAttributes.recycle();
        }
        setOnClickListener(new View$OnClickListenerC3404a());
    }
}

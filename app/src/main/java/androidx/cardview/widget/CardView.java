package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.InterfaceC0074Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.C0463a;
import com.ambrose.overwall.R;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: f */
    public static final int[] f1467f = {16842801};

    /* renamed from: g */
    public static final C0465a f1468g = new C0465a();

    /* renamed from: a */
    public boolean f1469a;

    /* renamed from: b */
    public boolean f1470b;

    /* renamed from: c */
    public final Rect f1471c;

    /* renamed from: d */
    public final Rect f1472d;

    /* renamed from: e */
    public final C0464a f1473e;

    /* renamed from: androidx.cardview.widget.CardView$a */
    /* loaded from: classes.dex */
    public class C0464a implements InterfaceC0466b {

        /* renamed from: a */
        public Drawable f1474a;

        public C0464a() {
        }

        /* renamed from: a */
        public final void m12436a(int i, int i2, int i3, int i4) {
            CardView cardView = CardView.this;
            cardView.f1472d.set(i, i2, i3, i4);
            Rect rect = cardView.f1471c;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.cardViewStyle);
        Resources resources;
        int i;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1471c = rect;
        this.f1472d = new Rect();
        C0464a c0464a = new C0464a();
        this.f1473e = c0464a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0463a.f1466a, R.attr.cardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1467f);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i = R.color.cardview_light_background;
            } else {
                resources = getResources();
                i = R.color.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f1469a = obtainStyledAttributes.getBoolean(7, false);
        this.f1470b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        C0465a c0465a = f1468g;
        C0467c c0467c = new C0467c(dimension, valueOf);
        c0464a.f1474a = c0467c;
        setBackgroundDrawable(c0467c);
        setClipToOutline(true);
        setElevation(dimension2);
        c0465a.m12435a(c0464a, dimension3);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return ((C0467c) this.f1473e.f1474a).f1483h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    @InterfaceC0074Px
    public int getContentPaddingBottom() {
        return this.f1471c.bottom;
    }

    @InterfaceC0074Px
    public int getContentPaddingLeft() {
        return this.f1471c.left;
    }

    @InterfaceC0074Px
    public int getContentPaddingRight() {
        return this.f1471c.right;
    }

    @InterfaceC0074Px
    public int getContentPaddingTop() {
        return this.f1471c.top;
    }

    public float getMaxCardElevation() {
        return ((C0467c) this.f1473e.f1474a).f1480e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f1470b;
    }

    public float getRadius() {
        return ((C0467c) this.f1473e.f1474a).f1476a;
    }

    public boolean getUseCompatPadding() {
        return this.f1469a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(@ColorInt int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C0467c c0467c = (C0467c) this.f1473e.f1474a;
        c0467c.m12433b(valueOf);
        c0467c.invalidateSelf();
    }

    public void setCardElevation(float f) {
        CardView.this.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        f1468g.m12435a(this.f1473e, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1470b) {
            this.f1470b = z;
            C0465a c0465a = f1468g;
            C0464a c0464a = this.f1473e;
            c0465a.m12435a(c0464a, ((C0467c) c0464a.f1474a).f1480e);
        }
    }

    public void setRadius(float f) {
        C0467c c0467c = (C0467c) this.f1473e.f1474a;
        if (f != c0467c.f1476a) {
            c0467c.f1476a = f;
            c0467c.m12432c(null);
            c0467c.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1469a != z) {
            this.f1469a = z;
            C0465a c0465a = f1468g;
            C0464a c0464a = this.f1473e;
            c0465a.m12435a(c0464a, ((C0467c) c0464a.f1474a).f1480e);
        }
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        C0467c c0467c = (C0467c) this.f1473e.f1474a;
        c0467c.m12433b(colorStateList);
        c0467c.invalidateSelf();
    }
}

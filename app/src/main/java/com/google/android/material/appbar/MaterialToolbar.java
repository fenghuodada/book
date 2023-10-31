package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.view.menu.C0210g;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.C0700a;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import com.google.android.material.C7621c;
import com.google.android.material.internal.C7758l;
import com.google.android.material.internal.C7759m;
import com.google.android.material.shape.C7798g;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.C7899a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: f0 */
    public static final ImageView.ScaleType[] f14335f0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    @Nullable

    /* renamed from: U */
    public Integer f14336U;

    /* renamed from: V */
    public boolean f14337V;

    /* renamed from: W */
    public boolean f14338W;
    @Nullable

    /* renamed from: d0 */
    public ImageView.ScaleType f14339d0;
    @Nullable

    /* renamed from: e0 */
    public Boolean f14340e0;

    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(C7899a.m4316a(context, attributeSet, R.attr.toolbarStyle, 2132018398), attributeSet, 0);
        Context context2 = getContext();
        TypedArray m4508d = C7758l.m4508d(context2, attributeSet, C7621c.f14599s, R.attr.toolbarStyle, 2132018398, new int[0]);
        if (m4508d.hasValue(2)) {
            setNavigationIconTint(m4508d.getColor(2, -1));
        }
        this.f14337V = m4508d.getBoolean(4, false);
        this.f14338W = m4508d.getBoolean(3, false);
        int i = m4508d.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f14335f0;
            if (i < scaleTypeArr.length) {
                this.f14339d0 = scaleTypeArr[i];
            }
        }
        if (m4508d.hasValue(0)) {
            this.f14340e0 = Boolean.valueOf(m4508d.getBoolean(0, false));
        }
        m4508d.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.m4467k(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            materialShapeDrawable.m4469i(context2);
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            materialShapeDrawable.m4468j(ViewCompat.C0819i.m11713i(this));
            ViewCompat.C0814d.m11748q(this, materialShapeDrawable);
        }
    }

    @Nullable
    public ImageView.ScaleType getLogoScaleType() {
        return this.f14339d0;
    }

    @Nullable
    @ColorInt
    public Integer getNavigationIconTint() {
        return this.f14336U;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: k */
    public final void mo4478k(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof C0210g;
        if (z) {
            ((C0210g) menu).m12836w();
        }
        super.mo4478k(i);
        if (z) {
            ((C0210g) menu).m12837v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            C7798g.m4461b(this, (MaterialShapeDrawable) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.f14337V || this.f14338W) {
            ArrayList m4506b = C7759m.m4506b(this, getTitle());
            boolean isEmpty = m4506b.isEmpty();
            C7759m.C7760a c7760a = C7759m.f15122a;
            if (isEmpty) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(m4506b, c7760a);
            }
            ArrayList m4506b2 = C7759m.m4506b(this, getSubtitle());
            if (m4506b2.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(m4506b2, c7760a);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f14337V && textView != null) {
                    m4786t(textView, pair);
                }
                if (this.f14338W && textView2 != null) {
                    m4786t(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f14340e0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f14339d0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).m4468j(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f14340e0;
        if (bool == null || bool.booleanValue() != z) {
            this.f14340e0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.f14339d0 != scaleType) {
            this.f14339d0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        if (drawable != null && this.f14336U != null) {
            drawable = drawable.mutate();
            C0700a.C0702b.m11925g(drawable, this.f14336U.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(@ColorInt int i) {
        this.f14336U = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f14338W != z) {
            this.f14338W = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f14337V != z) {
            this.f14337V = z;
            requestLayout();
        }
    }

    /* renamed from: t */
    public final void m4786t(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}

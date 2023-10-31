package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0157c;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    public boolean f872a;

    /* renamed from: b */
    public boolean f873b;

    /* renamed from: c */
    public int f874c;

    public ButtonBarLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f874c = -1;
        int[] iArr = C0157c.f420k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ViewCompat.m11772m(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f872a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f872a);
        }
    }

    private void setStacked(boolean z) {
        if (this.f873b != z) {
            if (!z || this.f872a) {
                this.f873b = z;
                setOrientation(z ? 1 : 0);
                setGravity(z ? 8388613 : 80);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    findViewById.setVisibility(z ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int paddingBottom;
        boolean z2;
        int size = View.MeasureSpec.getSize(i);
        int i5 = 0;
        if (this.f872a) {
            if (size > this.f874c && this.f873b) {
                setStacked(false);
            }
            this.f874c = size;
        }
        if (!this.f873b && View.MeasureSpec.getMode(i) == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        } else {
            i3 = i;
            z = false;
        }
        super.onMeasure(i3, i2);
        if (this.f872a && !this.f873b) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            i4 = -1;
            if (i6 < childCount) {
                if (getChildAt(i6).getVisibility() == 0) {
                    break;
                }
                i6++;
            } else {
                i6 = -1;
                break;
            }
        }
        if (i6 >= 0) {
            View childAt = getChildAt(i6);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i5 = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f873b) {
                int i7 = i6 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i7 >= childCount2) {
                        break;
                    } else if (getChildAt(i7).getVisibility() == 0) {
                        i4 = i7;
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i4 >= 0) {
                    paddingBottom = getChildAt(i4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            i5 += paddingBottom;
        }
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (ViewCompat.C0814d.m11761d(this) != i5) {
            setMinimumHeight(i5);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f872a != z) {
            this.f872a = z;
            if (!z && this.f873b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}

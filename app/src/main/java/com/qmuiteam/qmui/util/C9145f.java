package com.qmuiteam.qmui.util;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.C0158a;
import androidx.core.content.ContextCompat;
import com.qmuiteam.qmui.C9056b;

/* renamed from: com.qmuiteam.qmui.util.f */
/* loaded from: classes3.dex */
public final class C9145f {

    /* renamed from: a */
    public static TypedValue f17580a;

    /* renamed from: a */
    public static void m2640a(TextView textView, int i) {
        TextUtils.TruncateAt truncateAt;
        TypedArray obtainStyledAttributes = textView.getContext().obtainStyledAttributes(null, C9056b.f17324s, i, 0);
        int indexCount = obtainStyledAttributes.getIndexCount();
        int paddingLeft = textView.getPaddingLeft();
        int paddingRight = textView.getPaddingRight();
        int paddingTop = textView.getPaddingTop();
        int paddingBottom = textView.getPaddingBottom();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 5) {
                textView.setGravity(obtainStyledAttributes.getInt(index, -1));
            } else if (index == 2) {
                textView.setTextColor(obtainStyledAttributes.getColorStateList(index));
            } else if (index == 0) {
                textView.setTextSize(0, obtainStyledAttributes.getDimensionPixelSize(index, 0));
            } else if (index == 7) {
                paddingLeft = obtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == 9) {
                paddingRight = obtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == 8) {
                paddingTop = obtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == 10) {
                paddingBottom = obtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == 12) {
                textView.setSingleLine(obtainStyledAttributes.getBoolean(index, false));
            } else if (index == 4) {
                int i3 = obtainStyledAttributes.getInt(index, 3);
                if (i3 == 1) {
                    truncateAt = TextUtils.TruncateAt.START;
                } else if (i3 == 2) {
                    truncateAt = TextUtils.TruncateAt.MIDDLE;
                } else if (i3 == 3) {
                    truncateAt = TextUtils.TruncateAt.END;
                } else if (i3 == 4) {
                    truncateAt = TextUtils.TruncateAt.MARQUEE;
                }
                textView.setEllipsize(truncateAt);
            } else if (index == 11) {
                textView.setMaxLines(obtainStyledAttributes.getInt(index, -1));
            } else if (index == 6) {
                C9148i.m2628b(textView, obtainStyledAttributes.getDrawable(index));
            } else if (index == 14) {
                textView.setLineSpacing(obtainStyledAttributes.getDimensionPixelSize(index, 0), 1.0f);
            } else if (index == 13) {
                textView.setCompoundDrawablePadding(obtainStyledAttributes.getDimensionPixelSize(index, 0));
            } else if (index == 3) {
                textView.setHintTextColor(obtainStyledAttributes.getColor(index, 0));
            } else if (index == 1) {
                textView.setTypeface(null, obtainStyledAttributes.getInt(index, -1));
            }
        }
        textView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public static int m2639b(int i, Resources.Theme theme) {
        if (f17580a == null) {
            f17580a = new TypedValue();
        }
        if (theme.resolveAttribute(i, f17580a, true)) {
            TypedValue typedValue = f17580a;
            int i2 = typedValue.type;
            int i3 = typedValue.data;
            return i2 == 2 ? m2639b(i3, theme) : i3;
        }
        return 0;
    }

    /* renamed from: c */
    public static int m2638c(Context context, int i) {
        return m2639b(i, context.getTheme());
    }

    @Nullable
    /* renamed from: d */
    public static ColorStateList m2637d(int i, Context context, Resources.Theme theme) {
        if (i == 0) {
            return null;
        }
        if (f17580a == null) {
            f17580a = new TypedValue();
        }
        if (theme.resolveAttribute(i, f17580a, true)) {
            TypedValue typedValue = f17580a;
            int i2 = typedValue.type;
            if (i2 < 28 || i2 > 31) {
                if (i2 == 2) {
                    return m2637d(typedValue.data, context, theme);
                }
                int i3 = typedValue.resourceId;
                if (i3 == 0) {
                    return null;
                }
                return ContextCompat.m12039b(context, i3);
            }
            return ColorStateList.valueOf(typedValue.data);
        }
        return null;
    }

    /* renamed from: e */
    public static int m2636e(Context context, int i) {
        if (f17580a == null) {
            f17580a = new TypedValue();
        }
        if (!context.getTheme().resolveAttribute(i, f17580a, true)) {
            return 0;
        }
        int i2 = f17580a.data;
        int i3 = C9141b.f17577a;
        return TypedValue.complexToDimensionPixelSize(i2, context.getResources().getDisplayMetrics());
    }

    @Nullable
    /* renamed from: f */
    public static Drawable m2635f(int i, Context context, Resources.Theme theme) {
        if (i == 0) {
            return null;
        }
        if (f17580a == null) {
            f17580a = new TypedValue();
        }
        if (!theme.resolveAttribute(i, f17580a, true)) {
            return null;
        }
        TypedValue typedValue = f17580a;
        int i2 = typedValue.type;
        if (i2 >= 28 && i2 <= 31) {
            return new ColorDrawable(f17580a.data);
        }
        if (i2 == 2) {
            return m2635f(typedValue.data, context, theme);
        }
        int i3 = typedValue.resourceId;
        if (i3 == 0) {
            return null;
        }
        int i4 = C9142c.f17578a;
        try {
            return C0158a.m12920a(context, i3);
        } catch (Exception e) {
            context.getResources().getResourceName(i3);
            e.getMessage();
            return null;
        }
    }

    @Nullable
    /* renamed from: g */
    public static Drawable m2634g(Context context, int i) {
        return m2635f(i, context, context.getTheme());
    }

    /* renamed from: h */
    public static float m2633h(int i, Resources.Theme theme) {
        if (f17580a == null) {
            f17580a = new TypedValue();
        }
        if (theme.resolveAttribute(i, f17580a, true)) {
            return f17580a.getFloat();
        }
        return 0.0f;
    }
}

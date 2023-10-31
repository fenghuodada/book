package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0157c;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.C0689a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* renamed from: androidx.appcompat.widget.s1 */
/* loaded from: classes.dex */
public final class C0413s1 {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f1378a = new ThreadLocal<>();

    /* renamed from: b */
    public static final int[] f1379b = {-16842910};

    /* renamed from: c */
    public static final int[] f1380c = {16842908};

    /* renamed from: d */
    public static final int[] f1381d = {16842919};

    /* renamed from: e */
    public static final int[] f1382e = {16842912};

    /* renamed from: f */
    public static final int[] f1383f = new int[0];

    /* renamed from: g */
    public static final int[] f1384g = new int[1];

    /* renamed from: a */
    public static void m12501a(@NonNull View view, @NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C0157c.f419j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static int m12500b(@NonNull Context context, int i) {
        ColorStateList m12498d = m12498d(context, i);
        if (m12498d != null && m12498d.isStateful()) {
            return m12498d.getColorForState(f1379b, m12498d.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f1378a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int m12499c = m12499c(context, i);
        return C0689a.m11970c(m12499c, Math.round(Color.alpha(m12499c) * f));
    }

    /* renamed from: c */
    public static int m12499c(@NonNull Context context, int i) {
        int[] iArr = f1384g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Nullable
    /* renamed from: d */
    public static ColorStateList m12498d(@NonNull Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f1384g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = ContextCompat.m12039b(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}

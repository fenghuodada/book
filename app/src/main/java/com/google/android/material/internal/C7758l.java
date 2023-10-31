package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.core.content.C0663f;
import com.ambrose.overwall.R;
import com.google.android.material.C7621c;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.l */
/* loaded from: classes3.dex */
public final class C7758l {

    /* renamed from: a */
    public static final int[] f15120a = {R.attr.colorPrimary};

    /* renamed from: b */
    public static final int[] f15121b = {R.attr.colorPrimaryVariant};

    /* renamed from: a */
    public static void m4511a(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7621c.f14580B, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m4509c(context, f15121b, "Theme.MaterialComponents");
            }
        }
        m4509c(context, f15120a, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r0.getResourceId(0, -1) != (-1)) goto L15;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m4510b(@androidx.annotation.NonNull android.content.Context r4, android.util.AttributeSet r5, @androidx.annotation.NonNull @androidx.annotation.StyleableRes int[] r6, @androidx.annotation.AttrRes int r7, @androidx.annotation.StyleRes int r8, @androidx.annotation.Nullable @androidx.annotation.StyleableRes int... r9) {
        /*
            int[] r0 = com.google.android.material.C7621c.f14580B
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r7, r8)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            int r1 = r9.length
            r3 = -1
            if (r1 != 0) goto L1d
            int r4 = r0.getResourceId(r2, r3)
            if (r4 == r3) goto L38
            goto L37
        L1d:
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r6, r7, r8)
            int r5 = r9.length
            r6 = r2
        L23:
            if (r6 >= r5) goto L34
            r7 = r9[r6]
            int r7 = r4.getResourceId(r7, r3)
            if (r7 != r3) goto L31
            r4.recycle()
            goto L38
        L31:
            int r6 = r6 + 1
            goto L23
        L34:
            r4.recycle()
        L37:
            r2 = 1
        L38:
            r0.recycle()
            if (r2 == 0) goto L3e
            return
        L3e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.C7758l.m4510b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    /* renamed from: c */
    public static void m4509c(@NonNull Context context, @NonNull int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < iArr.length) {
                if (!obtainStyledAttributes.hasValue(i)) {
                    obtainStyledAttributes.recycle();
                    break;
                }
                i++;
            } else {
                obtainStyledAttributes.recycle();
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C0663f.m12005a("The style on this component requires your app theme to be ", str, " (or a descendant)."));
    }

    @NonNull
    /* renamed from: d */
    public static TypedArray m4508d(@NonNull Context context, AttributeSet attributeSet, @NonNull @StyleableRes int[] iArr, @AttrRes int i, @StyleRes int i2, @StyleableRes int... iArr2) {
        m4511a(context, attributeSet, i, i2);
        m4510b(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }
}

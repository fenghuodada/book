package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.C0510h;

/* loaded from: classes.dex */
public final class zaaa extends Button {
    public zaaa(Context context, @Nullable AttributeSet attributeSet) {
        super(context, null, 16842824);
    }

    private static final int zab(int i, int i2, int i3, int i4) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return i4;
                }
                throw new IllegalStateException(C0510h.m12340a(33, "Unknown color scheme: ", i));
            }
            return i3;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zaa(android.content.res.Resources r7, int r8, int r9) {
        /*
            r6 = this;
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r6.setTypeface(r0)
            r0 = 1096810496(0x41600000, float:14.0)
            r6.setTextSize(r0)
            android.util.DisplayMetrics r0 = r7.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1111490560(0x42400000, float:48.0)
            float r0 = r0 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.setMinHeight(r0)
            r6.setMinWidth(r0)
            int r0 = com.google.android.gms.base.C7520R.C7522drawable.common_google_signin_btn_icon_dark
            int r1 = com.google.android.gms.base.C7520R.C7522drawable.common_google_signin_btn_icon_light
            int r0 = zab(r9, r0, r1, r1)
            int r1 = com.google.android.gms.base.C7520R.C7522drawable.common_google_signin_btn_text_dark
            int r2 = com.google.android.gms.base.C7520R.C7522drawable.common_google_signin_btn_text_light
            int r1 = zab(r9, r1, r2, r2)
            java.lang.String r2 = "Unknown button size: "
            r3 = 32
            r4 = 2
            r5 = 1
            if (r8 == 0) goto L44
            if (r8 == r5) goto L44
            if (r8 != r4) goto L3a
            goto L45
        L3a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = androidx.constraintlayout.core.C0510h.m12340a(r3, r2, r8)
            r7.<init>(r8)
            throw r7
        L44:
            r0 = r1
        L45:
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            int r1 = com.google.android.gms.base.C7520R.C7521color.common_google_signin_btn_tint
            android.content.res.ColorStateList r1 = r7.getColorStateList(r1)
            androidx.core.graphics.drawable.C0700a.C0702b.m11924h(r0, r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            androidx.core.graphics.drawable.C0700a.C0702b.m11923i(r0, r1)
            r6.setBackgroundDrawable(r0)
            int r0 = com.google.android.gms.base.C7520R.C7521color.common_google_signin_btn_text_dark
            int r1 = com.google.android.gms.base.C7520R.C7521color.common_google_signin_btn_text_light
            int r9 = zab(r9, r0, r1, r1)
            android.content.res.ColorStateList r9 = r7.getColorStateList(r9)
            java.lang.Object r9 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            android.content.res.ColorStateList r9 = (android.content.res.ColorStateList) r9
            r6.setTextColor(r9)
            r9 = 0
            if (r8 == 0) goto L87
            if (r8 == r5) goto L84
            if (r8 != r4) goto L7a
            r6.setText(r9)
            goto L90
        L7a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = androidx.constraintlayout.core.C0510h.m12340a(r3, r2, r8)
            r7.<init>(r8)
            throw r7
        L84:
            int r8 = com.google.android.gms.base.C7520R.string.common_signin_button_text_long
            goto L89
        L87:
            int r8 = com.google.android.gms.base.C7520R.string.common_signin_button_text
        L89:
            java.lang.String r7 = r7.getString(r8)
            r6.setText(r7)
        L90:
            r6.setTransformationMethod(r9)
            android.content.Context r7 = r6.getContext()
            boolean r7 = com.google.android.gms.common.util.DeviceProperties.isWearable(r7)
            if (r7 == 0) goto La2
            r7 = 19
            r6.setGravity(r7)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zaaa.zaa(android.content.res.Resources, int, int):void");
    }
}

package com.google.android.material;

import androidx.appcompat.view.menu.C0235r;
import com.ambrose.overwall.R;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.google.android.material.b */
/* loaded from: classes3.dex */
public final class C7582b {

    /* renamed from: a */
    public static final int[] f14377a = {R.attr.autoSafeArea, R.attr.baseFocusable, R.attr.interceptBack};

    /* renamed from: b */
    public static final int[] f14378b = {R.attr.interceptTouch, R.attr.lockWidth, R.attr.maxLayoutHeight, R.attr.maxLayoutWidth, R.attr.minLayoutHeight, R.attr.minLayoutWidth};

    /* renamed from: a */
    public static SimpleDateFormat m4771a(int i, int i2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        str = "M/d/yy";
                    } else {
                        throw new IllegalArgumentException(C0235r.m12816a("Unknown DateFormat style: ", i));
                    }
                } else {
                    str = "MMM d, yyyy";
                }
            } else {
                str = "MMMM d, yyyy";
            }
        } else {
            str = "EEEE, MMMM d, yyyy";
        }
        sb.append(str);
        sb.append(" ");
        if (i2 != 0 && i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    str2 = "h:mm a";
                } else {
                    throw new IllegalArgumentException(C0235r.m12816a("Unknown DateFormat style: ", i2));
                }
            } else {
                str2 = "h:mm:ss a";
            }
        } else {
            str2 = "h:mm:ss a z";
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }
}

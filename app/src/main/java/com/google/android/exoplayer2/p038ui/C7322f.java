package com.google.android.exoplayer2.p038ui;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.impl.adview.activity.p010b.C2745h;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.ui.f */
/* loaded from: classes.dex */
public final class C7322f {
    /* renamed from: a */
    public static String m5212a(String str) {
        StringBuilder m9043a = C2745h.m9043a(C0552c.m12193a(str, C0552c.m12193a(str, 5)), ".", str, ",.", str);
        m9043a.append(" *");
        return m9043a.toString();
    }

    /* renamed from: b */
    public static String m5211b(@ColorInt int i) {
        return C7408g0.m5096j("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(Color.alpha(i) / 255.0d));
    }
}

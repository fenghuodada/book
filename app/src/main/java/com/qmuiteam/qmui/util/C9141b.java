package com.qmuiteam.qmui.util;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: com.qmuiteam.qmui.util.b */
/* loaded from: classes3.dex */
public final class C9141b {

    /* renamed from: a */
    public static final /* synthetic */ int f17577a = 0;

    static {
        float f = Resources.getSystem().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public static int m2646a(Context context, int i) {
        return (int) ((context.getResources().getDisplayMetrics().density * i) + 0.5d);
    }

    /* renamed from: b */
    public static int m2645b(Context context, int i) {
        return (int) ((context.getResources().getDisplayMetrics().scaledDensity * i) + 0.5d);
    }
}

package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.WindowManager;

/* renamed from: com.adcolony.sdk.c2 */
/* loaded from: classes.dex */
public final class C2068c2 {

    /* renamed from: a */
    public static int f5031a;

    /* renamed from: b */
    public static int f5032b;

    /* renamed from: c */
    public static int f5033c;

    /* renamed from: d */
    public static int f5034d;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        return r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
        return r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0137, code lost:
        if (m9679d(r7) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0145, code lost:
        if (r14.isEmpty() == false) goto L93;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x024e A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float m9682a(android.view.View r17, android.graphics.Rect r18, float r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2068c2.m9682a(android.view.View, android.graphics.Rect, float, boolean):float");
    }

    /* renamed from: b */
    public static int m9681b(Context context) {
        int i;
        int i2;
        int i3 = context.getResources().getConfiguration().orientation;
        if (i3 == 2 && (i2 = f5031a) > 0) {
            return i2;
        }
        if (i3 == 1 && (i = f5033c) > 0) {
            return i;
        }
        try {
            Point point = new Point();
            ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getSize(point);
            int i4 = point.y;
            if (i3 == 2) {
                f5031a = i4;
            } else if (i3 == 1) {
                f5033c = i4;
            }
            return i4;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static int m9680c(Context context) {
        int i;
        int i2;
        int i3 = context.getResources().getConfiguration().orientation;
        if (i3 == 2 && (i2 = f5032b) > 0) {
            return i2;
        }
        if (i3 == 1 && (i = f5034d) > 0) {
            return i;
        }
        try {
            Point point = new Point();
            ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getSize(point);
            int i4 = point.x;
            if (i3 == 2) {
                f5032b = i4;
            } else if (i3 == 1) {
                f5034d = i4;
            }
            return i4;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: d */
    public static boolean m9679d(View view) {
        if (view == null) {
            return false;
        }
        return view.getBackground() == null || view.getBackground().getAlpha() == 0;
    }
}

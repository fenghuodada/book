package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;

/* renamed from: com.facebook.ads.redexgen.X.6c */
/* loaded from: assets/audience_network.dex */
public final class C43116c {
    public static String[] A03 = {"COmePc5O6jQNBThxNrU00eLA0sP62Ofb", "1OlTUJms59QGnZv6uedBszpwZ8CEYVJ", "oD0bBsFyrWHU6", "C7a4pm2tyO8SrXv1cdlxK2sPFdgwB5ae", "g8qGNC4JJd68o", "wdv0nL8gPgDp5YXIgWNDO16SJnt", "h7h0bvqqYit4L8HKMEE", "ho5Id5lQMxy9uaRyjuF"};
    public final Context A00;
    public final C43056W A01;
    public final EnumC43346z A02;

    public C43116c(Context context, C43056W c43056w, EnumC43346z enumC43346z) {
        this.A01 = c43056w;
        this.A00 = context;
        this.A02 = enumC43346z;
    }

    public final void A00(MotionEvent motionEvent) {
        int i;
        int i2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Context context = this.A00;
        String packageName = context == null ? "" : context.getPackageName();
        EnumC43346z enumC43346z = this.A02;
        EnumC43346z enumC43346z2 = EnumC43346z.A0G;
        if (A03[7].length() != 16) {
            A03[6] = "q52vtyV4o3lWIqbyVHb";
            C434378 c434378 = enumC43346z == enumC43346z2 ? null : new C434378(packageName);
            float f = 1.0f;
            char c = 1;
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 3:
                case 5:
                case 6:
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    int pointerId2 = Build.VERSION.SDK_INT;
                    if (pointerId2 >= 14) {
                        i = motionEvent.getToolType(actionIndex);
                    } else {
                        i = -1;
                    }
                    this.A01.A02(new C5959Y4(elapsedRealtime, c434378, new C43156g(motionEvent.getActionMasked(), pointerId, i, new float[]{motionEvent.getRawX(), motionEvent.getRawY()}, motionEvent.getSize(actionIndex), Math.min(motionEvent.getPressure(actionIndex), 1.0f), motionEvent.getOrientation(actionIndex))), EnumC43046V.A0E);
                    return;
                case 2:
                case 4:
                    int i3 = 0;
                    while (i3 < motionEvent.getPointerCount()) {
                        int pointerId3 = motionEvent.getPointerId(i3);
                        String[] strArr = A03;
                        if (strArr[2].length() != strArr[4].length()) {
                            break;
                        } else {
                            String[] strArr2 = A03;
                            strArr2[1] = "FtxLtPKiBWyCq8d2bMsvLwchXj4m1FL";
                            strArr2[5] = "2ZHjPJSTqIAuT8ks3iUv9R1XL7D";
                            if (Build.VERSION.SDK_INT >= 14) {
                                i2 = motionEvent.getToolType(i3);
                            } else {
                                i2 = -1;
                            }
                            int actionMasked = motionEvent.getActionMasked();
                            float[] fArr = new float[2];
                            fArr[0] = motionEvent.getRawX();
                            fArr[c] = motionEvent.getRawY();
                            this.A01.A02(new C5959Y4(elapsedRealtime, c434378, new C43156g(actionMasked, pointerId3, i2, fArr, motionEvent.getSize(i3), Math.min(motionEvent.getPressure(i3), f), motionEvent.getOrientation(i3))), EnumC43046V.A0E);
                            i3++;
                            f = 1.0f;
                            c = 1;
                        }
                    }
                    return;
                default:
                    return;
            }
        }
        throw new RuntimeException();
    }
}

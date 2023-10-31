package com.vungle.warren.utility;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.vungle.warren.utility.u */
/* loaded from: classes3.dex */
public final class C10106u {

    /* renamed from: a */
    public static final Handler f20354a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static boolean m1239a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        return mainLooper.isCurrentThread();
    }
}

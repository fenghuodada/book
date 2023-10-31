package com.adcolony.sdk;

import android.app.AlertDialog;

/* renamed from: com.adcolony.sdk.k1 */
/* loaded from: classes.dex */
public final class RunnableC2181k1 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        C2058b3 m9588d = C2201m0.m9588d();
        if (m9588d.f4987e == null) {
            m9588d.f4987e = new C2264q4();
        }
        C2264q4 c2264q4 = m9588d.f4987e;
        AlertDialog alertDialog = c2264q4.f5515b;
        if (alertDialog != null) {
            alertDialog.dismiss();
            c2264q4.f5515b = null;
        }
    }
}

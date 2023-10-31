package com.google.android.gms.internal.ads;

import androidx.appcompat.view.menu.C0235r;

/* loaded from: classes.dex */
public final class zzap {
    public /* synthetic */ zzap(int i, int i2, float f, long j, zzao zzaoVar) {
        boolean z;
        String m12816a = C0235r.m12816a("width must be positive, but is: ", i);
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        zzdy.zze(z, m12816a);
        zzdy.zze(i2 > 0, "height must be positive, but is: " + i2);
    }
}

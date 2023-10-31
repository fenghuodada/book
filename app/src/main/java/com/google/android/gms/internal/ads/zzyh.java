package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzyh extends zzrn {
    public zzyh(Throwable th, @Nullable zzrp zzrpVar, @Nullable Surface surface) {
        super(th, zzrpVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}

package com.google.android.gms.internal.ads;

import androidx.core.provider.C0758e;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzxy extends IOException {
    public zzxy(Throwable th) {
        super(C0758e.m11827a("Unexpected ", th.getClass().getSimpleName(), ": ", th.getMessage()), th);
    }
}

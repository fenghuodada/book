package com.google.android.gms.internal.ads;

import androidx.core.content.C0663f;
import com.google.android.gms.internal.ads.zzfuf;

/* loaded from: classes.dex */
final class zzfwg extends zzfuf.zzi implements Runnable {
    private final Runnable zza;

    public zzfwg(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Error | RuntimeException e) {
            zze(e);
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final String zza() {
        return C0663f.m12005a("task=[", this.zza.toString(), "]");
    }
}

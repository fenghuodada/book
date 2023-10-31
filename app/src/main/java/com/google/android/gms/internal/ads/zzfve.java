package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfve extends zzfuq {
    @CheckForNull
    private zzfvd zza;

    public zzfve(zzfrm zzfrmVar, boolean z, Executor executor, Callable callable) {
        super(zzfrmVar, z, false);
        this.zza = new zzfvc(this, callable, executor);
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final void zzg(int i, @CheckForNull Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zzr() {
        zzfvd zzfvdVar = this.zza;
        if (zzfvdVar != null) {
            zzfvdVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final void zzv() {
        zzfvd zzfvdVar = this.zza;
        if (zzfvdVar != null) {
            zzfvdVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final void zzz(int i) {
        super.zzz(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}

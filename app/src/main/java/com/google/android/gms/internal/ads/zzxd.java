package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class zzxd {
    @Nullable
    private zzxc zza;
    @Nullable
    private zzxl zzb;

    @CallSuper
    public void zzh() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzi(zzk zzkVar) {
        throw null;
    }

    public boolean zzl() {
        throw null;
    }

    public abstract zzxe zzn(zzlf[] zzlfVarArr, zzvk zzvkVar, zztl zztlVar, zzcx zzcxVar) throws zzia;

    public abstract void zzo(@Nullable Object obj);

    public final zzxl zzp() {
        zzxl zzxlVar = this.zzb;
        zzdy.zzb(zzxlVar);
        return zzxlVar;
    }

    @CallSuper
    public final void zzq(zzxc zzxcVar, zzxl zzxlVar) {
        this.zza = zzxcVar;
        this.zzb = zzxlVar;
    }

    public final void zzr() {
        zzxc zzxcVar = this.zza;
        if (zzxcVar != null) {
            zzxcVar.zzj();
        }
    }
}

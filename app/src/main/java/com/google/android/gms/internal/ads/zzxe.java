package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzxe {
    public final int zza;
    public final zzlg[] zzb;
    public final zzwx[] zzc;
    public final zzdi zzd;
    @Nullable
    public final Object zze;

    public zzxe(zzlg[] zzlgVarArr, zzwx[] zzwxVarArr, zzdi zzdiVar, @Nullable Object obj) {
        this.zzb = zzlgVarArr;
        this.zzc = (zzwx[]) zzwxVarArr.clone();
        this.zzd = zzdiVar;
        this.zze = obj;
        this.zza = zzlgVarArr.length;
    }

    public final boolean zza(@Nullable zzxe zzxeVar, int i) {
        return zzxeVar != null && zzfn.zzB(this.zzb[i], zzxeVar.zzb[i]) && zzfn.zzB(this.zzc[i], zzxeVar.zzc[i]);
    }

    public final boolean zzb(int i) {
        return this.zzb[i] != null;
    }
}

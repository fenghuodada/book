package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class zzbwo implements zzfvn {
    final /* synthetic */ zzfwb zza;

    public zzbwo(zzbwp zzbwpVar, zzfwb zzfwbVar) {
        this.zza = zzfwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        List list;
        list = zzbwp.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        Void r2 = (Void) obj;
        list = zzbwp.zzc;
        list.remove(this.zza);
    }
}

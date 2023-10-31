package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzful extends zzfun {
    public zzful(zzfwb zzfwbVar, zzfuy zzfuyVar) {
        super(zzfwbVar, zzfuyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfun
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzfuy zzfuyVar = (zzfuy) obj;
        zzfwb zza = zzfuyVar.zza(obj2);
        zzfoz.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfuyVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfun
    public final /* synthetic */ void zzg(Object obj) {
        zzt((zzfwb) obj);
    }
}

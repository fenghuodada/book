package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfub extends zzfud {
    public zzfub(zzfwb zzfwbVar, Class cls, zzfuy zzfuyVar) {
        super(zzfwbVar, cls, zzfuyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfud
    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        zzfuy zzfuyVar = (zzfuy) obj;
        zzfwb zza = zzfuyVar.zza(th);
        zzfoz.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfuyVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfud
    public final /* synthetic */ void zzg(Object obj) {
        zzt((zzfwb) obj);
    }
}

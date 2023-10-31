package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfmc extends zzfuf {
    Object zza;

    public zzfmc(Object obj) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final String zza() {
        Object obj = this.zza;
        return obj == null ? "" : obj.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zzb() {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final boolean zzd(Object obj) {
        return super.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final boolean zze(Throwable th) {
        return super.zze(th);
    }
}

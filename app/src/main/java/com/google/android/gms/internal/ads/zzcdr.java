package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcdr extends zzcdn {
    public zzcdr(zzccc zzcccVar) {
        super(zzcccVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final boolean zzt(String str) {
        String zze = zzbzm.zze(str);
        zzccc zzcccVar = (zzccc) this.zzc.get();
        if (zzcccVar != null && zze != null) {
            zzcccVar.zzt(zze, this);
        }
        zzbzt.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, zze, "noop", "Noop cache is a noop.");
        return false;
    }
}

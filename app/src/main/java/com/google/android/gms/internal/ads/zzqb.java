package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzqb implements zzow {
    final /* synthetic */ zzqc zza;

    public /* synthetic */ zzqb(zzqc zzqcVar, zzqa zzqaVar) {
        this.zza = zzqcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzow
    public final void zza(Exception exc) {
        zzer.zzc("MediaCodecAudioRenderer", "Audio sink error", exc);
        zzqc.zzW(this.zza).zzb(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzow
    public final void zzb() {
        zzqc zzqcVar = this.zza;
        if (zzqc.zzV(zzqcVar) != null) {
            zzqc.zzV(zzqcVar).zzb();
        }
    }
}

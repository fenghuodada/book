package com.google.android.gms.internal.ads;

import androidx.collection.C0470b;

/* loaded from: classes.dex */
public final class zzdiz implements zzcwc {
    private final zzdhc zza;
    private final zzdhh zzb;

    public zzdiz(zzdhc zzdhcVar, zzdhh zzdhhVar) {
        this.zza = zzdhcVar;
        this.zzb = zzdhhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final void zzl() {
        zzdhc zzdhcVar = this.zza;
        if (zzdhcVar.zzt() == null) {
            return;
        }
        zzcfb zzq = zzdhcVar.zzq();
        zzcfb zzr = zzdhcVar.zzr();
        if (zzq == null) {
            zzq = zzr == null ? null : zzr;
        }
        if (!this.zzb.zzd() || zzq == null) {
            return;
        }
        zzq.zzd("onSdkImpression", new C0470b());
    }
}

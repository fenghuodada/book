package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzdpx;
import com.google.android.gms.internal.ads.zzdqh;
import com.google.android.gms.internal.ads.zzfvn;

/* loaded from: classes.dex */
final class zzz implements zzfvn {
    final /* synthetic */ zzaa zza;

    public zzz(zzaa zzaaVar) {
        this.zza = zzaaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        zzdqh zzdqhVar;
        zzdpx zzdpxVar;
        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzaa zzaaVar = this.zza;
        zzdqhVar = zzaaVar.zzr;
        zzdpxVar = zzaaVar.zzj;
        zzf.zzc(zzdqhVar, zzdpxVar, "sgf", new Pair("sgf_reason", th.getMessage()));
        zzbzt.zzh("Failed to initialize webview for loading SDKCore. ", th);
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* synthetic */ void zzb(@Nullable Object obj) {
        zzam zzamVar = (zzam) obj;
        zzbzt.zze("Initialized webview successfully for SDKCore.");
    }
}

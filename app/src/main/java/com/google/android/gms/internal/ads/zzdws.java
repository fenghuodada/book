package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class zzdws {
    private final zzfwc zza;
    private final zzfwc zzb;
    private final zzdxn zzc;
    private final zzgvi zzd;

    public zzdws(zzfwc zzfwcVar, zzfwc zzfwcVar2, zzdxn zzdxnVar, zzgvi zzgviVar) {
        this.zza = zzfwcVar;
        this.zzb = zzfwcVar2;
        this.zzc = zzdxnVar;
        this.zzd = zzgviVar;
    }

    public final /* synthetic */ zzfwb zza(zzbto zzbtoVar) throws Exception {
        return this.zzc.zza(zzbtoVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjS)).longValue());
    }

    public final /* synthetic */ zzfwb zzb(zzbto zzbtoVar, int i, zzdwc zzdwcVar) throws Exception {
        return ((zzdyt) this.zzd.zzb()).zzb(zzbtoVar, i);
    }

    public final zzfwb zzc(final zzbto zzbtoVar) {
        String str = zzbtoVar.zzf;
        com.google.android.gms.ads.internal.zzt.zzp();
        zzfwb zzg = com.google.android.gms.ads.internal.util.zzs.zzy(str) ? zzfvr.zzg(new zzdwc(1, "Ads service proxy force local")) : zzfvr.zzf(zzfvr.zzk(new zzfux() { // from class: com.google.android.gms.internal.ads.zzdwp
            @Override // com.google.android.gms.internal.ads.zzfux
            public final zzfwb zza() {
                return zzdws.this.zza(zzbtoVar);
            }
        }, this.zza), ExecutionException.class, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdwq
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                Throwable th = (ExecutionException) obj;
                if (th.getCause() != null) {
                    th = th.getCause();
                }
                return zzfvr.zzg(th);
            }
        }, this.zzb);
        final int callingUid = Binder.getCallingUid();
        return zzfvr.zzf(zzg, zzdwc.class, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdwr
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzdws.this.zzb(zzbtoVar, callingUid, (zzdwc) obj);
            }
        }, this.zzb);
    }
}

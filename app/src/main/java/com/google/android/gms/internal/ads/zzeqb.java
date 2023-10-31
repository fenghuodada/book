package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeqb implements zzeqq {
    private final zzbxy zza;
    private final zzfwc zzb;
    private final Context zzc;

    public zzeqb(zzbxy zzbxyVar, zzfwc zzfwcVar, Context context) {
        this.zza = zzbxyVar;
        this.zzb = zzfwcVar;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqb.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeqc zzc() throws Exception {
        if (this.zza.zzu(this.zzc)) {
            String zze = this.zza.zze(this.zzc);
            String str = zze == null ? "" : zze;
            String zzc = this.zza.zzc(this.zzc);
            String str2 = zzc == null ? "" : zzc;
            String zza = this.zza.zza(this.zzc);
            String str3 = zza == null ? "" : zza;
            String zzb = this.zza.zzb(this.zzc);
            return new zzeqc(str, str2, str3, zzb == null ? "" : zzb, "TIME_OUT".equals(str2) ? (Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzag) : null);
        }
        return new zzeqc(null, null, null, null, null);
    }
}

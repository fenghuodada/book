package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeng implements zzeqq {
    private final Context zza;
    private final zzfwc zzb;

    public zzeng(Context context, zzfwc zzfwcVar) {
        this.zza = context;
        this.zzb = zzfwcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 19;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String zzj;
                String zzk;
                String str;
                com.google.android.gms.ads.internal.zzt.zzp();
                zzaux zzg = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzg();
                Bundle bundle = null;
                if (zzg != null && (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzM() || !com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN())) {
                    if (zzg.zzh()) {
                        zzg.zzg();
                    }
                    zzaun zza = zzg.zza();
                    if (zza != null) {
                        zzj = zza.zzd();
                        str = zza.zze();
                        zzk = zza.zzf();
                        if (zzj != null) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzw(zzj);
                        }
                        if (zzk != null) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzy(zzk);
                        }
                    } else {
                        zzj = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzj();
                        zzk = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzk();
                        str = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN()) {
                        bundle2.putString("v_fp_vertical", (zzk == null || TextUtils.isEmpty(zzk)) ? "no_hash" : "no_hash");
                    }
                    if (zzj != null && !com.google.android.gms.ads.internal.zzt.zzo().zzh().zzM()) {
                        bundle2.putString("fingerprint", zzj);
                        if (!zzj.equals(str)) {
                            bundle2.putString("v_fp", str);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new zzenh(bundle);
            }
        });
    }
}

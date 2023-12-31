package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.concurrent.futures.C0484a;
import com.adcolony.sdk.C2362x3;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzap {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final zzas zzf;

    public zzap(zzgd zzgdVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzas zzasVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j;
        this.zze = j2;
        if (j2 != 0 && j2 > j) {
            zzgdVar.zzaA().zzk().zzb("Event created with reverse previous/current timestamps. appId", zzet.zzn(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzasVar = new zzas(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzgdVar.zzaA().zzd().zza("Param name can't be null");
                } else {
                    Object zzA = zzgdVar.zzv().zzA(next, bundle2.get(next));
                    if (zzA == null) {
                        zzgdVar.zzaA().zzk().zzb("Param value can't be null", zzgdVar.zzj().zze(next));
                    } else {
                        zzgdVar.zzv().zzP(bundle2, next, zzA);
                    }
                }
                it.remove();
            }
            zzasVar = new zzas(bundle2);
        }
        this.zzf = zzasVar;
    }

    private zzap(zzgd zzgdVar, String str, String str2, String str3, long j, long j2, zzas zzasVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzasVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j;
        this.zze = j2;
        if (j2 != 0 && j2 > j) {
            zzgdVar.zzaA().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", zzet.zzn(str2), zzet.zzn(str3));
        }
        this.zzf = zzasVar;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return C0484a.m12392a(C2362x3.m9460b("Event{appId='", str, "', name='", str2, "', params="), this.zzf.toString(), "}");
    }

    public final zzap zza(zzgd zzgdVar, long j) {
        return new zzap(zzgdVar, this.zzc, this.zza, this.zzb, this.zzd, j, this.zzf);
    }
}

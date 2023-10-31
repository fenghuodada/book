package com.google.android.gms.measurement.internal;

import android.util.Log;
import androidx.concurrent.futures.C0484a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzeq implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ Object zzd;
    final /* synthetic */ Object zze;
    final /* synthetic */ zzet zzf;

    public zzeq(zzet zzetVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzetVar;
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        long j;
        char c2;
        long j2;
        zzet zzetVar;
        char c3;
        zzfi zzm = this.zzf.zzt.zzm();
        if (zzm.zzy()) {
            zzet zzetVar2 = this.zzf;
            c = zzetVar2.zza;
            if (c == 0) {
                if (zzetVar2.zzt.zzf().zzy()) {
                    zzetVar = this.zzf;
                    zzetVar.zzt.zzay();
                    c3 = 'C';
                } else {
                    zzetVar = this.zzf;
                    zzetVar.zzt.zzay();
                    c3 = 'c';
                }
                zzetVar.zza = c3;
            }
            zzet zzetVar3 = this.zzf;
            j = zzetVar3.zzb;
            if (j < 0) {
                zzetVar3.zzt.zzf().zzh();
                zzetVar3.zzb = 79000L;
            }
            char charAt = "01VDIWEA?".charAt(this.zza);
            zzet zzetVar4 = this.zzf;
            c2 = zzetVar4.zza;
            j2 = zzetVar4.zzb;
            String zzo = zzet.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
            StringBuilder sb = new StringBuilder("2");
            sb.append(charAt);
            sb.append(c2);
            sb.append(j2);
            String m12392a = C0484a.m12392a(sb, ":", zzo);
            if (m12392a.length() > 1024) {
                m12392a = this.zzb.substring(0, 1024);
            }
            zzfg zzfgVar = zzm.zzb;
            if (zzfgVar != null) {
                zzfgVar.zzb(m12392a, 1L);
                return;
            }
            return;
        }
        Log.println(6, this.zzf.zzr(), "Persisted config not initialized. Not logging error/warn");
    }
}

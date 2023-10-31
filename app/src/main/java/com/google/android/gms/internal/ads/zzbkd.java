package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzbkd implements zzalb {
    private volatile zzbjq zza;
    private final Context zzb;

    public zzbkd(Context context) {
        this.zzb = context;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzbkd zzbkdVar) {
        if (zzbkdVar.zza == null) {
            return;
        }
        zzbkdVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.zzalb
    @Nullable
    public final zzale zza(zzali zzaliVar) throws zzalr {
        Parcelable.Creator<zzbjr> creator = zzbjr.CREATOR;
        Map zzl = zzaliVar.zzl();
        int size = zzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : zzl.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzbjr zzbjrVar = new zzbjr(zzaliVar.zzk(), strArr, strArr2);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        try {
            zzcal zzcalVar = new zzcal();
            this.zza = new zzbjq(this.zzb, com.google.android.gms.ads.internal.zzt.zzt().zzb(), new zzbkb(this, zzcalVar), new zzbkc(this, zzcalVar));
            this.zza.checkAvailabilityAndConnect();
            zzbjz zzbjzVar = new zzbjz(this, zzbjrVar);
            zzfwc zzfwcVar = zzcag.zza;
            zzfwb zzn = zzfvr.zzn(zzfvr.zzm(zzcalVar, zzbjzVar, zzfwcVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzei)).intValue(), TimeUnit.MILLISECONDS, zzcag.zzd);
            zzn.zzc(new zzbka(this), zzfwcVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzn.get();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            zzbjt zzbjtVar = (zzbjt) new zzbue(parcelFileDescriptor).zza(zzbjt.CREATOR);
            if (zzbjtVar == null) {
                return null;
            }
            if (zzbjtVar.zza) {
                throw new zzalr(zzbjtVar.zzb);
            }
            if (zzbjtVar.zze.length != zzbjtVar.zzf.length) {
                return null;
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String[] strArr3 = zzbjtVar.zze;
                if (i >= strArr3.length) {
                    return new zzale(zzbjtVar.zzc, zzbjtVar.zzd, hashMap, zzbjtVar.zzg, zzbjtVar.zzh);
                }
                hashMap.put(strArr3[i], zzbjtVar.zzf[i]);
                i++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - elapsedRealtime) + "ms");
            throw th;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcll extends com.google.android.gms.ads.internal.client.zzcn {
    private final Context zza;
    private final zzbzz zzb;
    private final zzdnx zzc;
    private final zzebx zzd;
    private final zzeib zze;
    private final zzdse zzf;
    private final zzbxy zzg;
    private final zzdoc zzh;
    private final zzdsz zzi;
    private final zzbdx zzj;
    private final zzfft zzk;
    private final zzfat zzl;
    private final zzbbl zzm;
    private boolean zzn = false;

    public zzcll(Context context, zzbzz zzbzzVar, zzdnx zzdnxVar, zzebx zzebxVar, zzeib zzeibVar, zzdse zzdseVar, zzbxy zzbxyVar, zzdoc zzdocVar, zzdsz zzdszVar, zzbdx zzbdxVar, zzfft zzfftVar, zzfat zzfatVar, zzbbl zzbblVar) {
        this.zza = context;
        this.zzb = zzbzzVar;
        this.zzc = zzdnxVar;
        this.zzd = zzebxVar;
        this.zze = zzeibVar;
        this.zzf = zzdseVar;
        this.zzg = zzbxyVar;
        this.zzh = zzdocVar;
        this.zzi = zzdszVar;
        this.zzj = zzbdxVar;
        this.zzk = zzfftVar;
        this.zzl = zzfatVar;
        this.zzm = zzbblVar;
    }

    @VisibleForTesting
    public final void zzb() {
        if (com.google.android.gms.ads.internal.zzt.zzo().zzh().zzO()) {
            if (com.google.android.gms.ads.internal.zzt.zzs().zzj(this.zza, com.google.android.gms.ads.internal.zzt.zzo().zzh().zzl(), this.zzb.zza)) {
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzB(false);
            com.google.android.gms.ads.internal.zzt.zzo().zzh().zzA("");
        }
    }

    @VisibleForTesting
    public final void zzc(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map zze = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zze();
        if (zze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzbzt.zzk("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzd()) {
            HashMap hashMap = new HashMap();
            for (zzbnt zzbntVar : zze.values()) {
                for (zzbns zzbnsVar : zzbntVar.zza) {
                    String str = zzbnsVar.zzk;
                    for (String str2 : zzbnsVar.zzc) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzeby zza = this.zzd.zza(str3, jSONObject);
                    if (zza != null) {
                        zzfav zzfavVar = (zzfav) zza.zzb;
                        if (!zzfavVar.zzC() && zzfavVar.zzB()) {
                            zzfavVar.zzj(this.zza, (zzeds) zza.zzc, (List) entry.getValue());
                            zzbzt.zze("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzfaf e) {
                    zzbzt.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e);
                }
            }
        }
    }

    public final /* synthetic */ void zzd() {
        zzfbd.zzb(this.zza, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized float zze() {
        return com.google.android.gms.ads.internal.zzt.zzr().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return this.zzb.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
        this.zze.zzf(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
        this.zzf.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z) throws RemoteException {
        try {
            zzfma.zzi(this.zza).zzn(z);
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzk() {
        if (this.zzn) {
            zzbzt.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbbk.zza(this.zza);
        this.zzm.zza();
        com.google.android.gms.ads.internal.zzt.zzo().zzs(this.zza, this.zzb);
        com.google.android.gms.ads.internal.zzt.zzc().zzi(this.zza);
        this.zzn = true;
        this.zzf.zzr();
        this.zze.zzd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdI)).booleanValue()) {
            this.zzh.zzc();
        }
        this.zzi.zzg();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziG)).booleanValue()) {
            zzcag.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclh
                @Override // java.lang.Runnable
                public final void run() {
                    zzcll.this.zzb();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzju)).booleanValue()) {
            zzcag.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclg
                @Override // java.lang.Runnable
                public final void run() {
                    zzcll.this.zzw();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcy)).booleanValue()) {
            zzcag.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcli
                @Override // java.lang.Runnable
                public final void run() {
                    zzcll.this.zzd();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(@Nullable String str, IObjectWrapper iObjectWrapper) {
        String str2;
        Runnable runnable;
        zzbbk.zza(this.zza);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdM)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            str2 = com.google.android.gms.ads.internal.util.zzs.zzn(this.zza);
        } else {
            str2 = "";
        }
        boolean z = true;
        String str3 = true == TextUtils.isEmpty(str2) ? str : str2;
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdH)).booleanValue();
        zzbbc zzbbcVar = zzbbk.zzaN;
        boolean booleanValue2 = booleanValue | ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbcVar)).booleanValue();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbcVar)).booleanValue()) {
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzclj
                @Override // java.lang.Runnable
                public final void run() {
                    final zzcll zzcllVar = zzcll.this;
                    final Runnable runnable3 = runnable2;
                    zzcag.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclk
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcll.this.zzc(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z = booleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z) {
            com.google.android.gms.ads.internal.zzt.zza().zza(this.zza, this.zzb, str3, runnable3, this.zzk);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(com.google.android.gms.ads.internal.client.zzda zzdaVar) throws RemoteException {
        this.zzi.zzh(zzdaVar, zzdsy.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzbzt.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            zzbzt.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzas zzasVar = new com.google.android.gms.ads.internal.util.zzas(context);
        zzasVar.zzn(str);
        zzasVar.zzo(this.zzb.zza);
        zzasVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbny zzbnyVar) throws RemoteException {
        this.zzl.zze(zzbnyVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzp(boolean z) {
        com.google.android.gms.ads.internal.zzt.zzr().zzc(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzq(float f) {
        com.google.android.gms.ads.internal.zzt.zzr().zzd(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzr(String str) {
        zzbbk.zza(this.zza);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdH)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zza().zza(this.zza, this.zzb, str, null, this.zzk);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzbkl zzbklVar) throws RemoteException {
        this.zzf.zzs(zzbklVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziP)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(com.google.android.gms.ads.internal.client.zzff zzffVar) throws RemoteException {
        this.zzg.zzq(this.zza, zzffVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized boolean zzv() {
        return com.google.android.gms.ads.internal.zzt.zzr().zze();
    }

    public final /* synthetic */ void zzw() {
        this.zzj.zza(new zzbtd());
    }
}

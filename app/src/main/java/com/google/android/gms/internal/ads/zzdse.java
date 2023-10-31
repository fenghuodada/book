package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p060j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zzdse {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdnx zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdql zzl;
    private final zzbzz zzm;
    private final zzdbz zzo;
    private final zzfft zzp;
    private boolean zza = false;
    private boolean zzb = false;
    @GuardedBy("this")
    private boolean zzc = false;
    private final zzcal zze = new zzcal();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();

    public zzdse(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdnx zzdnxVar, ScheduledExecutorService scheduledExecutorService, zzdql zzdqlVar, zzbzz zzbzzVar, zzdbz zzdbzVar, zzfft zzfftVar) {
        this.zzh = zzdnxVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdqlVar;
        this.zzm = zzbzzVar;
        this.zzo = zzdbzVar;
        this.zzp = zzfftVar;
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public static /* bridge */ /* synthetic */ void zzj(final zzdse zzdseVar, String str) {
        int i = 5;
        final zzfff zza = zzffe.zza(zzdseVar.zzf, 5);
        zza.zzh();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final zzfff zza2 = zzffe.zza(zzdseVar.zzf, i);
                zza2.zzh();
                zza2.zzd(next);
                final Object obj = new Object();
                final zzcal zzcalVar = new zzcal();
                zzfwb zzn = zzfvr.zzn(zzcalVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbH)).longValue(), TimeUnit.SECONDS, zzdseVar.zzk);
                zzdseVar.zzl.zzc(next);
                zzdseVar.zzo.zzc(next);
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
                zzn.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdse.this.zzq(obj, zzcalVar, next, elapsedRealtime, zza2);
                    }
                }, zzdseVar.zzi);
                arrayList.add(zzn);
                final zzdsd zzdsdVar = new zzdsd(zzdseVar, obj, next, elapsedRealtime, zza2, zzcalVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzbko(optString, bundle));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdseVar.zzv(next, false, "", 0);
                try {
                    try {
                        final zzfav zzc = zzdseVar.zzh.zzc(next, new JSONObject());
                        zzdseVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrz
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdse.this.zzn(zzc, zzdsdVar, arrayList2, next);
                            }
                        });
                    } catch (zzfaf unused2) {
                        zzdsdVar.zze("Failed to create Adapter.");
                    }
                } catch (RemoteException e) {
                    zzbzt.zzh("", e);
                }
                i = 5;
            }
            zzfvr.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdrw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzdse.this.zzf(zza);
                    return null;
                }
            }, zzdseVar.zzi);
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e2);
            zzdseVar.zzo.zza("MalformedJson");
            zzdseVar.zzl.zza("MalformedJson");
            zzdseVar.zze.zze(e2);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e2, "AdapterInitializer.updateAdapterStatus");
            zzfft zzfftVar = zzdseVar.zzp;
            zza.zzg(e2);
            zza.zzf(false);
            zzfftVar.zzb(zza.zzl());
        }
    }

    private final synchronized zzfwb zzu() {
        String zzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
        if (!TextUtils.isEmpty(zzc)) {
            return zzfvr.zzh(zzc);
        }
        final zzcal zzcalVar = new zzcal();
        com.google.android.gms.ads.internal.zzt.zzo().zzh().zzq(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsa
            @Override // java.lang.Runnable
            public final void run() {
                zzdse.this.zzo(zzcalVar);
            }
        });
        return zzcalVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzbke(str, z, i, str2));
    }

    public final /* synthetic */ Object zzf(zzfff zzfffVar) throws Exception {
        this.zze.zzd(Boolean.TRUE);
        zzfft zzfftVar = this.zzp;
        zzfffVar.zzf(true);
        zzfftVar.zzb(zzfffVar.zzl());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbke zzbkeVar = (zzbke) this.zzn.get(str);
            arrayList.add(new zzbke(str, zzbkeVar.zzb, zzbkeVar.zzc, zzbkeVar.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    public final /* synthetic */ void zzm() {
        synchronized (this) {
            if (this.zzc) {
                return;
            }
            zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzd));
            this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
            this.zze.zze(new Exception());
        }
    }

    public final /* synthetic */ void zzn(zzfav zzfavVar, zzbki zzbkiVar, List list, String str) {
        try {
            try {
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfavVar.zzi(context, zzbkiVar, list);
            } catch (RemoteException e) {
                zzbzt.zzh("", e);
            }
        } catch (zzfaf unused) {
            zzbkiVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
        }
    }

    public final /* synthetic */ void zzo(final zzcal zzcalVar) {
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrt
            @Override // java.lang.Runnable
            public final void run() {
                zzcal zzcalVar2 = zzcalVar;
                String zzc = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzc();
                if (TextUtils.isEmpty(zzc)) {
                    zzcalVar2.zze(new Exception());
                } else {
                    zzcalVar2.zzd(zzc);
                }
            }
        });
    }

    public final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    public final /* synthetic */ void zzq(Object obj, zzcal zzcalVar, String str, long j, zzfff zzfffVar) {
        synchronized (obj) {
            if (!zzcalVar.isDone()) {
                zzv(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - j));
                this.zzl.zzb(str, "timeout");
                this.zzo.zzb(str, "timeout");
                zzfft zzfftVar = this.zzp;
                zzfffVar.zzc("Timeout");
                zzfffVar.zzf(false);
                zzfftVar.zzb(zzfffVar.zzl());
                zzcalVar.zzd(Boolean.FALSE);
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzbdj.zza.zze()).booleanValue()) {
            if (this.zzm.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbG)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    if (this.zza) {
                        return;
                    }
                    this.zzl.zzf();
                    this.zzo.zzf();
                    this.zze.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdru
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdse.this.zzp();
                        }
                    }, this.zzi);
                    this.zza = true;
                    zzfwb zzu = zzu();
                    this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrx
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdse.this.zzm();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbI)).longValue(), TimeUnit.SECONDS);
                    zzfvr.zzq(zzu, new zzdsc(this), this.zzi);
                    return;
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzd(Boolean.FALSE);
        this.zza = true;
        this.zzb = true;
    }

    public final void zzs(final zzbkl zzbklVar) {
        this.zze.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdry
            @Override // java.lang.Runnable
            public final void run() {
                zzdse zzdseVar = zzdse.this;
                try {
                    zzbklVar.zzb(zzdseVar.zzg());
                } catch (RemoteException e) {
                    zzbzt.zzh("", e);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}

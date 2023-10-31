package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzepq implements zzeqq {
    final String zza;
    private final zzfwc zzb;
    private final ScheduledExecutorService zzc;
    private final zzeib zzd;
    private final Context zze;
    private final zzfaa zzf;
    private final zzehx zzg;
    private final zzdnx zzh;
    private final zzdsg zzi;

    public zzepq(zzfwc zzfwcVar, ScheduledExecutorService scheduledExecutorService, String str, zzeib zzeibVar, Context context, zzfaa zzfaaVar, zzehx zzehxVar, zzdnx zzdnxVar, zzdsg zzdsgVar) {
        this.zzb = zzfwcVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = zzeibVar;
        this.zze = context;
        this.zzf = zzfaaVar;
        this.zzg = zzehxVar;
        this.zzh = zzdnxVar;
        this.zzi = zzdsgVar;
    }

    public static /* synthetic */ zzfwb zzc(zzepq zzepqVar) {
        Map zza = zzepqVar.zzd.zza(zzepqVar.zza, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjs)).booleanValue() ? zzepqVar.zzf.zzf.toLowerCase(Locale.ROOT) : zzepqVar.zzf.zzf);
        final Bundle zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbz)).booleanValue() ? zzepqVar.zzi.zzg() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        Iterator it = ((zzfru) zza).entrySet().iterator();
        while (true) {
            Bundle bundle = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle2 = zzepqVar.zzf.zzd.zzm;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            }
            arrayList.add(zzepqVar.zzf(str, list, bundle, true, true));
        }
        for (Map.Entry entry2 : ((zzfru) zzepqVar.zzd.zzb()).entrySet()) {
            zzeif zzeifVar = (zzeif) entry2.getValue();
            String str2 = zzeifVar.zza;
            Bundle bundle3 = zzepqVar.zzf.zzd.zzm;
            arrayList.add(zzepqVar.zzf(str2, Collections.singletonList(zzeifVar.zzd), bundle3 != null ? bundle3.getBundle(str2) : null, zzeifVar.zzb, zzeifVar.zzc));
        }
        return zzfvr.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzepn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<zzfwb> list2 = arrayList;
                Bundle bundle4 = zzg;
                JSONArray jSONArray = new JSONArray();
                for (zzfwb zzfwbVar : list2) {
                    if (((JSONObject) zzfwbVar.get()) != null) {
                        jSONArray.put(zzfwbVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzepr(jSONArray.toString(), bundle4);
            }
        }, zzepqVar.zzb);
    }

    private final zzfvi zzf(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        zzfvi zzv = zzfvi.zzv(zzfvr.zzk(new zzfux() { // from class: com.google.android.gms.internal.ads.zzepo
            @Override // com.google.android.gms.internal.ads.zzfux
            public final zzfwb zza() {
                return zzepq.this.zzd(str, list, bundle, z, z2);
            }
        }, this.zzb));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbv)).booleanValue()) {
            zzv = (zzfvi) zzfvr.zzn(zzv, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbo)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return (zzfvi) zzfvr.zze(zzv, Throwable.class, new zzfon() { // from class: com.google.android.gms.internal.ads.zzepp
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbzt.zzg("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, this.zzb);
    }

    private final void zzg(zzbpv zzbpvVar, Bundle bundle, List list, zzeie zzeieVar) throws RemoteException {
        zzbpvVar.zzh(ObjectWrapper.wrap(this.zze), this.zza, bundle, (Bundle) list.get(0), this.zzf.zze, zzeieVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return zzfvr.zzk(new zzfux() { // from class: com.google.android.gms.internal.ads.zzepk
            @Override // com.google.android.gms.internal.ads.zzfux
            public final zzfwb zza() {
                return zzepq.zzc(zzepq.this);
            }
        }, this.zzb);
    }

    public final /* synthetic */ zzfwb zzd(String str, final List list, final Bundle bundle, boolean z, boolean z2) throws Exception {
        zzbpv zzbpvVar;
        final zzcal zzcalVar = new zzcal();
        if (z2) {
            this.zzg.zzb(str);
            zzbpvVar = this.zzg.zza(str);
        } else {
            try {
                zzbpvVar = this.zzh.zzb(str);
            } catch (RemoteException e) {
                zzbzt.zzh("Couldn't create RTB adapter : ", e);
                zzbpvVar = null;
            }
        }
        if (zzbpvVar == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbq)).booleanValue()) {
                throw null;
            }
            zzeie.zzb(str, zzcalVar);
        } else {
            final zzeie zzeieVar = new zzeie(str, zzbpvVar, zzcalVar, com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbv)).booleanValue()) {
                this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepl
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeie.this.zzc();
                    }
                }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbo)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbA)).booleanValue()) {
                    final zzbpv zzbpvVar2 = zzbpvVar;
                    this.zzb.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepm
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzepq.this.zze(zzbpvVar2, bundle, list, zzeieVar, zzcalVar);
                        }
                    });
                } else {
                    zzg(zzbpvVar, bundle, list, zzeieVar);
                }
            } else {
                zzeieVar.zzd();
            }
        }
        return zzcalVar;
    }

    public final /* synthetic */ void zze(zzbpv zzbpvVar, Bundle bundle, List list, zzeie zzeieVar, zzcal zzcalVar) {
        try {
            zzg(zzbpvVar, bundle, list, zzeieVar);
        } catch (RemoteException e) {
            zzcalVar.zze(e);
        }
    }
}

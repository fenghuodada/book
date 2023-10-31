package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class zzdsu {
    private final zzdse zza;
    private final zzdnu zzb;
    private final Object zzc = new Object();
    @GuardedBy("lock")
    private final List zzd = new ArrayList();
    @GuardedBy("lock")
    private boolean zze;

    public zzdsu(zzdse zzdseVar, zzdnu zzdnuVar) {
        this.zza = zzdseVar;
        this.zzb = zzdnuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        boolean z;
        zzdnt zza;
        zzdnt zza2;
        zzbqj zzbqjVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbke zzbkeVar = (zzbke) it.next();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziL)).booleanValue() && (zza2 = this.zzb.zza(zzbkeVar.zza)) != null && (zzbqjVar = zza2.zzc) != null) {
                    str = zzbqjVar.toString();
                    String str2 = str;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziM)).booleanValue() && (zza = this.zzb.zza(zzbkeVar.zza)) != null && zza.zzd) {
                        z = true;
                        List list2 = this.zzd;
                        String str3 = zzbkeVar.zza;
                        list2.add(new zzdst(str3, str2, this.zzb.zzc(str3), zzbkeVar.zzb ? 1 : 0, zzbkeVar.zzd, zzbkeVar.zzc, z));
                    }
                    z = false;
                    List list22 = this.zzd;
                    String str32 = zzbkeVar.zza;
                    list22.add(new zzdst(str32, str2, this.zzb.zzc(str32), zzbkeVar.zzb ? 1 : 0, zzbkeVar.zzd, zzbkeVar.zzc, z));
                }
                str = "";
                String str22 = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziM)).booleanValue()) {
                    z = true;
                    List list222 = this.zzd;
                    String str322 = zzbkeVar.zza;
                    list222.add(new zzdst(str322, str22, this.zzb.zzc(str322), zzbkeVar.zzb ? 1 : 0, zzbkeVar.zzd, zzbkeVar.zzc, z));
                }
                z = false;
                List list2222 = this.zzd;
                String str3222 = zzbkeVar.zza;
                list2222.add(new zzdst(str3222, str22, this.zzb.zzc(str3222), zzbkeVar.zzb ? 1 : 0, zzbkeVar.zzd, zzbkeVar.zzc, z));
            }
            this.zze = true;
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (!this.zza.zzt()) {
                    zzc();
                    return jSONArray;
                }
                zzd(this.zza.zzg());
            }
            for (zzdst zzdstVar : this.zzd) {
                jSONArray.put(zzdstVar.zza());
            }
            return jSONArray;
        }
    }

    public final void zzc() {
        this.zza.zzs(new zzdss(this));
    }
}

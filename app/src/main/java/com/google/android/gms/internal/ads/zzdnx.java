package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdnx {
    private final zzfat zza;
    private final zzdnu zzb;

    public zzdnx(zzfat zzfatVar, zzdnu zzdnuVar) {
        this.zza = zzfatVar;
        this.zzb = zzdnuVar;
    }

    @VisibleForTesting
    public final zzbny zza() throws RemoteException {
        zzbny zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        zzbzt.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbpv zzb(String str) throws RemoteException {
        zzbpv zzc = zza().zzc(str);
        this.zzb.zze(str, zzc);
        return zzc;
    }

    public final zzfav zzc(String str, JSONObject jSONObject) throws zzfaf {
        zzbob zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzboy(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzboy(new zzbqn());
            } else {
                zzbny zza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzb = zza.zze(string) ? zza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zza.zzd(string) ? zza.zzb(string) : zza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        zzbzt.zzh("Invalid custom event.", e);
                    }
                }
                zzb = zza.zzb(str);
            }
            zzfav zzfavVar = new zzfav(zzb);
            this.zzb.zzd(str, zzfavVar);
            return zzfavVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziM)).booleanValue()) {
                this.zzb.zzd(str, null);
            }
            throw new zzfaf(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}

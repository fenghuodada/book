package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfik extends zzfig {
    public zzfik(zzfhz zzfhzVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfhzVar, hashSet, jSONObject, j);
    }

    private final void zzc(String str) {
        zzfhd zza = zzfhd.zza();
        if (zza != null) {
            for (zzfgs zzfgsVar : zza.zzc()) {
                if (((zzfig) this).zza.contains(zzfgsVar.zzh())) {
                    zzfgsVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfih, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfih
    public final void zza(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfil extends zzfig {
    public zzfil(zzfhz zzfhzVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfhzVar, hashSet, jSONObject, j);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfht.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfih, android.os.AsyncTask
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzfhd zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfhd.zza()) != null) {
            for (zzfgs zzfgsVar : zza.zzc()) {
                if (((zzfig) this).zza.contains(zzfgsVar.zzh())) {
                    zzfgsVar.zzg().zze(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}

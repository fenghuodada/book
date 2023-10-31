package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbbd {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (zzbbc zzbbcVar : this.zzb) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbcVar);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbbo.zza());
        return arrayList;
    }

    public final List zzb() {
        List zza = zza();
        for (zzbbc zzbbcVar : this.zzc) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbcVar);
            if (!TextUtils.isEmpty(str)) {
                zza.add(str);
            }
        }
        zza.addAll(zzbbo.zzb());
        return zza;
    }

    public final void zzc(zzbbc zzbbcVar) {
        this.zzb.add(zzbbcVar);
    }

    public final void zzd(zzbbc zzbbcVar) {
        this.zza.add(zzbbcVar);
    }

    public final void zze(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzbbc zzbbcVar : this.zza) {
            if (zzbbcVar.zze() == 1) {
                zzbbcVar.zzd(editor, zzbbcVar.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzbzt.zzg("Flag Json is null.");
        }
    }
}

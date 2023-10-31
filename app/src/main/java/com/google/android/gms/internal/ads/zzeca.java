package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import p060j$.util.DesugarCollections;

/* loaded from: classes.dex */
public final class zzeca {
    private final String zzc;
    private zzezi zzd = null;
    private zzezf zze = null;
    private com.google.android.gms.ads.internal.client.zzu zzf = null;
    private final Map zzb = DesugarCollections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzeca(String str) {
        this.zzc = str;
    }

    private final synchronized void zzi(zzezf zzezfVar, int i) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdj)).booleanValue() ? zzezfVar.zzaq : zzezfVar.zzx;
        if (this.zzb.containsKey(str5)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = zzezfVar.zzw.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, zzezfVar.zzw.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgz)).booleanValue()) {
            str = zzezfVar.zzG;
            str2 = zzezfVar.zzH;
            str3 = zzezfVar.zzI;
            str4 = zzezfVar.zzJ;
        } else {
            str = "";
            str2 = "";
            str3 = "";
            str4 = "";
        }
        com.google.android.gms.ads.internal.client.zzu zzuVar = new com.google.android.gms.ads.internal.client.zzu(zzezfVar.zzF, 0L, null, bundle, str, str2, str3, str4);
        try {
            this.zza.add(i, zzuVar);
        } catch (IndexOutOfBoundsException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(str5, zzuVar);
    }

    private final void zzj(zzezf zzezfVar, long j, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar, boolean z) {
        String str = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdj)).booleanValue() ? zzezfVar.zzaq : zzezfVar.zzx;
        if (this.zzb.containsKey(str)) {
            if (this.zze == null) {
                this.zze = zzezfVar;
            }
            com.google.android.gms.ads.internal.client.zzu zzuVar = (com.google.android.gms.ads.internal.client.zzu) this.zzb.get(str);
            zzuVar.zzb = j;
            zzuVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgA)).booleanValue() && z) {
                this.zzf = zzuVar;
            }
        }
    }

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzu zza() {
        return this.zzf;
    }

    public final zzcvb zzb() {
        return new zzcvb(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzezf zzezfVar) {
        zzi(zzezfVar, this.zza.size());
    }

    public final void zze(zzezf zzezfVar, long j, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzj(zzezfVar, j, zzeVar, false);
    }

    public final void zzf(zzezf zzezfVar, long j, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzj(zzezfVar, j, null, true);
    }

    public final synchronized void zzg(String str, List list) {
        if (this.zzb.containsKey(str)) {
            int indexOf = this.zza.indexOf((com.google.android.gms.ads.internal.client.zzu) this.zzb.get(str));
            try {
                this.zza.remove(indexOf);
            } catch (IndexOutOfBoundsException e) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzi((zzezf) it.next(), indexOf);
                indexOf++;
            }
        }
    }

    public final void zzh(zzezi zzeziVar) {
        this.zzd = zzeziVar;
    }
}

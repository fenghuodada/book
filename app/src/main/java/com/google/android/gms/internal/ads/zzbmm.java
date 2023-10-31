package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbmm implements zzbld, zzbml {
    private final zzbml zza;
    private final HashSet zzb = new HashSet();

    public zzbmm(zzbml zzbmlVar) {
        this.zza = zzbmlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbld, com.google.android.gms.internal.ads.zzblo
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbld, com.google.android.gms.internal.ads.zzblo
    public final /* synthetic */ void zzb(String str, String str2) {
        zzblc.zzc(this, str, str2);
    }

    public final void zzc() {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbii) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbii) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final /* synthetic */ void zzd(String str, Map map) {
        zzblc.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbld, com.google.android.gms.internal.ads.zzblb
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzblc.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzblo
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzblc.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final void zzq(String str, zzbii zzbiiVar) {
        this.zza.zzq(str, zzbiiVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbiiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbml
    public final void zzr(String str, zzbii zzbiiVar) {
        this.zza.zzr(str, zzbiiVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbiiVar));
    }
}

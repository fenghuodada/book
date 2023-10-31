package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzdpx;
import com.google.android.gms.internal.ads.zzdqh;
import java.util.ArrayDeque;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p060j$.util.DesugarCollections;
import p060j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zzc {
    private final zzdqh zzh;
    private Map zzi;
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final int zza = ((Integer) zzba.zzc().zzb(zzbbk.zzgJ)).intValue();
    private final long zzb = ((Long) zzba.zzc().zzb(zzbbk.zzgK)).longValue();
    private final boolean zzc = ((Boolean) zzba.zzc().zzb(zzbbk.zzgP)).booleanValue();
    private final boolean zzd = ((Boolean) zzba.zzc().zzb(zzbbk.zzgN)).booleanValue();
    private final Map zze = DesugarCollections.synchronizedMap(new zzb(this));

    public zzc(zzdqh zzdqhVar) {
        this.zzh = zzdqhVar;
    }

    private final synchronized void zzg(final zzdpx zzdpxVar) {
        if (this.zzc) {
            final ArrayDeque clone = this.zzg.clone();
            this.zzg.clear();
            final ArrayDeque clone2 = this.zzf.clone();
            this.zzf.clear();
            zzcag.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
                @Override // java.lang.Runnable
                public final void run() {
                    zzc.this.zze(zzdpxVar, clone, clone2);
                }
            });
        }
    }

    private final void zzh(zzdpx zzdpxVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdpxVar.zza());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzf.zza(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzj(this.zzi, "e_type", (String) pair.first);
                zzj(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zze(this.zzi);
        }
    }

    private final synchronized void zzi() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        try {
            Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void zzj(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    @Nullable
    public final synchronized String zzb(String str, zzdpx zzdpxVar) {
        Pair pair = (Pair) this.zze.get(str);
        zzdpxVar.zza().put("rid", str);
        if (pair == null) {
            zzdpxVar.zza().put("mhit", "false");
            return null;
        }
        String str2 = (String) pair.second;
        this.zze.remove(str);
        zzdpxVar.zza().put("mhit", "true");
        return str2;
    }

    public final synchronized void zzd(String str, String str2, zzdpx zzdpxVar) {
        this.zze.put(str, new Pair(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()), str2));
        zzi();
        zzg(zzdpxVar);
    }

    public final /* synthetic */ void zze(zzdpx zzdpxVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzh(zzdpxVar, arrayDeque, "to");
        zzh(zzdpxVar, arrayDeque2, "of");
    }

    public final synchronized void zzf(String str) {
        this.zze.remove(str);
    }
}

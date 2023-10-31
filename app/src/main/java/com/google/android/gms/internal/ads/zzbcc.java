package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class zzbcc {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbcc(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put(FirebaseAnalytics.Param.AD_FORMAT, str2);
    }

    public static final zzbbz zzf() {
        return new zzbbz(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime(), null, null);
    }

    public final zzbcb zza() {
        zzbcb zzbcbVar;
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbJ)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            for (zzbbz zzbbzVar : this.zza) {
                long zza = zzbbzVar.zza();
                String zzc = zzbbzVar.zzc();
                zzbbz zzb = zzbbzVar.zzb();
                if (zzb != null && zza > 0) {
                    sb.append(zzc);
                    sb.append('.');
                    sb.append(zza - zzb.zza());
                    sb.append(',');
                    if (booleanValue) {
                        if (hashMap.containsKey(Long.valueOf(zzb.zza()))) {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzb.zza()));
                            sb2.append('+');
                            sb2.append(zzc);
                        } else {
                            hashMap.put(Long.valueOf(zzb.zza()), new StringBuilder(zzc));
                        }
                    }
                }
            }
            this.zza.clear();
            String str = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime()));
                    sb3.append(',');
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            zzbcbVar = new zzbcb(sb.toString(), str);
        }
        return zzbcbVar;
    }

    @VisibleForTesting
    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzo().zzf();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(@Nullable zzbcc zzbccVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbbs zzf;
        if (TextUtils.isEmpty(str2) || (zzf = com.google.android.gms.ads.internal.zzt.zzo().zzf()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbby zza = zzf.zza(str);
            Map map = this.zzb;
            map.put(str, zza.zza((String) map.get(str), str2));
        }
    }

    public final boolean zze(zzbbz zzbbzVar, long j, String... strArr) {
        synchronized (this.zzc) {
            for (int i = 0; i <= 0; i++) {
                this.zza.add(new zzbbz(j, strArr[i], zzbbzVar));
            }
        }
        return true;
    }
}

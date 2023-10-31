package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbyd {
    @GuardedBy("this")
    private final Map zza = new HashMap();
    @GuardedBy("this")
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzbxa zzd;

    public zzbyd(Context context, zzbxa zzbxaVar) {
        this.zzc = context;
        this.zzd = zzbxaVar;
    }

    public final /* synthetic */ void zzb(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.zzd.zze();
        }
    }

    public final synchronized void zzc(String str) {
        if (this.zza.containsKey(str)) {
            return;
        }
        SharedPreferences defaultSharedPreferences = "__default__".equals(str) ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
        zzbyc zzbycVar = new zzbyc(this, str);
        this.zza.put(str, zzbycVar);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzbycVar);
    }

    public final synchronized void zzd(zzbyb zzbybVar) {
        this.zzb.add(zzbybVar);
    }
}

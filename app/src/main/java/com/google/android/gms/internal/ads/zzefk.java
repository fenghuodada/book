package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.concurrent.futures.C0485b;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzefk {
    private final Clock zza;
    private final zzefl zzb;
    private final zzfgj zzc;
    private final List zzd = Collections.synchronizedList(new ArrayList());
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgD)).booleanValue();
    private final zzeca zzf;

    public zzefk(Clock clock, zzefl zzeflVar, zzeca zzecaVar, zzfgj zzfgjVar) {
        this.zza = clock;
        this.zzb = zzeflVar;
        this.zzf = zzecaVar;
        this.zzc = zzfgjVar;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzefk zzefkVar, String str, int i, long j, String str2, Integer num) {
        String str3 = str + "." + i + "." + j;
        if (!TextUtils.isEmpty(str2)) {
            str3 = C0485b.m12391a(str3, ".", str2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzby)).booleanValue() && num != null && !TextUtils.isEmpty(str2)) {
            str3 = str3 + "." + num;
        }
        zzefkVar.zzd.add(str3);
    }

    public final zzfwb zze(zzezr zzezrVar, zzezf zzezfVar, zzfwb zzfwbVar, zzfgf zzfgfVar) {
        zzezi zzeziVar = zzezrVar.zzb.zzb;
        long elapsedRealtime = this.zza.elapsedRealtime();
        String str = zzezfVar.zzx;
        if (str != null) {
            zzfvr.zzq(zzfwbVar, new zzefj(this, elapsedRealtime, str, zzezfVar, zzeziVar, zzfgfVar, zzezrVar), zzcag.zzf);
        }
        return zzfwbVar;
    }

    public final String zzf() {
        return TextUtils.join("_", this.zzd);
    }
}

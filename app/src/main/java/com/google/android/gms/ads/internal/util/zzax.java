package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzale;
import com.google.android.gms.internal.ads.zzali;
import com.google.android.gms.internal.ads.zzall;
import com.google.android.gms.internal.ads.zzalr;
import com.google.android.gms.internal.ads.zzalw;
import com.google.android.gms.internal.ads.zzalx;
import com.google.android.gms.internal.ads.zzame;
import com.google.android.gms.internal.ads.zzami;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbkd;
import com.google.android.gms.internal.ads.zzbzm;
import java.io.File;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzax extends zzalx {
    private final Context zzc;

    private zzax(Context context, zzalw zzalwVar) {
        super(zzalwVar);
        this.zzc = context;
    }

    public static zzall zzb(Context context) {
        zzall zzallVar = new zzall(new zzame(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzax(context, new zzami()), 4);
        zzallVar.zzd();
        return zzallVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalx, com.google.android.gms.internal.ads.zzalb
    public final zzale zza(zzali zzaliVar) throws zzalr {
        if (zzaliVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeh), zzaliVar.zzk())) {
                com.google.android.gms.ads.internal.client.zzay.zzb();
                if (zzbzm.zzs(this.zzc, 13400000)) {
                    zzale zza = new zzbkd(this.zzc).zza(zzaliVar);
                    if (zza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzaliVar.zzk())));
                        return zza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzaliVar.zzk())));
                }
            }
        }
        return super.zza(zzaliVar);
    }
}

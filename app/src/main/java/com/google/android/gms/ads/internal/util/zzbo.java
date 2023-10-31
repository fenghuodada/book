package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzakq;
import com.google.android.gms.internal.ads.zzall;
import com.google.android.gms.internal.ads.zzamo;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbzs;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcal;
import com.google.android.gms.internal.ads.zzfwb;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbo {
    private static zzall zzb;
    private static final Object zzc = new Object();
    @Deprecated
    public static final zzbj zza = new zzbg();

    public zzbo(Context context) {
        zzall zza2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzc) {
            if (zzb == null) {
                zzbbk.zza(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeg)).booleanValue()) {
                        zza2 = zzax.zzb(context);
                        zzb = zza2;
                    }
                }
                zza2 = zzamo.zza(context, null);
                zzb = zza2;
            }
        }
    }

    public final zzfwb zza(String str) {
        zzcal zzcalVar = new zzcal();
        zzb.zza(new zzbn(str, null, zzcalVar));
        return zzcalVar;
    }

    public final zzfwb zzb(int i, String str, @Nullable Map map, @Nullable byte[] bArr) {
        zzbl zzblVar = new zzbl(null);
        zzbh zzbhVar = new zzbh(this, str, zzblVar);
        zzbzs zzbzsVar = new zzbzs(null);
        zzbi zzbiVar = new zzbi(this, i, str, zzblVar, zzbhVar, bArr, map, zzbzsVar);
        if (zzbzs.zzk()) {
            try {
                zzbzsVar.zzd(str, "GET", zzbiVar.zzl(), zzbiVar.zzx());
            } catch (zzakq e) {
                zzbzt.zzj(e.getMessage());
            }
        }
        zzb.zza(zzbiVar);
        return zzblVar;
    }
}

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbtm;
import com.google.android.gms.internal.ads.zzbwu;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;
    @Nullable
    private final zzbwu zzc;
    private final zzbtm zzd = new zzbtm(false, Collections.emptyList());

    public zzb(Context context, @Nullable zzbwu zzbwuVar, @Nullable zzbtm zzbtmVar) {
        this.zza = context;
        this.zzc = zzbwuVar;
    }

    private final boolean zzd() {
        zzbwu zzbwuVar = this.zzc;
        return (zzbwuVar != null && zzbwuVar.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(@Nullable String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzbwu zzbwuVar = this.zzc;
            if (zzbwuVar != null) {
                zzbwuVar.zzd(str, null, 3);
                return;
            }
            zzbtm zzbtmVar = this.zzd;
            if (!zzbtmVar.zza || (list = zzbtmVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    zzt.zzp();
                    com.google.android.gms.ads.internal.util.zzs.zzH(this.zza, "", replace);
                }
            }
        }
    }

    public final boolean zzc() {
        return !zzd() || this.zzb;
    }
}

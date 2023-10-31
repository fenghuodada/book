package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.p039h5.OnH5AdsEventListener;
import com.google.android.gms.common.internal.Preconditions;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public final class zzbjm {
    private final Context zza;
    private final OnH5AdsEventListener zzb;
    @Nullable
    private zzbji zzc;

    public zzbjm(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        Preconditions.checkState(true, "Android version must be Lollipop or higher");
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(onH5AdsEventListener);
        this.zza = context;
        this.zzb = onH5AdsEventListener;
        zzbbk.zza(context);
    }

    public static final boolean zzc(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziY)).booleanValue()) {
            Preconditions.checkNotNull(str);
            if (str.length() > ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzja)).intValue()) {
                zzbzt.zze("H5 GMSG exceeds max length");
                return false;
            }
            Uri parse = Uri.parse(str);
            return "gmsg".equals(parse.getScheme()) && "mobileads.google.com".equals(parse.getHost()) && "/h5ads".equals(parse.getPath());
        }
        return false;
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        this.zzc = com.google.android.gms.ads.internal.client.zzay.zza().zzl(this.zza, new zzbnv(), this.zzb);
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zziY)).booleanValue()) {
            zzd();
            zzbji zzbjiVar = this.zzc;
            if (zzbjiVar != null) {
                try {
                    zzbjiVar.zze();
                } catch (RemoteException e) {
                    zzbzt.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final boolean zzb(String str) {
        if (zzc(str)) {
            zzd();
            zzbji zzbjiVar = this.zzc;
            if (zzbjiVar != null) {
                try {
                    zzbjiVar.zzf(str);
                    return true;
                } catch (RemoteException e) {
                    zzbzt.zzl("#007 Could not call remote method.", e);
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}

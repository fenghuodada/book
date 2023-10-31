package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzbsm {
    private static zzbyk zza;
    private final Context zzb;
    private final AdFormat zzc;
    @Nullable
    private final com.google.android.gms.ads.internal.client.zzdx zzd;

    public zzbsm(Context context, AdFormat adFormat, @Nullable com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzdxVar;
    }

    @Nullable
    public static zzbyk zza(Context context) {
        zzbyk zzbykVar;
        synchronized (zzbsm.class) {
            if (zza == null) {
                zza = com.google.android.gms.ads.internal.client.zzay.zza().zzr(context, new zzbnv());
            }
            zzbykVar = zza;
        }
        return zzbykVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        String str;
        zzbyk zza2 = zza(this.zzb);
        if (zza2 == null) {
            str = "Internal Error, query info generator is null.";
        } else {
            IObjectWrapper wrap = ObjectWrapper.wrap(this.zzb);
            com.google.android.gms.ads.internal.client.zzdx zzdxVar = this.zzd;
            try {
                zza2.zze(wrap, new zzbyo(null, this.zzc.name(), null, zzdxVar == null ? new com.google.android.gms.ads.internal.client.zzm().zza() : com.google.android.gms.ads.internal.client.zzp.zza.zza(this.zzb, zzdxVar)), new zzbsl(this, queryInfoGenerationCallback));
                return;
            } catch (RemoteException unused) {
                str = "Internal Error.";
            }
        }
        queryInfoGenerationCallback.onFailure(str);
    }
}

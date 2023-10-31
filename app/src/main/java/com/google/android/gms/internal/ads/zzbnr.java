package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzbnr {
    private static zzbnr zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public static zzbnr zza() {
        if (zza == null) {
            zza = new zzbnr();
        }
        return zza;
    }

    @Nullable
    public final Thread zzb(final Context context, @Nullable final String str) {
        if (this.zzb.compareAndSet(false, true)) {
            Thread thread = new Thread(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbnq
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = context;
                    String str2 = str;
                    zzbbk.zza(context2);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("measurementEnabled", ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzai)).booleanValue());
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzap)).booleanValue()) {
                        bundle.putString("ad_storage", "denied");
                        bundle.putString("analytics_storage", "denied");
                    }
                    try {
                        ((zzcgv) zzbzx.zzb(context2, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new zzbzv() { // from class: com.google.android.gms.internal.ads.zzbnp
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.android.gms.internal.ads.zzbzv
                            public final Object zza(Object obj) {
                                return zzcgu.zzb(obj);
                            }
                        })).zze(ObjectWrapper.wrap(context2), new zzbno(AppMeasurementSdk.getInstance(context2, "FA-Ads", "am", str2, bundle)));
                    } catch (RemoteException | zzbzw | NullPointerException e) {
                        zzbzt.zzl("#007 Could not call remote method.", e);
                    }
                }
            });
            thread.start();
            return thread;
        }
        return null;
    }
}

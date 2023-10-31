package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzerb implements zzeqq {
    private final zzfwc zza;
    private final Context zzb;

    public zzerb(zzfwc zzfwcVar, Context context) {
        this.zza = zzfwcVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 39;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzera
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerb.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeqz zzc() throws Exception {
        boolean z;
        int i;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzb.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        com.google.android.gms.ads.internal.zzt.zzp();
        int i2 = -1;
        if (com.google.android.gms.ads.internal.util.zzs.zzw(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzb.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i = type;
                i2 = ordinal;
            } else {
                i = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
        } else {
            z = false;
            i = -2;
        }
        return new zzeqz(networkOperator, i, com.google.android.gms.ads.internal.zzt.zzq().zzn(this.zzb), phoneType, z, i2);
    }
}

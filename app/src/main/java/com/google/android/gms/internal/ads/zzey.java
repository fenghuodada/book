package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: classes.dex */
final class zzey extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final zzfb zza;

    public zzey(zzfb zzfbVar) {
        this.zza = zzfbVar;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        zzfb.zzc(this.zza, true == (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) ? 10 : 5);
    }
}

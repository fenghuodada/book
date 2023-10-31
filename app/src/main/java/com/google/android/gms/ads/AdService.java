package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzbzt;

@KeepForSdk
/* loaded from: classes.dex */
public class AdService extends IntentService {
    @NonNull
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdService";

    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(@NonNull Intent intent) {
        try {
            zzay.zza().zzm(this, new zzbnv()).zze(intent);
        } catch (RemoteException e) {
            zzbzt.zzg("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}

package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.legacy.content.AbstractC1440a;
import com.google.android.gms.measurement.internal.zzfm;

/* loaded from: classes3.dex */
public final class AppMeasurementReceiver extends AbstractC1440a implements zzfm.zza {
    private zzfm zza;

    @NonNull
    public BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    @Override // com.google.android.gms.measurement.internal.zzfm.zza
    @MainThread
    public void doStartService(@NonNull Context context, @NonNull Intent intent) {
        AbstractC1440a.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    @MainThread
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.zza == null) {
            this.zza = new zzfm(this);
        }
        this.zza.zza(context, intent);
    }
}

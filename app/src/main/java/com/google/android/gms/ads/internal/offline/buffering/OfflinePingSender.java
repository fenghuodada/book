package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzbro;

@KeepForSdk
/* loaded from: classes.dex */
public class OfflinePingSender extends Worker {
    private final zzbro zza;

    public OfflinePingSender(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzay.zza().zzm(context, new zzbnv());
    }

    @Override // androidx.work.Worker
    @NonNull
    public final ListenableWorker.AbstractC1822a doWork() {
        try {
            this.zza.zzf();
            return new ListenableWorker.AbstractC1822a.C1825c();
        } catch (RemoteException unused) {
            return new ListenableWorker.AbstractC1822a.C1823a();
        }
    }
}

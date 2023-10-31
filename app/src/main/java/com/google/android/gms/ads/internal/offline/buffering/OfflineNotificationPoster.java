package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzbro;

@KeepForSdk
/* loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {
    private final zzbro zza;

    public OfflineNotificationPoster(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzay.zza().zzm(context, new zzbnv());
    }

    @Override // androidx.work.Worker
    @NonNull
    public final ListenableWorker.AbstractC1822a doWork() {
        String str;
        Object obj = getInputData().f4459a.get("uri");
        String str2 = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = getInputData().f4459a.get("gws_query_id");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        }
        try {
            this.zza.zzg(ObjectWrapper.wrap(getApplicationContext()), str, str2);
            return new ListenableWorker.AbstractC1822a.C1825c();
        } catch (RemoteException unused) {
            return new ListenableWorker.AbstractC1822a.C1823a();
        }
    }
}

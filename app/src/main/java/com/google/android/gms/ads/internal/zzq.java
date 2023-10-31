package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzbzt;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class zzq extends AsyncTask {
    final /* synthetic */ zzs zza;

    public /* synthetic */ zzq(zzs zzsVar, zzp zzpVar) {
        this.zza = zzsVar;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzs zzsVar = this.zza;
        if (zzs.zze(zzsVar) == null || str == null) {
            return;
        }
        zzs.zze(zzsVar).loadUrl(str);
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public final String doInBackground(Void... voidArr) {
        try {
            zzs zzsVar = this.zza;
            zzs.zzv(zzsVar, (zzaqq) zzs.zzu(zzsVar).get(1000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzbzt.zzk("", e);
        }
        return this.zza.zzp();
    }
}

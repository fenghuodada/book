package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbkk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzei extends zzbkk {
    final /* synthetic */ zzej zza;

    public /* synthetic */ zzei(zzej zzejVar, zzeh zzehVar) {
        this.zza = zzejVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkl
    public final void zzb(List list) throws RemoteException {
        int i;
        ArrayList arrayList;
        synchronized (zzej.zzg(this.zza)) {
            zzej.zzk(this.zza, false);
            zzej.zzj(this.zza, true);
            arrayList = new ArrayList(zzej.zzi(this.zza));
            zzej.zzi(this.zza).clear();
        }
        InitializationStatus zzd = zzej.zzd(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(zzd);
        }
    }
}

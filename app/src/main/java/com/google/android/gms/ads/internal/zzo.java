package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaqp;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzbzz;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzo implements Callable {
    final /* synthetic */ zzs zza;

    public zzo(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbzz zzbzzVar;
        Context context;
        zzs zzsVar = this.zza;
        zzbzzVar = zzsVar.zza;
        String str = zzbzzVar.zza;
        context = zzsVar.zzd;
        return new zzaqq(zzaqp.zzt(str, context, false));
    }
}

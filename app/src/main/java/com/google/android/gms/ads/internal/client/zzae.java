package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzbym;
import com.google.android.gms.internal.ads.zzbyn;
import com.google.android.gms.internal.ads.zzbzv;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzbzx;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzae extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbny zzb;

    public zzae(zzaw zzawVar, Context context, zzbny zzbnyVar) {
        this.zza = context;
        this.zzb = zzbnyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzp(ObjectWrapper.wrap(this.zza), this.zzb, 231700000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbyn) zzbzx.zzb(this.zza, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new zzbzv() { // from class: com.google.android.gms.ads.internal.client.zzad
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzv
                public final Object zza(Object obj) {
                    return zzbym.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, 231700000);
        } catch (RemoteException | zzbzw | NullPointerException unused) {
            return null;
        }
    }
}

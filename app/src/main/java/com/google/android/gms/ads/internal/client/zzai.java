package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.p039h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbjk;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzbzv;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzbzx;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzai extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbny zzb;
    final /* synthetic */ OnH5AdsEventListener zzc;

    public zzai(zzaw zzawVar, Context context, zzbny zzbnyVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = zzbnyVar;
        this.zzc = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @NonNull
    public final /* synthetic */ Object zza() {
        return new zzbjp();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzb(zzce zzceVar) throws RemoteException {
        return zzceVar.zzk(ObjectWrapper.wrap(this.zza), this.zzb, 231700000, new zzbjc(this.zzc));
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbjl) zzbzx.zzb(this.zza, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new zzbzv() { // from class: com.google.android.gms.ads.internal.client.zzah
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzbzv
                public final Object zza(Object obj) {
                    return zzbjk.zzb(obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, 231700000, new zzbjc(this.zzc));
        } catch (RemoteException | zzbzw | NullPointerException unused) {
            return null;
        }
    }
}

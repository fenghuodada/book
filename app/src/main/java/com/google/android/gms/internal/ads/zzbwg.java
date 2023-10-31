package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: classes.dex */
public final class zzbwg extends zzbvl {
    private final String zza;
    private final int zzb;

    public zzbwg(@Nullable RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    public zzbwg(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final int zze() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final String zzf() throws RemoteException {
        return this.zza;
    }
}

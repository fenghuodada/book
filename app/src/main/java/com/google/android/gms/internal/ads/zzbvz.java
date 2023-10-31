package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: classes.dex */
public final class zzbvz implements RewardItem {
    private final zzbvm zza;

    public zzbvz(zzbvm zzbvmVar) {
        this.zza = zzbvmVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzbvm zzbvmVar = this.zza;
        if (zzbvmVar != null) {
            try {
                return zzbvmVar.zze();
            } catch (RemoteException e) {
                zzbzt.zzk("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    @Nullable
    public final String getType() {
        zzbvm zzbvmVar = this.zza;
        if (zzbvmVar != null) {
            try {
                return zzbvmVar.zzf();
            } catch (RemoteException e) {
                zzbzt.zzk("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}

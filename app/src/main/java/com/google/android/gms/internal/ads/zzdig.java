package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdig implements View.OnClickListener {
    @Nullable
    @VisibleForTesting
    String zza;
    @Nullable
    @VisibleForTesting
    Long zzb;
    @Nullable
    @VisibleForTesting
    WeakReference zzc;
    private final zzdlz zzd;
    private final Clock zze;
    @Nullable
    private zzbgk zzf;
    @Nullable
    private zzbii zzg;

    public zzdig(zzdlz zzdlzVar, Clock clock) {
        this.zzd = zzdlzVar;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(FacebookAdapter.KEY_ID, this.zza);
            hashMap.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
            hashMap.put("messageType", "onePointFiveClick");
            this.zzd.zzg("sendMessageToNativeJs", hashMap);
        }
        zzd();
    }

    @Nullable
    public final zzbgk zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zze();
        } catch (RemoteException e) {
            zzbzt.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzc(final zzbgk zzbgkVar) {
        this.zzf = zzbgkVar;
        zzbii zzbiiVar = this.zzg;
        if (zzbiiVar != null) {
            this.zzd.zzk("/unconfirmedClick", zzbiiVar);
        }
        zzbii zzbiiVar2 = new zzbii() { // from class: com.google.android.gms.internal.ads.zzdif
            @Override // com.google.android.gms.internal.ads.zzbii
            public final void zza(Object obj, Map map) {
                zzdig zzdigVar = zzdig.this;
                zzbgk zzbgkVar2 = zzbgkVar;
                try {
                    zzdigVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    zzbzt.zzg("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzdigVar.zza = (String) map.get(FacebookAdapter.KEY_ID);
                String str = (String) map.get("asset_id");
                if (zzbgkVar2 == null) {
                    zzbzt.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzbgkVar2.zzf(str);
                } catch (RemoteException e) {
                    zzbzt.zzl("#007 Could not call remote method.", e);
                }
            }
        };
        this.zzg = zzbiiVar2;
        this.zzd.zzi("/unconfirmedClick", zzbiiVar2);
    }
}

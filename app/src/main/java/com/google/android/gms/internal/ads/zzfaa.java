package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfaa {
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzfl zza;
    @Nullable
    public final zzbkq zzb;
    @Nullable
    public final zzejf zzc;
    public final com.google.android.gms.ads.internal.client.zzl zzd;
    public final com.google.android.gms.ads.internal.client.zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbee zzi;
    public final com.google.android.gms.ads.internal.client.zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzcb zzn;
    public final zzezn zzo;
    public final boolean zzp;
    public final boolean zzq;
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzcf zzr;

    public /* synthetic */ zzfaa(zzezy zzezyVar, zzezz zzezzVar) {
        this.zze = zzezy.zzf(zzezyVar);
        this.zzf = zzezy.zzH(zzezyVar);
        this.zzr = zzezy.zzP(zzezyVar);
        int i = zzezy.zzd(zzezyVar).zza;
        long j = zzezy.zzd(zzezyVar).zzb;
        Bundle bundle = zzezy.zzd(zzezyVar).zzc;
        int i2 = zzezy.zzd(zzezyVar).zzd;
        List list = zzezy.zzd(zzezyVar).zze;
        boolean z = zzezy.zzd(zzezyVar).zzf;
        int i3 = zzezy.zzd(zzezyVar).zzg;
        boolean z2 = true;
        if (!zzezy.zzd(zzezyVar).zzh && !zzezy.zzN(zzezyVar)) {
            z2 = false;
        }
        this.zzd = new com.google.android.gms.ads.internal.client.zzl(i, j, bundle, i2, list, z, i3, z2, zzezy.zzd(zzezyVar).zzi, zzezy.zzd(zzezyVar).zzj, zzezy.zzd(zzezyVar).zzk, zzezy.zzd(zzezyVar).zzl, zzezy.zzd(zzezyVar).zzm, zzezy.zzd(zzezyVar).zzn, zzezy.zzd(zzezyVar).zzo, zzezy.zzd(zzezyVar).zzp, zzezy.zzd(zzezyVar).zzq, zzezy.zzd(zzezyVar).zzr, zzezy.zzd(zzezyVar).zzs, zzezy.zzd(zzezyVar).zzt, zzezy.zzd(zzezyVar).zzu, zzezy.zzd(zzezyVar).zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzezy.zzd(zzezyVar).zzw), zzezy.zzd(zzezyVar).zzx);
        this.zza = zzezy.zzj(zzezyVar) != null ? zzezy.zzj(zzezyVar) : zzezy.zzk(zzezyVar) != null ? zzezy.zzk(zzezyVar).zzf : null;
        this.zzg = zzezy.zzJ(zzezyVar);
        this.zzh = zzezy.zzK(zzezyVar);
        this.zzi = zzezy.zzJ(zzezyVar) == null ? null : zzezy.zzk(zzezyVar) == null ? new zzbee(new NativeAdOptions.Builder().build()) : zzezy.zzk(zzezyVar);
        this.zzj = zzezy.zzh(zzezyVar);
        this.zzk = zzezy.zza(zzezyVar);
        this.zzl = zzezy.zzb(zzezyVar);
        this.zzm = zzezy.zzc(zzezyVar);
        this.zzn = zzezy.zzi(zzezyVar);
        this.zzb = zzezy.zzl(zzezyVar);
        this.zzo = new zzezn(zzezy.zzn(zzezyVar), null);
        this.zzp = zzezy.zzL(zzezyVar);
        this.zzc = zzezy.zzm(zzezyVar);
        this.zzq = zzezy.zzM(zzezyVar);
    }

    @Nullable
    public final zzbgh zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : this.zzl.zza();
    }

    public final boolean zzb() {
        return this.zzf.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcO));
    }
}

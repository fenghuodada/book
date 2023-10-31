package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzezy {
    private com.google.android.gms.ads.internal.client.zzl zza;
    private com.google.android.gms.ads.internal.client.zzq zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzfl zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbee zzh;
    private com.google.android.gms.ads.internal.client.zzw zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    @Nullable
    private com.google.android.gms.ads.internal.client.zzcb zzl;
    private zzbkq zzn;
    @Nullable
    private zzejf zzq;
    private com.google.android.gms.ads.internal.client.zzcf zzs;
    private int zzm = 1;
    private final zzezl zzo = new zzezl();
    private boolean zzp = false;
    private boolean zzr = false;

    public static /* bridge */ /* synthetic */ String zzH(zzezy zzezyVar) {
        return zzezyVar.zzc;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzJ(zzezy zzezyVar) {
        return zzezyVar.zzf;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzK(zzezy zzezyVar) {
        return zzezyVar.zzg;
    }

    public static /* bridge */ /* synthetic */ boolean zzL(zzezy zzezyVar) {
        return zzezyVar.zzp;
    }

    public static /* bridge */ /* synthetic */ boolean zzM(zzezy zzezyVar) {
        return zzezyVar.zzr;
    }

    public static /* bridge */ /* synthetic */ boolean zzN(zzezy zzezyVar) {
        return zzezyVar.zze;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzcf zzP(zzezy zzezyVar) {
        return zzezyVar.zzs;
    }

    public static /* bridge */ /* synthetic */ int zza(zzezy zzezyVar) {
        return zzezyVar.zzm;
    }

    public static /* bridge */ /* synthetic */ AdManagerAdViewOptions zzb(zzezy zzezyVar) {
        return zzezyVar.zzj;
    }

    public static /* bridge */ /* synthetic */ PublisherAdViewOptions zzc(zzezy zzezyVar) {
        return zzezyVar.zzk;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzl zzd(zzezy zzezyVar) {
        return zzezyVar.zza;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzq zzf(zzezy zzezyVar) {
        return zzezyVar.zzb;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzw zzh(zzezy zzezyVar) {
        return zzezyVar.zzi;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzcb zzi(zzezy zzezyVar) {
        return zzezyVar.zzl;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzfl zzj(zzezy zzezyVar) {
        return zzezyVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzbee zzk(zzezy zzezyVar) {
        return zzezyVar.zzh;
    }

    public static /* bridge */ /* synthetic */ zzbkq zzl(zzezy zzezyVar) {
        return zzezyVar.zzn;
    }

    public static /* bridge */ /* synthetic */ zzejf zzm(zzezy zzezyVar) {
        return zzezyVar.zzq;
    }

    public static /* bridge */ /* synthetic */ zzezl zzn(zzezy zzezyVar) {
        return zzezyVar.zzo;
    }

    public final zzezy zzA(zzbee zzbeeVar) {
        this.zzh = zzbeeVar;
        return this;
    }

    public final zzezy zzB(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzezy zzC(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzezy zzD(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzc();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzezy zzE(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zza = zzlVar;
        return this;
    }

    public final zzezy zzF(com.google.android.gms.ads.internal.client.zzfl zzflVar) {
        this.zzd = zzflVar;
        return this;
    }

    public final zzfaa zzG() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfaa(this, null);
    }

    public final String zzI() {
        return this.zzc;
    }

    public final boolean zzO() {
        return this.zzp;
    }

    public final zzezy zzQ(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        this.zzs = zzcfVar;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzl zze() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        return this.zzb;
    }

    public final zzezl zzo() {
        return this.zzo;
    }

    public final zzezy zzp(zzfaa zzfaaVar) {
        this.zzo.zza(zzfaaVar.zzo.zza);
        this.zza = zzfaaVar.zzd;
        this.zzb = zzfaaVar.zze;
        this.zzs = zzfaaVar.zzr;
        this.zzc = zzfaaVar.zzf;
        this.zzd = zzfaaVar.zza;
        this.zzf = zzfaaVar.zzg;
        this.zzg = zzfaaVar.zzh;
        this.zzh = zzfaaVar.zzi;
        this.zzi = zzfaaVar.zzj;
        zzq(zzfaaVar.zzl);
        zzD(zzfaaVar.zzm);
        this.zzp = zzfaaVar.zzp;
        this.zzq = zzfaaVar.zzc;
        this.zzr = zzfaaVar.zzq;
        return this;
    }

    public final zzezy zzq(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzezy zzr(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb = zzqVar;
        return this;
    }

    public final zzezy zzs(String str) {
        this.zzc = str;
        return this;
    }

    public final zzezy zzt(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi = zzwVar;
        return this;
    }

    public final zzezy zzu(zzejf zzejfVar) {
        this.zzq = zzejfVar;
        return this;
    }

    public final zzezy zzv(zzbkq zzbkqVar) {
        this.zzn = zzbkqVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzfl(false, true, false);
        return this;
    }

    public final zzezy zzw(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzezy zzx(boolean z) {
        this.zzr = true;
        return this;
    }

    public final zzezy zzy(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzezy zzz(int i) {
        this.zzm = i;
        return this;
    }
}

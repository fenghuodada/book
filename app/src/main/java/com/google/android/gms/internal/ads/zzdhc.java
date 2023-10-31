package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.collection.C0482i;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdhc {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzdq zzb;
    private zzbei zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzel zzg;
    private Bundle zzh;
    private zzcfb zzi;
    private zzcfb zzj;
    @Nullable
    private zzcfb zzk;
    @Nullable
    private zzfgo zzl;
    private View zzm;
    @Nullable
    private zzfwb zzn;
    private View zzo;
    private IObjectWrapper zzp;
    private double zzq;
    private zzbeq zzr;
    private zzbeq zzs;
    private String zzt;
    private float zzw;
    @Nullable
    private String zzx;
    private final C0482i zzu = new C0482i();
    private final C0482i zzv = new C0482i();
    private List zzf = Collections.emptyList();

    @Nullable
    public static zzdhc zzae(zzboj zzbojVar) {
        try {
            zzdhb zzai = zzai(zzbojVar.zzg(), null);
            zzbei zzh = zzbojVar.zzh();
            String zzo = zzbojVar.zzo();
            List zzr = zzbojVar.zzr();
            String zzm = zzbojVar.zzm();
            Bundle zzf = zzbojVar.zzf();
            String zzn = zzbojVar.zzn();
            IObjectWrapper zzl = zzbojVar.zzl();
            String zzq = zzbojVar.zzq();
            String zzp = zzbojVar.zzp();
            double zze = zzbojVar.zze();
            zzbeq zzi = zzbojVar.zzi();
            zzdhc zzdhcVar = new zzdhc();
            zzdhcVar.zza = 2;
            zzdhcVar.zzb = zzai;
            zzdhcVar.zzc = zzh;
            zzdhcVar.zzd = (View) zzak(zzbojVar.zzj());
            zzdhcVar.zzX("headline", zzo);
            zzdhcVar.zze = zzr;
            zzdhcVar.zzX("body", zzm);
            zzdhcVar.zzh = zzf;
            zzdhcVar.zzX("call_to_action", zzn);
            zzdhcVar.zzm = (View) zzak(zzbojVar.zzk());
            zzdhcVar.zzp = zzl;
            zzdhcVar.zzX("store", zzq);
            zzdhcVar.zzX("price", zzp);
            zzdhcVar.zzq = zze;
            zzdhcVar.zzr = zzi;
            return zzdhcVar;
        } catch (RemoteException e) {
            zzbzt.zzk("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    @Nullable
    public static zzdhc zzaf(zzbok zzbokVar) {
        try {
            zzdhb zzai = zzai(zzbokVar.zzf(), null);
            zzbei zzg = zzbokVar.zzg();
            String zzo = zzbokVar.zzo();
            List zzp = zzbokVar.zzp();
            String zzm = zzbokVar.zzm();
            Bundle zze = zzbokVar.zze();
            String zzn = zzbokVar.zzn();
            IObjectWrapper zzk = zzbokVar.zzk();
            String zzl = zzbokVar.zzl();
            zzbeq zzh = zzbokVar.zzh();
            zzdhc zzdhcVar = new zzdhc();
            zzdhcVar.zza = 1;
            zzdhcVar.zzb = zzai;
            zzdhcVar.zzc = zzg;
            zzdhcVar.zzd = (View) zzak(zzbokVar.zzi());
            zzdhcVar.zzX("headline", zzo);
            zzdhcVar.zze = zzp;
            zzdhcVar.zzX("body", zzm);
            zzdhcVar.zzh = zze;
            zzdhcVar.zzX("call_to_action", zzn);
            zzdhcVar.zzm = (View) zzak(zzbokVar.zzj());
            zzdhcVar.zzp = zzk;
            zzdhcVar.zzX("advertiser", zzl);
            zzdhcVar.zzs = zzh;
            return zzdhcVar;
        } catch (RemoteException e) {
            zzbzt.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    @Nullable
    public static zzdhc zzag(zzboj zzbojVar) {
        try {
            return zzaj(zzai(zzbojVar.zzg(), null), zzbojVar.zzh(), (View) zzak(zzbojVar.zzj()), zzbojVar.zzo(), zzbojVar.zzr(), zzbojVar.zzm(), zzbojVar.zzf(), zzbojVar.zzn(), (View) zzak(zzbojVar.zzk()), zzbojVar.zzl(), zzbojVar.zzq(), zzbojVar.zzp(), zzbojVar.zze(), zzbojVar.zzi(), null, 0.0f);
        } catch (RemoteException e) {
            zzbzt.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    @Nullable
    public static zzdhc zzah(zzbok zzbokVar) {
        try {
            return zzaj(zzai(zzbokVar.zzf(), null), zzbokVar.zzg(), (View) zzak(zzbokVar.zzi()), zzbokVar.zzo(), zzbokVar.zzp(), zzbokVar.zzm(), zzbokVar.zze(), zzbokVar.zzn(), (View) zzak(zzbokVar.zzj()), zzbokVar.zzk(), null, null, -1.0d, zzbokVar.zzh(), zzbokVar.zzl(), 0.0f);
        } catch (RemoteException e) {
            zzbzt.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    @Nullable
    private static zzdhb zzai(com.google.android.gms.ads.internal.client.zzdq zzdqVar, @Nullable zzbon zzbonVar) {
        if (zzdqVar == null) {
            return null;
        }
        return new zzdhb(zzdqVar, zzbonVar);
    }

    private static zzdhc zzaj(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbei zzbeiVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbeq zzbeqVar, String str6, float f) {
        zzdhc zzdhcVar = new zzdhc();
        zzdhcVar.zza = 6;
        zzdhcVar.zzb = zzdqVar;
        zzdhcVar.zzc = zzbeiVar;
        zzdhcVar.zzd = view;
        zzdhcVar.zzX("headline", str);
        zzdhcVar.zze = list;
        zzdhcVar.zzX("body", str2);
        zzdhcVar.zzh = bundle;
        zzdhcVar.zzX("call_to_action", str3);
        zzdhcVar.zzm = view2;
        zzdhcVar.zzp = iObjectWrapper;
        zzdhcVar.zzX("store", str4);
        zzdhcVar.zzX("price", str5);
        zzdhcVar.zzq = d;
        zzdhcVar.zzr = zzbeqVar;
        zzdhcVar.zzX("advertiser", str6);
        zzdhcVar.zzQ(f);
        return zzdhcVar;
    }

    private static Object zzak(@Nullable IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    @Nullable
    public static zzdhc zzs(zzbon zzbonVar) {
        try {
            return zzaj(zzai(zzbonVar.zzj(), zzbonVar), zzbonVar.zzk(), (View) zzak(zzbonVar.zzm()), zzbonVar.zzs(), zzbonVar.zzv(), zzbonVar.zzq(), zzbonVar.zzi(), zzbonVar.zzr(), (View) zzak(zzbonVar.zzn()), zzbonVar.zzo(), zzbonVar.zzu(), zzbonVar.zzt(), zzbonVar.zze(), zzbonVar.zzl(), zzbonVar.zzp(), zzbonVar.zzf());
        } catch (RemoteException e) {
            zzbzt.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized String zzA() {
        return zzE("headline");
    }

    @Nullable
    public final synchronized String zzB() {
        return this.zzx;
    }

    public final synchronized String zzC() {
        return zzE("price");
    }

    public final synchronized String zzD() {
        return zzE("store");
    }

    public final synchronized String zzE(String str) {
        return (String) this.zzv.getOrDefault(str, null);
    }

    public final synchronized List zzF() {
        return this.zze;
    }

    public final synchronized List zzG() {
        return this.zzf;
    }

    public final synchronized void zzH() {
        zzcfb zzcfbVar = this.zzi;
        if (zzcfbVar != null) {
            zzcfbVar.destroy();
            this.zzi = null;
        }
        zzcfb zzcfbVar2 = this.zzj;
        if (zzcfbVar2 != null) {
            zzcfbVar2.destroy();
            this.zzj = null;
        }
        zzcfb zzcfbVar3 = this.zzk;
        if (zzcfbVar3 != null) {
            zzcfbVar3.destroy();
            this.zzk = null;
        }
        this.zzl = null;
        this.zzu.clear();
        this.zzv.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzm = null;
        this.zzo = null;
        this.zzp = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
    }

    public final synchronized void zzI(zzbei zzbeiVar) {
        this.zzc = zzbeiVar;
    }

    public final synchronized void zzJ(String str) {
        this.zzt = str;
    }

    public final synchronized void zzK(@Nullable com.google.android.gms.ads.internal.client.zzel zzelVar) {
        this.zzg = zzelVar;
    }

    public final synchronized void zzL(zzbeq zzbeqVar) {
        this.zzr = zzbeqVar;
    }

    public final synchronized void zzM(String str, zzbec zzbecVar) {
        if (zzbecVar == null) {
            this.zzu.remove(str);
        } else {
            this.zzu.put(str, zzbecVar);
        }
    }

    public final synchronized void zzN(zzcfb zzcfbVar) {
        this.zzj = zzcfbVar;
    }

    public final synchronized void zzO(List list) {
        this.zze = list;
    }

    public final synchronized void zzP(zzbeq zzbeqVar) {
        this.zzs = zzbeqVar;
    }

    public final synchronized void zzQ(float f) {
        this.zzw = f;
    }

    public final synchronized void zzR(List list) {
        this.zzf = list;
    }

    public final synchronized void zzS(zzcfb zzcfbVar) {
        this.zzk = zzcfbVar;
    }

    public final synchronized void zzT(zzfwb zzfwbVar) {
        this.zzn = zzfwbVar;
    }

    public final synchronized void zzU(@Nullable String str) {
        this.zzx = str;
    }

    public final synchronized void zzV(zzfgo zzfgoVar) {
        this.zzl = zzfgoVar;
    }

    public final synchronized void zzW(double d) {
        this.zzq = d;
    }

    public final synchronized void zzX(String str, String str2) {
        if (str2 == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, str2);
        }
    }

    public final synchronized void zzY(int i) {
        this.zza = i;
    }

    public final synchronized void zzZ(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzb = zzdqVar;
    }

    public final synchronized double zza() {
        return this.zzq;
    }

    public final synchronized void zzaa(View view) {
        this.zzm = view;
    }

    public final synchronized void zzab(zzcfb zzcfbVar) {
        this.zzi = zzcfbVar;
    }

    public final synchronized void zzac(View view) {
        this.zzo = view;
    }

    public final synchronized boolean zzad() {
        return this.zzj != null;
    }

    public final synchronized float zzb() {
        return this.zzw;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzm;
    }

    public final synchronized View zzg() {
        return this.zzo;
    }

    public final synchronized C0482i zzh() {
        return this.zzu;
    }

    public final synchronized C0482i zzi() {
        return this.zzv;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzdq zzj() {
        return this.zzb;
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzel zzk() {
        return this.zzg;
    }

    public final synchronized zzbei zzl() {
        return this.zzc;
    }

    @Nullable
    public final zzbeq zzm() {
        List list = this.zze;
        if (list != null && !list.isEmpty()) {
            Object obj = this.zze.get(0);
            if (obj instanceof IBinder) {
                return zzbep.zzg((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized zzbeq zzn() {
        return this.zzr;
    }

    public final synchronized zzbeq zzo() {
        return this.zzs;
    }

    public final synchronized zzcfb zzp() {
        return this.zzj;
    }

    @Nullable
    public final synchronized zzcfb zzq() {
        return this.zzk;
    }

    public final synchronized zzcfb zzr() {
        return this.zzi;
    }

    @Nullable
    public final synchronized zzfgo zzt() {
        return this.zzl;
    }

    public final synchronized IObjectWrapper zzu() {
        return this.zzp;
    }

    @Nullable
    public final synchronized zzfwb zzv() {
        return this.zzn;
    }

    public final synchronized String zzw() {
        return zzE("advertiser");
    }

    public final synchronized String zzx() {
        return zzE("body");
    }

    public final synchronized String zzy() {
        return zzE("call_to_action");
    }

    public final synchronized String zzz() {
        return this.zzt;
    }
}

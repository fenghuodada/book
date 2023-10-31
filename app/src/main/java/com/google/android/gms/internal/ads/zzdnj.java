package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzdnj {
    private final zzcvg zza;
    private final zzdcu zzb;
    private final zzcwp zzc;
    private final zzcxc zzd;
    private final zzcxo zze;
    private final zzdac zzf;
    private final Executor zzg;
    private final zzdcq zzh;
    private final zzcnz zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzbwu zzk;
    private final zzaqq zzl;
    private final zzczt zzm;
    private final zzebc zzn;
    private final zzfgj zzo;
    private final zzdqc zzp;
    private final zzfen zzq;

    public zzdnj(zzcvg zzcvgVar, zzcwp zzcwpVar, zzcxc zzcxcVar, zzcxo zzcxoVar, zzdac zzdacVar, Executor executor, zzdcq zzdcqVar, zzcnz zzcnzVar, com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzbwu zzbwuVar, zzaqq zzaqqVar, zzczt zzcztVar, zzebc zzebcVar, zzfgj zzfgjVar, zzdqc zzdqcVar, zzfen zzfenVar, zzdcu zzdcuVar) {
        this.zza = zzcvgVar;
        this.zzc = zzcwpVar;
        this.zzd = zzcxcVar;
        this.zze = zzcxoVar;
        this.zzf = zzdacVar;
        this.zzg = executor;
        this.zzh = zzdcqVar;
        this.zzi = zzcnzVar;
        this.zzj = zzbVar;
        this.zzk = zzbwuVar;
        this.zzl = zzaqqVar;
        this.zzm = zzcztVar;
        this.zzn = zzebcVar;
        this.zzo = zzfgjVar;
        this.zzp = zzdqcVar;
        this.zzq = zzfenVar;
        this.zzb = zzdcuVar;
    }

    public static final zzfwb zzj(zzcfb zzcfbVar, String str, String str2) {
        final zzcal zzcalVar = new zzcal();
        zzcfbVar.zzN().zzA(new zzcgm() { // from class: com.google.android.gms.internal.ads.zzdnh
            @Override // com.google.android.gms.internal.ads.zzcgm
            public final void zza(boolean z) {
                zzcal zzcalVar2 = zzcal.this;
                if (z) {
                    zzcalVar2.zzd(null);
                } else {
                    zzcalVar2.zze(new Exception("Ad Web View failed to load."));
                }
            }
        });
        zzcfbVar.zzab(str, str2, null);
        return zzcalVar;
    }

    public final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    public final /* synthetic */ void zzd(String str, String str2) {
        this.zzf.zzbz(str, str2);
    }

    public final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    public final /* synthetic */ void zzf(View view) {
        this.zzj.zza();
    }

    public final /* synthetic */ void zzg(zzcfb zzcfbVar, zzcfb zzcfbVar2, Map map) {
        this.zzi.zzh(zzcfbVar);
    }

    public final /* synthetic */ boolean zzh(View view, MotionEvent motionEvent) {
        this.zzj.zza();
        if (view != null) {
            view.performClick();
            return false;
        }
        return false;
    }

    public final void zzi(final zzcfb zzcfbVar, boolean z, zzbik zzbikVar) {
        zzaqm zzc;
        zzcfbVar.zzN().zzM(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdna
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                zzdnj.this.zzc();
            }
        }, this.zzd, this.zze, new zzbhd() { // from class: com.google.android.gms.internal.ads.zzdnb
            @Override // com.google.android.gms.internal.ads.zzbhd
            public final void zzbz(String str, String str2) {
                zzdnj.this.zzd(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzz() { // from class: com.google.android.gms.internal.ads.zzdnc
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                zzdnj.this.zze();
            }
        }, z, zzbikVar, this.zzj, new zzdni(this), this.zzk, this.zzn, this.zzo, this.zzp, this.zzq, null, this.zzb, null, null);
        zzcfbVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdnd
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                zzdnj.this.zzh(view, motionEvent);
                return false;
            }
        });
        zzcfbVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdne
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zzdnj.this.zzf(view);
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcn)).booleanValue() && (zzc = this.zzl.zzc()) != null) {
            zzc.zzo((View) zzcfbVar);
        }
        this.zzh.zzm(zzcfbVar, this.zzg);
        this.zzh.zzm(new zzaty() { // from class: com.google.android.gms.internal.ads.zzdnf
            @Override // com.google.android.gms.internal.ads.zzaty
            public final void zzc(zzatx zzatxVar) {
                zzcgo zzN = zzcfb.this.zzN();
                Rect rect = zzatxVar.zzd;
                zzN.zzp(rect.left, rect.top, false);
            }
        }, this.zzg);
        this.zzh.zza((View) zzcfbVar);
        zzcfbVar.zzad("/trackActiveViewUnit", new zzbii() { // from class: com.google.android.gms.internal.ads.zzdng
            @Override // com.google.android.gms.internal.ads.zzbii
            public final void zza(Object obj, Map map) {
                zzdnj.this.zzg(zzcfbVar, (zzcfb) obj, map);
            }
        });
        this.zzi.zzi(zzcfbVar);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.AnyThread;
import androidx.annotation.Nullable;
import androidx.collection.C0470b;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdgx extends zzcrf {
    public static final zzfrr zzc = zzfrr.zzq("3010", "3008", "1005", "1009", "2011", "2007");
    private final zzaua zzA;
    private zzfwk zzB;
    private final Executor zzd;
    private final zzdhc zze;
    private final zzdhk zzf;
    private final zzdic zzg;
    private final zzdhh zzh;
    private final zzdhn zzi;
    private final zzgvi zzj;
    private final zzgvi zzk;
    private final zzgvi zzl;
    private final zzgvi zzm;
    private final zzgvi zzn;
    private zzdiy zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private final zzbxg zzs;
    private final zzaqq zzt;
    private final zzbzz zzu;
    private final Context zzv;
    private final zzdgz zzw;
    private final zzeji zzx;
    private final Map zzy;
    private final List zzz;

    public zzdgx(zzcre zzcreVar, Executor executor, zzdhc zzdhcVar, zzdhk zzdhkVar, zzdic zzdicVar, zzdhh zzdhhVar, zzdhn zzdhnVar, zzgvi zzgviVar, zzgvi zzgviVar2, zzgvi zzgviVar3, zzgvi zzgviVar4, zzgvi zzgviVar5, zzbxg zzbxgVar, zzaqq zzaqqVar, zzbzz zzbzzVar, Context context, zzdgz zzdgzVar, zzeji zzejiVar, zzaua zzauaVar) {
        super(zzcreVar);
        this.zzd = executor;
        this.zze = zzdhcVar;
        this.zzf = zzdhkVar;
        this.zzg = zzdicVar;
        this.zzh = zzdhhVar;
        this.zzi = zzdhnVar;
        this.zzj = zzgviVar;
        this.zzk = zzgviVar2;
        this.zzl = zzgviVar3;
        this.zzm = zzgviVar4;
        this.zzn = zzgviVar5;
        this.zzs = zzbxgVar;
        this.zzt = zzaqqVar;
        this.zzu = zzbzzVar;
        this.zzv = context;
        this.zzw = zzdgzVar;
        this.zzx = zzejiVar;
        this.zzy = new HashMap();
        this.zzz = new ArrayList();
        this.zzA = zzauaVar;
    }

    public static boolean zzW(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjh)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        long zzs = com.google.android.gms.ads.internal.util.zzs.zzs(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (zzs >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzji)).intValue()) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    private final synchronized View zzY(Map map) {
        if (map == null) {
            return null;
        }
        zzfrr zzfrrVar = zzc;
        int size = zzfrrVar.size();
        int i = 0;
        while (i < size) {
            WeakReference weakReference = (WeakReference) map.get((String) zzfrrVar.get(i));
            i++;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
        }
        return null;
    }

    @Nullable
    private final synchronized ImageView.ScaleType zzZ() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhy)).booleanValue()) {
            zzdiy zzdiyVar = this.zzo;
            if (zzdiyVar == null) {
                zzbzt.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
                return null;
            }
            IObjectWrapper zzj = zzdiyVar.zzj();
            if (zzj != null) {
                return (ImageView.ScaleType) ObjectWrapper.unwrap(zzj);
            }
            return zzdic.zza;
        }
        return null;
    }

    private final void zzaa(String str, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeQ)).booleanValue()) {
            zzt("Google", true);
            return;
        }
        zzfwb zzv = this.zze.zzv();
        if (zzv == null) {
            return;
        }
        this.zzB = zzfwk.zzf();
        zzfvr.zzq(zzv, new zzdgw(this, "Google", true), this.zzd);
    }

    private final synchronized void zzab(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzq(view, map, map2, zzZ());
        this.zzq = true;
    }

    private final void zzac(View view, @Nullable zzfgo zzfgoVar) {
        zzcfb zzq = this.zze.zzq();
        if (!this.zzh.zzd() || zzfgoVar == null || zzq == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzc(zzfgoVar, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzad */
    public final synchronized void zzy(zzdiy zzdiyVar) {
        Iterator<String> keys;
        View view;
        zzaqm zzc2;
        if (this.zzp) {
            return;
        }
        this.zzo = zzdiyVar;
        this.zzg.zze(zzdiyVar);
        this.zzf.zzy(zzdiyVar.zzf(), zzdiyVar.zzm(), zzdiyVar.zzn(), zzdiyVar, zzdiyVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcn)).booleanValue() && (zzc2 = this.zzt.zzc()) != null) {
            zzc2.zzo(zzdiyVar.zzf());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbE)).booleanValue()) {
            zzezf zzezfVar = this.zzb;
            if (zzezfVar.zzal && (keys = zzezfVar.zzak.keys()) != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    WeakReference weakReference = (WeakReference) this.zzo.zzl().get(next);
                    this.zzy.put(next, Boolean.FALSE);
                    if (weakReference != null && (view = (View) weakReference.get()) != null) {
                        zzatz zzatzVar = new zzatz(this.zzv, view);
                        this.zzz.add(zzatzVar);
                        zzatzVar.zzc(new zzdgv(this, next));
                    }
                }
            }
        }
        if (zzdiyVar.zzi() != null) {
            zzdiyVar.zzi().zzc(this.zzs);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzae */
    public final void zzz(zzdiy zzdiyVar) {
        this.zzf.zzz(zzdiyVar.zzf(), zzdiyVar.zzl());
        if (zzdiyVar.zzh() != null) {
            zzdiyVar.zzh().setClickable(false);
            zzdiyVar.zzh().removeAllViews();
        }
        if (zzdiyVar.zzi() != null) {
            zzdiyVar.zzi().zze(this.zzs);
        }
        this.zzo = null;
    }

    public static /* synthetic */ void zzq(zzdgx zzdgxVar) {
        try {
            zzdhc zzdhcVar = zzdgxVar.zze;
            int zzc2 = zzdhcVar.zzc();
            if (zzc2 == 1) {
                if (zzdgxVar.zzi.zzb() != null) {
                    zzdgxVar.zzaa("Google", true);
                    zzdgxVar.zzi.zzb().zze((zzbfh) zzdgxVar.zzj.zzb());
                }
            } else if (zzc2 == 2) {
                if (zzdgxVar.zzi.zza() != null) {
                    zzdgxVar.zzaa("Google", true);
                    zzdgxVar.zzi.zza().zze((zzbff) zzdgxVar.zzk.zzb());
                }
            } else if (zzc2 == 3) {
                if (zzdgxVar.zzi.zzd(zzdhcVar.zzz()) != null) {
                    if (zzdgxVar.zze.zzr() != null) {
                        zzdgxVar.zzt("Google", true);
                    }
                    zzdgxVar.zzi.zzd(zzdgxVar.zze.zzz()).zze((zzbfk) zzdgxVar.zzn.zzb());
                }
            } else if (zzc2 == 6) {
                if (zzdgxVar.zzi.zzf() != null) {
                    zzdgxVar.zzaa("Google", true);
                    zzdgxVar.zzi.zzf().zze((zzbgn) zzdgxVar.zzl.zzb());
                }
            } else if (zzc2 != 7) {
                zzbzt.zzg("Wrong native template id!");
            } else {
                zzdhn zzdhnVar = zzdgxVar.zzi;
                if (zzdhnVar.zzg() != null) {
                    zzdhnVar.zzg().zzg((zzbkt) zzdgxVar.zzm.zzb());
                }
            }
        } catch (RemoteException e) {
            zzbzt.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }

    public final synchronized void zzA(View view, Map map, Map map2, boolean z) {
        if (this.zzq) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbE)).booleanValue() && this.zzb.zzal) {
            for (String str : this.zzy.keySet()) {
                if (!((Boolean) this.zzy.get(str)).booleanValue()) {
                    return;
                }
            }
        }
        if (!z) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdC)).booleanValue() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    View view2 = (View) ((WeakReference) entry.getValue()).get();
                    if (view2 != null && zzW(view2)) {
                        zzab(view, map, map2);
                        return;
                    }
                }
            }
            return;
        }
        View zzY = zzY(map);
        if (zzY == null) {
            zzab(view, map, map2);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdD)).booleanValue()) {
            if (zzW(zzY)) {
                zzab(view, map, map2);
                return;
            }
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdE)).booleanValue()) {
            zzab(view, map, map2);
            return;
        }
        Rect rect = new Rect();
        if (zzY.getGlobalVisibleRect(rect, null) && zzY.getHeight() == rect.height() && zzY.getWidth() == rect.width()) {
            zzab(view, map, map2);
        }
    }

    public final synchronized void zzB(@Nullable com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        this.zzf.zzj(zzcwVar);
    }

    public final synchronized void zzC(View view, View view2, Map map, Map map2, boolean z) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzk(view, view2, map, map2, z, zzZ());
        if (this.zzr) {
            zzdhc zzdhcVar = this.zze;
            if (zzdhcVar.zzr() != null) {
                zzdhcVar.zzr().zzd("onSdkAdUserInteractionClick", new C0470b());
            }
        }
    }

    public final synchronized void zzD(@Nullable final View view, final int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjP)).booleanValue()) {
            zzdiy zzdiyVar = this.zzo;
            if (zzdiyVar == null) {
                zzbzt.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                return;
            }
            final boolean z = zzdiyVar instanceof zzdhw;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgn
                @Override // java.lang.Runnable
                public final void run() {
                    zzdgx.this.zzv(view, z, i);
                }
            });
        }
    }

    public final synchronized void zzE(String str) {
        this.zzf.zzl(str);
    }

    public final synchronized void zzF(Bundle bundle) {
        this.zzf.zzm(bundle);
    }

    public final synchronized void zzG() {
        zzdiy zzdiyVar = this.zzo;
        if (zzdiyVar == null) {
            zzbzt.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        final boolean z = zzdiyVar instanceof zzdhw;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgs
            @Override // java.lang.Runnable
            public final void run() {
                zzdgx.this.zzw(z);
            }
        });
    }

    public final synchronized void zzH() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzr();
    }

    public final void zzI(final View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeQ)).booleanValue()) {
            zzac(view, this.zze.zzt());
            return;
        }
        zzfwk zzfwkVar = this.zzB;
        if (zzfwkVar == null) {
            return;
        }
        zzfwkVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgo
            @Override // java.lang.Runnable
            public final void run() {
                zzdgx.this.zzx(view);
            }
        }, this.zzd);
    }

    public final synchronized void zzJ(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzs(view, motionEvent, view2);
    }

    public final synchronized void zzK(Bundle bundle) {
        this.zzf.zzt(bundle);
    }

    public final synchronized void zzL(View view) {
        this.zzf.zzu(view);
    }

    public final synchronized void zzM() {
        this.zzf.zzv();
    }

    public final synchronized void zzN(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzf.zzw(zzcsVar);
    }

    public final synchronized void zzO(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        this.zzx.zza(zzdgVar);
    }

    public final synchronized void zzP(zzbgk zzbgkVar) {
        this.zzf.zzx(zzbgkVar);
    }

    public final synchronized void zzQ(final zzdiy zzdiyVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbC)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgt
                @Override // java.lang.Runnable
                public final void run() {
                    zzdgx.this.zzy(zzdiyVar);
                }
            });
        } else {
            zzy(zzdiyVar);
        }
    }

    public final synchronized void zzR(final zzdiy zzdiyVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbC)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgp
                @Override // java.lang.Runnable
                public final void run() {
                    zzdgx.this.zzz(zzdiyVar);
                }
            });
        } else {
            zzz(zzdiyVar);
        }
    }

    public final boolean zzS() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzT() {
        return this.zzf.zzA();
    }

    public final synchronized boolean zzU() {
        return this.zzf.zzB();
    }

    public final boolean zzV() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzX(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzC = this.zzf.zzC(bundle);
        this.zzq = zzC;
        return zzC;
    }

    public final synchronized int zza() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcrf
    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgu
            @Override // java.lang.Runnable
            public final void run() {
                zzdgx.this.zzu();
            }
        });
        super.zzb();
    }

    public final zzdgz zzc() {
        return this.zzw;
    }

    public final String zzg() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zzf.zze(view, map, map2, zzZ());
    }

    @Override // com.google.android.gms.internal.ads.zzcrf
    @AnyThread
    public final void zzj() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgq
            @Override // java.lang.Runnable
            public final void run() {
                zzdgx.zzq(zzdgx.this);
            }
        });
        if (this.zze.zzc() != 7) {
            Executor executor = this.zzd;
            final zzdhk zzdhkVar = this.zzf;
            zzdhkVar.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdgr
                @Override // java.lang.Runnable
                public final void run() {
                    zzdhk.this.zzp();
                }
            });
        }
        super.zzj();
    }

    public final synchronized JSONObject zzk(View view, Map map, Map map2) {
        return this.zzf.zzf(view, map, map2, zzZ());
    }

    public final void zzr(View view) {
        zzfgo zzt = this.zze.zzt();
        if (!this.zzh.zzd() || zzt == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzA();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeK)).booleanValue() && zzfgm.zzb()) {
            zzt.zzb(view, zzfgu.NOT_VISIBLE, "Ad overlay");
        }
    }

    public final synchronized void zzs() {
        this.zzf.zzh();
    }

    public final void zzt(String str, boolean z) {
        String str2;
        zzebt zzebtVar;
        zzebu zzebuVar;
        if (!this.zzh.zzd() || TextUtils.isEmpty(str)) {
            return;
        }
        zzdhc zzdhcVar = this.zze;
        zzcfb zzq = zzdhcVar.zzq();
        zzcfb zzr = zzdhcVar.zzr();
        if (zzq == null && zzr == null) {
            zzbzt.zzj("Omid display and video webview are null. Skipping initialization.");
            return;
        }
        boolean z2 = false;
        boolean z3 = zzq != null;
        boolean z4 = zzr != null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeO)).booleanValue()) {
            this.zzh.zza();
            int zzb = this.zzh.zza().zzb();
            int i = zzb - 1;
            if (i != 0) {
                if (i != 1) {
                    zzbzt.zzj("Unknown omid media type: " + (zzb != 1 ? zzb != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO") + ". Not initializing Omid.");
                    return;
                } else if (zzq == null) {
                    zzbzt.zzj("Omid media type was display but there was no display webview.");
                    return;
                } else {
                    z4 = false;
                    z2 = true;
                }
            } else if (zzr == null) {
                zzbzt.zzj("Omid media type was video but there was no video webview.");
                return;
            } else {
                z4 = true;
            }
        } else {
            z2 = z3;
        }
        if (z2) {
            str2 = null;
        } else {
            str2 = "javascript";
            zzq = zzr;
        }
        String str3 = str2;
        zzq.zzG();
        if (!com.google.android.gms.ads.internal.zzt.zzA().zze(this.zzv)) {
            zzbzt.zzj("Failed to initialize omid in InternalNativeAd");
            return;
        }
        zzbzz zzbzzVar = this.zzu;
        String str4 = zzbzzVar.zzb + "." + zzbzzVar.zzc;
        if (z4) {
            zzebtVar = zzebt.VIDEO;
            zzebuVar = zzebu.DEFINED_BY_JAVASCRIPT;
        } else {
            zzebtVar = zzebt.NATIVE_DISPLAY;
            zzebuVar = this.zze.zzc() == 3 ? zzebu.UNSPECIFIED : zzebu.ONE_PIXEL;
        }
        zzfgo zzb2 = com.google.android.gms.ads.internal.zzt.zzA().zzb(str4, zzq.zzG(), "", "javascript", str3, str, zzebuVar, zzebtVar, this.zzb.zzam);
        if (zzb2 == null) {
            zzbzt.zzj("Failed to create omid session in InternalNativeAd");
            return;
        }
        this.zze.zzV(zzb2);
        zzq.zzap(zzb2);
        if (z4) {
            com.google.android.gms.ads.internal.zzt.zzA().zzc(zzb2, zzr.zzF());
            this.zzr = true;
        }
        if (z) {
            com.google.android.gms.ads.internal.zzt.zzA().zzd(zzb2);
            zzq.zzd("onSdkLoaded", new C0470b());
        }
    }

    public final /* synthetic */ void zzu() {
        this.zzf.zzi();
        this.zze.zzH();
    }

    public final /* synthetic */ void zzv(View view, boolean z, int i) {
        this.zzf.zzo(view, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzZ(), i);
    }

    public final /* synthetic */ void zzw(boolean z) {
        this.zzf.zzo(null, this.zzo.zzf(), this.zzo.zzl(), this.zzo.zzm(), z, zzZ(), 0);
    }

    public final /* synthetic */ void zzx(View view) {
        zzac(view, this.zze.zzt());
    }
}

package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbjf;
import com.google.android.gms.internal.ads.zzbji;
import com.google.android.gms.internal.ads.zzbny;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzbvp;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcgw;
import com.google.android.gms.internal.ads.zzdhw;
import com.google.android.gms.internal.ads.zzdhy;
import com.google.android.gms.internal.ads.zzdrk;
import com.google.android.gms.internal.ads.zzeii;
import com.google.android.gms.internal.ads.zzeuf;
import com.google.android.gms.internal.ads.zzevt;
import com.google.android.gms.internal.ads.zzexk;
import com.google.android.gms.internal.ads.zzeyy;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ClientApi extends zzcd {
    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbny zzbnyVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzeii(zzcgw.zza(context, zzbnyVar, i), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbny zzbnyVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzeuf zzr = zzcgw.zza(context, zzbnyVar, i).zzr();
        zzr.zza(str);
        zzr.zzb(context);
        return i >= ((Integer) zzba.zzc().zzb(zzbbk.zzeV)).intValue() ? zzr.zzc().zza() : new zzew();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbny zzbnyVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzevt zzs = zzcgw.zza(context, zzbnyVar, i).zzs();
        zzs.zzc(context);
        zzs.zza(zzqVar);
        zzs.zzb(str);
        return zzs.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbny zzbnyVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzexk zzt = zzcgw.zza(context, zzbnyVar, i).zzt();
        zzt.zzc(context);
        zzt.zza(zzqVar);
        zzt.zzb(str);
        return zzt.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, int i) {
        return new zzs((Context) ObjectWrapper.unwrap(iObjectWrapper), zzqVar, str, new zzbzz(231700000, i, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i) {
        return zzcgw.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), null, i).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbny zzbnyVar, int i) {
        return zzcgw.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbnyVar, i).zzk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbeu zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdhy((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 231700000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbfa zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdhw((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbji zzk(IObjectWrapper iObjectWrapper, zzbny zzbnyVar, int i, zzbjf zzbjfVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdrk zzi = zzcgw.zza(context, zzbnyVar, i).zzi();
        zzi.zzb(context);
        zzi.zza(zzbjfVar);
        return zzi.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbro zzl(IObjectWrapper iObjectWrapper, zzbny zzbnyVar, int i) {
        return zzcgw.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbnyVar, i).zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbrv zzm(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new com.google.android.gms.ads.internal.overlay.zzt(activity);
        }
        int i = zza.zzk;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new com.google.android.gms.ads.internal.overlay.zzt(activity) : new zzac(activity) : new zzy(activity, zza) : new zzaf(activity) : new zzae(activity) : new com.google.android.gms.ads.internal.overlay.zzs(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbuz zzn(IObjectWrapper iObjectWrapper, zzbny zzbnyVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzeyy zzu = zzcgw.zza(context, zzbnyVar, i).zzu();
        zzu.zzb(context);
        return zzu.zzc().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbvp zzo(IObjectWrapper iObjectWrapper, String str, zzbny zzbnyVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzeyy zzu = zzcgw.zza(context, zzbnyVar, i).zzu();
        zzu.zzb(context);
        zzu.zza(str);
        return zzu.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbyk zzp(IObjectWrapper iObjectWrapper, zzbny zzbnyVar, int i) {
        return zzcgw.zza((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbnyVar, i).zzo();
    }
}

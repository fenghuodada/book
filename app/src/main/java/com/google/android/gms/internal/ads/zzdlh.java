package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.C0470b;
import androidx.collection.C0482i;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdlh extends zzbfj {
    private final Context zza;
    private final zzdhc zzb;
    private zzdic zzc;
    private zzdgx zzd;

    public zzdlh(Context context, zzdhc zzdhcVar, zzdic zzdicVar, zzdgx zzdgxVar) {
        this.zza = context;
        this.zzb = zzdhcVar;
        this.zzc = zzdicVar;
        this.zzd = zzdgxVar;
    }

    private final zzbed zzd(String str) {
        return new zzdlg(this, "_videoMediaView");
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final com.google.android.gms.ads.internal.client.zzdq zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final zzben zzf() throws RemoteException {
        return this.zzd.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final zzbeq zzg(String str) {
        return (zzbeq) this.zzb.zzh().getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final String zzi() {
        return this.zzb.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final String zzj(String str) {
        return (String) this.zzb.zzi().getOrDefault(str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final List zzk() {
        C0482i zzh = this.zzb.zzh();
        C0482i zzi = this.zzb.zzi();
        String[] strArr = new String[zzh.f1531c + zzi.f1531c];
        int i = 0;
        for (int i2 = 0; i2 < zzh.f1531c; i2++) {
            strArr[i] = (String) zzh.m12398h(i2);
            i++;
        }
        for (int i3 = 0; i3 < zzi.f1531c; i3++) {
            strArr[i] = (String) zzi.m12398h(i3);
            i++;
        }
        return Arrays.asList(strArr);
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zzl() {
        zzdgx zzdgxVar = this.zzd;
        if (zzdgxVar != null) {
            zzdgxVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zzm() {
        String zzB = this.zzb.zzB();
        if ("Google".equals(zzB)) {
            zzbzt.zzj("Illegal argument specified for omid partner name.");
        } else if (TextUtils.isEmpty(zzB)) {
            zzbzt.zzj("Not starting OMID session. OM partner name has not been configured.");
        } else {
            zzdgx zzdgxVar = this.zzd;
            if (zzdgxVar != null) {
                zzdgxVar.zzt(zzB, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zzn(String str) {
        zzdgx zzdgxVar = this.zzd;
        if (zzdgxVar != null) {
            zzdgxVar.zzE(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zzo() {
        zzdgx zzdgxVar = this.zzd;
        if (zzdgxVar != null) {
            zzdgxVar.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zzp(IObjectWrapper iObjectWrapper) {
        zzdgx zzdgxVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof View) || this.zzb.zzt() == null || (zzdgxVar = this.zzd) == null) {
            return;
        }
        zzdgxVar.zzI((View) unwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final boolean zzq() {
        zzdgx zzdgxVar = this.zzd;
        return (zzdgxVar == null || zzdgxVar.zzV()) && this.zzb.zzq() != null && this.zzb.zzr() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        zzdic zzdicVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof ViewGroup) && (zzdicVar = this.zzc) != null && zzdicVar.zzf((ViewGroup) unwrap)) {
            this.zzb.zzp().zzao(zzd("_videoMediaView"));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        zzdic zzdicVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof ViewGroup) && (zzdicVar = this.zzc) != null && zzdicVar.zzg((ViewGroup) unwrap)) {
            this.zzb.zzr().zzao(zzd("_videoMediaView"));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final boolean zzt() {
        zzfgo zzt = this.zzb.zzt();
        if (zzt == null) {
            zzbzt.zzj("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzA().zzd(zzt);
        if (this.zzb.zzq() != null) {
            this.zzb.zzq().zzd("onSdkLoaded", new C0470b());
            return true;
        }
        return true;
    }
}

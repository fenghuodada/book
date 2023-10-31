package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0485b;
import androidx.core.content.C0663f;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzaqr;
import com.google.android.gms.internal.ads.zzavu;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbcr;
import com.google.android.gms.internal.ads.zzbse;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbvc;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcag;
import java.util.Map;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzs extends zzbt {
    private final zzbzz zza;
    private final com.google.android.gms.ads.internal.client.zzq zzb;
    private final Future zzc = zzcag.zza.zzb(new zzo(this));
    private final Context zzd;
    private final zzr zze;
    @Nullable
    private WebView zzf;
    @Nullable
    private zzbh zzg;
    @Nullable
    private zzaqq zzh;
    private AsyncTask zzi;

    public zzs(Context context, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbzz zzbzzVar) {
        this.zzd = context;
        this.zza = zzbzzVar;
        this.zzb = zzqVar;
        this.zzf = new WebView(context);
        this.zze = new zzr(context, str);
        zzV(0);
        this.zzf.setVerticalScrollBarEnabled(false);
        this.zzf.getSettings().setJavaScriptEnabled(true);
        this.zzf.setWebViewClient(new zzm(this));
        this.zzf.setOnTouchListener(new zzn(this));
    }

    public static /* bridge */ /* synthetic */ String zzo(zzs zzsVar, String str) {
        if (zzsVar.zzh != null) {
            Uri parse = Uri.parse(str);
            try {
                parse = zzsVar.zzh.zza(parse, zzsVar.zzd, null, null);
            } catch (zzaqr e) {
                zzbzt.zzk("Unable to process ad data", e);
            }
            return parse.toString();
        }
        return str;
    }

    public static /* bridge */ /* synthetic */ void zzw(zzs zzsVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        zzsVar.zzd.startActivity(intent);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB() throws RemoteException {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzbe zzbeVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(zzbh zzbhVar) throws RemoteException {
        this.zzg = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(zzby zzbyVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(zzcb zzcbVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzavu zzavuVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(zzw zzwVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzci zzciVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(zzdu zzduVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbse zzbseVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(zzbci zzbciVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(zzdg zzdgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbsh zzbshVar, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbvc zzbvcVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(zzfl zzflVar) {
        throw new IllegalStateException("Unused method");
    }

    @VisibleForTesting
    public final void zzV(int i) {
        if (this.zzf == null) {
            return;
        }
        this.zzf.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzY() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        Preconditions.checkNotNull(this.zzf, "This Search Ad has already been torn down");
        this.zze.zzf(zzlVar, this.zza);
        this.zzi = new zzq(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzab(zzcf zzcfVar) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @VisibleForTesting
    public final int zzb(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("height");
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            zzay.zzb();
            return zzbzm.zzx(this.zzd, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzq zzg() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbh zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzcb zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final zzdn zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final zzdq zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() throws RemoteException {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzf);
    }

    @VisibleForTesting
    public final String zzp() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbcr.zzd.zze());
        builder.appendQueryParameter("query", this.zze.zzd());
        builder.appendQueryParameter("pubId", this.zze.zzc());
        builder.appendQueryParameter("mappver", this.zze.zza());
        Map zze = this.zze.zze();
        for (String str : zze.keySet()) {
            builder.appendQueryParameter(str, (String) zze.get(str));
        }
        Uri build = builder.build();
        zzaqq zzaqqVar = this.zzh;
        if (zzaqqVar != null) {
            try {
                build = zzaqqVar.zzb(build, this.zzd);
            } catch (zzaqr e) {
                zzbzt.zzk("Unable to process ad data", e);
            }
        }
        return C0485b.m12391a(zzq(), "#", build.getEncodedQuery());
    }

    @VisibleForTesting
    public final String zzq() {
        String zzb = this.zze.zzb();
        if (true == TextUtils.isEmpty(zzb)) {
            zzb = "www.google.com";
        }
        return C0663f.m12005a("https://", zzb, (String) zzbcr.zzd.zze());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final String zzs() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final String zzt() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzi.cancel(true);
        this.zzc.cancel(true);
        this.zzf.destroy();
        this.zzf = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz() throws RemoteException {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }
}

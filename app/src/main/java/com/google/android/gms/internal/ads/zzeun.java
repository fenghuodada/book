package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class zzeun implements zzejv {
    protected final zzcgw zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzevd zzd;
    private final zzeww zze;
    private final zzbzz zzf;
    private final ViewGroup zzg;
    private final zzfft zzh;
    private final zzezy zzi;
    @Nullable
    private zzfwb zzj;

    public zzeun(Context context, Executor executor, zzcgw zzcgwVar, zzeww zzewwVar, zzevd zzevdVar, zzezy zzezyVar, zzbzz zzbzzVar) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcgwVar;
        this.zze = zzewwVar;
        this.zzd = zzevdVar;
        this.zzi = zzezyVar;
        this.zzf = zzbzzVar;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcgwVar.zzy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized zzcuo zzm(zzewu zzewuVar) {
        zzeum zzeumVar = (zzeum) zzewuVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhI)).booleanValue()) {
            zzcpa zzcpaVar = new zzcpa(this.zzg);
            zzcuq zzcuqVar = new zzcuq();
            zzcuqVar.zze(this.zzb);
            zzcuqVar.zzi(zzeumVar.zza);
            zzcus zzj = zzcuqVar.zzj();
            zzdat zzdatVar = new zzdat();
            zzdatVar.zzc(this.zzd, this.zzc);
            zzdatVar.zzl(this.zzd, this.zzc);
            return zze(zzcpaVar, zzj, zzdatVar.zzn());
        }
        zzevd zzi = zzevd.zzi(this.zzd);
        zzdat zzdatVar2 = new zzdat();
        zzdatVar2.zzb(zzi, this.zzc);
        zzdatVar2.zzg(zzi, this.zzc);
        zzdatVar2.zzh(zzi, this.zzc);
        zzdatVar2.zzi(zzi, this.zzc);
        zzdatVar2.zzc(zzi, this.zzc);
        zzdatVar2.zzl(zzi, this.zzc);
        zzdatVar2.zzm(zzi);
        zzcpa zzcpaVar2 = new zzcpa(this.zzg);
        zzcuq zzcuqVar2 = new zzcuq();
        zzcuqVar2.zze(this.zzb);
        zzcuqVar2.zzi(zzeumVar.zza);
        return zze(zzcpaVar2, zzcuqVar2.zzj(), zzdatVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzejv
    public final boolean zza() {
        zzfwb zzfwbVar = this.zzj;
        return (zzfwbVar == null || zzfwbVar.isDone()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:9:0x0026, B:14:0x0045, B:17:0x0056, B:21:0x005c, B:23:0x006c, B:25:0x0074, B:27:0x0089, B:29:0x00a2, B:31:0x00a6, B:32:0x00af, B:12:0x003e), top: B:38:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:9:0x0026, B:14:0x0045, B:17:0x0056, B:21:0x005c, B:23:0x006c, B:25:0x0074, B:27:0x0089, B:29:0x00a2, B:31:0x00a6, B:32:0x00af, B:12:0x003e), top: B:38:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzejv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl r8, java.lang.String r9, com.google.android.gms.internal.ads.zzejt r10, com.google.android.gms.internal.ads.zzeju r11) throws android.os.RemoteException {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeun.zzb(com.google.android.gms.ads.internal.client.zzl, java.lang.String, com.google.android.gms.internal.ads.zzejt, com.google.android.gms.internal.ads.zzeju):boolean");
    }

    public abstract zzcuo zze(zzcpa zzcpaVar, zzcus zzcusVar, zzdav zzdavVar);

    public final /* synthetic */ void zzk() {
        this.zzd.zza(zzfba.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi.zzt(zzwVar);
    }
}

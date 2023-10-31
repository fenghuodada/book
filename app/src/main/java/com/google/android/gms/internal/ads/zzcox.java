package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzcox extends zzcrf {
    @Nullable
    private final zzcfb zzc;
    private final int zzd;
    private final Context zze;
    private final zzcom zzf;
    private final zzdey zzg;
    private final zzdce zzh;
    private final zzcvv zzi;
    private final boolean zzj;
    private boolean zzk;

    public zzcox(zzcre zzcreVar, Context context, @Nullable zzcfb zzcfbVar, int i, zzcom zzcomVar, zzdey zzdeyVar, zzdce zzdceVar, zzcvv zzcvvVar) {
        super(zzcreVar);
        this.zzk = false;
        this.zzc = zzcfbVar;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzcomVar;
        this.zzg = zzdeyVar;
        this.zzh = zzdceVar;
        this.zzi = zzcvvVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeY)).booleanValue();
    }

    public final int zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcrf
    public final void zzb() {
        super.zzb();
        zzcfb zzcfbVar = this.zzc;
        if (zzcfbVar != null) {
            zzcfbVar.destroy();
        }
    }

    public final void zzc(zzavl zzavlVar) {
        zzcfb zzcfbVar = this.zzc;
        if (zzcfbVar != null) {
            zzcfbVar.zzah(zzavlVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r3 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(android.app.Activity r3, com.google.android.gms.internal.ads.zzavy r4, boolean r5) throws android.os.RemoteException {
        /*
            r2 = this;
            if (r3 != 0) goto L4
            android.content.Context r3 = r2.zze
        L4:
            boolean r4 = r2.zzj
            if (r4 == 0) goto Ld
            com.google.android.gms.internal.ads.zzdce r4 = r2.zzh
            r4.zzb()
        Ld:
            com.google.android.gms.internal.ads.zzbbc r4 = com.google.android.gms.internal.ads.zzbbk.zzaB
            com.google.android.gms.internal.ads.zzbbi r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r0.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L61
            com.google.android.gms.ads.internal.zzt.zzp()
            boolean r4 = com.google.android.gms.ads.internal.util.zzs.zzC(r3)
            if (r4 == 0) goto L61
            java.lang.String r4 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.zzbzt.zzj(r4)
            com.google.android.gms.internal.ads.zzcvv r4 = r2.zzi
            r4.zzb()
            com.google.android.gms.internal.ads.zzbbc r4 = com.google.android.gms.internal.ads.zzbbk.zzaC
            com.google.android.gms.internal.ads.zzbbi r5 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r5.zzb(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L94
            com.google.android.gms.internal.ads.zzfje r4 = new com.google.android.gms.internal.ads.zzfje
            android.content.Context r3 = r3.getApplicationContext()
            com.google.android.gms.ads.internal.util.zzbv r5 = com.google.android.gms.ads.internal.zzt.zzt()
            android.os.Looper r5 = r5.zzb()
            r4.<init>(r3, r5)
            com.google.android.gms.internal.ads.zzezr r3 = r2.zza
            com.google.android.gms.internal.ads.zzezq r3 = r3.zzb
            com.google.android.gms.internal.ads.zzezi r3 = r3.zzb
            java.lang.String r3 = r3.zzb
            r4.zza(r3)
            return
        L61:
            boolean r4 = r2.zzk
            if (r4 == 0) goto L76
            java.lang.String r4 = "App open interstitial ad is already visible."
            com.google.android.gms.internal.ads.zzbzt.zzj(r4)
            com.google.android.gms.internal.ads.zzcvv r4 = r2.zzi
            r0 = 10
            r1 = 0
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfba.zzd(r0, r1, r1)
            r4.zza(r0)
        L76:
            boolean r4 = r2.zzk
            if (r4 != 0) goto L94
            com.google.android.gms.internal.ads.zzdey r4 = r2.zzg     // Catch: com.google.android.gms.internal.ads.zzdex -> L8e
            com.google.android.gms.internal.ads.zzcvv r0 = r2.zzi     // Catch: com.google.android.gms.internal.ads.zzdex -> L8e
            r4.zza(r5, r3, r0)     // Catch: com.google.android.gms.internal.ads.zzdex -> L8e
            boolean r3 = r2.zzj     // Catch: com.google.android.gms.internal.ads.zzdex -> L8e
            if (r3 == 0) goto L8a
            com.google.android.gms.internal.ads.zzdce r3 = r2.zzh     // Catch: com.google.android.gms.internal.ads.zzdex -> L8e
            r3.zza()     // Catch: com.google.android.gms.internal.ads.zzdex -> L8e
        L8a:
            r3 = 1
            r2.zzk = r3
            return
        L8e:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzcvv r4 = r2.zzi
            r4.zzc(r3)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcox.zzd(android.app.Activity, com.google.android.gms.internal.ads.zzavy, boolean):void");
    }

    public final void zze(long j, int i) {
        this.zzf.zza(j, i);
    }
}

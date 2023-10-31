package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzffh implements zzfff {
    private final Context zza;
    private final int zzo;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzp = 2;
    private int zzq = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private boolean zzm = false;
    private boolean zzn = false;

    public zzffh(Context context, int i) {
        this.zza = context;
        this.zzo = i;
    }

    public final synchronized zzffh zzH(int i) {
        this.zzp = i;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final /* bridge */ /* synthetic */ zzfff zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final /* bridge */ /* synthetic */ zzfff zzb(zzezq zzezqVar) {
        zzr(zzezqVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final /* bridge */ /* synthetic */ zzfff zzc(String str) {
        zzs(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final /* bridge */ /* synthetic */ zzfff zzd(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final /* bridge */ /* synthetic */ zzfff zze(String str) {
        zzu(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final /* bridge */ /* synthetic */ zzfff zzf(boolean z) {
        zzv(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final /* bridge */ /* synthetic */ zzfff zzg(Throwable th) {
        zzw(th);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final /* bridge */ /* synthetic */ zzfff zzh() {
        zzx();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final /* bridge */ /* synthetic */ zzfff zzi() {
        zzy();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final synchronized boolean zzj() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final boolean zzk() {
        return !TextUtils.isEmpty(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    @Nullable
    public final synchronized zzffj zzl() {
        if (this.zzm) {
            return null;
        }
        this.zzm = true;
        if (!this.zzn) {
            zzx();
        }
        if (this.zzc < 0) {
            zzy();
        }
        return new zzffj(this, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final /* bridge */ /* synthetic */ zzfff zzm(int i) {
        zzH(i);
        return this;
    }

    public final synchronized zzffh zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder == null) {
            return this;
        }
        zzcvb zzcvbVar = (zzcvb) iBinder;
        String zzk = zzcvbVar.zzk();
        if (!TextUtils.isEmpty(zzk)) {
            this.zzf = zzk;
        }
        String zzi = zzcvbVar.zzi();
        if (!TextUtils.isEmpty(zzi)) {
            this.zzg = zzi;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x002b, code lost:
        r2.zzg = r0.zzac;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.zzffh zzr(com.google.android.gms.internal.ads.zzezq r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzezi r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L11
            com.google.android.gms.internal.ads.zzezi r0 = r3.zzb     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.zzb     // Catch: java.lang.Throwable -> L31
            r2.zzf = r0     // Catch: java.lang.Throwable -> L31
        L11:
            java.util.List r3 = r3.zza     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L31
        L17:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.internal.ads.zzezf r0 = (com.google.android.gms.internal.ads.zzezf) r0     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r0.zzac     // Catch: java.lang.Throwable -> L31
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L17
            java.lang.String r3 = r0.zzac     // Catch: java.lang.Throwable -> L31
            r2.zzg = r3     // Catch: java.lang.Throwable -> L31
        L2f:
            monitor-exit(r2)
            return r2
        L31:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzffh.zzr(com.google.android.gms.internal.ads.zzezq):com.google.android.gms.internal.ads.zzffh");
    }

    public final synchronized zzffh zzs(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzim)).booleanValue()) {
            this.zzl = str;
        }
        return this;
    }

    public final synchronized zzffh zzt(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzffh zzu(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzffh zzv(boolean z) {
        this.zzd = z;
        return this;
    }

    public final synchronized zzffh zzw(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzim)).booleanValue()) {
            this.zzk = zzbsy.zzd(th);
            this.zzj = (String) zzfpm.zzc(zzfok.zzc('\n')).zzd(zzbsy.zzc(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzffh zzx() {
        Configuration configuration;
        this.zze = com.google.android.gms.ads.internal.zzt.zzq().zzn(this.zza);
        Resources resources = this.zza.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzq = i;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        this.zzn = true;
        return this;
    }

    public final synchronized zzffh zzy() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        return this;
    }
}

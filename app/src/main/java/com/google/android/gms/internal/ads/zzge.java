package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzge implements zzfx {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzfx zzc;
    @Nullable
    private zzfx zzd;
    @Nullable
    private zzfx zze;
    @Nullable
    private zzfx zzf;
    @Nullable
    private zzfx zzg;
    @Nullable
    private zzfx zzh;
    @Nullable
    private zzfx zzi;
    @Nullable
    private zzfx zzj;
    @Nullable
    private zzfx zzk;

    public zzge(Context context, zzfx zzfxVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzfxVar;
    }

    private final zzfx zzg() {
        if (this.zze == null) {
            zzfq zzfqVar = new zzfq(this.zza);
            this.zze = zzfqVar;
            zzh(zzfqVar);
        }
        return this.zze;
    }

    private final void zzh(zzfx zzfxVar) {
        for (int i = 0; i < this.zzb.size(); i++) {
            zzfxVar.zzf((zzgz) this.zzb.get(i));
        }
    }

    private static final void zzi(@Nullable zzfx zzfxVar, zzgz zzgzVar) {
        if (zzfxVar != null) {
            zzfxVar.zzf(zzgzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        zzfx zzfxVar = this.zzk;
        zzfxVar.getClass();
        return zzfxVar.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) throws IOException {
        zzfx zzfxVar;
        zzdy.zzf(this.zzk == null);
        String scheme = zzgcVar.zza.getScheme();
        Uri uri = zzgcVar.zza;
        int i = zzfn.zza;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || "file".equals(scheme2)) {
            String path = zzgcVar.zza.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzgn zzgnVar = new zzgn();
                    this.zzd = zzgnVar;
                    zzh(zzgnVar);
                }
                zzfxVar = this.zzd;
            }
            zzfxVar = zzg();
        } else {
            if (!"asset".equals(scheme)) {
                if ("content".equals(scheme)) {
                    if (this.zzf == null) {
                        zzfu zzfuVar = new zzfu(this.zza);
                        this.zzf = zzfuVar;
                        zzh(zzfuVar);
                    }
                    zzfxVar = this.zzf;
                } else if ("rtmp".equals(scheme)) {
                    if (this.zzg == null) {
                        try {
                            zzfx zzfxVar2 = (zzfx) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                            this.zzg = zzfxVar2;
                            zzh(zzfxVar2);
                        } catch (ClassNotFoundException unused) {
                            zzer.zze("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e) {
                            throw new RuntimeException("Error instantiating RTMP extension", e);
                        }
                        if (this.zzg == null) {
                            this.zzg = this.zzc;
                        }
                    }
                    zzfxVar = this.zzg;
                } else if ("udp".equals(scheme)) {
                    if (this.zzh == null) {
                        zzhb zzhbVar = new zzhb(AdError.SERVER_ERROR_CODE);
                        this.zzh = zzhbVar;
                        zzh(zzhbVar);
                    }
                    zzfxVar = this.zzh;
                } else if ("data".equals(scheme)) {
                    if (this.zzi == null) {
                        zzfv zzfvVar = new zzfv();
                        this.zzi = zzfvVar;
                        zzh(zzfvVar);
                    }
                    zzfxVar = this.zzi;
                } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                    if (this.zzj == null) {
                        zzgx zzgxVar = new zzgx(this.zza);
                        this.zzj = zzgxVar;
                        zzh(zzgxVar);
                    }
                    zzfxVar = this.zzj;
                } else {
                    zzfxVar = this.zzc;
                }
            }
            zzfxVar = zzg();
        }
        this.zzk = zzfxVar;
        return this.zzk.zzb(zzgcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    @Nullable
    public final Uri zzc() {
        zzfx zzfxVar = this.zzk;
        if (zzfxVar == null) {
            return null;
        }
        return zzfxVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() throws IOException {
        zzfx zzfxVar = this.zzk;
        if (zzfxVar != null) {
            try {
                zzfxVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Map zze() {
        zzfx zzfxVar = this.zzk;
        return zzfxVar == null ? Collections.emptyMap() : zzfxVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzf(zzgz zzgzVar) {
        zzgzVar.getClass();
        this.zzc.zzf(zzgzVar);
        this.zzb.add(zzgzVar);
        zzi(this.zzd, zzgzVar);
        zzi(this.zze, zzgzVar);
        zzi(this.zzf, zzgzVar);
        zzi(this.zzg, zzgzVar);
        zzi(this.zzh, zzgzVar);
        zzi(this.zzi, zzgzVar);
        zzi(this.zzj, zzgzVar);
    }
}

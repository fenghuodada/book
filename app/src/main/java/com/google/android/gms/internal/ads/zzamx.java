package com.google.android.gms.internal.ads;

import android.support.p000v4.media.session.C0017a;
import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes.dex */
public final class zzamx extends zzgux {
    private Date zza;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzgvh zzm;
    private long zzn;

    public zzamx() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzgvh.zza;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieHeaderBox[creationTime=");
        sb.append(this.zza);
        sb.append(";modificationTime=");
        sb.append(this.zzh);
        sb.append(";timescale=");
        sb.append(this.zzi);
        sb.append(";duration=");
        sb.append(this.zzj);
        sb.append(";rate=");
        sb.append(this.zzk);
        sb.append(";volume=");
        sb.append(this.zzl);
        sb.append(";matrix=");
        sb.append(this.zzm);
        sb.append(";nextTrackId=");
        return C0017a.m13071a(sb, this.zzn, "]");
    }

    public final long zzd() {
        return this.zzj;
    }

    public final long zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzguv
    public final void zzf(ByteBuffer byteBuffer) {
        long zze;
        zzi(byteBuffer);
        if (zzh() == 1) {
            this.zza = zzgvc.zza(zzamt.zzf(byteBuffer));
            this.zzh = zzgvc.zza(zzamt.zzf(byteBuffer));
            this.zzi = zzamt.zze(byteBuffer);
            zze = zzamt.zzf(byteBuffer);
        } else {
            this.zza = zzgvc.zza(zzamt.zze(byteBuffer));
            this.zzh = zzgvc.zza(zzamt.zze(byteBuffer));
            this.zzi = zzamt.zze(byteBuffer);
            zze = zzamt.zze(byteBuffer);
        }
        this.zzj = zze;
        this.zzk = zzamt.zzb(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.zzl = ((short) ((bArr[1] & 255) | ((short) (65280 & (bArr[0] << 8))))) / 256.0f;
        zzamt.zzd(byteBuffer);
        zzamt.zze(byteBuffer);
        zzamt.zze(byteBuffer);
        double zzb = zzamt.zzb(byteBuffer);
        double zzb2 = zzamt.zzb(byteBuffer);
        double zza = zzamt.zza(byteBuffer);
        this.zzm = new zzgvh(zzb, zzb2, zzamt.zzb(byteBuffer), zzamt.zzb(byteBuffer), zza, zzamt.zza(byteBuffer), zzamt.zza(byteBuffer), zzamt.zzb(byteBuffer), zzamt.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzamt.zze(byteBuffer);
    }
}

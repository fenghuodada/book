package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.core.provider.C0758e;

/* loaded from: classes.dex */
public final class zzrr extends Exception {
    public final String zza;
    public final boolean zzb;
    @Nullable
    public final zzrp zzc;
    @Nullable
    public final String zzd;
    @Nullable
    public final zzrr zze;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzrr(com.google.android.gms.internal.ads.zzam r11, @androidx.annotation.Nullable java.lang.Throwable r12, boolean r13, int r14) {
        /*
            r10 = this;
            java.lang.String r13 = java.lang.String.valueOf(r11)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Decoder init failed: ["
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r1 = "], "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r3 = r0.toString()
            java.lang.String r5 = r11.zzm
            r6 = 0
            r7 = 0
            int r11 = java.lang.Math.abs(r14)
            java.lang.String r13 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_"
            java.lang.String r8 = androidx.appcompat.view.menu.C0235r.m12816a(r13, r11)
            r9 = 0
            r2 = r10
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrr.<init>(com.google.android.gms.internal.ads.zzam, java.lang.Throwable, boolean, int):void");
    }

    private zzrr(String str, @Nullable Throwable th, String str2, boolean z, @Nullable zzrp zzrpVar, @Nullable String str3, @Nullable zzrr zzrrVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzrpVar;
        this.zzd = str3;
        this.zze = zzrrVar;
    }

    public static /* bridge */ /* synthetic */ zzrr zza(zzrr zzrrVar, zzrr zzrrVar2) {
        return new zzrr(zzrrVar.getMessage(), zzrrVar.getCause(), zzrrVar.zza, false, zzrrVar.zzc, zzrrVar.zzd, zzrrVar2);
    }

    public zzrr(zzam zzamVar, @Nullable Throwable th, boolean z, zzrp zzrpVar) {
        this(C0758e.m11827a("Decoder init failed: ", zzrpVar.zza, ", ", String.valueOf(zzamVar)), th, zzamVar.zzm, false, zzrpVar, (zzfn.zza < 21 || !(th instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) th).getDiagnosticInfo(), null);
    }
}

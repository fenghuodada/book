package com.google.android.gms.internal.ads;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.io.IOException;
import okhttp3.internal.p064ws.WebSocketProtocol;

/* loaded from: classes.dex */
public final class zzia extends zzcg {
    public static final zzn zzd = new zzn() { // from class: com.google.android.gms.internal.ads.zzhz
    };
    private static final String zzl = Integer.toString(1001, 36);
    private static final String zzm = Integer.toString(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 36);
    private static final String zzn = Integer.toString(1003, 36);
    private static final String zzo = Integer.toString(1004, 36);
    private static final String zzp = Integer.toString(WebSocketProtocol.CLOSE_NO_STATUS_CODE, 36);
    private static final String zzq = Integer.toString(1006, 36);
    public final int zze;
    @Nullable
    public final String zzf;
    public final int zzg;
    @Nullable
    public final zzam zzh;
    public final int zzi;
    @Nullable
    public final zzbx zzj;
    final boolean zzk;

    private zzia(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private zzia(int r14, @androidx.annotation.Nullable java.lang.Throwable r15, @androidx.annotation.Nullable java.lang.String r16, int r17, @androidx.annotation.Nullable java.lang.String r18, int r19, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzam r20, int r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            r8 = r21
            if (r4 == 0) goto L59
            r0 = 1
            if (r4 == r0) goto Lf
            java.lang.String r0 = "Unexpected runtime error"
            r5 = r18
            r6 = r19
            goto L5f
        Lf:
            java.lang.String r1 = java.lang.String.valueOf(r20)
            int r2 = com.google.android.gms.internal.ads.zzfn.zza
            if (r8 == 0) goto L34
            if (r8 == r0) goto L31
            r0 = 2
            if (r8 == r0) goto L2e
            r0 = 3
            if (r8 == r0) goto L2b
            r0 = 4
            if (r8 != r0) goto L25
            java.lang.String r0 = "YES"
            goto L36
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L2b:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L36
        L2e:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L36
        L31:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L36
        L34:
            java.lang.String r0 = "NO"
        L36:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r18
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r19
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", format_supported="
            java.lang.String r0 = androidx.concurrent.futures.C0484a.m12392a(r2, r1, r0)
            goto L5f
        L59:
            r5 = r18
            r6 = r19
            java.lang.String r0 = "Source error"
        L5f:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L6c
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L6c:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r17
            r4 = r14
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzia.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, com.google.android.gms.internal.ads.zzam, int, boolean):void");
    }

    private zzia(String str, @Nullable Throwable th, int i, int i2, @Nullable String str2, int i3, @Nullable zzam zzamVar, int i4, @Nullable zzbx zzbxVar, long j, boolean z) {
        super(str, th, i, j);
        boolean z2;
        int i5 = i2;
        if (!z) {
            z2 = true;
        } else if (i5 == 1) {
            i5 = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        zzdy.zzd(z2);
        zzdy.zzd(th != null);
        this.zze = i5;
        this.zzf = str2;
        this.zzg = i3;
        this.zzh = zzamVar;
        this.zzi = i4;
        this.zzj = zzbxVar;
        this.zzk = z;
    }

    public static zzia zzb(Throwable th, String str, int i, @Nullable zzam zzamVar, int i2, boolean z, int i3) {
        return new zzia(1, th, null, i3, str, i, zzamVar, zzamVar == null ? 4 : i2, z);
    }

    public static zzia zzc(IOException iOException, int i) {
        return new zzia(0, iOException, i);
    }

    public static zzia zzd(RuntimeException runtimeException, int i) {
        return new zzia(2, runtimeException, i);
    }

    @CheckResult
    public final zzia zza(@Nullable zzbx zzbxVar) {
        String message = getMessage();
        int i = zzfn.zza;
        return new zzia(message, getCause(), this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, zzbxVar, this.zzc, this.zzk);
    }
}

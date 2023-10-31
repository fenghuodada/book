package com.google.android.gms.common;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.RestrictedInheritance;

@CheckReturnValue
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public class PackageSignatureVerifier {
    @Nullable
    @VisibleForTesting
    static volatile zzac zza;
    @Nullable
    private static zzad zzb;

    private static zzad zza() {
        zzad zzadVar;
        synchronized (zzad.class) {
            if (zzb == null) {
                zzb = new zzad();
            }
            zzadVar = zzb;
        }
        return zzadVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (r1.equals(r0) != false) goto L10;
     */
    @androidx.annotation.NonNull
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerified(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull java.lang.String r4) {
        /*
            r2 = this;
            boolean r3 = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(r3)
            zza()
            boolean r0 = com.google.android.gms.common.zzn.zzf()
            if (r0 == 0) goto L5c
            r0 = 1
            if (r0 == r3) goto L13
            java.lang.String r0 = "-0"
            goto L15
        L13:
            java.lang.String r0 = "-1"
        L15:
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.common.zzac r1 = com.google.android.gms.common.PackageSignatureVerifier.zza
            if (r1 == 0) goto L2e
            com.google.android.gms.common.zzac r1 = com.google.android.gms.common.PackageSignatureVerifier.zza
            java.lang.String r1 = com.google.android.gms.common.zzac.zzb(r1)
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L2e
            goto L47
        L2e:
            zza()
            r1 = 0
            com.google.android.gms.common.zzx r3 = com.google.android.gms.common.zzn.zzc(r4, r3, r1, r1)
            boolean r1 = r3.zza
            if (r1 == 0) goto L4e
            com.google.android.gms.common.zzac r1 = new com.google.android.gms.common.zzac
            int r3 = r3.zzd
            com.google.android.gms.common.PackageVerificationResult r3 = com.google.android.gms.common.PackageVerificationResult.zzd(r4, r3)
            r1.<init>(r0, r3)
            com.google.android.gms.common.PackageSignatureVerifier.zza = r1
        L47:
            com.google.android.gms.common.zzac r3 = com.google.android.gms.common.PackageSignatureVerifier.zza
            com.google.android.gms.common.PackageVerificationResult r3 = com.google.android.gms.common.zzac.zza(r3)
            goto L5b
        L4e:
            java.lang.String r0 = r3.zzb
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = r3.zzb
            java.lang.Throwable r3 = r3.zzc
            com.google.android.gms.common.PackageVerificationResult r3 = com.google.android.gms.common.PackageVerificationResult.zza(r4, r0, r3)
        L5b:
            return r3
        L5c:
            com.google.android.gms.common.zzae r3 = new com.google.android.gms.common.zzae
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.PackageSignatureVerifier.queryPackageSignatureVerified(android.content.Context, java.lang.String):com.google.android.gms.common.PackageVerificationResult");
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(@NonNull Context context, @NonNull String str) {
        try {
            PackageVerificationResult queryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            queryPackageSignatureVerified.zzb();
            return queryPackageSignatureVerified;
        } catch (SecurityException e) {
            PackageVerificationResult queryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            if (queryPackageSignatureVerified2.zzc()) {
                Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", e);
                return queryPackageSignatureVerified2;
            }
            return queryPackageSignatureVerified2;
        }
    }
}

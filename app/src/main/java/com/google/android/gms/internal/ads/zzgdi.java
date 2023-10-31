package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final /* synthetic */ class zzgdi {
    static final /* synthetic */ int[] zza;
    static final /* synthetic */ int[] zzb;

    static {
        int[] iArr = new int[zzgjt.values().length];
        zzb = iArr;
        try {
            iArr[zzgjt.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zzb[zzgjt.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[zzgla.values().length];
        zza = iArr2;
        try {
            iArr2[zzgla.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zza[zzgla.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            zza[zzgla.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            zza[zzgla.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}

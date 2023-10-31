package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzapf {
    static boolean zza = false;
    public static final /* synthetic */ int zzc = 0;
    private static MessageDigest zzd;
    private static final Object zze = new Object();
    private static final Object zzf = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    public static String zza(byte[] bArr, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] zzg;
        Vector zzb2 = zzb(bArr, 255);
        if (zzb2 == null || zzb2.size() == 0) {
            zzg = zzg(zzf(4096).zzax(), str, true);
        } else {
            zzaox zza2 = zzaoy.zza();
            int size = zzb2.size();
            for (int i = 0; i < size; i++) {
                zza2.zza(zzgno.zzv(zzg((byte[]) zzb2.get(i), str, false), 0, 256));
            }
            byte[] zze2 = zze(bArr);
            zzgno zzgnoVar = zzgno.zzb;
            zza2.zzb(zzgno.zzv(zze2, 0, zze2.length));
            zzg = ((zzaoy) zza2.zzal()).zzax();
        }
        return zzapb.zza(zzg, true);
    }

    public static Vector zzb(byte[] bArr, int i) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i2 = length + 254;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i2 / 255; i3++) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void zzd() {
        synchronized (zzf) {
            if (!zza) {
                zza = true;
                new Thread(new zzape(null)).start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x001c, code lost:
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.zzapf.zzd.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] zze(byte[] r6) throws java.security.NoSuchAlgorithmException {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzapf.zze
            monitor-enter(r0)
            zzd()     // Catch: java.lang.Throwable -> L32
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = com.google.android.gms.internal.ads.zzapf.zzb     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            r4 = 2
            boolean r2 = r2.await(r4, r3)     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            if (r2 != 0) goto L14
            goto L1a
        L14:
            java.security.MessageDigest r2 = com.google.android.gms.internal.ads.zzapf.zzd     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            if (r1 == 0) goto L2a
            r1.reset()     // Catch: java.lang.Throwable -> L32
            r1.update(r6)     // Catch: java.lang.Throwable -> L32
            java.security.MessageDigest r6 = com.google.android.gms.internal.ads.zzapf.zzd     // Catch: java.lang.Throwable -> L32
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r6
        L2a:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L32
            throw r6     // Catch: java.lang.Throwable -> L32
        L32:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapf.zze(byte[]):byte[]");
    }

    public static zzaol zzf(int i) {
        zzano zza2 = zzaol.zza();
        zza2.zzD(4096L);
        return (zzaol) zza2.zzal();
    }

    private static byte[] zzg(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        ByteBuffer put;
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        if (length > i) {
            bArr = zzf(4096).zzax();
        }
        int length2 = bArr.length;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            put = ByteBuffer.allocate(i + 1).put((byte) length2).put(bArr).put(bArr2);
        } else {
            put = ByteBuffer.allocate(i + 1).put((byte) length2).put(bArr);
        }
        byte[] array = put.array();
        if (z) {
            array = ByteBuffer.allocate(256).put(zze(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        zzapg[] zzapgVarArr = new zzaqf().zzcG;
        int length3 = zzapgVarArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            zzapgVarArr[i2].zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzaoz(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}

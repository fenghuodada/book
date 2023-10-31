package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.appcompat.view.menu.C0235r;
import androidx.core.p003os.C0740h;
import androidx.datastore.preferences.protobuf.C1194j;
import com.applovin.impl.sdk.p033e.C3132a0;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzako {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static X509Certificate[][] zza(String str) throws zzakl, SecurityException, IOException {
        int i;
        RandomAccessFile randomAccessFile = "end > capacity: ";
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            Pair zzc = zzakp.zzc(randomAccessFile2);
            try {
                if (zzc == null) {
                    throw new zzakl("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile2.length() + " bytes");
                }
                ByteBuffer byteBuffer = (ByteBuffer) zzc.first;
                long longValue = ((Long) zzc.second).longValue();
                long j = (-20) + longValue;
                if (j >= 0) {
                    randomAccessFile2.seek(j);
                    if (randomAccessFile2.readInt() == 1347094023) {
                        throw new zzakl("ZIP64 APK not supported");
                    }
                }
                long zza = zzakp.zza(byteBuffer);
                if (zza >= longValue) {
                    throw new zzakl("ZIP Central Directory offset out of range: " + zza + ". ZIP End of Central Directory offset: " + longValue);
                } else if (zzakp.zzb(byteBuffer) + zza != longValue) {
                    throw new zzakl("ZIP Central Directory is not immediately followed by End of Central Directory");
                } else {
                    if (zza < 32) {
                        throw new zzakl("APK too small for APK Signing Block. ZIP Central Directory offset: " + zza);
                    }
                    ByteBuffer allocate = ByteBuffer.allocate(24);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    allocate.order(byteOrder);
                    long j2 = longValue;
                    randomAccessFile2.seek(zza - allocate.capacity());
                    randomAccessFile2.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                    try {
                        if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                            long j3 = allocate.getLong(0);
                            if (j3 < allocate.capacity() || j3 > 2147483639) {
                                throw new zzakl("APK Signing Block size out of range: " + j3);
                            }
                            int i2 = (int) (8 + j3);
                            long j4 = zza - i2;
                            if (j4 < 0) {
                                throw new zzakl("APK Signing Block offset out of range: " + j4);
                            }
                            try {
                                ByteBuffer allocate2 = ByteBuffer.allocate(i2);
                                allocate2.order(byteOrder);
                                randomAccessFile2.seek(j4);
                                randomAccessFile2.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                                long j5 = zza;
                                long j6 = allocate2.getLong(0);
                                if (j6 != j3) {
                                    throw new zzakl("APK Signing Block sizes in header and footer do not match: " + j6 + " vs " + j3);
                                }
                                Pair create = Pair.create(allocate2, Long.valueOf(j4));
                                ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                                long longValue2 = ((Long) create.second).longValue();
                                if (byteBuffer2.order() == byteOrder) {
                                    int capacity = byteBuffer2.capacity() - 24;
                                    if (capacity < 8) {
                                        throw new IllegalArgumentException("end < start: " + capacity + " < 8");
                                    }
                                    int capacity2 = byteBuffer2.capacity();
                                    if (capacity > byteBuffer2.capacity()) {
                                        throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                                    }
                                    int limit = byteBuffer2.limit();
                                    int position = byteBuffer2.position();
                                    try {
                                        byteBuffer2.position(0);
                                    } catch (Throwable th) {
                                        th = th;
                                        i = 0;
                                    }
                                    try {
                                        byteBuffer2.limit(capacity);
                                        byteBuffer2.position(8);
                                        ByteBuffer slice = byteBuffer2.slice();
                                        slice.order(byteBuffer2.order());
                                        byteBuffer2.position(0);
                                        byteBuffer2.limit(limit);
                                        byteBuffer2.position(position);
                                        int i3 = 0;
                                        while (slice.hasRemaining()) {
                                            i3++;
                                            if (slice.remaining() < 8) {
                                                throw new zzakl("Insufficient data to read size of APK Signing Block entry #" + i3);
                                            }
                                            long j7 = slice.getLong();
                                            if (j7 < 4 || j7 > 2147483647L) {
                                                throw new zzakl("APK Signing Block entry #" + i3 + " size out of range: " + j7);
                                            }
                                            int i4 = (int) j7;
                                            int position2 = slice.position() + i4;
                                            if (i4 > slice.remaining()) {
                                                throw new zzakl("APK Signing Block entry #" + i3 + " size out of range: " + i4 + ", available: " + slice.remaining());
                                            } else if (slice.getInt() == 1896449818) {
                                                X509Certificate[][] zzl = zzl(randomAccessFile2.getChannel(), new zzakk(zze(slice, i4 - 4), longValue2, j5, j2, byteBuffer, null));
                                                randomAccessFile2.close();
                                                try {
                                                    randomAccessFile2.close();
                                                } catch (IOException unused) {
                                                }
                                                return zzl;
                                            } else {
                                                long j8 = j2;
                                                long j9 = j5;
                                                slice.position(position2);
                                                j5 = j9;
                                                j2 = j8;
                                            }
                                        }
                                        throw new zzakl("No APK Signature Scheme v2 block in APK Signing Block");
                                    } catch (Throwable th2) {
                                        th = th2;
                                        i = 0;
                                        byteBuffer2.position(i);
                                        byteBuffer2.limit(limit);
                                        byteBuffer2.position(position);
                                        throw th;
                                    }
                                }
                                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                            } catch (Throwable th3) {
                                th = th3;
                                randomAccessFile = randomAccessFile2;
                                try {
                                    randomAccessFile.close();
                                } catch (IOException unused2) {
                                }
                                throw th;
                            }
                        }
                        throw new zzakl("No APK Signing Block before ZIP Central Directory");
                    } catch (Throwable th4) {
                        th = th4;
                        randomAccessFile = allocate;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            randomAccessFile = randomAccessFile2;
        }
    }

    private static int zzb(int i) {
        if (i != 1) {
            if (i == 2) {
                return 64;
            }
            throw new IllegalArgumentException(C0235r.m12816a("Unknown content digest algorthm: ", i));
        }
        return 32;
    }

    private static int zzc(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case 257:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    private static String zzd(int i) {
        if (i != 1) {
            if (i == 2) {
                return "SHA-512";
            }
            throw new IllegalArgumentException(C0235r.m12816a("Unknown content digest algorthm: ", i));
        }
        return "SHA-256";
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i >= 0) {
                if (i <= byteBuffer.remaining()) {
                    return zze(byteBuffer, i);
                }
                throw new IOException(C1194j.m11060a("Length-prefixed field longer than remaining buffer. Field length: ", i, ", remaining: ", byteBuffer.remaining()));
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new IOException(C0235r.m12816a("Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
    }

    private static void zzg(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzaki zzakiVar = new zzaki(fileChannel, 0L, j);
        zzaki zzakiVar2 = new zzaki(fileChannel, j2, j3 - j2);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzakp.zzd(duplicate, j);
        zzakg zzakgVar = new zzakg(duplicate);
        int size = map.size();
        int[] iArr = new int[size];
        int i = 0;
        for (Integer num : map.keySet()) {
            iArr[i] = num.intValue();
            i++;
        }
        try {
            byte[][] zzk = zzk(iArr, new zzakh[]{zzakiVar, zzakiVar2, zzakgVar});
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), zzk[i2])) {
                    throw new SecurityException(zzd(i3).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e) {
            throw new SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    private static byte[] zzi(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i >= 0) {
            if (i <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i];
                byteBuffer.get(bArr);
                return bArr;
            }
            throw new IOException(C1194j.m11060a("Underflow while reading length-prefixed value. Length: ", i, ", available: ", byteBuffer.remaining()));
        }
        throw new IOException("Negative length");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        r11 = zzc(r10);
        r12 = zzc(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r11 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r12 == 1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0120 A[Catch: SignatureException -> 0x022a, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x022c, InvalidKeyException -> 0x022e, InvalidKeySpecException -> 0x0230, NoSuchAlgorithmException -> 0x0232, TryCatch #5 {InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x022c, blocks: (B:60:0x010a, B:62:0x0120, B:63:0x0123), top: B:130:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.security.cert.X509Certificate[] zzj(java.nio.ByteBuffer r21, java.util.Map r22, java.security.cert.CertificateFactory r23) throws java.lang.SecurityException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzako.zzj(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] zzk(int[] iArr, zzakh[] zzakhVarArr) throws DigestException {
        int length;
        int i = 0;
        long j = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            j += (zzakhVarArr[i2].zza() + 1048575) / 1048576;
        }
        if (j < 2097151) {
            byte[][] bArr = new byte[iArr.length];
            int i3 = 0;
            while (true) {
                length = iArr.length;
                if (i3 >= length) {
                    break;
                }
                int i4 = (int) j;
                byte[] bArr2 = new byte[(zzb(iArr[i3]) * i4) + 5];
                bArr2[0] = 90;
                zzg(i4, bArr2, 1);
                bArr[i3] = bArr2;
                i3++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            for (int i5 = 0; i5 < iArr.length; i5++) {
                String zzd = zzd(iArr[i5]);
                try {
                    messageDigestArr[i5] = MessageDigest.getInstance(zzd);
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(zzd.concat(" digest not supported"), e);
                }
            }
            int i6 = 3;
            long j2 = 1048576;
            long j3 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i < i6) {
                zzakh zzakhVar = zzakhVarArr[i];
                int i9 = i;
                int i10 = i7;
                long zza = zzakhVar.zza();
                long j4 = j2;
                long j5 = j3;
                while (zza > j3) {
                    int min = (int) Math.min(zza, j4);
                    zzg(min, bArr3, 1);
                    for (int i11 = 0; i11 < length; i11++) {
                        messageDigestArr[i11].update(bArr3);
                    }
                    try {
                        zzakhVar.zzb(messageDigestArr, j5, min);
                        int i12 = 0;
                        while (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            byte[] bArr4 = bArr[i12];
                            int zzb = zzb(i13);
                            byte[] bArr5 = bArr3;
                            MessageDigest messageDigest = messageDigestArr[i12];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr4, (i8 * zzb) + 5, zzb);
                            if (digest == zzb) {
                                i12++;
                                bArr3 = bArr5;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                            }
                        }
                        byte[] bArr6 = bArr3;
                        long j6 = min;
                        j5 += j6;
                        zza -= j6;
                        i8++;
                        j3 = 0;
                        j4 = 1048576;
                        bArr3 = bArr6;
                        messageDigestArr = messageDigestArr;
                    } catch (IOException e2) {
                        throw new DigestException(C1194j.m11060a("Failed to digest chunk #", i8, " of section #", i10), e2);
                    }
                }
                i7 = i10 + 1;
                i = i9 + 1;
                j3 = 0;
                j2 = 1048576;
                i6 = 3;
                bArr3 = bArr3;
            }
            byte[][] bArr7 = new byte[iArr.length];
            for (int i14 = 0; i14 < iArr.length; i14++) {
                int i15 = iArr[i14];
                byte[] bArr8 = bArr[i14];
                String zzd2 = zzd(i15);
                try {
                    bArr7[i14] = MessageDigest.getInstance(zzd2).digest(bArr8);
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(zzd2.concat(" digest not supported"), e3);
                }
            }
            return bArr7;
        }
        throw new DigestException(C3132a0.m7696a("Too many chunks: ", j));
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zzakk zzakkVar) throws SecurityException {
        ByteBuffer byteBuffer;
        long j;
        long j2;
        long j3;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = zzakkVar.zza;
                ByteBuffer zzf = zzf(byteBuffer);
                int i = 0;
                while (zzf.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zzj(zzf(zzf), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(C0740h.m11849a("Failed to parse/verify signer #", i, " block"), e);
                    }
                }
                if (i > 0) {
                    if (!hashMap.isEmpty()) {
                        j = zzakkVar.zzb;
                        j2 = zzakkVar.zzc;
                        j3 = zzakkVar.zzd;
                        byteBuffer2 = zzakkVar.zze;
                        zzh(hashMap, fileChannel, j, j2, j3, byteBuffer2);
                        return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                    }
                    throw new SecurityException("No content digests found");
                }
                throw new SecurityException("No signers found");
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }
}

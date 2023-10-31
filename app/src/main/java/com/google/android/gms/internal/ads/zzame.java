package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.concurrent.futures.C0486c;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class zzame implements zzaks {
    private final zzamd zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzame(zzamd zzamdVar, int i) {
        this.zzc = zzamdVar;
    }

    public zzame(File file, int i) {
        this.zzc = new zzama(this, file);
    }

    public static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    public static long zzf(InputStream inputStream) throws IOException {
        return (zzn(inputStream) & 255) | ((zzn(inputStream) & 255) << 8) | ((zzn(inputStream) & 255) << 16) | ((zzn(inputStream) & 255) << 24) | ((zzn(inputStream) & 255) << 32) | ((zzn(inputStream) & 255) << 40) | ((zzn(inputStream) & 255) << 48) | ((zzn(inputStream) & 255) << 56);
    }

    public static String zzh(zzamc zzamcVar) throws IOException {
        return new String(zzm(zzamcVar, zzf(zzamcVar)), "UTF-8");
    }

    public static void zzj(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    public static void zzk(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    public static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    @VisibleForTesting
    public static byte[] zzm(zzamc zzamcVar, long j) throws IOException {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        long zza = zzamcVar.zza();
        if (i >= 0 && j <= zza) {
            int i2 = (int) j;
            if (i2 == j) {
                byte[] bArr = new byte[i2];
                new DataInputStream(zzamcVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder m12390a = C0486c.m12390a("streamToBytes length=", j, ", maxLength=");
        m12390a.append(zza);
        throw new IOException(m12390a.toString());
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzamb zzambVar) {
        if (this.zza.containsKey(str)) {
            this.zzb = (zzambVar.zza - ((zzamb) this.zza.get(str)).zza) + this.zzb;
        } else {
            this.zzb += zzambVar.zza;
        }
        this.zza.put(str, zzambVar);
    }

    private final void zzp(String str) {
        zzamb zzambVar = (zzamb) this.zza.remove(str);
        if (zzambVar != null) {
            this.zzb -= zzambVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzaks
    public final synchronized zzakr zza(String str) {
        zzamb zzambVar = (zzamb) this.zza.get(str);
        if (zzambVar == null) {
            return null;
        }
        File zzg = zzg(str);
        try {
            zzamc zzamcVar = new zzamc(new BufferedInputStream(new FileInputStream(zzg)), zzg.length());
            try {
                zzamb zza = zzamb.zza(zzamcVar);
                if (!TextUtils.equals(str, zza.zzb)) {
                    zzalu.zza("%s: key=%s, found=%s", zzg.getAbsolutePath(), str, zza.zzb);
                    zzp(str);
                    return null;
                }
                byte[] zzm = zzm(zzamcVar, zzamcVar.zza());
                zzakr zzakrVar = new zzakr();
                zzakrVar.zza = zzm;
                zzakrVar.zzb = zzambVar.zzc;
                zzakrVar.zzc = zzambVar.zzd;
                zzakrVar.zzd = zzambVar.zze;
                zzakrVar.zze = zzambVar.zzf;
                zzakrVar.zzf = zzambVar.zzg;
                List<zzala> list = zzambVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzala zzalaVar : list) {
                    treeMap.put(zzalaVar.zza(), zzalaVar.zzb());
                }
                zzakrVar.zzg = treeMap;
                zzakrVar.zzh = Collections.unmodifiableList(zzambVar.zzh);
                return zzakrVar;
            } finally {
                zzamcVar.close();
            }
        } catch (IOException e) {
            zzalu.zza("%s: %s", zzg.getAbsolutePath(), e.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaks
    public final synchronized void zzb() {
        long length;
        zzamc zzamcVar;
        File zza = this.zzc.zza();
        if (!zza.exists()) {
            if (zza.mkdirs()) {
                return;
            }
            zzalu.zzb("Unable to create cache dir %s", zza.getAbsolutePath());
            return;
        }
        File[] listFiles = zza.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                try {
                    length = file.length();
                    zzamcVar = new zzamc(new BufferedInputStream(new FileInputStream(file)), length);
                } catch (IOException unused) {
                    file.delete();
                }
                try {
                    zzamb zza2 = zzamb.zza(zzamcVar);
                    zza2.zza = length;
                    zzo(zza2.zzb, zza2);
                    zzamcVar.close();
                } catch (Throwable th) {
                    zzamcVar.close();
                    throw th;
                    break;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaks
    public final synchronized void zzc(String str, boolean z) {
        zzakr zza = zza(str);
        if (zza != null) {
            zza.zzf = 0L;
            zza.zze = 0L;
            zzd(str, zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaks
    public final synchronized void zzd(String str, zzakr zzakrVar) {
        long j = this.zzb;
        int length = zzakrVar.zza.length;
        long j2 = j + length;
        int i = this.zzd;
        if (j2 <= i || length <= i * 0.9f) {
            File zzg = zzg(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(zzg));
                zzamb zzambVar = new zzamb(str, zzakrVar);
                try {
                    zzj(bufferedOutputStream, 538247942);
                    zzl(bufferedOutputStream, zzambVar.zzb);
                    String str2 = zzambVar.zzc;
                    if (str2 == null) {
                        str2 = "";
                    }
                    zzl(bufferedOutputStream, str2);
                    zzk(bufferedOutputStream, zzambVar.zzd);
                    zzk(bufferedOutputStream, zzambVar.zze);
                    zzk(bufferedOutputStream, zzambVar.zzf);
                    zzk(bufferedOutputStream, zzambVar.zzg);
                    List<zzala> list = zzambVar.zzh;
                    if (list != null) {
                        zzj(bufferedOutputStream, list.size());
                        for (zzala zzalaVar : list) {
                            zzl(bufferedOutputStream, zzalaVar.zza());
                            zzl(bufferedOutputStream, zzalaVar.zzb());
                        }
                    } else {
                        zzj(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(zzakrVar.zza);
                    bufferedOutputStream.close();
                    zzambVar.zza = zzg.length();
                    zzo(str, zzambVar);
                    if (this.zzb >= this.zzd) {
                        if (zzalu.zzb) {
                            zzalu.zzd("Pruning old cache entries.", new Object[0]);
                        }
                        long j3 = this.zzb;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator it = this.zza.entrySet().iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            zzamb zzambVar2 = (zzamb) ((Map.Entry) it.next()).getValue();
                            if (zzg(zzambVar2.zzb).delete()) {
                                this.zzb -= zzambVar2.zza;
                            } else {
                                String str3 = zzambVar2.zzb;
                                zzalu.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                            }
                            it.remove();
                            i2++;
                            if (((float) this.zzb) < this.zzd * 0.9f) {
                                break;
                            }
                        }
                        if (zzalu.zzb) {
                            zzalu.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.zzb - j3), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                        }
                    }
                } catch (IOException e) {
                    zzalu.zza("%s", e.toString());
                    bufferedOutputStream.close();
                    zzalu.zza("Failed to write header for %s", zzg.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException unused) {
                if (!zzg.delete()) {
                    zzalu.zza("Could not clean up file %s", zzg.getAbsolutePath());
                }
                if (!this.zzc.zza().exists()) {
                    zzalu.zza("Re-initializing cache after external clearing.", new Object[0]);
                    this.zza.clear();
                    this.zzb = 0L;
                    zzb();
                }
            }
        }
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean delete = zzg(str).delete();
        zzp(str);
        if (delete) {
            return;
        }
        zzalu.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }
}

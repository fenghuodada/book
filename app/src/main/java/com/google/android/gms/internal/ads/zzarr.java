package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class zzarr {
    private static final String zzd = "zzarr";
    protected final Context zza;
    private ExecutorService zze;
    private DexClassLoader zzf;
    private zzaqw zzg;
    private byte[] zzh;
    private final boolean zzl;
    private zzaql zzo;
    private final Map zzp;
    private zzark zzr;
    private volatile AdvertisingIdClient zzi = null;
    private volatile boolean zzj = false;
    private Future zzk = null;
    private volatile zzaol zzm = null;
    private Future zzn = null;
    protected boolean zzb = false;
    protected boolean zzc = false;
    private boolean zzq = false;

    private zzarr(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.zzl = applicationContext != null;
        context = applicationContext != null ? applicationContext : context;
        this.zza = context;
        this.zzp = new HashMap();
        if (this.zzr != null) {
            return;
        }
        this.zzr = new zzark(context);
    }

    public static zzarr zzg(Context context, String str, String str2, boolean z) {
        zzaqw zzaqwVar;
        byte[] zzb;
        zzarr zzarrVar = new zzarr(context);
        try {
            zzarrVar.zze = Executors.newCachedThreadPool(new zzarn());
            zzarrVar.zzj = z;
            if (z) {
                zzarrVar.zzk = zzarrVar.zze.submit(new zzaro(zzarrVar));
            }
            zzarrVar.zze.execute(new zzarq(zzarrVar));
            try {
                GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
                zzarrVar.zzb = googleApiAvailabilityLight.getApkVersion(zzarrVar.zza) > 0;
                zzarrVar.zzc = googleApiAvailabilityLight.isGooglePlayServicesAvailable(zzarrVar.zza) == 0;
            } catch (Throwable unused) {
            }
            zzarrVar.zzo(0, true);
            if (zzaru.zzc() && ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcV)).booleanValue()) {
                throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
            }
            zzaqwVar = new zzaqw(null);
            zzarrVar.zzg = zzaqwVar;
            try {
                try {
                    zzb = zzapb.zzb("pAhkgz3GzpF3+CqXZzwu1qvOvu4xxNqL26Gmlx8dugI=", false);
                } catch (IllegalArgumentException e) {
                    throw new zzaqv(zzaqwVar, e);
                }
            } catch (zzaqv e2) {
                throw new zzarh(e2);
            }
        } catch (zzarh unused2) {
        }
        if (zzb.length == 32) {
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(zzb, 4, 16).get(bArr);
            for (int i = 0; i < 16; i++) {
                bArr[i] = (byte) (bArr[i] ^ 68);
            }
            zzarrVar.zzh = bArr;
            try {
                try {
                    try {
                        File cacheDir = zzarrVar.zza.getCacheDir();
                        if (cacheDir == null && (cacheDir = zzarrVar.zza.getDir("dex", 0)) == null) {
                            throw new zzarh();
                        }
                        File file = new File(String.format("%s/%s.jar", cacheDir, "1681310438574"));
                        if (!file.exists()) {
                            byte[] zzb2 = zzarrVar.zzg.zzb(zzarrVar.zzh, "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");
                            file.createNewFile();
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            if (Build.VERSION.SDK_INT >= 33) {
                                file.setReadOnly();
                            }
                            fileOutputStream.write(zzb2, 0, zzb2.length);
                            fileOutputStream.close();
                        }
                        zzarrVar.zzx(cacheDir, "1681310438574");
                        try {
                            zzarrVar.zzf = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, zzarrVar.zza.getClassLoader());
                            zzy(file);
                            zzarrVar.zzw(cacheDir, "1681310438574");
                            zzz(String.format("%s/%s.dex", cacheDir, "1681310438574"));
                            zzarrVar.zzo = new zzaql(zzarrVar);
                            zzarrVar.zzq = true;
                            return zzarrVar;
                        } catch (Throwable th) {
                            zzy(file);
                            zzarrVar.zzw(cacheDir, "1681310438574");
                            zzz(String.format("%s/%s.dex", cacheDir, "1681310438574"));
                            throw th;
                        }
                    } catch (FileNotFoundException e3) {
                        throw new zzarh(e3);
                    } catch (NullPointerException e4) {
                        throw new zzarh(e4);
                    }
                } catch (IOException e5) {
                    throw new zzarh(e5);
                }
            } catch (zzaqv e6) {
                throw new zzarh(e6);
            }
        }
        throw new zzaqv(zzaqwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        try {
            if (this.zzi == null && this.zzl) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.zza);
                advertisingIdClient.start();
                this.zzi = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            this.zzi = null;
        }
    }

    private final void zzw(File file, String str) {
        Throwable th;
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1681310438574"));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, "1681310438574"));
        if (!file3.exists()) {
            return;
        }
        long length = file3.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file3);
            try {
                if (fileInputStream2.read(bArr) <= 0) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                    zzy(file3);
                    return;
                }
                System.out.print("test");
                System.out.print("test");
                System.out.print("test");
                zzaoo zza = zzaop.zza();
                byte[] bytes = Build.VERSION.SDK.getBytes();
                zzgno zzgnoVar = zzgno.zzb;
                zza.zzc(zzgno.zzv(bytes, 0, bytes.length));
                byte[] bytes2 = "1681310438574".getBytes();
                zza.zzd(zzgno.zzv(bytes2, 0, bytes2.length));
                byte[] bytes3 = this.zzg.zza(this.zzh, bArr).getBytes();
                zza.zza(zzgno.zzv(bytes3, 0, bytes3.length));
                byte[] zze = zzapf.zze(bytes3);
                zza.zzb(zzgno.zzv(zze, 0, zze.length));
                file2.createNewFile();
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] zzax = ((zzaop) zza.zzal()).zzax();
                    fileOutputStream.write(zzax, 0, zzax.length);
                    fileOutputStream.close();
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused2) {
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                    zzy(file3);
                } catch (zzaqv | IOException | NoSuchAlgorithmException unused4) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    zzy(file3);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused7) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused8) {
                        }
                    }
                    zzy(file3);
                    throw th;
                }
            } catch (zzaqv | IOException | NoSuchAlgorithmException unused9) {
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (zzaqv | IOException | NoSuchAlgorithmException unused10) {
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    private final boolean zzx(File file, String str) {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1681310438574"));
        if (file2.exists()) {
            File file3 = new File(String.format("%s/%s.dex", file, "1681310438574"));
            if (!file3.exists()) {
                FileInputStream fileInputStream = null;
                try {
                    long length = file2.length();
                    if (length <= 0) {
                        zzy(file2);
                        return false;
                    }
                    byte[] bArr = new byte[(int) length];
                    FileInputStream fileInputStream2 = new FileInputStream(file2);
                    try {
                        try {
                            if (fileInputStream2.read(bArr) <= 0) {
                                Log.d(zzd, "Cannot read the cache data.");
                                zzy(file2);
                                try {
                                    fileInputStream2.close();
                                } catch (IOException unused) {
                                }
                                return false;
                            }
                            try {
                                try {
                                    zzaop zzd2 = zzaop.zzd(bArr, zzgoi.zza());
                                    if ("1681310438574".equals(new String(zzd2.zzh().zzA())) && Arrays.equals(zzd2.zzf().zzA(), zzapf.zze(zzd2.zze().zzA())) && Arrays.equals(zzd2.zzg().zzA(), Build.VERSION.SDK.getBytes())) {
                                        byte[] zzb = this.zzg.zzb(this.zzh, new String(zzd2.zze().zzA()));
                                        file3.createNewFile();
                                        fileOutputStream = new FileOutputStream(file3);
                                        try {
                                            fileOutputStream.write(zzb, 0, zzb.length);
                                            try {
                                                fileInputStream2.close();
                                            } catch (IOException unused2) {
                                            }
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException unused3) {
                                            }
                                            return true;
                                        } catch (zzaqv | IOException | NoSuchAlgorithmException unused4) {
                                            fileInputStream = fileInputStream2;
                                            if (fileInputStream != null) {
                                                try {
                                                    fileInputStream.close();
                                                } catch (IOException unused5) {
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException unused6) {
                                                }
                                            }
                                            return false;
                                        } catch (Throwable th) {
                                            th = th;
                                            fileInputStream = fileInputStream2;
                                            if (fileInputStream != null) {
                                                try {
                                                    fileInputStream.close();
                                                } catch (IOException unused7) {
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException unused8) {
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                    zzy(file2);
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException unused9) {
                                    }
                                    return false;
                                } catch (IOException unused10) {
                                    return false;
                                }
                            } catch (NullPointerException unused11) {
                                fileInputStream2.close();
                                return false;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = null;
                        }
                    } catch (zzaqv | IOException | NoSuchAlgorithmException unused12) {
                        fileOutputStream = null;
                    }
                } catch (zzaqv | IOException | NoSuchAlgorithmException unused13) {
                    fileOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            }
            return false;
        }
        return false;
    }

    private static final void zzy(File file) {
        if (file.exists()) {
            file.delete();
        } else {
            Log.d(zzd, String.format("File %s not found. No need for deletion", file.getAbsolutePath()));
        }
    }

    private static final void zzz(String str) {
        zzy(new File(str));
    }

    public final int zza() {
        if (this.zzo != null) {
            return zzaql.zzd();
        }
        return Integer.MIN_VALUE;
    }

    public final Context zzb() {
        return this.zza;
    }

    public final zzaol zzc() {
        return this.zzm;
    }

    public final zzaql zzd() {
        return this.zzo;
    }

    public final zzaqw zze() {
        return this.zzg;
    }

    public final zzark zzf() {
        return this.zzr;
    }

    public final AdvertisingIdClient zzh() {
        if (this.zzj) {
            if (this.zzi != null) {
                return this.zzi;
            }
            Future future = this.zzk;
            if (future != null) {
                try {
                    future.get(2000L, TimeUnit.MILLISECONDS);
                    this.zzk = null;
                } catch (InterruptedException | ExecutionException unused) {
                } catch (TimeoutException unused2) {
                    this.zzk.cancel(true);
                }
            }
            return this.zzi;
        }
        return null;
    }

    public final DexClassLoader zzi() {
        return this.zzf;
    }

    public final Method zzj(String str, String str2) {
        zzate zzateVar = (zzate) this.zzp.get(new Pair(str, str2));
        if (zzateVar == null) {
            return null;
        }
        return zzateVar.zza();
    }

    public final ExecutorService zzk() {
        return this.zze;
    }

    public final Future zzl() {
        return this.zzn;
    }

    @VisibleForTesting
    public final void zzo(int i, boolean z) {
        if (this.zzc) {
            Future<?> submit = this.zze.submit(new zzarp(this, i, true));
            if (i == 0) {
                this.zzn = submit;
            }
        }
    }

    public final boolean zzp() {
        return this.zzc;
    }

    public final boolean zzq() {
        return this.zzb;
    }

    public final boolean zzr() {
        return this.zzq;
    }

    public final boolean zzs() {
        return this.zzr.zza();
    }

    public final boolean zzt(String str, String str2, Class... clsArr) {
        Pair pair = new Pair(str, str2);
        if (this.zzp.containsKey(pair)) {
            return false;
        }
        this.zzp.put(pair, new zzate(this, str, str2, clsArr));
        return true;
    }

    public final byte[] zzu() {
        return this.zzh;
    }
}

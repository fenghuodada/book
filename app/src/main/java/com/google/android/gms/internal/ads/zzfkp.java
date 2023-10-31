package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class zzfkp {
    private static final Object zza = new Object();
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzfjw zze;
    private boolean zzf;

    public zzfkp(@NonNull Context context, @NonNull int i, @NonNull zzfjw zzfjwVar, boolean z) {
        this.zzf = false;
        this.zzb = context;
        this.zzd = Integer.toString(i - 1);
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        this.zze = zzfjwVar;
        this.zzf = z;
    }

    private final File zze(@NonNull String str) {
        return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), str);
    }

    private static String zzf(@NonNull zzatk zzatkVar) {
        zzatm zze = zzatn.zze();
        zze.zze(zzatkVar.zzd().zzk());
        zze.zza(zzatkVar.zzd().zzj());
        zze.zzb(zzatkVar.zzd().zza());
        zze.zzd(zzatkVar.zzd().zzd());
        zze.zzc(zzatkVar.zzd().zzc());
        return Hex.bytesToStringLowercase(((zzatn) zze.zzal()).zzax());
    }

    private final String zzg() {
        return "FBAMTD".concat(String.valueOf(this.zzd));
    }

    private final String zzh() {
        return "LATMTD".concat(String.valueOf(this.zzd));
    }

    private final void zzi(int i, long j) {
        zzfjw zzfjwVar = this.zze;
        if (zzfjwVar != null) {
            zzfjwVar.zza(i, j);
        }
    }

    private final void zzj(int i, long j, String str) {
        zzfjw zzfjwVar = this.zze;
        if (zzfjwVar != null) {
            zzfjwVar.zzb(i, j, str);
        }
    }

    @Nullable
    private final zzatn zzk(int i) {
        SharedPreferences sharedPreferences;
        String zzg;
        int i2;
        if (i == 1) {
            sharedPreferences = this.zzc;
            zzg = zzh();
        } else {
            sharedPreferences = this.zzc;
            zzg = zzg();
        }
        String string = sharedPreferences.getString(zzg, null);
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            byte[] stringToBytes = Hex.stringToBytes(string);
            zzgno zzgnoVar = zzgno.zzb;
            return zzatn.zzi(zzgno.zzv(stringToBytes, 0, stringToBytes.length), this.zzf ? zzgoi.zza() : zzgoi.zzb());
        } catch (zzgpi unused) {
            return null;
        } catch (NullPointerException unused2) {
            i2 = 2029;
            zzi(i2, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            i2 = 2032;
            zzi(i2, currentTimeMillis);
            return null;
        }
    }

    public final boolean zza(@NonNull zzatk zzatkVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            if (!zzfkj.zze(new File(zze(zzatkVar.zzd().zzk()), "pcbc"), zzatkVar.zze().zzA())) {
                zzi(4020, currentTimeMillis);
                return false;
            }
            String zzf = zzf(zzatkVar);
            SharedPreferences.Editor edit = this.zzc.edit();
            edit.putString(zzh(), zzf);
            boolean commit = edit.commit();
            if (commit) {
                zzi(5015, currentTimeMillis);
            } else {
                zzi(4021, currentTimeMillis);
            }
            return commit;
        }
    }

    public final boolean zzb(@NonNull zzatk zzatkVar, @Nullable zzfko zzfkoVar) {
        File[] listFiles;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzatn zzk = zzk(1);
            String zzk2 = zzatkVar.zzd().zzk();
            if (zzk != null && zzk.zzk().equals(zzk2)) {
                zzi(4014, currentTimeMillis);
                return false;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            File zze = zze(zzk2);
            if (zze.exists()) {
                zzj(4023, currentTimeMillis2, "d:" + (true != zze.isDirectory() ? "0" : "1") + ",f:" + (true != zze.isFile() ? "0" : "1"));
                zzi(4015, currentTimeMillis2);
            } else if (!zze.mkdirs()) {
                zzj(4024, currentTimeMillis2, "cw:".concat(true != zze.canWrite() ? "0" : "1"));
                zzi(4015, currentTimeMillis2);
                return false;
            }
            File zze2 = zze(zzk2);
            File file = new File(zze2, "pcam.jar");
            File file2 = new File(zze2, "pcbc");
            if (!zzfkj.zze(file, zzatkVar.zzf().zzA())) {
                zzi(4016, currentTimeMillis);
                return false;
            } else if (!zzfkj.zze(file2, zzatkVar.zze().zzA())) {
                zzi(4017, currentTimeMillis);
                return false;
            } else if (zzfkoVar != null && !zzfkoVar.zza(file)) {
                zzi(4018, currentTimeMillis);
                zzfkj.zzd(zze2);
                return false;
            } else {
                String zzf = zzf(zzatkVar);
                long currentTimeMillis3 = System.currentTimeMillis();
                String string = this.zzc.getString(zzh(), null);
                SharedPreferences.Editor edit = this.zzc.edit();
                edit.putString(zzh(), zzf);
                if (string != null) {
                    edit.putString(zzg(), string);
                }
                if (!edit.commit()) {
                    zzi(4019, currentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                zzatn zzk3 = zzk(1);
                if (zzk3 != null) {
                    hashSet.add(zzk3.zzk());
                }
                zzatn zzk4 = zzk(2);
                if (zzk4 != null) {
                    hashSet.add(zzk4.zzk());
                }
                for (File file3 : new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        zzfkj.zzd(file3);
                    }
                }
                zzi(5014, currentTimeMillis);
                return true;
            }
        }
    }

    @Nullable
    public final zzfkh zzc(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzatn zzk = zzk(1);
            if (zzk == null) {
                zzi(4022, currentTimeMillis);
                return null;
            }
            File zze = zze(zzk.zzk());
            File file = new File(zze, "pcam.jar");
            if (!file.exists()) {
                file = new File(zze, "pcam");
            }
            File file2 = new File(zze, "pcbc");
            File file3 = new File(zze, "pcopt");
            zzi(5016, currentTimeMillis);
            return new zzfkh(zzk, file, file2, file3);
        }
    }

    public final boolean zzd(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzatn zzk = zzk(1);
            if (zzk == null) {
                zzi(4025, currentTimeMillis);
                return false;
            }
            File zze = zze(zzk.zzk());
            if (!new File(zze, "pcam.jar").exists()) {
                zzi(4026, currentTimeMillis);
                return false;
            } else if (new File(zze, "pcbc").exists()) {
                zzi(5019, currentTimeMillis);
                return true;
            } else {
                zzi(4027, currentTimeMillis);
                return false;
            }
        }
    }
}

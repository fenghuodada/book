package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzasf extends zzatf {
    private static final zzatg zzi = new zzatg();
    private final Context zzj;

    public zzasf(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2, Context context, zzanh zzanhVar) {
        super(zzarrVar, "nvmQ1oBnYa1ILuQMJvjx1Mgo4XB5M+iT4lATd49U3XYe7vyBu0LOBGvU5w3i5cNm", "wZRBY7DIvhHC8r92vSELjU6e4pNwFbBY03stSUuM3+c=", zzanoVar, i, 27);
        this.zzj = context;
    }

    private final String zzc() {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzaol zzc = this.zzb.zzc();
            if (zzc == null || !zzc.zzaj()) {
                return null;
            }
            return zzc.zzh();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int i;
        zzapc zzapcVar;
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        synchronized (zza) {
            zzapc zzapcVar2 = (zzapc) zza.get();
            if (zzapcVar2 == null || zzaru.zzd(zzapcVar2.zza) || zzapcVar2.zza.equals("E") || zzapcVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (zzaru.zzd(null)) {
                    zzaru.zzd(null);
                    Boolean.FALSE.booleanValue();
                    i = 3;
                } else {
                    i = 5;
                }
                Boolean valueOf = Boolean.valueOf(i == 3);
                Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzce);
                String zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcd)).booleanValue() ? zzb() : null;
                if (bool.booleanValue() && this.zzb.zzp() && zzaru.zzd(zzb)) {
                    zzb = zzc();
                }
                zzapc zzapcVar3 = new zzapc((String) this.zzf.invoke(null, this.zzj, valueOf, zzb));
                if (zzaru.zzd(zzapcVar3.zza) || zzapcVar3.zza.equals("E")) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String zzc = zzc();
                        if (!zzaru.zzd(zzc)) {
                            zzapcVar3.zza = zzc;
                        }
                    } else if (i2 == 4) {
                        throw null;
                    }
                }
                zza.set(zzapcVar3);
            }
            zzapcVar = (zzapc) zza.get();
        }
        synchronized (this.zze) {
            if (zzapcVar != null) {
                this.zze.zzx(zzapcVar.zza);
                this.zze.zzX(zzapcVar.zzb);
                this.zze.zzZ(zzapcVar.zzc);
                this.zze.zzi(zzapcVar.zzd);
                this.zze.zzw(zzapcVar.zze);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.ads.zzath] */
    public final String zzb() {
        ArrayList arrayList;
        Context context;
        String packageName;
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzf = zzaru.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcf));
            arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzaru.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcg)))));
            }
            context = this.zzj;
            packageName = context.getPackageName();
            this.zzb.zzk();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
        }
        if (Build.VERSION.SDK_INT > 30 || Build.VERSION.CODENAME.equals("S")) {
            final zzfwk zzf2 = zzfwk.zzf();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzath
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    int type;
                    byte[] value;
                    zzfwk zzfwkVar = zzfwk.this;
                    if (list == null) {
                        zzfwkVar.zzd(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ApkChecksum apkChecksum = (ApkChecksum) list.get(i);
                            type = apkChecksum.getType();
                            if (type == 8) {
                                value = apkChecksum.getValue();
                                zzfwkVar.zzd(zzaru.zzb(value));
                                return;
                            }
                        }
                        zzfwkVar.zzd(null);
                    } catch (Throwable unused2) {
                        zzfwkVar.zzd(null);
                    }
                }
            });
            return (String) zzf2.get();
        }
        return null;
    }
}

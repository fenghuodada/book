package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzcdq extends zzcdn {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcdq(zzccc zzcccVar) {
        super(zzcccVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            zzbzt.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            zzbzt.zzj("Could not create preload cache directory at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        } else if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
        } else {
            zzbzt.zzj("Could not set cache file permissions at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        }
    }

    private final File zza(File file) {
        return new File(this.zzg, String.valueOf(file.getName()).concat(".done"));
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzf() {
        this.zzh = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x0343, code lost:
        r26 = r4;
        r24 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0349, code lost:
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0351, code lost:
        if (com.google.android.gms.internal.ads.zzbzt.zzm(3) == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0353, code lost:
        com.google.android.gms.internal.ads.zzbzt.zze("Preloaded " + com.google.android.gms.internal.ads.zzcdq.zzf.format(r13) + " bytes from " + r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0376, code lost:
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x037f, code lost:
        if (r0.isFile() == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0381, code lost:
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0389, code lost:
        r0.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0405  */
    @Override // com.google.android.gms.internal.ads.zzcdn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzt(final java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdq.zzt(java.lang.String):boolean");
    }
}

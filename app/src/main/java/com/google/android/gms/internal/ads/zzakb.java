package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzakb implements zzaao {
    public static final zzaav zza = new zzaav() { // from class: com.google.android.gms.internal.ads.zzajx
        @Override // com.google.android.gms.internal.ads.zzaav
        public final /* synthetic */ zzaao[] zza(Uri uri, Map map) {
            int i = zzaau.zza;
            return new zzaao[]{new zzakb()};
        }
    };
    private zzaar zzb;
    private zzabr zzc;
    private zzajz zzf;
    private int zzd = 0;
    private long zze = -1;
    private int zzg = -1;
    private long zzh = -1;

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d9, code lost:
        if (r1 != 65534) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00de, code lost:
        if (r2 == 32) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd  */
    @Override // com.google.android.gms.internal.ads.zzaao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzaap r19, com.google.android.gms.internal.ads.zzabk r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakb.zza(com.google.android.gms.internal.ads.zzaap, com.google.android.gms.internal.ads.zzabk):int");
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzb(zzaar zzaarVar) {
        this.zzb = zzaarVar;
        this.zzc = zzaarVar.zzv(0, 1);
        zzaarVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzc(long j, long j2) {
        this.zzd = j == 0 ? 0 : 4;
        zzajz zzajzVar = this.zzf;
        if (zzajzVar != null) {
            zzajzVar.zzb(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final boolean zzd(zzaap zzaapVar) throws IOException {
        return zzake.zzc(zzaapVar);
    }
}

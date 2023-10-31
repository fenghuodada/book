package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzajp implements zzaao {
    public static final zzaav zza = new zzaav() { // from class: com.google.android.gms.internal.ads.zzajm
        @Override // com.google.android.gms.internal.ads.zzaav
        public final /* synthetic */ zzaao[] zza(Uri uri, Map map) {
            int i = zzaau.zza;
            return new zzaao[]{new zzajp(0)};
        }
    };
    private final List zzb;
    private final zzfd zzc;
    private final SparseIntArray zzd;
    private final zzajs zze;
    private final SparseArray zzf;
    private final SparseBooleanArray zzg;
    private final SparseBooleanArray zzh;
    private final zzajl zzi;
    private zzajk zzj;
    private zzaar zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;

    public zzajp() {
        this(0);
    }

    public zzajp(int i) {
        this(1, new zzfl(0L), new zzaie(0), 112800);
    }

    public zzajp(int i, zzfl zzflVar, zzajs zzajsVar, int i2) {
        this.zze = zzajsVar;
        this.zzb = Collections.singletonList(zzflVar);
        this.zzc = new zzfd(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzg = sparseBooleanArray;
        this.zzh = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzf = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzi = new zzajl(112800);
        this.zzk = zzaar.zza;
        this.zzq = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.zzf.put(sparseArray2.keyAt(i3), (zzaju) sparseArray2.valueAt(i3));
        }
        this.zzf.put(0, new zzajh(new zzajn(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x018a, code lost:
        if (r1 == false) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzaao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzaap r19, com.google.android.gms.internal.ads.zzabk r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajp.zza(com.google.android.gms.internal.ads.zzaap, com.google.android.gms.internal.ads.zzabk):int");
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzb(zzaar zzaarVar) {
        this.zzk = zzaarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzc(long j, long j2) {
        zzajk zzajkVar;
        int size = this.zzb.size();
        for (int i = 0; i < size; i++) {
            zzfl zzflVar = (zzfl) this.zzb.get(i);
            if (zzflVar.zze() != -9223372036854775807L) {
                long zzc = zzflVar.zzc();
                if (zzc != -9223372036854775807L) {
                    if (zzc != 0) {
                        if (zzc == j2) {
                        }
                    }
                }
            }
            zzflVar.zzf(j2);
        }
        if (j2 != 0 && (zzajkVar = this.zzj) != null) {
            zzajkVar.zzd(j2);
        }
        this.zzc.zzC(0);
        this.zzd.clear();
        for (int i2 = 0; i2 < this.zzf.size(); i2++) {
            ((zzaju) this.zzf.valueAt(i2)).zzc();
        }
        this.zzp = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzaao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzd(com.google.android.gms.internal.ads.zzaap r7) throws java.io.IOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzfd r0 = r6.zzc
            byte[] r0 = r0.zzH()
            com.google.android.gms.internal.ads.zzaae r7 = (com.google.android.gms.internal.ads.zzaae) r7
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.zzm(r0, r2, r1, r2)
            r1 = r2
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L2b
            r3 = r2
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r1 = r1 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.zzo(r1, r2)
            r7 = 1
            return r7
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajp.zzd(com.google.android.gms.internal.ads.zzaap):boolean");
    }
}

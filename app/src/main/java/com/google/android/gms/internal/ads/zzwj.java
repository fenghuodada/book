package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.util.Map;
import okhttp3.internal.p064ws.WebSocketProtocol;

/* loaded from: classes.dex */
public final class zzwj extends zzde {
    public static final zzwj zzD;
    @Deprecated
    public static final zzwj zzE;
    public static final zzn zzF;
    private static final String zzT;
    private static final String zzU;
    private static final String zzV;
    private static final String zzW;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    private static final String zzaa;
    private static final String zzab;
    private static final String zzac;
    private static final String zzad;
    private static final String zzae;
    private static final String zzaf;
    private static final String zzag;
    private static final String zzah;
    private static final String zzai;
    private static final String zzaj;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    private final SparseArray zzak;
    private final SparseBooleanArray zzal;

    static {
        zzwj zzwjVar = new zzwj(new zzwh());
        zzD = zzwjVar;
        zzE = zzwjVar;
        zzT = Integer.toString(1000, 36);
        zzU = Integer.toString(1001, 36);
        zzV = Integer.toString(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 36);
        zzW = Integer.toString(1003, 36);
        zzX = Integer.toString(1004, 36);
        zzY = Integer.toString(WebSocketProtocol.CLOSE_NO_STATUS_CODE, 36);
        zzZ = Integer.toString(1006, 36);
        zzaa = Integer.toString(1007, 36);
        zzab = Integer.toString(1008, 36);
        zzac = Integer.toString(1009, 36);
        zzad = Integer.toString(1010, 36);
        zzae = Integer.toString(1011, 36);
        zzaf = Integer.toString(1012, 36);
        zzag = Integer.toString(1013, 36);
        zzah = Integer.toString(1014, 36);
        zzai = Integer.toString(1015, 36);
        zzaj = Integer.toString(1016, 36);
        zzF = new zzn() { // from class: com.google.android.gms.internal.ads.zzwf
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zzwj(zzwh zzwhVar) {
        super(zzwhVar);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        z = zzwhVar.zza;
        this.zzG = z;
        this.zzH = false;
        z2 = zzwhVar.zzb;
        this.zzI = z2;
        this.zzJ = false;
        z3 = zzwhVar.zzc;
        this.zzK = z3;
        this.zzL = false;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        z4 = zzwhVar.zzd;
        this.zzP = z4;
        z5 = zzwhVar.zze;
        this.zzQ = z5;
        this.zzR = false;
        z6 = zzwhVar.zzf;
        this.zzS = z6;
        sparseArray = zzwhVar.zzg;
        this.zzak = sparseArray;
        sparseBooleanArray = zzwhVar.zzh;
        this.zzal = sparseBooleanArray;
    }

    public static zzwj zzd(Context context) {
        return new zzwj(new zzwh(context));
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzwj.class == obj.getClass()) {
            zzwj zzwjVar = (zzwj) obj;
            if (super.equals(zzwjVar) && this.zzG == zzwjVar.zzG && this.zzI == zzwjVar.zzI && this.zzK == zzwjVar.zzK && this.zzP == zzwjVar.zzP && this.zzQ == zzwjVar.zzQ && this.zzS == zzwjVar.zzS) {
                SparseBooleanArray sparseBooleanArray = this.zzal;
                SparseBooleanArray sparseBooleanArray2 = zzwjVar.zzal;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.zzak;
                            SparseArray sparseArray2 = zzwjVar.zzak;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzvk zzvkVar = (zzvk) entry.getKey();
                                                if (map2.containsKey(zzvkVar)) {
                                                    if (!zzfn.zzB(entry.getValue(), map2.get(zzvkVar))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzde
    public final int hashCode() {
        return ((((((((((((super.hashCode() + 31) * 31) + (this.zzG ? 1 : 0)) * 961) + (this.zzI ? 1 : 0)) * 961) + (this.zzK ? 1 : 0)) * 28629151) + (this.zzP ? 1 : 0)) * 31) + (this.zzQ ? 1 : 0)) * 961) + (this.zzS ? 1 : 0);
    }

    public final zzwh zzc() {
        return new zzwh(this, null);
    }

    @Nullable
    @Deprecated
    public final zzwl zze(int i, zzvk zzvkVar) {
        Map map = (Map) this.zzak.get(i);
        if (map != null) {
            return (zzwl) map.get(zzvkVar);
        }
        return null;
    }

    public final boolean zzf(int i) {
        return this.zzal.get(i);
    }

    @Deprecated
    public final boolean zzg(int i, zzvk zzvkVar) {
        Map map = (Map) this.zzak.get(i);
        return map != null && map.containsKey(zzvkVar);
    }
}

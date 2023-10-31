package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzakq;
import com.google.android.gms.internal.ads.zzalm;
import com.google.android.gms.internal.ads.zzaln;
import com.google.android.gms.internal.ads.zzamm;
import com.google.android.gms.internal.ads.zzbzs;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbi extends zzamm {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ zzbzs zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbi(zzbo zzboVar, int i, String str, zzaln zzalnVar, zzalm zzalmVar, byte[] bArr, Map map, zzbzs zzbzsVar) {
        super(i, str, zzalnVar, zzalmVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzbzsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final Map zzl() throws zzakq {
        Map map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final byte[] zzx() throws zzakq {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzamm, com.google.android.gms.internal.ads.zzali
    /* renamed from: zzz */
    public final void zzo(String str) {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}

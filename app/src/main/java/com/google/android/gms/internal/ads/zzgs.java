package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.C0235r;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgs extends zzgq {
    public final int zzd;
    @Nullable
    public final String zze;
    public final Map zzf;
    public final byte[] zzg;

    public zzgs(int i, @Nullable String str, @Nullable IOException iOException, Map map, zzgc zzgcVar, byte[] bArr) {
        super(C0235r.m12816a("Response code: ", i), iOException, zzgcVar, AdError.INTERNAL_ERROR_2004, 1);
        this.zzd = i;
        this.zze = str;
        this.zzf = map;
        this.zzg = bArr;
    }
}

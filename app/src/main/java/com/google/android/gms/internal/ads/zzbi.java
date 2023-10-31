package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes.dex */
public class zzbi {
    public final Uri zza;
    public final List zze;
    public final zzfrr zzg;
    @Deprecated
    public final List zzh;
    @Nullable
    public final Object zzi;
    @Nullable
    public final String zzb = null;
    @Nullable
    public final zzbc zzc = null;
    @Nullable
    public final zzas zzd = null;
    @Nullable
    public final String zzf = null;

    public /* synthetic */ zzbi(Uri uri, String str, zzbc zzbcVar, zzas zzasVar, List list, String str2, zzfrr zzfrrVar, Object obj, zzbh zzbhVar) {
        this.zza = uri;
        this.zze = list;
        this.zzg = zzfrrVar;
        zzfro zzfroVar = new zzfro();
        if (zzfrrVar.size() > 0) {
            zzbo zzboVar = (zzbo) zzfrrVar.get(0);
            throw null;
        }
        this.zzh = zzfroVar.zzi();
        this.zzi = null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbi) {
            zzbi zzbiVar = (zzbi) obj;
            return this.zza.equals(zzbiVar.zza) && zzfn.zzB(null, null) && zzfn.zzB(null, null) && zzfn.zzB(null, null) && this.zze.equals(zzbiVar.zze) && zzfn.zzB(null, null) && this.zzg.equals(zzbiVar.zzg) && zzfn.zzB(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.zze.hashCode() + (this.zza.hashCode() * 923521)) * 961) + this.zzg.hashCode()) * 31;
    }
}

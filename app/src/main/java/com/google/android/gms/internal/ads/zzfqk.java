package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public abstract class zzfqk extends zzfqn implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    public zzfqk(Map map) {
        zzfoz.zze(map.isEmpty());
        this.zza = map;
    }

    public static /* bridge */ /* synthetic */ int zzd(zzfqk zzfqkVar) {
        return zzfqkVar.zzb;
    }

    public static /* bridge */ /* synthetic */ Map zzi(zzfqk zzfqkVar) {
        return zzfqkVar.zza;
    }

    public static /* bridge */ /* synthetic */ void zzn(zzfqk zzfqkVar, int i) {
        zzfqkVar.zzb = i;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzfqk zzfqkVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzfqkVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfqkVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Collection collection) {
        throw null;
    }

    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsn
    public final int zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqn
    public final Collection zzf() {
        return new zzfqm(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfqn
    public final Iterator zzg() {
        return new zzfpu(this);
    }

    public final List zzh(Object obj, List list, @CheckForNull zzfqh zzfqhVar) {
        return list instanceof RandomAccess ? new zzfqd(this, obj, list, zzfqhVar) : new zzfqj(this, obj, list, zzfqhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfqn
    public Map zzj() {
        throw null;
    }

    public final Map zzk() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfqb(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfqe(this, (SortedMap) map) : new zzfpx(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfqn
    public Set zzl() {
        throw null;
    }

    public final Set zzm() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzfqc(this, (NavigableMap) map) : map instanceof SortedMap ? new zzfqf(this, (SortedMap) map) : new zzfqa(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfsn
    public final void zzp() {
        for (Collection collection : this.zza.values()) {
            collection.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfqn, com.google.android.gms.internal.ads.zzfsn
    public final boolean zzq(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection != null) {
            if (collection.add(obj2)) {
                this.zzb++;
                return true;
            }
            return false;
        }
        Collection zza = zza();
        if (zza.add(obj2)) {
            this.zzb++;
            this.zza.put(obj, zza);
            return true;
        }
        throw new AssertionError("New Collection violated the Collection spec");
    }
}

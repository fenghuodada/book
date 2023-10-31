package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class zzgpn extends zzgmy implements RandomAccess, zzgpo {
    @Deprecated
    public static final zzgpo zza;
    private static final zzgpn zzb;
    private final List zzc;

    static {
        zzgpn zzgpnVar = new zzgpn(false);
        zzb = zzgpnVar;
        zza = zzgpnVar;
    }

    public zzgpn() {
        this(10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgpn(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.zzc = arrayList;
    }

    private zzgpn(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzgpn(boolean z) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    private static String zzj(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzgno ? ((zzgno) obj).zzx(zzgpg.zzb) : zzgpg.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgmy, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zzbH();
        this.zzc.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgmy, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zzbH();
        if (collection instanceof zzgpo) {
            collection = ((zzgpo) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.ads.zzgmy, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.ads.zzgmy, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbH();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgmy, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbH();
        Object remove = this.zzc.remove(i);
        ((AbstractList) this).modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.ads.zzgmy, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zzbH();
        return zzj(this.zzc.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgpf
    public final /* bridge */ /* synthetic */ zzgpf zzd(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzc);
            return new zzgpn(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzgpo
    public final zzgpo zze() {
        return zzc() ? new zzgrv(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.zzgpo
    public final Object zzf(int i) {
        return this.zzc.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgno) {
            zzgno zzgnoVar = (zzgno) obj;
            String zzx = zzgnoVar.zzx(zzgpg.zzb);
            if (zzgnoVar.zzp()) {
                this.zzc.set(i, zzx);
            }
            return zzx;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzgpg.zzd(bArr);
        if (zzgsf.zzi(bArr)) {
            this.zzc.set(i, zzd);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgpo
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgpo
    public final void zzi(zzgno zzgnoVar) {
        zzbH();
        this.zzc.add(zzgnoVar);
        ((AbstractList) this).modCount++;
    }
}

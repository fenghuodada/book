package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
import p060j$.util.Map;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.BiFunction;
import p060j$.util.function.Function;

/* loaded from: classes.dex */
public abstract class zzfru implements Map, Serializable, p060j$.util.Map {
    @CheckForNull
    private transient zzfrw zza;
    @CheckForNull
    private transient zzfrw zzb;
    @CheckForNull
    private transient zzfrm zzc;

    public static zzfru zzc(Map map) {
        Set entrySet = map.entrySet();
        zzfrt zzfrtVar = new zzfrt(entrySet instanceof Collection ? entrySet.size() : 4);
        zzfrtVar.zzb(entrySet);
        return zzfrtVar.zzc();
    }

    public static zzfru zzd() {
        return zzftg.zza;
    }

    @Override // java.util.Map, p060j$.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // p060j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // p060j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // p060j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p060j$.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map, p060j$.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map, p060j$.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return zzfsm.zzb(this, obj);
    }

    @Override // p060j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, p060j$.util.Map
    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @Override // java.util.Map, p060j$.util.Map
    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map, p060j$.util.Map
    public final int hashCode() {
        return zzftn.zza(entrySet());
    }

    @Override // java.util.Map, p060j$.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // p060j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, p060j$.util.Map
    @CheckForNull
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p060j$.util.Map
    @Deprecated
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p060j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, p060j$.util.Map
    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p060j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, p060j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, p060j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // p060j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final String toString() {
        int size = size();
        zzfqo.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public abstract zzfrm zza();

    @Override // java.util.Map, p060j$.util.Map
    /* renamed from: zzb */
    public final zzfrm values() {
        zzfrm zzfrmVar = this.zzc;
        if (zzfrmVar == null) {
            zzfrm zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzfrmVar;
    }

    public abstract zzfrw zze();

    public abstract zzfrw zzf();

    @Override // java.util.Map, p060j$.util.Map
    /* renamed from: zzg */
    public final zzfrw entrySet() {
        zzfrw zzfrwVar = this.zza;
        if (zzfrwVar == null) {
            zzfrw zze = zze();
            this.zza = zze;
            return zze;
        }
        return zzfrwVar;
    }

    @Override // java.util.Map, p060j$.util.Map
    /* renamed from: zzh */
    public final zzfrw keySet() {
        zzfrw zzfrwVar = this.zzb;
        if (zzfrwVar == null) {
            zzfrw zzf = zzf();
            this.zzb = zzf;
            return zzf;
        }
        return zzfrwVar;
    }
}

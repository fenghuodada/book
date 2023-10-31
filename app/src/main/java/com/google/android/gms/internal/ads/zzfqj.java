package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzfqj extends zzfqh implements List {
    final /* synthetic */ zzfqk zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqj(zzfqk zzfqkVar, Object obj, @CheckForNull List list, zzfqh zzfqhVar) {
        super(zzfqkVar, obj, list, zzfqhVar);
        this.zzf = zzfqkVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i, obj);
        zzfqk zzfqkVar = this.zzf;
        i2 = zzfqkVar.zzb;
        zzfqkVar.zzb = i2 + 1;
        if (isEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i, collection);
        if (addAll) {
            int size2 = this.zzb.size();
            zzfqk zzfqkVar = this.zzf;
            i2 = zzfqkVar.zzb;
            zzfqkVar.zzb = (size2 - size) + i2;
            if (size == 0) {
                zza();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.zzb).get(i);
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzfqi(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new zzfqi(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        zzb();
        Object remove = ((List) this.zzb).remove(i);
        zzfqk zzfqkVar = this.zzf;
        i2 = zzfqkVar.zzb;
        zzfqkVar.zzb = i2 - 1;
        zzc();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.zzb).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        zzfqk zzfqkVar = this.zzf;
        Object obj = this.zza;
        List subList = ((List) this.zzb).subList(i, i2);
        zzfqh zzfqhVar = this.zzc;
        if (zzfqhVar == null) {
            zzfqhVar = this;
        }
        return zzfqkVar.zzh(obj, subList, zzfqhVar);
    }
}

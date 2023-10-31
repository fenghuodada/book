package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* loaded from: classes.dex */
public class zzguz implements Iterator, Closeable, zzamv, p060j$.util.Iterator {
    private static final zzamu zza = new zzguy("eof ");
    private static final zzgvg zzb = zzgvg.zzb(zzguz.class);
    protected zzamr zzc;
    protected zzgva zzd;
    zzamu zze = null;
    long zzf = 0;
    long zzg = 0;
    private final List zzh = new ArrayList();

    public void close() throws IOException {
    }

    @Override // p060j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final boolean hasNext() {
        zzamu zzamuVar = this.zze;
        if (zzamuVar == zza) {
            return false;
        }
        if (zzamuVar != null) {
            return true;
        }
        try {
            this.zze = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zze = zza;
            return false;
        }
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.zzh.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((zzamu) this.zzh.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.Iterator, p060j$.util.Iterator
    /* renamed from: zzd */
    public final zzamu next() {
        zzamu zzb2;
        zzamu zzamuVar = this.zze;
        if (zzamuVar != null && zzamuVar != zza) {
            this.zze = null;
            return zzamuVar;
        }
        zzgva zzgvaVar = this.zzd;
        if (zzgvaVar == null || this.zzf >= this.zzg) {
            this.zze = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzgvaVar) {
                this.zzd.zze(this.zzf);
                zzb2 = this.zzc.zzb(this.zzd, this);
                this.zzf = this.zzd.zzb();
            }
            return zzb2;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public final List zze() {
        return (this.zzd == null || this.zze == zza) ? this.zzh : new zzgvf(this.zzh, this);
    }

    public final void zzf(zzgva zzgvaVar, long j, zzamr zzamrVar) throws IOException {
        this.zzd = zzgvaVar;
        this.zzf = zzgvaVar.zzb();
        zzgvaVar.zze(zzgvaVar.zzb() + j);
        this.zzg = zzgvaVar.zzb();
        this.zzc = zzamrVar;
    }
}

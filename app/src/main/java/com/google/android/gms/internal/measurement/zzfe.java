package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzfe extends zzkx implements zzmj {
    private zzfe() {
        super(zzff.zzf());
    }

    public /* synthetic */ zzfe(zzez zzezVar) {
        super(zzff.zzf());
    }

    public final int zza() {
        return ((zzff) this.zza).zzb();
    }

    public final zzfd zzb(int i) {
        return ((zzff) this.zza).zzd(i);
    }

    public final zzfe zzc() {
        zzaH();
        zzff.zzr((zzff) this.zza);
        return this;
    }

    public final zzfe zzd(int i, zzfc zzfcVar) {
        zzaH();
        zzff.zzq((zzff) this.zza, i, (zzfd) zzfcVar.zzaD());
        return this;
    }

    public final String zze() {
        return ((zzff) this.zza).zzk();
    }

    public final List zzf() {
        return Collections.unmodifiableList(((zzff) this.zza).zzm());
    }

    public final List zzg() {
        return Collections.unmodifiableList(((zzff) this.zza).zzn());
    }
}

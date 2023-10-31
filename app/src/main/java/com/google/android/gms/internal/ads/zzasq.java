package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzasq extends zzatf {
    private final zzaqu zzi;
    private final long zzj;
    private final long zzk;

    public zzasq(zzarr zzarrVar, String str, String str2, zzano zzanoVar, int i, int i2, zzaqu zzaquVar, long j, long j2) {
        super(zzarrVar, "Bdd/SXecSODrNYWNMJakrwr0suwau+ZSaygsyNqj5IcjiKGPVCNYxfh9jESu1wRd", "Cb3a/0oybs716dPr7UCf4ZWTrxhPatWThTypQohUWkM=", zzanoVar, i, 11);
        this.zzi = zzaquVar;
        this.zzj = j;
        this.zzk = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzatf
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaqu zzaquVar = this.zzi;
        if (zzaquVar != null) {
            zzaqs zzaqsVar = new zzaqs((String) this.zzf.invoke(null, zzaquVar.zzb(), Long.valueOf(this.zzj), Long.valueOf(this.zzk)));
            synchronized (this.zze) {
                this.zze.zzz(zzaqsVar.zza.longValue());
                if (zzaqsVar.zzb.longValue() >= 0) {
                    this.zze.zzQ(zzaqsVar.zzb.longValue());
                }
                if (zzaqsVar.zzc.longValue() >= 0) {
                    this.zze.zzf(zzaqsVar.zzc.longValue());
                }
            }
        }
    }
}

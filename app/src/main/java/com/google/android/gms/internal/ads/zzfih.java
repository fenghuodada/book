package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* loaded from: classes.dex */
public abstract class zzfih extends AsyncTask {
    private zzfii zza;
    protected final zzfhz zzd;

    public zzfih(zzfhz zzfhzVar) {
        this.zzd = zzfhzVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza */
    public void onPostExecute(String str) {
        zzfii zzfiiVar = this.zza;
        if (zzfiiVar != null) {
            zzfiiVar.zza(this);
        }
    }

    public final void zzb(zzfii zzfiiVar) {
        this.zza = zzfiiVar;
    }
}

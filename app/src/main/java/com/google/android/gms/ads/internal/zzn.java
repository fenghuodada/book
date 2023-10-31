package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzaqq;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzn implements View.OnTouchListener {
    final /* synthetic */ zzs zza;

    public zzn(zzs zzsVar) {
        this.zza = zzsVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzaqq zzaqqVar;
        zzaqq zzaqqVar2;
        zzs zzsVar = this.zza;
        zzaqqVar = zzsVar.zzh;
        if (zzaqqVar != null) {
            zzaqqVar2 = zzsVar.zzh;
            zzaqqVar2.zzd(motionEvent);
            return false;
        }
        return false;
    }
}

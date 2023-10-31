package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(17)
/* loaded from: classes.dex */
public final class zzyv implements DisplayManager.DisplayListener, zzyt {
    private final DisplayManager zza;
    @Nullable
    private zzyr zzb;

    private zzyv(DisplayManager displayManager) {
        this.zza = displayManager;
    }

    @Nullable
    public static zzyt zzc(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new zzyv(displayManager);
        }
        return null;
    }

    private final Display zzd() {
        return this.zza.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        zzyr zzyrVar = this.zzb;
        if (zzyrVar == null || i != 0) {
            return;
        }
        zzyx.zzb(zzyrVar.zza, zzd());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final void zza() {
        this.zza.unregisterDisplayListener(this);
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final void zzb(zzyr zzyrVar) {
        this.zzb = zzyrVar;
        this.zza.registerDisplayListener(this, zzfn.zzs(null));
        zzyx.zzb(zzyrVar.zza, zzd());
    }
}

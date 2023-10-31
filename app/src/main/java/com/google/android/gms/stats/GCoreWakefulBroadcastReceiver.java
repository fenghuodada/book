package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.legacy.content.AbstractC1440a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public abstract class GCoreWakefulBroadcastReceiver extends AbstractC1440a {
    @KeepForSdk
    public static boolean completeWakefulIntent(@NonNull Context context, @Nullable Intent intent) {
        if (intent == null) {
            return false;
        }
        return AbstractC1440a.completeWakefulIntent(intent);
    }
}

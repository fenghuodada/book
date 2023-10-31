package androidx.core.net;

import android.net.ConnectivityManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;

@RequiresApi(16)
/* renamed from: androidx.core.net.a */
/* loaded from: classes.dex */
public final class C0729a {
    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    @DoNotInline
    /* renamed from: a */
    public static boolean m11869a(ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}

package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
/* renamed from: androidx.core.app.k */
/* loaded from: classes.dex */
public final class C0627k {
    @DoNotInline
    /* renamed from: a */
    public static IBinder m12067a(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    @DoNotInline
    /* renamed from: b */
    public static void m12066b(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}

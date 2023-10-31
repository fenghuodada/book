package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC2005l;
import androidx.work.C2008n;
import androidx.work.impl.C1915l;
import androidx.work.impl.workers.DiagnosticsWorker;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f4602a = AbstractC2005l.m9732e("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, @Nullable Intent intent) {
        if (intent == null) {
            return;
        }
        String str = f4602a;
        AbstractC2005l.m9733c().mo9731a(str, "Requesting diagnostics", new Throwable[0]);
        try {
            C1915l.m9816c(context).m9726a(new C2008n.C2009a(DiagnosticsWorker.class).m9725a());
        } catch (IllegalStateException e) {
            AbstractC2005l.m9733c().mo9730b(str, "WorkManager is not initialized", e);
        }
    }
}

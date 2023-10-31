package com.adcolony.sdk;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.datastore.preferences.protobuf.C1169e;
import com.adcolony.sdk.C2275r2;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* renamed from: com.adcolony.sdk.n4 */
/* loaded from: classes.dex */
public final class C2214n4 implements OnCompleteListener<AppSetIdInfo> {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC2140i6 f5389a = null;

    /* renamed from: b */
    public final /* synthetic */ C2247p4 f5390b;

    public C2214n4(C2247p4 c2247p4) {
        this.f5390b = c2247p4;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task<AppSetIdInfo> task) {
        Throwable th;
        boolean isSuccessful = task.isSuccessful();
        InterfaceC2140i6 interfaceC2140i6 = this.f5389a;
        C2247p4 c2247p4 = this.f5390b;
        if (isSuccessful) {
            String id = task.getResult().getId();
            c2247p4.f5469e = id;
            if (interfaceC2140i6 != null) {
                ((C2275r2.C2276a) interfaceC2140i6).m9511a(id);
            }
        } else {
            if (task.getException() != null) {
                th = task.getException();
            } else {
                th = new Throwable("Task failed with unknown exception.");
            }
            C1169e.m11129c("App Set ID is not available. Unexpected exception occurred: " + Log.getStackTraceString(th), 0, 1, true);
            if (interfaceC2140i6 != null) {
                ((C2275r2.C2276a) interfaceC2140i6).m9510b(th);
            }
        }
        c2247p4.f5466b.m9427b(true);
    }
}

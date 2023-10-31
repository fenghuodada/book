package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.C1830c;
import androidx.work.C1833d;
import androidx.work.C1837f;
import androidx.work.C2008n;
import androidx.work.EnumC2007m;
import androidx.work.impl.C1915l;
import androidx.work.impl.model.C1940p;
import androidx.work.impl.utils.C1961b;
import androidx.work.impl.utils.taskexecutor.C1999b;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbzt;
import java.util.HashMap;

@KeepForSdk
/* loaded from: classes.dex */
public class WorkManagerUtil extends zzbq {
    private static void zzb(Context context) {
        try {
            C1915l.m9815d(context.getApplicationContext(), new C1830c(new C1830c.C1831a()));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(@NonNull IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        try {
            C1915l m9816c = C1915l.m9816c(context);
            m9816c.getClass();
            ((C1999b) m9816c.f4658d).m9738a(new C1961b(m9816c));
            C1833d.C1834a c1834a = new C1833d.C1834a();
            c1834a.f4452a = EnumC2007m.CONNECTED;
            C1833d c1833d = new C1833d(c1834a);
            C2008n.C2009a c2009a = new C2008n.C2009a(OfflinePingSender.class);
            c2009a.f4890b.f4699j = c1833d;
            c2009a.f4891c.add("offline_ping_sender_work");
            m9816c.m9726a(c2009a.m9725a());
        } catch (IllegalStateException e) {
            zzbzt.zzk("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        C1833d.C1834a c1834a = new C1833d.C1834a();
        c1834a.f4452a = EnumC2007m.CONNECTED;
        C1833d c1833d = new C1833d(c1834a);
        HashMap hashMap = new HashMap();
        hashMap.put("uri", str);
        hashMap.put("gws_query_id", str2);
        C1837f c1837f = new C1837f(hashMap);
        C1837f.m9903b(c1837f);
        C2008n.C2009a c2009a = new C2008n.C2009a(OfflineNotificationPoster.class);
        C1940p c1940p = c2009a.f4890b;
        c1940p.f4699j = c1833d;
        c1940p.f4694e = c1837f;
        c2009a.f4891c.add("offline_notification_work");
        try {
            C1915l.m9816c(context).m9726a(c2009a.m9725a());
            return true;
        } catch (IllegalStateException e) {
            zzbzt.zzk("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}

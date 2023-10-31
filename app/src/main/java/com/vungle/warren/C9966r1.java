package com.vungle.warren;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.vungle.warren.model.C9867g;
import com.vungle.warren.persistence.C9919c;

/* renamed from: com.vungle.warren.r1 */
/* loaded from: classes3.dex */
public final class C9966r1 implements OnSuccessListener<AppSetIdInfo> {

    /* renamed from: a */
    public final /* synthetic */ VungleApiClient f20011a;

    public C9966r1(VungleApiClient vungleApiClient) {
        this.f20011a = vungleApiClient;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(@NonNull AppSetIdInfo appSetIdInfo) {
        AppSetIdInfo appSetIdInfo2 = appSetIdInfo;
        if (appSetIdInfo2 != null) {
            String id = appSetIdInfo2.getId();
            VungleApiClient vungleApiClient = this.f20011a;
            vungleApiClient.f19362B = id;
            if (!TextUtils.isEmpty(id)) {
                C9867g c9867g = new C9867g("appSetIdCookie");
                c9867g.m1445d(vungleApiClient.f19362B, "appSetId");
                try {
                    vungleApiClient.f19387y.m1376w(c9867g);
                } catch (C9919c.C9920a e) {
                    String str = VungleApiClient.f19359C;
                    Log.e("com.vungle.warren.VungleApiClient", "error saving AppSetId in Cookie: " + e.getLocalizedMessage());
                }
            }
        }
    }
}

package com.vungle.warren.analytics;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.C0388n;
import com.google.gson.C8695r;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.model.C9863c;
import com.vungle.warren.network.C9893c;
import com.vungle.warren.network.C9897d;
import com.vungle.warren.network.C9901e;
import com.vungle.warren.network.InterfaceC9892b;
import com.vungle.warren.persistence.C9919c;
import com.vungle.warren.persistence.C9928h;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.vungle.warren.analytics.c */
/* loaded from: classes3.dex */
public final class C9753c implements InterfaceC9751a {

    /* renamed from: c */
    public static final /* synthetic */ int f19414c = 0;

    /* renamed from: a */
    public final VungleApiClient f19415a;

    /* renamed from: b */
    public final C9928h f19416b;

    /* renamed from: com.vungle.warren.analytics.c$a */
    /* loaded from: classes3.dex */
    public class C9754a implements InterfaceC9892b<C8695r> {
        @Override // com.vungle.warren.network.InterfaceC9892b
        /* renamed from: a */
        public final void mo1435a(C9901e c9901e) {
            int i = C9753c.f19414c;
            Log.d("c", "send RI success");
        }

        @Override // com.vungle.warren.network.InterfaceC9892b
        /* renamed from: b */
        public final void mo1434b(Throwable th) {
            int i = C9753c.f19414c;
            Log.d("c", "send RI Failure");
        }
    }

    public C9753c(VungleApiClient vungleApiClient, C9928h c9928h) {
        this.f19415a = vungleApiClient;
        this.f19416b = c9928h;
    }

    @Override // com.vungle.warren.analytics.InterfaceC9751a
    /* renamed from: a */
    public final void mo1593a(C8695r c8695r) {
        VungleApiClient vungleApiClient = this.f19415a;
        if (vungleApiClient.f19370h != null) {
            C8695r c8695r2 = new C8695r();
            c8695r2.m3218r(vungleApiClient.m1616d(false), "device");
            c8695r2.m3218r(vungleApiClient.f19375m, "app");
            c8695r2.m3218r(c8695r, "request");
            c8695r2.m3218r(vungleApiClient.m1612h(), "user");
            C8695r m1615e = vungleApiClient.m1615e();
            if (m1615e != null) {
                c8695r2.m3218r(m1615e, "ext");
            }
            C9897d m1428b = vungleApiClient.f19365c.m1428b(VungleApiClient.f19359C, vungleApiClient.f19370h, c8695r2);
            m1428b.f19876b.enqueue(new C9893c(m1428b, new C9754a()));
            return;
        }
        throw new IllegalStateException("API Client not configured yet! Must call /config first.");
    }

    @Override // com.vungle.warren.analytics.InterfaceC9751a
    /* renamed from: b */
    public final String[] mo1592b() {
        List list = (List) this.f19416b.m1382q(C9863c.class).get();
        if (list == null || list.size() <= 0) {
            return new String[0];
        }
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((C9863c) list.get(i)).f19819a;
        }
        return mo1591c(strArr);
    }

    @Override // com.vungle.warren.analytics.InterfaceC9751a
    /* renamed from: c */
    public final String[] mo1591c(@NonNull String[] strArr) {
        StringBuilder sb;
        C9928h c9928h = this.f19416b;
        if (strArr.length == 0) {
            return strArr;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    try {
                        if (this.f19415a.m1610j(str)) {
                            c9928h.m1393f(new C9863c(str));
                        } else {
                            arrayList.add(str);
                        }
                    } catch (VungleApiClient.C9741b unused) {
                        sb = new StringBuilder("Cleartext Network Traffic is Blocked : ");
                        sb.append(str);
                        Log.e("c", sb.toString());
                    } catch (C9919c.C9920a unused2) {
                        sb = new StringBuilder("Can't delete sent ping URL : ");
                        sb.append(str);
                        Log.e("c", sb.toString());
                    } catch (MalformedURLException unused3) {
                        c9928h.m1393f(new C9863c(str));
                        sb = new StringBuilder("Invalid Url : ");
                        sb.append(str);
                        Log.e("c", sb.toString());
                    }
                } catch (C9919c.C9920a unused4) {
                    Log.e("c", "DBException deleting : " + str);
                    sb = new StringBuilder("Invalid Url : ");
                    sb.append(str);
                    Log.e("c", sb.toString());
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // com.vungle.warren.analytics.InterfaceC9751a
    /* renamed from: d */
    public final void mo1590d(String[] strArr) {
        boolean z;
        for (String str : strArr) {
            int i = C0388n.f1327b;
            try {
                z = new URL(str).getHost().toLowerCase().contains(".vungle.com");
            } catch (MalformedURLException e) {
                Log.e("n", e.getMessage());
                z = false;
            }
            if (z) {
                try {
                    this.f19416b.m1376w(new C9863c(str));
                } catch (C9919c.C9920a unused) {
                    Log.e("c", "Can't save failed to ping URL : " + str);
                }
            }
        }
    }
}

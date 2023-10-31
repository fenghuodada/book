package com.vungle.warren;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.work.C1828a;
import com.google.ads.mediation.adcolony.AdColonyAdapterUtils;
import com.google.gson.C8695r;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.C9879m;
import com.vungle.warren.model.C9881o;
import com.vungle.warren.model.Placement;
import com.vungle.warren.p058ui.contract.InterfaceC10003b;
import com.vungle.warren.persistence.C9919c;
import com.vungle.warren.persistence.C9928h;
import com.vungle.warren.persistence.CallableC9947k;
import com.vungle.warren.persistence.CallableC9953q;
import com.vungle.warren.tasks.C9986h;
import com.vungle.warren.tasks.InterfaceC9982e;
import com.vungle.warren.vision.C10122c;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vungle.warren.c */
/* loaded from: classes3.dex */
public class C9758c implements InterfaceC10003b.InterfaceC10004a {

    /* renamed from: a */
    public final C9928h f19418a;

    /* renamed from: b */
    public final AdLoader f19419b;

    /* renamed from: c */
    public final InterfaceC9982e f19420c;

    /* renamed from: d */
    public final C9890n1 f19421d;

    /* renamed from: e */
    public final Map<String, Boolean> f19422e;

    /* renamed from: f */
    public final InterfaceC9782e0 f19423f;

    /* renamed from: g */
    public final AdRequest f19424g;

    /* renamed from: h */
    public boolean f19425h;

    /* renamed from: i */
    public int f19426i = -1;

    /* renamed from: j */
    public boolean f19427j;

    /* renamed from: k */
    public Placement f19428k;

    /* renamed from: l */
    public Advertisement f19429l;

    public C9758c(@NonNull AdRequest adRequest, @NonNull Map<String, Boolean> map, @Nullable InterfaceC9782e0 interfaceC9782e0, @NonNull C9928h c9928h, @NonNull AdLoader adLoader, @NonNull InterfaceC9982e interfaceC9982e, @NonNull C9890n1 c9890n1, @Nullable Placement placement, @Nullable Advertisement advertisement) {
        this.f19424g = adRequest;
        this.f19422e = map;
        this.f19423f = interfaceC9782e0;
        this.f19418a = c9928h;
        this.f19419b = adLoader;
        this.f19420c = interfaceC9982e;
        this.f19421d = c9890n1;
        this.f19428k = placement;
        this.f19429l = advertisement;
        map.put(adRequest.f19307b, Boolean.TRUE);
    }

    /* renamed from: a */
    public final void m1589a(String str, VungleException vungleException) {
        Advertisement advertisement = this.f19429l;
        AdRequest adRequest = this.f19424g;
        C9928h c9928h = this.f19418a;
        if (advertisement == null) {
            this.f19429l = c9928h.m1387l(adRequest.f19307b, adRequest.m1620a()).get();
        }
        Advertisement advertisement2 = this.f19429l;
        int i = vungleException.f19507a;
        if (advertisement2 != null && i == 27) {
            this.f19419b.m1645d(advertisement2.getId());
            return;
        }
        if (advertisement2 != null && i != 15 && i != 25 && i != 36) {
            try {
                c9928h.m1374y(advertisement2, str, 4);
                if (this.f19428k == null) {
                    this.f19428k = (Placement) c9928h.m1383p(Placement.class, adRequest.f19307b).get();
                }
                Placement placement = this.f19428k;
                if (placement != null) {
                    this.f19419b.m1636m(placement, placement.m1460a(), 0L, false);
                }
            } catch (C9919c.C9920a unused) {
                vungleException = new VungleException(26);
            }
        }
        mo1588b();
        InterfaceC9782e0 interfaceC9782e0 = this.f19423f;
        if (interfaceC9782e0 != null) {
            interfaceC9782e0.onError(str, vungleException);
            VungleLogger.m1603c("AdEventListener#PlayAdCallback", vungleException.getLocalizedMessage() + " :" + str);
        }
    }

    /* renamed from: b */
    public void mo1588b() {
        this.f19422e.remove(this.f19424g.f19307b);
    }

    /* renamed from: c */
    public final void m1587c(@NonNull String str, String str2, String str3) {
        StringBuilder sb;
        boolean z;
        String str4;
        Advertisement advertisement = this.f19429l;
        AdRequest adRequest = this.f19424g;
        C9928h c9928h = this.f19418a;
        if (advertisement == null) {
            this.f19429l = c9928h.m1387l(adRequest.f19307b, adRequest.m1620a()).get();
        }
        Advertisement advertisement2 = this.f19429l;
        InterfaceC9782e0 interfaceC9782e0 = this.f19423f;
        if (advertisement2 == null) {
            Log.e("com.vungle.warren.c", "No Advertisement for ID");
            mo1588b();
            if (interfaceC9782e0 != null) {
                interfaceC9782e0.onError(adRequest.f19307b, new VungleException(10));
                VungleLogger.m1603c("AdEventListener#PlayAdCallback", str3 + ": AD_UNABLE_TO_PLAY");
                return;
            }
            return;
        }
        if (this.f19428k == null) {
            this.f19428k = (Placement) c9928h.m1383p(Placement.class, adRequest.f19307b).get();
        }
        if (this.f19428k == null) {
            Log.e("com.vungle.warren.c", "No Placement for ID");
            mo1588b();
            if (interfaceC9782e0 != null) {
                interfaceC9782e0.onError(adRequest.f19307b, new VungleException(13));
                VungleLogger.m1603c("AdEventListener#PlayAdCallback", "PLACEMENT_NOT_FOUND: " + str3);
                return;
            }
            return;
        }
        try {
            boolean z2 = false;
            int i = 0;
            z2 = false;
            if (str.equals("start")) {
                c9928h.m1374y(this.f19429l, str3, 2);
                if (interfaceC9782e0 != null) {
                    interfaceC9782e0.onAdStart(str3);
                    VungleLogger.m1604b("AdEventListener#PlayAdCallback", "onAdStart: " + str3);
                }
                this.f19426i = 0;
                Placement placement = (Placement) c9928h.m1383p(Placement.class, adRequest.f19307b).get();
                this.f19428k = placement;
                if (placement != null) {
                    this.f19419b.m1636m(placement, placement.m1460a(), 0L, adRequest.f19306a);
                }
                C9890n1 c9890n1 = this.f19421d;
                if (c9890n1.f19870c.f20373a) {
                    String m1471c = this.f19429l.m1471c();
                    String m1472b = this.f19429l.m1472b();
                    String str5 = this.f19429l.f19739d;
                    if (str5 != null && str5.length() > 3) {
                        try {
                            JSONObject jSONObject = new JSONObject(str5.substring(3));
                            str5 = jSONObject.isNull(AdColonyAdapterUtils.KEY_APP_ID) ? null : jSONObject.optString(AdColonyAdapterUtils.KEY_APP_ID, null);
                        } catch (JSONException e) {
                            Log.e("Advertisement", "JsonException : ", e);
                        }
                    }
                    if (TextUtils.isEmpty(str5)) {
                        str4 = VungleApiClient.ConnectionTypeDetail.UNKNOWN;
                    } else {
                        str4 = str5;
                    }
                    C9881o c9881o = new C9881o(System.currentTimeMillis(), m1471c, m1472b, str4);
                    C9928h c9928h2 = c9890n1.f19868a;
                    c9928h2.m1376w(c9881o);
                    C10122c.C10123a c10123a = c9890n1.f19870c.f20376d;
                    if (c10123a != null) {
                        i = c10123a.f20377a;
                    }
                    c9928h2.m1377v(new CallableC9953q(c9928h2, i));
                    return;
                }
                return;
            }
            if (str.equals("end")) {
                Log.d("Vungle", "Cleaning up metadata and assets for placement " + str3 + " and advertisement " + this.f19429l.getId());
                c9928h.m1374y(this.f19429l, str3, 3);
                c9928h.m1377v(new CallableC9947k(c9928h, str3, this.f19429l.f19739d));
                this.f19420c.mo1353a(C9986h.m1356b(false));
                mo1588b();
                if (interfaceC9782e0 != null) {
                    if (!this.f19425h && this.f19426i < 80) {
                        z = false;
                        if (str2 != null && str2.equals("isCTAClicked")) {
                            z2 = true;
                        }
                        interfaceC9782e0.onAdEnd(str3, z, z2);
                        interfaceC9782e0.onAdEnd(str3);
                        C9846m1 m1477b = C9846m1.m1477b();
                        C8695r c8695r = new C8695r();
                        c8695r.m3215u("event", C0539e.m12265a(16));
                        c8695r.m3215u(C1828a.m9909a(4), this.f19429l.getId());
                        m1477b.m1474e(new C9879m(16, c8695r));
                        sb = new StringBuilder("onAdEnd: ");
                    }
                    z = true;
                    if (str2 != null) {
                        z2 = true;
                    }
                    interfaceC9782e0.onAdEnd(str3, z, z2);
                    interfaceC9782e0.onAdEnd(str3);
                    C9846m1 m1477b2 = C9846m1.m1477b();
                    C8695r c8695r2 = new C8695r();
                    c8695r2.m3215u("event", C0539e.m12265a(16));
                    c8695r2.m3215u(C1828a.m9909a(4), this.f19429l.getId());
                    m1477b2.m1474e(new C9879m(16, c8695r2));
                    sb = new StringBuilder("onAdEnd: ");
                } else {
                    return;
                }
            } else if (this.f19428k.f19771c && str.equals("successfulView")) {
                this.f19425h = true;
                if (!this.f19427j) {
                    this.f19427j = true;
                    if (interfaceC9782e0 != null) {
                        interfaceC9782e0.onAdRewarded(str3);
                        C9846m1 m1477b3 = C9846m1.m1477b();
                        C8695r c8695r3 = new C8695r();
                        c8695r3.m3215u("event", C0539e.m12265a(14));
                        c8695r3.m3215u(C1828a.m9909a(4), this.f19429l.getId());
                        m1477b3.m1474e(new C9879m(14, c8695r3));
                        sb = new StringBuilder("onAdRewarded: ");
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (str.startsWith("percentViewed") && this.f19428k.f19771c) {
                String[] split = str.split(":");
                if (split.length == 2) {
                    this.f19426i = Integer.parseInt(split[1]);
                }
                if (!this.f19427j && this.f19426i >= 80) {
                    this.f19427j = true;
                    if (interfaceC9782e0 != null) {
                        interfaceC9782e0.onAdRewarded(str3);
                        C9846m1 m1477b4 = C9846m1.m1477b();
                        C8695r c8695r4 = new C8695r();
                        c8695r4.m3215u("event", C0539e.m12265a(14));
                        c8695r4.m3215u(C1828a.m9909a(4), this.f19429l.getId());
                        m1477b4.m1474e(new C9879m(14, c8695r4));
                        sb = new StringBuilder("onAdRewarded: ");
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if ("open".equals(str) && interfaceC9782e0 != null) {
                if ("adClick".equals(str2)) {
                    interfaceC9782e0.onAdClick(str3);
                    sb = new StringBuilder("onAdClick: ");
                } else if ("adLeftApplication".equals(str2)) {
                    interfaceC9782e0.onAdLeftApplication(str3);
                    sb = new StringBuilder("onAdLeftApplication: ");
                } else {
                    return;
                }
            } else if ("adViewed".equals(str) && interfaceC9782e0 != null) {
                interfaceC9782e0.onAdViewed(str3);
                return;
            } else if ("attach".equals(str) && interfaceC9782e0 != null) {
                interfaceC9782e0.creativeId(str2);
                return;
            } else {
                return;
            }
            sb.append(str3);
            VungleLogger.m1604b("AdEventListener#PlayAdCallback", sb.toString());
        } catch (C9919c.C9920a unused) {
            m1589a(str3, new VungleException(26));
        }
    }
}

package com.unity3d.services.store.core.api;

import com.unity3d.services.ads.gmascar.handlers.C9344e;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import com.unity3d.services.store.C9650c;
import com.unity3d.services.store.EnumC9648a;
import com.unity3d.services.store.EnumC9649b;
import com.unity3d.services.store.core.C9655a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class Store {

    /* renamed from: a */
    private static final C9655a f19193a = new C9655a(new C9344e());

    /* renamed from: com.unity3d.services.store.core.api.Store$a */
    /* loaded from: classes3.dex */
    public static class RunnableC9656a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Integer f19194a;

        /* renamed from: b */
        final /* synthetic */ String f19195b;

        public RunnableC9656a(Integer num, String str) {
            this.f19194a = num;
            this.f19195b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C9650c.m1724b(this.f19194a.intValue(), this.f19195b);
        }
    }

    @WebViewExposed
    public static void getPurchaseHistory(Integer num, String str, Integer num2, C9644l c9644l) {
        if (!C9650c.m1725b()) {
            c9644l.m1737a(EnumC9648a.NOT_INITIALIZED, new Object[0]);
            return;
        }
        C9650c.m1729a(num.intValue(), str, num2.intValue());
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void getPurchases(Integer num, String str, C9644l c9644l) {
        if (!C9650c.m1725b()) {
            c9644l.m1737a(EnumC9648a.NOT_INITIALIZED, new Object[0]);
            return;
        }
        C9650c.m1730a(num.intValue(), str);
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void getSkuDetails(Integer num, String str, JSONArray jSONArray, C9644l c9644l) {
        if (!C9650c.m1725b()) {
            c9644l.m1737a(EnumC9648a.NOT_INITIALIZED, new Object[0]);
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            C9650c.m1728a(num.intValue(), str, arrayList);
        } catch (JSONException e) {
            f19193a.m1722a(EnumC9649b.SKU_DETAILS_LIST_REQUEST_ERROR, num.intValue(), e);
        }
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void initialize(C9644l c9644l) {
        try {
            C9650c.m1727a(f19193a);
            c9644l.m1736a(new Object[0]);
        } catch (Exception e) {
            c9644l.m1737a(EnumC9648a.UNKNOWN_ERROR, e.getMessage(), e.getClass().getName());
        }
    }

    @WebViewExposed
    public static void isFeatureSupported(Integer num, String str, C9644l c9644l) {
        if (!C9650c.m1725b()) {
            c9644l.m1737a(EnumC9648a.NOT_INITIALIZED, new Object[0]);
            return;
        }
        new Thread(new RunnableC9656a(num, str)).start();
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void startPurchaseTracking(JSONArray jSONArray, C9644l c9644l) {
        if (!C9650c.m1725b()) {
            c9644l.m1737a(EnumC9648a.NOT_INITIALIZED, new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(jSONArray.getString(i));
            } catch (JSONException e) {
                c9644l.m1737a(EnumC9648a.JSON_ERROR, e.getMessage());
                return;
            }
        }
        C9650c.m1726a(arrayList);
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void stopPurchaseTracking(C9644l c9644l) {
        if (!C9650c.m1725b()) {
            c9644l.m1737a(EnumC9648a.NOT_INITIALIZED, new Object[0]);
            return;
        }
        C9650c.m1723c();
        c9644l.m1736a(new Object[0]);
    }
}

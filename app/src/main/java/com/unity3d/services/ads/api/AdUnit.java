package com.unity3d.services.ads.api;

import android.content.Intent;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.WindowInsets;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.ads.adunit.AdUnitSoftwareActivity;
import com.unity3d.services.ads.adunit.AdUnitTransparentActivity;
import com.unity3d.services.ads.adunit.AdUnitTransparentSoftwareActivity;
import com.unity3d.services.ads.adunit.C9296c;
import com.unity3d.services.ads.adunit.EnumC9294a;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.properties.C9568a;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class AdUnit {

    /* renamed from: a */
    private static AdUnitActivity f18173a = null;

    /* renamed from: b */
    private static int f18174b = -1;

    /* renamed from: com.unity3d.services.ads.api.AdUnit$a */
    /* loaded from: classes3.dex */
    public static class RunnableC9304a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JSONArray f18175a;

        public RunnableC9304a(JSONArray jSONArray) {
            this.f18175a = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                try {
                    AdUnit.getAdUnitActivity().m2505a(AdUnit.m2470c(this.f18175a));
                } catch (Exception e) {
                    C9549a.m2023a("Corrupted viewlist", e);
                }
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.api.AdUnit$b */
    /* loaded from: classes3.dex */
    public static class RunnableC9305b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Integer f18176a;

        public RunnableC9305b(Integer num) {
            this.f18176a = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                AdUnit.getAdUnitActivity().m2503b(this.f18176a.intValue());
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.api.AdUnit$c */
    /* loaded from: classes3.dex */
    public static class RunnableC9306c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Boolean f18177a;

        public RunnableC9306c(Boolean bool) {
            this.f18177a = bool;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                AdUnit.getAdUnitActivity().m2506a(this.f18177a.booleanValue());
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.api.AdUnit$d */
    /* loaded from: classes3.dex */
    public static class RunnableC9307d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Integer f18178a;

        public RunnableC9307d(Integer num) {
            this.f18178a = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                AdUnit.getAdUnitActivity().m2500c(this.f18178a.intValue());
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.api.AdUnit$e */
    /* loaded from: classes3.dex */
    public static class RunnableC9308e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f18179a;

        /* renamed from: b */
        final /* synthetic */ Integer f18180b;

        /* renamed from: c */
        final /* synthetic */ Integer f18181c;

        /* renamed from: d */
        final /* synthetic */ Integer f18182d;

        /* renamed from: e */
        final /* synthetic */ Integer f18183e;

        public RunnableC9308e(String str, Integer num, Integer num2, Integer num3, Integer num4) {
            this.f18179a = str;
            this.f18180b = num;
            this.f18181c = num2;
            this.f18182d = num3;
            this.f18183e = num4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                AdUnit.getAdUnitActivity().m2508a(this.f18179a, this.f18180b.intValue(), this.f18181c.intValue(), this.f18182d.intValue(), this.f18183e.intValue());
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.api.AdUnit$f */
    /* loaded from: classes3.dex */
    public static class RunnableC9309f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Integer f18184a;

        public RunnableC9309f(Integer num) {
            this.f18184a = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                AdUnit.getAdUnitActivity().m2511a(this.f18184a.intValue());
            }
        }
    }

    private AdUnit() {
    }

    /* renamed from: b */
    private static ArrayList<Integer> m2471b(JSONArray jSONArray) throws JSONException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            Integer valueOf = Integer.valueOf(i);
            if (valueOf.intValue() >= jSONArray.length()) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(jSONArray.getInt(valueOf.intValue())));
            i = valueOf.intValue() + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static String[] m2470c(JSONArray jSONArray) throws JSONException {
        String[] strArr = new String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            strArr[i] = jSONArray.getString(i);
        }
        return strArr;
    }

    @WebViewExposed
    public static void clearMotionEventCapture(C9644l c9644l) {
        if (getAdUnitActivity() == null) {
            c9644l.m1737a(EnumC9294a.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().m2504b() == null) {
            c9644l.m1737a(EnumC9294a.LAYOUT_NULL, new Object[0]);
        } else {
            getAdUnitActivity().m2504b().m2486a();
            c9644l.m1736a(new Object[0]);
        }
    }

    @WebViewExposed
    public static void close(C9644l c9644l) {
        if (getAdUnitActivity() == null) {
            c9644l.m1737a(EnumC9294a.ADUNIT_NULL, new Object[0]);
            return;
        }
        getAdUnitActivity().finish();
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void endMotionEventCapture(C9644l c9644l) {
        if (getAdUnitActivity() == null) {
            c9644l.m1737a(EnumC9294a.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().m2504b() == null) {
            c9644l.m1737a(EnumC9294a.LAYOUT_NULL, new Object[0]);
        } else {
            getAdUnitActivity().m2504b().m2482b();
            c9644l.m1736a(new Object[0]);
        }
    }

    public static AdUnitActivity getAdUnitActivity() {
        return f18173a;
    }

    public static int getCurrentAdUnitActivityId() {
        return f18174b;
    }

    @WebViewExposed
    public static void getCurrentMotionEventCount(C9644l c9644l) {
        if (getAdUnitActivity() == null) {
            c9644l.m1737a(EnumC9294a.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().m2504b() != null) {
            c9644l.m1736a(Integer.valueOf(getAdUnitActivity().m2504b().getCurrentEventCount()));
        } else {
            c9644l.m1737a(EnumC9294a.LAYOUT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getMotionEventCount(JSONArray jSONArray, C9644l c9644l) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
            } catch (Exception e) {
                C9549a.m2023a("Error retrieving int from eventTypes", e);
            }
        }
        if (getAdUnitActivity() == null) {
            c9644l.m1737a(EnumC9294a.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().m2504b() == null) {
            c9644l.m1737a(EnumC9294a.LAYOUT_NULL, new Object[0]);
        } else if (getAdUnitActivity().m2504b().getCurrentEventCount() >= getAdUnitActivity().m2504b().getMaxEventCount()) {
            c9644l.m1737a(EnumC9294a.MAX_MOTION_EVENT_COUNT_REACHED, new Object[0]);
        } else {
            SparseIntArray m2483a = getAdUnitActivity().m2504b().m2483a(arrayList);
            JSONObject jSONObject = new JSONObject();
            for (int i2 = 0; i2 < m2483a.size(); i2++) {
                int keyAt = m2483a.keyAt(i2);
                try {
                    jSONObject.put(Integer.toString(keyAt), m2483a.get(keyAt));
                } catch (Exception e2) {
                    C9549a.m2023a("Error building response JSON", e2);
                }
            }
            c9644l.m1736a(jSONObject);
        }
    }

    @WebViewExposed
    public static void getMotionEventData(JSONObject jSONObject, C9644l c9644l) {
        JSONArray jSONArray;
        Iterator<String> keys = jSONObject.keys();
        SparseArray<ArrayList<Integer>> sparseArray = new SparseArray<>();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            String next = keys.next();
            int parseInt = Integer.parseInt(next);
            if (sparseArray.get(parseInt) == null) {
                sparseArray.put(parseInt, new ArrayList<>());
            }
            try {
                jSONArray = jSONObject.getJSONArray(next);
            } catch (Exception e) {
                C9549a.m2023a("Couldn't fetch keyIndices", e);
                jSONArray = null;
            }
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        sparseArray.get(parseInt).add(Integer.valueOf(jSONArray.getInt(i)));
                    } catch (Exception e2) {
                        C9549a.m2023a("Couldn't add value to requested infos", e2);
                    }
                }
            }
        }
        if (getAdUnitActivity() == null) {
            c9644l.m1737a(EnumC9294a.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().m2504b() == null) {
            c9644l.m1737a(EnumC9294a.LAYOUT_NULL, new Object[0]);
        } else if (getAdUnitActivity().m2504b().getCurrentEventCount() >= getAdUnitActivity().m2504b().getMaxEventCount()) {
            c9644l.m1737a(EnumC9294a.MAX_MOTION_EVENT_COUNT_REACHED, new Object[0]);
        } else {
            SparseArray<SparseArray<C9296c>> m2484a = getAdUnitActivity().m2504b().m2484a(sparseArray);
            JSONObject jSONObject2 = new JSONObject();
            for (int i2 = 0; i2 < m2484a.size(); i2++) {
                int keyAt = m2484a.keyAt(i2);
                SparseArray<C9296c> sparseArray2 = m2484a.get(keyAt);
                JSONObject jSONObject3 = new JSONObject();
                for (int i3 = 0; i3 < sparseArray2.size(); i3++) {
                    JSONObject jSONObject4 = new JSONObject();
                    int keyAt2 = sparseArray2.keyAt(i3);
                    C9296c c9296c = sparseArray2.get(keyAt2);
                    try {
                        jSONObject4.put("action", c9296c.m2497a());
                        jSONObject4.put("isObscured", c9296c.m2488j());
                        jSONObject4.put("toolType", c9296c.m2491g());
                        jSONObject4.put(FirebaseAnalytics.Param.SOURCE, c9296c.m2492f());
                        jSONObject4.put("deviceId", c9296c.m2496b());
                        jSONObject4.put("x", c9296c.m2490h());
                        jSONObject4.put("y", c9296c.m2489i());
                        jSONObject4.put("eventTime", c9296c.m2495c());
                        jSONObject4.put("pressure", c9296c.m2494d());
                        jSONObject4.put("size", c9296c.m2493e());
                        jSONObject3.put(Integer.toString(keyAt2), jSONObject4);
                    } catch (Exception e3) {
                        C9549a.m2022a("Couldn't construct event info", e3);
                    }
                }
                try {
                    jSONObject2.put(Integer.toString(keyAt), jSONObject3);
                } catch (Exception e4) {
                    C9549a.m2022a("Couldn't construct info object", e4);
                }
            }
            c9644l.m1736a(jSONObject2);
        }
    }

    @WebViewExposed
    public static void getOrientation(C9644l c9644l) {
        if (getAdUnitActivity() != null) {
            c9644l.m1736a(Integer.valueOf(getAdUnitActivity().getRequestedOrientation()));
        } else {
            c9644l.m1737a(EnumC9294a.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getSafeAreaInsets(C9644l c9644l) {
        if (getAdUnitActivity() == null || getAdUnitActivity().m2504b() == null) {
            c9644l.m1737a(EnumC9294a.ADUNIT_NULL, new Object[0]);
        } else if (Build.VERSION.SDK_INT < 28) {
            c9644l.m1737a(EnumC9294a.API_LEVEL_ERROR, new Object[0]);
        } else {
            WindowInsets rootWindowInsets = getAdUnitActivity().m2504b().getRootWindowInsets();
            if (rootWindowInsets == null) {
                c9644l.m1737a(EnumC9294a.NO_DISPLAY_CUTOUT_AVAILABLE, new Object[0]);
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                Object invoke = rootWindowInsets.getClass().getMethod("getDisplayCutout", new Class[0]).invoke(rootWindowInsets, new Object[0]);
                if (invoke != null) {
                    Object invoke2 = invoke.getClass().getMethod("getSafeInsetTop", new Class[0]).invoke(invoke, new Object[0]);
                    Object invoke3 = invoke.getClass().getMethod("getSafeInsetRight", new Class[0]).invoke(invoke, new Object[0]);
                    Object invoke4 = invoke.getClass().getMethod("getSafeInsetBottom", new Class[0]).invoke(invoke, new Object[0]);
                    Object invoke5 = invoke.getClass().getMethod("getSafeInsetLeft", new Class[0]).invoke(invoke, new Object[0]);
                    jSONObject.put("top", invoke2);
                    jSONObject.put("right", invoke3);
                    jSONObject.put("bottom", invoke4);
                    jSONObject.put("left", invoke5);
                    c9644l.m1736a(jSONObject);
                } else {
                    c9644l.m1737a(EnumC9294a.NO_DISPLAY_CUTOUT_AVAILABLE, new Object[0]);
                }
            } catch (IllegalAccessException e) {
                e = e;
                c9644l.m1737a(EnumC9294a.DISPLAY_CUTOUT_INVOKE_FAILED, new Object[0]);
                C9549a.m2022a("Error while calling displayCutout getter", e);
            } catch (NoSuchMethodException e2) {
                c9644l.m1737a(EnumC9294a.DISPLAY_CUTOUT_METHOD_NOT_AVAILABLE, new Object[0]);
                C9549a.m2022a("Method getDisplayCutout not found", e2);
            } catch (InvocationTargetException e3) {
                e = e3;
                c9644l.m1737a(EnumC9294a.DISPLAY_CUTOUT_INVOKE_FAILED, new Object[0]);
                C9549a.m2022a("Error while calling displayCutout getter", e);
            } catch (JSONException e4) {
                c9644l.m1737a(EnumC9294a.DISPLAY_CUTOUT_JSON_ERROR, new Object[0]);
                C9549a.m2022a("JSON error while constructing display cutout object", e4);
            }
        }
    }

    @WebViewExposed
    public static void getViewFrame(String str, C9644l c9644l) {
        if (getAdUnitActivity() == null) {
            c9644l.m1737a(EnumC9294a.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().m2502b(str) == null) {
            c9644l.m1737a(EnumC9294a.UNKNOWN_VIEW, new Object[0]);
        } else {
            Map<String, Integer> m2502b = getAdUnitActivity().m2502b(str);
            c9644l.m1736a(m2502b.get("x"), m2502b.get("y"), m2502b.get("width"), m2502b.get("height"));
        }
    }

    @WebViewExposed
    public static void getViews(C9644l c9644l) {
        if (getAdUnitActivity() != null) {
            c9644l.m1736a(new JSONArray((Collection) Arrays.asList(getAdUnitActivity().m2501c())));
        } else {
            c9644l.m1737a(EnumC9294a.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, C9644l c9644l) {
        open(num, jSONArray, num2, null, c9644l);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, C9644l c9644l) {
        open(num, jSONArray, num2, jSONArray2, 0, Boolean.TRUE, c9644l);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, Integer num3, Boolean bool, C9644l c9644l) {
        open(num, jSONArray, num2, jSONArray2, num3, bool, Boolean.FALSE, c9644l);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, Integer num3, Boolean bool, Boolean bool2, C9644l c9644l) {
        open(num, jSONArray, num2, jSONArray2, num3, bool, bool2, 0, c9644l);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, Integer num3, Boolean bool, Boolean bool2, Integer num4, C9644l c9644l) {
        Intent intent;
        if (!bool.booleanValue() && bool2.booleanValue()) {
            C9549a.m2019b("Unity Ads opening new transparent ad unit activity, hardware acceleration disabled");
            intent = new Intent(C9568a.m1967a(), AdUnitTransparentSoftwareActivity.class);
        } else if (bool.booleanValue() && !bool2.booleanValue()) {
            C9549a.m2019b("Unity Ads opening new hardware accelerated ad unit activity");
            intent = new Intent(C9568a.m1967a(), AdUnitActivity.class);
        } else if (bool.booleanValue() && bool2.booleanValue()) {
            C9549a.m2019b("Unity Ads opening new hardware accelerated transparent ad unit activity");
            intent = new Intent(C9568a.m1967a(), AdUnitTransparentActivity.class);
        } else {
            C9549a.m2019b("Unity Ads opening new ad unit activity, hardware acceleration disabled");
            intent = new Intent(C9568a.m1967a(), AdUnitSoftwareActivity.class);
        }
        intent.addFlags(268500992);
        if (num == null) {
            C9549a.m2017c("Activity ID is NULL");
            c9644l.m1737a(EnumC9294a.ACTIVITY_ID, "Activity ID NULL");
            return;
        }
        try {
            intent.putExtra("activityId", num.intValue());
            setCurrentAdUnitActivityId(num.intValue());
            try {
                intent.putExtra("views", m2470c(jSONArray));
                if (jSONArray2 != null) {
                    try {
                        intent.putExtra("keyEvents", m2471b(jSONArray2));
                    } catch (Exception e) {
                        C9549a.m2023a("Error parsing views from viewList", e);
                        c9644l.m1737a(EnumC9294a.CORRUPTED_KEYEVENTLIST, jSONArray2, e.getMessage());
                        return;
                    }
                }
                intent.putExtra("systemUiVisibility", num3);
                intent.putExtra("orientation", num2);
                intent.putExtra("displayCutoutMode", num4);
                C9568a.m1967a().startActivity(intent);
                C9549a.m2019b("Opened AdUnitActivity with: " + jSONArray.toString());
                c9644l.m1736a(new Object[0]);
            } catch (Exception e2) {
                C9549a.m2023a("Error parsing views from viewList", e2);
                c9644l.m1737a(EnumC9294a.CORRUPTED_VIEWLIST, jSONArray, e2.getMessage());
            }
        } catch (Exception e3) {
            C9549a.m2023a("Could not set activityId for intent", e3);
            c9644l.m1737a(EnumC9294a.ACTIVITY_ID, Integer.valueOf(num.intValue()), e3.getMessage());
        }
    }

    public static void setAdUnitActivity(AdUnitActivity adUnitActivity) {
        f18173a = adUnitActivity;
    }

    public static void setCurrentAdUnitActivityId(int i) {
        f18174b = i;
    }

    @WebViewExposed
    public static void setKeepScreenOn(Boolean bool, C9644l c9644l) {
        C9564j.m1991a(new RunnableC9306c(bool));
        if (getAdUnitActivity() != null) {
            c9644l.m1736a(new Object[0]);
        } else {
            c9644l.m1737a(EnumC9294a.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setKeyEventList(JSONArray jSONArray, C9644l c9644l) {
        if (getAdUnitActivity() == null) {
            c9644l.m1737a(EnumC9294a.ADUNIT_NULL, new Object[0]);
            return;
        }
        try {
            getAdUnitActivity().m2507a(m2471b(jSONArray));
            c9644l.m1736a(jSONArray);
        } catch (Exception e) {
            C9549a.m2023a("Error parsing views from viewList", e);
            c9644l.m1737a(EnumC9294a.CORRUPTED_KEYEVENTLIST, jSONArray, e.getMessage());
        }
    }

    @WebViewExposed
    public static void setLayoutInDisplayCutoutMode(Integer num, C9644l c9644l) {
        C9564j.m1991a(new RunnableC9309f(num));
        if (getAdUnitActivity() != null) {
            c9644l.m1736a(num);
        } else {
            c9644l.m1737a(EnumC9294a.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setOrientation(Integer num, C9644l c9644l) {
        C9564j.m1991a(new RunnableC9305b(num));
        if (getAdUnitActivity() != null) {
            c9644l.m1736a(num);
        } else {
            c9644l.m1737a(EnumC9294a.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setSystemUiVisibility(Integer num, C9644l c9644l) {
        C9564j.m1991a(new RunnableC9307d(num));
        if (getAdUnitActivity() != null) {
            c9644l.m1736a(num);
        } else {
            c9644l.m1737a(EnumC9294a.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setViewFrame(String str, Integer num, Integer num2, Integer num3, Integer num4, C9644l c9644l) {
        C9564j.m1991a(new RunnableC9308e(str, num, num2, num3, num4));
        if (getAdUnitActivity() != null) {
            c9644l.m1736a(new Object[0]);
        } else {
            c9644l.m1737a(EnumC9294a.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setViews(JSONArray jSONArray, C9644l c9644l) {
        boolean z;
        try {
            m2470c(jSONArray);
            z = false;
        } catch (JSONException unused) {
            c9644l.m1737a(EnumC9294a.CORRUPTED_VIEWLIST, jSONArray);
            z = true;
        }
        if (!z) {
            C9564j.m1991a(new RunnableC9304a(jSONArray));
        }
        if (getAdUnitActivity() != null) {
            c9644l.m1736a(jSONArray);
        } else {
            c9644l.m1737a(EnumC9294a.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void startMotionEventCapture(Integer num, C9644l c9644l) {
        if (getAdUnitActivity() == null) {
            c9644l.m1737a(EnumC9294a.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().m2504b() == null) {
            c9644l.m1737a(EnumC9294a.LAYOUT_NULL, new Object[0]);
        } else {
            getAdUnitActivity().m2504b().m2485a(num.intValue());
            c9644l.m1736a(new Object[0]);
        }
    }
}

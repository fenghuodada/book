package com.unity3d.services.ads.adunit;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.ads.configuration.IAdsModuleConfiguration;
import com.unity3d.services.core.api.Intent;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.misc.C9565k;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class AdUnitActivity extends Activity {

    /* renamed from: a */
    protected C9298e f18115a;

    /* renamed from: b */
    private String[] f18116b;

    /* renamed from: c */
    private int f18117c = -1;

    /* renamed from: d */
    private int f18118d;

    /* renamed from: e */
    private int f18119e;

    /* renamed from: f */
    private ArrayList<Integer> f18120f;

    /* renamed from: g */
    boolean f18121g;

    /* renamed from: h */
    private Map<String, InterfaceC9299f> f18122h;

    /* renamed from: i */
    private int f18123i;

    /* renamed from: a */
    private InterfaceC9299f m2509a(String str) {
        Map<String, Class> adUnitViewHandlers;
        if (C9620a.m1774c() != null) {
            Configuration m1780b = C9620a.m1774c().m1780b();
            for (String str2 : m1780b.getModuleConfigurationList()) {
                IModuleConfiguration moduleConfiguration = m1780b.getModuleConfiguration(str2);
                if ((moduleConfiguration instanceof IAdsModuleConfiguration) && (adUnitViewHandlers = ((IAdsModuleConfiguration) moduleConfiguration).getAdUnitViewHandlers()) != null && adUnitViewHandlers.containsKey(str)) {
                    try {
                        return (InterfaceC9299f) adUnitViewHandlers.get(str).newInstance();
                    } catch (Exception unused) {
                        C9549a.m2017c("Error creating view: " + str);
                        return null;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m2510a(View view) {
        if (view == null) {
            finish();
            C9549a.m2017c("Could not place view because it is null, finishing activity");
            return false;
        } else if (view.getParent() != null && view.getParent().equals(this.f18115a)) {
            this.f18115a.bringChildToFront(view);
            return true;
        } else {
            C9565k.m1982a(view);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            layoutParams.setMargins(0, 0, 0, 0);
            view.setPadding(0, 0, 0, 0);
            this.f18115a.addView(view, layoutParams);
            return true;
        }
    }

    /* renamed from: a */
    public void mo2498a() {
        if (this.f18115a != null) {
            return;
        }
        C9298e c9298e = new C9298e(this);
        this.f18115a = c9298e;
        c9298e.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        C9565k.m1981a(this.f18115a, new ColorDrawable(-16777216));
    }

    /* renamed from: a */
    public void m2511a(int i) {
        this.f18123i = i;
        if (Build.VERSION.SDK_INT < 28 || getWindow() == null) {
            return;
        }
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        try {
            attributes.getClass().getField("layoutInDisplayCutoutMode").setInt(attributes, i);
        } catch (IllegalAccessException e) {
            C9549a.m2022a("Error setting layoutInDisplayCutoutMode", e);
        } catch (NoSuchFieldException e2) {
            C9549a.m2022a("Error getting layoutInDisplayCutoutMode", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2508a(java.lang.String r3, int r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            com.unity3d.services.ads.adunit.f r0 = r2.m2499c(r3)
            java.lang.String r1 = "adunit"
            boolean r3 = r3.equals(r1)
            r1 = 0
            if (r3 == 0) goto L1b
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r6, r7)
            r3.setMargins(r4, r5, r1, r1)
            com.unity3d.services.ads.adunit.e r0 = r2.f18115a
            r0.setLayoutParams(r3)
            goto L22
        L1b:
            if (r0 == 0) goto L22
            android.view.View r3 = r0.mo2478b()
            goto L23
        L22:
            r3 = 0
        L23:
            if (r3 == 0) goto L30
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r0.<init>(r6, r7)
            r0.setMargins(r4, r5, r1, r1)
            r3.setLayoutParams(r0)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.adunit.AdUnitActivity.m2508a(java.lang.String, int, int, int, int):void");
    }

    /* renamed from: a */
    public void m2507a(ArrayList<Integer> arrayList) {
        this.f18120f = arrayList;
    }

    /* renamed from: a */
    public void m2505a(String[] strArr) {
        if (strArr == null) {
            strArr = new String[0];
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        if (this.f18116b == null) {
            this.f18116b = new String[0];
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList(this.f18116b));
        arrayList2.removeAll(arrayList);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            m2499c((String) it.next()).mo2481a();
        }
        this.f18116b = strArr;
        for (String str : strArr) {
            if (str != null) {
                InterfaceC9299f m2499c = m2499c(str);
                m2499c.mo2474e(this);
                if (!m2510a(m2499c.mo2478b())) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m2506a(boolean z) {
        this.f18121g = z;
        if (getWindow() == null) {
            return false;
        }
        if (z) {
            getWindow().addFlags(128);
            return true;
        }
        getWindow().clearFlags(128);
        return true;
    }

    /* renamed from: b */
    public C9298e m2504b() {
        return this.f18115a;
    }

    /* renamed from: b */
    public Map<String, Integer> m2502b(String str) {
        InterfaceC9299f m2499c = m2499c(str);
        if (str.equals("adunit")) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f18115a.getLayoutParams();
            HashMap hashMap = new HashMap();
            hashMap.put("x", Integer.valueOf(layoutParams.leftMargin));
            hashMap.put("y", Integer.valueOf(layoutParams.topMargin));
            hashMap.put("width", Integer.valueOf(this.f18115a.getWidth()));
            hashMap.put("height", Integer.valueOf(this.f18115a.getHeight()));
            return hashMap;
        }
        View mo2478b = m2499c != null ? m2499c.mo2478b() : null;
        if (mo2478b != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) mo2478b.getLayoutParams();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("x", Integer.valueOf(layoutParams2.leftMargin));
            hashMap2.put("y", Integer.valueOf(layoutParams2.topMargin));
            hashMap2.put("width", Integer.valueOf(mo2478b.getWidth()));
            hashMap2.put("height", Integer.valueOf(mo2478b.getHeight()));
            return hashMap2;
        }
        return null;
    }

    /* renamed from: b */
    public void m2503b(int i) {
        this.f18117c = i;
        setRequestedOrientation(i);
    }

    /* renamed from: c */
    public InterfaceC9299f m2499c(String str) {
        Map<String, InterfaceC9299f> map = this.f18122h;
        if (map == null || !map.containsKey(str)) {
            InterfaceC9299f m2509a = m2509a(str);
            if (m2509a != null) {
                if (this.f18122h == null) {
                    this.f18122h = new HashMap();
                }
                this.f18122h.put(str, m2509a);
            }
            return m2509a;
        }
        return this.f18122h.get(str);
    }

    /* renamed from: c */
    public boolean m2500c(int i) {
        this.f18118d = i;
        try {
            getWindow().getDecorView().setSystemUiVisibility(i);
            return true;
        } catch (Exception e) {
            C9549a.m2023a("Error while setting SystemUIVisibility", e);
            return false;
        }
    }

    /* renamed from: c */
    public String[] m2501c() {
        return this.f18116b;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        EnumC9295b enumC9295b;
        super.onCreate(bundle);
        if (C9620a.m1774c() == null) {
            C9549a.m2017c("Unity Ads web app is null, closing Unity Ads activity from onCreate");
            finish();
            return;
        }
        AdUnit.setAdUnitActivity(this);
        Intent.setActiveActivity(this);
        mo2498a();
        C9565k.m1982a(this.f18115a);
        C9298e c9298e = this.f18115a;
        addContentView(c9298e, c9298e.getLayoutParams());
        if (bundle == null) {
            this.f18116b = getIntent().getStringArrayExtra("views");
            this.f18120f = getIntent().getIntegerArrayListExtra("keyEvents");
            if (getIntent().hasExtra("orientation")) {
                this.f18117c = getIntent().getIntExtra("orientation", -1);
            }
            if (getIntent().hasExtra("systemUiVisibility")) {
                this.f18118d = getIntent().getIntExtra("systemUiVisibility", 0);
            }
            if (getIntent().hasExtra("activityId")) {
                this.f18119e = getIntent().getIntExtra("activityId", -1);
            }
            if (getIntent().hasExtra("displayCutoutMode")) {
                this.f18123i = getIntent().getIntExtra("displayCutoutMode", 0);
            }
            enumC9295b = EnumC9295b.ON_CREATE;
        } else {
            this.f18116b = bundle.getStringArray("views");
            this.f18117c = bundle.getInt("orientation", -1);
            this.f18118d = bundle.getInt("systemUiVisibility", 0);
            this.f18120f = bundle.getIntegerArrayList("keyEvents");
            this.f18121g = bundle.getBoolean("keepScreenOn");
            this.f18119e = bundle.getInt("activityId", -1);
            this.f18123i = bundle.getInt("displayCutoutMode", 0);
            m2506a(this.f18121g);
            enumC9295b = EnumC9295b.ON_RESTORE;
        }
        m2503b(this.f18117c);
        m2500c(this.f18118d);
        m2511a(this.f18123i);
        String[] strArr = this.f18116b;
        if (strArr != null) {
            for (String str : strArr) {
                InterfaceC9299f m2499c = m2499c(str);
                if (m2499c != null) {
                    m2499c.mo2479a(this, bundle);
                }
            }
        }
        C9620a.m1774c().m1784a(EnumC9627b.ADUNIT, enumC9295b, Integer.valueOf(this.f18119e));
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (C9620a.m1774c() == null) {
            if (isFinishing()) {
                return;
            }
            C9549a.m2017c("Unity Ads web app is null, closing Unity Ads activity from onDestroy");
            finish();
            return;
        }
        C9620a.m1774c().m1784a(EnumC9627b.ADUNIT, EnumC9295b.ON_DESTROY, Boolean.valueOf(isFinishing()), Integer.valueOf(this.f18119e));
        Map<String, InterfaceC9299f> map = this.f18122h;
        if (map != null) {
            for (Map.Entry<String, InterfaceC9299f> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().mo2473f(this);
                }
            }
        }
        if (AdUnit.getCurrentAdUnitActivityId() == this.f18119e) {
            AdUnit.setAdUnitActivity(null);
        }
        Intent.removeActiveActivity(this);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        ArrayList<Integer> arrayList = this.f18120f;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(i))) {
            return false;
        }
        C9620a.m1774c().m1784a(EnumC9627b.ADUNIT, EnumC9295b.KEY_DOWN, Integer.valueOf(i), Long.valueOf(keyEvent.getEventTime()), Long.valueOf(keyEvent.getDownTime()), Integer.valueOf(keyEvent.getRepeatCount()), Integer.valueOf(this.f18119e));
        return true;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (C9620a.m1774c() == null) {
            if (isFinishing()) {
                return;
            }
            C9549a.m2017c("Unity Ads web app is null, closing Unity Ads activity from onPause");
            finish();
            return;
        }
        if (C9620a.m1774c().m1770g() == null) {
            C9549a.m2014e("Unity Ads web view is null, from onPause");
        } else if (isFinishing()) {
            C9565k.m1982a(C9620a.m1774c().m1770g());
        }
        Map<String, InterfaceC9299f> map = this.f18122h;
        if (map != null) {
            for (Map.Entry<String, InterfaceC9299f> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().mo2477b(this);
                }
            }
        }
        C9620a.m1774c().m1784a(EnumC9627b.ADUNIT, EnumC9295b.ON_PAUSE, Boolean.valueOf(isFinishing()), Integer.valueOf(this.f18119e));
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            for (String str : strArr) {
                jSONArray.put(str);
            }
            for (int i2 : iArr) {
                jSONArray2.put(i2);
            }
            C9620a.m1774c().m1784a(EnumC9627b.PERMISSIONS, EnumC9300g.PERMISSIONS_RESULT, Integer.valueOf(i), jSONArray, jSONArray2);
        } catch (Exception e) {
            C9620a.m1774c().m1784a(EnumC9627b.PERMISSIONS, EnumC9300g.PERMISSIONS_ERROR, e.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (C9620a.m1774c() == null) {
            if (isFinishing()) {
                return;
            }
            C9549a.m2017c("Unity Ads web app is null, closing Unity Ads activity from onResume");
            finish();
            return;
        }
        m2505a(this.f18116b);
        Map<String, InterfaceC9299f> map = this.f18122h;
        if (map != null) {
            for (Map.Entry<String, InterfaceC9299f> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().mo2476c(this);
                }
            }
        }
        C9620a.m1774c().m1784a(EnumC9627b.ADUNIT, EnumC9295b.ON_RESUME, Integer.valueOf(this.f18119e));
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("orientation", this.f18117c);
        bundle.putInt("systemUiVisibility", this.f18118d);
        bundle.putIntegerArrayList("keyEvents", this.f18120f);
        bundle.putBoolean("keepScreenOn", this.f18121g);
        bundle.putStringArray("views", this.f18116b);
        bundle.putInt("activityId", this.f18119e);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (C9620a.m1774c() == null) {
            if (isFinishing()) {
                return;
            }
            C9549a.m2017c("Unity Ads web app is null, closing Unity Ads activity from onStart");
            finish();
            return;
        }
        Map<String, InterfaceC9299f> map = this.f18122h;
        if (map != null) {
            for (Map.Entry<String, InterfaceC9299f> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().mo2475d(this);
                }
            }
        }
        C9620a.m1774c().m1784a(EnumC9627b.ADUNIT, EnumC9295b.ON_START, Integer.valueOf(this.f18119e));
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        if (C9620a.m1774c() == null) {
            if (isFinishing()) {
                return;
            }
            C9549a.m2017c("Unity Ads web app is null, closing Unity Ads activity from onStop");
            finish();
            return;
        }
        Map<String, InterfaceC9299f> map = this.f18122h;
        if (map != null) {
            for (Map.Entry<String, InterfaceC9299f> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().mo2480a(this);
                }
            }
        }
        C9620a.m1774c().m1784a(EnumC9627b.ADUNIT, EnumC9295b.ON_STOP, Integer.valueOf(this.f18119e));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        C9620a m1774c = C9620a.m1774c();
        EnumC9627b enumC9627b = EnumC9627b.ADUNIT;
        if (z) {
            m1774c.m1784a(enumC9627b, EnumC9295b.ON_FOCUS_GAINED, Integer.valueOf(this.f18119e));
        } else {
            m1774c.m1784a(enumC9627b, EnumC9295b.ON_FOCUS_LOST, Integer.valueOf(this.f18119e));
        }
        super.onWindowFocusChanged(z);
    }
}

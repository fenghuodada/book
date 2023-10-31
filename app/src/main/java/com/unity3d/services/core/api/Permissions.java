package com.unity3d.services.core.api;

import android.annotation.TargetApi;
import android.content.Context;
import com.unity3d.services.ads.adunit.EnumC9294a;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.core.device.EnumC9501c;
import com.unity3d.services.core.properties.C9568a;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.util.ArrayList;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class Permissions {
    @WebViewExposed
    public static void checkPermission(String str, C9644l c9644l) {
        if (C9568a.m1959e() == null) {
            c9644l.m1737a(EnumC9501c.APPLICATION_CONTEXT_NULL, new Object[0]);
            return;
        }
        try {
            Context m1959e = C9568a.m1959e();
            c9644l.m1736a(Integer.valueOf(m1959e.getPackageManager().checkPermission(str, m1959e.getPackageName())));
        } catch (Exception e) {
            c9644l.m1737a(EnumC9462a.ERROR_CHECKING_PERMISSION, e.getMessage());
        }
    }

    @WebViewExposed
    public static void getPermissions(C9644l c9644l) {
        if (C9568a.m1959e() == null) {
            c9644l.m1737a(EnumC9501c.APPLICATION_CONTEXT_NULL, new Object[0]);
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            Context m1959e = C9568a.m1959e();
            String[] strArr = m1959e.getPackageManager().getPackageInfo(m1959e.getPackageName(), 4096).requestedPermissions;
            if (strArr == null) {
                c9644l.m1737a(EnumC9462a.NO_REQUESTED_PERMISSIONS, new Object[0]);
                return;
            }
            for (String str : strArr) {
                jSONArray.put(str);
            }
            c9644l.m1736a(jSONArray);
        } catch (Exception e) {
            c9644l.m1737a(EnumC9462a.COULDNT_GET_PERMISSIONS, e.getMessage());
        }
    }

    @WebViewExposed
    @TargetApi(23)
    public static void requestPermissions(JSONArray jSONArray, Integer num, C9644l c9644l) {
        if (AdUnit.getAdUnitActivity() == null) {
            c9644l.m1737a(EnumC9294a.ADUNIT_NULL, new Object[0]);
        } else if (jSONArray == null || jSONArray.length() < 1) {
            c9644l.m1737a(EnumC9462a.NO_REQUESTED_PERMISSIONS, new Object[0]);
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
                AdUnit.getAdUnitActivity().requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), num.intValue());
                c9644l.m1736a(new Object[0]);
            } catch (Exception e) {
                c9644l.m1737a(EnumC9462a.ERROR_REQUESTING_PERMISSIONS, e.getMessage());
            }
        }
    }
}

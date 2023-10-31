package com.adcolony.sdk;

import android.os.Bundle;
import java.util.HashMap;

/* renamed from: com.adcolony.sdk.r4 */
/* loaded from: classes.dex */
public final class C2278r4 {

    /* renamed from: a */
    public static int f5541a;

    /* renamed from: b */
    public static final HashMap<String, Integer> f5542b = new HashMap<>();

    /* renamed from: c */
    public static final HashMap<String, Integer> f5543c = new HashMap<>();

    /* renamed from: a */
    public static boolean m9509a(int i, Bundle bundle) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (i == 0) {
            if (currentTimeMillis - f5541a < 5) {
                return true;
            }
            f5541a = currentTimeMillis;
            return false;
        } else if (i == 1 && bundle != null) {
            String string = bundle.getString("zone_id");
            HashMap<String, Integer> hashMap = f5542b;
            if (hashMap.get(string) == null) {
                hashMap.put(string, Integer.valueOf(currentTimeMillis));
            }
            HashMap<String, Integer> hashMap2 = f5543c;
            if (hashMap2.get(string) == null) {
                hashMap2.put(string, 0);
            }
            if (currentTimeMillis - hashMap.get(string).intValue() > 1) {
                hashMap2.put(string, 1);
                hashMap.put(string, Integer.valueOf(currentTimeMillis));
                return false;
            }
            int intValue = hashMap2.get(string).intValue() + 1;
            hashMap2.put(string, Integer.valueOf(intValue));
            return intValue > 3;
        } else {
            return false;
        }
    }
}

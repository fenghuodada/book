package com.unity3d.ads.metadata;

import android.content.Context;
import com.unity3d.services.core.device.C9509f;
import com.unity3d.services.core.device.C9512i;
import com.unity3d.services.core.device.EnumC9511h;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.misc.C9561g;
import com.unity3d.services.core.misc.C9564j;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class MetaData extends C9561g {
    private String _category;
    protected Context _context;

    public MetaData(Context context) {
        this._context = context.getApplicationContext();
    }

    private String getActualKey(String str) {
        if (getCategory() != null) {
            return getCategory() + "." + str;
        }
        return str;
    }

    private synchronized boolean set(String str, int i) {
        return set(str, Integer.valueOf(i));
    }

    private synchronized boolean set(String str, long j) {
        return set(str, Long.valueOf(j));
    }

    private synchronized boolean set(String str, boolean z) {
        return set(str, Boolean.valueOf(z));
    }

    public void commit() {
        if (!C9512i.m2086a(this._context)) {
            C9549a.m2017c("Unity Ads could not commit metadata due to storage error");
            return;
        }
        C9509f m2085a = C9512i.m2085a(C9512i.EnumC9513a.PUBLIC);
        if (getData() == null || m2085a == null) {
            return;
        }
        Iterator<String> keys = getData().keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = get(next);
            if (m2085a.get(next) != null && (m2085a.get(next) instanceof JSONObject) && (get(next) instanceof JSONObject)) {
                try {
                    obj = C9564j.m1986a((JSONObject) obj, (JSONObject) m2085a.get(next));
                } catch (Exception e) {
                    C9549a.m2023a("Exception merging JSONs", e);
                }
            }
            m2085a.set(next, obj);
        }
        m2085a.m2087f();
        m2085a.m2092a(EnumC9511h.SET, getData());
    }

    public String getCategory() {
        return this._category;
    }

    @Override // com.unity3d.services.core.misc.C9561g
    public synchronized boolean set(String str, Object obj) {
        boolean z;
        initData();
        if (super.set(getActualKey(str) + ".value", obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append(getActualKey(str));
            sb.append(".ts");
            z = super.set(sb.toString(), Long.valueOf(System.currentTimeMillis()));
        }
        return z;
    }

    public void setCategory(String str) {
        this._category = str;
    }

    public synchronized boolean setRaw(String str, Object obj) {
        initData();
        return super.set(getActualKey(str), obj);
    }
}

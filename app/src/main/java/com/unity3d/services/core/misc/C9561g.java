package com.unity3d.services.core.misc;

import android.text.TextUtils;
import com.unity3d.services.core.log.C9549a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.misc.g */
/* loaded from: classes3.dex */
public class C9561g implements InterfaceC9557c {
    private JSONObject _data;

    private synchronized void createObjectTree(String str) {
        String str2;
        String[] split = str.split("\\.");
        JSONObject jSONObject = this._data;
        if (str.length() == 0) {
            return;
        }
        for (int i = 0; i < split.length; i++) {
            if (jSONObject.has(split[i])) {
                try {
                    jSONObject = jSONObject.getJSONObject(split[i]);
                } catch (Exception e) {
                    e = e;
                    str2 = "Couldn't get existing JSONObject";
                    C9549a.m2023a(str2, e);
                }
            } else {
                try {
                    jSONObject = jSONObject.put(split[i], new JSONObject()).getJSONObject(split[i]);
                } catch (Exception e2) {
                    e = e2;
                    str2 = "Couldn't create new JSONObject";
                    C9549a.m2023a(str2, e);
                }
            }
        }
    }

    private synchronized Object findObject(String str) {
        String[] split = str.split("\\.");
        JSONObject jSONObject = this._data;
        if (str.length() == 0) {
            return jSONObject;
        }
        for (int i = 0; i < split.length; i++) {
            if (!jSONObject.has(split[i])) {
                return null;
            }
            try {
                jSONObject = jSONObject.getJSONObject(split[i]);
            } catch (Exception e) {
                C9549a.m2023a("Couldn't read JSONObject: " + split[i], e);
                return null;
            }
        }
        return jSONObject;
    }

    private synchronized String getParentObjectTreeFor(String str) {
        ArrayList arrayList;
        arrayList = new ArrayList(Arrays.asList(str.split("\\.")));
        arrayList.remove(arrayList.size() - 1);
        return TextUtils.join(".", arrayList.toArray());
    }

    public synchronized void clearData() {
        this._data = null;
    }

    public synchronized boolean delete(String str) {
        JSONObject jSONObject;
        if (this._data == null) {
            C9549a.m2017c("Data is NULL, readStorage probably not called");
            return false;
        }
        String[] split = str.split("\\.");
        return (!(findObject(getParentObjectTreeFor(str)) instanceof JSONObject) || (jSONObject = (JSONObject) findObject(getParentObjectTreeFor(str))) == null || jSONObject.remove(split[split.length - 1]) == null) ? false : true;
    }

    @Override // com.unity3d.services.core.misc.InterfaceC9557c
    public synchronized Object get(String str) {
        JSONObject jSONObject;
        Object obj = null;
        if (this._data == null) {
            C9549a.m2017c("Data is NULL, readStorage probably not called");
            return null;
        }
        String[] split = str.split("\\.");
        if (!(findObject(getParentObjectTreeFor(str)) instanceof JSONObject) || (jSONObject = (JSONObject) findObject(getParentObjectTreeFor(str))) == null) {
            return null;
        }
        try {
            if (jSONObject.has(split[split.length - 1])) {
                obj = jSONObject.get(split[split.length - 1]);
            }
        } catch (Exception e) {
            C9549a.m2023a("Error getting data", e);
        }
        return obj;
    }

    @Override // com.unity3d.services.core.misc.InterfaceC9557c
    public synchronized JSONObject getData() {
        return this._data;
    }

    public synchronized List<String> getKeys(String str, boolean z) {
        List<String> list;
        if (get(str) instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) get(str);
            ArrayList arrayList = new ArrayList();
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (z) {
                        list = getKeys(str + "." + next, z);
                    } else {
                        list = null;
                    }
                    arrayList.add(next);
                    if (list != null) {
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(next + "." + it.next());
                        }
                    }
                }
            }
            return arrayList;
        }
        return null;
    }

    public synchronized boolean hasData() {
        JSONObject jSONObject = this._data;
        if (jSONObject != null) {
            if (jSONObject.length() > 0) {
                return true;
            }
        }
        return false;
    }

    public synchronized boolean initData() {
        if (this._data == null) {
            this._data = new JSONObject();
            return true;
        }
        return false;
    }

    public synchronized boolean set(String str, Object obj) {
        if (this._data != null && str != null && str.length() != 0 && obj != null) {
            createObjectTree(getParentObjectTreeFor(str));
            if (!(findObject(getParentObjectTreeFor(str)) instanceof JSONObject)) {
                C9549a.m2019b("Cannot set subvalue to an object that is not JSONObject");
                return false;
            }
            JSONObject jSONObject = (JSONObject) findObject(getParentObjectTreeFor(str));
            String[] split = str.split("\\.");
            if (jSONObject != null) {
                try {
                    jSONObject.put(split[split.length - 1], obj);
                } catch (JSONException e) {
                    C9549a.m2023a("Couldn't set value", e);
                    return false;
                }
            }
            return true;
        }
        C9549a.m2017c("Storage not properly initialized or incorrect parameters:" + this._data + ", " + str + ", " + obj);
        return false;
    }

    public synchronized void setData(JSONObject jSONObject) {
        this._data = jSONObject;
    }
}

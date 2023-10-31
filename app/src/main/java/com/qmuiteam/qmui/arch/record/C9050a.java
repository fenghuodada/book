package com.qmuiteam.qmui.arch.record;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;

/* renamed from: com.qmuiteam.qmui.arch.record.a */
/* loaded from: classes3.dex */
public final class C9050a implements InterfaceC9051b {

    /* renamed from: a */
    public final SharedPreferences f17302a;

    public C9050a(Context context) {
        this.f17302a = context.getSharedPreferences("qmui_latest_visit", 0);
    }

    /* renamed from: a */
    public final void m2762a(SharedPreferences.Editor editor, String str) {
        for (String str2 : this.f17302a.getAll().keySet()) {
            if (str2.startsWith(str)) {
                editor.remove(str2);
            }
        }
    }

    /* renamed from: b */
    public final void m2761b(SharedPreferences.Editor editor, String str, HashMap hashMap) {
        m2762a(editor, str);
        if (hashMap.size() > 0) {
            for (String str2 : hashMap.keySet()) {
                C9052c c9052c = (C9052c) hashMap.get(str2);
                if (c9052c != null) {
                    Class<?> cls = Integer.TYPE;
                    Class<?> cls2 = c9052c.f17304b;
                    Object obj = c9052c.f17303a;
                    if (cls2 == cls || cls2 == Integer.class) {
                        editor.putInt(str + 'i' + str2, ((Integer) obj).intValue());
                    } else if (cls2 == Boolean.TYPE || cls2 == Boolean.class) {
                        editor.putBoolean(str + 'b' + str2, ((Boolean) obj).booleanValue());
                    } else if (cls2 == Float.TYPE || cls2 == Float.class) {
                        editor.putFloat(str + 'f' + str2, ((Float) obj).floatValue());
                    } else if (cls2 == Long.TYPE || cls2 == Long.class) {
                        editor.putLong(str + 'l' + str2, ((Long) obj).longValue());
                    } else if (cls2 != String.class) {
                        throw new RuntimeException(String.format("Not support the type: %s", cls2.getSimpleName()));
                    } else {
                        editor.putString(str + 's' + str2, (String) obj);
                    }
                }
            }
        }
    }
}

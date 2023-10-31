package com.google.android.datatransport.runtime.util;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.C0235r;
import com.google.android.datatransport.EnumC6464d;
import java.util.HashMap;

/* renamed from: com.google.android.datatransport.runtime.util.a */
/* loaded from: classes.dex */
public final class C6619a {

    /* renamed from: a */
    public static final SparseArray<EnumC6464d> f10454a = new SparseArray<>();

    /* renamed from: b */
    public static final HashMap<EnumC6464d, Integer> f10455b;

    static {
        HashMap<EnumC6464d, Integer> hashMap = new HashMap<>();
        f10455b = hashMap;
        hashMap.put(EnumC6464d.DEFAULT, 0);
        hashMap.put(EnumC6464d.VERY_LOW, 1);
        hashMap.put(EnumC6464d.HIGHEST, 2);
        for (EnumC6464d enumC6464d : hashMap.keySet()) {
            f10454a.append(f10455b.get(enumC6464d).intValue(), enumC6464d);
        }
    }

    /* renamed from: a */
    public static int m6225a(@NonNull EnumC6464d enumC6464d) {
        Integer num = f10455b.get(enumC6464d);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC6464d);
    }

    @NonNull
    /* renamed from: b */
    public static EnumC6464d m6224b(int i) {
        EnumC6464d enumC6464d = f10454a.get(i);
        if (enumC6464d != null) {
            return enumC6464d;
        }
        throw new IllegalArgumentException(C0235r.m12816a("Unknown Priority for value ", i));
    }
}

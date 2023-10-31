package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;

/* renamed from: com.google.android.datatransport.cct.internal.p */
/* loaded from: classes.dex */
public enum EnumC6463p {
    DEFAULT,
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_ONLY,
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_OR_DAILY,
    /* JADX INFO: Fake field, exist only in values array */
    FAST_IF_RADIO_AWAKE,
    /* JADX INFO: Fake field, exist only in values array */
    NEVER,
    /* JADX INFO: Fake field, exist only in values array */
    UNRECOGNIZED;

    static {
        EnumC6463p enumC6463p;
        EnumC6463p enumC6463p2;
        EnumC6463p enumC6463p3;
        EnumC6463p enumC6463p4;
        EnumC6463p enumC6463p5;
        EnumC6463p enumC6463p6 = DEFAULT;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, enumC6463p6);
        sparseArray.put(1, enumC6463p);
        sparseArray.put(2, enumC6463p2);
        sparseArray.put(3, enumC6463p3);
        sparseArray.put(4, enumC6463p4);
        sparseArray.put(-1, enumC6463p5);
    }
}

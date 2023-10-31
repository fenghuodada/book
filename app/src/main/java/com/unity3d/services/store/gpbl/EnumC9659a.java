package com.unity3d.services.store.gpbl;

/* renamed from: com.unity3d.services.store.gpbl.a */
/* loaded from: classes3.dex */
public enum EnumC9659a {
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8);
    

    /* renamed from: n */
    private final int f19213n;

    EnumC9659a(int i) {
        this.f19213n = i;
    }

    /* renamed from: a */
    public static EnumC9659a m1718a(int i) {
        EnumC9659a[] values;
        for (EnumC9659a enumC9659a : values()) {
            if (enumC9659a.m1719a() == i) {
                return enumC9659a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public int m1719a() {
        return this.f19213n;
    }
}

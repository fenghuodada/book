package com.unity3d.services.banners.view;

/* renamed from: com.unity3d.services.banners.view.a */
/* loaded from: classes3.dex */
public enum EnumC9449a {
    TOP_LEFT(new int[]{10, 9}, 51),
    TOP_CENTER(new int[]{10, 14}, 49),
    TOP_RIGHT(new int[]{10, 11}, 53),
    BOTTOM_LEFT(new int[]{12, 9}, 83),
    BOTTOM_CENTER(new int[]{12, 14}, 81),
    BOTTOM_RIGHT(new int[]{12, 11}, 85),
    CENTER(new int[]{13}, 17),
    NONE(new int[0], 0);
    

    /* renamed from: j */
    private final int[] f18552j;

    /* renamed from: k */
    private int f18553k;

    EnumC9449a(int[] iArr, int i) {
        this.f18552j = iArr;
        this.f18553k = i;
    }

    /* renamed from: a */
    public int m2273a() {
        return this.f18553k;
    }
}

package com.applovin.impl.p008a;

/* renamed from: com.applovin.impl.a.f */
/* loaded from: classes.dex */
public enum EnumC2658f {
    UNSPECIFIED(-1),
    RESOURCE_REJECTED(1),
    API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED(2),
    FAILED_TO_LOAD_RESOURCE(3),
    XML_PARSING(100),
    GENERAL_WRAPPER_ERROR(300),
    TIMED_OUT(301),
    WRAPPER_LIMIT_REACHED(302),
    NO_WRAPPER_RESPONSE(303),
    GENERAL_LINEAR_ERROR(400),
    NO_MEDIA_FILE_PROVIDED(401),
    MEDIA_FILE_TIMEOUT(402),
    MEDIA_FILE_ERROR(405),
    GENERAL_COMPANION_AD_ERROR(600),
    UNABLE_TO_FETCH_COMPANION_AD_RESOURCE(603),
    CAN_NOT_FIND_COMPANION_AD_RESOURCE(604);
    

    /* renamed from: q */
    private final int f6308q;

    EnumC2658f(int i) {
        this.f6308q = i;
    }

    /* renamed from: a */
    public int m9237a() {
        return this.f6308q;
    }
}

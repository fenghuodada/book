package com.unity3d.services.core.properties;

import com.unity3d.services.core.properties.C9572d;

/* renamed from: com.unity3d.services.core.properties.b */
/* loaded from: classes3.dex */
public class C9569b {

    /* renamed from: com.unity3d.services.core.properties.b$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C9570a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18938a;

        static {
            int[] iArr = new int[C9572d.EnumC9573a.values().length];
            f18938a = iArr;
            try {
                iArr[C9572d.EnumC9573a.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18938a[C9572d.EnumC9573a.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18938a[C9572d.EnumC9573a.INITIALIZED_SUCCESSFULLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18938a[C9572d.EnumC9573a.INITIALIZED_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public String m1956a(C9572d.EnumC9573a enumC9573a) {
        int i = C9570a.f18938a[enumC9573a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return "initialized_failed";
                }
                return "initialized_successfully";
            }
            return "initializing";
        }
        return "not_initialized";
    }
}

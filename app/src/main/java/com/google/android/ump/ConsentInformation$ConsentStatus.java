package com.google.android.ump;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes3.dex */
public @interface ConsentInformation$ConsentStatus {
    public static final int NOT_REQUIRED = 1;
    public static final int OBTAINED = 3;
    public static final int REQUIRED = 2;
    public static final int UNKNOWN = 0;
}

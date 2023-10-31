package com.facebook.ads.redexgen.p036X;

import android.app.KeyguardManager;
import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.ZP */
/* loaded from: assets/audience_network.dex */
public class C6042ZP implements InterfaceC43306v {
    public static String[] A01 = {"wdcki9TayB0epgOAqgPZ60vGLzXQskFg", "eaUsA8pmkvwqM9uF8kH4nQuKK9Zu7ymc", "2dfJX", "k6tMd5tlxlmCEJMQTJf7pwLJqfV91j3Q", "YVwPmyUK2b9QSHLRAwsi84oHRZQXtzOF", "hpSXL0XJUd77PKoaf1", "iaFmBfogLFf9YiLH80pKK2KW3oFuZo4T", "28ANuaZ3OB7zLgtTtX"};
    public final /* synthetic */ C6040ZN A00;

    public C6042ZP(C6040ZN c6040zn) {
        this.A00 = c6040zn;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        KeyguardManager keyguardManager;
        KeyguardManager keyguardManager2;
        if (Build.VERSION.SDK_INT >= 16) {
            keyguardManager = this.A00.A00;
            if (keyguardManager == null) {
                C6040ZN c6040zn = this.A00;
                String[] strArr = A01;
                if (strArr[7].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                A01[0] = "xEd7j65KlJaDHlrOXF5qOqVEOzAiF9i5";
                return c6040zn.A07(EnumC434176.A07);
            }
            C6040ZN c6040zn2 = this.A00;
            keyguardManager2 = c6040zn2.A00;
            return c6040zn2.A0F(keyguardManager2.isKeyguardLocked());
        }
        return this.A00.A07(EnumC434176.A05);
    }
}

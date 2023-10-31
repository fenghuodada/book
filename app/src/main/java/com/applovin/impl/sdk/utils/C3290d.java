package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import com.applovin.impl.sdk.C3349v;

/* renamed from: com.applovin.impl.sdk.utils.d */
/* loaded from: classes.dex */
public class C3290d {

    /* renamed from: a */
    private static C3290d f8681a;

    /* renamed from: b */
    private static final Object f8682b = new Object();

    /* renamed from: c */
    private final Bundle f8683c;

    /* renamed from: d */
    private final int f8684d;

    /* renamed from: e */
    private final boolean f8685e;

    private C3290d(Context context) {
        boolean z;
        Bundle bundle = null;
        try {
            try {
                bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e) {
                if (C3349v.m6862a()) {
                    C3349v.m6852c("AndroidManifest", "Failed to get meta data.", e);
                }
            }
            this.f8683c = bundle;
            int i = 0;
            try {
                XmlResourceParser openXmlResourceParser = context.getAssets().openXmlResourceParser("AndroidManifest.xml");
                int eventType = openXmlResourceParser.getEventType();
                int i2 = 0;
                z = false;
                do {
                    if (2 == eventType) {
                        try {
                            if (openXmlResourceParser.getName().equals("application")) {
                                for (int i3 = 0; i3 < openXmlResourceParser.getAttributeCount(); i3++) {
                                    String attributeName = openXmlResourceParser.getAttributeName(i3);
                                    String attributeValue = openXmlResourceParser.getAttributeValue(i3);
                                    if (attributeName.equals("networkSecurityConfig")) {
                                        i2 = Integer.valueOf(attributeValue.substring(1)).intValue();
                                    } else if (attributeName.equals("usesCleartextTraffic")) {
                                        z = Boolean.valueOf(attributeValue).booleanValue();
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = i2;
                            try {
                                if (C3349v.m6862a()) {
                                    C3349v.m6852c("AndroidManifest", "Failed to parse AndroidManifest.xml.", th);
                                }
                                this.f8684d = i;
                                this.f8685e = z;
                            } catch (Throwable th2) {
                                this.f8684d = i;
                                this.f8685e = z;
                                throw th2;
                            }
                        }
                    }
                    eventType = openXmlResourceParser.next();
                } while (eventType != 1);
                this.f8684d = i2;
            } catch (Throwable th3) {
                th = th3;
                z = false;
            }
            this.f8685e = z;
        } catch (Throwable th4) {
            this.f8683c = null;
            throw th4;
        }
    }

    /* renamed from: a */
    public static C3290d m7036a(Context context) {
        C3290d c3290d;
        synchronized (f8682b) {
            if (f8681a == null) {
                f8681a = new C3290d(context);
            }
            c3290d = f8681a;
        }
        return c3290d;
    }

    /* renamed from: a */
    public String m7034a(String str, String str2) {
        Bundle bundle = this.f8683c;
        return bundle != null ? bundle.getString(str, str2) : str2;
    }

    /* renamed from: a */
    public boolean m7037a() {
        return this.f8684d != 0;
    }

    /* renamed from: a */
    public boolean m7035a(String str) {
        Bundle bundle = this.f8683c;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    /* renamed from: a */
    public boolean m7033a(String str, boolean z) {
        Bundle bundle = this.f8683c;
        return bundle != null ? bundle.getBoolean(str, z) : z;
    }
}

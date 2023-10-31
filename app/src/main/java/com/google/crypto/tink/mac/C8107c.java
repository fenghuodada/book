package com.google.crypto.tink.mac;

import com.google.crypto.tink.C8112p;
import com.google.crypto.tink.proto.C8156j0;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.mac.c */
/* loaded from: classes3.dex */
public final class C8107c {

    /* renamed from: a */
    public static final /* synthetic */ int f15907a = 0;

    static {
        new C8104b();
        int i = C8156j0.CONFIG_NAME_FIELD_NUMBER;
        try {
            C8112p.m4160e(new C8104b(), true);
            C8112p.m4160e(new C8101a(), true);
            C8112p.m4159f(new C8108d());
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}

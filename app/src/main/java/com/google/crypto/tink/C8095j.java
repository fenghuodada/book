package com.google.crypto.tink;

import androidx.constraintlayout.motion.widget.C0552c;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.crypto.tink.j */
/* loaded from: classes3.dex */
public final class C8095j {

    /* renamed from: a */
    public static final CopyOnWriteArrayList<InterfaceC8087i> f15897a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public static InterfaceC8087i m4182a(String str) throws GeneralSecurityException {
        Iterator<InterfaceC8087i> it = f15897a.iterator();
        while (it.hasNext()) {
            InterfaceC8087i next = it.next();
            if (next.mo4187a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException(C0552c.m12192b("No KMS client does support: ", str));
    }
}

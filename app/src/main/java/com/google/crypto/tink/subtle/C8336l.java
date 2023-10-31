package com.google.crypto.tink.subtle;

import com.google.android.gms.security.ProviderInstaller;
import com.google.crypto.tink.subtle.InterfaceC8337m;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: com.google.crypto.tink.subtle.l */
/* loaded from: classes3.dex */
public final class C8336l<T_WRAPPER extends InterfaceC8337m<T_ENGINE>, T_ENGINE> {

    /* renamed from: c */
    public static final Logger f16171c = Logger.getLogger(C8336l.class.getName());

    /* renamed from: d */
    public static final ArrayList f16172d;

    /* renamed from: e */
    public static final C8336l<InterfaceC8337m.C8338a, Cipher> f16173e;

    /* renamed from: f */
    public static final C8336l<InterfaceC8337m.C8339b, Mac> f16174f;

    /* renamed from: a */
    public final T_WRAPPER f16175a;

    /* renamed from: b */
    public final List<Provider> f16176b = f16172d;

    static {
        boolean z;
        try {
            Class.forName("android.app.Application", false, null);
            z = true;
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            String[] strArr = {ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f16171c.info(String.format("Provider %s not available", str));
                }
            }
            f16172d = arrayList;
        } else {
            f16172d = new ArrayList();
        }
        f16173e = new C8336l<>(new InterfaceC8337m.C8338a());
        f16174f = new C8336l<>(new InterfaceC8337m.C8339b());
    }

    public C8336l(T_WRAPPER t_wrapper) {
        this.f16175a = t_wrapper;
    }

    /* renamed from: a */
    public final T_ENGINE m3426a(String str) throws GeneralSecurityException {
        Iterator<Provider> it = this.f16176b.iterator();
        Exception exc = null;
        while (true) {
            boolean hasNext = it.hasNext();
            T_WRAPPER t_wrapper = this.f16175a;
            if (!hasNext) {
                return (T_ENGINE) t_wrapper.mo3425a(str, null);
            }
            try {
                return (T_ENGINE) t_wrapper.mo3425a(str, it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
    }
}

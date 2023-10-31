package androidx.appcompat;

import cn.hutool.crypto.C2032a;
import cn.hutool.crypto.EnumC2033b;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* renamed from: androidx.appcompat.b */
/* loaded from: classes.dex */
public final class C0156b {
    /* renamed from: a */
    public static SecretKey m12924a(String str) {
        KeyGenerator keyGenerator;
        String m12923b = m12923b(str);
        Provider m9713a = EnumC2033b.f4902b.m9713a();
        try {
            if (m9713a == null) {
                keyGenerator = KeyGenerator.getInstance(m12923b(m12923b));
            } else {
                keyGenerator = KeyGenerator.getInstance(m12923b(m12923b), m9713a);
            }
            if ("AES".equals(m12923b)) {
                keyGenerator.init(128);
            }
            return keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            throw new C2032a(e);
        }
    }

    /* renamed from: b */
    public static String m12923b(String str) {
        int indexOf = str.indexOf(47);
        return indexOf > 0 ? str.substring(0, indexOf) : str;
    }
}

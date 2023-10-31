package cn.hutool.crypto.symmetric;

import androidx.appcompat.C0156b;
import cn.hutool.core.lang.C2029a;
import cn.hutool.core.util.C2031b;
import cn.hutool.crypto.C2032a;
import cn.hutool.crypto.EnumC2033b;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.Provider;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: cn.hutool.crypto.symmetric.a */
/* loaded from: classes.dex */
public final class C2035a implements Serializable {

    /* renamed from: a */
    public SecretKey f4906a;

    /* renamed from: b */
    public Cipher f4907b;

    /* renamed from: c */
    public final ReentrantLock f4908c;

    public C2035a(byte[] bArr) {
        SecretKey secretKeySpec;
        Cipher cipher;
        C2029a.m9718a("AES", "Algorithm is blank!", new Object[0]);
        if (bArr == null) {
            secretKeySpec = C0156b.m12924a("AES");
        } else {
            secretKeySpec = new SecretKeySpec(bArr, "AES");
        }
        this.f4908c = new ReentrantLock();
        C2029a.m9718a("AES", "'algorithm' must be not blank !", new Object[0]);
        this.f4906a = secretKeySpec;
        Provider m9713a = EnumC2033b.f4902b.m9713a();
        try {
            if (m9713a == null) {
                cipher = Cipher.getInstance("AES");
            } else {
                cipher = Cipher.getInstance("AES", m9713a);
            }
            this.f4907b = cipher;
        } catch (Exception e) {
            throw new C2032a(e);
        }
    }

    /* renamed from: a */
    public final String m9711a(byte[] bArr, Charset charset) {
        ReentrantLock reentrantLock = this.f4908c;
        reentrantLock.lock();
        try {
            try {
                this.f4907b.init(2, this.f4906a);
                this.f4907b.getBlockSize();
                byte[] doFinal = this.f4907b.doFinal(bArr);
                reentrantLock.unlock();
                return C2031b.m9714d(doFinal, charset);
            } catch (Exception e) {
                throw new C2032a(e);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

package androidx.security.crypto;

import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.NonNull;
import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* renamed from: androidx.security.crypto.b */
/* loaded from: classes.dex */
public final class C1699b {
    @NonNull

    /* renamed from: a */
    public static final KeyGenParameterSpec f4148a = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build();

    @NonNull
    /* renamed from: a */
    public static String m10037a(@NonNull KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException, IOException {
        if (keyGenParameterSpec.getKeySize() == 256) {
            if (Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{CodePackage.GCM})) {
                if (keyGenParameterSpec.getPurposes() == 3) {
                    if (Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
                        if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
                            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
                        }
                        String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
                        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                        keyStore.load(null);
                        if (!keyStore.containsAlias(keystoreAlias)) {
                            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                            keyGenerator.init(keyGenParameterSpec);
                            keyGenerator.generateKey();
                        }
                        return keyGenParameterSpec.getKeystoreAlias();
                    }
                    throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
                }
                throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
            }
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
        }
        throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
    }
}

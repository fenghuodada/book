package androidx.security.crypto;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.ArraySet;
import android.util.Pair;
import androidx.activity.result.C0063d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.C0511i;
import com.google.crypto.tink.C8081e;
import com.google.crypto.tink.C8085g;
import com.google.crypto.tink.C8112p;
import com.google.crypto.tink.InterfaceC8038a;
import com.google.crypto.tink.InterfaceC8073c;
import com.google.crypto.tink.aead.C8039a;
import com.google.crypto.tink.aead.C8051f;
import com.google.crypto.tink.daead.C8075a;
import com.google.crypto.tink.daead.C8078b;
import com.google.crypto.tink.daead.C8079c;
import com.google.crypto.tink.integration.android.C8088a;
import com.google.crypto.tink.proto.C8166m;
import com.google.crypto.tink.proto.C8174q;
import com.google.crypto.tink.subtle.C8326e;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.security.crypto.a */
/* loaded from: classes.dex */
public final class SharedPreferencesC1695a implements SharedPreferences {

    /* renamed from: a */
    public final SharedPreferences f4133a;

    /* renamed from: d */
    public final InterfaceC8038a f4136d;

    /* renamed from: e */
    public final InterfaceC8073c f4137e;

    /* renamed from: c */
    public final String f4135c = "Temporises";

    /* renamed from: b */
    public final ArrayList f4134b = new ArrayList();

    /* renamed from: androidx.security.crypto.a$a */
    /* loaded from: classes.dex */
    public static final class SharedPreferences$EditorC1696a implements SharedPreferences.Editor {

        /* renamed from: a */
        public final SharedPreferencesC1695a f4138a;

        /* renamed from: b */
        public final SharedPreferences.Editor f4139b;

        /* renamed from: d */
        public final AtomicBoolean f4141d = new AtomicBoolean(false);

        /* renamed from: c */
        public final CopyOnWriteArrayList f4140c = new CopyOnWriteArrayList();

        public SharedPreferences$EditorC1696a(SharedPreferencesC1695a sharedPreferencesC1695a, SharedPreferences.Editor editor) {
            this.f4138a = sharedPreferencesC1695a;
            this.f4139b = editor;
        }

        /* renamed from: a */
        public final void m10040a() {
            if (this.f4141d.getAndSet(false)) {
                SharedPreferencesC1695a sharedPreferencesC1695a = this.f4138a;
                for (String str : ((HashMap) sharedPreferencesC1695a.getAll()).keySet()) {
                    if (!this.f4140c.contains(str) && !SharedPreferencesC1695a.m10041d(str)) {
                        this.f4139b.remove(sharedPreferencesC1695a.m10043b(str));
                    }
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public final void apply() {
            m10040a();
            this.f4139b.apply();
            m10039b();
            this.f4140c.clear();
        }

        /* renamed from: b */
        public final void m10039b() {
            SharedPreferencesC1695a sharedPreferencesC1695a = this.f4138a;
            Iterator it = sharedPreferencesC1695a.f4134b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
                Iterator it2 = this.f4140c.iterator();
                while (it2.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC1695a, (String) it2.next());
                }
            }
        }

        /* renamed from: c */
        public final void m10038c(String str, byte[] bArr) {
            SharedPreferencesC1695a sharedPreferencesC1695a = this.f4138a;
            sharedPreferencesC1695a.getClass();
            if (!SharedPreferencesC1695a.m10041d(str)) {
                this.f4140c.add(str);
                if (str == null) {
                    str = "__NULL__";
                }
                try {
                    String m10043b = sharedPreferencesC1695a.m10043b(str);
                    try {
                        Pair pair = new Pair(m10043b, new String(C8326e.m3442b(sharedPreferencesC1695a.f4136d.mo3428a(bArr, m10043b.getBytes(StandardCharsets.UTF_8))), "US-ASCII"));
                        this.f4139b.putString((String) pair.first, (String) pair.second);
                        return;
                    } catch (UnsupportedEncodingException e) {
                        throw new AssertionError(e);
                    }
                } catch (GeneralSecurityException e2) {
                    throw new SecurityException("Could not encrypt data: " + e2.getMessage(), e2);
                }
            }
            throw new SecurityException(C0063d.m13053a(str, " is a reserved key for the encryption keyset."));
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor clear() {
            this.f4141d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public final boolean commit() {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f4140c;
            m10040a();
            try {
                return this.f4139b.commit();
            } finally {
                m10039b();
                copyOnWriteArrayList.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor putBoolean(@Nullable String str, boolean z) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(5);
            allocate.put(z ? (byte) 1 : (byte) 0);
            m10038c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor putFloat(@Nullable String str, float f) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(4);
            allocate.putFloat(f);
            m10038c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor putInt(@Nullable String str, int i) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(2);
            allocate.putInt(i);
            m10038c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor putLong(@Nullable String str, long j) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(3);
            allocate.putLong(j);
            m10038c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor putString(@Nullable String str, @Nullable String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(0);
            allocate.putInt(length);
            allocate.put(bytes);
            m10038c(str, allocate.array());
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
            r6 = r6;
         */
        @Override // android.content.SharedPreferences.Editor
        @androidx.annotation.NonNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final android.content.SharedPreferences.Editor putStringSet(@androidx.annotation.Nullable java.lang.String r5, @androidx.annotation.Nullable java.util.Set<java.lang.String> r6) {
            /*
                r4 = this;
                if (r6 != 0) goto Lc
                android.util.ArraySet r6 = new android.util.ArraySet
                r6.<init>()
                java.lang.String r0 = "__NULL__"
                r6.add(r0)
            Lc:
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r6.size()
                r0.<init>(r1)
                int r1 = r6.size()
                int r1 = r1 * 4
                java.util.Iterator r6 = r6.iterator()
            L1f:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L37
                java.lang.Object r2 = r6.next()
                java.lang.String r2 = (java.lang.String) r2
                java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
                byte[] r2 = r2.getBytes(r3)
                r0.add(r2)
                int r2 = r2.length
                int r1 = r1 + r2
                goto L1f
            L37:
                int r1 = r1 + 4
                java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r1)
                r1 = 1
                r6.putInt(r1)
                java.util.Iterator r0 = r0.iterator()
            L45:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L59
                java.lang.Object r1 = r0.next()
                byte[] r1 = (byte[]) r1
                int r2 = r1.length
                r6.putInt(r2)
                r6.put(r1)
                goto L45
            L59:
                byte[] r6 = r6.array()
                r4.m10038c(r5, r6)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.security.crypto.SharedPreferencesC1695a.SharedPreferences$EditorC1696a.putStringSet(java.lang.String, java.util.Set):android.content.SharedPreferences$Editor");
        }

        @Override // android.content.SharedPreferences.Editor
        @NonNull
        public final SharedPreferences.Editor remove(@Nullable String str) {
            SharedPreferencesC1695a sharedPreferencesC1695a = this.f4138a;
            sharedPreferencesC1695a.getClass();
            if (!SharedPreferencesC1695a.m10041d(str)) {
                this.f4139b.remove(sharedPreferencesC1695a.m10043b(str));
                this.f4140c.remove(str);
                return this;
            }
            throw new SecurityException(C0063d.m13053a(str, " is a reserved key for the encryption keyset."));
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum b uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: androidx.security.crypto.a$b */
    /* loaded from: classes.dex */
    public static final class EnumC1697b {

        /* renamed from: b */
        public static final EnumC1697b f4142b;

        /* renamed from: c */
        public static final /* synthetic */ EnumC1697b[] f4143c;

        /* renamed from: a */
        public final C8081e f4144a;

        static {
            C8174q.C8175a m3983v = C8174q.m3983v();
            m3983v.m3461k();
            C8174q.m3985t((C8174q) m3983v.f16130b);
            new C8075a();
            EnumC1697b enumC1697b = new EnumC1697b(C8081e.m4205a("type.googleapis.com/google.crypto.tink.AesSivKey", m3983v.m3463i().mo3556g()));
            f4142b = enumC1697b;
            f4143c = new EnumC1697b[]{enumC1697b};
        }

        public EnumC1697b(C8081e c8081e) {
            this.f4144a = c8081e;
        }

        public static EnumC1697b valueOf(String str) {
            return (EnumC1697b) Enum.valueOf(EnumC1697b.class, str);
        }

        public static EnumC1697b[] values() {
            return (EnumC1697b[]) f4143c.clone();
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum b uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: androidx.security.crypto.a$c */
    /* loaded from: classes.dex */
    public static final class EnumC1698c {

        /* renamed from: b */
        public static final EnumC1698c f4145b;

        /* renamed from: c */
        public static final /* synthetic */ EnumC1698c[] f4146c;

        /* renamed from: a */
        public final C8081e f4147a;

        static {
            C8166m.C8167a m4005v = C8166m.m4005v();
            m4005v.m3461k();
            C8166m.m4007t((C8166m) m4005v.f16130b);
            new C8051f();
            EnumC1698c enumC1698c = new EnumC1698c(C8081e.m4205a("type.googleapis.com/google.crypto.tink.AesGcmKey", m4005v.m3463i().mo3556g()));
            f4145b = enumC1698c;
            f4146c = new EnumC1698c[]{enumC1698c};
        }

        public EnumC1698c(C8081e c8081e) {
            this.f4147a = c8081e;
        }

        public static EnumC1698c valueOf(String str) {
            return (EnumC1698c) Enum.valueOf(EnumC1698c.class, str);
        }

        public static EnumC1698c[] values() {
            return (EnumC1698c[]) f4146c.clone();
        }
    }

    public SharedPreferencesC1695a(@NonNull SharedPreferences sharedPreferences, @NonNull InterfaceC8038a interfaceC8038a, @NonNull InterfaceC8073c interfaceC8073c) {
        this.f4133a = sharedPreferences;
        this.f4136d = interfaceC8038a;
        this.f4137e = interfaceC8073c;
    }

    @NonNull
    /* renamed from: a */
    public static SharedPreferencesC1695a m10044a(@NonNull String str, @NonNull Application application, @NonNull EnumC1697b enumC1697b, @NonNull EnumC1698c enumC1698c) throws GeneralSecurityException, IOException {
        C8088a c8088a;
        int i = C8078b.f15869a;
        C8112p.m4160e(new C8075a(), true);
        C8112p.m4159f(new C8079c());
        C8039a.m4209a();
        C8088a.C8089a c8089a = new C8088a.C8089a();
        c8089a.f15887e = enumC1697b.f4144a;
        c8089a.m4190d(application, "__androidx_security_crypto_encrypted_prefs_key_keyset__");
        String str2 = "android-keystore://" + str;
        if (str2.startsWith("android-keystore://")) {
            c8089a.f15885c = str2;
            synchronized (c8089a) {
                if (c8089a.f15885c != null) {
                    c8089a.f15886d = c8089a.m4191c();
                }
                c8089a.f15888f = c8089a.m4192b();
                c8088a = new C8088a(c8089a);
            }
            C8085g m4194a = c8088a.m4194a();
            C8088a.C8089a c8089a2 = new C8088a.C8089a();
            c8089a2.f15887e = enumC1698c.f4147a;
            c8089a2.m4190d(application, "__androidx_security_crypto_encrypted_prefs_value_keyset__");
            String str3 = "android-keystore://" + str;
            if (str3.startsWith("android-keystore://")) {
                c8089a2.f15885c = str3;
                return new SharedPreferencesC1695a(application.getSharedPreferences("Temporises", 0), (InterfaceC8038a) c8089a2.m4193a().m4194a().m4203a(InterfaceC8038a.class), (InterfaceC8073c) m4194a.m4203a(InterfaceC8073c.class));
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    }

    /* renamed from: d */
    public static boolean m10041d(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    /* renamed from: b */
    public final String m10043b(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            try {
                return new String(C8326e.m3442b(this.f4137e.mo3446a(str.getBytes(StandardCharsets.UTF_8), this.f4135c.getBytes())), "US-ASCII");
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        } catch (GeneralSecurityException e2) {
            throw new SecurityException("Could not encrypt key. " + e2.getMessage(), e2);
        }
    }

    /* renamed from: c */
    public final Object m10042c(String str) {
        int i;
        if (!m10041d(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String m10043b = m10043b(str);
                String string = this.f4133a.getString(m10043b, null);
                if (string == null) {
                    return null;
                }
                ByteBuffer wrap = ByteBuffer.wrap(this.f4136d.mo3427b(C8326e.m3443a(string), m10043b.getBytes(StandardCharsets.UTF_8)));
                boolean z = false;
                wrap.position(0);
                int i2 = wrap.getInt();
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 != 5) {
                                        i = 0;
                                    } else {
                                        i = 6;
                                    }
                                } else {
                                    i = 5;
                                }
                            } else {
                                i = 4;
                            }
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 2;
                    }
                } else {
                    i = 1;
                }
                int m12337b = C0511i.m12337b(i);
                if (m12337b != 0) {
                    if (m12337b != 1) {
                        if (m12337b != 2) {
                            if (m12337b != 3) {
                                if (m12337b != 4) {
                                    if (m12337b != 5) {
                                        return null;
                                    }
                                    if (wrap.get() != 0) {
                                        z = true;
                                    }
                                    return Boolean.valueOf(z);
                                }
                                return Float.valueOf(wrap.getFloat());
                            }
                            return Long.valueOf(wrap.getLong());
                        }
                        return Integer.valueOf(wrap.getInt());
                    }
                    ArraySet arraySet = new ArraySet();
                    while (wrap.hasRemaining()) {
                        int i3 = wrap.getInt();
                        ByteBuffer slice = wrap.slice();
                        slice.limit(i3);
                        wrap.position(wrap.position() + i3);
                        arraySet.add(StandardCharsets.UTF_8.decode(slice).toString());
                    }
                    if (arraySet.size() == 1 && "__NULL__".equals(arraySet.valueAt(0))) {
                        return null;
                    }
                    return arraySet;
                }
                int i4 = wrap.getInt();
                ByteBuffer slice2 = wrap.slice();
                wrap.limit(i4);
                String charBuffer = StandardCharsets.UTF_8.decode(slice2).toString();
                if (charBuffer.equals("__NULL__")) {
                    return null;
                }
                return charBuffer;
            } catch (GeneralSecurityException e) {
                throw new SecurityException("Could not decrypt value. " + e.getMessage(), e);
            }
        }
        throw new SecurityException(C0063d.m13053a(str, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(@Nullable String str) {
        if (!m10041d(str)) {
            return this.f4133a.contains(m10043b(str));
        }
        throw new SecurityException(C0063d.m13053a(str, " is a reserved key for the encryption keyset."));
    }

    @Override // android.content.SharedPreferences
    @NonNull
    public final SharedPreferences.Editor edit() {
        return new SharedPreferences$EditorC1696a(this, this.f4133a.edit());
    }

    @Override // android.content.SharedPreferences
    @NonNull
    public final Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.f4133a.getAll().entrySet()) {
            if (!m10041d(entry.getKey())) {
                try {
                    String str = new String(this.f4137e.mo3445b(C8326e.m3443a(entry.getKey()), this.f4135c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    hashMap.put(str, m10042c(str));
                } catch (GeneralSecurityException e) {
                    throw new SecurityException("Could not decrypt key. " + e.getMessage(), e);
                }
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(@Nullable String str, boolean z) {
        Object m10042c = m10042c(str);
        return (m10042c == null || !(m10042c instanceof Boolean)) ? z : ((Boolean) m10042c).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(@Nullable String str, float f) {
        Object m10042c = m10042c(str);
        return (m10042c == null || !(m10042c instanceof Float)) ? f : ((Float) m10042c).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(@Nullable String str, int i) {
        Object m10042c = m10042c(str);
        return (m10042c == null || !(m10042c instanceof Integer)) ? i : ((Integer) m10042c).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(@Nullable String str, long j) {
        Object m10042c = m10042c(str);
        return (m10042c == null || !(m10042c instanceof Long)) ? j : ((Long) m10042c).longValue();
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public final String getString(@Nullable String str, @Nullable String str2) {
        Object m10042c = m10042c(str);
        return (m10042c == null || !(m10042c instanceof String)) ? str2 : (String) m10042c;
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public final Set<String> getStringSet(@Nullable String str, @Nullable Set<String> set) {
        Object m10042c = m10042c(str);
        Set<String> arraySet = m10042c instanceof Set ? (Set) m10042c : new ArraySet<>();
        return arraySet.size() > 0 ? arraySet : set;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(@NonNull SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f4134b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(@NonNull SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f4134b.remove(onSharedPreferenceChangeListener);
    }
}

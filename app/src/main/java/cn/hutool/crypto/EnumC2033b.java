package cn.hutool.crypto;

import java.security.Provider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: cn.hutool.crypto.b */
/* loaded from: classes.dex */
public final class EnumC2033b {

    /* renamed from: b */
    public static final EnumC2033b f4902b;

    /* renamed from: c */
    public static final boolean f4903c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC2033b[] f4904d;

    /* renamed from: a */
    public final Provider f4905a;

    static {
        EnumC2033b enumC2033b = new EnumC2033b();
        f4902b = enumC2033b;
        f4904d = new EnumC2033b[]{enumC2033b};
        f4903c = true;
    }

    public EnumC2033b() {
        try {
            this.f4905a = C2034c.m9712a();
        } catch (NoClassDefFoundError unused) {
        }
    }

    public static EnumC2033b valueOf(String str) {
        return (EnumC2033b) Enum.valueOf(EnumC2033b.class, str);
    }

    public static EnumC2033b[] values() {
        return (EnumC2033b[]) f4904d.clone();
    }

    /* renamed from: a */
    public final Provider m9713a() {
        if (f4903c) {
            return this.f4905a;
        }
        return null;
    }
}

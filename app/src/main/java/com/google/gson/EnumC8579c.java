package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.gson.c */
/* loaded from: classes3.dex */
public abstract class EnumC8579c implements InterfaceC8586d {

    /* renamed from: a */
    public static final C8580a f16313a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC8579c[] f16314b;

    /* renamed from: com.google.gson.c$a */
    /* loaded from: classes3.dex */
    public enum C8580a extends EnumC8579c {
        public C8580a() {
            super("IDENTITY", 0);
        }

        @Override // com.google.gson.InterfaceC8586d
        /* renamed from: a */
        public final String mo3285a(Field field) {
            return field.getName();
        }
    }

    static {
        C8580a c8580a = new C8580a();
        f16313a = c8580a;
        f16314b = new EnumC8579c[]{c8580a, new EnumC8579c() { // from class: com.google.gson.c.b
            @Override // com.google.gson.InterfaceC8586d
            /* renamed from: a */
            public final String mo3285a(Field field) {
                return EnumC8579c.m3286c(field.getName());
            }
        }, new EnumC8579c() { // from class: com.google.gson.c.c
            @Override // com.google.gson.InterfaceC8586d
            /* renamed from: a */
            public final String mo3285a(Field field) {
                return EnumC8579c.m3286c(EnumC8579c.m3287b(field.getName(), " "));
            }
        }, new EnumC8579c() { // from class: com.google.gson.c.d
            @Override // com.google.gson.InterfaceC8586d
            /* renamed from: a */
            public final String mo3285a(Field field) {
                return EnumC8579c.m3287b(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        }, new EnumC8579c() { // from class: com.google.gson.c.e
            @Override // com.google.gson.InterfaceC8586d
            /* renamed from: a */
            public final String mo3285a(Field field) {
                return EnumC8579c.m3287b(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        }, new EnumC8579c() { // from class: com.google.gson.c.f
            @Override // com.google.gson.InterfaceC8586d
            /* renamed from: a */
            public final String mo3285a(Field field) {
                return EnumC8579c.m3287b(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public EnumC8579c() {
        throw null;
    }

    public EnumC8579c(String str, int i) {
    }

    /* renamed from: b */
    public static String m3287b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m3286c(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }

    public static EnumC8579c valueOf(String str) {
        return (EnumC8579c) Enum.valueOf(EnumC8579c.class, str);
    }

    public static EnumC8579c[] values() {
        return (EnumC8579c[]) f16314b.clone();
    }
}

package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.gson.y */
/* loaded from: classes3.dex */
public abstract class EnumC8704y {

    /* renamed from: a */
    public static final C8705a f16519a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC8704y[] f16520b;

    /* renamed from: com.google.gson.y$a */
    /* loaded from: classes3.dex */
    public enum C8705a extends EnumC8704y {
        public C8705a() {
            super("DEFAULT", 0);
        }
    }

    static {
        C8705a c8705a = new C8705a();
        f16519a = c8705a;
        f16520b = new EnumC8704y[]{c8705a, new EnumC8704y() { // from class: com.google.gson.y.b
        }};
    }

    public EnumC8704y() {
        throw null;
    }

    public EnumC8704y(String str, int i) {
    }

    public static EnumC8704y valueOf(String str) {
        return (EnumC8704y) Enum.valueOf(EnumC8704y.class, str);
    }

    public static EnumC8704y[] values() {
        return (EnumC8704y[]) f16520b.clone();
    }
}

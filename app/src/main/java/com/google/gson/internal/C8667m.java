package com.google.gson.internal;

import java.math.BigDecimal;

/* renamed from: com.google.gson.internal.m */
/* loaded from: classes3.dex */
public final class C8667m extends Number {

    /* renamed from: a */
    public final String f16458a;

    public C8667m(String str) {
        this.f16458a = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.f16458a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8667m) {
            String str = ((C8667m) obj).f16458a;
            String str2 = this.f16458a;
            return str2 == str || str2.equals(str);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.f16458a);
    }

    public final int hashCode() {
        return this.f16458a.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.f16458a;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return new BigDecimal(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.f16458a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.f16458a;
    }
}

package com.google.gson;

import com.google.gson.internal.C8667m;
import java.io.Serializable;
import java.math.BigInteger;

/* renamed from: com.google.gson.u */
/* loaded from: classes3.dex */
public final class C8700u extends AbstractC8692o {

    /* renamed from: a */
    public final Serializable f16518a;

    public C8700u(Boolean bool) {
        bool.getClass();
        this.f16518a = bool;
    }

    /* renamed from: s */
    public static boolean m3200s(C8700u c8700u) {
        Serializable serializable = c8700u.f16518a;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.gson.AbstractC8692o
    /* renamed from: a */
    public final AbstractC8692o mo3208a() {
        return this;
    }

    @Override // com.google.gson.AbstractC8692o
    /* renamed from: b */
    public final boolean mo3207b() {
        Serializable serializable = this.f16518a;
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).booleanValue();
        }
        return Boolean.parseBoolean(mo3202p());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8700u.class != obj.getClass()) {
            return false;
        }
        C8700u c8700u = (C8700u) obj;
        Serializable serializable = this.f16518a;
        Serializable serializable2 = c8700u.f16518a;
        if (serializable == null) {
            return serializable2 == null;
        } else if (m3200s(this) && m3200s(c8700u)) {
            return m3201r().longValue() == c8700u.m3201r().longValue();
        } else if ((serializable instanceof Number) && (serializable2 instanceof Number)) {
            double doubleValue = m3201r().doubleValue();
            double doubleValue2 = c8700u.m3201r().doubleValue();
            if (doubleValue != doubleValue2) {
                return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
            }
            return true;
        } else {
            return serializable.equals(serializable2);
        }
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.f16518a;
        if (serializable == null) {
            return 31;
        }
        if (m3200s(this)) {
            doubleToLongBits = m3201r().longValue();
        } else if (!(serializable instanceof Number)) {
            return serializable.hashCode();
        } else {
            doubleToLongBits = Double.doubleToLongBits(m3201r().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    @Override // com.google.gson.AbstractC8692o
    /* renamed from: i */
    public final double mo3206i() {
        if (this.f16518a instanceof Number) {
            return m3201r().doubleValue();
        }
        return Double.parseDouble(mo3202p());
    }

    @Override // com.google.gson.AbstractC8692o
    /* renamed from: j */
    public final float mo3205j() {
        if (this.f16518a instanceof Number) {
            return m3201r().floatValue();
        }
        return Float.parseFloat(mo3202p());
    }

    @Override // com.google.gson.AbstractC8692o
    /* renamed from: k */
    public final int mo3204k() {
        if (this.f16518a instanceof Number) {
            return m3201r().intValue();
        }
        return Integer.parseInt(mo3202p());
    }

    @Override // com.google.gson.AbstractC8692o
    /* renamed from: o */
    public final long mo3203o() {
        if (this.f16518a instanceof Number) {
            return m3201r().longValue();
        }
        return Long.parseLong(mo3202p());
    }

    @Override // com.google.gson.AbstractC8692o
    /* renamed from: p */
    public final String mo3202p() {
        Serializable serializable = this.f16518a;
        if (serializable instanceof Number) {
            return m3201r().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        return (String) serializable;
    }

    /* renamed from: r */
    public final Number m3201r() {
        Serializable serializable = this.f16518a;
        return serializable instanceof String ? new C8667m((String) serializable) : (Number) serializable;
    }

    public C8700u(Number number) {
        number.getClass();
        this.f16518a = number;
    }

    public C8700u(String str) {
        str.getClass();
        this.f16518a = str;
    }
}

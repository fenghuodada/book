package com.google.android.gms.common.images;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.C1431t;

/* loaded from: classes.dex */
public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int i, int i2) {
        this.zaa = i;
        this.zab = i2;
    }

    @NonNull
    public static Size parseSize(@NonNull String str) throws NumberFormatException {
        if (str != null) {
            int indexOf = str.indexOf(42);
            if (indexOf < 0) {
                indexOf = str.indexOf(120);
            }
            if (indexOf >= 0) {
                try {
                    return new Size(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
                } catch (NumberFormatException unused) {
                    throw zaa(str);
                }
            }
            throw zaa(str);
        }
        throw new IllegalArgumentException("string must not be null");
    }

    private static NumberFormatException zaa(String str) {
        throw new NumberFormatException(C1431t.m10577a(new StringBuilder(str.length() + 16), "Invalid Size: \"", str, "\""));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.zaa == size.zaa && this.zab == size.zab) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.zab;
    }

    public int getWidth() {
        return this.zaa;
    }

    public int hashCode() {
        int i = this.zab;
        int i2 = this.zaa;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    @NonNull
    public String toString() {
        int i = this.zaa;
        int i2 = this.zab;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }
}

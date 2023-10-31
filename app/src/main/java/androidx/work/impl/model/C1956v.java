package androidx.work.impl.model;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.core.p003os.C0740h;
import androidx.room.TypeConverter;
import androidx.work.EnumC2007m;
import androidx.work.EnumC2018s;

/* renamed from: androidx.work.impl.model.v */
/* loaded from: classes.dex */
public final class C1956v {
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x005c: MOVE  (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:34:0x005b */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.room.TypeConverter
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.work.C1835e m9784a(byte[] r7) {
        /*
            androidx.work.e r0 = new androidx.work.e
            r0.<init>()
            if (r7 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L41
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L41
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
        L17:
            if (r7 <= 0) goto L32
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            androidx.work.e$a r5 = new androidx.work.e$a     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.util.HashSet r3 = r0.f4454a     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r3.add(r5)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            int r7 = r7 + (-1)
            goto L17
        L32:
            r2.close()     // Catch: java.io.IOException -> L36
            goto L52
        L36:
            r7 = move-exception
            r7.printStackTrace()
            goto L52
        L3b:
            r7 = move-exception
            goto L5b
        L3d:
            r7 = move-exception
            goto L45
        L3f:
            r0 = move-exception
            goto L5d
        L41:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L45:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L52
            r2.close()     // Catch: java.io.IOException -> L4e
            goto L52
        L4e:
            r7 = move-exception
            r7.printStackTrace()
        L52:
            r1.close()     // Catch: java.io.IOException -> L56
            goto L5a
        L56:
            r7 = move-exception
            r7.printStackTrace()
        L5a:
            return r0
        L5b:
            r0 = r7
            r7 = r2
        L5d:
            if (r7 == 0) goto L67
            r7.close()     // Catch: java.io.IOException -> L63
            goto L67
        L63:
            r7 = move-exception
            r7.printStackTrace()
        L67:
            r1.close()     // Catch: java.io.IOException -> L6b
            goto L6f
        L6b:
            r7 = move-exception
            r7.printStackTrace()
        L6f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.C1956v.m9784a(byte[]):androidx.work.e");
    }

    @TypeConverter
    /* renamed from: b */
    public static int m9783b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(C0740h.m11849a("Could not convert ", i, " to BackoffPolicy"));
    }

    @TypeConverter
    /* renamed from: c */
    public static EnumC2007m m9782c(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i == 5) {
                                return EnumC2007m.TEMPORARILY_UNMETERED;
                            }
                            throw new IllegalArgumentException(C0740h.m11849a("Could not convert ", i, " to NetworkType"));
                        }
                        return EnumC2007m.METERED;
                    }
                    return EnumC2007m.NOT_ROAMING;
                }
                return EnumC2007m.UNMETERED;
            }
            return EnumC2007m.CONNECTED;
        }
        return EnumC2007m.NOT_REQUIRED;
    }

    @NonNull
    @TypeConverter
    /* renamed from: d */
    public static int m9781d(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(C0740h.m11849a("Could not convert ", i, " to OutOfQuotaPolicy"));
    }

    @TypeConverter
    /* renamed from: e */
    public static EnumC2018s m9780e(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return EnumC2018s.CANCELLED;
                            }
                            throw new IllegalArgumentException(C0740h.m11849a("Could not convert ", i, " to State"));
                        }
                        return EnumC2018s.BLOCKED;
                    }
                    return EnumC2018s.FAILED;
                }
                return EnumC2018s.SUCCEEDED;
            }
            return EnumC2018s.RUNNING;
        }
        return EnumC2018s.ENQUEUED;
    }

    @TypeConverter
    /* renamed from: f */
    public static int m9779f(EnumC2018s enumC2018s) {
        int ordinal = enumC2018s.ordinal();
        if (ordinal != 0) {
            int i = 1;
            if (ordinal != 1) {
                i = 2;
                if (ordinal != 2) {
                    i = 3;
                    if (ordinal != 3) {
                        i = 4;
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return 5;
                            }
                            throw new IllegalArgumentException("Could not convert " + enumC2018s + " to int");
                        }
                    }
                }
            }
            return i;
        }
        return 0;
    }
}

package com.tencent.mmkv;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class MMKV implements SharedPreferences, SharedPreferences.Editor {

    /* renamed from: a */
    public static final EnumMap<EnumC9257b, Integer> f17975a;

    /* renamed from: b */
    public static final EnumMap<EnumC9256a, Integer> f17976b;

    /* renamed from: c */
    public static final EnumC9256a[] f17977c;

    /* renamed from: d */
    public static String f17978d;
    private long nativeHandle;

    static {
        EnumMap<EnumC9257b, Integer> enumMap = new EnumMap<>(EnumC9257b.class);
        f17975a = enumMap;
        enumMap.put((EnumMap<EnumC9257b, Integer>) EnumC9257b.OnErrorDiscard, (EnumC9257b) 0);
        enumMap.put((EnumMap<EnumC9257b, Integer>) EnumC9257b.OnErrorRecover, (EnumC9257b) 1);
        EnumMap<EnumC9256a, Integer> enumMap2 = new EnumMap<>(EnumC9256a.class);
        f17976b = enumMap2;
        EnumC9256a enumC9256a = EnumC9256a.LevelDebug;
        enumMap2.put((EnumMap<EnumC9256a, Integer>) enumC9256a, (EnumC9256a) 0);
        EnumC9256a enumC9256a2 = EnumC9256a.LevelInfo;
        enumMap2.put((EnumMap<EnumC9256a, Integer>) enumC9256a2, (EnumC9256a) 1);
        EnumC9256a enumC9256a3 = EnumC9256a.LevelWarning;
        enumMap2.put((EnumMap<EnumC9256a, Integer>) enumC9256a3, (EnumC9256a) 2);
        EnumC9256a enumC9256a4 = EnumC9256a.LevelError;
        enumMap2.put((EnumMap<EnumC9256a, Integer>) enumC9256a4, (EnumC9256a) 3);
        EnumC9256a enumC9256a5 = EnumC9256a.LevelNone;
        enumMap2.put((EnumMap<EnumC9256a, Integer>) enumC9256a5, (EnumC9256a) 4);
        f17977c = new EnumC9256a[]{enumC9256a, enumC9256a2, enumC9256a3, enumC9256a4, enumC9256a5};
        f17978d = null;
        new HashMap();
    }

    public MMKV(long j) {
        this.nativeHandle = j;
    }

    /* renamed from: c */
    public static void m2535c(Context context) {
        String str = context.getFilesDir().getAbsolutePath() + "/mmkv";
        System.loadLibrary("mmkv");
        f17978d = str;
        jniInitialize(str, 1);
    }

    private native boolean containsKey(long j, String str);

    private native long count(long j);

    private static native long createNB(int i);

    /* renamed from: d */
    public static MMKV m2534d() {
        if (f17978d != null) {
            return new MMKV(getMMKVWithID("qmui_skin_maker", 1, null, null));
        }
        throw new IllegalStateException("You should Call MMKV.initialize() first.");
    }

    private native boolean decodeBool(long j, String str, boolean z);

    private native byte[] decodeBytes(long j, String str);

    private native double decodeDouble(long j, String str, double d);

    private native float decodeFloat(long j, String str, float f);

    private native int decodeInt(long j, String str, int i);

    private native long decodeLong(long j, String str, long j2);

    private native String decodeString(long j, String str, String str2);

    private native String[] decodeStringSet(long j, String str);

    private static native void destroyNB(long j, int i);

    /* renamed from: e */
    public static void m2533e(String str) {
        EnumC9256a enumC9256a = EnumC9256a.LevelInfo;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTrace[stackTrace.length - 1];
        Integer num = f17976b.get(enumC9256a);
        mmkvLogImp(num == null ? 0 : num.intValue(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber(), stackTraceElement.getMethodName(), str);
    }

    private native boolean encodeBool(long j, String str, boolean z);

    private native boolean encodeBytes(long j, String str, byte[] bArr);

    private native boolean encodeDouble(long j, String str, double d);

    private native boolean encodeFloat(long j, String str, float f);

    private native boolean encodeInt(long j, String str, int i);

    private native boolean encodeLong(long j, String str, long j2);

    private native boolean encodeSet(long j, String str, String[] strArr);

    private native boolean encodeString(long j, String str, String str2);

    private static native long getDefaultMMKV(int i, String str);

    private static native long getMMKVWithAshmemFD(String str, int i, int i2, String str2);

    private static native long getMMKVWithID(String str, int i, String str2, String str3);

    private static native long getMMKVWithIDAndSize(String str, int i, int i2, String str2);

    public static native boolean isFileValid(String str);

    private static native void jniInitialize(String str, int i);

    private static void mmkvLogImp(int i, String str, int i2, String str2, String str3) {
        int ordinal = f17977c[i].ordinal();
        if (ordinal == 0) {
            Log.d("MMKV", str3);
        } else if (ordinal == 1) {
            Log.i("MMKV", str3);
        } else if (ordinal == 2) {
            Log.w("MMKV", str3);
        } else if (ordinal != 3) {
        } else {
            Log.e("MMKV", str3);
        }
    }

    private static void onContentChangedByOuterProcess(String str) {
    }

    public static native void onExit();

    private static int onMMKVCRCCheckFail(String str) {
        EnumC9257b enumC9257b = EnumC9257b.OnErrorDiscard;
        m2533e("Recover strategic for " + str + " is " + enumC9257b);
        Integer num = f17975a.get(enumC9257b);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private static int onMMKVFileLengthError(String str) {
        EnumC9257b enumC9257b = EnumC9257b.OnErrorDiscard;
        m2533e("Recover strategic for " + str + " is " + enumC9257b);
        Integer num = f17975a.get(enumC9257b);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static native int pageSize();

    private native void removeValueForKey(long j, String str);

    private static native void setLogLevel(int i);

    private static native void setLogReDirecting(boolean z);

    private static native void setWantsContentChangeNotify(boolean z);

    private native void sync(boolean z);

    private native long totalSize(long j);

    private native int valueSize(long j, String str, boolean z);

    private native int writeValueToNB(long j, String str, long j2, int i);

    /* renamed from: a */
    public final String m2537a(String str) {
        return decodeString(this.nativeHandle, str, null);
    }

    public native String[] allKeys();

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        sync(false);
    }

    public native int ashmemFD();

    public native int ashmemMetaFD();

    /* renamed from: b */
    public final void m2536b(String str, String str2) {
        encodeString(this.nativeHandle, str, str2);
    }

    public native void checkContentChangedByOuterProcess();

    public native void checkReSetCryptKey(String str);

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        clearAll();
        return this;
    }

    public native void clearAll();

    public native void clearMemoryCache();

    public native void close();

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        sync(true);
        return true;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return containsKey(this.nativeHandle, str);
    }

    public native String cryptKey();

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return this;
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        throw new UnsupportedOperationException("use allKeys() instead, getAll() not implement because type-erasure inside mmkv");
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        return decodeBool(this.nativeHandle, str, z);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        return decodeFloat(this.nativeHandle, str, f);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        return decodeInt(this.nativeHandle, str, i);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        return decodeLong(this.nativeHandle, str, j);
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public final String getString(String str, @Nullable String str2) {
        return decodeString(this.nativeHandle, str, str2);
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public final Set<String> getStringSet(String str, @Nullable Set<String> set) {
        Set<String> set2;
        String[] decodeStringSet = decodeStringSet(this.nativeHandle, str);
        if (decodeStringSet != null) {
            try {
                set2 = (Set) HashSet.class.newInstance();
                set2.addAll(Arrays.asList(decodeStringSet));
            } catch (IllegalAccessException | InstantiationException unused) {
                return set;
            }
        }
        return set2;
    }

    public native void lock();

    public native String mmapID();

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        encodeBool(this.nativeHandle, str, z);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        encodeFloat(this.nativeHandle, str, f);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        encodeInt(this.nativeHandle, str, i);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        encodeLong(this.nativeHandle, str, j);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, @Nullable String str2) {
        encodeString(this.nativeHandle, str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, @Nullable Set<String> set) {
        encodeSet(this.nativeHandle, str, (String[]) set.toArray(new String[0]));
        return this;
    }

    public native boolean reKey(String str);

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        removeValueForKey(this.nativeHandle, str);
        return this;
    }

    public native void removeValuesForKeys(String[] strArr);

    public native void trim();

    public native boolean tryLock();

    public native void unlock();

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }
}

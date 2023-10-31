package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import okio.Utf8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.91 */
/* loaded from: assets/audience_network.dex */
public final class C444791 {
    public static AtomicInteger A00;
    public static byte[] A01;
    public static String[] A02 = {"TEIgz1GSUxi0w6HxI", "WqDufwBE7AlvD41n6qdN4YbCXU2LtDad", "95AkSvnB6didgYS0", "q9Pm9O4XheyxpjJIaV85netzFUNpUTJ1", "laKi0sQOm1cRNFPmXQKezZzTFfBBOlTJ", "R9By8R7rHrFXxi8d0eZrOpOQKJFwFXXr", "DNKj97yZe49oXEmfRz7aINNiwqbkjDQZ", "HsAQREGxpVIGFVt11mTJ2r8ajNtMZb1h"};
    public static final Object A03;
    public static final String A04;
    public static final Map<String, Integer> A05;
    public static final Set<String> A06;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A01 = new byte[]{7, 95, 83, 55, 1, 28, 3, 48, 28, 6, 29, 7, 22, 1, 73, 83, Utf8.REPLACEMENT_BYTE, 29, 18, 91, 8, 92, 24, 25, 16, 25, 8, 25, 92, 24, 25, 30, 9, 27, 92, 25, 10, 25, 18, 8, 15, 92, 26, 21, 16, 25, 82, 14, 44, 35, 106, 57, 109, 41, 40, 33, 40, 57, 40, 109, 43, 36, 33, 40, 108, 119, 118, 113, 102, 116, 108, 99, 97, 118, 117, 42, 25, 10, 1, 27, 44, 0, 26, 1, 27, 41, 45, 46, 26, 11, 6, 10, 1, 12, 10, 33, 10, 27, 24, 0, 29, 4, 31, 58, 61, 40, 42, 111, 43, 42, 45, 58, 40, 111, 42, 57, 42, 33, 59, 60, 111, 41, 38, 35, 42, 97, 69, 9, 38, 35, 42, 111, 60, 38, 53, 42, 117, 111, 111, 87, 85, 76, 76, 89, 88, 28, 89, 74, 89, 82, 72, 79, 18, 40, 16, 18, 11, 11, 18, 21, 28, 91, 24, 20, 9, 9, 14, 11, 15, 30, 31, 91, 31, 30, 25, 14, 28, 91, 30, 13, 30, 21, 15, 91, 23, 18, 21, 30, 85, 98, 68, 79, 95, 88, 81, 22, 66, 89, 22, 67, 70, 82, 87, 66, 83, 22, 67, 88, 68, 83, 85, 89, 68, 82, 83, 82, 22, 82, 83, 84, 67, 81, 122, 89, 81, 115, 64, 83, 88, 66, 24, 22, 87, 82, 82, 95, 88, 81, 22, 66, 89, 22, 121, 88, 81, 89, 95, 88, 81, 115, 64, 83, 88, 66, 24, 58, 17, 0, 8, 21, 6, 19, 19, 2, 10, 23, 19, 88, 93, 72, 93, Byte.MAX_VALUE, 126, 68, 119, 116, 124, 124, 114, 117, 124, 43, 42, 45, 58, 40, 35, 32, 40, 60, 91, 84, 83, 84, 78, 85, 88, 89, 29, 88, 75, 88, 83, 73, 29, 78, 85, 82, 72, 81, 89, 29, 83, 82, 73, 29, 95, 88, 29, 72, 77, 89, 92, 73, 88, 89, 29, 73, 82, 29, 114, 83, 90, 82, 84, 83, 90, 120, 75, 88, 83, 73, 19, 107, 102, 126, 104, 126, 126, 100, 98, 99, 82, 100, 105, 72, 94, 72, 72, 82, 84, 85, 100, 79, 82, 86, 94, 105, 113, 115, 106, 106, Byte.MAX_VALUE, 126, 95, 108, Byte.MAX_VALUE, 116, 110, 105, 58, 39, 58, 49, 55, 32, 54, 59, 50, 39, 75, 77, 90, 76, 65, 72, 93, 103, 91, 87, 92, 93, 119, 106, 110, 102, 85, 88, 81, 68};
    }

    static {
        A06();
        A04 = C444791.class.getName();
        A03 = new Object();
        A06 = Collections.synchronizedSet(new HashSet());
        A05 = Collections.synchronizedMap(new HashMap());
        A00 = new AtomicInteger();
    }

    public static int A00(Context context) {
        return context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0).getInt(A02(75, 10, 19), 0) - A06.size();
    }

    public static C444993 A01(String str, C44148U c44148u, Map<String, String> map) {
        C444993 c444993 = null;
        try {
            c444993 = new C444993(c44148u.A07().A01(), c44148u.A07().A02(), new C44338n(str, map, true).A02());
            A0C(c444993, c44148u);
            return c444993;
        } catch (Exception unused) {
            return c444993;
        }
    }

    public static JSONArray A03(C44148U c44148u) {
        return A04(c44148u, -1);
    }

    public static JSONArray A04(C44148U c44148u, int i) {
        InterfaceC44448y A062;
        JSONArray jSONArray = new JSONArray();
        synchronized (A03) {
            FileInputStream fileInputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            try {
                if (new File(c44148u.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c44148u)).exists()) {
                    fileInputStream = c44148u.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c44148u));
                    inputStreamReader = new InputStreamReader(fileInputStream);
                    bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null || i == 0) {
                            break;
                        }
                        JSONObject jSONObject = new JSONObject(readLine);
                        if (!jSONObject.has(A02(260, 7, 27))) {
                            jSONObject.put(A02(260, 7, 27), String.valueOf(0));
                        }
                        String string = jSONObject.getString(A02(343, 2, 126));
                        if (!A06.contains(string)) {
                            int attempt = jSONObject.getInt(A02(260, 7, 27));
                            if (A05.containsKey(string)) {
                                jSONObject.put(A02(260, 7, 27), String.valueOf(A05.get(string)));
                            } else {
                                A0E(string, attempt);
                            }
                            jSONArray.put(jSONObject);
                            if (i > 0) {
                                i--;
                            }
                        }
                    }
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        e = e;
                        A062 = c44148u.A06();
                        A062.A3R(e);
                        return jSONArray;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException | JSONException e2) {
                c44148u.A06().A3R(e2);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e3) {
                        e = e3;
                        A062 = c44148u.A06();
                        A062.A3R(e);
                        return jSONArray;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            }
        }
        return jSONArray;
    }

    public static JSONObject A05(C444993 c444993) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(A02(343, 2, 126), UUID.randomUUID().toString());
        jSONObject.put(A02(406, 4, 93), c444993.A03());
        jSONObject.put(A02(402, 4, 127), C5236MJ.A02(c444993.A01()));
        jSONObject.put(A02(355, 12, 71), C5236MJ.A02(c444993.A00()));
        jSONObject.put(A02(345, 10, 113), c444993.A02());
        jSONObject.put(A02(267, 4, 64), c444993.A04() != null ? new JSONObject(c444993.A04()) : new JSONObject());
        jSONObject.put(A02(260, 7, 27), String.valueOf(0));
        return jSONObject;
    }

    public static void A07(Context context) {
        synchronized (A03) {
            File file = new File(context.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), context));
            if (file.exists()) {
                file.delete();
            }
            A09(context, 0);
            A06.clear();
            A05.clear();
        }
    }

    public static void A08(Context context) {
        A09(context, context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0).getInt(A02(75, 10, 19), 0) + 1);
    }

    public static void A09(Context context, int i) {
        int i2 = 0;
        SharedPreferences.Editor edit = context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A02(65, 10, 79), context), 0).edit();
        if (i >= 0) {
            i2 = i;
        }
        edit.putInt(A02(75, 10, 19), i2).apply();
    }

    public static void A0A(C44148U c44148u, String str) {
        File file = new File(c44148u.getFilesDir(), str);
        if (file.exists() && !file.delete()) {
            c44148u.A06().A3R(new RuntimeException(A02(47, 18, 49)));
        }
    }

    public static void A0B(C5952Xx c5952Xx, String str) {
        Integer num = A05.get(str);
        if (num == null) {
            if (c5952Xx.A03().A8P()) {
                Log.e(A04, A02(189, 66, 74));
            }
            num = 0;
        } else {
            A05.remove(str);
        }
        A05.put(str, Integer.valueOf(num.intValue() + 1));
    }

    public static void A0C(C444993 c444993, C44148U c44148u) {
        if (c444993 != null && c44148u != null) {
            synchronized (A03) {
                try {
                    String processSpecificName = ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c44148u);
                    File file = new File(c44148u.getFilesDir(), processSpecificName);
                    if (file.exists()) {
                        int A07 = C5066JT.A07(c44148u);
                        long fileSize = file.length();
                        if (A07 > 0 && fileSize > A07) {
                            boolean delete = file.delete();
                            A09(c44148u, 0);
                            A06.clear();
                            A05.clear();
                            if (delete) {
                                Map<String, String> A4T = c44148u.A02().A4T();
                                A4T.put(A02(383, 7, 62), A02(271, 10, 103));
                                A4T.put(A02(390, 12, 68), String.valueOf(2401));
                                A01(A02(102, 36, 51) + fileSize + A02(1, 15, 15) + A00.getAndIncrement(), c44148u, A4T);
                                return;
                            }
                            Log.e(A02(85, 17, 19), A02(16, 31, 0));
                        }
                    }
                    JSONObject A052 = A05(c444993);
                    FileOutputStream openFileOutput = c44148u.openFileOutput(processSpecificName, 32768);
                    String line = A052.toString() + A02(0, 1, 113);
                    openFileOutput.write(line.getBytes());
                    openFileOutput.close();
                    A08(c44148u);
                } catch (Exception e) {
                    c44148u.A06().A3R(e);
                }
            }
        }
    }

    public static void A0D(String str) {
        A05.remove(str);
        A06.add(str);
    }

    public static void A0E(String str, int i) {
        if (!A06.contains(str)) {
            boolean containsKey = A05.containsKey(str);
            if (A02[7].charAt(23) == 'F') {
                throw new RuntimeException();
            }
            A02[6] = "rEqe91lv7lznGuMpeMm8YlOivWfc8wjs";
            if (containsKey) {
                A05.remove(str);
            }
            A05.put(str, Integer.valueOf(i));
            return;
        }
        throw new RuntimeException(A02(290, 53, 65));
    }

    public static boolean A0F(C44148U c44148u) {
        if (C5066JT.A0O(c44148u)) {
            return A0H(c44148u);
        }
        boolean A0G = A0G(c44148u);
        String[] strArr = A02;
        if (strArr[0].length() != strArr[5].length()) {
            String[] strArr2 = A02;
            strArr2[3] = "3ABJ1YchwKShiC4YrWnTlA0erUDCQvCN";
            strArr2[1] = "wuaZskSkctYpKQ1vHIoiu3NDqUJM9HRQ";
            return A0G;
        }
        throw new RuntimeException();
    }

    public static boolean A0G(C44148U c44148u) {
        JSONArray debugLogEvents = new JSONArray();
        synchronized (A03) {
            int i = 0;
            FileInputStream fileInputStream = null;
            InputStreamReader inputStreamReader = null;
            BufferedReader bufferedReader = null;
            FileOutputStream fileOutputStream = null;
            try {
                if (new File(c44148u.getFilesDir(), ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c44148u)).exists()) {
                    fileInputStream = c44148u.openFileInput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c44148u));
                    inputStreamReader = new InputStreamReader(fileInputStream);
                    bufferedReader = new BufferedReader(inputStreamReader);
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        JSONObject jSONObject = new JSONObject(readLine);
                        String string = jSONObject.getString(A02(343, 2, 126));
                        if (!A06.contains(string)) {
                            if (A05.containsKey(string)) {
                                Integer attempt = A05.get(string);
                                int retryLimit = attempt != null ? attempt.intValue() : 0;
                                Integer valueOf = Integer.valueOf(retryLimit);
                                int A022 = C5066JT.A02(c44148u);
                                if (A022 > -1) {
                                    int retryLimit2 = A022 - 1;
                                    if (valueOf.intValue() > retryLimit2) {
                                        A0D(string);
                                        i++;
                                    }
                                }
                                String eventId = A02(260, 7, 27);
                                jSONObject.put(eventId, String.valueOf(valueOf));
                                debugLogEvents.put(jSONObject);
                            } else {
                                debugLogEvents.put(jSONObject);
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    int length = debugLogEvents.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        JSONObject debugLog = debugLogEvents.getJSONObject(i2);
                        sb.append(debugLog.toString());
                        sb.append('\n');
                    }
                    fileOutputStream = c44148u.openFileOutput(ProcessUtils.getProcessSpecificName(A02(281, 9, 51), c44148u), 0);
                    fileOutputStream.write(sb.toString().getBytes());
                }
                A09(c44148u, A00(c44148u));
                if (i > 0) {
                    c44148u.A06().A8y(A02(271, 10, 103), C44458z.A2V, new C444690(A02(138, 15, 64), A02(367, 16, 102) + i));
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        c44148u.A06().A3R(e);
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                A06.clear();
                A05.clear();
                return true;
            } catch (IOException | JSONException e2) {
                c44148u.A06().A3R(e2);
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e3) {
                        c44148u.A06().A3R(e3);
                        A06.clear();
                        A05.clear();
                        return false;
                    }
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                A06.clear();
                A05.clear();
                return false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f3 A[Catch: IOException -> 0x0201, all -> 0x024b, TryCatch #5 {IOException -> 0x0201, blocks: (B:94:0x01e4, B:96:0x01e9, B:98:0x01ee, B:100:0x01f3, B:102:0x01f8, B:104:0x01fd), top: B:141:0x01e4, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f8 A[Catch: IOException -> 0x0201, all -> 0x024b, TryCatch #5 {IOException -> 0x0201, blocks: (B:94:0x01e4, B:96:0x01e9, B:98:0x01ee, B:100:0x01f3, B:102:0x01f8, B:104:0x01fd), top: B:141:0x01e4, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01fd A[Catch: IOException -> 0x0201, all -> 0x024b, TRY_LEAVE, TryCatch #5 {IOException -> 0x0201, blocks: (B:94:0x01e4, B:96:0x01e9, B:98:0x01ee, B:100:0x01f3, B:102:0x01f8, B:104:0x01fd), top: B:141:0x01e4, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0220 A[Catch: IOException -> 0x0238, all -> 0x024b, TryCatch #0 {IOException -> 0x0238, blocks: (B:115:0x021b, B:117:0x0220, B:119:0x0225, B:121:0x022a, B:123:0x022f, B:125:0x0234), top: B:133:0x021b, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0225 A[Catch: IOException -> 0x0238, all -> 0x024b, TryCatch #0 {IOException -> 0x0238, blocks: (B:115:0x021b, B:117:0x0220, B:119:0x0225, B:121:0x022a, B:123:0x022f, B:125:0x0234), top: B:133:0x021b, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x022a A[Catch: IOException -> 0x0238, all -> 0x024b, TryCatch #0 {IOException -> 0x0238, blocks: (B:115:0x021b, B:117:0x0220, B:119:0x0225, B:121:0x022a, B:123:0x022f, B:125:0x0234), top: B:133:0x021b, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022f A[Catch: IOException -> 0x0238, all -> 0x024b, TryCatch #0 {IOException -> 0x0238, blocks: (B:115:0x021b, B:117:0x0220, B:119:0x0225, B:121:0x022a, B:123:0x022f, B:125:0x0234), top: B:133:0x021b, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0234 A[Catch: IOException -> 0x0238, all -> 0x024b, TRY_LEAVE, TryCatch #0 {IOException -> 0x0238, blocks: (B:115:0x021b, B:117:0x0220, B:119:0x0225, B:121:0x022a, B:123:0x022f, B:125:0x0234), top: B:133:0x021b, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x021b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x010b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x005b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e9 A[Catch: IOException -> 0x0201, all -> 0x024b, TryCatch #5 {IOException -> 0x0201, blocks: (B:94:0x01e4, B:96:0x01e9, B:98:0x01ee, B:100:0x01f3, B:102:0x01f8, B:104:0x01fd), top: B:141:0x01e4, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ee A[Catch: IOException -> 0x0201, all -> 0x024b, TryCatch #5 {IOException -> 0x0201, blocks: (B:94:0x01e4, B:96:0x01e9, B:98:0x01ee, B:100:0x01f3, B:102:0x01f8, B:104:0x01fd), top: B:141:0x01e4, outer: #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0H(com.facebook.ads.redexgen.p036X.C44148U r17) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C444791.A0H(com.facebook.ads.redexgen.X.8U):boolean");
    }

    public static boolean A0I(String str) {
        return A06.contains(str) || A05.containsKey(str);
    }
}
